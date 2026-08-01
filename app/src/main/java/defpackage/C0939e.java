package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939e {
    public final String ad;
    public final boolean appmetrica;
    public final Boolean billing;
    public final String license;
    public final String metrica;
    public final Boolean purchase;
    public final String vip;

    public C0939e(String str, String str2, String str3, String str4, boolean z, Boolean bool, Boolean bool2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
        this.appmetrica = z;
        this.purchase = bool;
        this.billing = bool2;
    }

    public static C0939e ad(C0939e c0939e, Boolean bool, Boolean bool2, int i) {
        String str = c0939e.ad;
        String str2 = c0939e.vip;
        String str3 = c0939e.metrica;
        String str4 = c0939e.license;
        boolean z = c0939e.appmetrica;
        if ((i & 32) != 0) {
            bool = c0939e.purchase;
        }
        Boolean bool3 = bool;
        if ((i & 64) != 0) {
            bool2 = c0939e.billing;
        }
        c0939e.getClass();
        return new C0939e(str, str2, str3, str4, z, bool3, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0939e)) {
            return false;
        }
        C0939e c0939e = (C0939e) obj;
        return AbstractC7890e.billing(this.ad, c0939e.ad) && AbstractC7890e.billing(this.vip, c0939e.vip) && AbstractC7890e.billing(this.metrica, c0939e.metrica) && AbstractC7890e.billing(this.license, c0939e.license) && this.appmetrica == c0939e.appmetrica && AbstractC7890e.billing(this.purchase, c0939e.purchase) && AbstractC7890e.billing(this.billing, c0939e.billing);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
        String str = this.metrica;
        int advert2 = (AbstractC1786e.advert((advert + (str == null ? 0 : str.hashCode())) * 31, 31, this.license) + (this.appmetrica ? 1231 : 1237)) * 31;
        Boolean bool = this.purchase;
        int hashCode = (advert2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.billing;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "TrackMetadata(id=" + this.ad + ", title=" + this.vip + ", subtitle=" + this.metrica + ", artist=" + this.license + ", isExplicit=" + this.appmetrica + ", liked=" + this.purchase + ", disliked=" + this.billing + ')';
    }
}
