package defpackage;

import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۜۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1343e implements InterfaceC1726e {
    public final X509TrustManager Signature;
    public final C11980e ad;
    public final C5107e adcel;
    public final List admob;
    public final long ads;
    public final ProxySelector advert;
    public final SocketFactory amazon;
    public final int applovin;
    public final boolean appmetrica;
    public final C5107e billing;
    public final C2362e crashlytics;
    public final int inmobi;
    public final int isPro;
    public final int isVip;
    public final C12582e license;
    public final SSLSocketFactory loadAd;
    public final List metrica;
    public final C4524e mopub;
    public final C16089e premium;
    public final C12932e pro;
    public final boolean purchase;
    public final HostnameVerifier remoteconfig;
    public final AbstractC0014e signatures;
    public final InterfaceC4529e smaato;
    public final boolean startapp;
    public final C14899e subs;
    public final List subscription;
    public final int tapsense;
    public final List vip;
    public final boolean yandex;
    public static final List firebase = AbstractC16286e.mopub(new EnumC12473e[]{EnumC12473e.HTTP_2, EnumC12473e.HTTP_1_1});

    /* renamed from: class, reason: not valid java name */
    public static final List f4132class = AbstractC16286e.mopub(new C9919e[]{C9919e.appmetrica, C9919e.purchase});

    /* JADX WARN: Removed duplicated region for block: B:22:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1343e(defpackage.C6351e r7) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1343e.<init>(eؙِۢ):void");
    }

    public final C6351e ad() {
        C6351e c6351e = new C6351e();
        c6351e.ad = this.ad;
        c6351e.vip = this.crashlytics;
        AbstractC13480e.inmobi(c6351e.metrica, this.vip);
        AbstractC13480e.inmobi(c6351e.license, this.metrica);
        c6351e.appmetrica = this.license;
        c6351e.purchase = this.appmetrica;
        c6351e.billing = this.purchase;
        c6351e.yandex = this.billing;
        c6351e.startapp = this.yandex;
        c6351e.adcel = this.startapp;
        c6351e.mopub = this.adcel;
        c6351e.advert = this.mopub;
        c6351e.smaato = this.advert;
        c6351e.amazon = this.smaato;
        c6351e.loadAd = this.amazon;
        c6351e.Signature = this.loadAd;
        c6351e.admob = this.Signature;
        c6351e.subscription = this.admob;
        c6351e.remoteconfig = this.subscription;
        c6351e.pro = this.remoteconfig;
        c6351e.signatures = this.pro;
        c6351e.tapsense = this.signatures;
        c6351e.isVip = this.tapsense;
        c6351e.inmobi = this.isVip;
        c6351e.isPro = this.inmobi;
        c6351e.applovin = this.isPro;
        c6351e.ads = this.applovin;
        c6351e.premium = this.ads;
        c6351e.subs = this.premium;
        c6351e.crashlytics = this.subs;
        return c6351e;
    }

    public final C4602e vip(C8650e c8650e) {
        return new C4602e(this, c8650e, false);
    }
}
