package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eُٔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11002e implements InterfaceC8399e {
    public static final C3030e Companion = new Object();
    public final String ad;
    public final int appmetrica;
    public final double license;
    public final double metrica;
    public final String purchase;
    public final String vip;

    public /* synthetic */ C11002e(int i, String str, String str2, double d, double d2, int i2, String str3) {
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
            this.metrica = 0.0d;
        } else {
            this.metrica = d;
        }
        if ((i & 8) == 0) {
            this.license = 0.0d;
        } else {
            this.license = d2;
        }
        if ((i & 16) == 0) {
            this.appmetrica = 0;
        } else {
            this.appmetrica = i2;
        }
        if ((i & 32) == 0) {
            this.purchase = BuildConfig.FLAVOR;
        } else {
            this.purchase = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11002e)) {
            return false;
        }
        C11002e c11002e = (C11002e) obj;
        return AbstractC7890e.billing(this.ad, c11002e.ad) && AbstractC7890e.billing(this.vip, c11002e.vip) && Double.compare(this.metrica, c11002e.metrica) == 0 && Double.compare(this.license, c11002e.license) == 0 && this.appmetrica == c11002e.appmetrica && AbstractC7890e.billing(this.purchase, c11002e.purchase);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
        long doubleToLongBits = Double.doubleToLongBits(this.metrica);
        int i = (advert + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.license);
        return this.purchase.hashCode() + ((((i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + this.appmetrica) * 31);
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("CaptchaRequired(captchaSid=", this.ad, ", captchaImg=", this.vip, ", captchaTs=");
        tapsense.append(this.metrica);
        tapsense.append(", captchaRatio=");
        tapsense.append(this.license);
        tapsense.append(", captchaAttempt=");
        tapsense.append(this.appmetrica);
        tapsense.append(", redirectUri=");
        tapsense.append(this.purchase);
        tapsense.append(")");
        return tapsense.toString();
    }
}
