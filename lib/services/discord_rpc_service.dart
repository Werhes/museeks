import '../models/track.dart';
import '../utils/logger.dart';

/// Сервис для Discord Rich Presence (RPC)
/// Отображает текущий трек в статусе Discord
/// 
/// ПРИМЕЧАНИЕ: Для работы требуется пакет discord_rpc.
/// Сейчас реализована заглушка, которая только логирует.
class DiscordRPCService {
  static bool _initialized = false;
  static bool _enabled = false;

  /// Инициализация Discord RPC
  static Future<void> initialize() async {
    if (_initialized) return;
    try {
      _initialized = true;
      AppLogger.info('Discord RPC инициализирован (заглушка)', action: 'DISCORD');
    } catch (e) {
      AppLogger.error('Ошибка инициализации Discord RPC', action: 'DISCORD', error: e);
    }
  }

  /// Обновление присутствия при смене трека
  static void onTrackChanged(Track? track, bool isPlaying) {
    if (!_enabled || !_initialized || track == null) {
      _clearPresence();
      return;
    }
    _updatePresence(track, isPlaying);
  }

  /// Обновление присутствия при паузе/воспроизведении
  static void onPlaybackChanged(Track? track, bool isPlaying) {
    if (!_enabled || !_initialized || track == null) {
      _clearPresence();
      return;
    }
    _updatePresence(track, isPlaying);
  }

  /// Включение Discord RPC
  static void enable() {
    _enabled = true;
    AppLogger.info('Discord RPC включён', action: 'DISCORD');
  }

  /// Отключение Discord RPC
  static void disable() {
    _enabled = false;
    _clearPresence();
    AppLogger.info('Discord RPC отключён', action: 'DISCORD');
  }

  /// Переключение
  static void toggle() {
    if (_enabled) {
      disable();
    } else {
      enable();
    }
  }

  static bool get isEnabled => _enabled;

  /// Обновление присутствия в Discord
  static void _updatePresence(Track track, bool isPlaying) {
    try {
      final state = '${track.artist} — ${track.title}';
      if (isPlaying) {
        AppLogger.info('Discord RPC: 🎵 $state', action: 'DISCORD');
      } else {
        AppLogger.info('Discord RPC: ⏸ $state', action: 'DISCORD');
      }
    } catch (e) {
      AppLogger.error('Ошибка обновления Discord RPC', action: 'DISCORD', error: e);
    }
  }

  /// Очистка присутствия
  static void _clearPresence() {
    try {
      AppLogger.info('Discord RPC: присутствие очищено', action: 'DISCORD');
    } catch (e) {
      // ignore
    }
  }
}