import 'dart:convert';
import 'package:flutter/foundation.dart';
import 'package:http/http.dart' as http;
import '../models/track.dart';
import '../utils/logger.dart';

/// Способы авторизации
enum AuthMethod {
  password, sms, push, callReset, reserveCode, codegen, email, passkey, unknown,
}

/// Информация о методе авторизации
class VerificationMethod {
  final AuthMethod method;
  final String? info;
  final int priority;

  VerificationMethod({required this.method, this.info, this.priority = 0});

  factory VerificationMethod.fromJson(Map<String, dynamic> json) {
    final name = json['name']?.toString() ?? '';
    return VerificationMethod(
      method: _parseMethod(name),
      info: json['info']?.toString(),
      priority: json['priority'] as int? ?? 0,
    );
  }

  static AuthMethod _parseMethod(String name) {
    switch (name) {
      case 'password': return AuthMethod.password;
      case 'sms': return AuthMethod.sms;
      case 'push': return AuthMethod.push;
      case 'call_reset': return AuthMethod.callReset;
      case 'reserve_code': return AuthMethod.reserveCode;
      case 'codegen': return AuthMethod.codegen;
      case 'email': return AuthMethod.email;
      case 'passkey': return AuthMethod.passkey;
      default: return AuthMethod.unknown;
    }
  }

  String get displayName {
    switch (method) {
      case AuthMethod.password: return 'Пароль';
      case AuthMethod.sms: return 'SMS';
      case AuthMethod.push: return 'Push уведомление';
      case AuthMethod.callReset: return 'Звонок';
      case AuthMethod.reserveCode: return 'Резервный код';
      case AuthMethod.codegen: return 'Генератор кода';
      case AuthMethod.email: return 'Электронная почта';
      case AuthMethod.passkey: return 'OnePass';
      default: return 'Неизвестный метод';
    }
  }

  String get description {
    switch (method) {
      case AuthMethod.password: return 'Введите пароль для входа';
      case AuthMethod.sms: return 'Код отправлен на номер $info';
      case AuthMethod.push: return 'Нажмите подтвердить в приложении VK';
      case AuthMethod.callReset: return 'Вам позвонят и продиктуют код';
      case AuthMethod.reserveCode: return 'Введите резервный код';
      case AuthMethod.codegen: return 'Код из приложения генерации';
      case AuthMethod.email: return 'Код отправлен на $info';
      case AuthMethod.passkey: return 'Войдите через OnePass';
      default: return '';
    }
  }
}

class VKApiService extends ChangeNotifier {
  // Прямые запросы к VK API (без сервера-прокси)
  static const String _vkApiUrl = 'https://api.vk.com/method';
  static const String _vkEcosystemUrl = 'https://api.vk.com/ecosystem';
  static const String _clientId = '2274003';
  static const String _clientSecret = 'hHbZxrka2uZ6jB1inYsH';
  static const String _apiVersion = '5.131';
  static const String _userAgent = 'VKAndroidApp/7.23-10866 (Android 13; SDK 33; arm64-v8a; ru; 2400x1080)';

  String? _accessToken;
  String? _sid;
  VKUser? _currentUser;
  bool _isAuthenticated = false;
  bool _isLoading = false;
  String? _error;

  bool get isLoggedIn => _isAuthenticated && _accessToken != null;
  VKUser? get currentUser => _currentUser;
  bool get isLoading => _isLoading;
  String? get error => _error;
  String? get accessToken => _accessToken;
  String? get sid => _sid;

  /// Прямой POST запрос к VK API
  Future<Map<String, dynamic>> _vkPost(String url, Map<String, dynamic> body) async {
    AppLogger.network('POST', url);
    try {
      final response = await http.post(
        Uri.parse(url),
        headers: {
          'User-Agent': _userAgent,
          'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: body,
      );
      final data = jsonDecode(response.body) as Map<String, dynamic>;
      AppLogger.network('POST', url, statusCode: response.statusCode, data: data);
      return data;
    } catch (e) {
      AppLogger.error('VK API request failed', action: 'NETWORK', error: e);
      return {'error': {'error_msg': 'Network error: $e'}};
    }
  }

  /// Прямой GET запрос к VK API
  Future<Map<String, dynamic>> _vkGet(String method, Map<String, String> params) async {
    final uri = Uri.parse('$_vkApiUrl/$method').replace(queryParameters: {
      ...params,
      'v': _apiVersion,
      'access_token': _accessToken ?? '',
    });
    AppLogger.network('GET', uri.toString());
    try {
      final response = await http.get(
        uri,
        headers: {'User-Agent': _userAgent},
      );
      final data = jsonDecode(response.body) as Map<String, dynamic>;
      AppLogger.network('GET', uri.toString(), statusCode: response.statusCode);
      return data;
    } catch (e) {
      AppLogger.error('VK API GET failed', action: 'NETWORK', error: e);
      return {'error': {'error_msg': 'Network error: $e'}};
    }
  }

  /// Шаг 1: Валидация номера телефона
  Future<Map<String, dynamic>> validateAccount(String login) async {
    _isLoading = true;
    _error = null;
    notifyListeners();
    AppLogger.info('Валидация аккаунта: $login', action: 'AUTH');

    final data = await _vkPost(
      '$_vkEcosystemUrl/auth/validateAccount',
      {
        'login': login,
        'client_id': _clientId,
        'client_secret': _clientSecret,
        'device_id': 'ffffffff-ffff-ffff-ffff-ffffffffffff',
        'lang': 'ru',
        'login_ways': jsonEncode([
          'push', 'sms', 'call_reset', 'reserve_code',
          'codegen', 'email', 'passkey'
        ]),
        'passkey_supported': 'true',
      },
    );

    if (data['error'] != null) {
      final errMsg = data['error']['error_msg'] ?? 'Auth error';
      _error = errMsg;
      _isLoading = false;
      AppLogger.error('Ошибка валидации: $errMsg', action: 'AUTH');
      notifyListeners();
      return {};
    }

    _sid = data['sid'];
    final hasPassword = (data['flow_names'] as List?)?.contains('password') ?? false;
    final methods = ((data['flow_names'] as List?) ?? [])
        .where((n) => n != 'password')
        .map((n) => VerificationMethod(
              method: VerificationMethod._parseMethod(n as String),
              priority: 0,
              info: (data['flow_info'] as Map?)?[n]?.toString(),
            ))
        .toList();

    final profile = data['profile'] as Map<String, dynamic>? ?? {
      'first_name': 'Незнакомец',
      'photo': null,
    };

    AppLogger.success('Аккаунт найден. Пароль: ${hasPassword ? "да" : "нет"}, методов: ${methods.length}', action: 'AUTH');

    _isLoading = false;
    notifyListeners();
    return {
      'sid': _sid,
      'methods': methods,
      'has_password': hasPassword,
      'profile': profile,
    };
  }

  /// Шаг 2a: Вход по паролю
  Future<bool> loginWithPassword(String password) async {
    _isLoading = true;
    _error = null;
    notifyListeners();
    AppLogger.info('Вход по паролю', action: 'AUTH');

    final data = await _vkPost(
      '$_vkEcosystemUrl/auth/authWithPassword',
      {
        'sid': _sid ?? '',
        'password': password,
        'client_id': _clientId,
        'client_secret': _clientSecret,
        'device_id': 'ffffffff-ffff-ffff-ffff-ffffffffffff',
        'lang': 'ru',
      },
    );

    if (data['error'] != null) {
      _error = data['error']['error_msg'] ?? 'Wrong password';
      _isLoading = false;
      AppLogger.error('Ошибка входа: $_error', action: 'AUTH');
      notifyListeners();
      return false;
    }

    _accessToken = data['access_token'];
    if (_accessToken != null) {
      _isAuthenticated = true;
      AppLogger.success('Вход выполнен! Токен получен', action: 'AUTH');
      await _fetchCurrentUser();
    }

    _isLoading = false;
    notifyListeners();
    return _isAuthenticated;
  }

  /// Шаг 2b: Запрос кода
  Future<bool> requestCode(AuthMethod method) async {
    _isLoading = true;
    _error = null;
    notifyListeners();
    AppLogger.info('Запрос кода: ${method.name}', action: 'AUTH');

    final data = await _vkPost(
      '$_vkEcosystemUrl/auth/requestCode',
      {
        'sid': _sid ?? '',
        'method': method.name,
        'client_id': _clientId,
        'client_secret': _clientSecret,
        'device_id': 'ffffffff-ffff-ffff-ffff-ffffffffffff',
        'lang': 'ru',
      },
    );

    if (data['error'] != null) {
      _error = data['error']['error_msg'] ?? 'Code request failed';
      _isLoading = false;
      AppLogger.error('Ошибка запроса кода: $_error', action: 'AUTH');
      notifyListeners();
      return false;
    }

    AppLogger.success('Код отправлен!', action: 'AUTH');
    _isLoading = false;
    notifyListeners();
    return true;
  }

  /// Шаг 3: Подтверждение кодом
  Future<bool> confirmCode(String code) async {
    _isLoading = true;
    _error = null;
    notifyListeners();
    AppLogger.info('Подтверждение кода', action: 'AUTH');

    final data = await _vkPost(
      '$_vkEcosystemUrl/auth/confirmCode',
      {
        'sid': _sid ?? '',
        'code': code,
        'client_id': _clientId,
        'client_secret': _clientSecret,
        'device_id': 'ffffffff-ffff-ffff-ffff-ffffffffffff',
        'lang': 'ru',
      },
    );

    if (data['error'] != null) {
      _error = data['error']['error_msg'] ?? 'Invalid code';
      _isLoading = false;
      AppLogger.error('Ошибка подтверждения: $_error', action: 'AUTH');
      notifyListeners();
      return false;
    }

    _accessToken = data['access_token'];
    if (_accessToken != null) {
      _isAuthenticated = true;
      AppLogger.success('Код подтверждён! Токен получен', action: 'AUTH');
      await _fetchCurrentUser();
    }

    _isLoading = false;
    notifyListeners();
    return _isAuthenticated;
  }

  /// Получение пользователя
  Future<void> _fetchCurrentUser() async {
    AppLogger.info('Загрузка профиля', action: 'USER');
    final data = await _vkGet('users.get', {'fields': 'photo_200'});
    final items = data['response'] as List<dynamic>?;
    if (items != null && items.isNotEmpty) {
      _currentUser = VKUser.fromJson(items[0] as Map<String, dynamic>);
      AppLogger.success('Профиль загружен: ${_currentUser!.fullName}', action: 'USER');
      notifyListeners();
    }
  }

  /// Получение аудио
  Future<List<Track>> getAudio({int offset = 0, int count = 50}) async {
    AppLogger.info('Загрузка аудио: offset=$offset, count=$count', action: 'AUDIO');
    final data = await _vkGet('audio.get', {
      'offset': offset.toString(),
      'count': count.toString(),
    });
    final items = data['response']?['items'] as List<dynamic>? ?? [];
    final tracks = items
        .map((item) => Track.fromJson(item as Map<String, dynamic>))
        .where((t) => t.isAvailable)
        .toList();
    AppLogger.success('Загружено треков: ${tracks.length}', action: 'AUDIO');
    return tracks;
  }

  /// Поиск аудио
  Future<List<Track>> searchAudio(String query, {int count = 30}) async {
    AppLogger.info('Поиск: $query', action: 'SEARCH');
    final data = await _vkGet('audio.search', {
      'q': query,
      'count': count.toString(),
    });
    final items = data['response']?['items'] as List<dynamic>? ?? [];
    final tracks = items
        .map((item) => Track.fromJson(item as Map<String, dynamic>))
        .where((t) => t.isAvailable)
        .toList();
    AppLogger.success('Найдено треков: ${tracks.length}', action: 'SEARCH');
    return tracks;
  }

  /// Рекомендации
  Future<List<Track>> getRecommendations({int count = 30}) async {
    AppLogger.info('Загрузка рекомендаций', action: 'AUDIO');
    final data = await _vkGet('audio.getRecommendations', {
      'count': count.toString(),
    });
    final items = data['response']?['items'] as List<dynamic>? ?? [];
    return items
        .map((item) => Track.fromJson(item as Map<String, dynamic>))
        .where((t) => t.isAvailable)
        .toList();
  }

  /// Получение URL аудио
  Future<String?> getAudioUrl(Track track) async {
    AppLogger.info('Получение URL: ${track.title}', action: 'AUDIO');
    final data = await _vkGet('audio.getById', {
      'audio_id': track.id.toString(),
      'owner_id': track.ownerId.toString(),
    });
    final items = data['response'] as List<dynamic>? ?? [];
    if (items.isNotEmpty) {
      final url = items[0]['url'] as String?;
      if (url != null) AppLogger.success('URL получен', action: 'AUDIO');
      return url;
    }
    AppLogger.warning('URL не найден', action: 'AUDIO');
    return null;
  }

  void logout() {
    AppLogger.info('Выход из аккаунта', action: 'AUTH');
    _accessToken = null;
    _sid = null;
    _currentUser = null;
    _isAuthenticated = false;
    notifyListeners();
  }
}