import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/audio_provider.dart';
import '../models/track.dart';
import '../main.dart';

class MainTabScreen extends StatefulWidget {
  const MainTabScreen({super.key});

  @override
  State<MainTabScreen> createState() => _MainTabScreenState();
}

class _MainTabScreenState extends State<MainTabScreen> {
  final ScrollController _scrollController = ScrollController();

  @override
  void dispose() {
    _scrollController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Consumer<AudioProvider>(
      builder: (context, provider, child) {
        if (provider.isLoading) {
          return const Center(child: CircularProgressIndicator(color: VKTheme.primary));
        }

        final tracks = provider.tracks;

        if (tracks.isEmpty) {
          return Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Icon(Icons.music_note_rounded, size: 64, color: VKTheme.primary.withValues(alpha: 0.2)),
                const SizedBox(height: 16),
                const Text('Музыка пока не загружена', style: TextStyle(color: VKTheme.textSecondary, fontSize: 16)),
                const SizedBox(height: 8),
                const Text('Проверьте подключение к интернету', style: TextStyle(color: VKTheme.textHint, fontSize: 13)),
              ],
            ),
          );
        }

        return RefreshIndicator(
          onRefresh: () => provider.loadTracks(),
          color: VKTheme.primary,
          backgroundColor: Colors.white,
          child: ListView.builder(
            controller: _scrollController,
            padding: const EdgeInsets.symmetric(vertical: 4),
            itemCount: tracks.length,
            itemBuilder: (context, index) => _buildTrackTile(tracks[index], index, provider),
          ),
        );
      },
    );
  }

  Widget _buildTrackTile(Track track, int index, AudioProvider provider) {
    final isCurrentTrack = provider.currentTrack == track;
    return GestureDetector(
      onTap: () => provider.playTrack(index),
      child: Container(
        padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 10),
        color: isCurrentTrack ? VKTheme.primary.withValues(alpha: 0.08) : Colors.transparent,
        child: Row(
          children: [
            Container(
              width: 44, height: 44,
              decoration: BoxDecoration(
                borderRadius: BorderRadius.circular(8),
                image: track.albumArtUrl != null
                    ? DecorationImage(image: NetworkImage(track.albumArtUrl!), fit: BoxFit.cover)
                    : null,
                color: VKTheme.primary.withValues(alpha: 0.15),
              ),
              child: track.albumArtUrl == null
                  ? Icon(Icons.music_note_rounded, color: VKTheme.primary.withValues(alpha: 0.4), size: 22)
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
                        Container(width: 4, height: 4, margin: const EdgeInsets.only(right: 6),
                            decoration: const BoxDecoration(shape: BoxShape.circle, color: VKTheme.primary)),
                      Expanded(
                        child: Text(track.title,
                            style: TextStyle(color: isCurrentTrack ? VKTheme.primary : VKTheme.textPrimary, fontSize: 14, fontWeight: FontWeight.w500),
                            maxLines: 1, overflow: TextOverflow.ellipsis),
                      ),
                    ],
                  ),
                  const SizedBox(height: 2),
                  Text(track.artist, style: const TextStyle(color: VKTheme.textSecondary, fontSize: 12), maxLines: 1, overflow: TextOverflow.ellipsis),
                ],
              ),
            ),
            const SizedBox(width: 8),
            Text(track.formattedDuration, style: const TextStyle(color: VKTheme.textHint, fontSize: 12)),
            const SizedBox(width: 4),
            IconButton(
              icon: Icon(
                provider.isFavorite(track) ? Icons.favorite_rounded : Icons.favorite_border_rounded,
                color: provider.isFavorite(track) ? VKTheme.primary : VKTheme.textHint, size: 20,
              ),
              onPressed: () => provider.toggleFavorite(track),
              padding: EdgeInsets.zero, constraints: const BoxConstraints(minWidth: 32, minHeight: 32),
            ),
          ],
        ),
      ),
    );
  }
}