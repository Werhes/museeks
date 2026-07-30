import 'dart:convert';
import 'package:flutter/foundation.dart';
import 'package:http/http.dart' as http;
import '../models/track.dart';

/// Способы авторизации
enum AuthMethod {
  password,
  sms,
  push,
  callReset,
  reserveCode,
  codegen,
  email,
  passkey,
  unknown,
}

/// Информация о методе авторизации
class VerificationMethod {
  final AuthMethod method;
  final String? info;
  final int priority;

  VerificationMethod({
    required this.method,
    this.info,
    this.priority = 0,
  });

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
      case 'password':
        return AuthMethod.password;
      case 'sms':
        return AuthMethod.sms;
      case 'push':
        return AuthMethod.push;
      case 'call_reset':
        return AuthMethod.callReset;
      case 'reserve_code':
        return AuthMethod.reserveCode;
      case 'codegen':
        return AuthMethod.codegen;
      case 'email':
        return AuthMethod.email;
      case 'passkey':
        return AuthMethod.passkey;
      default:
        return AuthMethod.unknown;
    }
  }

  String get displayName {
    switch (method) {
      case AuthMethod.password:
        return 'Пароль';
      case AuthMethod.sms:
        return 'SMS';
      case AuthMethod.push:
        return 'Push уведомление';
      case AuthMethod.callReset:
        return 'Звонок';
      case AuthMethod.reserveCode:
        return 'Резервный код';
      case AuthMethod.codegen:
        return 'Генератор кода';
      case AuthMethod.email:
        return 'Электронная почта';
      case AuthMethod.passkey:
        return 'OnePass';
      default:
        return 'Неизвестный метод';
    }
  }

  String get description {
    switch (method) {
      case AuthMethod.password:
        return 'Введите пароль для входа';
      case AuthMethod.sms:
        return 'Код отправлен на номер $info';
      case AuthMethod.push:
        return 'Нажмите подтвердить в приложении VK';
      case AuthMethod.callReset:
        return 'Вам позвонят и продиктуют код';
      case AuthMethod.reserveCode:
        return 'Введите резервный код';
      case AuthMethod.codegen:
        return 'Код из приложения генерации';
      case AuthMethod.email:
        return 'Код отправлен на $info';
      case AuthMethod.passkey:
        return 'Войдите через OnePass';
      default:
        return '';
    }
  }
}

class VKApiService extends ChangeNotifier {
  // Сервер на Ubuntu
  static const String _baseUrl = 'http://31.76.43.138:1000/api';

  String? _accessToken;
  String? _sid;
  VKUser? _currentUser;
  bool _isAuthenticated = false;
  bool _isLoading = false;
  String? _error;

  // Геттеры
  bool get isLoggedIn => _isAuthenticated && _accessToken != null;
  VKUser? get currentUser => _currentUser;
  bool get isLoading => _isLoading;
  String? get error => _error;
  String? get accessToken => _accessToken;
  String? get sid => _sid;

  /// Шаг 1: Валидация номера телефона / логина
  /// Возвращает список доступных методов авторизации
  Future<Map<String, dynamic>> validateAccount(String login) async {
    _isLoading = true;
    _error = null;
    notifyListeners();

    try {
      final response = await http.post(
        Uri.parse('$_baseUrl/auth.validate'),
        headers: {'Content-Type': 'application/json'},
        body: jsonEncode({'login': login}),
      );

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);
        _sid = data['sid'] as String?;

        final methods = (data['methods'] as List<dynamic>?)
                ?.map((m) => VerificationMethod.fromJson(m as Map<String, dynamic>))
                .toList() ??
            [];

        final hasPassword = data['has_password'] as bool? ?? false;

        _isLoading = false;
        notifyListeners();

        return {
          'sid': _sid,
          'methods': methods,
          'has_password': hasPassword,
          'profile': data['profile'],
        };
      } else {
        _error = 'Ошибка проверки номера';
        _isLoading = false;
        notifyListeners();
        return {};
      }
    } catch (e) {
      _error = 'Ошибка соединения с сервером';
      _isLoading = false;
      notifyListeners();
      return {};
    }
  }

  /// Шаг 2a: Вход по паролю
  Future<bool> loginWithPassword(String password) async {
    _isLoading = true;
    _error = null;
    notifyListeners();

    try {
      final response = await http.post(
        Uri.parse('$_baseUrl/auth.password'),
        headers: {'Content-Type': 'application/json'},
        body: jsonEncode({
          'sid': _sid,
          'password': password,
        }),
      );

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);
        _accessToken = data['access_token'] as String?;

        if (_accessToken != null) {
          _isAuthenticated = true;
          await _fetchCurrentUser();
          _isLoading = false;
          notifyListeners();
          return true;
        }
      }

      _error = 'Неверный пароль';
      _isLoading = false;
      notifyListeners();
      return false;
    } catch (e) {
      _error = 'Ошибка входа';
      _isLoading = false;
      notifyListeners();
      return false;
    }
  }

  /// Шаг 2b: Запрос кода подтверждения (SMS/Push/звонок)
  Future<bool> requestCode(AuthMethod method) async {
    _isLoading = true;
    _error = null;
    notifyListeners();

    try {
      final response = await http.post(
        Uri.parse('$_baseUrl/auth.requestCode'),
        headers: {'Content-Type': 'application/json'},
        body: jsonEncode({
          'sid': _sid,
          'method': method.name,
        }),
      );

      if (response.statusCode == 200) {
        _isLoading = false;
        notifyListeners();
        return true;
      }

      _error = 'Ошибка отправки кода';
      _isLoading = false;
      notifyListeners();
      return false;
    } catch (e) {
      _error = 'Ошибка соединения';
      _isLoading = false;
      notifyListeners();
      return false;
    }
  }

  /// Шаг 3: Подтверждение кодом (SMS/Push/звонок/резервный код)
  Future<bool> confirmCode(String code) async {
    _isLoading = true;
    _error = null;
    notifyListeners();

    try {
      final response = await http.post(
        Uri.parse('$_baseUrl/auth.confirmCode'),
        headers: {'Content-Type': 'application/json'},
        body: jsonEncode({
          'sid': _sid,
          'code': code,
        }),
      );

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);
        _accessToken = data['access_token'] as String?;

        if (_accessToken != null) {
          _isAuthenticated = true;
          await _fetchCurrentUser();
          _isLoading = false;
          notifyListeners();
          return true;
        }
      }

      _error = 'Неверный код';
      _isLoading = false;
      notifyListeners();
      return false;
    } catch (e) {
      _error = 'Ошибка подтверждения';
      _isLoading = false;
      notifyListeners();
      return false;
    }
  }

  /// Получение информации о текущем пользователе
  Future<void> _fetchCurrentUser() async {
    try {
      final response = await http.get(
        Uri.parse('$_baseUrl/users.get?access_token=$_accessToken'),
      );

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);
        if (data['response'] != null && data['response'].isNotEmpty) {
          _currentUser = VKUser.fromJson(data['response'][0]);
          notifyListeners();
        }
      }
    } catch (e) {
      // Ошибка получения пользователя
    }
  }

  /// Получение списка аудиозаписей
  Future<List<Track>> getAudio({
    int offset = 0,
    int count = 50,
    String? playlistId,
    String? ownerId,
  }) async {
    try {
      String endpoint;
      if (playlistId != null && ownerId != null) {
        endpoint = '$_baseUrl/audio.getPlaylistTracks'
            '?access_token=$_accessToken'
            '&playlist_id=$playlistId'
            '&owner_id=$ownerId'
            '&offset=$offset'
            '&count=$count';
      } else {
        endpoint =
            '$_baseUrl/audio.get?access_token=$_accessToken&offset=$offset&count=$count';
      }

      final response = await http.get(Uri.parse(endpoint));

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);
        final items = data['response']?['items'] as List<dynamic>? ?? [];
        return items
            .map((item) => Track.fromJson(item as Map<String, dynamic>))
            .where((track) => track.isAvailable)
            .toList();
      }
    } catch (e) {
      // Ошибка получения аудио
    }
    return [];
  }

  /// Получение плейлистов
  Future<List<Playlist>> getPlaylists() async {
    try {
      final response = await http.get(
        Uri.parse('$_baseUrl/audio.getPlaylists?access_token=$_accessToken'),
      );

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);
        final items = data['response']?['items'] as List<dynamic>? ?? [];
        return items
            .map((item) => Playlist.fromJson(item as Map<String, dynamic>))
            .toList();
      }
    } catch (e) {
      // Ошибка получения плейлистов
    }
    return [];
  }

  /// Поиск аудио
  Future<List<Track>> searchAudio(String query, {int count = 30}) async {
    try {
      final response = await http.get(
        Uri.parse(
          '$_baseUrl/audio.search'
          '?access_token=$_accessToken'
          '&q=${Uri.encodeComponent(query)}'
          '&count=$count',
        ),
      );

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);
        final items = data['response']?['items'] as List<dynamic>? ?? [];
        return items
            .map((item) => Track.fromJson(item as Map<String, dynamic>))
            .where((track) => track.isAvailable)
            .toList();
      }
    } catch (e) {
      // Ошибка поиска
    }
    return [];
  }

  /// Получение рекомендаций
  Future<List<Track>> getRecommendations({int count = 30}) async {
    try {
      final response = await http.get(
        Uri.parse(
          '$_baseUrl/audio.getRecommendations'
          '?access_token=$_accessToken'
          '&count=$count',
        ),
      );

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);
        final items = data['response']?['items'] as List<dynamic>? ?? [];
        return items
            .map((item) => Track.fromJson(item as Map<String, dynamic>))
            .where((track) => track.isAvailable)
            .toList();
      }
    } catch (e) {
      // Ошибка получения рекомендаций
    }
    return [];
  }

  /// Получение URL аудио для воспроизведения
  Future<String?> getAudioUrl(Track track) async {
    try {
      final response = await http.get(
        Uri.parse(
          '$_baseUrl/audio.getById'
          '?access_token=$_accessToken'
          '&audio_id=${track.id}'
          '&owner_id=${track.ownerId}',
        ),
      );

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);
        final items = data['response'] as List<dynamic>? ?? [];
        if (items.isNotEmpty) {
          return items[0]['url'] as String?;
        }
      }
    } catch (e) {
      // Ошибка получения URL
    }
    return null;
  }

  /// Выход
  void logout() {
    _accessToken = null;
    _sid = null;
    _currentUser = null;
    _isAuthenticated = false;
    notifyListeners();
  }
}