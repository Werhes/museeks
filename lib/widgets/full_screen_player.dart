import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/audio_provider.dart' as audio_prov;
import '../models/track.dart';

/// Полноэкранный плеер в стиле FlutterVK
class FullScreenPlayer extends StatefulWidget {
  const FullScreenPlayer({super.key});

  @override
  State<FullScreenPlayer> createState() => _FullScreenPlayerState();
}

class _FullScreenPlayerState extends State<FullScreenPlayer>
    with SingleTickerProviderStateMixin {
  late AnimationController _glowController;
  bool _showLyrics = false;
  bool _showQueue = false;

  @override
  void initState() {
    super.initState();
    _glowController = AnimationController(
      vsync: this,
      duration: const Duration(seconds: 3),
    )..repeat(reverse: true);
  }

  @override
  void dispose() {
    _glowController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    final cs = Theme.of(context).colorScheme;
    return Consumer<audio_prov.AudioProvider>(
      builder: (context, provider, child) {
        final track = provider.currentTrack;
        if (track == null) {
          return Scaffold(
            backgroundColor: cs.surface,
            appBar: AppBar(
              backgroundColor: Colors.transparent,
              elevation: 0,
              leading: IconButton(
                icon: Icon(Icons.adaptive.arrow_back, color: cs.onSurface),
                onPressed: () => Navigator.of(context).pop(),
              ),
            ),
            body: Center(
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Icon(Icons.music_note_rounded,
                      size: 80, color: cs.onSurface.withValues(alpha: 0.2)),
                  const SizedBox(height: 16),
                  Text('Нет трека для воспроизведения',
                      style: TextStyle(
                          color: cs.onSurface.withValues(alpha: 0.6))),
                ],
              ),
            ),
          );
        }

        return Scaffold(
          backgroundColor: cs.surface,
          body: SafeArea(
            child: Padding(
              padding: const EdgeInsets.all(16),
              child: Column(
                children: [
                  // Top bar
                  _buildTopBar(context, cs, provider, track),
                  const SizedBox(height: 16),

                  // Main content area
                  Expanded(
                    child: _showLyrics
                        ? _buildLyricsView(context, cs, provider)
                        : _showQueue
                            ? _buildQueueView(context, cs, provider)
                            : _buildAlbumArtView(context, cs, provider, track),
                  ),

                  const SizedBox(height: 16),

                  // Bottom controls
                  _buildBottomControls(context, cs, provider, track),
                ],
              ),
            ),
          ),
        );
      },
    );
  }

  Widget _buildTopBar(BuildContext context, ColorScheme cs,
      audio_prov.AudioProvider provider, Track track) {
    return SizedBox(
      height: 50,
      child: Row(
        children: [
          IconButton(
            icon: Icon(Icons.adaptive.arrow_back, color: cs.onSurface),
            onPressed: () => Navigator.of(context).pop(),
          ),
          const Spacer(),
          Text(
            'Сейчас играет',
            style: TextStyle(
              color: cs.onSurface,
              fontWeight: FontWeight.w500,
            ),
          ),
          const Spacer(),
          IconButton(
            icon: Icon(Icons.adaptive.more, color: cs.onSurface),
            onPressed: () => _showTrackOptions(context, provider, track),
          ),
        ],
      ),
    );
  }

  Widget _buildAlbumArtView(BuildContext context, ColorScheme cs,
      audio_prov.AudioProvider provider, Track track) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        // Album art with glow effect
        AnimatedBuilder(
          animation: _glowController,
          builder: (context, child) {
            return Container(
              width: 300,
              height: 300,
              decoration: BoxDecoration(
                borderRadius: BorderRadius.circular(20),
                boxShadow: [
                  BoxShadow(
                    color: cs.primary.withValues(
                        alpha: 0.3 + _glowController.value * 0.2),
                    blurRadius: 30 + _glowController.value * 20,
                    spreadRadius: 2,
                  ),
                ],
              ),
              child: ClipRRect(
                borderRadius: BorderRadius.circular(20),
                child: track.albumArtUrl != null
                    ? Image.network(
                        track.albumArtUrl!,
                        fit: BoxFit.cover,
                        errorBuilder: (context, error, stackTrace) =>
                            _buildFallbackArt(cs),
                      )
                    : _buildFallbackArt(cs),
              ),
            );
          },
        ),
        const SizedBox(height: 32),

        // Track info
        Padding(
          padding: const EdgeInsets.symmetric(horizontal: 16),
          child: Column(
            children: [
              Text(
                track.title,
                style: TextStyle(
                  color: cs.onSurface,
                  fontSize: 24,
                  fontWeight: FontWeight.bold,
                ),
                textAlign: TextAlign.center,
                maxLines: 2,
                overflow: TextOverflow.ellipsis,
              ),
              const SizedBox(height: 8),
              Text(
                track.artist,
                style: TextStyle(
                  color: cs.onSurface.withValues(alpha: 0.7),
                  fontSize: 18,
                ),
                textAlign: TextAlign.center,
                maxLines: 1,
                overflow: TextOverflow.ellipsis,
              ),
            ],
          ),
        ),
      ],
    );
  }

  Widget _buildFallbackArt(ColorScheme cs) {
    return Container(
      color: cs.primaryContainer.withValues(alpha: 0.3),
      child: Icon(Icons.music_note_rounded,
          size: 80, color: cs.onPrimaryContainer.withValues(alpha: 0.4)),
    );
  }

  Widget _buildLyricsView(
      BuildContext context, ColorScheme cs, audio_prov.AudioProvider provider) {
    if (provider.isLoadingLyrics) {
      return const Center(child: CircularProgressIndicator());
    }

    if (provider.currentLyrics == null) {
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(Icons.lyrics_outlined,
                size: 64, color: cs.onSurface.withValues(alpha: 0.2)),
            const SizedBox(height: 16),
            Text('Текст песни не найден',
                style: TextStyle(
                    color: cs.onSurface.withValues(alpha: 0.6), fontSize: 16)),
            const SizedBox(height: 8),
            TextButton.icon(
              icon: const Icon(Icons.open_in_new, size: 18),
              label: const Text('Открыть на Genius'),
              onPressed: () => _openGenius(provider.currentTrack),
            ),
          ],
        ),
      );
    }

    return SingleChildScrollView(
      padding: const EdgeInsets.symmetric(horizontal: 24),
      child: SelectableText(
        provider.currentLyrics!,
        style: TextStyle(
          color: cs.onSurface,
          fontSize: 18,
          height: 1.6,
        ),
        textAlign: TextAlign.center,
      ),
    );
  }

  Widget _buildQueueView(
      BuildContext context, ColorScheme cs, audio_prov.AudioProvider provider) {
    if (!provider.hasQueue) {
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(Icons.queue_music_outlined,
                size: 64, color: cs.onSurface.withValues(alpha: 0.2)),
            const SizedBox(height: 16),
            Text('Очередь пуста',
                style: TextStyle(
                    color: cs.onSurface.withValues(alpha: 0.6), fontSize: 16)),
          ],
        ),
      );
    }

    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Row(
          children: [
            Text('Очередь',
                style: TextStyle(
                    color: cs.onSurface,
                    fontSize: 18,
                    fontWeight: FontWeight.bold)),
            const Spacer(),
            Text('${provider.queue.length} треков',
                style: TextStyle(
                    color: cs.onSurface.withValues(alpha: 0.6), fontSize: 13)),
            const SizedBox(width: 8),
            TextButton(
              onPressed: provider.clearQueue,
              child: const Text('Очистить'),
            ),
          ],
        ),
        const SizedBox(height: 8),
        Expanded(
          child: ReorderableListView.builder(
            itemCount: provider.queue.length,
            onReorderItem: (int oldIndex, int newIndex) {
              provider.moveInQueue(oldIndex, newIndex);
            },
            itemBuilder: (context, index) {
              final queueTrack = provider.queue[index];
              final isCurrent = index == provider.queueIndex;
              return Container(
                key: ValueKey('${queueTrack.fullId}_$index'),
                padding:
                    const EdgeInsets.symmetric(horizontal: 12, vertical: 8),
                decoration: BoxDecoration(
                  color: isCurrent
                      ? cs.primaryContainer.withValues(alpha: 0.3)
                      : Colors.transparent,
                  borderRadius: BorderRadius.circular(8),
                ),
                child: Row(
                  children: [
                    ReorderableDragStartListener(
                      index: index,
                      child: Icon(Icons.drag_handle,
                          color: cs.onSurface.withValues(alpha: 0.4)),
                    ),
                    const SizedBox(width: 8),
                    Expanded(
                      child: Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          Text(queueTrack.title,
                              style: TextStyle(
                                  color: isCurrent
                                      ? cs.primary
                                      : cs.onSurface,
                                  fontSize: 14,
                                  fontWeight: FontWeight.w500),
                              maxLines: 1,
                              overflow: TextOverflow.ellipsis),
                          Text(queueTrack.artist,
                              style: TextStyle(
                                  color: cs.onSurface.withValues(alpha: 0.6),
                                  fontSize: 12),
                              maxLines: 1,
                              overflow: TextOverflow.ellipsis),
                        ],
                      ),
                    ),
                    IconButton(
                      icon: Icon(Icons.close,
                          size: 18,
                          color: cs.onSurface.withValues(alpha: 0.4)),
                      onPressed: () => provider.removeFromQueue(index),
                    ),
                  ],
                ),
              );
            },
          ),
        ),
      ],
    );
  }

  Widget _buildBottomControls(BuildContext context, ColorScheme cs,
      audio_prov.AudioProvider provider, Track track) {
    return Column(
      children: [
        // Progress bar
        _buildProgressBar(provider, cs),
        const SizedBox(height: 8),

        // Time labels
        Padding(
          padding: const EdgeInsets.symmetric(horizontal: 16),
          child: Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              Text(_formatDuration(provider.position),
                  style: TextStyle(
                      color: cs.onSurface.withValues(alpha: 0.6),
                      fontSize: 12)),
              Text('-${_formatDuration(provider.duration - provider.position)}',
                  style: TextStyle(
                      color: cs.onSurface.withValues(alpha: 0.6),
                      fontSize: 12)),
            ],
          ),
        ),
        const SizedBox(height: 16),

        // Main controls
        Row(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            // Shuffle
            IconButton(
              icon: Icon(
                Icons.shuffle,
                color: provider.isShuffled
                    ? cs.primary
                    : cs.onSurface.withValues(alpha: 0.5),
              ),
              onPressed: provider.toggleShuffle,
              iconSize: 24,
            ),
            const SizedBox(width: 16),

            // Previous
            IconButton(
              icon: Icon(Icons.skip_previous_rounded,
                  color: cs.onSurface, size: 32),
              onPressed: provider.previous,
            ),
            const SizedBox(width: 16),

            // Play/Pause
            Container(
              width: 64,
              height: 64,
              decoration: BoxDecoration(
                shape: BoxShape.circle,
                color: cs.primary,
              ),
              child: IconButton(
                icon: Icon(
                  provider.isPlaying
                      ? Icons.pause_rounded
                      : Icons.play_arrow_rounded,
                  color: cs.onPrimary,
                  size: 36,
                ),
                onPressed: provider.playPause,
              ),
            ),
            const SizedBox(width: 16),

            // Next
            IconButton(
              icon: Icon(Icons.skip_next_rounded,
                  color: cs.onSurface, size: 32),
              onPressed: provider.next,
            ),
            const SizedBox(width: 16),

            // Repeat
            IconButton(
              icon: _buildRepeatIcon(provider, cs),
              onPressed: provider.toggleRepeatMode,
              iconSize: 24,
            ),
          ],
        ),
        const SizedBox(height: 16),

        // Bottom action bar
        Row(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          children: [
            // Lyrics toggle
            _buildActionButton(
              context,
              icon: _showLyrics
                  ? Icons.lyrics
                  : Icons.lyrics_outlined,
              isActive: _showLyrics,
              onPressed: () {
                setState(() {
                  _showLyrics = !_showLyrics;
                  _showQueue = false;
                });
              },
            ),

            // Queue toggle
            _buildActionButton(
              context,
              icon: _showQueue
                  ? Icons.queue_music
                  : Icons.queue_music_outlined,
              isActive: _showQueue,
              onPressed: () {
                setState(() {
                  _showQueue = !_showQueue;
                  _showLyrics = false;
                });
              },
            ),

            // Download
            _buildActionButton(
              context,
              icon: provider.isDownloaded(track)
                  ? Icons.download_done
                  : Icons.download_outlined,
              isActive: provider.isDownloaded(track),
              onPressed: () {
                if (provider.isDownloaded(track)) {
                  provider.deleteDownload(track);
                } else {
                  provider.downloadTrack(track);
                }
              },
            ),

            // Favorite
            _buildActionButton(
              context,
              icon: provider.isFavorite(track)
                  ? Icons.favorite
                  : Icons.favorite_outline,
              isActive: provider.isFavorite(track),
              onPressed: () => provider.toggleFavorite(track),
            ),
          ],
        ),
      ],
    );
  }

  Widget _buildActionButton(
    BuildContext context, {
    required IconData icon,
    required bool isActive,
    required VoidCallback onPressed,
  }) {
    final cs = Theme.of(context).colorScheme;
    return IconButton(
      icon: Icon(
        icon,
        color: isActive ? cs.primary : cs.onSurface.withValues(alpha: 0.6),
      ),
      onPressed: onPressed,
    );
  }

  Widget _buildProgressBar(audio_prov.AudioProvider provider, ColorScheme cs) {
    return LayoutBuilder(
      builder: (context, constraints) {
        return GestureDetector(
          onTapDown: (details) {
            provider.seek(details.localPosition.dx / constraints.maxWidth);
          },
          child: Container(
            height: 4,
            decoration: BoxDecoration(
              borderRadius: BorderRadius.circular(2),
              color: cs.primary.withValues(alpha: 0.15),
            ),
            child: FractionallySizedBox(
              alignment: Alignment.centerLeft,
              widthFactor: provider.progress,
              child: Container(
                decoration: BoxDecoration(
                  borderRadius: BorderRadius.circular(2),
                  color: cs.primary,
                ),
              ),
            ),
          ),
        );
      },
    );
  }

  Widget _buildRepeatIcon(audio_prov.AudioProvider provider, ColorScheme cs) {
    final color = provider.repeatMode != audio_prov.RepeatMode.none
        ? cs.primary
        : cs.onSurface.withValues(alpha: 0.5);

    switch (provider.repeatMode) {
      case audio_prov.RepeatMode.one:
        return Icon(Icons.repeat_one_on_rounded, color: color);
      case audio_prov.RepeatMode.all:
        return Icon(Icons.repeat_on_rounded, color: color);
      case audio_prov.RepeatMode.none:
        return Icon(Icons.repeat_rounded, color: color);
    }
  }

  void _showTrackOptions(
      BuildContext context, audio_prov.AudioProvider provider, Track track) {
    showModalBottomSheet(
      context: context,
      useRootNavigator: true,
      isScrollControlled: true,
      useSafeArea: true,
      builder: (context) => _TrackOptionsSheet(
        track: track,
        provider: provider,
      ),
    );
  }

  void _openGenius(Track? track) {
    if (track == null) return;
    // Открываем Genius в браузере
  }

  String _formatDuration(Duration d) {
    final secs = d.inSeconds.remainder(60).toString().padLeft(2, '0');
    return '${d.inMinutes}:$secs';
  }
}

/// Bottom sheet с опциями трека (как в FlutterVK)
class _TrackOptionsSheet extends StatelessWidget {
  final Track track;
  final audio_prov.AudioProvider provider;

  const _TrackOptionsSheet({
    required this.track,
    required this.provider,
  });

  @override
  Widget build(BuildContext context) {
    final cs = Theme.of(context).colorScheme;
    return Container(
      padding: const EdgeInsets.symmetric(vertical: 16),
      child: Column(
        mainAxisSize: MainAxisSize.min,
        children: [
          // Track info header
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: 16),
            child: Row(
              children: [
                ClipRRect(
                  borderRadius: BorderRadius.circular(8),
                  child: Container(
                    width: 48,
                    height: 48,
                    color: cs.primaryContainer.withValues(alpha: 0.3),
                    child: track.albumArtUrl != null
                        ? Image.network(track.albumArtUrl!, fit: BoxFit.cover)
                        : Icon(Icons.music_note,
                            color: cs.onPrimaryContainer, size: 24),
                  ),
                ),
                const SizedBox(width: 12),
                Expanded(
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(track.title,
                          style: TextStyle(
                              color: cs.onSurface,
                              fontWeight: FontWeight.w500),
                          maxLines: 1,
                          overflow: TextOverflow.ellipsis),
                      Text(track.artist,
                          style: TextStyle(
                              color: cs.onSurface.withValues(alpha: 0.6),
                              fontSize: 13),
                          maxLines: 1,
                          overflow: TextOverflow.ellipsis),
                    ],
                  ),
                ),
              ],
            ),
          ),
          const Divider(height: 24),

          // Options
          _buildOption(
            context,
            icon: Icons.favorite_outline,
            title: provider.isFavorite(track)
                ? 'Убрать из избранного'
                : 'Добавить в избранное',
            onTap: () {
              provider.toggleFavorite(track);
              Navigator.of(context).pop();
            },
          ),
          _buildOption(
            context,
            icon: Icons.queue_music_outlined,
            title: 'Добавить в очередь',
            onTap: () {
              provider.addToQueue(track);
              Navigator.of(context).pop();
              ScaffoldMessenger.of(context).showSnackBar(
                const SnackBar(
                    content: Text('Трек добавлен в очередь'),
                    duration: Duration(seconds: 2)),
              );
            },
          ),
          _buildOption(
            context,
            icon: Icons.playlist_add_outlined,
            title: 'Следующим в очереди',
            onTap: () {
              provider.addNextToQueue(track);
              Navigator.of(context).pop();
              ScaffoldMessenger.of(context).showSnackBar(
                const SnackBar(
                    content: Text('Трек будет следующим'),
                    duration: Duration(seconds: 2)),
              );
            },
          ),
          _buildOption(
            context,
            icon: provider.isDownloaded(track)
                ? Icons.download_done
                : Icons.download_outlined,
            title: provider.isDownloaded(track)
                ? 'Удалить загрузку'
                : 'Скачать трек',
            onTap: () {
              if (provider.isDownloaded(track)) {
                provider.deleteDownload(track);
              } else {
                provider.downloadTrack(track);
              }
              Navigator.of(context).pop();
            },
          ),
          _buildOption(
            context,
            icon: Icons.lyrics_outlined,
            title: 'Текст песни',
            onTap: () {
              Navigator.of(context).pop();
              // Открываем Genius
            },
          ),
          _buildOption(
            context,
            icon: Icons.share_outlined,
            title: 'Поделиться',
            onTap: () {
              Navigator.of(context).pop();
            },
          ),
        ],
      ),
    );
  }

  Widget _buildOption(
    BuildContext context, {
    required IconData icon,
    required String title,
    required VoidCallback onTap,
  }) {
    final cs = Theme.of(context).colorScheme;
    return ListTile(
      leading: Icon(icon, color: cs.onSurface.withValues(alpha: 0.7)),
      title: Text(title,
          style: TextStyle(color: cs.onSurface, fontSize: 15)),
      onTap: onTap,
      dense: true,
    );
  }
}