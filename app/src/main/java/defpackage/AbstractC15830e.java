package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۤۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15830e {
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
        C15768e metrica2 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        C15768e metrica3 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        ad = new C13507e(C3953e.class, new C5275e(13));
        vip = new C10221e(metrica2, new C5275e(14));
        metrica = new C13780e(C0225e.class, new C5275e(15));
        license = new C17594e(metrica3, new C5275e(16));
        appmetrica = new C13780e(C2732e.class, new C5275e(17));
        purchase = new C17594e(metrica2, new C5275e(18));
        C17424e ad2 = C5720e.ad();
        ad2.advert(EnumC3021e.RAW, C10607e.license);
        ad2.advert(EnumC3021e.TINK, C10607e.vip);
        EnumC3021e enumC3021e = EnumC3021e.LEGACY;
        C10607e c10607e = C10607e.metrica;
        ad2.advert(enumC3021e, c10607e);
        ad2.advert(EnumC3021e.CRUNCHY, c10607e);
        billing = ad2.Signature();
        C17424e ad3 = C5720e.ad();
        ad3.advert(EnumC10611e.SHA1, C1906e.vip);
        ad3.advert(EnumC10611e.SHA224, C1906e.metrica);
        ad3.advert(EnumC10611e.SHA256, C1906e.license);
        ad3.advert(EnumC10611e.SHA384, C1906e.appmetrica);
        ad3.advert(EnumC10611e.SHA512, C1906e.purchase);
        yandex = ad3.Signature();
        C17424e ad4 = C5720e.ad();
        ad4.advert(EnumC10386e.NIST_P256, C16149e.vip);
        ad4.advert(EnumC10386e.NIST_P384, C16149e.metrica);
        ad4.advert(EnumC10386e.NIST_P521, C16149e.license);
        ad4.advert(EnumC10386e.CURVE25519, C16149e.appmetrica);
        startapp = ad4.Signature();
        C17424e ad5 = C5720e.ad();
        ad5.advert(EnumC3951e.UNCOMPRESSED, C13194e.metrica);
        ad5.advert(EnumC3951e.COMPRESSED, C13194e.vip);
        ad5.advert(EnumC3951e.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, C13194e.license);
        adcel = ad5.Signature();
    }

    public static C3953e ad(EnumC3021e enumC3021e, C13327e c13327e) {
        C2455e m2323interface = C7818e.m2323interface();
        m2323interface.yandex(c13327e.crashlytics().ads().firebase());
        m2323interface.billing(EnumC3021e.RAW);
        m2323interface.startapp(c13327e.crashlytics().ads().m2325class());
        C7818e c7818e = (C7818e) m2323interface.ad();
        C2532e vip2 = C3953e.vip();
        vip2.f6384e = (C10607e) billing.vip(enumC3021e);
        vip2.f6388e = (C16149e) startapp.vip(c13327e.m3556class().subs());
        vip2.f6386e = (C1906e) yandex.vip(c13327e.m3556class().firebase());
        vip2.m916e(AbstractC15268e.license(c7818e.appmetrica()));
        C15768e ad2 = C15768e.ad(c13327e.m3556class().m255class().adcel());
        if (ad2.ad.length == 0) {
            vip2.f6389e = null;
        } else {
            vip2.f6389e = ad2;
        }
        if (!c13327e.m3556class().subs().equals(EnumC10386e.CURVE25519)) {
            vip2.f6385e = (C13194e) adcel.vip(c13327e.firebase());
        } else if (!c13327e.firebase().equals(EnumC3951e.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return vip2.inmobi();
    }

    public static C16865e license(C0225e c0225e) {
        C3953e c3953e = c0225e.ad;
        if (c3953e.ad.equals(C16149e.appmetrica)) {
            C10419e m4198this = C16865e.m4198this();
            m4198this.appmetrica();
            C16865e.applovin((C16865e) m4198this.f9709e);
            C13327e metrica2 = metrica(c3953e);
            m4198this.appmetrica();
            C16865e.ads((C16865e) m4198this.f9709e, metrica2);
            byte[] vip2 = c0225e.metrica.vip();
            C2096e yandex2 = AbstractC10498e.yandex(0, vip2.length, vip2);
            m4198this.appmetrica();
            C16865e.premium((C16865e) m4198this.f9709e, yandex2);
            C2096e c2096e = AbstractC10498e.f20717e;
            m4198this.appmetrica();
            C16865e.subs((C16865e) m4198this.f9709e, c2096e);
            return (C16865e) m4198this.ad();
        }
        int vip3 = vip(c3953e.ad);
        ECPoint eCPoint = c0225e.vip;
        if (eCPoint == null) {
            throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
        }
        C10419e m4198this2 = C16865e.m4198this();
        m4198this2.appmetrica();
        C16865e.applovin((C16865e) m4198this2.f9709e);
        C13327e metrica3 = metrica(c3953e);
        m4198this2.appmetrica();
        C16865e.ads((C16865e) m4198this2.f9709e, metrica3);
        byte[] purchase2 = AbstractC7354e.purchase(vip3, eCPoint.getAffineX());
        C2096e yandex3 = AbstractC10498e.yandex(0, purchase2.length, purchase2);
        m4198this2.appmetrica();
        C16865e.premium((C16865e) m4198this2.f9709e, yandex3);
        byte[] purchase3 = AbstractC7354e.purchase(vip3, eCPoint.getAffineY());
        C2096e yandex4 = AbstractC10498e.yandex(0, purchase3.length, purchase3);
        m4198this2.appmetrica();
        C16865e.subs((C16865e) m4198this2.f9709e, yandex4);
        return (C16865e) m4198this2.ad();
    }

    public static C13327e metrica(C3953e c3953e) {
        C11205e m254interface = C0103e.m254interface();
        EnumC10386e enumC10386e = (EnumC10386e) startapp.metrica(c3953e.ad);
        m254interface.appmetrica();
        C0103e.applovin((C0103e) m254interface.f9709e, enumC10386e);
        EnumC10611e enumC10611e = (EnumC10611e) yandex.metrica(c3953e.vip);
        m254interface.appmetrica();
        C0103e.ads((C0103e) m254interface.f9709e, enumC10611e);
        C15768e c15768e = c3953e.purchase;
        if (c15768e != null && c15768e.ad.length > 0) {
            byte[] vip2 = c15768e.vip();
            C2096e yandex2 = AbstractC10498e.yandex(0, vip2.length, vip2);
            m254interface.appmetrica();
            C0103e.premium((C0103e) m254interface.f9709e, yandex2);
        }
        C0103e c0103e = (C0103e) m254interface.ad();
        try {
            C7818e m2324this = C7818e.m2324this(AbstractC15268e.billing(c3953e.appmetrica), C5712e.ad());
            C9568e subs = C2853e.subs();
            C2455e m2323interface = C7818e.m2323interface();
            m2323interface.yandex(m2324this.firebase());
            m2323interface.billing(EnumC3021e.TINK);
            m2323interface.startapp(m2324this.m2325class());
            C7818e c7818e = (C7818e) m2323interface.ad();
            subs.appmetrica();
            C2853e.applovin((C2853e) subs.f9709e, c7818e);
            C2853e c2853e = (C2853e) subs.ad();
            C13194e c13194e = c3953e.metrica;
            if (c13194e == null) {
                c13194e = C13194e.vip;
            }
            C7477e m3555interface = C13327e.m3555interface();
            m3555interface.appmetrica();
            C13327e.applovin((C13327e) m3555interface.f9709e, c0103e);
            m3555interface.appmetrica();
            C13327e.ads((C13327e) m3555interface.f9709e, c2853e);
            EnumC3951e enumC3951e = (EnumC3951e) adcel.metrica(c13194e);
            m3555interface.appmetrica();
            C13327e.premium((C13327e) m3555interface.f9709e, enumC3951e);
            return (C13327e) m3555interface.ad();
        } catch (C8868e e) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
        }
    }

    public static int vip(C16149e c16149e) {
        if (C16149e.vip.equals(c16149e)) {
            return 33;
        }
        if (C16149e.metrica.equals(c16149e)) {
            return 49;
        }
        if (C16149e.license.equals(c16149e)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + c16149e);
    }
}
