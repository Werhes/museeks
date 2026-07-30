import 'package:flutter/foundation.dart';

/// Логирование действий приложения
class AppLogger {
  static final List<LogEntry> _logs = [];
  static void Function(List<LogEntry>)? onLog;

  static void info(String message, {String? action}) {
    _addLog(LogLevel.info, message, action: action);
  }

  static void success(String message, {String? action}) {
    _addLog(LogLevel.success, message, action: action);
  }

  static void warning(String message, {String? action}) {
    _addLog(LogLevel.warning, message, action: action);
  }

  static void error(String message, {String? action, dynamic error}) {
    final fullMsg = error != null ? '$message: $error' : message;
    _addLog(LogLevel.error, fullMsg, action: action);
    debugPrint('❌ [ERROR] $fullMsg');
  }

  static void network(String method, String url, {int? statusCode, dynamic data}) {
    final msg = '$method $url → ${statusCode ?? "..."}';
    if (statusCode != null && statusCode >= 200 && statusCode < 300) {
      _addLog(LogLevel.success, msg, action: 'NETWORK');
      debugPrint('🌐 [NETWORK] ✅ $msg');
      if (data != null) debugPrint('   Data: $data');
    } else {
      _addLog(LogLevel.error, msg, action: 'NETWORK');
      debugPrint('🌐 [NETWORK] ❌ $msg');
      if (data != null) debugPrint('   Data: $data');
    }
  }

  static void _addLog(LogLevel level, String message, {String? action}) {
    final entry = LogEntry(
      timestamp: DateTime.now(),
      level: level,
      message: message,
      action: action,
    );
    _logs.add(entry);
    if (_logs.length > 1000) _logs.removeAt(0);
    onLog?.call(_logs);
  }

  static List<LogEntry> get logs => List.unmodifiable(_logs);
  static void clear() => _logs.clear();
}

enum LogLevel { info, success, warning, error }

class LogEntry {
  final DateTime timestamp;
  final LogLevel level;
  final String message;
  final String? action;

  LogEntry({
    required this.timestamp,
    required this.level,
    required this.message,
    this.action,
  });

  String get formattedTime {
    return '${timestamp.hour.toString().padLeft(2, '0')}:'
        '${timestamp.minute.toString().padLeft(2, '0')}:'
        '${timestamp.second.toString().padLeft(2, '0')}';
  }

  String get levelIcon {
    switch (level) {
      case LogLevel.info:
        return 'ℹ️';
      case LogLevel.success:
        return '✅';
      case LogLevel.warning:
        return '⚠️';
      case LogLevel.error:
        return '❌';
    }
  }
}