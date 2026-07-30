import 'dart:async';
import 'package:flutter/foundation.dart';
import 'package:just_audio/just_audio.dart';
import '../models/track.dart';
import '../services/vk_api_service.dart';

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
    } catch (e) {
      // Ошибка воспроизведения
    }
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
    } else {
      _favoriteIds.add(track.fullId);
    }
    notifyListeners();
  }

  bool isFavorite(Track track) => _favoriteIds.contains(track.fullId);

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