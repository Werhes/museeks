package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11048e {
    public final long ad;
    public final String metrica;
    public final String vip;

    public C11048e(long j, String str, String str2) {
        this.ad = j;
        this.vip = str;
        this.metrica = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11048e)) {
            return false;
        }
        C11048e c11048e = (C11048e) obj;
        return this.ad == c11048e.ad && AbstractC7890e.billing(this.vip, c11048e.vip) && AbstractC7890e.billing(this.metrica, c11048e.metrica);
    }

    public final int hashCode() {
        long j = this.ad;
        return this.metrica.hashCode() + AbstractC1786e.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Preview(id=");
        sb.append(this.ad);
        sb.append(", displayName=");
        sb.append(this.vip);
        return AbstractC8647e.ads(sb, ", avatar=", this.metrica, ")");
    }
}
