import 'dart:async';
import 'dart:io';
import 'package:flutter/foundation.dart';
import 'package:just_audio/just_audio.dart';
import 'package:path_provider/path_provider.dart';
import 'package:http/http.dart' as http;
import '../models/track.dart';
import '../services/vk_api_service.dart';
import '../utils/logger.dart';

enum RepeatMode { none, one, all }

class AudioProvider extends ChangeNotifier {
  final VKApiService _apiService;
  final AudioPlayer _player = AudioPlayer();

  List<Track> _tracks = [];
  List<Track> _filteredTracks = [];
  final Set<String> _favoriteIds = {};
  Track? _currentTrack;
  int _currentIndex = -1;
  bool _isPlaying = false;
  bool _isShuffled = false;
  RepeatMode _repeatMode = RepeatMode.none;
  Duration _position = Duration.zero;
  Duration _duration = Duration.zero;
  double _volume = 1.0;
  String _searchQuery = '';
  String _activeSection = 'my_music';
  bool _isLoading = false;

  // Queue
  final List<Track> _queue = [];
  int _queueIndex = -1;

  // Lyrics
  String? _currentLyrics;
  bool _isLoadingLyrics = false;

  // Downloads
  final Set<String> _downloadedIds = {};
  final Map<String, double> _downloadProgress = {};

  // Stream subscriptions
  StreamSubscription? _positionSub;
  StreamSubscription? _durationSub;
  StreamSubscription? _playerStateSub;
  StreamSubscription? _playerCompleteSub;

  AudioProvider(this._apiService) {
    _setupPlayerListeners();
  }

  // Getters
  List<Track> get tracks => _searchQuery.isEmpty
      ? _tracks
      : _tracks
          .where((t) =>
              t.title.toLowerCase().contains(_searchQuery.toLowerCase()) ||
              t.artist.toLowerCase().contains(_searchQuery.toLowerCase()))
          .toList();
  List<Track> get filteredTracks => _filteredTracks;
  Set<String> get favoriteIds => _favoriteIds;
  List<Track> get favoriteTracks =>
      _tracks.where((t) => _favoriteIds.contains(t.fullId)).toList();
  Track? get currentTrack => _currentTrack;
  int get currentIndex => _currentIndex;
  bool get isPlaying => _isPlaying;
  bool get isShuffled => _isShuffled;
  RepeatMode get repeatMode => _repeatMode;
  Duration get position => _position;
  Duration get duration => _duration;
  double get volume => _volume;
  double get progress => _duration.inMilliseconds > 0
      ? _position.inMilliseconds / _duration.inMilliseconds
      : 0.0;
  String get searchQuery => _searchQuery;
  String get activeSection => _activeSection;
  bool get isLoading => _isLoading;
  AudioPlayer get player => _player;

  // Queue getters
  List<Track> get queue => List.unmodifiable(_queue);
  int get queueIndex => _queueIndex;
  bool get hasQueue => _queue.isNotEmpty;

  // Lyrics getters
  String? get currentLyrics => _currentLyrics;
  bool get isLoadingLyrics => _isLoadingLyrics;

  // Download getters
  Set<String> get downloadedIds => _downloadedIds;
  bool isDownloaded(Track track) => _downloadedIds.contains(track.fullId);
  double getDownloadProgress(Track track) =>
      _downloadProgress[track.fullId] ?? 0.0;

  void _setupPlayerListeners() {
    _positionSub = _player.positionStream.listen((pos) {
      _position = pos;
      notifyListeners();
    });

    _durationSub = _player.durationStream.listen((dur) {
      _duration = dur ?? Duration.zero;
      notifyListeners();
    });

    _playerStateSub = _player.playerStateStream.listen((state) {
      _isPlaying = state.playing;
      notifyListeners();
    });

    _playerCompleteSub = _player.processingStateStream.listen((state) {
      if (state == ProcessingState.completed) {
        _onTrackComplete();
      }
    });
  }

  void _onTrackComplete() {
    switch (_repeatMode) {
      case RepeatMode.one:
        playTrack(_currentIndex);
        break;
      case RepeatMode.all:
        next();
        break;
      case RepeatMode.none:
        if (_currentIndex < _tracks.length - 1) {
          next();
        } else {
          stop();
        }
        break;
    }
  }

  /// Загрузка аудио из VK
  Future<void> loadTracks() async {
    _isLoading = true;
    notifyListeners();

    final loadedTracks = await _apiService.getAudio();
    _tracks = loadedTracks;
    _isLoading = false;
    notifyListeners();
  }

  /// Загрузка рекомендаций
  Future<void> loadRecommendations() async {
    _isLoading = true;
    notifyListeners();

    final recs = await _apiService.getRecommendations();
    _tracks = recs;
    _isLoading = false;
    notifyListeners();
  }

  /// Поиск
  Future<void> search(String query) async {
    _searchQuery = query;
    if (query.isEmpty) {
      notifyListeners();
      return;
    }

    _isLoading = true;
    notifyListeners();

    final results = await _apiService.searchAudio(query);
    _filteredTracks = results;
    _isLoading = false;
    notifyListeners();
  }

  void setSearchQuery(String query) {
    _searchQuery = query;
    notifyListeners();
  }

  void setActiveSection(String section) {
    _activeSection = section;
    notifyListeners();
  }

  /// Воспроизведение трека по индексу
  Future<void> playTrack(int index) async {
    if (index < 0 || index >= _tracks.length) return;

    _currentIndex = index;
    _currentTrack = _tracks[index];
    _currentLyrics = null;

    // Получаем URL аудио
    final audioUrl = await _apiService.getAudioUrl(_currentTrack!);
    if (audioUrl == null) return;

    try {
      await _player.setAudioSource(
        AudioSource.uri(Uri.parse(audioUrl)),
        preload: true,
      );
      await _player.play();
      _isPlaying = true;
      notifyListeners();

      // Загружаем текст песни
      _loadLyrics(_currentTrack!);
    } catch (e) {
      AppLogger.error('Ошибка воспроизведения', action: 'PLAYER', error: e);
    }
  }

  /// Воспроизведение трека из очереди
  Future<void> playFromQueue(int index) async {
    if (index < 0 || index >= _queue.length) return;

    _queueIndex = index;
    final track = _queue[index];

    // Добавляем в основной список если нет
    if (!_tracks.contains(track)) {
      _tracks.add(track);
    }
    final trackIndex = _tracks.indexOf(track);
    await playTrack(trackIndex);
  }

  /// Воспроизведение/пауза
  Future<void> playPause() async {
    if (_currentTrack == null && _tracks.isNotEmpty) {
      await playTrack(0);
      return;
    }

    if (_isPlaying) {
      await _player.pause();
    } else {
      await _player.play();
    }
  }

  /// Следующий трек
  Future<void> next() async {
    if (_tracks.isEmpty) return;

    // Если есть очередь, играем из неё
    if (_queue.isNotEmpty && _queueIndex < _queue.length - 1) {
      await playFromQueue(_queueIndex + 1);
      return;
    }

    int nextIndex;
    if (_isShuffled) {
      nextIndex = DateTime.now().millisecondsSinceEpoch % _tracks.length;
    } else {
      nextIndex = (_currentIndex + 1) % _tracks.length;
    }

    await playTrack(nextIndex);
  }

  /// Предыдущий трек
  Future<void> previous() async {
    if (_tracks.isEmpty) return;

    // Если прошло больше 3 секунд, перематываем в начало
    if (_position.inSeconds > 3) {
      await _player.seek(Duration.zero);
      return;
    }

    // Если есть очередь и мы не в начале
    if (_queue.isNotEmpty && _queueIndex > 0) {
      await playFromQueue(_queueIndex - 1);
      return;
    }

    int prevIndex;
    if (_isShuffled) {
      prevIndex = DateTime.now().millisecondsSinceEpoch % _tracks.length;
    } else {
      prevIndex = _currentIndex - 1;
      if (prevIndex < 0) prevIndex = _tracks.length - 1;
    }

    await playTrack(prevIndex);
  }

  /// Остановка
  Future<void> stop() async {
    await _player.stop();
    _isPlaying = false;
    _currentTrack = null;
    _currentIndex = -1;
    _position = Duration.zero;
    _duration = Duration.zero;
    _currentLyrics = null;
    notifyListeners();
  }

  /// Перемотка
  Future<void> seek(double position) async {
    final newPosition = Duration(
      milliseconds: (position * _duration.inMilliseconds).round(),
    );
    await _player.seek(newPosition);
  }

  /// Установка громкости
  void setVolume(double volume) {
    _volume = volume;
    _player.setVolume(volume);
    notifyListeners();
  }

  /// Переключение перемешивания
  void toggleShuffle() {
    _isShuffled = !_isShuffled;
    notifyListeners();
  }

  /// Переключение режима повтора
  void toggleRepeatMode() {
    switch (_repeatMode) {
      case RepeatMode.none:
        _repeatMode = RepeatMode.all;
        break;
      case RepeatMode.all:
        _repeatMode = RepeatMode.one;
        break;
      case RepeatMode.one:
        _repeatMode = RepeatMode.none;
        break;
    }
    notifyListeners();
  }

  /// Добавить/убрать из избранного
  void toggleFavorite(Track track) {
    if (_favoriteIds.contains(track.fullId)) {
      _favoriteIds.remove(track.fullId);
      _apiService.removeFromFavorites(track);
    } else {
      _favoriteIds.add(track.fullId);
      _apiService.addToFavorites(track);
    }
    notifyListeners();
  }

  bool isFavorite(Track track) => _favoriteIds.contains(track.fullId);

  // ========== QUEUE MANAGEMENT ==========

  /// Добавить трек в очередь
  void addToQueue(Track track) {
    _queue.add(track);
    if (_queueIndex == -1) _queueIndex = 0;
    notifyListeners();
  }

  /// Добавить трек следующим в очереди
  void addNextToQueue(Track track) {
    final insertIndex = _queueIndex + 1;
    if (insertIndex <= _queue.length) {
      _queue.insert(insertIndex, track);
    } else {
      _queue.add(track);
    }
    notifyListeners();
  }

  /// Удалить трек из очереди
  void removeFromQueue(int index) {
    if (index < 0 || index >= _queue.length) return;
    _queue.removeAt(index);
    if (_queueIndex >= index && _queueIndex > 0) {
      _queueIndex--;
    }
    notifyListeners();
  }

  /// Очистить очередь
  void clearQueue() {
    _queue.clear();
    _queueIndex = -1;
    notifyListeners();
  }

  /// Переместить трек в очереди
  void moveInQueue(int oldIndex, int newIndex) {
    if (oldIndex < 0 || oldIndex >= _queue.length) return;
    if (newIndex < 0 || newIndex >= _queue.length) return;
    final track = _queue.removeAt(oldIndex);
    _queue.insert(newIndex, track);
    if (_queueIndex == oldIndex) {
      _queueIndex = newIndex;
    }
    notifyListeners();
  }

  // ========== LYRICS ==========

  /// Загрузка текста песни
  Future<void> _loadLyrics(Track track) async {
    _isLoadingLyrics = true;
    _currentLyrics = null;
    notifyListeners();

    try {
      // Пробуем получить lyrics_id из VK API
      await _apiService.getAudioUrl(track);
      // Пока заглушка — VK lyrics API может не работать
      _currentLyrics = null;
    } catch (e) {
      AppLogger.error('Ошибка загрузки текста', action: 'LYRICS', error: e);
    }

    _isLoadingLyrics = false;
    notifyListeners();
  }

  /// Загрузка текста по lyrics_id
  Future<void> loadLyricsById(int lyricsId) async {
    _isLoadingLyrics = true;
    notifyListeners();

    final text = await _apiService.getLyrics(lyricsId);
    _currentLyrics = text;
    _isLoadingLyrics = false;
    notifyListeners();
  }

  // ========== DOWNLOADS ==========

  /// Скачивание трека для оффлайн
  Future<void> downloadTrack(Track track) async {
    if (_downloadedIds.contains(track.fullId)) return;

    _downloadProgress[track.fullId] = 0.0;
    notifyListeners();

    try {
      final audioUrl = await _apiService.getAudioUrl(track);
      if (audioUrl == null) {
        AppLogger.error('URL не найден для скачивания', action: 'DOWNLOAD');
        return;
      }

      final dir = await getApplicationDocumentsDirectory();
      final downloadDir = Directory('${dir.path}/downloads');
      if (!await downloadDir.exists()) {
        await downloadDir.create(recursive: true);
      }

      final filePath = '${downloadDir.path}/${track.fullId}.mp3';
      final file = File(filePath);

      final response = await http.get(Uri.parse(audioUrl));
      await file.writeAsBytes(response.bodyBytes);

      _downloadedIds.add(track.fullId);
      _downloadProgress[track.fullId] = 1.0;
      AppLogger.success('Трек скачан: ${track.title}', action: 'DOWNLOAD');
      notifyListeners();
    } catch (e) {
      _downloadProgress.remove(track.fullId);
      AppLogger.error('Ошибка скачивания', action: 'DOWNLOAD', error: e);
      notifyListeners();
    }
  }

  /// Удаление скачанного трека
  Future<void> deleteDownload(Track track) async {
    try {
      final dir = await getApplicationDocumentsDirectory();
      final filePath = '${dir.path}/downloads/${track.fullId}.mp3';
      final file = File(filePath);
      if (await file.exists()) {
        await file.delete();
      }
      _downloadedIds.remove(track.fullId);
      _downloadProgress.remove(track.fullId);
      notifyListeners();
    } catch (e) {
      AppLogger.error('Ошибка удаления', action: 'DOWNLOAD', error: e);
    }
  }

  /// Получить путь к скачанному файлу
  Future<String?> getDownloadedPath(Track track) async {
    if (!_downloadedIds.contains(track.fullId)) return null;
    final dir = await getApplicationDocumentsDirectory();
    final filePath = '${dir.path}/downloads/${track.fullId}.mp3';
    final file = File(filePath);
    if (await file.exists()) return filePath;
    return null;
  }

  @override
  void dispose() {
    _positionSub?.cancel();
    _durationSub?.cancel();
    _playerStateSub?.cancel();
    _playerCompleteSub?.cancel();
    _player.dispose();
    super.dispose();
  }
}