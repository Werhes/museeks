package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۙٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11235e {
    public final String ad;
    public final InterfaceC10081e appmetrica;
    public final String license;
    public final String metrica;
    public final String vip;

    public C11235e(String str, String str2, String str3, String str4, InterfaceC10081e interfaceC10081e) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
        this.appmetrica = interfaceC10081e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11235e)) {
            return false;
        }
        C11235e c11235e = (C11235e) obj;
        return AbstractC7890e.billing(this.ad, c11235e.ad) && AbstractC7890e.billing(this.vip, c11235e.vip) && AbstractC7890e.billing(this.metrica, c11235e.metrica) && AbstractC7890e.billing(this.license, c11235e.license) && AbstractC7890e.billing(this.appmetrica, c11235e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica), 31, this.license);
    }

    public final String toString() {
        return "OrionCacheEntry(id=" + this.ad + ", imageUrl=" + this.vip + ", title=" + this.metrica + ", subtitle=" + this.license + ", type=" + this.appmetrica + ')';
    }
}
