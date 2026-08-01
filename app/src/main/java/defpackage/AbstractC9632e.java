package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: eٍٞٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9632e {
    public static final Hashtable ad;
    public static final Hashtable metrica;
    public static final Hashtable vip;

    static {
        C12374e c12374e = new C12374e(20);
        C12374e c12374e2 = new C12374e(21);
        C12374e c12374e3 = new C12374e(22);
        C12374e c12374e4 = new C12374e(23);
        C12374e c12374e5 = new C12374e(24);
        C12374e c12374e6 = new C12374e(25);
        C12374e c12374e7 = new C12374e(26);
        C12374e c12374e8 = new C12374e(27);
        C12374e c12374e9 = new C12374e(28);
        C12374e c12374e10 = new C12374e(15);
        C12374e c12374e11 = new C12374e(16);
        C12374e c12374e12 = new C12374e(17);
        C12374e c12374e13 = new C12374e(18);
        C12374e c12374e14 = new C12374e(19);
        ad = new Hashtable();
        vip = new Hashtable();
        metrica = new Hashtable();
        metrica("brainpoolP160r1", InterfaceC17045e.startapp, c12374e);
        metrica("brainpoolP160t1", InterfaceC17045e.adcel, c12374e2);
        metrica("brainpoolP192r1", InterfaceC17045e.mopub, c12374e3);
        metrica("brainpoolP192t1", InterfaceC17045e.advert, c12374e4);
        metrica("brainpoolP224r1", InterfaceC17045e.smaato, c12374e5);
        metrica("brainpoolP224t1", InterfaceC17045e.amazon, c12374e6);
        metrica("brainpoolP256r1", InterfaceC17045e.loadAd, c12374e7);
        metrica("brainpoolP256t1", InterfaceC17045e.Signature, c12374e8);
        metrica("brainpoolP320r1", InterfaceC17045e.admob, c12374e9);
        metrica("brainpoolP320t1", InterfaceC17045e.subscription, c12374e10);
        metrica("brainpoolP384r1", InterfaceC17045e.remoteconfig, c12374e11);
        metrica("brainpoolP384t1", InterfaceC17045e.pro, c12374e12);
        metrica("brainpoolP512r1", InterfaceC17045e.signatures, c12374e13);
        metrica("brainpoolP512t1", InterfaceC17045e.tapsense, c12374e14);
    }

    public static BigInteger ad(String str) {
        return new BigInteger(1, AbstractC7240e.metrica(str));
    }

    public static void metrica(String str, Ctry ctry, AbstractC4068e abstractC4068e) {
        ad.put(AbstractC1433e.license(str), ctry);
        metrica.put(ctry, str);
        vip.put(ctry, abstractC4068e);
    }

    public static C1324e vip(AbstractC0362e abstractC0362e, String str) {
        C1324e c1324e = new C1324e(abstractC0362e, AbstractC7240e.metrica(str));
        AbstractC0903e.vip(c1324e.loadAd());
        return c1324e;
    }
}
