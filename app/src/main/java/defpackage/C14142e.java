package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٞ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14142e {
    public int Signature;
    public AbstractC17475e admob;
    public boolean ads;
    public AbstractC17475e amazon;
    public int applovin;
    public int appmetrica;
    public int billing;

    /* renamed from: class, reason: not valid java name */
    public boolean f27968class;
    public boolean crashlytics;
    public boolean firebase;

    /* renamed from: goto, reason: not valid java name */
    public HashMap f27969goto;
    public boolean inmobi;

    /* renamed from: interface, reason: not valid java name */
    public boolean f27970interface;
    public AbstractC17475e isPro;
    public C0454e isVip;
    public AbstractC17475e loadAd;
    public AbstractC17475e premium;
    public int pro;
    public int purchase;
    public int remoteconfig;
    public int signatures;
    public AbstractC17475e smaato;
    public int subs;
    public AbstractC17475e subscription;
    public AbstractC17475e tapsense;

    /* renamed from: this, reason: not valid java name */
    public HashSet f27971this;
    public int yandex;
    public int ad = Alert.DURATION_SHOW_INDEFINITELY;
    public int vip = Alert.DURATION_SHOW_INDEFINITELY;
    public int metrica = Alert.DURATION_SHOW_INDEFINITELY;
    public int license = Alert.DURATION_SHOW_INDEFINITELY;
    public int startapp = Alert.DURATION_SHOW_INDEFINITELY;
    public int adcel = Alert.DURATION_SHOW_INDEFINITELY;
    public boolean mopub = true;
    public boolean advert = true;

    public C14142e() {
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        this.smaato = c1410e;
        this.amazon = c1410e;
        this.loadAd = c1410e;
        this.Signature = 0;
        this.admob = c1410e;
        this.subscription = c1410e;
        this.remoteconfig = 0;
        this.pro = Alert.DURATION_SHOW_INDEFINITELY;
        this.signatures = Alert.DURATION_SHOW_INDEFINITELY;
        this.tapsense = c1410e;
        this.isVip = C0454e.license;
        this.inmobi = false;
        this.isPro = c1410e;
        this.applovin = 0;
        this.ads = true;
        this.premium = c1410e;
        this.subs = 0;
        this.crashlytics = false;
        this.firebase = false;
        this.f27968class = false;
        this.f27970interface = false;
        this.f27969goto = new HashMap();
        this.f27971this = new HashSet();
    }

    public static C1410e appmetrica(String[] strArr) {
        C13304e Signature = AbstractC17475e.Signature();
        for (String str : strArr) {
            str.getClass();
            Signature.metrica(AbstractC9413e.m2547catch(str));
        }
        return Signature.billing();
    }

    public void ad(C11680e c11680e) {
        this.f27969goto.put(c11680e.ad, c11680e);
    }

    public final void license(C4491e c4491e) {
        this.ad = c4491e.ad;
        this.vip = c4491e.vip;
        this.metrica = c4491e.metrica;
        this.license = c4491e.license;
        this.appmetrica = c4491e.appmetrica;
        this.purchase = c4491e.purchase;
        this.billing = c4491e.billing;
        this.yandex = c4491e.yandex;
        this.startapp = c4491e.startapp;
        this.adcel = c4491e.adcel;
        this.mopub = c4491e.mopub;
        this.advert = c4491e.advert;
        this.amazon = c4491e.amazon;
        this.smaato = c4491e.smaato;
        this.loadAd = c4491e.loadAd;
        this.Signature = c4491e.Signature;
        this.admob = c4491e.admob;
        this.remoteconfig = c4491e.remoteconfig;
        this.subscription = c4491e.subscription;
        this.pro = c4491e.pro;
        this.signatures = c4491e.signatures;
        this.tapsense = c4491e.tapsense;
        this.isVip = c4491e.isVip;
        this.inmobi = c4491e.inmobi;
        this.isPro = c4491e.isPro;
        this.applovin = c4491e.ads;
        this.ads = c4491e.premium;
        this.premium = c4491e.applovin;
        this.subs = c4491e.subs;
        this.crashlytics = c4491e.crashlytics;
        this.firebase = c4491e.firebase;
        this.f27968class = c4491e.f9750class;
        this.f27970interface = c4491e.f9752interface;
        this.f27971this = new HashSet(c4491e.f9753this);
        this.f27969goto = new HashMap(c4491e.f9751goto);
    }

    public C14142e metrica() {
        this.f27969goto.clear();
        return this;
    }

    public C4491e vip() {
        return new C4491e(this);
    }
}
