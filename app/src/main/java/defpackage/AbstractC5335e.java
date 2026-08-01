package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: eؘُؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5335e {
    public static final Hashtable ad;
    public static final Hashtable metrica;
    public static final Hashtable vip;

    static {
        C3133e c3133e = new C3133e(22);
        C12374e c12374e = new C12374e(3);
        C12374e c12374e2 = new C12374e(8);
        C12374e c12374e3 = new C12374e(9);
        C12374e c12374e4 = new C12374e(10);
        C12374e c12374e5 = new C12374e(11);
        C12374e c12374e6 = new C12374e(12);
        C12374e c12374e7 = new C12374e(13);
        C12374e c12374e8 = new C12374e(14);
        C3133e c3133e2 = new C3133e(12);
        C3133e c3133e3 = new C3133e(13);
        C3133e c3133e4 = new C3133e(14);
        C3133e c3133e5 = new C3133e(15);
        C3133e c3133e6 = new C3133e(16);
        C3133e c3133e7 = new C3133e(17);
        C3133e c3133e8 = new C3133e(18);
        C3133e c3133e9 = new C3133e(19);
        C3133e c3133e10 = new C3133e(20);
        C3133e c3133e11 = new C3133e(21);
        C3133e c3133e12 = new C3133e(23);
        C3133e c3133e13 = new C3133e(24);
        C3133e c3133e14 = new C3133e(25);
        C3133e c3133e15 = new C3133e(26);
        C3133e c3133e16 = new C3133e(27);
        C3133e c3133e17 = new C3133e(28);
        C3133e c3133e18 = new C3133e(29);
        C12374e c12374e9 = new C12374e(0);
        C12374e c12374e10 = new C12374e(1);
        C12374e c12374e11 = new C12374e(2);
        C12374e c12374e12 = new C12374e(4);
        C12374e c12374e13 = new C12374e(5);
        C12374e c12374e14 = new C12374e(6);
        C12374e c12374e15 = new C12374e(7);
        ad = new Hashtable();
        vip = new Hashtable();
        metrica = new Hashtable();
        license("secp112r1", InterfaceC14612e.billing, c3133e);
        license("secp112r2", InterfaceC14612e.yandex, c12374e);
        license("secp128r1", InterfaceC14612e.signatures, c12374e2);
        license("secp128r2", InterfaceC14612e.tapsense, c12374e3);
        license("secp160k1", InterfaceC14612e.adcel, c12374e4);
        license("secp160r1", InterfaceC14612e.startapp, c12374e5);
        license("secp160r2", InterfaceC14612e.isVip, c12374e6);
        license("secp192k1", InterfaceC14612e.inmobi, c12374e7);
        license("secp192r1", InterfaceC14612e.f28827interface, c12374e8);
        license("secp224k1", InterfaceC14612e.isPro, c3133e2);
        license("secp224r1", InterfaceC14612e.applovin, c3133e3);
        license("secp256k1", InterfaceC14612e.mopub, c3133e4);
        license("secp256r1", InterfaceC14612e.f28825goto, c3133e5);
        license("secp384r1", InterfaceC14612e.ads, c3133e6);
        license("secp521r1", InterfaceC14612e.premium, c3133e7);
        license("sect113r1", InterfaceC14612e.appmetrica, c3133e8);
        license("sect113r2", InterfaceC14612e.purchase, c3133e9);
        license("sect131r1", InterfaceC14612e.loadAd, c3133e10);
        license("sect131r2", InterfaceC14612e.Signature, c3133e11);
        license("sect163k1", InterfaceC14612e.vip, c3133e12);
        license("sect163r1", InterfaceC14612e.metrica, c3133e13);
        license("sect163r2", InterfaceC14612e.advert, c3133e14);
        license("sect193r1", InterfaceC14612e.admob, c3133e15);
        license("sect193r2", InterfaceC14612e.subscription, c3133e16);
        license("sect233k1", InterfaceC14612e.remoteconfig, c3133e17);
        license("sect233r1", InterfaceC14612e.pro, c3133e18);
        license("sect239k1", InterfaceC14612e.license, c12374e9);
        license("sect283k1", InterfaceC14612e.smaato, c12374e10);
        license("sect283r1", InterfaceC14612e.amazon, c12374e11);
        license("sect409k1", InterfaceC14612e.subs, c12374e12);
        license("sect409r1", InterfaceC14612e.crashlytics, c12374e13);
        license("sect571k1", InterfaceC14612e.firebase, c12374e14);
        license("sect571r1", InterfaceC14612e.f28822class, c12374e15);
    }

    public static BigInteger ad(String str) {
        return new BigInteger(1, AbstractC7240e.metrica(str));
    }

    public static void license(String str, Ctry ctry, AbstractC4068e abstractC4068e) {
        ad.put(str, ctry);
        metrica.put(ctry, str);
        vip.put(ctry, abstractC4068e);
    }

    public static AbstractC0362e metrica(C17328e c17328e, C16911e c16911e) {
        C9556e c9556e;
        synchronized (c17328e) {
            c9556e = new C9556e(c17328e, c17328e.purchase, c17328e.billing, c17328e.yandex);
        }
        c9556e.f18968e = new C0961e(c17328e, c16911e);
        return c9556e.adcel();
    }

    public static C1324e vip(AbstractC0362e abstractC0362e, String str) {
        C1324e c1324e = new C1324e(abstractC0362e, AbstractC7240e.metrica(str));
        AbstractC0903e.vip(c1324e.loadAd());
        return c1324e;
    }
}
