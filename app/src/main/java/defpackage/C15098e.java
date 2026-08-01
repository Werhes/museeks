package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٔۦ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15098e {
    public static final C15303e Companion = new Object();
    public final String ad;
    public final String appmetrica;
    public final String billing;
    public final String license;
    public final String metrica;
    public final String purchase;
    public final String vip;
    public final String yandex;

    public /* synthetic */ C15098e(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = str;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str2;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str3;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = str4;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = str5;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str6;
        }
        if ((i & 64) == 0) {
            this.billing = null;
        } else {
            this.billing = str7;
        }
        if ((i & 128) == 0) {
            this.yandex = null;
        } else {
            this.yandex = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15098e)) {
            return false;
        }
        C15098e c15098e = (C15098e) obj;
        return AbstractC7890e.billing(this.ad, c15098e.ad) && AbstractC7890e.billing(this.vip, c15098e.vip) && AbstractC7890e.billing(this.metrica, c15098e.metrica) && AbstractC7890e.billing(this.license, c15098e.license) && AbstractC7890e.billing(this.appmetrica, c15098e.appmetrica) && AbstractC7890e.billing(this.purchase, c15098e.purchase) && AbstractC7890e.billing(this.billing, c15098e.billing) && AbstractC7890e.billing(this.yandex, c15098e.yandex);
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vip;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.metrica;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.license;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appmetrica;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.purchase;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.billing;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.yandex;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("AuthCodeAuthDeviceInfoDto(browserName=", this.ad, ", browserPackage=", this.vip, ", browserPageLink=");
        AbstractC13501e.Signature(tapsense, this.metrica, ", browserUrlScheme=", this.license, ", ip=");
        AbstractC13501e.Signature(tapsense, this.appmetrica, ", location=", this.purchase, ", locationMap=");
        return AbstractC4653e.ads(tapsense, this.billing, ", name=", this.yandex, ")");
    }
}
