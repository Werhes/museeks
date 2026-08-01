package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٛۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10375e {
    public final C1839e ad;
    public final C1839e adcel;
    public final C1839e advert;
    public final C1839e amazon;
    public final C1839e appmetrica;
    public final C1839e billing;
    public final C1839e license;
    public final C1839e loadAd;
    public final C1839e metrica;
    public final C1839e mopub;
    public final C1839e purchase;
    public final C1839e smaato;
    public final C1839e startapp;
    public final C1839e vip;
    public final C1839e yandex;

    public C10375e(C1839e c1839e, C1839e c1839e2, C1839e c1839e3, C1839e c1839e4, C1839e c1839e5, C1839e c1839e6, int i) {
        C1839e c1839e7 = AbstractC2951e.license;
        C1839e c1839e8 = AbstractC2951e.appmetrica;
        C1839e c1839e9 = AbstractC2951e.purchase;
        c1839e = (i & 8) != 0 ? AbstractC2951e.billing : c1839e;
        c1839e2 = (i & 16) != 0 ? AbstractC2951e.yandex : c1839e2;
        c1839e3 = (i & 32) != 0 ? AbstractC2951e.startapp : c1839e3;
        c1839e4 = (i & 64) != 0 ? AbstractC2951e.smaato : c1839e4;
        c1839e5 = (i & 128) != 0 ? AbstractC2951e.amazon : c1839e5;
        c1839e6 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? AbstractC2951e.loadAd : c1839e6;
        C1839e c1839e10 = AbstractC2951e.ad;
        C1839e c1839e11 = AbstractC2951e.vip;
        C1839e c1839e12 = AbstractC2951e.metrica;
        C1839e c1839e13 = AbstractC2951e.adcel;
        C1839e c1839e14 = AbstractC2951e.mopub;
        C1839e c1839e15 = AbstractC2951e.advert;
        this.ad = c1839e7;
        this.vip = c1839e8;
        this.metrica = c1839e9;
        this.license = c1839e;
        this.appmetrica = c1839e2;
        this.purchase = c1839e3;
        this.billing = c1839e4;
        this.yandex = c1839e5;
        this.startapp = c1839e6;
        this.adcel = c1839e10;
        this.mopub = c1839e11;
        this.advert = c1839e12;
        this.smaato = c1839e13;
        this.amazon = c1839e14;
        this.loadAd = c1839e15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10375e)) {
            return false;
        }
        C10375e c10375e = (C10375e) obj;
        return AbstractC7890e.billing(this.ad, c10375e.ad) && AbstractC7890e.billing(this.vip, c10375e.vip) && AbstractC7890e.billing(this.metrica, c10375e.metrica) && AbstractC7890e.billing(this.license, c10375e.license) && AbstractC7890e.billing(this.appmetrica, c10375e.appmetrica) && AbstractC7890e.billing(this.purchase, c10375e.purchase) && AbstractC7890e.billing(this.billing, c10375e.billing) && AbstractC7890e.billing(this.yandex, c10375e.yandex) && AbstractC7890e.billing(this.startapp, c10375e.startapp) && AbstractC7890e.billing(this.adcel, c10375e.adcel) && AbstractC7890e.billing(this.mopub, c10375e.mopub) && AbstractC7890e.billing(this.advert, c10375e.advert) && AbstractC7890e.billing(this.smaato, c10375e.smaato) && AbstractC7890e.billing(this.amazon, c10375e.amazon) && AbstractC7890e.billing(this.loadAd, c10375e.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + AbstractC1786e.smaato(this.amazon, AbstractC1786e.smaato(this.smaato, AbstractC1786e.smaato(this.advert, AbstractC1786e.smaato(this.mopub, AbstractC1786e.smaato(this.adcel, AbstractC1786e.smaato(this.startapp, AbstractC1786e.smaato(this.yandex, AbstractC1786e.smaato(this.billing, AbstractC1786e.smaato(this.purchase, AbstractC1786e.smaato(this.appmetrica, AbstractC1786e.smaato(this.license, AbstractC1786e.smaato(this.metrica, AbstractC1786e.smaato(this.vip, this.ad.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.ad + ", displayMedium=" + this.vip + ",displaySmall=" + this.metrica + ", headlineLarge=" + this.license + ", headlineMedium=" + this.appmetrica + ", headlineSmall=" + this.purchase + ", titleLarge=" + this.billing + ", titleMedium=" + this.yandex + ", titleSmall=" + this.startapp + ", bodyLarge=" + this.adcel + ", bodyMedium=" + this.mopub + ", bodySmall=" + this.advert + ", labelLarge=" + this.smaato + ", labelMedium=" + this.amazon + ", labelSmall=" + this.loadAd + ')';
    }
}
