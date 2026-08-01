package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5431e {
    public final /* synthetic */ int ad;

    public /* synthetic */ C5431e(int i) {
        this.ad = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [eٍؚؒ, java.lang.Object] */
    public final AbstractC14783e ad(AbstractC12699e abstractC12699e, Integer num) {
        ECParameterSpec eCParameterSpec;
        EnumC6205e enumC6205e;
        C15768e c15768e;
        C17974e c17974e;
        int i = 3;
        int i2 = 4;
        int i3 = 24;
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        switch (this.ad) {
            case 0:
                C0834e c0834e = (C0834e) abstractC12699e;
                int i5 = c0834e.ad;
                if (i5 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                C18478e c18478e = new C18478e(i, (boolean) (objArr == true ? 1 : 0));
                c18478e.f36227e = null;
                c18478e.f36229e = null;
                c18478e.f36228e = c0834e;
                c18478e.f36227e = C17974e.applovin(i5);
                c18478e.f36229e = num;
                return c18478e.remoteconfig();
            case 1:
                C11897e c11897e = (C11897e) abstractC12699e;
                int i6 = c11897e.ad;
                if (i6 != 16 && i6 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                C11980e c11980e = new C11980e(2, (boolean) (objArr2 == true ? 1 : 0));
                c11980e.f23949e = null;
                c11980e.f23951e = null;
                c11980e.f23950e = c11897e;
                c11980e.f23948e = num;
                c11980e.f23949e = C17974e.applovin(i6);
                c11980e.f23951e = C17974e.applovin(c11897e.vip);
                return c11980e.m3305while();
            case 2:
                C9325e c9325e = (C9325e) abstractC12699e;
                int i7 = c9325e.ad;
                if (i7 == 24) {
                    throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
                }
                C12894e c12894e = new C12894e(i, (boolean) (objArr3 == true ? 1 : 0));
                c12894e.f25750e = null;
                c12894e.f25751e = c9325e;
                c12894e.f25752e = num;
                c12894e.f25750e = C17974e.applovin(i7);
                return c12894e.appmetrica();
            case 3:
                C15694e c15694e = (C15694e) abstractC12699e;
                int i8 = c15694e.ad;
                if (i8 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                C18478e c18478e2 = new C18478e(i2, (boolean) (objArr4 == true ? 1 : 0));
                c18478e2.f36227e = null;
                c18478e2.f36228e = c15694e;
                c18478e2.f36229e = num;
                c18478e2.f36227e = C17974e.applovin(i8);
                return c18478e2.pro();
            case 4:
                C2428e c2428e = (C2428e) abstractC12699e;
                ?? obj = new Object();
                obj.f3322e = null;
                obj.f3323e = c2428e;
                obj.f3321e = num;
                obj.f3322e = C17974e.applovin(c2428e.ad);
                return obj.isVip();
            case 5:
                C14664e c14664e = (C14664e) abstractC12699e;
                AbstractC15115e.ad(c14664e);
                C12894e c12894e2 = new C12894e(i2, (boolean) (objArr5 == true ? 1 : 0));
                c12894e2.f25750e = null;
                c12894e2.f25751e = c14664e;
                c12894e2.f25752e = num;
                c12894e2.f25750e = C17974e.applovin(c14664e.ad);
                return c12894e2.yandex();
            case 6:
                return C8187e.smaato(((C11488e) abstractC12699e).ad, C17974e.applovin(32), num);
            case 7:
                C3953e c3953e = (C3953e) abstractC12699e;
                C16149e c16149e = c3953e.ad;
                if (c16149e == C16149e.vip) {
                    eCParameterSpec = AbstractC2827e.ad;
                } else if (c16149e == C16149e.metrica) {
                    eCParameterSpec = AbstractC2827e.vip;
                } else {
                    if (c16149e != C16149e.license) {
                        throw new GeneralSecurityException("Unsupported curve type: " + c16149e);
                    }
                    eCParameterSpec = AbstractC2827e.metrica;
                }
                KeyPair smaato = AbstractC16091e.smaato(eCParameterSpec);
                return C2732e.loadAd(C0225e.amazon(c3953e, ((ECPublicKey) smaato.getPublic()).getW(), num), new C5389e(i3, ((ECPrivateKey) smaato.getPrivate()).getS()));
            case 8:
                C9622e c9622e = (C9622e) abstractC12699e;
                C12894e c12894e3 = new C12894e(19, (boolean) (objArr6 == true ? 1 : 0));
                c12894e3.f25750e = null;
                c12894e3.f25752e = null;
                c12894e3.f25751e = c9622e;
                c12894e3.f25750e = C17974e.applovin(c9622e.ad);
                c12894e3.f25752e = num;
                return c12894e3.mopub();
            case 9:
                C12835e c12835e = (C12835e) abstractC12699e;
                C13903e c13903e = c12835e.ad;
                if (c13903e.equals(C13903e.billing)) {
                    byte[] license = AbstractC14437e.license();
                    c17974e = new C17974e(23, C15768e.ad(license));
                    c15768e = C15768e.ad(AbstractC14437e.adcel(license));
                } else {
                    C13903e c13903e2 = C13903e.license;
                    boolean equals = c13903e.equals(c13903e2);
                    C13903e c13903e3 = C13903e.purchase;
                    C13903e c13903e4 = C13903e.appmetrica;
                    if (!equals && !c13903e.equals(c13903e4) && !c13903e.equals(c13903e3)) {
                        throw new GeneralSecurityException("Unknown KEM ID");
                    }
                    byte[] bArr = AbstractC0097e.ad;
                    if (c13903e == c13903e2) {
                        enumC6205e = EnumC6205e.f12969e;
                    } else if (c13903e == c13903e4) {
                        enumC6205e = EnumC6205e.f12967e;
                    } else {
                        if (c13903e != c13903e3) {
                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                        }
                        enumC6205e = EnumC6205e.f12966e;
                    }
                    KeyPair smaato2 = AbstractC16091e.smaato(AbstractC16091e.loadAd(enumC6205e));
                    C15768e ad = C15768e.ad(AbstractC16091e.isPro(AbstractC16091e.loadAd(enumC6205e).getCurve(), EnumC1901e.f5061e, ((ECPublicKey) smaato2.getPublic()).getW()));
                    C17974e c17974e2 = new C17974e(23, C15768e.ad(AbstractC7354e.purchase(AbstractC0097e.ad(c13903e), ((ECPrivateKey) smaato2.getPrivate()).getS())));
                    c15768e = ad;
                    c17974e = c17974e2;
                }
                return C16238e.amazon(C5026e.smaato(c12835e, c15768e, num), c17974e);
            case 10:
                return C6872e.smaato((C11127e) abstractC12699e, num);
            case 11:
                return C12929e.smaato((C13993e) abstractC12699e, num);
            case 12:
                C7818e c7818e = (C7818e) ((C4062e) abstractC12699e).ad.f34141e;
                C11731e c11731e = C11731e.license;
                InterfaceC7024e vip = c11731e.vip(c7818e.firebase());
                if (!((Boolean) c11731e.vip.get(c7818e.firebase())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                AbstractC10498e m2325class = c7818e.m2325class();
                C11159e c11159e = (C11159e) vip;
                c11159e.getClass();
                C2455e m2323interface = C7818e.m2323interface();
                m2323interface.yandex(c11159e.ad);
                m2323interface.startapp(m2325class);
                m2323interface.billing(EnumC3021e.RAW);
                C7818e c7818e2 = (C7818e) m2323interface.ad();
                C17424e c17424e = new C17424e(c7818e2, AbstractC6336e.ad(c7818e2.firebase()), i4);
                C15619e c15619e = C15619e.vip;
                C12524e c12524e = (C12524e) c15619e.billing(C1825e.vip.vip(c15619e.vip(c17424e), null));
                C15336e m2518interface = C9076e.m2518interface();
                String str = c12524e.f25076e;
                m2518interface.appmetrica();
                C9076e.applovin((C9076e) m2518interface.f9709e, str);
                AbstractC10498e abstractC10498e = c12524e.f25073e;
                m2518interface.appmetrica();
                C9076e.ads((C9076e) m2518interface.f9709e, abstractC10498e);
                EnumC13541e enumC13541e = c12524e.f25075e;
                m2518interface.appmetrica();
                C9076e.premium((C9076e) m2518interface.f9709e, enumC13541e);
                C9076e c9076e = (C9076e) m2518interface.ad();
                return new C0251e(C12524e.ad(c9076e.firebase(), c9076e.m2519class(), c9076e.crashlytics(), c7818e.crashlytics(), num));
            case 13:
                return C7131e.smaato((C12393e) abstractC12699e, C17974e.applovin(32), num);
            default:
                return C3679e.smaato(((C0631e) abstractC12699e).ad, C17974e.applovin(32), num);
        }
    }
}
