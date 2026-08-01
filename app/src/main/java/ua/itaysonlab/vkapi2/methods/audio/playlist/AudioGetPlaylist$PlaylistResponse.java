package ua.itaysonlab.vkapi2.methods.audio.playlist;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/vkapi2/methods/audio/playlist/AudioGetPlaylist$PlaylistResponse", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioGetPlaylist$PlaylistResponse {
    public final VKProfile ad;
    public final List metrica;
    public final AudioPlaylist vip;

    public AudioGetPlaylist$PlaylistResponse(VKProfile vKProfile, AudioPlaylist audioPlaylist, List list) {
        this.ad = vKProfile;
        this.vip = audioPlaylist;
        this.metrica = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGetPlaylist$PlaylistResponse)) {
            return false;
        }
        AudioGetPlaylist$PlaylistResponse audioGetPlaylist$PlaylistResponse = (AudioGetPlaylist$PlaylistResponse) obj;
        return AbstractC7890e.billing(this.ad, audioGetPlaylist$PlaylistResponse.ad) && AbstractC7890e.billing(this.vip, audioGetPlaylist$PlaylistResponse.vip) && AbstractC7890e.billing(this.metrica, audioGetPlaylist$PlaylistResponse.metrica);
    }

    public final int hashCode() {
        VKProfile vKProfile = this.ad;
        int hashCode = (vKProfile == null ? 0 : vKProfile.hashCode()) * 31;
        AudioPlaylist audioPlaylist = this.vip;
        return this.metrica.hashCode() + ((hashCode + (audioPlaylist != null ? audioPlaylist.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistResponse(owner=");
        sb.append(this.ad);
        sb.append(", playlist=");
        sb.append(this.vip);
        sb.append(", audios=");
        return AbstractC1786e.tapsense(sb, this.metrica, ')');
    }
}
