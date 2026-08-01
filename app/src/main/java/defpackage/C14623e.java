package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14623e {
    public final Object ad;
    public final boolean license;
    public final String metrica;
    public final String vip;

    public C14623e(Object obj, String str, String str2, boolean z) {
        this.ad = obj;
        this.vip = str;
        this.metrica = str2;
        this.license = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14623e)) {
            return false;
        }
        C14623e c14623e = (C14623e) obj;
        return AbstractC7890e.billing(this.ad, c14623e.ad) && AbstractC7890e.billing(this.vip, c14623e.vip) && AbstractC7890e.billing(this.metrica, c14623e.metrica) && this.license == c14623e.license;
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
        String str = this.metrica;
        return ((advert + (str == null ? 0 : str.hashCode())) * 31) + (this.license ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(imageUrlModel=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", subtitle=");
        sb.append(this.metrica);
        sb.append(", roundImage=");
        return AbstractC1786e.isVip(sb, this.license, ')');
    }
}
