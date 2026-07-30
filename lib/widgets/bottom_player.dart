import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/audio_provider.dart' as audio_prov;
import '../models/track.dart';
import '../main.dart';

class BottomPlayer extends StatelessWidget {
  const BottomPlayer({super.key});

  @override
  Widget build(BuildContext context) {
    return Consumer<audio_prov.AudioProvider>(
      builder: (context, provider, child) {
        final track = provider.currentTrack;
        if (track == null) return _buildEmptyPlayer();
        return _buildPlayer(provider, track);
      },
    );
  }

  Widget _buildEmptyPlayer() {
    return Container(
      height: 72,
      color: VKTheme.surface,
      child: const Center(
        child: Text('Выберите трек для воспроизведения',
            style: TextStyle(color: VKTheme.textHint, fontSize: 13)),
      ),
    );
  }

  Widget _buildPlayer(audio_prov.AudioProvider provider, Track track) {
    return Container(
      height: 72,
      color: VKTheme.surface,
      child: Column(
        children: [
          _buildProgressBar(provider),
          Expanded(
            child: Padding(
              padding: const EdgeInsets.symmetric(horizontal: 12),
              child: Row(
                children: [
                  _buildTrackInfo(track),
                  const SizedBox(width: 8),
                  _buildControls(provider),
                  const SizedBox(width: 8),
                  _buildVolumeControl(provider),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildProgressBar(audio_prov.AudioProvider provider) {
    return LayoutBuilder(
      builder: (context, constraints) {
        return GestureDetector(
          onTapDown: (details) {
            provider.seek(details.localPosition.dx / constraints.maxWidth);
          },
          child: Container(
            height: 3,
            color: VKTheme.primary.withValues(alpha: 0.15),
            child: FractionallySizedBox(
              alignment: Alignment.centerLeft,
              widthFactor: provider.progress,
              child: Container(color: VKTheme.primary),
            ),
          ),
        );
      },
    );
  }

  Widget _buildTrackInfo(Track track) {
    return Expanded(
      flex: 3,
      child: Row(
        children: [
          Container(
            width: 44,
            height: 44,
            decoration: BoxDecoration(
              borderRadius: BorderRadius.circular(8),
              image: track.albumArtUrl != null
                  ? DecorationImage(image: NetworkImage(track.albumArtUrl!), fit: BoxFit.cover)
                  : null,
              color: VKTheme.primary.withValues(alpha: 0.15),
            ),
            child: track.albumArtUrl == null
                ? const Icon(Icons.music_note, color: VKTheme.primary, size: 22)
                : null,
          ),
          const SizedBox(width: 10),
          Expanded(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(track.title,
                    style: const TextStyle(color: VKTheme.textPrimary, fontSize: 14, fontWeight: FontWeight.w500),
                    maxLines: 1, overflow: TextOverflow.ellipsis),
                Text(track.artist,
                    style: const TextStyle(color: VKTheme.textSecondary, fontSize: 12),
                    maxLines: 1, overflow: TextOverflow.ellipsis),
              ],
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildControls(audio_prov.AudioProvider provider) {
    return Row(
      mainAxisSize: MainAxisSize.min,
      children: [
        IconButton(
          icon: Icon(Icons.skip_previous_rounded, color: VKTheme.textPrimary, size: 26),
          onPressed: provider.previous, padding: EdgeInsets.zero, constraints: const BoxConstraints(minWidth: 32, minHeight: 32),
        ),
        Container(
          width: 36,
          height: 36,
          decoration: const BoxDecoration(shape: BoxShape.circle, color: VKTheme.primary),
          child: IconButton(
            icon: Icon(provider.isPlaying ? Icons.pause_rounded : Icons.play_arrow_rounded, color: Colors.white, size: 22),
            onPressed: provider.playPause, padding: EdgeInsets.zero,
          ),
        ),
        IconButton(
          icon: Icon(Icons.skip_next_rounded, color: VKTheme.textPrimary, size: 26),
          onPressed: provider.next, padding: EdgeInsets.zero, constraints: const BoxConstraints(minWidth: 32, minHeight: 32),
        ),
      ],
    );
  }

  Widget _buildVolumeControl(audio_prov.AudioProvider provider) {
    return SizedBox(
      width: 60,
      child: Row(
        children: [
          Icon(provider.volume == 0 ? Icons.volume_off : Icons.volume_up, color: VKTheme.textHint, size: 16),
          Expanded(
            child: SliderTheme(
              data: SliderThemeData(
                trackHeight: 3,
                thumbShape: const RoundSliderThumbShape(enabledThumbRadius: 5),
                overlayShape: const RoundSliderOverlayShape(overlayRadius: 10),
                activeTrackColor: VKTheme.primary,
                inactiveTrackColor: VKTheme.primary.withValues(alpha: 0.15),
                thumbColor: VKTheme.primary,
              ),
              child: Slider(value: provider.volume, onChanged: provider.setVolume),
            ),
          ),
        ],
      ),
    );
  }
}