package ua.itaysonlab.vkapi2.methods.audio.playlist;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/vkapi2/methods/audio/playlist/AudioAddAudiosToPlaylist$UpdatedPlaylistResponse", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioAddAudiosToPlaylist$UpdatedPlaylistResponse {
    public final List ad;
    public final List vip;

    public AudioAddAudiosToPlaylist$UpdatedPlaylistResponse(List list, List list2) {
        this.ad = list;
        this.vip = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAddAudiosToPlaylist$UpdatedPlaylistResponse)) {
            return false;
        }
        AudioAddAudiosToPlaylist$UpdatedPlaylistResponse audioAddAudiosToPlaylist$UpdatedPlaylistResponse = (AudioAddAudiosToPlaylist$UpdatedPlaylistResponse) obj;
        return AbstractC7890e.billing(this.ad, audioAddAudiosToPlaylist$UpdatedPlaylistResponse.ad) && AbstractC7890e.billing(this.vip, audioAddAudiosToPlaylist$UpdatedPlaylistResponse.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdatedPlaylistResponse(added_audio_ids=");
        sb.append(this.ad);
        sb.append(", added_audios=");
        return AbstractC1786e.tapsense(sb, this.vip, ')');
    }
}
