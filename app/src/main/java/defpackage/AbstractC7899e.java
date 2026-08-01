package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: eًّۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7899e {
    public static final Hashtable ad;
    public static final Hashtable metrica;
    public static final Hashtable vip;

    static {
        C3133e c3133e = new C3133e(3);
        C3133e c3133e2 = new C3133e(4);
        C3133e c3133e3 = new C3133e(5);
        C3133e c3133e4 = new C3133e(6);
        C3133e c3133e5 = new C3133e(7);
        C3133e c3133e6 = new C3133e(8);
        C3133e c3133e7 = new C3133e(9);
        ad = new Hashtable();
        vip = new Hashtable();
        metrica = new Hashtable();
        metrica("GostR3410-2001-CryptoPro-A", InterfaceC6859e.remoteconfig, c3133e);
        metrica("GostR3410-2001-CryptoPro-B", InterfaceC6859e.pro, c3133e2);
        metrica("GostR3410-2001-CryptoPro-C", InterfaceC6859e.signatures, c3133e3);
        metrica("GostR3410-2001-CryptoPro-XchA", InterfaceC6859e.tapsense, c3133e);
        metrica("GostR3410-2001-CryptoPro-XchB", InterfaceC6859e.isVip, c3133e3);
        metrica("Tc26-Gost-3410-12-256-paramSetA", InterfaceC13429e.mopub, c3133e4);
        metrica("Tc26-Gost-3410-12-256-paramSetB", InterfaceC13429e.advert, c3133e);
        metrica("Tc26-Gost-3410-12-256-paramSetC", InterfaceC13429e.smaato, c3133e2);
        metrica("Tc26-Gost-3410-12-256-paramSetD", InterfaceC13429e.amazon, c3133e3);
        metrica("Tc26-Gost-3410-12-512-paramSetA", InterfaceC13429e.loadAd, c3133e5);
        metrica("Tc26-Gost-3410-12-512-paramSetB", InterfaceC13429e.Signature, c3133e6);
        metrica("Tc26-Gost-3410-12-512-paramSetC", InterfaceC13429e.admob, c3133e7);
    }

    public static BigInteger ad(String str) {
        return new BigInteger(1, AbstractC7240e.metrica(str));
    }

    public static String appmetrica(Ctry ctry) {
        return (String) metrica.get(ctry);
    }

    public static C9300e license(Ctry ctry) {
        AbstractC4068e abstractC4068e = (AbstractC4068e) vip.get(ctry);
        if (abstractC4068e == null) {
            return null;
        }
        return abstractC4068e.license();
    }

    public static void metrica(String str, Ctry ctry, AbstractC4068e abstractC4068e) {
        ad.put(str, ctry);
        metrica.put(ctry, str);
        vip.put(ctry, abstractC4068e);
    }

    public static Ctry purchase(String str) {
        return (Ctry) ad.get(str);
    }

    public static C1324e vip(AbstractC0362e abstractC0362e, BigInteger bigInteger, BigInteger bigInteger2) {
        AbstractC9932e license = abstractC0362e.license(bigInteger, bigInteger2);
        AbstractC0903e.vip(license);
        return new C1324e(license, false);
    }
}
