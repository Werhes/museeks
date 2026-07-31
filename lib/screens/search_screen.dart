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
    final cs = Theme.of(context).colorScheme;
    return Consumer<AudioProvider>(
      builder: (context, provider, child) {
        return Column(
          children: [
            Container(
              margin: const EdgeInsets.fromLTRB(16, 12, 16, 8),
              decoration: BoxDecoration(
                color: cs.surfaceContainerHighest,
                borderRadius: BorderRadius.circular(12),
                border: Border.all(
                  color: _isSearching
                      ? cs.primary
                      : cs.onSurface.withValues(alpha: 0.12),
                ),
              ),
              child: TextField(
                controller: _searchController,
                style: TextStyle(color: cs.onSurface, fontSize: 15),
                decoration: InputDecoration(
                  hintText: 'Поиск треков и исполнителей',
                  hintStyle:
                      TextStyle(color: cs.onSurface.withValues(alpha: 0.4), fontSize: 15),
                  prefixIcon: Icon(Icons.search_rounded,
                      color: _isSearching
                          ? cs.primary
                          : cs.onSurface.withValues(alpha: 0.4)),
                  suffixIcon: _searchController.text.isNotEmpty
                      ? IconButton(
                          icon: Icon(Icons.clear_rounded,
                              color: cs.onSurface.withValues(alpha: 0.4)),
                          onPressed: () {
                            _searchController.clear();
                            provider.setSearchQuery('');
                            setState(() {});
                          },
                        )
                      : null,
                  border: InputBorder.none,
                  contentPadding:
                      const EdgeInsets.symmetric(horizontal: 16, vertical: 14),
                ),
                onChanged: (v) {
                  setState(() {});
                  provider.setSearchQuery(v);
                },
                onTap: () => setState(() => _isSearching = true),
                onSubmitted: (v) => provider.search(v),
                textInputAction: TextInputAction.search,
              ),
            ),
            Expanded(child: _buildSearchResults(provider, cs)),
          ],
        );
      },
    );
  }

  Widget _buildSearchResults(AudioProvider provider, ColorScheme cs) {
    final query = _searchController.text.trim();

    if (query.isEmpty) {
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(Icons.search_rounded, size: 64,
                color: cs.onSurface.withValues(alpha: 0.2)),
            const SizedBox(height: 16),
            Text('Найдите свою музыку',
                style: TextStyle(
                    color: cs.onSurface.withValues(alpha: 0.6), fontSize: 16)),
            const SizedBox(height: 8),
            Text('Ищите треки, альбомы и исполнителей',
                style: TextStyle(
                    color: cs.onSurface.withValues(alpha: 0.4), fontSize: 13)),
          ],
        ),
      );
    }

    if (provider.isLoading) {
      return const Center(child: CircularProgressIndicator());
    }

    final results = provider.filteredTracks;

    if (results.isEmpty) {
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(Icons.search_off_rounded, size: 64,
                color: cs.onSurface.withValues(alpha: 0.2)),
            const SizedBox(height: 16),
            Text('Ничего не найдено',
                style: TextStyle(
                    color: cs.onSurface.withValues(alpha: 0.6), fontSize: 16)),
          ],
        ),
      );
    }

    return ListView.builder(
      padding: const EdgeInsets.symmetric(vertical: 4),
      itemCount: results.length,
      itemBuilder: (context, index) =>
          _buildSearchResultTile(results[index], provider, cs),
    );
  }

  Widget _buildSearchResultTile(
      Track track, AudioProvider provider, ColorScheme cs) {
    return GestureDetector(
      onTap: () {
        final trackIndex = provider.tracks.indexOf(track);
        if (trackIndex >= 0) provider.playTrack(trackIndex);
      },
      child: Container(
        padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 10),
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
                  Text(track.title,
                      style: TextStyle(
                          color: cs.onSurface, fontSize: 14, fontWeight: FontWeight.w500),
                      maxLines: 1,
                      overflow: TextOverflow.ellipsis),
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
          ],
        ),
      ),
    );
  }
}