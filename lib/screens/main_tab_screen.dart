import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/audio_provider.dart';
import '../models/track.dart';

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
          return const Center(
            child: CircularProgressIndicator(
              color: Color(0xFF6C5CE7),
            ),
          );
        }

        final tracks = provider.tracks;

        if (tracks.isEmpty) {
          return Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Icon(
                  Icons.music_note_rounded,
                  size: 64,
                  color: Colors.white.withValues(alpha: 0.1),
                ),
                const SizedBox(height: 16),
                Text(
                  'Музыка пока не загружена',
                  style: TextStyle(
                    color: Colors.white.withValues(alpha: 0.3),
                    fontSize: 16,
                  ),
                ),
                const SizedBox(height: 8),
                Text(
                  'Проверьте подключение к серверу',
                  style: TextStyle(
                    color: Colors.white.withValues(alpha: 0.2),
                    fontSize: 13,
                  ),
                ),
              ],
            ),
          );
        }

        return RefreshIndicator(
          onRefresh: () => provider.loadTracks(),
          color: const Color(0xFF6C5CE7),
          backgroundColor: const Color(0xFF1A1B2E),
          child: ListView.builder(
            controller: _scrollController,
            padding: const EdgeInsets.symmetric(vertical: 8),
            itemCount: tracks.length,
            itemBuilder: (context, index) {
              return _buildTrackTile(tracks[index], index, provider);
            },
          ),
        );
      },
    );
  }

  Widget _buildTrackTile(Track track, int index, AudioProvider provider) {
    final isCurrentTrack = provider.currentTrack == track;

    return GestureDetector(
      onTap: () {
        provider.playTrack(index);
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
            // Информация о треке
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
            // Кнопка "Любимое"
            IconButton(
              icon: Icon(
                provider.isFavorite(track)
                    ? Icons.favorite_rounded
                    : Icons.favorite_border_rounded,
                color: provider.isFavorite(track)
                    ? const Color(0xFF6C5CE7)
                    : Colors.white.withValues(alpha: 0.3),
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