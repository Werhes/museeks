package ua.itaysonlab.vkapi2.objects.music.playlist.metadata;

import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/metadata/OriginalPlaylist;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OriginalPlaylist {
    public final long ad;
    public final String metrica;
    public final int vip;

    public OriginalPlaylist(long j, int i, String str) {
        this.ad = j;
        this.vip = i;
        this.metrica = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginalPlaylist)) {
            return false;
        }
        OriginalPlaylist originalPlaylist = (OriginalPlaylist) obj;
        return this.ad == originalPlaylist.ad && this.vip == originalPlaylist.vip && AbstractC7890e.billing(this.metrica, originalPlaylist.metrica);
    }

    public final int hashCode() {
        long j = this.ad;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + this.vip) * 31;
        String str = this.metrica;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OriginalPlaylist(owner_id=");
        sb.append(this.ad);
        sb.append(", playlist_id=");
        sb.append(this.vip);
        sb.append(", access_key=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
