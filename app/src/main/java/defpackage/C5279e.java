package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۦؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5279e {
    public final String ad;
    public final long metrica;
    public final int vip;

    public C5279e(long j, int i, String str) {
        this.ad = str;
        this.vip = i;
        this.metrica = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5279e)) {
            return false;
        }
        C5279e c5279e = (C5279e) obj;
        return AbstractC7890e.billing(this.ad, c5279e.ad) && this.vip == c5279e.vip && this.metrica == c5279e.metrica;
    }

    public final int hashCode() {
        int hashCode = ((this.ad.hashCode() * 31) + this.vip) * 31;
        long j = this.metrica;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpServerSettings(host=");
        sb.append(this.ad);
        sb.append(", port=");
        sb.append(this.vip);
        sb.append(", connectionIdleTimeoutSeconds=");
        return AbstractC5087e.m1750native(this.metrica, ", reuseAddress=false)", sb);
    }
}
