package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12225e {
    public final Csuper ad;
    public final int metrica;
    public final C9441e vip;

    public C12225e(Csuper csuper, C9441e c9441e, int i) {
        this.ad = csuper;
        this.vip = c9441e;
        this.metrica = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12225e)) {
            return false;
        }
        C12225e c12225e = (C12225e) obj;
        return AbstractC7890e.billing(this.ad, c12225e.ad) && AbstractC7890e.billing(this.vip, c12225e.vip) && this.metrica == c12225e.metrica;
    }

    public final int hashCode() {
        return ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientWithInformation(client=");
        sb.append(this.ad);
        sb.append(", device=");
        sb.append(this.vip);
        sb.append(", protocolVersion=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }
}
