package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔؐ */
/* loaded from: classes.dex */
public final /* synthetic */ class C2282e implements InterfaceC8895e, InterfaceC2516e, InterfaceC9566e, InterfaceC9247e, InterfaceC16687e {

    /* renamed from: eّٖۦ */
    public final /* synthetic */ int f5781e;

    /* renamed from: eؘٙؓ */
    public static final C2282e f5779e = new C2282e(0);

    /* renamed from: eًؔؐ */
    public static final C2282e f5778e = new C2282e(1);

    /* renamed from: eؙِٖ */
    public static final C2282e f5780e = new C2282e(2);

    /* renamed from: eّؑؑ */
    public static final C2282e f5777e = new C2282e(3);

    public /* synthetic */ C2282e(int i) {
        this.f5781e = i;
    }

    public List ad(String str, boolean z, boolean z2) {
        return AbstractC7473e.appmetrica(str, z, z2);
    }

    @Override // defpackage.InterfaceC16687e
    public AbstractC14783e billing(InterfaceC8808e interfaceC8808e) {
        C12524e c12524e = (C12524e) interfaceC8808e;
        switch (this.f5781e) {
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    C14311e m3790class = C14311e.m3790class(c12524e.f25073e, C5712e.ad());
                    if (m3790class.crashlytics() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C0909e vip = C0834e.vip();
                    vip.m418break(m3790class.premium().size());
                    vip.m417abstract(m3790class.subs().premium());
                    vip.f3321e = AbstractC10543e.vip(c12524e.f25072e);
                    C0834e tapsense = vip.tapsense();
                    C18478e c18478e = new C18478e(3, false);
                    c18478e.f36227e = null;
                    c18478e.f36229e = null;
                    c18478e.f36228e = tapsense;
                    c18478e.f36227e = new C17974e(23, C15768e.ad(m3790class.premium().adcel()));
                    c18478e.f36229e = c12524e.f25077e;
                    return c18478e.remoteconfig();
                } catch (C8868e | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    C12248e m3329class = C12248e.m3329class(c12524e.f25073e, C5712e.ad());
                    if (m3329class.crashlytics() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (m3329class.premium().firebase() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (m3329class.subs().firebase() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    C2532e vip2 = C11897e.vip();
                    vip2.m904e(m3329class.premium().subs().size());
                    vip2.m896e(m3329class.subs().subs().size());
                    vip2.m921e(m3329class.premium().crashlytics().premium());
                    vip2.m918e(m3329class.subs().crashlytics().crashlytics());
                    vip2.f6384e = AbstractC8702e.vip(m3329class.subs().crashlytics().subs());
                    vip2.f6389e = AbstractC8702e.license(c12524e.f25072e);
                    C11897e isVip = vip2.isVip();
                    C11980e c11980e = new C11980e(2, false);
                    c11980e.f23949e = null;
                    c11980e.f23951e = null;
                    c11980e.f23948e = null;
                    c11980e.f23950e = isVip;
                    c11980e.f23949e = new C17974e(23, C15768e.ad(m3329class.premium().subs().adcel()));
                    c11980e.f23951e = new C17974e(23, C15768e.ad(m3329class.subs().subs().adcel()));
                    c11980e.f23948e = c12524e.f25077e;
                    return c11980e.m3305while();
                } catch (C8868e unused2) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
        }
    }

    @Override // defpackage.InterfaceC8895e
    public Object license(AbstractC14783e abstractC14783e) {
        byte[] vip;
        switch (this.f5781e) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C12524e c12524e = ((C0251e) abstractC14783e).ad;
                C0251e.smaato(c12524e);
                Integer num = c12524e.f25077e;
                InterfaceC6830e interfaceC6830e = (InterfaceC6830e) ((C11159e) C11731e.license.ad(InterfaceC6830e.class, c12524e.f25076e)).ad(c12524e.f25073e);
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
                return new C17862e(interfaceC6830e, vip);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6345e c6345e = (C6345e) abstractC14783e;
                if (c6345e.ad.ad != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                if (!AbstractC1786e.startapp(1)) {
                    throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
                }
                Provider billing = AbstractC1358e.billing();
                if (billing != null) {
                    try {
                        return C13293e.ad(c6345e, billing);
                    } catch (GeneralSecurityException unused) {
                    }
                }
                return new Object();
            case 20:
                C6345e c6345e2 = (C6345e) abstractC14783e;
                if (c6345e2.ad.ad == 32) {
                    return new C2557e(c6345e2);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            default:
                return C9312e.metrica((C0860e) abstractC14783e);
        }
    }

    @Override // defpackage.InterfaceC9566e
    public AbstractC12699e metrica(C17424e c17424e) {
        switch (this.f5781e) {
            case 22:
                C7818e c7818e = (C7818e) c17424e.f34141e;
                if (!c7818e.firebase().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + c7818e.firebase());
                }
                try {
                    C2402e firebase = C2402e.firebase(c7818e.m2325class(), C5712e.ad());
                    C0909e vip = C0834e.vip();
                    vip.m418break(firebase.premium());
                    vip.m417abstract(firebase.subs().premium());
                    vip.f3321e = AbstractC10543e.vip(c7818e.crashlytics());
                    return vip.tapsense();
                } catch (C8868e e) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
                }
            default:
                C7818e c7818e2 = (C7818e) c17424e.f34141e;
                if (!c7818e2.firebase().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + c7818e2.firebase());
                }
                try {
                    C8425e firebase2 = C8425e.firebase(c7818e2.m2325class(), C5712e.ad());
                    if (firebase2.subs().firebase() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2532e vip2 = C11897e.vip();
                    vip2.m904e(firebase2.premium().subs());
                    vip2.m896e(firebase2.subs().subs());
                    vip2.m921e(firebase2.premium().crashlytics().premium());
                    vip2.m918e(firebase2.subs().crashlytics().crashlytics());
                    vip2.f6384e = AbstractC8702e.vip(firebase2.subs().crashlytics().subs());
                    vip2.f6389e = AbstractC8702e.license(c7818e2.crashlytics());
                    return vip2.isVip();
                } catch (C8868e e2) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
                }
        }
    }

    @Override // defpackage.InterfaceC9247e
    public C12524e purchase(AbstractC14783e abstractC14783e) {
        switch (this.f5781e) {
            case 23:
                C6345e c6345e = (C6345e) abstractC14783e;
                C15579e firebase = C14311e.firebase();
                C0834e c0834e = c6345e.ad;
                C15422e subs = C4343e.subs();
                int i = c0834e.vip;
                subs.appmetrica();
                C4343e.applovin((C4343e) subs.f9709e, i);
                C4343e c4343e = (C4343e) subs.ad();
                firebase.appmetrica();
                C14311e.ads((C14311e) firebase.f9709e, c4343e);
                byte[] vip = ((C15768e) c6345e.vip.f35233e).vip();
                C2096e yandex = AbstractC10498e.yandex(0, vip.length, vip);
                firebase.appmetrica();
                C14311e.applovin((C14311e) firebase.f9709e, yandex);
                return C12524e.ad("type.googleapis.com/google.crypto.tink.AesCmacKey", ((C14311e) firebase.ad()).purchase(), EnumC13541e.SYMMETRIC, AbstractC10543e.ad(c6345e.ad.metrica), c6345e.license);
            default:
                C0860e c0860e = (C0860e) abstractC14783e;
                C3791e firebase2 = C12248e.firebase();
                C10795e m3200class = C11331e.m3200class();
                C2551e subs2 = C18340e.subs();
                int i2 = c0860e.ad.metrica;
                subs2.appmetrica();
                C18340e.applovin((C18340e) subs2.f9709e, i2);
                C18340e c18340e = (C18340e) subs2.ad();
                m3200class.appmetrica();
                C11331e.applovin((C11331e) m3200class.f9709e, c18340e);
                byte[] vip2 = ((C15768e) c0860e.vip.f35233e).vip();
                C2096e yandex2 = AbstractC10498e.yandex(0, vip2.length, vip2);
                m3200class.appmetrica();
                C11331e.ads((C11331e) m3200class.f9709e, yandex2);
                C11331e c11331e = (C11331e) m3200class.ad();
                firebase2.appmetrica();
                C12248e.applovin((C12248e) firebase2.f9709e, c11331e);
                C10521e m4477class = C18396e.m4477class();
                C11897e c11897e = c0860e.ad;
                C14739e ad = AbstractC8702e.ad(c11897e);
                m4477class.appmetrica();
                C18396e.applovin((C18396e) m4477class.f9709e, ad);
                byte[] vip3 = ((C15768e) c0860e.metrica.f35233e).vip();
                C2096e yandex3 = AbstractC10498e.yandex(0, vip3.length, vip3);
                m4477class.appmetrica();
                C18396e.ads((C18396e) m4477class.f9709e, yandex3);
                C18396e c18396e = (C18396e) m4477class.ad();
                firebase2.appmetrica();
                C12248e.ads((C12248e) firebase2.f9709e, c18396e);
                return C12524e.ad("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((C12248e) firebase2.ad()).purchase(), EnumC13541e.SYMMETRIC, AbstractC8702e.metrica(c11897e.appmetrica), c0860e.appmetrica);
        }
    }

    @Override // defpackage.InterfaceC2516e
    public C17424e yandex(AbstractC12699e abstractC12699e) {
        switch (this.f5781e) {
            case 21:
                C0834e c0834e = (C0834e) abstractC12699e;
                C2455e m2323interface = C7818e.m2323interface();
                m2323interface.yandex("type.googleapis.com/google.crypto.tink.AesCmacKey");
                C1153e crashlytics = C2402e.crashlytics();
                C15422e subs = C4343e.subs();
                int i = c0834e.vip;
                subs.appmetrica();
                C4343e.applovin((C4343e) subs.f9709e, i);
                C4343e c4343e = (C4343e) subs.ad();
                crashlytics.appmetrica();
                C2402e.ads((C2402e) crashlytics.f9709e, c4343e);
                int i2 = c0834e.ad;
                crashlytics.appmetrica();
                C2402e.applovin((C2402e) crashlytics.f9709e, i2);
                m2323interface.startapp(((C2402e) crashlytics.ad()).purchase());
                m2323interface.billing(AbstractC10543e.ad(c0834e.metrica));
                return C17424e.admob((C7818e) m2323interface.ad());
            default:
                C11897e c11897e = (C11897e) abstractC12699e;
                C2455e m2323interface2 = C7818e.m2323interface();
                m2323interface2.yandex("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                C7053e crashlytics2 = C8425e.crashlytics();
                C17506e firebase = C10021e.firebase();
                C2551e subs2 = C18340e.subs();
                int i3 = c11897e.metrica;
                subs2.appmetrica();
                C18340e.applovin((C18340e) subs2.f9709e, i3);
                C18340e c18340e = (C18340e) subs2.ad();
                firebase.appmetrica();
                C10021e.applovin((C10021e) firebase.f9709e, c18340e);
                int i4 = c11897e.ad;
                firebase.appmetrica();
                C10021e.ads((C10021e) firebase.f9709e, i4);
                C10021e c10021e = (C10021e) firebase.ad();
                crashlytics2.appmetrica();
                C8425e.applovin((C8425e) crashlytics2.f9709e, c10021e);
                C9333e m3379class = C12706e.m3379class();
                C14739e ad = AbstractC8702e.ad(c11897e);
                m3379class.appmetrica();
                C12706e.applovin((C12706e) m3379class.f9709e, ad);
                int i5 = c11897e.vip;
                m3379class.appmetrica();
                C12706e.ads((C12706e) m3379class.f9709e, i5);
                C12706e c12706e = (C12706e) m3379class.ad();
                crashlytics2.appmetrica();
                C8425e.ads((C8425e) crashlytics2.f9709e, c12706e);
                m2323interface2.startapp(((C8425e) crashlytics2.ad()).purchase());
                m2323interface2.billing(AbstractC8702e.metrica(c11897e.appmetrica));
                return C17424e.admob((C7818e) m2323interface2.ad());
        }
    }
}
