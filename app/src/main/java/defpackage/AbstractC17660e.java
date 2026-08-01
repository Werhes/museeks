package defpackage;

import java.util.HashMap;

/* renamed from: eَ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17660e {
    public static final HashMap ad;

    static {
        HashMap hashMap = new HashMap();
        ad = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap.put(InterfaceC5051e.f10823e, "MD2");
        hashMap.put(InterfaceC5051e.f10801e, "MD4");
        hashMap.put(InterfaceC5051e.f10805e, "MD5");
        Ctry ctry = InterfaceC12598e.purchase;
        hashMap.put(ctry, "SHA-1");
        Ctry ctry2 = InterfaceC0760e.license;
        hashMap.put(ctry2, "SHA-224");
        Ctry ctry3 = InterfaceC0760e.ad;
        hashMap.put(ctry3, "SHA-256");
        Ctry ctry4 = InterfaceC0760e.vip;
        hashMap.put(ctry4, "SHA-384");
        Ctry ctry5 = InterfaceC0760e.metrica;
        hashMap.put(ctry5, "SHA-512");
        hashMap.put(InterfaceC0760e.appmetrica, "SHA-512(224)");
        hashMap.put(InterfaceC0760e.purchase, "SHA-512(256)");
        hashMap.put(InterfaceC17045e.vip, "RIPEMD-128");
        hashMap.put(InterfaceC17045e.ad, "RIPEMD-160");
        hashMap.put(InterfaceC17045e.metrica, "RIPEMD-128");
        hashMap.put(InterfaceC14828e.vip, "RIPEMD-128");
        hashMap.put(InterfaceC14828e.ad, "RIPEMD-160");
        hashMap.put(InterfaceC6859e.ad, "GOST3411");
        hashMap.put(InterfaceC8263e.ad, "Tiger");
        hashMap.put(InterfaceC14828e.metrica, "Whirlpool");
        Ctry ctry6 = InterfaceC0760e.billing;
        hashMap.put(ctry6, "SHA3-224");
        Ctry ctry7 = InterfaceC0760e.yandex;
        hashMap.put(ctry7, "SHA3-256");
        Ctry ctry8 = InterfaceC0760e.startapp;
        hashMap.put(ctry8, "SHA3-384");
        Ctry ctry9 = InterfaceC0760e.adcel;
        hashMap.put(ctry9, "SHA3-512");
        hashMap.put(InterfaceC0760e.mopub, "SHAKE128");
        hashMap.put(InterfaceC0760e.advert, "SHAKE256");
        hashMap.put(InterfaceC4366e.loadAd, "SM3");
        Ctry ctry10 = InterfaceC14178e.remoteconfig;
        hashMap.put(ctry10, "BLAKE3-256");
        hashMap2.put("SHA-1", new C16527e(ctry, C0503e.f2592e));
        hashMap2.put("SHA-224", new C16527e(ctry2));
        hashMap2.put("SHA224", new C16527e(ctry2));
        hashMap2.put("SHA-256", new C16527e(ctry3));
        hashMap2.put("SHA256", new C16527e(ctry3));
        hashMap2.put("SHA-384", new C16527e(ctry4));
        hashMap2.put("SHA384", new C16527e(ctry4));
        hashMap2.put("SHA-512", new C16527e(ctry5));
        hashMap2.put("SHA512", new C16527e(ctry5));
        hashMap2.put("SHA3-224", new C16527e(ctry6));
        hashMap2.put("SHA3-256", new C16527e(ctry7));
        hashMap2.put("SHA3-384", new C16527e(ctry8));
        hashMap2.put("SHA3-512", new C16527e(ctry9));
        hashMap2.put("BLAKE3-256", new C16527e(ctry10));
    }

    public static String ad(Ctry ctry) {
        String str = (String) ad.get(ctry);
        return str != null ? str : ctry.m4673class();
    }
}
