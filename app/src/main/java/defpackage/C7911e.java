package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7911e {
    public boolean Signature;
    public C1979e ad;
    public C10566e adcel;
    public final C0576e admob;
    public final C0576e ads;
    public final C0576e advert;
    public final C0576e amazon;
    public long applovin;
    public C11410e appmetrica;
    public final C0576e billing;
    public final C11840e inmobi;
    public final C11447e isPro;
    public final C11840e isVip;
    public final C16911e license;
    public final C0576e loadAd;
    public final InterfaceC3965e metrica;
    public final C0576e mopub;
    public final C0576e premium;
    public final C0576e pro;
    public final C0576e purchase;
    public final C0576e remoteconfig;
    public Function1 signatures;
    public final C0576e smaato;
    public final C0576e startapp;
    public final C6415e subscription;
    public final C11840e tapsense;
    public final C2846e vip;
    public InterfaceC0043e yandex;

    public C7911e(C1979e c1979e, C2846e c2846e, InterfaceC3965e interfaceC3965e) {
        this.ad = c1979e;
        this.vip = c2846e;
        this.metrica = interfaceC3965e;
        C16911e c16911e = new C16911e(19, false);
        C10566e c10566e = AbstractC13195e.ad;
        long j = C12347e.vip;
        C0398e c0398e = new C0398e(c10566e, j, (C12347e) null);
        c16911e.f33137e = c0398e;
        c16911e.f33136e = new C11199e(c10566e, c0398e.vip);
        this.license = c16911e;
        Boolean bool = Boolean.FALSE;
        this.purchase = AbstractC14533e.startapp(bool);
        this.billing = AbstractC14533e.startapp(new C15765e(0));
        this.startapp = AbstractC14533e.startapp(null);
        this.mopub = AbstractC14533e.startapp(EnumC13262e.f26311e);
        this.advert = AbstractC14533e.startapp(bool);
        this.smaato = AbstractC14533e.startapp(bool);
        this.amazon = AbstractC14533e.startapp(bool);
        this.loadAd = AbstractC14533e.startapp(bool);
        this.Signature = true;
        this.admob = AbstractC14533e.startapp(Boolean.TRUE);
        this.subscription = new C6415e(interfaceC3965e);
        this.remoteconfig = AbstractC14533e.startapp(bool);
        this.pro = AbstractC14533e.startapp(bool);
        this.signatures = new C17187e(20);
        this.tapsense = new C11840e(this, 1);
        this.isVip = new C11840e(this, 2);
        this.inmobi = new C11840e(this, 3);
        this.isPro = AbstractC17331e.vip();
        this.applovin = C3618e.adcel;
        this.ads = AbstractC14533e.startapp(new C12347e(j));
        this.premium = AbstractC14533e.startapp(new C12347e(j));
    }

    public final EnumC13262e ad() {
        return (EnumC13262e) this.mopub.getValue();
    }

    public final void appmetrica(long j) {
        this.premium.setValue(new C12347e(j));
    }

    public final C0866e license() {
        return (C0866e) this.startapp.getValue();
    }

    public final InterfaceC0043e metrica() {
        InterfaceC0043e interfaceC0043e = this.yandex;
        if (interfaceC0043e == null || !interfaceC0043e.billing()) {
            return null;
        }
        return interfaceC0043e;
    }

    public final void purchase(long j) {
        this.ads.setValue(new C12347e(j));
    }

    public final boolean vip() {
        return ((Boolean) this.purchase.getValue()).booleanValue();
    }
}
