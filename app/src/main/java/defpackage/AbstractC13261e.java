package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13261e {
    public static final C13507e ad;
    public static final C5720e adcel;
    public static final C13780e appmetrica;
    public static final C5720e billing;
    public static final C17594e license;
    public static final C13780e metrica;
    public static final C17594e purchase;
    public static final C5720e startapp;
    public static final C10221e vip;
    public static final C5720e yandex;

    static {
        C15768e metrica2 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        C15768e metrica3 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        ad = new C13507e(C12835e.class, new C0189e(5));
        vip = new C10221e(metrica2, new C0189e(6));
        metrica = new C13780e(C5026e.class, new C0189e(7));
        license = new C17594e(metrica3, new C0189e(8));
        appmetrica = new C13780e(C16238e.class, new C0189e(9));
        purchase = new C17594e(metrica2, new C0189e(10));
        C17424e ad2 = C5720e.ad();
        ad2.advert(EnumC3021e.RAW, C5709e.license);
        ad2.advert(EnumC3021e.TINK, C5709e.vip);
        EnumC3021e enumC3021e = EnumC3021e.LEGACY;
        C5709e c5709e = C5709e.metrica;
        ad2.advert(enumC3021e, c5709e);
        ad2.advert(EnumC3021e.CRUNCHY, c5709e);
        billing = ad2.Signature();
        C17424e ad3 = C5720e.ad();
        ad3.advert(EnumC10749e.DHKEM_P256_HKDF_SHA256, C13903e.license);
        ad3.advert(EnumC10749e.DHKEM_P384_HKDF_SHA384, C13903e.appmetrica);
        ad3.advert(EnumC10749e.DHKEM_P521_HKDF_SHA512, C13903e.purchase);
        ad3.advert(EnumC10749e.DHKEM_X25519_HKDF_SHA256, C13903e.billing);
        yandex = ad3.Signature();
        C17424e ad4 = C5720e.ad();
        ad4.advert(EnumC5703e.HKDF_SHA256, C5031e.license);
        ad4.advert(EnumC5703e.HKDF_SHA384, C5031e.appmetrica);
        ad4.advert(EnumC5703e.HKDF_SHA512, C5031e.purchase);
        startapp = ad4.Signature();
        C17424e ad5 = C5720e.ad();
        ad5.advert(EnumC6108e.AES_128_GCM, C1062e.license);
        ad5.advert(EnumC6108e.AES_256_GCM, C1062e.appmetrica);
        ad5.advert(EnumC6108e.CHACHA20_POLY1305, C1062e.purchase);
        adcel = ad5.Signature();
    }

    public static C15768e ad(C13903e c13903e, byte[] bArr) {
        int i;
        BigInteger vip2 = AbstractC7354e.vip(bArr);
        byte[] bArr2 = AbstractC0097e.ad;
        if (c13903e == C13903e.billing) {
            i = 32;
        } else if (c13903e == C13903e.license) {
            i = 65;
        } else if (c13903e == C13903e.appmetrica) {
            i = 97;
        } else {
            if (c13903e != C13903e.purchase) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i = 133;
        }
        return C15768e.ad(AbstractC7354e.purchase(i, vip2));
    }

    public static C3251e license(C5026e c5026e) {
        C0465e m1329interface = C3251e.m1329interface();
        m1329interface.appmetrica();
        C3251e.applovin((C3251e) m1329interface.f9709e);
        C5928e metrica2 = metrica(c5026e.ad);
        m1329interface.appmetrica();
        C3251e.ads((C3251e) m1329interface.f9709e, metrica2);
        byte[] vip2 = c5026e.vip.vip();
        C2096e yandex2 = AbstractC10498e.yandex(0, vip2.length, vip2);
        m1329interface.appmetrica();
        C3251e.premium((C3251e) m1329interface.f9709e, yandex2);
        return (C3251e) m1329interface.ad();
    }

    public static C5928e metrica(C12835e c12835e) {
        C16766e m2005interface = C5928e.m2005interface();
        EnumC10749e enumC10749e = (EnumC10749e) yandex.metrica(c12835e.ad);
        m2005interface.appmetrica();
        C5928e.applovin((C5928e) m2005interface.f9709e, enumC10749e);
        EnumC5703e enumC5703e = (EnumC5703e) startapp.metrica(c12835e.vip);
        m2005interface.appmetrica();
        C5928e.ads((C5928e) m2005interface.f9709e, enumC5703e);
        EnumC6108e enumC6108e = (EnumC6108e) adcel.metrica(c12835e.metrica);
        m2005interface.appmetrica();
        C5928e.premium((C5928e) m2005interface.f9709e, enumC6108e);
        return (C5928e) m2005interface.ad();
    }

    public static C12835e vip(EnumC3021e enumC3021e, C5928e c5928e) {
        C11106e vip2 = C12835e.vip();
        vip2.f22006e = (C5709e) billing.vip(enumC3021e);
        vip2.f22008e = (C13903e) yandex.vip(c5928e.m2006class());
        vip2.f22007e = (C5031e) startapp.vip(c5928e.firebase());
        vip2.f22009e = (C1062e) adcel.vip(c5928e.subs());
        return vip2.pro();
    }
}
