import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/audio_provider.dart';
import '../models/track.dart';

/// Чипсы-фильтры для разделов музыки (как в FlutterVK)
class ChipFilters extends StatefulWidget {
  const ChipFilters({super.key});

  @override
  State<ChipFilters> createState() => _ChipFiltersState();
}

class _ChipFiltersState extends State<ChipFilters> {
  bool _myMusicEnabled = true;
  bool _playlistsEnabled = true;
  bool _recommendationsEnabled = true;
  bool _realtimeEnabled = false;
  bool _similarEnabled = false;

  @override
  Widget build(BuildContext context) {
    final cs = Theme.of(context).colorScheme;
    return SingleChildScrollView(
      scrollDirection: Axis.horizontal,
      padding: const EdgeInsets.symmetric(horizontal: 16),
      child: Row(
        children: [
          _buildFilterChip(cs, 'Моя музыка', _myMusicEnabled, (v) {
            setState(() => _myMusicEnabled = v);
          }),
          const SizedBox(width: 8),
          _buildFilterChip(cs, 'Плейлисты', _playlistsEnabled, (v) {
            setState(() => _playlistsEnabled = v);
          }),
          const SizedBox(width: 8),
          _buildFilterChip(cs, 'Рекомендации', _recommendationsEnabled, (v) {
            setState(() => _recommendationsEnabled = v);
          }),
          const SizedBox(width: 8),
          _buildFilterChip(cs, 'В реальном времени', _realtimeEnabled, (v) {
            setState(() => _realtimeEnabled = v);
          }),
          const SizedBox(width: 8),
          _buildFilterChip(cs, 'Совпадения по вкусам', _similarEnabled, (v) {
            setState(() => _similarEnabled = v);
          }),
        ],
      ),
    );
  }

  Widget _buildFilterChip(ColorScheme cs, String label, bool selected, ValueChanged<bool> onSelected) {
    return FilterChip(
      label: Text(label, style: TextStyle(fontSize: 13, color: selected ? cs.primary : cs.onSurface)),
      selected: selected,
      onSelected: onSelected,
      visualDensity: VisualDensity.compact,
      selectedColor: cs.primaryContainer,
      checkmarkColor: cs.primary,
      side: BorderSide.none,
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(20)),
    );
  }

  bool get hasAnyEnabled =>
      _myMusicEnabled || _playlistsEnabled || _recommendationsEnabled ||
      _realtimeEnabled || _similarEnabled;
}

class MainTabScreen extends StatefulWidget {
  const MainTabScreen({super.key});

  @override
  State<MainTabScreen> createState() => _MainTabScreenState();
}

class _MainTabScreenState extends State<MainTabScreen> {
  final ScrollController _scrollController = ScrollController();
  final _chipFiltersKey = GlobalKey<_ChipFiltersState>();

  @override
  void dispose() {
    _scrollController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    final cs = Theme.of(context).colorScheme;
    return Consumer<AudioProvider>(
      builder: (context, provider, child) {
        if (provider.isLoading) {
          return const Center(child: CircularProgressIndicator());
        }

        final tracks = provider.tracks;

        return RefreshIndicator(
          onRefresh: () => provider.loadTracks(),
          child: CustomScrollView(
            controller: _scrollController,
            slivers: [
              // Чипсы-фильтры
              SliverToBoxAdapter(
                child: Padding(
                  padding: const EdgeInsets.symmetric(vertical: 12),
                  child: ChipFilters(key: _chipFiltersKey),
                ),
              ),

              // Блок "Моя музыка"
              if (_chipFiltersKey.currentState?.hasAnyEnabled ?? true)
                SliverToBoxAdapter(
                  child: _buildSectionHeader(context, 'Моя музыка', '${tracks.length} треков'),
                ),
              if (_chipFiltersKey.currentState?.hasAnyEnabled ?? true)
                SliverList(
                  delegate: SliverChildBuilderDelegate(
                    (context, index) {
                      if (index >= tracks.length) return null;
                      return _buildTrackTile(tracks[index], index, provider, cs);
                    },
                    childCount: tracks.length > 10 ? 10 : tracks.length,
                  ),
                ),

              // Кнопки управления
              if (tracks.isNotEmpty)
                SliverToBoxAdapter(
                  child: Padding(
                    padding: const EdgeInsets.fromLTRB(16, 8, 16, 16),
                    child: Wrap(
                      spacing: 8,
                      children: [
                        FilledButton.icon(
                          icon: Icon(provider.isPlaying ? Icons.pause : Icons.play_arrow, size: 18),
                          label: Text(provider.isPlaying ? 'Пауза' : 'Перемешать'),
                          onPressed: () {
                            if (provider.isPlaying) {
                              provider.playPause();
                            } else {
                              provider.toggleShuffle();
                              if (provider.currentTrack == null) {
                                provider.playTrack(0);
                              } else {
                                provider.playPause();
                              }
                            }
                          },
                        ),
                        FilledButton.tonalIcon(
                          icon: const Icon(Icons.queue_music, size: 18),
                          label: const Text('Все треки'),
                          onPressed: null,
                        ),
                      ],
                    ),
                  ),
                ),

              // Блок "Рекомендации"
              if (tracks.isNotEmpty)
                SliverToBoxAdapter(
                  child: _buildSectionHeader(context, 'Рекомендации', 'По вашим вкусам'),
                ),
              if (tracks.isNotEmpty)
                SliverList(
                  delegate: SliverChildBuilderDelegate(
                    (context, index) {
                      if (index >= tracks.length) return null;
                      return _buildTrackTile(tracks[index], index, provider, cs);
                    },
                    childCount: tracks.length > 5 ? 5 : tracks.length,
                  ),
                ),

              // Пустое состояние
              if (tracks.isEmpty)
                SliverFillRemaining(
                  child: Center(
                    child: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        Icon(Icons.music_note_rounded, size: 64,
                            color: cs.onSurface.withValues(alpha: 0.2)),
                        const SizedBox(height: 16),
                        Text('Музыка пока не загружена',
                            style: TextStyle(
                                color: cs.onSurface.withValues(alpha: 0.6), fontSize: 16)),
                        const SizedBox(height: 8),
                        Text('Проверьте подключение к интернету',
                            style: TextStyle(
                                color: cs.onSurface.withValues(alpha: 0.4), fontSize: 13)),
                      ],
                    ),
                  ),
                ),
            ],
          ),
        );
      },
    );
  }

  Widget _buildSectionHeader(BuildContext context, String title, String subtitle) {
    final cs = Theme.of(context).colorScheme;
    return Padding(
      padding: const EdgeInsets.fromLTRB(16, 16, 16, 8),
      child: Row(
        children: [
          Text(title,
              style: TextStyle(
                  color: cs.onSurface, fontSize: 20, fontWeight: FontWeight.bold)),
          const Spacer(),
          Text(subtitle,
              style: TextStyle(
                  color: cs.onSurface.withValues(alpha: 0.6), fontSize: 13)),
        ],
      ),
    );
  }

  Widget _buildTrackTile(
      Track track, int index, AudioProvider provider, ColorScheme cs) {
    final isCurrentTrack = provider.currentTrack == track;
    return GestureDetector(
      onTap: () => provider.playTrack(index),
      child: Container(
        padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 10),
        color: isCurrentTrack
            ? cs.primaryContainer.withValues(alpha: 0.3)
            : Colors.transparent,
        child: Row(
          children: [
            Container(
              width: 44,
              height: 44,
              decoration: BoxDecoration(
                borderRadius: BorderRadius.circular(8),
                image: track.albumArtUrl != null
                    ? DecorationImage(
                        image: NetworkImage(track.albumArtUrl!), fit: BoxFit.cover)
                    : null,
                color: cs.primaryContainer.withValues(alpha: 0.3),
              ),
              child: track.albumArtUrl == null
                  ? Icon(Icons.music_note_rounded,
                      color: cs.onPrimaryContainer.withValues(alpha: 0.4), size: 22)
                  : null,
            ),
            const SizedBox(width: 12),
            Expanded(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Row(
                    children: [
                      if (isCurrentTrack)
                        Container(
                            width: 4,
                            height: 4,
                            margin: const EdgeInsets.only(right: 6),
                            decoration: BoxDecoration(
                                shape: BoxShape.circle, color: cs.primary)),
                      Expanded(
                        child: Text(track.title,
                            style: TextStyle(
                                color: isCurrentTrack
                                    ? cs.primary
                                    : cs.onSurface,
                                fontSize: 14,
                                fontWeight: FontWeight.w500),
                            maxLines: 1,
                            overflow: TextOverflow.ellipsis),
                      ),
                    ],
                  ),
                  const SizedBox(height: 2),
                  Text(track.artist,
                      style: TextStyle(
                          color: cs.onSurface.withValues(alpha: 0.6), fontSize: 12),
                      maxLines: 1,
                      overflow: TextOverflow.ellipsis),
                ],
              ),
            ),
            const SizedBox(width: 8),
            Text(track.formattedDuration,
                style: TextStyle(
                    color: cs.onSurface.withValues(alpha: 0.4), fontSize: 12)),
            const SizedBox(width: 4),
            IconButton(
              icon: Icon(
                provider.isFavorite(track)
                    ? Icons.favorite_rounded
                    : Icons.favorite_border_rounded,
                color: provider.isFavorite(track)
                    ? cs.error
                    : cs.onSurface.withValues(alpha: 0.4),
                size: 20,
              ),
              onPressed: () => provider.toggleFavorite(track),
              padding: EdgeInsets.zero,
              constraints: const BoxConstraints(minWidth: 32, minHeight: 32),
            ),
          ],
        ),
      ),
    );
  }
}