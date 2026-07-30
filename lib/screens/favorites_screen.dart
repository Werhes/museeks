import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/audio_provider.dart';
import '../models/track.dart';
import '../main.dart';

class FavoritesScreen extends StatelessWidget {
  const FavoritesScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Consumer<AudioProvider>(
      builder: (context, provider, child) {
        final favorites = provider.favoriteTracks;

        if (favorites.isEmpty) {
          return Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Icon(Icons.favorite_rounded, size: 64, color: VKTheme.primary.withValues(alpha: 0.2)),
                const SizedBox(height: 16),
                const Text('Нет любимых треков', style: TextStyle(color: VKTheme.textSecondary, fontSize: 16)),
                const SizedBox(height: 8),
                const Text('Нажмите на сердечко рядом с треком,\nчтобы добавить его в избранное',
                    textAlign: TextAlign.center, style: TextStyle(color: VKTheme.textHint, fontSize: 13)),
              ],
            ),
          );
        }

        return Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Padding(
              padding: const EdgeInsets.fromLTRB(16, 16, 16, 8),
              child: Row(
                children: [
                  const Text('Любимые треки', style: TextStyle(color: VKTheme.textPrimary, fontSize: 20, fontWeight: FontWeight.bold)),
                  const Spacer(),
                  Text('${favorites.length} ${_pluralize(favorites.length)}',
                      style: const TextStyle(color: VKTheme.textSecondary, fontSize: 13)),
                ],
              ),
            ),
            Expanded(
              child: ListView.builder(
                padding: const EdgeInsets.symmetric(vertical: 4),
                itemCount: favorites.length,
                itemBuilder: (context, index) => _buildFavoriteTile(favorites[index], provider),
              ),
            ),
          ],
        );
      },
    );
  }

  String _pluralize(int count) {
    if (count % 10 == 1 && count % 100 != 11) return 'трек';
    if (count % 10 >= 2 && count % 10 <= 4 && (count % 100 < 10 || count % 100 >= 20)) return 'трека';
    return 'треков';
  }

  Widget _buildFavoriteTile(Track track, AudioProvider provider) {
    final isCurrentTrack = provider.currentTrack == track;
    return GestureDetector(
      onTap: () {
        final trackIndex = provider.tracks.indexOf(track);
        if (trackIndex >= 0) provider.playTrack(trackIndex);
      },
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
              icon: const Icon(Icons.favorite_rounded, color: VKTheme.primary, size: 20),
              onPressed: () => provider.toggleFavorite(track),
              padding: EdgeInsets.zero, constraints: const BoxConstraints(minWidth: 32, minHeight: 32),
            ),
          ],
        ),
      ),
    );
  }
}