package ua.itaysonlab.vkapi2.methods.audio.playlist;

import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/vkapi2/methods/audio/playlist/AudioCreatePlaylist$NewPlaylistResponse", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioCreatePlaylist$NewPlaylistResponse {
    public final AudioPlaylist ad;
    public final VKProfile vip;

    public AudioCreatePlaylist$NewPlaylistResponse(AudioPlaylist audioPlaylist, VKProfile vKProfile) {
        this.ad = audioPlaylist;
        this.vip = vKProfile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCreatePlaylist$NewPlaylistResponse)) {
            return false;
        }
        AudioCreatePlaylist$NewPlaylistResponse audioCreatePlaylist$NewPlaylistResponse = (AudioCreatePlaylist$NewPlaylistResponse) obj;
        return AbstractC7890e.billing(this.ad, audioCreatePlaylist$NewPlaylistResponse.ad) && AbstractC7890e.billing(this.vip, audioCreatePlaylist$NewPlaylistResponse.vip);
    }

    public final int hashCode() {
        AudioPlaylist audioPlaylist = this.ad;
        int hashCode = (audioPlaylist == null ? 0 : audioPlaylist.hashCode()) * 31;
        VKProfile vKProfile = this.vip;
        return hashCode + (vKProfile != null ? vKProfile.hashCode() : 0);
    }

    public final String toString() {
        return "NewPlaylistResponse(playlist=" + this.ad + ", user=" + this.vip + ')';
    }
}
