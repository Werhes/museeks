package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؓۗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2035e {
    public static final C7112e Companion = new Object();
    public static final InterfaceC3477e[] yandex = {null, null, null, null, null, null, AbstractC18039e.appmetrica(2, new C14561e(1))};
    public final String ad;
    public final String appmetrica;
    public final List billing;
    public final String license;
    public final String metrica;
    public final String purchase;
    public final String vip;

    public /* synthetic */ C2035e(int i, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        if ((i & 1) == 0) {
            this.ad = BuildConfig.FLAVOR;
        } else {
            this.ad = str;
        }
        if ((i & 2) == 0) {
            this.vip = BuildConfig.FLAVOR;
        } else {
            this.vip = str2;
        }
        if ((i & 4) == 0) {
            this.metrica = BuildConfig.FLAVOR;
        } else {
            this.metrica = str3;
        }
        if ((i & 8) == 0) {
            this.license = BuildConfig.FLAVOR;
        } else {
            this.license = str4;
        }
        if ((i & 16) == 0) {
            this.appmetrica = BuildConfig.FLAVOR;
        } else {
            this.appmetrica = str5;
        }
        if ((i & 32) == 0) {
            this.purchase = BuildConfig.FLAVOR;
        } else {
            this.purchase = str6;
        }
        if ((i & 64) == 0) {
            this.billing = C13664e.f27089e;
        } else {
            this.billing = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2035e)) {
            return false;
        }
        C2035e c2035e = (C2035e) obj;
        return AbstractC7890e.billing(this.ad, c2035e.ad) && AbstractC7890e.billing(this.vip, c2035e.vip) && AbstractC7890e.billing(this.metrica, c2035e.metrica) && AbstractC7890e.billing(this.license, c2035e.license) && AbstractC7890e.billing(this.appmetrica, c2035e.appmetrica) && AbstractC7890e.billing(this.purchase, c2035e.purchase) && AbstractC7890e.billing(this.billing, c2035e.billing);
    }

    public final int hashCode() {
        return this.billing.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica), 31, this.license), 31, this.appmetrica), 31, this.purchase);
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("Value(title=", this.ad, ", subtitle=", this.vip, ", caption=");
        AbstractC13501e.Signature(tapsense, this.metrica, ", name=", this.license, ", value=");
        AbstractC13501e.Signature(tapsense, this.appmetrica, ", photoUrl=", this.purchase, ", photoUrls=");
        tapsense.append(this.billing);
        tapsense.append(")");
        return tapsense.toString();
    }
}
