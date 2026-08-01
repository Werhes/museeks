package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioLyricTimestamp;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioLyricTimestamp {
    public final long ad;
    public final boolean license;
    public final String metrica;
    public final long vip;

    public AudioLyricTimestamp(long j, long j2, String str, boolean z) {
        this.ad = j;
        this.vip = j2;
        this.metrica = str;
        this.license = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioLyricTimestamp)) {
            return false;
        }
        AudioLyricTimestamp audioLyricTimestamp = (AudioLyricTimestamp) obj;
        return this.ad == audioLyricTimestamp.ad && this.vip == audioLyricTimestamp.vip && AbstractC7890e.billing(this.metrica, audioLyricTimestamp.metrica) && this.license == audioLyricTimestamp.license;
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        return AbstractC1786e.advert(((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.metrica) + (this.license ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioLyricTimestamp(begin=");
        sb.append(this.ad);
        sb.append(", end=");
        sb.append(this.vip);
        sb.append(", line=");
        sb.append(this.metrica);
        sb.append(", interlude=");
        return AbstractC1786e.isVip(sb, this.license, ')');
    }
}
