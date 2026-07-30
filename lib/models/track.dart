class Track {
  final int id;
  final int ownerId;
  final String title;
  final String artist;
  final int duration;
  final String? albumArtUrl;
  final String? audioUrl;
  final String? albumTitle;
  final bool isAvailable;

  Track({
    required this.id,
    required this.ownerId,
    required this.title,
    required this.artist,
    required this.duration,
    this.albumArtUrl,
    this.audioUrl,
    this.albumTitle,
    this.isAvailable = true,
  });

  factory Track.fromJson(Map<String, dynamic> json) {
    return Track(
      id: json['id'] as int,
      ownerId: json['owner_id'] as int,
      title: json['title'] as String? ?? 'Unknown',
      artist: json['artist'] as String? ?? 'Unknown',
      duration: json['duration'] as int? ?? 0,
      albumArtUrl: json['album']?['thumb']?['photo_600'] as String? ??
          json['album']?['thumb']?['photo_300'] as String? ??
          json['album']?['thumb']?['photo_120'] as String?,
      audioUrl: json['url'] as String?,
      albumTitle: json['album']?['title'] as String?,
      isAvailable: json['is_available'] as bool? ?? true,
    );
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'owner_id': ownerId,
      'title': title,
      'artist': artist,
      'duration': duration,
      'album_art_url': albumArtUrl,
      'audio_url': audioUrl,
      'album_title': albumTitle,
      'is_available': isAvailable,
    };
  }

  String get formattedDuration {
    final minutes = duration ~/ 60;
    final seconds = duration % 60;
    return '$minutes:${seconds.toString().padLeft(2, '0')}';
  }

  String get fullId => '${ownerId}_$id';

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is Track &&
          runtimeType == other.runtimeType &&
          id == other.id &&
          ownerId == other.ownerId;

  @override
  int get hashCode => id.hashCode ^ ownerId.hashCode;
}

class Playlist {
  final int id;
  final int ownerId;
  final String title;
  final String? description;
  final String? photoUrl;
  final int trackCount;
  final List<Track>? tracks;

  Playlist({
    required this.id,
    required this.ownerId,
    required this.title,
    this.description,
    this.photoUrl,
    this.trackCount = 0,
    this.tracks,
  });

  factory Playlist.fromJson(Map<String, dynamic> json) {
    return Playlist(
      id: json['id'] as int,
      ownerId: json['owner_id'] as int,
      title: json['title'] as String? ?? 'Unknown',
      description: json['description'] as String?,
      photoUrl: json['photo']?['photo_600'] as String? ??
          json['photo']?['photo_300'] as String?,
      trackCount: json['count'] as int? ?? 0,
      tracks: (json['tracks'] as List<dynamic>?)
          ?.map((t) => Track.fromJson(t as Map<String, dynamic>))
          .toList(),
    );
  }
}

class VKUser {
  final int id;
  final String firstName;
  final String lastName;
  final String? photoUrl;

  VKUser({
    required this.id,
    required this.firstName,
    required this.lastName,
    this.photoUrl,
  });

  factory VKUser.fromJson(Map<String, dynamic> json) {
    return VKUser(
      id: json['id'] as int,
      firstName: json['first_name'] as String? ?? '',
      lastName: json['last_name'] as String? ?? '',
      photoUrl: json['photo_200'] as String? ??
          json['photo_100'] as String?,
    );
  }

  String get fullName => '$firstName $lastName';
}