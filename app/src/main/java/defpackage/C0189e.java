package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import ua.itaysonlab.itunesutil.ItunesSearch$ItunesItem;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٜؑ */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0189e implements InterfaceC9566e, InterfaceC9247e, InterfaceC16687e, InterfaceC8895e, InterfaceC2516e, InterfaceC6044e, InterfaceC10808e, InterfaceC15992e, InterfaceC8427e {

    /* renamed from: eّٖۦ */
    public final /* synthetic */ int f1408e;

    public /* synthetic */ C0189e(int i) {
        this.f1408e = i;
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // defpackage.InterfaceC10808e
    /* renamed from: apply */
    public String mo4378apply(Object obj) {
        return (String) C4535e.f9820e.get((ItunesSearch$ItunesItem) obj);
    }

    @Override // defpackage.InterfaceC15992e
    public boolean appmetrica() {
        return false;
    }

    @Override // defpackage.InterfaceC16687e
    public AbstractC14783e billing(InterfaceC8808e interfaceC8808e) {
        C12524e c12524e = (C12524e) interfaceC8808e;
        switch (this.f1408e) {
            case 2:
                if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    C18396e m4479interface = C18396e.m4479interface(c12524e.f25073e, C5712e.ad());
                    if (m4479interface.firebase() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C11467e vip = C9622e.vip();
                    vip.f23072e = Integer.valueOf(m4479interface.subs().size());
                    vip.f23070e = Integer.valueOf(m4479interface.crashlytics().crashlytics());
                    vip.f23069e = (C3700e) AbstractC11932e.vip.vip(m4479interface.crashlytics().subs());
                    vip.f23071e = (C2942e) AbstractC11932e.ad.vip(c12524e.f25072e);
                    C9622e loadAd = vip.loadAd();
                    C12894e c12894e = new C12894e(19, false);
                    c12894e.f25750e = null;
                    c12894e.f25752e = null;
                    c12894e.f25751e = loadAd;
                    c12894e.f25750e = new C17974e(23, C15768e.ad(m4479interface.subs().adcel()));
                    c12894e.f25752e = c12524e.f25077e;
                    return c12894e.mopub();
                } catch (C8868e | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            case 8:
                if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: " + c12524e.f25076e);
                }
                try {
                    C3251e m1328goto = C3251e.m1328goto(c12524e.f25073e, C5712e.ad());
                    if (m1328goto.m1331class() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C12835e vip2 = AbstractC13261e.vip(c12524e.f25072e, m1328goto.crashlytics());
                    return C5026e.smaato(vip2, AbstractC13261e.ad(vip2.ad, m1328goto.firebase().adcel()), c12524e.f25077e);
                } catch (C8868e unused2) {
                    throw new GeneralSecurityException("Parsing HpkePublicKey failed");
                }
            case 10:
                if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: " + c12524e.f25076e);
                }
                try {
                    C4007e m1415interface = C4007e.m1415interface(c12524e.f25073e, C5712e.ad());
                    if (m1415interface.firebase() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C3251e crashlytics = m1415interface.crashlytics();
                    if (crashlytics.m1331class() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C12835e vip3 = AbstractC13261e.vip(c12524e.f25072e, crashlytics.crashlytics());
                    C13903e c13903e = vip3.ad;
                    return C16238e.amazon(C5026e.smaato(vip3, AbstractC13261e.ad(c13903e, crashlytics.firebase().adcel()), c12524e.f25077e), new C17974e(23, C15768e.ad(AbstractC7354e.purchase(AbstractC0097e.ad(c13903e), AbstractC7354e.vip(m1415interface.subs().adcel())))));
                } catch (C8868e unused3) {
                    throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
                }
            case 23:
                if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    C5260e crashlytics2 = C5260e.crashlytics(c12524e.f25073e, C5712e.ad());
                    if (crashlytics2.premium() == 0) {
                        return C6872e.smaato(new C11127e(crashlytics2.ads().premium(), AbstractC9353e.vip(c12524e.f25072e)), c12524e.f25077e);
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + crashlytics2);
                } catch (C8868e e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            default:
                if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    C1937e crashlytics3 = C1937e.crashlytics(c12524e.f25073e, C5712e.ad());
                    if (crashlytics3.premium() == 0) {
                        return C12929e.smaato(AbstractC12876e.ad(crashlytics3.ads(), c12524e.f25072e), c12524e.f25077e);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + crashlytics3);
                } catch (C8868e e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                }
        }
    }

    @Override // defpackage.InterfaceC8895e
    public Object license(AbstractC14783e abstractC14783e) {
        int i;
        byte[] vip;
        byte[] vip2;
        switch (this.f1408e) {
            case 3:
                C16238e c16238e = (C16238e) abstractC14783e;
                C5026e c5026e = c16238e.ad;
                C12835e c12835e = c5026e.ad;
                C13903e c13903e = c12835e.ad;
                C3168e purchase = AbstractC11138e.purchase(c13903e);
                C0680e appmetrica = AbstractC11138e.appmetrica(c12835e.vip);
                InterfaceC17063e license = AbstractC11138e.license(c12835e.metrica);
                C13903e c13903e2 = C13903e.billing;
                boolean equals = c13903e.equals(c13903e2);
                C13903e c13903e3 = C13903e.purchase;
                C13903e c13903e4 = C13903e.appmetrica;
                C13903e c13903e5 = C13903e.license;
                if (equals) {
                    i = 32;
                } else if (c13903e.equals(c13903e5)) {
                    i = 65;
                } else if (c13903e.equals(c13903e4)) {
                    i = 97;
                } else {
                    if (!c13903e.equals(c13903e3)) {
                        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                    }
                    i = 133;
                }
                C13903e c13903e6 = c12835e.ad;
                if (!c13903e6.equals(c13903e2) && !c13903e6.equals(c13903e5) && !c13903e6.equals(c13903e4) && !c13903e6.equals(c13903e3)) {
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                }
                return new C8148e(new C17424e(C15768e.ad(((C15768e) c16238e.vip.f35233e).vip()), c5026e.vip, false, 24), purchase, appmetrica, license, i, c16238e.advert().advert());
            case 4:
                C5026e c5026e2 = (C5026e) abstractC14783e;
                C12835e c12835e2 = c5026e2.ad;
                return new C12267e(c5026e2.vip, AbstractC11138e.purchase(c12835e2.ad), AbstractC11138e.appmetrica(c12835e2.vip), AbstractC11138e.license(c12835e2.metrica), c5026e2.metrica);
            case 11:
                C12524e c12524e = ((C0251e) abstractC14783e).ad;
                C0251e.smaato(c12524e);
                Integer num = c12524e.f25077e;
                InterfaceC7304e interfaceC7304e = (InterfaceC7304e) ((C11159e) C11731e.license.ad(InterfaceC7304e.class, c12524e.f25076e)).ad(c12524e.f25073e);
                EnumC3021e enumC3021e = c12524e.f25072e;
                int ordinal = enumC3021e.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            vip = AbstractC16176e.ad.vip();
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("unknown output prefix type " + enumC3021e);
                        }
                    }
                    vip = AbstractC16176e.ad(num.intValue()).vip();
                } else {
                    vip = AbstractC16176e.vip(num.intValue()).vip();
                }
                return new C14104e(interfaceC7304e, vip);
            case 12:
                C12524e c12524e2 = ((C0251e) abstractC14783e).ad;
                C0251e.smaato(c12524e2);
                Integer num2 = c12524e2.f25077e;
                InterfaceC14710e interfaceC14710e = (InterfaceC14710e) ((C11159e) C11731e.license.ad(InterfaceC14710e.class, c12524e2.f25076e)).ad(c12524e2.f25073e);
                EnumC3021e enumC3021e2 = c12524e2.f25072e;
                int ordinal2 = enumC3021e2.ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 == 3) {
                            vip2 = AbstractC16176e.ad.vip();
                        } else if (ordinal2 != 4) {
                            throw new GeneralSecurityException("unknown output prefix type " + enumC3021e2);
                        }
                    }
                    vip2 = AbstractC16176e.ad(num2.intValue()).vip();
                } else {
                    vip2 = AbstractC16176e.vip(num2.intValue()).vip();
                }
                return new C18370e(interfaceC14710e, vip2);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6872e c6872e = (C6872e) abstractC14783e;
                return new C17862e(AbstractC5156e.ad(c6872e.ad.ad).vip(c6872e.ad.ad), c6872e.vip.vip());
            default:
                C12929e c12929e = (C12929e) abstractC14783e;
                C13993e c13993e = c12929e.ad;
                String str = c13993e.vip;
                AbstractC10947e abstractC10947e = c13993e.license;
                C4536e vip3 = AbstractC5156e.ad(str).vip(str);
                byte[] bArr = C17883e.license;
                try {
                    return new C17862e(new C17883e(C7818e.m2324this(AbstractC15268e.billing(abstractC10947e), C5712e.ad()), vip3), c12929e.vip.vip());
                } catch (C8868e e) {
                    throw new GeneralSecurityException(e);
                }
        }
    }

    @Override // defpackage.InterfaceC9566e
    public AbstractC12699e metrica(C17424e c17424e) {
        switch (this.f1408e) {
            case 0:
                C7818e c7818e = (C7818e) c17424e.f34141e;
                if (!c7818e.firebase().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + c7818e.firebase());
                }
                try {
                    C12706e m3380interface = C12706e.m3380interface(c7818e.m2325class(), C5712e.ad());
                    if (m3380interface.firebase() != 0) {
                        throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + m3380interface.firebase());
                    }
                    C11467e vip = C9622e.vip();
                    vip.f23072e = Integer.valueOf(m3380interface.subs());
                    vip.f23070e = Integer.valueOf(m3380interface.crashlytics().crashlytics());
                    vip.f23069e = (C3700e) AbstractC11932e.vip.vip(m3380interface.crashlytics().subs());
                    vip.f23071e = (C2942e) AbstractC11932e.ad.vip(c7818e.crashlytics());
                    return vip.loadAd();
                } catch (C8868e e) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
                }
            case 6:
                C7818e c7818e2 = (C7818e) c17424e.f34141e;
                if (!c7818e2.firebase().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: " + c7818e2.firebase());
                }
                try {
                    return AbstractC13261e.vip(c7818e2.crashlytics(), C8047e.subs(c7818e2.m2325class(), C5712e.ad()).ads());
                } catch (C8868e e2) {
                    throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e2);
                }
            case 21:
                C7818e c7818e3 = (C7818e) c17424e.f34141e;
                if (c7818e3.firebase().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    try {
                        return new C11127e(C8180e.crashlytics(c7818e3.m2325class(), C5712e.ad()).premium(), AbstractC9353e.vip(c7818e3.crashlytics()));
                    } catch (C8868e e3) {
                        throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e3);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + c7818e3.firebase());
            default:
                C7818e c7818e4 = (C7818e) c17424e.f34141e;
                if (!c7818e4.firebase().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + c7818e4.firebase());
                }
                try {
                    return AbstractC12876e.ad(C6247e.m2057class(c7818e4.m2325class(), C5712e.ad()), c7818e4.crashlytics());
                } catch (C8868e e4) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e4);
                }
        }
    }

    @Override // defpackage.InterfaceC9247e
    public C12524e purchase(AbstractC14783e abstractC14783e) {
        switch (this.f1408e) {
            case 1:
                C1127e c1127e = (C1127e) abstractC14783e;
                C10521e m4477class = C18396e.m4477class();
                C9622e c9622e = c1127e.ad;
                C0988e firebase = C14739e.firebase();
                int i = c9622e.vip;
                firebase.appmetrica();
                C14739e.ads((C14739e) firebase.f9709e, i);
                EnumC10611e enumC10611e = (EnumC10611e) AbstractC11932e.vip.metrica(c9622e.license);
                firebase.appmetrica();
                C14739e.applovin((C14739e) firebase.f9709e, enumC10611e);
                C14739e c14739e = (C14739e) firebase.ad();
                m4477class.appmetrica();
                C18396e.applovin((C18396e) m4477class.f9709e, c14739e);
                byte[] vip = ((C15768e) c1127e.vip.f35233e).vip();
                C2096e yandex = AbstractC10498e.yandex(0, vip.length, vip);
                m4477class.appmetrica();
                C18396e.ads((C18396e) m4477class.f9709e, yandex);
                return C12524e.ad("type.googleapis.com/google.crypto.tink.HmacKey", ((C18396e) m4477class.ad()).purchase(), EnumC13541e.SYMMETRIC, (EnumC3021e) AbstractC11932e.ad.metrica(c1127e.ad.metrica), c1127e.license);
            case 7:
                C5026e c5026e = (C5026e) abstractC14783e;
                return C12524e.ad("type.googleapis.com/google.crypto.tink.HpkePublicKey", AbstractC13261e.license(c5026e).purchase(), EnumC13541e.ASYMMETRIC_PUBLIC, (EnumC3021e) AbstractC13261e.billing.metrica(c5026e.ad.license), c5026e.license);
            case 9:
                C16238e c16238e = (C16238e) abstractC14783e;
                C12081e m1413class = C4007e.m1413class();
                m1413class.appmetrica();
                C4007e.applovin((C4007e) m1413class.f9709e);
                C3251e license = AbstractC13261e.license(c16238e.ad);
                m1413class.appmetrica();
                C4007e.ads((C4007e) m1413class.f9709e, license);
                byte[] vip2 = ((C15768e) c16238e.vip.f35233e).vip();
                C2096e yandex2 = AbstractC10498e.yandex(0, vip2.length, vip2);
                m1413class.appmetrica();
                C4007e.premium((C4007e) m1413class.f9709e, yandex2);
                return C12524e.ad("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((C4007e) m1413class.ad()).purchase(), EnumC13541e.ASYMMETRIC_PRIVATE, (EnumC3021e) AbstractC13261e.billing.metrica(c16238e.ad.ad.license), c16238e.vip());
            case 22:
                C6872e c6872e = (C6872e) abstractC14783e;
                C6171e subs = C5260e.subs();
                C3944e subs2 = C8180e.subs();
                String str = c6872e.ad.ad;
                subs2.appmetrica();
                C8180e.applovin((C8180e) subs2.f9709e, str);
                C8180e c8180e = (C8180e) subs2.ad();
                subs.appmetrica();
                C5260e.applovin((C5260e) subs.f9709e, c8180e);
                return C12524e.ad("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((C5260e) subs.ad()).purchase(), EnumC13541e.REMOTE, AbstractC9353e.ad(c6872e.ad.vip), c6872e.metrica);
            default:
                C12929e c12929e = (C12929e) abstractC14783e;
                C3396e subs3 = C1937e.subs();
                C6247e vip3 = AbstractC12876e.vip(c12929e.ad);
                subs3.appmetrica();
                C1937e.applovin((C1937e) subs3.f9709e, vip3);
                return C12524e.ad("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((C1937e) subs3.ad()).purchase(), EnumC13541e.REMOTE, AbstractC12876e.metrica(c12929e.ad.ad), c12929e.metrica);
        }
    }

    @Override // defpackage.InterfaceC6044e
    public boolean vip(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // defpackage.InterfaceC2516e
    public C17424e yandex(AbstractC12699e abstractC12699e) {
        switch (this.f1408e) {
            case 5:
                C12835e c12835e = (C12835e) abstractC12699e;
                C2455e m2323interface = C7818e.m2323interface();
                m2323interface.yandex("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
                C15922e premium = C8047e.premium();
                C5928e metrica = AbstractC13261e.metrica(c12835e);
                premium.appmetrica();
                C8047e.applovin((C8047e) premium.f9709e, metrica);
                m2323interface.startapp(((C8047e) premium.ad()).purchase());
                m2323interface.billing((EnumC3021e) AbstractC13261e.billing.metrica(c12835e.license));
                return C17424e.admob((C7818e) m2323interface.ad());
            case 20:
                C11127e c11127e = (C11127e) abstractC12699e;
                C2455e m2323interface2 = C7818e.m2323interface();
                m2323interface2.yandex("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                C3944e subs = C8180e.subs();
                String str = c11127e.ad;
                subs.appmetrica();
                C8180e.applovin((C8180e) subs.f9709e, str);
                m2323interface2.startapp(((C8180e) subs.ad()).purchase());
                m2323interface2.billing(AbstractC9353e.ad(c11127e.vip));
                return C17424e.admob((C7818e) m2323interface2.ad());
            default:
                C13993e c13993e = (C13993e) abstractC12699e;
                C2455e m2323interface3 = C7818e.m2323interface();
                m2323interface3.yandex("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                m2323interface3.startapp(AbstractC12876e.vip(c13993e).purchase());
                m2323interface3.billing(AbstractC12876e.metrica(c13993e.ad));
                return C17424e.admob((C7818e) m2323interface3.ad());
        }
    }
}
