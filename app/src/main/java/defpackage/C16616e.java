package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۤۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16616e {
    public final String ad;
    public final int metrica;
    public final String vip;

    public C16616e(String str, int i, String str2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16616e)) {
            return false;
        }
        C16616e c16616e = (C16616e) obj;
        return AbstractC7890e.billing(this.ad, c16616e.ad) && this.vip.equals(c16616e.vip) && this.metrica == c16616e.metrica;
    }

    public final int hashCode() {
        return AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NextDockItem(id=");
        sb.append(this.ad);
        sb.append(", text=");
        sb.append(this.vip);
        sb.append(", iconRes=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }
}
