package ua.itaysonlab.vkapi2.objects.music.playlist.metadata;

import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/metadata/AudioPlaylistMeta;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioPlaylistMeta {
    public final String ad;

    public AudioPlaylistMeta(String str) {
        this.ad = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioPlaylistMeta) && AbstractC7890e.billing(this.ad, ((AudioPlaylistMeta) obj).ad);
    }

    public final int hashCode() {
        String str = this.ad;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("AudioPlaylistMeta(view="), this.ad, ')');
    }
}
