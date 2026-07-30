import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/audio_provider.dart' as audio_prov;
import '../models/track.dart';

class BottomPlayer extends StatelessWidget {
  const BottomPlayer({super.key});

  @override
  Widget build(BuildContext context) {
    return Consumer<audio_prov.AudioProvider>(
      builder: (context, provider, child) {
        final track = provider.currentTrack;
        if (track == null) {
          return _buildEmptyPlayer(context);
        }
        return _buildPlayer(context, provider, track);
      },
    );
  }

  Widget _buildEmptyPlayer(BuildContext context) {
    return Container(
      height: 80,
      decoration: BoxDecoration(
        color: const Color(0xFF1A1B2E),
        border: Border(
          top: BorderSide(color: Colors.white.withValues(alpha: 0.05)),
        ),
      ),
      child: Center(
        child: Text(
          'Выберите трек для воспроизведения',
          style: TextStyle(
            color: Colors.white.withValues(alpha: 0.3),
            fontSize: 13,
          ),
        ),
      ),
    );
  }

  Widget _buildPlayer(
      BuildContext context, audio_prov.AudioProvider provider, Track track) {
    return Container(
      height: 80,
      decoration: BoxDecoration(
        color: const Color(0xFF1A1B2E),
        border: Border(
          top: BorderSide(color: Colors.white.withValues(alpha: 0.05)),
        ),
      ),
      child: Column(
        children: [
          // Прогресс-бар
          _buildProgressBar(context, provider),
          // Основной контент
          Expanded(
            child: Padding(
              padding: const EdgeInsets.symmetric(horizontal: 16),
              child: Row(
                children: [
                  // Обложка и информация о треке
                  _buildTrackInfo(track, provider),
                  const SizedBox(width: 16),
                  // Кнопки управления
                  _buildControls(provider),
                  const SizedBox(width: 16),
                  // Громкость
                  _buildVolumeControl(provider),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildProgressBar(BuildContext context, audio_prov.AudioProvider provider) {
    return GestureDetector(
      onTapDown: (details) {
        final width = context.size?.width ?? 1;
        final position = details.localPosition.dx / width;
        provider.seek(position);
      },
      child: Container(
        height: 4,
        color: Colors.white.withValues(alpha: 0.05),
        child: FractionallySizedBox(
          alignment: Alignment.centerLeft,
          widthFactor: provider.progress,
          child: Container(
            decoration: BoxDecoration(
              gradient: const LinearGradient(
                colors: [Color(0xFF6C5CE7), Color(0xFFA29BFE)],
              ),
              borderRadius: BorderRadius.circular(2),
            ),
          ),
        ),
      ),
    );
  }

  Widget _buildTrackInfo(Track track, audio_prov.AudioProvider provider) {
    return Expanded(
      flex: 3,
      child: Row(
        children: [
          // Обложка
          Container(
            width: 48,
            height: 48,
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
                ? const Icon(Icons.music_note, color: Color(0xFF6C5CE7), size: 24)
                : null,
          ),
          const SizedBox(width: 12),
          // Название и исполнитель
          Expanded(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
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
                    color: Colors.white.withValues(alpha: 0.5),
                    fontSize: 12,
                  ),
                  maxLines: 1,
                  overflow: TextOverflow.ellipsis,
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildControls(audio_prov.AudioProvider provider) {
    return Expanded(
      flex: 2,
      child: Row(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          // Перемешивание
          IconButton(
            icon: Icon(
              Icons.shuffle,
              color: provider.isShuffled
                  ? const Color(0xFF6C5CE7)
                  : Colors.white.withValues(alpha: 0.5),
              size: 20,
            ),
            onPressed: provider.toggleShuffle,
          ),
          // Предыдущий
          IconButton(
            icon: Icon(
              Icons.skip_previous_rounded,
              color: Colors.white.withValues(alpha: 0.8),
              size: 28,
            ),
            onPressed: provider.previous,
          ),
          // Play/Pause
          Container(
            width: 40,
            height: 40,
            decoration: const BoxDecoration(
              shape: BoxShape.circle,
              gradient: LinearGradient(
                colors: [Color(0xFF6C5CE7), Color(0xFFA29BFE)],
              ),
            ),
            child: IconButton(
              icon: Icon(
                provider.isPlaying ? Icons.pause_rounded : Icons.play_arrow_rounded,
                color: Colors.white,
                size: 24,
              ),
              onPressed: provider.playPause,
            ),
          ),
          // Следующий
          IconButton(
            icon: Icon(
              Icons.skip_next_rounded,
              color: Colors.white.withValues(alpha: 0.8),
              size: 28,
            ),
            onPressed: provider.next,
          ),
          // Повтор
          IconButton(
            icon: Icon(
              provider.repeatMode == audio_prov.RepeatMode.one
                  ? Icons.repeat_one
                  : Icons.repeat,
              color: provider.repeatMode != audio_prov.RepeatMode.none
                  ? const Color(0xFF6C5CE7)
                  : Colors.white.withValues(alpha: 0.5),
              size: 20,
            ),
            onPressed: provider.toggleRepeatMode,
          ),
        ],
      ),
    );
  }

  Widget _buildVolumeControl(audio_prov.AudioProvider provider) {
    return Expanded(
      flex: 1,
      child: Row(
        mainAxisAlignment: MainAxisAlignment.end,
        children: [
          Icon(
            provider.volume == 0
                ? Icons.volume_off
                : provider.volume < 0.5
                    ? Icons.volume_down
                    : Icons.volume_up,
            color: Colors.white.withValues(alpha: 0.5),
            size: 18,
          ),
          const SizedBox(width: 8),
          SizedBox(
            width: 80,
            child: SliderTheme(
              data: SliderThemeData(
                trackHeight: 3,
                thumbShape: const RoundSliderThumbShape(enabledThumbRadius: 6),
                overlayShape: const RoundSliderOverlayShape(overlayRadius: 12),
                activeTrackColor: const Color(0xFF6C5CE7),
                inactiveTrackColor: Colors.white.withValues(alpha: 0.1),
                thumbColor: const Color(0xFF6C5CE7),
              ),
              child: Slider(
                value: provider.volume,
                onChanged: provider.setVolume,
              ),
            ),
          ),
        ],
      ),
    );
  }
}