import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/audio_provider.dart';
import '../models/track.dart';

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
                Icon(
                  Icons.favorite_rounded,
                  size: 64,
                  color: Colors.white.withValues(alpha: 0.1),
                ),
                const SizedBox(height: 16),
                Text(
                  'Нет любимых треков',
                  style: TextStyle(
                    color: Colors.white.withValues(alpha: 0.3),
                    fontSize: 16,
                  ),
                ),
                const SizedBox(height: 8),
                Text(
                  'Нажмите на сердечко рядом с треком,\nчтобы добавить его в избранное',
                  textAlign: TextAlign.center,
                  style: TextStyle(
                    color: Colors.white.withValues(alpha: 0.2),
                    fontSize: 13,
                  ),
                ),
              ],
            ),
          );
        }

        return Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            // Заголовок
            Padding(
              padding: const EdgeInsets.fromLTRB(16, 16, 16, 8),
              child: Row(
                children: [
                  const Text(
                    'Любимые треки',
                    style: TextStyle(
                      color: Colors.white,
                      fontSize: 20,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                  const Spacer(),
                  Text(
                    '${favorites.length} ${_pluralize(favorites.length)}',
                    style: TextStyle(
                      color: Colors.white.withValues(alpha: 0.4),
                      fontSize: 13,
                    ),
                  ),
                ],
              ),
            ),

            // Список любимых треков
            Expanded(
              child: ListView.builder(
                padding: const EdgeInsets.symmetric(vertical: 8),
                itemCount: favorites.length,
                itemBuilder: (context, index) {
                  return _buildFavoriteTile(favorites[index], provider);
                },
              ),
            ),
          ],
        );
      },
    );
  }

  String _pluralize(int count) {
    if (count % 10 == 1 && count % 100 != 11) return 'трек';
    if (count % 10 >= 2 && count % 10 <= 4 && (count % 100 < 10 || count % 100 >= 20)) {
      return 'трека';
    }
    return 'треков';
  }

  Widget _buildFavoriteTile(Track track, AudioProvider provider) {
    final isCurrentTrack = provider.currentTrack == track;

    return GestureDetector(
      onTap: () {
        final trackIndex = provider.tracks.indexOf(track);
        if (trackIndex >= 0) {
          provider.playTrack(trackIndex);
        }
      },
      child: Container(
        padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 10),
        decoration: BoxDecoration(
          color: isCurrentTrack
              ? const Color(0xFF1A1B2E)
              : Colors.transparent,
          border: Border(
            bottom: BorderSide(color: Colors.white.withValues(alpha: 0.03)),
          ),
        ),
        child: Row(
          children: [
            // Обложка
            Container(
              width: 44,
              height: 44,
              decoration: BoxDecoration(
                borderRadius: BorderRadius.circular(8),
                image: track.albumArtUrl != null
                    ? DecorationImage(
                        image: NetworkImage(track.albumArtUrl!),
                        fit: BoxFit.cover,
                      )
                    : null,
                color: const Color(0xFF2D2E4A),
              ),
              child: track.albumArtUrl == null
                  ? Icon(
                      Icons.music_note_rounded,
                      color: Colors.white.withValues(alpha: 0.2),
                      size: 22,
                    )
                  : null,
            ),
            const SizedBox(width: 12),
            // Информация
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
                          decoration: const BoxDecoration(
                            shape: BoxShape.circle,
                            color: Color(0xFF6C5CE7),
                          ),
                        ),
                      Expanded(
                        child: Text(
                          track.title,
                          style: TextStyle(
                            color: isCurrentTrack
                                ? const Color(0xFF6C5CE7)
                                : Colors.white,
                            fontSize: 14,
                            fontWeight: FontWeight.w500,
                          ),
                          maxLines: 1,
                          overflow: TextOverflow.ellipsis,
                        ),
                      ),
                    ],
                  ),
                  const SizedBox(height: 2),
                  Text(
                    track.artist,
                    style: TextStyle(
                      color: Colors.white.withValues(alpha: 0.4),
                      fontSize: 12,
                    ),
                    maxLines: 1,
                    overflow: TextOverflow.ellipsis,
                  ),
                ],
              ),
            ),
            const SizedBox(width: 8),
            // Длительность
            Text(
              track.formattedDuration,
              style: TextStyle(
                color: Colors.white.withValues(alpha: 0.3),
                fontSize: 12,
              ),
            ),
            const SizedBox(width: 8),
            // Сердечко (активное) — убрать из избранного
            IconButton(
              icon: Icon(
                Icons.favorite_rounded,
                color: const Color(0xFF6C5CE7),
                size: 20,
              ),
              onPressed: () => provider.toggleFavorite(track),
              padding: EdgeInsets.zero,
              constraints: const BoxConstraints(
                minWidth: 32,
                minHeight: 32,
              ),
            ),
          ],
        ),
      ),
    );
  }
}