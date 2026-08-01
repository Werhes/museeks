package defpackage;

import android.view.autofill.AutofillValue;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؑۧ */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0663e implements InterfaceC8895e, InterfaceC2516e, InterfaceC9566e, InterfaceC9247e, InterfaceC16687e {

    /* renamed from: eّٖۦ */
    public final /* synthetic */ int f2926e;

    public /* synthetic */ C0663e(int i) {
        this.f2926e = i;
    }

    public static /* bridge */ /* synthetic */ AutofillValue appmetrica(Object obj) {
        return (AutofillValue) obj;
    }

    public Cipher ad() {
        try {
            Cipher cipher = (Cipher) AbstractC7416e.ad.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [eٍؚؒ, java.lang.Object] */
    @Override // defpackage.InterfaceC16687e
    public AbstractC14783e billing(InterfaceC8808e interfaceC8808e) {
        C12524e c12524e = (C12524e) interfaceC8808e;
        switch (this.f2926e) {
            case 4:
                if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    C3578e m1378class = C3578e.m1378class(c12524e.f25073e, C5712e.ad());
                    if (m1378class.crashlytics() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C11467e vip = C9325e.vip();
                    vip.m3215interface(m1378class.premium().size());
                    vip.m3210class(m1378class.subs().premium());
                    vip.m3213goto();
                    vip.f23071e = AbstractC14419e.metrica(c12524e.f25072e);
                    C9325e startapp = vip.startapp();
                    C12894e c12894e = new C12894e(3, false);
                    c12894e.f25750e = null;
                    c12894e.f25752e = null;
                    c12894e.f25751e = startapp;
                    c12894e.f25750e = new C17974e(23, C15768e.ad(m1378class.premium().adcel()));
                    c12894e.f25752e = c12524e.f25077e;
                    return c12894e.appmetrica();
                } catch (C8868e unused) {
                    throw new GeneralSecurityException("Parsing AesEaxKey failed");
                }
            case 9:
                if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    C1612e crashlytics = C1612e.crashlytics(c12524e.f25073e, C5712e.ad());
                    if (crashlytics.premium() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C11106e vip2 = C15694e.vip();
                    vip2.m3019return(crashlytics.ads().size());
                    vip2.m3024synchronized();
                    vip2.m3023switch();
                    vip2.f22006e = AbstractC14832e.vip(c12524e.f25072e);
                    C15694e subscription = vip2.subscription();
                    C18478e c18478e = new C18478e(4, false);
                    c18478e.f36227e = null;
                    c18478e.f36229e = null;
                    c18478e.f36228e = subscription;
                    c18478e.f36227e = new C17974e(23, C15768e.ad(crashlytics.ads().adcel()));
                    c18478e.f36229e = c12524e.f25077e;
                    return c18478e.pro();
                } catch (C8868e unused2) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 15:
                if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    C12039e crashlytics2 = C12039e.crashlytics(c12524e.f25073e, C5712e.ad());
                    if (crashlytics2.premium() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C13391e vip3 = C2428e.vip();
                    vip3.remoteconfig(crashlytics2.ads().size());
                    vip3.f26644e = AbstractC1697e.vip(c12524e.f25072e);
                    C2428e yandex = vip3.yandex();
                    ?? obj = new Object();
                    obj.f3322e = null;
                    obj.f3321e = null;
                    obj.f3323e = yandex;
                    obj.f3322e = new C17974e(23, C15768e.ad(crashlytics2.ads().adcel()));
                    obj.f3321e = c12524e.f25077e;
                    return obj.isVip();
                } catch (C8868e unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            default:
                if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
                }
                try {
                    C14867e crashlytics3 = C14867e.crashlytics(c12524e.f25073e, C5712e.ad());
                    if (crashlytics3.premium() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C17424e vip4 = C14664e.vip();
                    vip4.m4318native(crashlytics3.ads().size());
                    vip4.f34141e = AbstractC9960e.vip(c12524e.f25072e);
                    C14664e loadAd = vip4.loadAd();
                    C12894e c12894e2 = new C12894e(4, false);
                    c12894e2.f25750e = null;
                    c12894e2.f25752e = null;
                    c12894e2.f25751e = loadAd;
                    c12894e2.f25750e = new C17974e(23, C15768e.ad(crashlytics3.ads().adcel()));
                    c12894e2.f25752e = c12524e.f25077e;
                    return c12894e2.yandex();
                } catch (C8868e unused4) {
                    throw new GeneralSecurityException("Parsing AesSivKey failed");
                }
        }
    }

    @Override // defpackage.InterfaceC8895e
    public Object license(AbstractC14783e abstractC14783e) {
        switch (this.f2926e) {
            case 0:
                C8059e c8059e = (C8059e) abstractC14783e;
                C6121e c6121e = C13857e.appmetrica;
                if (!AbstractC1786e.startapp(1)) {
                    throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
                }
                C9325e c9325e = c8059e.ad;
                if (c9325e.metrica == 16) {
                    return new C13857e(((C15768e) c8059e.vip.f35233e).vip(), c9325e.vip, c8059e.metrica.vip());
                }
                throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + c9325e.metrica);
            case 5:
                C17092e c17092e = (C17092e) abstractC14783e;
                C15694e c15694e = c17092e.ad;
                int i = c15694e.vip;
                int i2 = c15694e.metrica;
                if (i != 12) {
                    throw new GeneralSecurityException("Expected IV Size 12, got " + c15694e.vip);
                }
                if (i2 == 16) {
                    return new C17862e(((C15768e) c17092e.vip.f35233e).vip(), c17092e.metrica);
                }
                throw new GeneralSecurityException("Expected tag Size 16, got " + i2);
            case 11:
                C4076e c4076e = (C4076e) abstractC14783e;
                C6121e c6121e2 = AbstractC7416e.ad;
                C0663e c0663e = new C0663e(10);
                byte[] bArr = C0429e.license;
                if (C0429e.metrica(c0663e.ad())) {
                    return new C0429e(((C15768e) c4076e.vip.f35233e).vip(), c4076e.metrica.vip(), c0663e);
                }
                throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
            default:
                C12892e c12892e = (C12892e) abstractC14783e;
                AbstractC15115e.ad(c12892e.ad);
                return new C11805e(((C15768e) c12892e.vip.f35233e).vip(), c12892e.metrica);
        }
    }

    @Override // defpackage.InterfaceC9566e
    public AbstractC12699e metrica(C17424e c17424e) {
        switch (this.f2926e) {
            case 2:
                C7818e c7818e = (C7818e) c17424e.f34141e;
                if (!c7818e.firebase().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + c7818e.firebase());
                }
                try {
                    C18317e firebase = C18317e.firebase(c7818e.m2325class(), C5712e.ad());
                    C11467e vip = C9325e.vip();
                    vip.m3215interface(firebase.premium());
                    vip.m3210class(firebase.subs().premium());
                    vip.m3213goto();
                    vip.f23071e = AbstractC14419e.metrica(c7818e.crashlytics());
                    return vip.startapp();
                } catch (C8868e e) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
                }
            case 7:
                C7818e c7818e2 = (C7818e) c17424e.f34141e;
                if (!c7818e2.firebase().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + c7818e2.firebase());
                }
                try {
                    C3569e crashlytics = C3569e.crashlytics(c7818e2.m2325class(), C5712e.ad());
                    if (crashlytics.premium() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    C11106e vip2 = C15694e.vip();
                    vip2.m3019return(crashlytics.ads());
                    vip2.m3024synchronized();
                    vip2.m3023switch();
                    vip2.f22006e = AbstractC14832e.vip(c7818e2.crashlytics());
                    return vip2.subscription();
                } catch (C8868e e2) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e2);
                }
            case 13:
                C7818e c7818e3 = (C7818e) c17424e.f34141e;
                if (!c7818e3.firebase().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + c7818e3.firebase());
                }
                try {
                    C9717e crashlytics2 = C9717e.crashlytics(c7818e3.m2325class(), C5712e.ad());
                    if (crashlytics2.premium() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    C13391e vip3 = C2428e.vip();
                    vip3.remoteconfig(crashlytics2.ads());
                    vip3.f26644e = AbstractC1697e.vip(c7818e3.crashlytics());
                    return vip3.yandex();
                } catch (C8868e e3) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e3);
                }
            default:
                C7818e c7818e4 = (C7818e) c17424e.f34141e;
                if (!c7818e4.firebase().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + c7818e4.firebase());
                }
                try {
                    C13284e crashlytics3 = C13284e.crashlytics(c7818e4.m2325class(), C5712e.ad());
                    if (crashlytics3.premium() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C17424e vip4 = C14664e.vip();
                    vip4.m4318native(crashlytics3.ads());
                    vip4.f34141e = AbstractC9960e.vip(c7818e4.crashlytics());
                    return vip4.loadAd();
                } catch (C8868e e4) {
                    throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e4);
                }
        }
    }

    @Override // defpackage.InterfaceC9247e
    public C12524e purchase(AbstractC14783e abstractC14783e) {
        switch (this.f2926e) {
            case 3:
                C8059e c8059e = (C8059e) abstractC14783e;
                C9124e firebase = C3578e.firebase();
                C8224e ad = AbstractC14419e.ad(c8059e.ad);
                firebase.appmetrica();
                C3578e.applovin((C3578e) firebase.f9709e, ad);
                byte[] vip = ((C15768e) c8059e.vip.f35233e).vip();
                C2096e yandex = AbstractC10498e.yandex(0, vip.length, vip);
                firebase.appmetrica();
                C3578e.ads((C3578e) firebase.f9709e, yandex);
                return C12524e.ad("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C3578e) firebase.ad()).purchase(), EnumC13541e.SYMMETRIC, AbstractC14419e.vip(c8059e.ad.license), c8059e.license);
            case 8:
                C17092e c17092e = (C17092e) abstractC14783e;
                AbstractC14832e.metrica(c17092e.ad);
                C6932e subs = C1612e.subs();
                byte[] vip2 = ((C15768e) c17092e.vip.f35233e).vip();
                C2096e yandex2 = AbstractC10498e.yandex(0, vip2.length, vip2);
                subs.appmetrica();
                C1612e.applovin((C1612e) subs.f9709e, yandex2);
                return C12524e.ad("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C1612e) subs.ad()).purchase(), EnumC13541e.SYMMETRIC, AbstractC14832e.ad(c17092e.ad.license), c17092e.license);
            case 14:
                C4076e c4076e = (C4076e) abstractC14783e;
                C9228e subs2 = C12039e.subs();
                byte[] vip3 = ((C15768e) c4076e.vip.f35233e).vip();
                C2096e yandex3 = AbstractC10498e.yandex(0, vip3.length, vip3);
                subs2.appmetrica();
                C12039e.applovin((C12039e) subs2.f9709e, yandex3);
                return C12524e.ad("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((C12039e) subs2.ad()).purchase(), EnumC13541e.SYMMETRIC, AbstractC1697e.ad(c4076e.ad.vip), c4076e.license);
            default:
                C12892e c12892e = (C12892e) abstractC14783e;
                C15828e subs3 = C14867e.subs();
                byte[] vip4 = ((C15768e) c12892e.vip.f35233e).vip();
                C2096e yandex4 = AbstractC10498e.yandex(0, vip4.length, vip4);
                subs3.appmetrica();
                C14867e.applovin((C14867e) subs3.f9709e, yandex4);
                return C12524e.ad("type.googleapis.com/google.crypto.tink.AesSivKey", ((C14867e) subs3.ad()).purchase(), EnumC13541e.SYMMETRIC, AbstractC9960e.ad(c12892e.ad.vip), c12892e.license);
        }
    }

    @Override // defpackage.InterfaceC2516e
    public C17424e yandex(AbstractC12699e abstractC12699e) {
        switch (this.f2926e) {
            case 1:
                C9325e c9325e = (C9325e) abstractC12699e;
                C2455e m2323interface = C7818e.m2323interface();
                m2323interface.yandex("type.googleapis.com/google.crypto.tink.AesEaxKey");
                C15016e crashlytics = C18317e.crashlytics();
                C8224e ad = AbstractC14419e.ad(c9325e);
                crashlytics.appmetrica();
                C18317e.applovin((C18317e) crashlytics.f9709e, ad);
                int i = c9325e.ad;
                crashlytics.appmetrica();
                C18317e.ads((C18317e) crashlytics.f9709e, i);
                m2323interface.startapp(((C18317e) crashlytics.ad()).purchase());
                m2323interface.billing(AbstractC14419e.vip(c9325e.license));
                return C17424e.admob((C7818e) m2323interface.ad());
            case 6:
                C15694e c15694e = (C15694e) abstractC12699e;
                AbstractC14832e.metrica(c15694e);
                C2455e m2323interface2 = C7818e.m2323interface();
                m2323interface2.yandex("type.googleapis.com/google.crypto.tink.AesGcmKey");
                C2020e subs = C3569e.subs();
                int i2 = c15694e.ad;
                subs.appmetrica();
                C3569e.applovin((C3569e) subs.f9709e, i2);
                m2323interface2.startapp(((C3569e) subs.ad()).purchase());
                m2323interface2.billing(AbstractC14832e.ad(c15694e.license));
                return C17424e.admob((C7818e) m2323interface2.ad());
            case 12:
                C2428e c2428e = (C2428e) abstractC12699e;
                C2455e m2323interface3 = C7818e.m2323interface();
                m2323interface3.yandex("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                C14084e subs2 = C9717e.subs();
                int i3 = c2428e.ad;
                subs2.appmetrica();
                C9717e.applovin((C9717e) subs2.f9709e, i3);
                m2323interface3.startapp(((C9717e) subs2.ad()).purchase());
                m2323interface3.billing(AbstractC1697e.ad(c2428e.vip));
                return C17424e.admob((C7818e) m2323interface3.ad());
            default:
                C14664e c14664e = (C14664e) abstractC12699e;
                C2455e m2323interface4 = C7818e.m2323interface();
                m2323interface4.yandex("type.googleapis.com/google.crypto.tink.AesSivKey");
                C12674e subs3 = C13284e.subs();
                int i4 = c14664e.ad;
                subs3.appmetrica();
                C13284e.applovin((C13284e) subs3.f9709e, i4);
                m2323interface4.startapp(((C13284e) subs3.ad()).purchase());
                m2323interface4.billing(AbstractC9960e.ad(c14664e.vip));
                return C17424e.admob((C7818e) m2323interface4.ad());
        }
    }
}
