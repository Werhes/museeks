package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6893e {
    public static final C6893e Signature;
    public static final C6893e adcel;
    public static final C6893e admob;
    public static final C6893e advert;
    public static final C6893e amazon;
    public static final C6893e appmetrica;
    public static final C6893e billing;
    public static final LinkedHashMap license;
    public static final C6893e loadAd;
    public static final C11021e metrica;
    public static final C6893e mopub;
    public static final C6893e pro;
    public static final C6893e purchase;
    public static final C6893e remoteconfig;
    public static final C6893e smaato;
    public static final C6893e startapp;
    public static final C6893e subscription;
    public static final C17354e vip;
    public static final C6893e yandex;
    public final String ad;

    static {
        C17354e c17354e = new C17354e(25);
        vip = c17354e;
        metrica = new C11021e(11);
        license = new LinkedHashMap();
        C17354e.license(c17354e, "SSL_RSA_WITH_NULL_MD5");
        C17354e.license(c17354e, "SSL_RSA_WITH_NULL_SHA");
        C17354e.license(c17354e, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        C17354e.license(c17354e, "SSL_RSA_WITH_RC4_128_MD5");
        C17354e.license(c17354e, "SSL_RSA_WITH_RC4_128_SHA");
        C17354e.license(c17354e, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        C17354e.license(c17354e, "SSL_RSA_WITH_DES_CBC_SHA");
        appmetrica = C17354e.license(c17354e, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        C17354e.license(c17354e, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        C17354e.license(c17354e, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        C17354e.license(c17354e, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        C17354e.license(c17354e, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        C17354e.license(c17354e, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        C17354e.license(c17354e, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        C17354e.license(c17354e, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        C17354e.license(c17354e, "SSL_DH_anon_WITH_RC4_128_MD5");
        C17354e.license(c17354e, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        C17354e.license(c17354e, "SSL_DH_anon_WITH_DES_CBC_SHA");
        C17354e.license(c17354e, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        C17354e.license(c17354e, "TLS_KRB5_WITH_DES_CBC_SHA");
        C17354e.license(c17354e, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        C17354e.license(c17354e, "TLS_KRB5_WITH_RC4_128_SHA");
        C17354e.license(c17354e, "TLS_KRB5_WITH_DES_CBC_MD5");
        C17354e.license(c17354e, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        C17354e.license(c17354e, "TLS_KRB5_WITH_RC4_128_MD5");
        C17354e.license(c17354e, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        C17354e.license(c17354e, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        C17354e.license(c17354e, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        C17354e.license(c17354e, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        purchase = C17354e.license(c17354e, "TLS_RSA_WITH_AES_128_CBC_SHA");
        C17354e.license(c17354e, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        C17354e.license(c17354e, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        C17354e.license(c17354e, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        billing = C17354e.license(c17354e, "TLS_RSA_WITH_AES_256_CBC_SHA");
        C17354e.license(c17354e, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        C17354e.license(c17354e, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        C17354e.license(c17354e, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        C17354e.license(c17354e, "TLS_RSA_WITH_NULL_SHA256");
        C17354e.license(c17354e, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        C17354e.license(c17354e, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        C17354e.license(c17354e, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        C17354e.license(c17354e, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        C17354e.license(c17354e, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        C17354e.license(c17354e, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        C17354e.license(c17354e, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        C17354e.license(c17354e, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        C17354e.license(c17354e, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        C17354e.license(c17354e, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        C17354e.license(c17354e, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        C17354e.license(c17354e, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        C17354e.license(c17354e, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        C17354e.license(c17354e, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        C17354e.license(c17354e, "TLS_PSK_WITH_RC4_128_SHA");
        C17354e.license(c17354e, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        C17354e.license(c17354e, "TLS_PSK_WITH_AES_128_CBC_SHA");
        C17354e.license(c17354e, "TLS_PSK_WITH_AES_256_CBC_SHA");
        C17354e.license(c17354e, "TLS_RSA_WITH_SEED_CBC_SHA");
        yandex = C17354e.license(c17354e, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        startapp = C17354e.license(c17354e, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        C17354e.license(c17354e, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        C17354e.license(c17354e, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        C17354e.license(c17354e, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        C17354e.license(c17354e, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        C17354e.license(c17354e, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        C17354e.license(c17354e, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        C17354e.license(c17354e, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        C17354e.license(c17354e, "TLS_FALLBACK_SCSV");
        C17354e.license(c17354e, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        C17354e.license(c17354e, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        C17354e.license(c17354e, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        C17354e.license(c17354e, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        C17354e.license(c17354e, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDH_RSA_WITH_NULL_SHA");
        C17354e.license(c17354e, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        C17354e.license(c17354e, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        C17354e.license(c17354e, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        C17354e.license(c17354e, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        adcel = C17354e.license(c17354e, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        mopub = C17354e.license(c17354e, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDH_anon_WITH_NULL_SHA");
        C17354e.license(c17354e, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        C17354e.license(c17354e, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        C17354e.license(c17354e, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        C17354e.license(c17354e, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        C17354e.license(c17354e, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        C17354e.license(c17354e, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        C17354e.license(c17354e, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        C17354e.license(c17354e, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        C17354e.license(c17354e, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        advert = C17354e.license(c17354e, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        smaato = C17354e.license(c17354e, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        C17354e.license(c17354e, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        C17354e.license(c17354e, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        amazon = C17354e.license(c17354e, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        loadAd = C17354e.license(c17354e, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        C17354e.license(c17354e, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        C17354e.license(c17354e, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        C17354e.license(c17354e, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        C17354e.license(c17354e, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        Signature = C17354e.license(c17354e, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        admob = C17354e.license(c17354e, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        C17354e.license(c17354e, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        C17354e.license(c17354e, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        subscription = C17354e.license(c17354e, "TLS_AES_128_GCM_SHA256");
        remoteconfig = C17354e.license(c17354e, "TLS_AES_256_GCM_SHA384");
        pro = C17354e.license(c17354e, "TLS_CHACHA20_POLY1305_SHA256");
        C17354e.license(c17354e, "TLS_AES_128_CCM_SHA256");
        C17354e.license(c17354e, "TLS_AES_128_CCM_8_SHA256");
    }

    public C6893e(String str) {
        this.ad = str;
    }

    public final String toString() {
        return this.ad;
    }
}
