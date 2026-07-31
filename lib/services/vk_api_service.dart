import 'dart:convert';
import 'package:flutter/foundation.dart';
import 'package:http/http.dart' as http;
import 'package:shared_preferences/shared_preferences.dart';
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
  static const String _vkOAuthUrl = 'https://oauth.vk.com';
  static const String _clientId = '2274003';
  static const String _clientSecret = 'hHbZxrka2uZ6jB1inYsH';
  static const String _apiVersion = '5.199';
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

  /// Загрузка сохранённого токена
  Future<bool> tryLoadSavedToken() async {
    try {
      final prefs = await SharedPreferences.getInstance();
      final savedToken = prefs.getString('vk_access_token');
      if (savedToken != null && savedToken.isNotEmpty) {
        _accessToken = savedToken;
        AppLogger.info('Загружен сохранённый токен', action: 'AUTH');
        
        // Проверяем, работает ли токен
        final success = await _fetchCurrentUser();
        if (success) {
          _isAuthenticated = true;
          notifyListeners();
          return true;
        } else {
          // Токен недействителен
          _accessToken = null;
          await prefs.remove('vk_access_token');
          AppLogger.warning('Сохранённый токен недействителен', action: 'AUTH');
        }
      }
    } catch (e) {
      AppLogger.error('Ошибка загрузки токена', action: 'AUTH', error: e);
    }
    return false;
  }

  /// Сохранение токена
  Future<void> _saveToken() async {
    if (_accessToken == null) return;
    try {
      final prefs = await SharedPreferences.getInstance();
      await prefs.setString('vk_access_token', _accessToken!);
      AppLogger.info('Токен сохранён', action: 'AUTH');
    } catch (e) {
      AppLogger.error('Ошибка сохранения токена', action: 'AUTH', error: e);
    }
  }

  /// Прямой POST запрос к VK API
  Future<Map<String, dynamic>> _vkPost(String url, Map<String, dynamic> body) async {
    AppLogger.network('POST', url);
    try {
      final response = await http.post(
        Uri.parse(url),
        headers: {
          'User-Agent': _userAgent,
          'Content-Type': 'application/x-www-form-urlencoded',
          'Accept': 'application/json',
        },
        body: body,
      );
      
      if (response.body.isEmpty) {
        AppLogger.error('Empty response body (status: ${response.statusCode})', action: 'NETWORK');
        return {'error': {'error_msg': 'Сервер вернул пустой ответ. Попробуйте позже.'}};
      }
      
      final decoded = jsonDecode(response.body);
      if (decoded is! Map<String, dynamic>) {
        AppLogger.error('Unexpected response type: ${decoded.runtimeType}', action: 'NETWORK');
        return {'error': {'error_msg': 'Неожиданный формат ответа'}};
      }
      
      final data = decoded;
      AppLogger.network('POST', url, statusCode: response.statusCode, data: data);
      return data;
    } catch (e) {
      AppLogger.error('VK API request failed', action: 'NETWORK', error: e);
      return {'error': {'error_msg': 'Ошибка сети: $e'}};
    }
  }

  /// Прямой GET запрос к VK API
  Future<Map<String, dynamic>> _vkGet(String method, Map<String, String> params) async {
    final uri = Uri.parse('$_vkApiUrl/$method').replace(queryParameters: {
      ...params,
      'v': _apiVersion,
      if (_accessToken != null) 'access_token': _accessToken!,
    });
    AppLogger.network('GET', uri.toString());
    try {
      final response = await http.get(
        uri,
        headers: {'User-Agent': _userAgent},
      );
      
      if (response.body.isEmpty) {
        AppLogger.error('Empty response from VK API', action: 'NETWORK');
        return {'error': {'error_msg': 'Пустой ответ от сервера VK'}};
      }
      
      final data = jsonDecode(response.body) as Map<String, dynamic>;
      
      // Проверяем на ошибки VK API
      if (data.containsKey('error')) {
        final errorCode = data['error']?['error_code'];
        final errorMsg = data['error']?['error_msg'] ?? 'Unknown VK error';
        
        if (errorCode == 5) {
          AppLogger.error('VK API: токен недействителен (error 5)', action: 'NETWORK');
          return {'error': {'error_msg': 'Токен недействителен. Войдите заново.'}};
        }
        
        AppLogger.error('VK API error [$errorCode]: $errorMsg', action: 'NETWORK');
        return data;
      }
      
      AppLogger.network('GET', uri.toString(), statusCode: response.statusCode);
      return data;
    } catch (e) {
      AppLogger.error('VK API GET failed', action: 'NETWORK', error: e);
      return {'error': {'error_msg': 'Ошибка сети: $e'}};
    }
  }

  /// Шаг 1: Валидация номера телефона через OAuth (более стабильный метод)
  Future<Map<String, dynamic>> validateAccount(String login) async {
    _isLoading = true;
    _error = null;
    notifyListeners();
    AppLogger.info('Валидация аккаунта: $login', action: 'AUTH');

    // Используем OAuth API для валидации (более стабильный)
    final data = await _vkPost(
      '$_vkOAuthUrl/token',
      {
        'grant_type': 'password',
        'client_id': _clientId,
        'client_secret': _clientSecret,
        'username': login,
        'password': '',
        '2fa_supported': '1',
        'force_sms': '1',
        'scope': 'all',
        'v': _apiVersion,
      },
    );

    if (data['error'] != null) {
      final errMsg = data['error']?.toString() ?? 'Auth error';
      
      // Если ошибка "need_validation" — это нормально, значит аккаунт существует
      if (data['error'] == 'need_validation') {
        _sid = data['validation_sid']?.toString();
        final validationType = data['validation_type']?.toString() ?? 'sms';
        
        AppLogger.success('Аккаунт найден. Требуется подтверждение: $validationType', action: 'AUTH');
        
        _isLoading = false;
        notifyListeners();
        return {
          'sid': _sid,
          'methods': [
            VerificationMethod(
              method: AuthMethod.sms,
              info: login,
              priority: 1,
            ),
            VerificationMethod(
              method: AuthMethod.push,
              priority: 2,
            ),
            VerificationMethod(
              method: AuthMethod.callReset,
              info: login,
              priority: 3,
            ),
          ],
          'has_password': false,
          'profile': {
            'first_name': 'Пользователь',
            'photo': null,
          },
        };
      }
      
      _error = errMsg;
      _isLoading = false;
      AppLogger.error('Ошибка валидации: $errMsg', action: 'AUTH');
      notifyListeners();
      return {};
    }

    // Если сразу получили токен (без 2FA)
    _accessToken = data['access_token'];
    if (_accessToken != null) {
      _isAuthenticated = true;
      await _fetchCurrentUser();
      await _saveToken();
      AppLogger.success('Вход выполнен без 2FA!', action: 'AUTH');
    }

    _isLoading = false;
    notifyListeners();
    return {
      'sid': _sid,
      'methods': <VerificationMethod>[],
      'has_password': true,
      'profile': {
        'first_name': 'Пользователь',
        'photo': null,
      },
    };
  }

  /// Шаг 2a: Вход по паролю
  Future<bool> loginWithPassword(String password) async {
    _isLoading = true;
    _error = null;
    notifyListeners();
    AppLogger.info('Вход по паролю', action: 'AUTH');

    final data = await _vkPost(
      '$_vkOAuthUrl/token',
      {
        'grant_type': 'password',
        'client_id': _clientId,
        'client_secret': _clientSecret,
        'username': '',  // будет заполнено из sid
        'password': password,
        'sid': _sid ?? '',
        'v': _apiVersion,
      },
    );

    if (data['error'] != null) {
      _error = data['error']?.toString() ?? 'Wrong password';
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
      await _saveToken();
    }

    _isLoading = false;
    notifyListeners();
    return _isAuthenticated;
  }

  /// Шаг 2b: Запрос кода подтверждения
  Future<bool> requestCode(AuthMethod method) async {
    _isLoading = true;
    _error = null;
    notifyListeners();
    AppLogger.info('Запрос кода: ${method.name}', action: 'AUTH');

    // Используем OAuth для запроса кода
    final data = await _vkPost(
      '$_vkOAuthUrl/auth/validate',
      {
        'sid': _sid ?? '',
        'method': method.name == 'sms' ? 'sms' : 'push',
        'client_id': _clientId,
        'client_secret': _clientSecret,
        'v': _apiVersion,
      },
    );

    if (data['error'] != null) {
      _error = data['error']?.toString() ?? 'Code request failed';
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
      '$_vkOAuthUrl/token',
      {
        'grant_type': 'password',
        'client_id': _clientId,
        'client_secret': _clientSecret,
        'username': '',
        'password': '',
        'sid': _sid ?? '',
        'code': code,
        'v': _apiVersion,
      },
    );

    if (data['error'] != null) {
      _error = data['error']?.toString() ?? 'Invalid code';
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
      await _saveToken();
    }

    _isLoading = false;
    notifyListeners();
    return _isAuthenticated;
  }

  /// Получение пользователя
  Future<bool> _fetchCurrentUser() async {
    AppLogger.info('Загрузка профиля', action: 'USER');
    try {
      final data = await _vkGet('users.get', {'fields': 'photo_200'});
      
      if (data['error'] != null) {
        AppLogger.error('Ошибка загрузки профиля: ${data['error']}', action: 'USER');
        return false;
      }
      
      final response = data['response'];
      if (response is List && response.isNotEmpty) {
        _currentUser = VKUser.fromJson(response[0] as Map<String, dynamic>);
        AppLogger.success('Профиль загружен: ${_currentUser!.fullName}', action: 'USER');
        notifyListeners();
        return true;
      }
      
      AppLogger.warning('Не удалось загрузить профиль', action: 'USER');
      return false;
    } catch (e) {
      AppLogger.error('Ошибка загрузки профиля', action: 'USER', error: e);
      return false;
    }
  }

  /// Получение аудио
  Future<List<Track>> getAudio({int offset = 0, int count = 50}) async {
    AppLogger.info('Загрузка аудио: offset=$offset, count=$count', action: 'AUDIO');
    final data = await _vkGet('audio.get', {
      'offset': offset.toString(),
      'count': count.toString(),
    });
    
    if (data['error'] != null) {
      AppLogger.error('Ошибка загрузки аудио: ${data['error']}', action: 'AUDIO');
      return [];
    }
    
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
    
    if (data['error'] != null) {
      AppLogger.error('Ошибка поиска: ${data['error']}', action: 'SEARCH');
      return [];
    }
    
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
    
    if (data['error'] != null) {
      AppLogger.error('Ошибка загрузки рекомендаций: ${data['error']}', action: 'AUDIO');
      return [];
    }
    
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
    
    if (data['error'] != null) {
      AppLogger.error('Ошибка получения URL: ${data['error']}', action: 'AUDIO');
      return null;
    }
    
    final items = data['response'] as List<dynamic>? ?? [];
    if (items.isNotEmpty) {
      final url = items[0]['url'] as String?;
      if (url != null) AppLogger.success('URL получен', action: 'AUDIO');
      return url;
    }
    AppLogger.warning('URL не найден', action: 'AUDIO');
    return null;
  }

  /// Получение текста песни
  Future<String?> getLyrics(int lyricsId) async {
    AppLogger.info('Получение текста песни: lyrics_id=$lyricsId', action: 'LYRICS');
    final data = await _vkGet('audio.getLyrics', {
      'lyrics_id': lyricsId.toString(),
    });
    
    if (data['error'] != null) {
      AppLogger.error('Ошибка получения текста: ${data['error']}', action: 'LYRICS');
      return null;
    }
    
    final text = data['response']?['text'] as String?;
    if (text != null) {
      AppLogger.success('Текст песни получен (${text.length} символов)', action: 'LYRICS');
    } else {
      AppLogger.warning('Текст песни не найден', action: 'LYRICS');
    }
    return text;
  }

  /// Добавить трек в избранное
  Future<bool> addToFavorites(Track track) async {
    AppLogger.info('Добавление в избранное: ${track.title}', action: 'FAVORITES');
    final data = await _vkGet('audio.add', {
      'audio_id': track.id.toString(),
      'owner_id': track.ownerId.toString(),
    });
    
    if (data['error'] != null) {
      AppLogger.error('Ошибка добавления в избранное: ${data['error']}', action: 'FAVORITES');
      return false;
    }
    
    final success = data['response'] != null;
    if (success) AppLogger.success('Добавлено в избранное', action: 'FAVORITES');
    return success;
  }

  /// Удалить трек из избранного
  Future<bool> removeFromFavorites(Track track) async {
    AppLogger.info('Удаление из избранного: ${track.title}', action: 'FAVORITES');
    final data = await _vkGet('audio.delete', {
      'audio_id': track.id.toString(),
      'owner_id': track.ownerId.toString(),
    });
    
    if (data['error'] != null) {
      AppLogger.error('Ошибка удаления из избранного: ${data['error']}', action: 'FAVORITES');
      return false;
    }
    
    final success = data['response'] == 1;
    if (success) AppLogger.success('Удалено из избранного', action: 'FAVORITES');
    return success;
  }

  /// Вход по токену (как в FlutterVK)
  Future<bool> loginWithToken(String token) async {
    _isLoading = true;
    _error = null;
    notifyListeners();
    AppLogger.info('Вход по токену', action: 'AUTH');

    _accessToken = token;

    try {
      final success = await _fetchCurrentUser();
      if (success) {
        _isAuthenticated = true;
        await _saveToken();
        AppLogger.success('Вход по токену выполнен! Пользователь: ${_currentUser?.fullName}', action: 'AUTH');
        _isLoading = false;
        notifyListeners();
        return true;
      } else {
        _accessToken = null;
        _error = 'Токен недействителен или истёк';
        _isAuthenticated = false;
        _isLoading = false;
        AppLogger.error('Ошибка входа по токену: токен недействителен', action: 'AUTH');
        notifyListeners();
        return false;
      }
    } catch (e) {
      _accessToken = null;
      _error = 'Ошибка проверки токена';
      _isAuthenticated = false;
      _isLoading = false;
      AppLogger.error('Ошибка входа по токену', action: 'AUTH', error: e);
      notifyListeners();
      return false;
    }
  }

  Future<void> logout() async {
    AppLogger.info('Выход из аккаунта', action: 'AUTH');
    _accessToken = null;
    _sid = null;
    _currentUser = null;
    _isAuthenticated = false;
    
    // Удаляем сохранённый токен
    try {
      final prefs = await SharedPreferences.getInstance();
      await prefs.remove('vk_access_token');
    } catch (e) {
      AppLogger.error('Ошибка удаления токена', action: 'AUTH', error: e);
    }
    
    notifyListeners();
  }
}