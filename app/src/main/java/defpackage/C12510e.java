package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12510e {
    public final String ad;
    public final String appmetrica;
    public final String license;
    public final String metrica;
    public final String vip;

    public C12510e(String str, String str2, String str3, String str4, String str5) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
        this.appmetrica = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12510e)) {
            return false;
        }
        C12510e c12510e = (C12510e) obj;
        return AbstractC7890e.billing(this.ad, c12510e.ad) && AbstractC7890e.billing(this.vip, c12510e.vip) && AbstractC7890e.billing(this.metrica, c12510e.metrica) && AbstractC7890e.billing(this.license, c12510e.license) && AbstractC7890e.billing(this.appmetrica, c12510e.appmetrica);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica);
        String str = this.license;
        int hashCode = (advert + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appmetrica;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnippetTrack(id=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", artist=");
        sb.append(this.metrica);
        sb.append(", coverUrl=");
        sb.append(this.license);
        sb.append(", url=");
        return AbstractC4653e.applovin(sb, this.appmetrica, ')');
    }
}
