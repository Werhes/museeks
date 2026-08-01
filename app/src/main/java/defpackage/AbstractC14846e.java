package defpackage;

import java.util.HashMap;

/* renamed from: eؙٔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14846e {
    public static final HashMap ad;

    static {
        HashMap hashMap = new HashMap();
        ad = hashMap;
        hashMap.put("SHA-1", InterfaceC2796e.f6741e);
        hashMap.put("SHA-224", InterfaceC0760e.license);
        hashMap.put("SHA-256", InterfaceC0760e.ad);
        hashMap.put("SHA-384", InterfaceC0760e.vip);
        hashMap.put("SHA-512", InterfaceC0760e.metrica);
        hashMap.put("SHA-512/224", InterfaceC0760e.appmetrica);
        hashMap.put("SHA-512/256", InterfaceC0760e.purchase);
        hashMap.put("SHA3-224", InterfaceC0760e.billing);
        hashMap.put("SHA3-256", InterfaceC0760e.yandex);
        hashMap.put("SHA3-384", InterfaceC0760e.startapp);
        hashMap.put("SHA3-512", InterfaceC0760e.adcel);
        hashMap.put("SHAKE128", InterfaceC0760e.mopub);
        hashMap.put("SHAKE256", InterfaceC0760e.advert);
    }

    public static Ctry ad(String str) {
        HashMap hashMap = ad;
        if (hashMap.containsKey(str)) {
            return (Ctry) hashMap.get(str);
        }
        throw new IllegalArgumentException(AbstractC17861e.Signature("unrecognised digest algorithm: ", str));
    }
}
