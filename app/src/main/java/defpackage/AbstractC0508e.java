package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؑۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0508e {
    static {
        int i = C14425e.CONFIG_NAME_FIELD_NUMBER;
        try {
            ad();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void ad() {
        C17895e c17895e = C17895e.vip;
        c17895e.vip(C15761e.mopub);
        c17895e.ad(C15761e.advert);
        c17895e.vip(C15761e.license);
        int i = AbstractC2722e.purchase;
        if (!AbstractC1786e.adcel(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C5720e c5720e = AbstractC11932e.ad;
        C15619e c15619e = C15619e.vip;
        c15619e.purchase(AbstractC11932e.metrica);
        c15619e.appmetrica(AbstractC11932e.license);
        c15619e.license(AbstractC11932e.appmetrica);
        c15619e.metrica(AbstractC11932e.purchase);
        c17895e.ad(AbstractC2722e.ad);
        c17895e.ad(AbstractC2722e.vip);
        C14286e c14286e = C14286e.vip;
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", AbstractC12869e.ad);
        C11467e vip = C9622e.vip();
        vip.f23072e = 32;
        vip.f23070e = 16;
        C2942e c2942e = C2942e.appmetrica;
        vip.f23071e = c2942e;
        C3700e c3700e = C3700e.license;
        vip.f23069e = c3700e;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", vip.loadAd());
        C11467e vip2 = C9622e.vip();
        vip2.f23072e = 32;
        vip2.f23070e = 32;
        C2942e c2942e2 = C2942e.vip;
        vip2.f23071e = c2942e2;
        vip2.f23069e = c3700e;
        hashMap.put("HMAC_SHA256_256BITTAG", vip2.loadAd());
        C11467e vip3 = C9622e.vip();
        vip3.f23072e = 32;
        vip3.f23070e = 32;
        vip3.f23071e = c2942e;
        vip3.f23069e = c3700e;
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", vip3.loadAd());
        C11467e vip4 = C9622e.vip();
        vip4.f23072e = 64;
        vip4.f23070e = 16;
        vip4.f23071e = c2942e2;
        C3700e c3700e2 = C3700e.purchase;
        vip4.f23069e = c3700e2;
        hashMap.put("HMAC_SHA512_128BITTAG", vip4.loadAd());
        C11467e vip5 = C9622e.vip();
        vip5.f23072e = 64;
        vip5.f23070e = 16;
        vip5.f23071e = c2942e;
        vip5.f23069e = c3700e2;
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", vip5.loadAd());
        C11467e vip6 = C9622e.vip();
        vip6.f23072e = 64;
        vip6.f23070e = 32;
        vip6.f23071e = c2942e2;
        vip6.f23069e = c3700e2;
        hashMap.put("HMAC_SHA512_256BITTAG", vip6.loadAd());
        C11467e vip7 = C9622e.vip();
        vip7.f23072e = 64;
        vip7.f23070e = 32;
        vip7.f23071e = c2942e;
        vip7.f23069e = c3700e2;
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", vip7.loadAd());
        hashMap.put("HMAC_SHA512_512BITTAG", AbstractC12869e.vip);
        C11467e vip8 = C9622e.vip();
        vip8.f23072e = 64;
        vip8.f23070e = 64;
        vip8.f23071e = c2942e;
        vip8.f23069e = c3700e2;
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", vip8.loadAd());
        c14286e.vip(DesugarCollections.unmodifiableMap(hashMap));
        C1825e c1825e = C1825e.vip;
        c1825e.ad(AbstractC2722e.appmetrica, C9622e.class);
        C12722e.vip.ad(AbstractC2722e.license, C9622e.class);
        C11731e c11731e = C11731e.license;
        c11731e.appmetrica(AbstractC2722e.metrica, i, true);
        if (AbstractC17852e.ad()) {
            return;
        }
        C5431e c5431e = AbstractC5144e.ad;
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        c15619e.purchase(AbstractC10543e.ad);
        c15619e.appmetrica(AbstractC10543e.vip);
        c15619e.license(AbstractC10543e.metrica);
        c15619e.metrica(AbstractC10543e.license);
        c1825e.ad(AbstractC5144e.ad, C0834e.class);
        c17895e.ad(AbstractC5144e.vip);
        c17895e.ad(AbstractC5144e.metrica);
        HashMap hashMap2 = new HashMap();
        C0834e c0834e = AbstractC12869e.metrica;
        hashMap2.put("AES_CMAC", c0834e);
        hashMap2.put("AES256_CMAC", c0834e);
        C0909e vip9 = C0834e.vip();
        vip9.m418break(32);
        vip9.m417abstract(16);
        vip9.f3321e = C6594e.f13611e;
        hashMap2.put("AES256_CMAC_RAW", vip9.tapsense());
        c14286e.vip(DesugarCollections.unmodifiableMap(hashMap2));
        c11731e.license(AbstractC5144e.license, true);
    }
}
