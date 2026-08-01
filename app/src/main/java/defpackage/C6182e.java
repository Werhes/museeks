package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6182e {
    public final C0676e ad;

    public C6182e(C0676e c0676e) {
        this.ad = c0676e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6182e)) {
            return false;
        }
        C0676e c0676e = this.ad;
        C10566e c10566e = c0676e.ad;
        C0676e c0676e2 = ((C6182e) obj).ad;
        return AbstractC7890e.billing(c10566e, c0676e2.ad) && c0676e.vip.license(c0676e2.vip) && AbstractC7890e.billing(c0676e.metrica, c0676e2.metrica) && c0676e.license == c0676e2.license && c0676e.appmetrica == c0676e2.appmetrica && c0676e.purchase == c0676e2.purchase && AbstractC7890e.billing(c0676e.billing, c0676e2.billing) && c0676e.yandex == c0676e2.yandex && c0676e.startapp == c0676e2.startapp && C5602e.vip(c0676e.adcel, c0676e2.adcel);
    }

    public final int hashCode() {
        C0676e c0676e = this.ad;
        int hashCode = c0676e.ad.hashCode() * 31;
        C1839e c1839e = c0676e.vip;
        C4282e c4282e = c1839e.ad;
        int license = C12973e.license(c4282e.vip) * 31;
        C1812e c1812e = c4282e.metrica;
        int i = (license + (c1812e != null ? c1812e.f4894e : 0)) * 31;
        C6277e c6277e = c4282e.license;
        int i2 = (i + (c6277e != null ? c6277e.ad : 0)) * 31;
        C5208e c5208e = c4282e.appmetrica;
        int i3 = (i2 + (c5208e != null ? c5208e.ad : 0)) * 31;
        AbstractC16845e abstractC16845e = c4282e.purchase;
        int hashCode2 = (i3 + (abstractC16845e != null ? abstractC16845e.hashCode() : 0)) * 31;
        String str = c4282e.billing;
        int license2 = (C12973e.license(c4282e.yandex) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        C8065e c8065e = c4282e.startapp;
        int floatToIntBits = (license2 + (c8065e != null ? Float.floatToIntBits(c8065e.ad) : 0)) * 31;
        C3759e c3759e = c4282e.adcel;
        int hashCode3 = (floatToIntBits + (c3759e != null ? c3759e.hashCode() : 0)) * 31;
        C4622e c4622e = c4282e.mopub;
        int hashCode4 = (hashCode3 + (c4622e != null ? c4622e.f9951e.hashCode() : 0)) * 31;
        long j = c4282e.advert;
        int i4 = C3618e.mopub;
        int m1744class = AbstractC5087e.m1744class(hashCode4, j, 31);
        C4521e c4521e = c4282e.loadAd;
        int hashCode5 = (c1839e.vip.hashCode() + ((m1744class + (c4521e != null ? c4521e.hashCode() : 0)) * 31)) * 31;
        C0965e c0965e = c1839e.metrica;
        int hashCode6 = (c0676e.startapp.hashCode() + ((c0676e.yandex.hashCode() + ((c0676e.billing.hashCode() + ((((((AbstractC17861e.billing((hashCode5 + (c0965e != null ? c0965e.hashCode() : 0) + hashCode) * 31, 31, c0676e.metrica) + c0676e.license) * 31) + (c0676e.appmetrica ? 1231 : 1237)) * 31) + c0676e.purchase) * 31)) * 31)) * 31)) * 31;
        long j2 = c0676e.adcel;
        return ((int) (j2 ^ (j2 >>> 32))) + hashCode6;
    }
}
