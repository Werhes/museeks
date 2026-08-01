package defpackage;

import android.graphics.Insets;
import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.nio.file.Path;
import java.nio.file.WatchService;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥ۠ */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5275e implements InterfaceC5808e, InterfaceC8895e, InterfaceC11751e, InterfaceC2516e, InterfaceC9566e, InterfaceC9247e, InterfaceC16687e {

    /* renamed from: eّٖۦ */
    public final /* synthetic */ int f11363e;

    public /* synthetic */ C5275e(int i) {
        this.f11363e = i;
    }

    public static /* bridge */ /* synthetic */ int amazon(Insets insets) {
        return insets.bottom;
    }

    public static /* bridge */ /* synthetic */ Path appmetrica(Object obj) {
        return (Path) obj;
    }

    public static /* bridge */ /* synthetic */ WatchService startapp(Object obj) {
        return (WatchService) obj;
    }

    public Object ad() {
        HashSet hashSet = new HashSet();
        C11106e vip = C15694e.vip();
        vip.m3024synchronized();
        vip.m3019return(16);
        vip.m3023switch();
        C16372e c16372e = C16372e.f32165e;
        vip.f22006e = c16372e;
        hashSet.add(vip.subscription());
        C11106e vip2 = C15694e.vip();
        vip2.m3024synchronized();
        vip2.m3019return(32);
        vip2.m3023switch();
        vip2.f22006e = c16372e;
        hashSet.add(vip2.subscription());
        C2532e vip3 = C11897e.vip();
        vip3.m904e(16);
        vip3.m896e(32);
        vip3.m918e(16);
        vip3.m921e(16);
        C6325e c6325e = C6325e.f13169e;
        vip3.f6384e = c6325e;
        C15400e c15400e = C15400e.f30386e;
        vip3.f6389e = c15400e;
        hashSet.add(vip3.isVip());
        C2532e vip4 = C11897e.vip();
        vip4.m904e(32);
        vip4.m896e(32);
        vip4.m918e(32);
        vip4.m921e(16);
        vip4.f6384e = c6325e;
        vip4.f6389e = c15400e;
        hashSet.add(vip4.isVip());
        hashSet.add(new C0631e(C14911e.f29549e));
        C17424e vip5 = C14664e.vip();
        vip5.m4318native(64);
        vip5.f34141e = C8776e.license;
        hashSet.add(vip5.loadAd());
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.InterfaceC16687e
    public AbstractC14783e billing(InterfaceC8808e interfaceC8808e) {
        C12524e c12524e = (C12524e) interfaceC8808e;
        switch (this.f11363e) {
            case 16:
                String str = c12524e.f25076e;
                Integer num = c12524e.f25077e;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: " + c12524e.f25076e);
                }
                try {
                    C16865e m4197native = C16865e.m4197native(c12524e.f25073e, C5712e.ad());
                    if (m4197native.m4199class() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C3953e ad = AbstractC15830e.ad(c12524e.f25072e, m4197native.firebase());
                    if (!ad.ad.equals(C16149e.appmetrica)) {
                        return C0225e.amazon(ad, new ECPoint(AbstractC7354e.vip(m4197native.m4201interface().adcel()), AbstractC7354e.vip(m4197native.m4200goto().adcel())), num);
                    }
                    if (m4197native.m4200goto().size() == 0) {
                        return C0225e.smaato(ad, C15768e.ad(m4197native.m4201interface().adcel()), num);
                    }
                    throw new GeneralSecurityException("Y must be empty for X25519 points");
                } catch (C8868e | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            default:
                String str2 = c12524e.f25076e;
                Integer num2 = c12524e.f25077e;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: " + c12524e.f25076e);
                }
                try {
                    C2834e m1214interface = C2834e.m1214interface(c12524e.f25073e, C5712e.ad());
                    if (m1214interface.firebase() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C16865e crashlytics = m1214interface.crashlytics();
                    if (crashlytics.m4199class() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C3953e ad2 = AbstractC15830e.ad(c12524e.f25072e, crashlytics.firebase());
                    if (ad2.ad.equals(C16149e.appmetrica)) {
                        return C2732e.amazon(C0225e.smaato(ad2, C15768e.ad(crashlytics.m4201interface().adcel()), num2), new C17974e(23, C15768e.ad(m1214interface.subs().adcel())));
                    }
                    return C2732e.loadAd(C0225e.amazon(ad2, new ECPoint(AbstractC7354e.vip(crashlytics.m4201interface().adcel()), AbstractC7354e.vip(crashlytics.m4200goto().adcel())), num2), new C5389e(24, AbstractC7354e.vip(m1214interface.subs().adcel())));
                } catch (C8868e | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
        }
    }

    @Override // defpackage.InterfaceC8895e
    public Object license(AbstractC14783e abstractC14783e) {
        byte[] vip;
        switch (this.f11363e) {
            case 1:
                C12524e c12524e = ((C0251e) abstractC14783e).ad;
                C0251e.smaato(c12524e);
                Integer num = c12524e.f25077e;
                InterfaceC13627e interfaceC13627e = (InterfaceC13627e) ((C11159e) C11731e.license.ad(InterfaceC13627e.class, c12524e.f25076e)).ad(c12524e.f25073e);
                EnumC3021e enumC3021e = c12524e.f25072e;
                int ordinal = enumC3021e.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            vip = AbstractC16176e.ad.vip();
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("unknown output prefix type " + enumC3021e.vip());
                        }
                    }
                    vip = AbstractC16176e.ad(num.intValue()).vip();
                } else {
                    vip = AbstractC16176e.vip(num.intValue()).vip();
                }
                return new C0482e(interfaceC13627e, enumC3021e, vip);
            case 10:
                C2732e c2732e = (C2732e) abstractC14783e;
                EnumC6205e enumC6205e = (EnumC6205e) C7561e.billing.metrica(c2732e.ad.ad.ad);
                ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) C7174e.purchase.ad.isPro("EC")).generatePrivate(new ECPrivateKeySpec(AbstractC7354e.vip(AbstractC7354e.appmetrica((BigInteger) c2732e.vip.f11540e)), AbstractC16091e.loadAd(enumC6205e)));
                byte[] bArr = new byte[0];
                C3953e c3953e = c2732e.ad.ad;
                C15768e c15768e = c3953e.purchase;
                if (c15768e != null) {
                    bArr = c15768e.vip();
                }
                return new C16705e(eCPrivateKey, bArr, C7561e.vip(c3953e.vip), (EnumC1901e) C7561e.yandex.metrica(c3953e.metrica), AbstractC15143e.appmetrica(c3953e), c2732e.advert().advert().vip());
            default:
                C0225e c0225e = (C0225e) abstractC14783e;
                EnumC6205e enumC6205e2 = (EnumC6205e) C7561e.billing.metrica(c0225e.ad.ad);
                ECPoint eCPoint = c0225e.vip;
                byte[] byteArray = eCPoint.getAffineX().toByteArray();
                byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
                ECParameterSpec loadAd = AbstractC16091e.loadAd(enumC6205e2);
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
                AbstractC2827e.vip(eCPoint2, loadAd.getCurve());
                ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) C7174e.purchase.ad.isPro("EC")).generatePublic(new ECPublicKeySpec(eCPoint2, loadAd));
                byte[] bArr2 = new byte[0];
                C3953e c3953e2 = c0225e.ad;
                C15768e c15768e2 = c3953e2.purchase;
                if (c15768e2 != null) {
                    bArr2 = c15768e2.vip();
                }
                return new C7561e(eCPublicKey, bArr2, C7561e.vip(c3953e2.vip), (EnumC1901e) C7561e.yandex.metrica(c3953e2.metrica), AbstractC15143e.appmetrica(c3953e2), c0225e.license.vip());
        }
    }

    @Override // defpackage.InterfaceC9566e
    public AbstractC12699e metrica(C17424e c17424e) {
        C7818e c7818e = (C7818e) c17424e.f34141e;
        if (!c7818e.firebase().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: " + c7818e.firebase());
        }
        try {
            return AbstractC15830e.ad(c7818e.crashlytics(), C2337e.subs(c7818e.m2325class(), C5712e.ad()).ads());
        } catch (C8868e e) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
        }
    }

    @Override // defpackage.InterfaceC9247e
    public C12524e purchase(AbstractC14783e abstractC14783e) {
        switch (this.f11363e) {
            case 15:
                C0225e c0225e = (C0225e) abstractC14783e;
                return C12524e.ad("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", AbstractC15830e.license(c0225e).purchase(), EnumC13541e.ASYMMETRIC_PUBLIC, (EnumC3021e) AbstractC15830e.billing.metrica(c0225e.ad.license), c0225e.appmetrica);
            default:
                C2732e c2732e = (C2732e) abstractC14783e;
                C14525e m1212class = C2834e.m1212class();
                m1212class.appmetrica();
                C2834e.applovin((C2834e) m1212class.f9709e);
                C16865e license = AbstractC15830e.license(c2732e.ad);
                m1212class.appmetrica();
                C2834e.ads((C2834e) m1212class.f9709e, license);
                C3953e c3953e = c2732e.ad.ad;
                C16149e c16149e = c3953e.ad;
                if (c16149e.equals(C16149e.appmetrica)) {
                    byte[] vip = ((C15768e) c2732e.metrica.f35233e).vip();
                    C2096e yandex = AbstractC10498e.yandex(0, vip.length, vip);
                    m1212class.appmetrica();
                    C2834e.premium((C2834e) m1212class.f9709e, yandex);
                } else {
                    byte[] purchase = AbstractC7354e.purchase(AbstractC15830e.vip(c16149e), (BigInteger) c2732e.vip.f11540e);
                    C2096e yandex2 = AbstractC10498e.yandex(0, purchase.length, purchase);
                    m1212class.appmetrica();
                    C2834e.premium((C2834e) m1212class.f9709e, yandex2);
                }
                return C12524e.ad("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((C2834e) m1212class.ad()).purchase(), EnumC13541e.ASYMMETRIC_PRIVATE, (EnumC3021e) AbstractC15830e.billing.metrica(c3953e.license), c2732e.vip());
        }
    }

    @Override // defpackage.InterfaceC11751e
    public void release() {
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        Set m4510e = c18464e.m4510e(C7934e.class);
        C6325e c6325e = C6325e.f13164e;
        if (c6325e == null) {
            synchronized (C6325e.class) {
                try {
                    c6325e = C6325e.f13164e;
                    if (c6325e == null) {
                        c6325e = new C6325e((byte) 0, 0);
                        C6325e.f13164e = c6325e;
                    }
                } finally {
                }
            }
        }
        return new C1779e(m4510e, c6325e);
    }

    @Override // defpackage.InterfaceC2516e
    public C17424e yandex(AbstractC12699e abstractC12699e) {
        C3953e c3953e = (C3953e) abstractC12699e;
        C2455e m2323interface = C7818e.m2323interface();
        m2323interface.yandex("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        C13354e premium = C2337e.premium();
        C13327e metrica = AbstractC15830e.metrica(c3953e);
        premium.appmetrica();
        C2337e.applovin((C2337e) premium.f9709e, metrica);
        m2323interface.startapp(((C2337e) premium.ad()).purchase());
        m2323interface.billing((EnumC3021e) AbstractC15830e.billing.metrica(c3953e.license));
        return C17424e.admob((C7818e) m2323interface.ad());
    }
}
