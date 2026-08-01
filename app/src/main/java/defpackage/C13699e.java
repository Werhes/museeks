package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؑٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13699e {
    public final C4641e ad;
    public final boolean appmetrica;
    public final int license;
    public final double metrica;
    public final int purchase;
    public final C4641e vip;

    public C13699e(C4641e c4641e, C4641e c4641e2, double d, int i, boolean z, int i2, int i3) {
        z = (i3 & 16) != 0 ? true : z;
        i2 = (i3 & 32) != 0 ? 1 : i2;
        this.ad = c4641e;
        this.vip = c4641e2;
        this.metrica = d;
        this.license = i;
        this.appmetrica = z;
        this.purchase = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13699e)) {
            return false;
        }
        C13699e c13699e = (C13699e) obj;
        return AbstractC7890e.billing(this.ad, c13699e.ad) && AbstractC7890e.billing(this.vip, c13699e.vip) && Double.compare(this.metrica, c13699e.metrica) == 0 && this.license == c13699e.license && this.appmetrica == c13699e.appmetrica && this.purchase == c13699e.purchase;
    }

    public final int hashCode() {
        int hashCode = (this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.metrica);
        return AbstractC8703e.m2467class(this.purchase) + ((AbstractC1786e.mopub(this.license, (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31, 31) + (this.appmetrica ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ToneDeltaPair(roleA=");
        sb.append(this.ad);
        sb.append(", roleB=");
        sb.append(this.vip);
        sb.append(", delta=");
        sb.append(this.metrica);
        sb.append(", polarity=");
        switch (this.license) {
            case 1:
                str = "DARKER";
                break;
            case 2:
                str = "LIGHTER";
                break;
            case 3:
                str = "RELATIVE_DARKER";
                break;
            case 4:
                str = "RELATIVE_LIGHTER";
                break;
            case 5:
                str = "NEARER";
                break;
            case 6:
                str = "FARTHER";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", stayTogether=");
        sb.append(this.appmetrica);
        sb.append(", deltaConstraint=");
        int i = this.purchase;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "FARTHER" : "NEARER" : "EXACT");
        sb.append(")");
        return sb.toString();
    }
}
