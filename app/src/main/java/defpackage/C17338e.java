package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۢؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17338e {
    public final InterfaceC11206e Signature;
    public final C6325e ad;
    public final InterfaceC11206e adcel;
    public final InterfaceC11206e admob;
    public final InterfaceC11206e ads;
    public final InterfaceC11206e advert;
    public final InterfaceC11206e amazon;
    public final InterfaceC11206e applovin;
    public final InterfaceC11206e appmetrica;
    public final InterfaceC11206e billing;
    public final InterfaceC11206e inmobi;
    public final InterfaceC11206e isPro;
    public final InterfaceC11206e isVip;
    public final InterfaceC11206e license;
    public final InterfaceC11206e loadAd;
    public final C17338e metrica;
    public final InterfaceC11206e mopub;
    public final InterfaceC11206e pro;
    public final InterfaceC11206e purchase;
    public final InterfaceC11206e remoteconfig;
    public final InterfaceC11206e signatures;
    public final InterfaceC11206e smaato;
    public final InterfaceC11206e startapp;
    public final InterfaceC11206e subscription;
    public final C13572e tapsense;
    public final C11199e vip;
    public final InterfaceC11206e yandex;

    /* JADX WARN: Type inference failed for: r4v2, types: [eْۡ, java.lang.Object, eُۗۦ] */
    /* JADX WARN: Type inference failed for: r4v4, types: [eْۡ, java.lang.Object, eُۗۦ] */
    public C17338e(C6325e c6325e, C11199e c11199e) {
        Object obj = C18426e.f36126e;
        this.metrica = this;
        this.ad = c6325e;
        this.vip = c11199e;
        this.license = AbstractC13501e.yandex(this, 1);
        this.appmetrica = AbstractC13501e.yandex(this, 0);
        this.purchase = AbstractC13501e.yandex(this, 5);
        int i = 3;
        C13572e c13572e = new C13572e(this, 7, i);
        ?? obj2 = new Object();
        obj2.f36127e = obj;
        obj2.f36128e = c13572e;
        this.billing = obj2;
        this.yandex = AbstractC13501e.yandex(this, 8);
        this.startapp = AbstractC13501e.yandex(this, 9);
        this.adcel = AbstractC13501e.yandex(this, 10);
        this.mopub = AbstractC13501e.yandex(this, 6);
        this.advert = AbstractC13501e.yandex(this, 12);
        this.smaato = AbstractC13501e.yandex(this, 13);
        this.amazon = AbstractC13501e.yandex(this, 11);
        this.loadAd = AbstractC13501e.yandex(this, 17);
        this.Signature = AbstractC13501e.yandex(this, 16);
        C13572e c13572e2 = new C13572e(this, 18, i);
        ?? obj3 = new Object();
        obj3.f36127e = obj;
        obj3.f36128e = c13572e2;
        this.admob = obj3;
        this.subscription = AbstractC13501e.yandex(this, 19);
        this.remoteconfig = AbstractC13501e.yandex(this, 15);
        this.pro = AbstractC13501e.yandex(this, 20);
        this.signatures = AbstractC13501e.yandex(this, 14);
        this.tapsense = new C13572e(this, 4, 3);
        this.isVip = AbstractC13501e.yandex(this, 3);
        this.inmobi = AbstractC13501e.yandex(this, 2);
        this.isPro = AbstractC13501e.yandex(this, 21);
        this.applovin = AbstractC13501e.yandex(this, 22);
        this.ads = AbstractC13501e.yandex(this, 23);
    }

    public final Context ad() {
        Context context = ((C17526e) this.ad.f13170e).ad;
        AbstractC1513e.appmetrica(context);
        return context;
    }
}
