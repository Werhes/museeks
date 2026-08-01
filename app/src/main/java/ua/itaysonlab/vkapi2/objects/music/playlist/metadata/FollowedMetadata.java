package ua.itaysonlab.vkapi2.objects.music.playlist.metadata;

import defpackage.AbstractC10257e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/metadata/FollowedMetadata;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FollowedMetadata {
    public final int ad;
    public final long vip;

    public FollowedMetadata(int i, long j) {
        this.ad = i;
        this.vip = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowedMetadata)) {
            return false;
        }
        FollowedMetadata followedMetadata = (FollowedMetadata) obj;
        return this.ad == followedMetadata.ad && this.vip == followedMetadata.vip;
    }

    public final int hashCode() {
        int i = this.ad * 31;
        long j = this.vip;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowedMetadata(playlist_id=");
        sb.append(this.ad);
        sb.append(", owner_id=");
        return AbstractC10257e.mopub(sb, this.vip, ')');
    }
}
