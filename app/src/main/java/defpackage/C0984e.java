package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0984e {
    public final C1839e Signature;
    public final C1839e ad;
    public final C1839e adcel;
    public final C1839e admob;
    public final C1839e ads;
    public final C1839e advert;
    public final C1839e amazon;
    public final C1839e applovin;
    public final C1839e appmetrica;
    public final C1839e billing;
    public final C1839e crashlytics;
    public final C1839e inmobi;
    public final C1839e isPro;
    public final C1839e isVip;
    public final C1839e license;
    public final C1839e loadAd;
    public final C1839e metrica;
    public final C1839e mopub;
    public final C1839e premium;
    public final C1839e pro;
    public final C1839e purchase;
    public final C1839e remoteconfig;
    public final C1839e signatures;
    public final C1839e smaato;
    public final C1839e startapp;
    public final C1839e subs;
    public final C1839e subscription;
    public final C1839e tapsense;
    public final C1839e vip;
    public final C1839e yandex;

    public C0984e(C1839e c1839e, C1839e c1839e2, C1839e c1839e3, C1839e c1839e4, C1839e c1839e5, C1839e c1839e6, C1839e c1839e7, C1839e c1839e8, C1839e c1839e9, int i) {
        c1839e = (i & 1) != 0 ? AbstractC16475e.ad.license : c1839e;
        c1839e2 = (i & 2) != 0 ? AbstractC16475e.ad.appmetrica : c1839e2;
        c1839e3 = (i & 4) != 0 ? AbstractC16475e.ad.purchase : c1839e3;
        c1839e4 = (i & 8) != 0 ? AbstractC16475e.ad.billing : c1839e4;
        c1839e5 = (i & 16) != 0 ? AbstractC16475e.ad.yandex : c1839e5;
        c1839e6 = (i & 32) != 0 ? AbstractC16475e.ad.startapp : c1839e6;
        c1839e7 = (i & 64) != 0 ? AbstractC16475e.ad.smaato : c1839e7;
        c1839e8 = (i & 128) != 0 ? AbstractC16475e.ad.amazon : c1839e8;
        c1839e9 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? AbstractC16475e.ad.loadAd : c1839e9;
        C0303e c0303e = AbstractC16475e.ad;
        C1839e c1839e10 = c0303e.ad;
        C1839e c1839e11 = c0303e.vip;
        C1839e c1839e12 = c0303e.metrica;
        C1839e c1839e13 = c0303e.adcel;
        C1839e c1839e14 = c0303e.mopub;
        C1839e c1839e15 = c0303e.advert;
        this.ad = c1839e;
        this.vip = c1839e2;
        this.metrica = c1839e3;
        this.license = c1839e4;
        this.appmetrica = c1839e5;
        this.purchase = c1839e6;
        this.billing = c1839e7;
        this.yandex = c1839e8;
        this.startapp = c1839e9;
        this.adcel = c1839e10;
        this.mopub = c1839e11;
        this.advert = c1839e12;
        this.smaato = c1839e13;
        this.amazon = c1839e14;
        this.loadAd = c1839e15;
        this.Signature = c1839e;
        this.admob = c1839e2;
        this.subscription = c1839e3;
        this.remoteconfig = c1839e4;
        this.pro = c1839e5;
        this.signatures = c1839e6;
        this.tapsense = c1839e7;
        this.isVip = c1839e8;
        this.inmobi = c1839e9;
        this.isPro = c1839e10;
        this.applovin = c1839e11;
        this.ads = c1839e12;
        this.premium = c1839e13;
        this.subs = c1839e14;
        this.crashlytics = c1839e15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0984e)) {
            return false;
        }
        C0984e c0984e = (C0984e) obj;
        return AbstractC7890e.billing(this.ad, c0984e.ad) && AbstractC7890e.billing(this.vip, c0984e.vip) && AbstractC7890e.billing(this.metrica, c0984e.metrica) && AbstractC7890e.billing(this.license, c0984e.license) && AbstractC7890e.billing(this.appmetrica, c0984e.appmetrica) && AbstractC7890e.billing(this.purchase, c0984e.purchase) && AbstractC7890e.billing(this.billing, c0984e.billing) && AbstractC7890e.billing(this.yandex, c0984e.yandex) && AbstractC7890e.billing(this.startapp, c0984e.startapp) && AbstractC7890e.billing(this.adcel, c0984e.adcel) && AbstractC7890e.billing(this.mopub, c0984e.mopub) && AbstractC7890e.billing(this.advert, c0984e.advert) && AbstractC7890e.billing(this.smaato, c0984e.smaato) && AbstractC7890e.billing(this.amazon, c0984e.amazon) && AbstractC7890e.billing(this.loadAd, c0984e.loadAd) && AbstractC7890e.billing(this.Signature, c0984e.Signature) && AbstractC7890e.billing(this.admob, c0984e.admob) && AbstractC7890e.billing(this.subscription, c0984e.subscription) && AbstractC7890e.billing(this.remoteconfig, c0984e.remoteconfig) && AbstractC7890e.billing(this.pro, c0984e.pro) && AbstractC7890e.billing(this.signatures, c0984e.signatures) && AbstractC7890e.billing(this.tapsense, c0984e.tapsense) && AbstractC7890e.billing(this.isVip, c0984e.isVip) && AbstractC7890e.billing(this.inmobi, c0984e.inmobi) && AbstractC7890e.billing(this.isPro, c0984e.isPro) && AbstractC7890e.billing(this.applovin, c0984e.applovin) && AbstractC7890e.billing(this.ads, c0984e.ads) && AbstractC7890e.billing(this.premium, c0984e.premium) && AbstractC7890e.billing(this.subs, c0984e.subs) && AbstractC7890e.billing(this.crashlytics, c0984e.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC1786e.smaato(this.subs, AbstractC1786e.smaato(this.premium, AbstractC1786e.smaato(this.ads, AbstractC1786e.smaato(this.applovin, AbstractC1786e.smaato(this.isPro, AbstractC1786e.smaato(this.inmobi, AbstractC1786e.smaato(this.isVip, AbstractC1786e.smaato(this.tapsense, AbstractC1786e.smaato(this.signatures, AbstractC1786e.smaato(this.pro, AbstractC1786e.smaato(this.remoteconfig, AbstractC1786e.smaato(this.subscription, AbstractC1786e.smaato(this.admob, AbstractC1786e.smaato(this.Signature, AbstractC1786e.smaato(this.loadAd, AbstractC1786e.smaato(this.amazon, AbstractC1786e.smaato(this.smaato, AbstractC1786e.smaato(this.advert, AbstractC1786e.smaato(this.mopub, AbstractC1786e.smaato(this.adcel, AbstractC1786e.smaato(this.startapp, AbstractC1786e.smaato(this.yandex, AbstractC1786e.smaato(this.billing, AbstractC1786e.smaato(this.purchase, AbstractC1786e.smaato(this.appmetrica, AbstractC1786e.smaato(this.license, AbstractC1786e.smaato(this.metrica, AbstractC1786e.smaato(this.vip, this.ad.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.ad + ", displayMedium=" + this.vip + ",displaySmall=" + this.metrica + ", headlineLarge=" + this.license + ", headlineMedium=" + this.appmetrica + ", headlineSmall=" + this.purchase + ", titleLarge=" + this.billing + ", titleMedium=" + this.yandex + ", titleSmall=" + this.startapp + ", bodyLarge=" + this.adcel + ", bodyMedium=" + this.mopub + ", bodySmall=" + this.advert + ", labelLarge=" + this.smaato + ", labelMedium=" + this.amazon + ", labelSmall=" + this.loadAd + ", displayLargeEmphasized=" + this.Signature + ", displayMediumEmphasized=" + this.admob + ", displaySmallEmphasized=" + this.subscription + ", headlineLargeEmphasized=" + this.remoteconfig + ", headlineMediumEmphasized=" + this.pro + ", headlineSmallEmphasized=" + this.signatures + ", titleLargeEmphasized=" + this.tapsense + ", titleMediumEmphasized=" + this.isVip + ", titleSmallEmphasized=" + this.inmobi + ", bodyLargeEmphasized=" + this.isPro + ", bodyMediumEmphasized=" + this.applovin + ", bodySmallEmphasized=" + this.ads + ", labelLargeEmphasized=" + this.premium + ", labelMediumEmphasized=" + this.subs + ", labelSmallEmphasized=" + this.crashlytics + ')';
    }
}
