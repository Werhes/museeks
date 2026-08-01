package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC17861e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioLyrics;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioLyrics {
    public final List ad;
    public final String metrica;
    public final List vip;

    public AudioLyrics(List list, List list2, String str) {
        this.ad = list;
        this.vip = list2;
        this.metrica = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioLyrics)) {
            return false;
        }
        AudioLyrics audioLyrics = (AudioLyrics) obj;
        return AbstractC7890e.billing(this.ad, audioLyrics.ad) && AbstractC7890e.billing(this.vip, audioLyrics.vip) && AbstractC7890e.billing(this.metrica, audioLyrics.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC17861e.billing(this.ad.hashCode() * 31, 31, this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioLyrics(timestamps=");
        sb.append(this.ad);
        sb.append(", text=");
        sb.append(this.vip);
        sb.append(", language=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
