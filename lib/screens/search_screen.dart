import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/audio_provider.dart';
import '../models/track.dart';
import '../main.dart';

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
            Container(
              margin: const EdgeInsets.fromLTRB(16, 12, 16, 8),
              decoration: BoxDecoration(
                color: Colors.white,
                borderRadius: BorderRadius.circular(12),
                border: Border.all(color: _isSearching ? VKTheme.primary : VKTheme.primary.withValues(alpha: 0.2)),
              ),
              child: TextField(
                controller: _searchController,
                style: const TextStyle(color: VKTheme.textPrimary, fontSize: 15),
                decoration: InputDecoration(
                  hintText: 'Поиск треков и исполнителей',
                  hintStyle: const TextStyle(color: VKTheme.textHint, fontSize: 15),
                  prefixIcon: Icon(Icons.search_rounded, color: _isSearching ? VKTheme.primary : VKTheme.textHint),
                  suffixIcon: _searchController.text.isNotEmpty
                      ? IconButton(
                          icon: const Icon(Icons.clear_rounded, color: VKTheme.textHint),
                          onPressed: () { _searchController.clear(); provider.setSearchQuery(''); setState(() {}); },
                        )
                      : null,
                  border: InputBorder.none,
                  contentPadding: const EdgeInsets.symmetric(horizontal: 16, vertical: 14),
                ),
                onChanged: (v) { setState(() {}); provider.setSearchQuery(v); },
                onTap: () => setState(() => _isSearching = true),
                onSubmitted: (v) => provider.search(v),
                textInputAction: TextInputAction.search,
              ),
            ),
            Expanded(child: _buildSearchResults(provider)),
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
            Icon(Icons.search_rounded, size: 64, color: VKTheme.primary.withValues(alpha: 0.2)),
            const SizedBox(height: 16),
            const Text('Найдите свою музыку', style: TextStyle(color: VKTheme.textSecondary, fontSize: 16)),
            const SizedBox(height: 8),
            const Text('Ищите треки, альбомы и исполнителей', style: TextStyle(color: VKTheme.textHint, fontSize: 13)),
          ],
        ),
      );
    }

    if (provider.isLoading) {
      return const Center(child: CircularProgressIndicator(color: VKTheme.primary));
    }

    final results = provider.filteredTracks;

    if (results.isEmpty) {
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(Icons.search_off_rounded, size: 64, color: VKTheme.primary.withValues(alpha: 0.2)),
            const SizedBox(height: 16),
            const Text('Ничего не найдено', style: TextStyle(color: VKTheme.textSecondary, fontSize: 16)),
          ],
        ),
      );
    }

    return ListView.builder(
      padding: const EdgeInsets.symmetric(vertical: 4),
      itemCount: results.length,
      itemBuilder: (context, index) => _buildSearchResultTile(results[index], provider),
    );
  }

  Widget _buildSearchResultTile(Track track, AudioProvider provider) {
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
                  Text(track.title, style: const TextStyle(color: VKTheme.textPrimary, fontSize: 14, fontWeight: FontWeight.w500),
                      maxLines: 1, overflow: TextOverflow.ellipsis),
                  const SizedBox(height: 2),
                  Text(track.artist, style: const TextStyle(color: VKTheme.textSecondary, fontSize: 12),
                      maxLines: 1, overflow: TextOverflow.ellipsis),
                ],
              ),
            ),
            const SizedBox(width: 8),
            Text(track.formattedDuration, style: const TextStyle(color: VKTheme.textHint, fontSize: 12)),
          ],
        ),
      ),
    );
  }
}