package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3197e implements InterfaceC0822e {
    public final String ad;
    public final String metrica;
    public final int vip;

    public C3197e(String str, int i, String str2) {
        this.ad = str;
        this.vip = i;
        this.metrica = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3197e)) {
            return false;
        }
        C3197e c3197e = (C3197e) obj;
        return AbstractC7890e.billing(this.ad, c3197e.ad) && this.vip == c3197e.vip && AbstractC7890e.billing(this.metrica, c3197e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (((this.ad.hashCode() * 31) + this.vip) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Present(uid=");
        sb.append(this.ad);
        sb.append(", size=");
        sb.append(this.vip);
        sb.append(", name=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
