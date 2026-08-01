package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۦً, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12112e {
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
        c17895e.vip(C15761e.vip);
        c17895e.ad(C15761e.metrica);
        AbstractC0508e.ad();
        int i = AbstractC18290e.appmetrica;
        if (!AbstractC1786e.adcel(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C13507e c13507e = AbstractC8702e.ad;
        C15619e c15619e = C15619e.vip;
        c15619e.purchase(AbstractC8702e.ad);
        c15619e.appmetrica(AbstractC8702e.vip);
        c15619e.license(AbstractC8702e.metrica);
        c15619e.metrica(AbstractC8702e.license);
        c17895e.ad(AbstractC18290e.ad);
        C14286e c14286e = C14286e.vip;
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", AbstractC12046e.appmetrica);
        C2532e vip = C11897e.vip();
        vip.m904e(16);
        vip.m896e(32);
        vip.m918e(16);
        vip.m921e(16);
        C6325e c6325e = C6325e.f13169e;
        vip.f6384e = c6325e;
        C15400e c15400e = C15400e.f30386e;
        vip.f6389e = c15400e;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", vip.isVip());
        hashMap.put("AES256_CTR_HMAC_SHA256", AbstractC12046e.purchase);
        C2532e vip2 = C11897e.vip();
        vip2.m904e(32);
        vip2.m896e(32);
        vip2.m918e(32);
        vip2.m921e(16);
        vip2.f6384e = c6325e;
        vip2.f6389e = c15400e;
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", vip2.isVip());
        c14286e.vip(DesugarCollections.unmodifiableMap(hashMap));
        C12722e c12722e = C12722e.vip;
        c12722e.ad(AbstractC18290e.metrica, C11897e.class);
        C1825e c1825e = C1825e.vip;
        c1825e.ad(AbstractC18290e.license, C11897e.class);
        C11731e c11731e = C11731e.license;
        c11731e.appmetrica(AbstractC18290e.vip, i, true);
        int i2 = AbstractC10831e.appmetrica;
        if (!AbstractC1786e.adcel(i2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        c15619e.purchase(AbstractC14832e.ad);
        c15619e.appmetrica(AbstractC14832e.vip);
        c15619e.license(AbstractC14832e.metrica);
        c15619e.metrica(AbstractC14832e.license);
        c17895e.ad(AbstractC10831e.ad);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_GCM", AbstractC12046e.ad);
        C11106e vip3 = C15694e.vip();
        vip3.m3024synchronized();
        vip3.m3019return(16);
        vip3.m3023switch();
        C16372e c16372e = C16372e.f32165e;
        vip3.f22006e = c16372e;
        hashMap2.put("AES128_GCM_RAW", vip3.subscription());
        hashMap2.put("AES256_GCM", AbstractC12046e.vip);
        C11106e vip4 = C15694e.vip();
        vip4.m3024synchronized();
        vip4.m3019return(32);
        vip4.m3023switch();
        vip4.f22006e = c16372e;
        hashMap2.put("AES256_GCM_RAW", vip4.subscription());
        c14286e.vip(DesugarCollections.unmodifiableMap(hashMap2));
        c12722e.ad(AbstractC10831e.metrica, C15694e.class);
        c1825e.ad(AbstractC10831e.license, C15694e.class);
        c11731e.appmetrica(AbstractC10831e.vip, i2, true);
        if (AbstractC17852e.ad()) {
            return;
        }
        C9938e c9938e = AbstractC13421e.ad;
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        c15619e.purchase(AbstractC14419e.ad);
        c15619e.appmetrica(AbstractC14419e.vip);
        c15619e.license(AbstractC14419e.metrica);
        c15619e.metrica(AbstractC14419e.license);
        c17895e.ad(AbstractC13421e.ad);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AES128_EAX", AbstractC12046e.metrica);
        C11467e vip5 = C9325e.vip();
        vip5.m3210class(16);
        vip5.m3215interface(16);
        vip5.m3213goto();
        C11594e c11594e = C11594e.f23291e;
        vip5.f23071e = c11594e;
        hashMap3.put("AES128_EAX_RAW", vip5.startapp());
        hashMap3.put("AES256_EAX", AbstractC12046e.license);
        C11467e vip6 = C9325e.vip();
        vip6.m3210class(16);
        vip6.m3215interface(32);
        vip6.m3213goto();
        vip6.f23071e = c11594e;
        hashMap3.put("AES256_EAX_RAW", vip6.startapp());
        c14286e.vip(DesugarCollections.unmodifiableMap(hashMap3));
        c1825e.ad(AbstractC13421e.metrica, C9325e.class);
        c11731e.license(AbstractC13421e.vip, true);
        C9938e c9938e2 = AbstractC15711e.ad;
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        c15619e.purchase(AbstractC1697e.ad);
        c15619e.appmetrica(AbstractC1697e.vip);
        c15619e.license(AbstractC1697e.metrica);
        c15619e.metrica(AbstractC1697e.license);
        HashMap hashMap4 = new HashMap();
        C13391e vip7 = C2428e.vip();
        vip7.remoteconfig(16);
        C15780e c15780e = C15780e.f31086e;
        vip7.f26644e = c15780e;
        hashMap4.put("AES128_GCM_SIV", vip7.yandex());
        C13391e vip8 = C2428e.vip();
        vip8.remoteconfig(16);
        C15780e c15780e2 = C15780e.f31085e;
        vip8.f26644e = c15780e2;
        hashMap4.put("AES128_GCM_SIV_RAW", vip8.yandex());
        C13391e vip9 = C2428e.vip();
        vip9.remoteconfig(32);
        vip9.f26644e = c15780e;
        hashMap4.put("AES256_GCM_SIV", vip9.yandex());
        C13391e vip10 = C2428e.vip();
        vip10.remoteconfig(32);
        vip10.f26644e = c15780e2;
        hashMap4.put("AES256_GCM_SIV_RAW", vip10.yandex());
        c14286e.vip(DesugarCollections.unmodifiableMap(hashMap4));
        c12722e.ad(AbstractC15711e.metrica, C2428e.class);
        c1825e.ad(AbstractC15711e.vip, C2428e.class);
        c17895e.ad(AbstractC15711e.ad);
        c11731e.license(AbstractC15711e.license, true);
        C9938e c9938e3 = AbstractC6865e.ad;
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        c15619e.purchase(AbstractC11489e.ad);
        c15619e.appmetrica(AbstractC11489e.vip);
        c15619e.license(AbstractC11489e.metrica);
        c15619e.metrica(AbstractC11489e.license);
        c17895e.ad(AbstractC6865e.ad);
        c1825e.ad(AbstractC6865e.vip, C11488e.class);
        HashMap hashMap5 = new HashMap();
        hashMap5.put("CHACHA20_POLY1305", new C11488e(C11278e.f22658e));
        hashMap5.put("CHACHA20_POLY1305_RAW", new C11488e(C11278e.f22657e));
        c14286e.vip(DesugarCollections.unmodifiableMap(hashMap5));
        c11731e.license(AbstractC6865e.metrica, true);
        C9938e c9938e4 = AbstractC16418e.ad;
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        c15619e.purchase(AbstractC9353e.ad);
        c15619e.appmetrica(AbstractC9353e.vip);
        c15619e.license(AbstractC9353e.metrica);
        c15619e.metrica(AbstractC9353e.license);
        c17895e.ad(AbstractC16418e.ad);
        c1825e.ad(AbstractC16418e.metrica, C11127e.class);
        c11731e.license(AbstractC16418e.vip, true);
        C11159e c11159e = AbstractC15346e.ad;
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        c15619e.purchase(AbstractC12876e.ad);
        c15619e.appmetrica(AbstractC12876e.vip);
        c15619e.license(AbstractC12876e.metrica);
        c15619e.metrica(AbstractC12876e.license);
        c1825e.ad(AbstractC15346e.vip, C13993e.class);
        c17895e.ad(AbstractC15346e.metrica);
        c11731e.license(AbstractC15346e.ad, true);
        C9938e c9938e5 = AbstractC11385e.ad;
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        c15619e.purchase(AbstractC11085e.ad);
        c15619e.appmetrica(AbstractC11085e.vip);
        c15619e.license(AbstractC11085e.metrica);
        c15619e.metrica(AbstractC11085e.license);
        c17895e.ad(AbstractC11385e.ad);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("XCHACHA20_POLY1305", new C0631e(C14911e.f29548e));
        hashMap6.put("XCHACHA20_POLY1305_RAW", new C0631e(C14911e.f29549e));
        c14286e.vip(DesugarCollections.unmodifiableMap(hashMap6));
        c1825e.ad(AbstractC11385e.license, C0631e.class);
        c12722e.ad(AbstractC11385e.metrica, C0631e.class);
        c11731e.license(AbstractC11385e.vip, true);
        c15619e.purchase(AbstractC10331e.ad);
        c15619e.appmetrica(AbstractC10331e.vip);
        c15619e.license(AbstractC10331e.metrica);
        c15619e.metrica(AbstractC10331e.license);
        HashMap hashMap7 = new HashMap();
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE", AbstractC12046e.billing);
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", AbstractC12046e.yandex);
        hashMap7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", AbstractC12046e.startapp);
        hashMap7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", AbstractC12046e.adcel);
        c14286e.vip(DesugarCollections.unmodifiableMap(hashMap7));
        c17895e.ad(AbstractC9164e.remoteconfig);
        c1825e.ad(AbstractC9164e.subscription, C12393e.class);
    }
}
