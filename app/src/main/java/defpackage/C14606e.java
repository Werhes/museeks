package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14606e {
    public final String ad;
    public final long metrica;
    public final long vip;

    public C14606e(String str, long j, long j2) {
        this.ad = str;
        this.vip = j;
        this.metrica = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14606e) {
            C14606e c14606e = (C14606e) obj;
            if (this.ad.equals(c14606e.ad) && this.vip == c14606e.vip && this.metrica == c14606e.metrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.ad.hashCode() ^ 1000003) * 1000003;
        long j = this.vip;
        long j2 = this.metrica;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.ad);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.vip);
        sb.append(", tokenCreationTimestamp=");
        return AbstractC5087e.m1750native(this.metrica, "}", sb);
    }
}
