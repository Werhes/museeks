package defpackage;

import java.util.Hashtable;
import java.util.Vector;

/* renamed from: eُ۟ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11301e {
    public static final Hashtable ad;
    public static final Vector appmetrica;
    public static final Hashtable license;
    public static final Hashtable metrica;
    public static final Hashtable vip;

    static {
        remoteconfig remoteconfigVar = new remoteconfig(11);
        remoteconfig remoteconfigVar2 = new remoteconfig(22);
        remoteconfig remoteconfigVar3 = new remoteconfig(26);
        remoteconfig remoteconfigVar4 = new remoteconfig(27);
        remoteconfig remoteconfigVar5 = new remoteconfig(28);
        remoteconfig remoteconfigVar6 = new remoteconfig(29);
        C3133e c3133e = new C3133e(0);
        C3133e c3133e2 = new C3133e(1);
        C3133e c3133e3 = new C3133e(2);
        remoteconfig remoteconfigVar7 = new remoteconfig(1);
        remoteconfig remoteconfigVar8 = new remoteconfig(2);
        remoteconfig remoteconfigVar9 = new remoteconfig(3);
        remoteconfig remoteconfigVar10 = new remoteconfig(4);
        remoteconfig remoteconfigVar11 = new remoteconfig(5);
        remoteconfig remoteconfigVar12 = new remoteconfig(6);
        remoteconfig remoteconfigVar13 = new remoteconfig(7);
        remoteconfig remoteconfigVar14 = new remoteconfig(8);
        remoteconfig remoteconfigVar15 = new remoteconfig(9);
        remoteconfig remoteconfigVar16 = new remoteconfig(10);
        remoteconfig remoteconfigVar17 = new remoteconfig(12);
        remoteconfig remoteconfigVar18 = new remoteconfig(13);
        remoteconfig remoteconfigVar19 = new remoteconfig(14);
        remoteconfig remoteconfigVar20 = new remoteconfig(15);
        remoteconfig remoteconfigVar21 = new remoteconfig(16);
        remoteconfig remoteconfigVar22 = new remoteconfig(17);
        remoteconfig remoteconfigVar23 = new remoteconfig(18);
        remoteconfig remoteconfigVar24 = new remoteconfig(19);
        remoteconfig remoteconfigVar25 = new remoteconfig(20);
        remoteconfig remoteconfigVar26 = new remoteconfig(21);
        remoteconfig remoteconfigVar27 = new remoteconfig(23);
        remoteconfig remoteconfigVar28 = new remoteconfig(24);
        remoteconfig remoteconfigVar29 = new remoteconfig(25);
        ad = new Hashtable();
        vip = new Hashtable();
        metrica = new Hashtable();
        license = new Hashtable();
        appmetrica = new Vector();
        license("curve25519", AbstractC17363e.ad, remoteconfigVar);
        license("secp128r1", InterfaceC14612e.signatures, remoteconfigVar2);
        license("secp160k1", InterfaceC14612e.adcel, remoteconfigVar3);
        license("secp160r1", InterfaceC14612e.startapp, remoteconfigVar4);
        license("secp160r2", InterfaceC14612e.isVip, remoteconfigVar5);
        license("secp192k1", InterfaceC14612e.inmobi, remoteconfigVar6);
        Ctry ctry = InterfaceC14612e.f28827interface;
        license("secp192r1", ctry, c3133e);
        license("secp224k1", InterfaceC14612e.isPro, c3133e2);
        Ctry ctry2 = InterfaceC14612e.applovin;
        license("secp224r1", ctry2, c3133e3);
        license("secp256k1", InterfaceC14612e.mopub, remoteconfigVar7);
        Ctry ctry3 = InterfaceC14612e.f28825goto;
        license("secp256r1", ctry3, remoteconfigVar8);
        Ctry ctry4 = InterfaceC14612e.ads;
        license("secp384r1", ctry4, remoteconfigVar9);
        Ctry ctry5 = InterfaceC14612e.premium;
        license("secp521r1", ctry5, remoteconfigVar10);
        license("sect113r1", InterfaceC14612e.appmetrica, remoteconfigVar11);
        license("sect113r2", InterfaceC14612e.purchase, remoteconfigVar12);
        license("sect131r1", InterfaceC14612e.loadAd, remoteconfigVar13);
        license("sect131r2", InterfaceC14612e.Signature, remoteconfigVar14);
        Ctry ctry6 = InterfaceC14612e.vip;
        license("sect163k1", ctry6, remoteconfigVar15);
        license("sect163r1", InterfaceC14612e.metrica, remoteconfigVar16);
        Ctry ctry7 = InterfaceC14612e.advert;
        license("sect163r2", ctry7, remoteconfigVar17);
        license("sect193r1", InterfaceC14612e.admob, remoteconfigVar18);
        license("sect193r2", InterfaceC14612e.subscription, remoteconfigVar19);
        Ctry ctry8 = InterfaceC14612e.remoteconfig;
        license("sect233k1", ctry8, remoteconfigVar20);
        Ctry ctry9 = InterfaceC14612e.pro;
        license("sect233r1", ctry9, remoteconfigVar21);
        license("sect239k1", InterfaceC14612e.license, remoteconfigVar22);
        Ctry ctry10 = InterfaceC14612e.smaato;
        license("sect283k1", ctry10, remoteconfigVar23);
        Ctry ctry11 = InterfaceC14612e.amazon;
        license("sect283r1", ctry11, remoteconfigVar24);
        Ctry ctry12 = InterfaceC14612e.subs;
        license("sect409k1", ctry12, remoteconfigVar25);
        Ctry ctry13 = InterfaceC14612e.crashlytics;
        license("sect409r1", ctry13, remoteconfigVar26);
        Ctry ctry14 = InterfaceC14612e.firebase;
        license("sect571k1", ctry14, remoteconfigVar27);
        Ctry ctry15 = InterfaceC14612e.f28822class;
        license("sect571r1", ctry15, remoteconfigVar28);
        license("sm2p256v1", InterfaceC4366e.ad, remoteconfigVar29);
        metrica("B-163", ctry7);
        metrica("B-233", ctry9);
        metrica("B-283", ctry11);
        metrica("B-409", ctry13);
        metrica("B-571", ctry15);
        metrica("K-163", ctry6);
        metrica("K-233", ctry8);
        metrica("K-283", ctry10);
        metrica("K-409", ctry12);
        metrica("K-571", ctry14);
        metrica("P-192", ctry);
        metrica("P-224", ctry2);
        metrica("P-256", ctry3);
        metrica("P-384", ctry4);
        metrica("P-521", ctry5);
    }

    public static C1324e ad(AbstractC0362e abstractC0362e, String str) {
        C1324e c1324e = new C1324e(abstractC0362e, AbstractC7240e.metrica(str));
        AbstractC0903e.vip(c1324e.loadAd());
        return c1324e;
    }

    public static void license(String str, Ctry ctry, AbstractC4068e abstractC4068e) {
        appmetrica.addElement(str);
        license.put(ctry, str);
        metrica.put(ctry, abstractC4068e);
        String license2 = AbstractC1433e.license(str);
        vip.put(license2, ctry);
        ad.put(license2, abstractC4068e);
    }

    public static void metrica(String str, Ctry ctry) {
        Object obj = metrica.get(ctry);
        if (obj == null) {
            throw new IllegalStateException();
        }
        String license2 = AbstractC1433e.license(str);
        vip.put(license2, ctry);
        ad.put(license2, obj);
    }

    public static AbstractC0362e vip(AbstractC4325e abstractC4325e, C16911e c16911e) {
        C9556e c9556e;
        synchronized (abstractC4325e) {
            c9556e = new C9556e(abstractC4325e, abstractC4325e.purchase, abstractC4325e.billing, abstractC4325e.yandex);
        }
        c9556e.f18968e = new C0961e(abstractC4325e, c16911e);
        return c9556e.adcel();
    }
}
