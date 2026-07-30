import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/audio_provider.dart';
import '../models/track.dart';

class SearchScreen extends StatefulWidget {
  const SearchScreen({super.key});

  @override
  State<SearchScreen> createState() => _SearchScreenState();
}

class _SearchScreenState extends State<SearchScreen> {
  final _searchController = TextEditingController();
  bool _isSearching = false;

  @override
  void dispose() {
    _searchController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Consumer<AudioProvider>(
      builder: (context, provider, child) {
        return Column(
          children: [
            // Поисковая строка
            Container(
              margin: const EdgeInsets.fromLTRB(16, 12, 16, 8),
              decoration: BoxDecoration(
                color: const Color(0xFF1A1B2E),
                borderRadius: BorderRadius.circular(12),
                border: Border.all(
                  color: _isSearching
                      ? const Color(0xFF6C5CE7)
                      : const Color(0xFF2D2E4A),
                ),
              ),
              child: TextField(
                controller: _searchController,
                style: const TextStyle(color: Colors.white, fontSize: 15),
                decoration: InputDecoration(
                  hintText: 'Поиск треков и исполнителей',
                  hintStyle: TextStyle(
                    color: Colors.white.withValues(alpha: 0.3),
                    fontSize: 15,
                  ),
                  prefixIcon: Icon(
                    Icons.search_rounded,
                    color: _isSearching
                        ? const Color(0xFF6C5CE7)
                        : Colors.white.withValues(alpha: 0.3),
                  ),
                  suffixIcon: _searchController.text.isNotEmpty
                      ? IconButton(
                          icon: Icon(
                            Icons.clear_rounded,
                            color: Colors.white.withValues(alpha: 0.3),
                          ),
                          onPressed: () {
                            _searchController.clear();
                            provider.setSearchQuery('');
                            setState(() {});
                          },
                        )
                      : null,
                  border: InputBorder.none,
                  contentPadding: const EdgeInsets.symmetric(
                    horizontal: 16,
                    vertical: 14,
                  ),
                ),
                onChanged: (value) {
                  setState(() {});
                  provider.setSearchQuery(value);
                },
                onTap: () {
                  setState(() => _isSearching = true);
                },
                onSubmitted: (value) {
                  provider.search(value);
                },
                textInputAction: TextInputAction.search,
              ),
            ),

            // Результаты поиска
            Expanded(
              child: _buildSearchResults(provider),
            ),
          ],
        );
      },
    );
  }

  Widget _buildSearchResults(AudioProvider provider) {
    final query = _searchController.text.trim();

    if (query.isEmpty) {
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(
              Icons.search_rounded,
              size: 64,
              color: Colors.white.withValues(alpha: 0.1),
            ),
            const SizedBox(height: 16),
            Text(
              'Найдите свою музыку',
              style: TextStyle(
                color: Colors.white.withValues(alpha: 0.3),
                fontSize: 16,
              ),
            ),
            const SizedBox(height: 8),
            Text(
              'Ищите треки, альбомы и исполнителей',
              style: TextStyle(
                color: Colors.white.withValues(alpha: 0.2),
                fontSize: 13,
              ),
            ),
          ],
        ),
      );
    }

    if (provider.isLoading) {
      return const Center(
        child: CircularProgressIndicator(
          color: Color(0xFF6C5CE7),
        ),
      );
    }

    final results = provider.filteredTracks;

    if (results.isEmpty) {
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(
              Icons.search_off_rounded,
              size: 64,
              color: Colors.white.withValues(alpha: 0.1),
            ),
            const SizedBox(height: 16),
            Text(
              'Ничего не найдено',
              style: TextStyle(
                color: Colors.white.withValues(alpha: 0.3),
                fontSize: 16,
              ),
            ),
          ],
        ),
      );
    }

    return ListView.builder(
      padding: const EdgeInsets.symmetric(vertical: 8),
      itemCount: results.length,
      itemBuilder: (context, index) {
        return _buildSearchResultTile(results[index], provider);
      },
    );
  }

  Widget _buildSearchResultTile(Track track, AudioProvider provider) {
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
                  Text(
                    track.title,
                    style: const TextStyle(
                      color: Colors.white,
                      fontSize: 14,
                      fontWeight: FontWeight.w500,
                    ),
                    maxLines: 1,
                    overflow: TextOverflow.ellipsis,
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
            Text(
              track.formattedDuration,
              style: TextStyle(
                color: Colors.white.withValues(alpha: 0.3),
                fontSize: 12,
              ),
            ),
          ],
        ),
      ),
    );
  }
}