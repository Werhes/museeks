package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۖۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16427e {
    public final String ad;
    public final boolean adcel;
    public final boolean advert;
    public final String appmetrica;
    public final long billing;
    public final int license;
    public final int metrica;
    public final boolean mopub;
    public final String purchase;
    public final boolean smaato;
    public final boolean startapp;
    public final String vip;
    public final int yandex;

    public C16427e(String str, String str2, int i, int i2, String str3, String str4, long j, int i3) {
        this.ad = str;
        this.vip = str2;
        this.metrica = i;
        this.license = i2;
        this.appmetrica = str3;
        this.purchase = str4;
        this.billing = j;
        this.yandex = i3;
        this.startapp = (i3 & 1) != 0;
        this.adcel = (i3 & 2) != 0;
        this.mopub = (i3 & 4) != 0;
        this.advert = (i3 & 8) != 0;
        this.smaato = i == 10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16427e)) {
            return false;
        }
        C16427e c16427e = (C16427e) obj;
        return this.ad.equals(c16427e.ad) && this.vip.equals(c16427e.vip) && this.metrica == c16427e.metrica && this.license == c16427e.license && this.appmetrica.equals(c16427e.appmetrica) && this.purchase.equals(c16427e.purchase) && this.billing == c16427e.billing && this.yandex == c16427e.yandex;
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.mopub(this.license, AbstractC1786e.mopub(this.metrica, AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31), 31), 31, this.appmetrica), 31, this.purchase);
        long j = this.billing;
        return ((((int) (j ^ (j >>> 32))) + advert) * 31) + this.yandex;
    }

    public final String toString() {
        String mopub = AbstractC1634e.mopub(this.billing, "PropertyKey(key=", ")");
        StringBuilder tapsense = AbstractC17861e.tapsense("PropertyInfo(name=", this.ad, ", publicName=", this.vip, ", type=");
        tapsense.append(AbstractC1634e.applovin(this.metrica));
        tapsense.append(", collectionType=");
        tapsense.append(AbstractC13501e.applovin(this.license));
        tapsense.append(", linkTarget=");
        AbstractC13501e.Signature(tapsense, this.appmetrica, ", linkOriginPropertyName=", this.purchase, ", key=");
        tapsense.append(mopub);
        tapsense.append(", flags=");
        tapsense.append(this.yandex);
        tapsense.append(")");
        return tapsense.toString();
    }
}
