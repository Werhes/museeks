package defpackage;

import android.net.Uri;
import j$.util.stream.IntStream;
import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۛۛ */
/* loaded from: classes.dex */
public final /* synthetic */ class C2864e implements InterfaceC6440e, InterfaceC8895e, InterfaceC2516e, InterfaceC9566e, InterfaceC9247e, InterfaceC16687e {

    /* renamed from: eّٖۦ */
    public final /* synthetic */ int f6826e;

    public /* synthetic */ C2864e(int i) {
        this.f6826e = i;
    }

    public static /* synthetic */ IntStream adcel(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.chars());
    }

    @Override // defpackage.InterfaceC6440e
    public InterfaceC6440e ad(C4524e c4524e) {
        return this;
    }

    @Override // defpackage.InterfaceC16687e
    public AbstractC14783e billing(InterfaceC8808e interfaceC8808e) {
        C12524e c12524e = (C12524e) interfaceC8808e;
        switch (this.f6826e) {
            case 10:
                if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    C13697e m3638class = C13697e.m3638class(c12524e.f25073e, C5712e.ad());
                    if (m3638class.crashlytics() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (m3638class.premium().size() != 32) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    return C7131e.smaato(C12393e.vip(AbstractC10331e.vip(c12524e.f25072e), m3638class.subs().premium()), new C17974e(23, C15768e.ad(m3638class.premium().adcel())), c12524e.f25077e);
                } catch (C8868e unused) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            default:
                if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    C6013e crashlytics = C6013e.crashlytics(c12524e.f25073e, C5712e.ad());
                    if (crashlytics.premium() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    return C3679e.smaato(AbstractC11085e.vip(c12524e.f25072e), new C17974e(23, C15768e.ad(crashlytics.ads().adcel())), c12524e.f25077e);
                } catch (C8868e unused2) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // defpackage.InterfaceC8895e
    public Object license(AbstractC14783e abstractC14783e) {
        switch (this.f6826e) {
            case 6:
                C7131e c7131e = (C7131e) abstractC14783e;
                int i = c7131e.ad.vip;
                if (i < 8 || i > 12) {
                    throw new GeneralSecurityException("invalid salt size");
                }
                return new C0094e(((C15768e) c7131e.vip.f35233e).vip(), c7131e.metrica, c7131e.ad.vip);
            default:
                C3679e c3679e = (C3679e) abstractC14783e;
                try {
                    C14868e.metrica();
                    return new C3347e(((C15768e) c3679e.vip.f35233e).vip(), c3679e.metrica.vip(), C14868e.metrica().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new C17862e(((C15768e) c3679e.vip.f35233e).vip(), 4, c3679e.metrica.vip());
                }
        }
    }

    @Override // defpackage.InterfaceC9566e
    public AbstractC12699e metrica(C17424e c17424e) {
        switch (this.f6826e) {
            case 8:
                C7818e c7818e = (C7818e) c17424e.f34141e;
                if (!c7818e.firebase().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + c7818e.firebase());
                }
                try {
                    C15699e crashlytics = C15699e.crashlytics(c7818e.m2325class(), C5712e.ad());
                    if (crashlytics.premium() == 0) {
                        return C12393e.vip(AbstractC10331e.vip(c7818e.crashlytics()), crashlytics.ads().premium());
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (C8868e e) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
                }
            default:
                C7818e c7818e2 = (C7818e) c17424e.f34141e;
                if (!c7818e2.firebase().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + c7818e2.firebase());
                }
                try {
                    if (C13785e.premium(c7818e2.m2325class(), C5712e.ad()).ads() == 0) {
                        return new C0631e(AbstractC11085e.vip(c7818e2.crashlytics()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (C8868e e2) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
                }
        }
    }

    @Override // defpackage.InterfaceC6440e
    public InterfaceC1272e[] mopub(Uri uri, Map map) {
        return new C0689e[]{new C0689e(0)};
    }

    @Override // defpackage.InterfaceC9247e
    public C12524e purchase(AbstractC14783e abstractC14783e) {
        switch (this.f6826e) {
            case 9:
                C7131e c7131e = (C7131e) abstractC14783e;
                C15344e firebase = C13697e.firebase();
                byte[] vip = ((C15768e) c7131e.vip.f35233e).vip();
                C2096e yandex = AbstractC10498e.yandex(0, vip.length, vip);
                firebase.appmetrica();
                C13697e.ads((C13697e) firebase.f9709e, yandex);
                C6208e subs = C9530e.subs();
                C12393e c12393e = c7131e.ad;
                int i = c12393e.vip;
                subs.appmetrica();
                C9530e.applovin((C9530e) subs.f9709e, i);
                C9530e c9530e = (C9530e) subs.ad();
                firebase.appmetrica();
                C13697e.applovin((C13697e) firebase.f9709e, c9530e);
                return C12524e.ad("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((C13697e) firebase.ad()).purchase(), EnumC13541e.SYMMETRIC, AbstractC10331e.ad(c12393e.ad), c7131e.license);
            default:
                C3679e c3679e = (C3679e) abstractC14783e;
                C10395e subs2 = C6013e.subs();
                byte[] vip2 = ((C15768e) c3679e.vip.f35233e).vip();
                C2096e yandex2 = AbstractC10498e.yandex(0, vip2.length, vip2);
                subs2.appmetrica();
                C6013e.applovin((C6013e) subs2.f9709e, yandex2);
                return C12524e.ad("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((C6013e) subs2.ad()).purchase(), EnumC13541e.SYMMETRIC, AbstractC11085e.ad(c3679e.ad.ad), c3679e.license);
        }
    }

    @Override // defpackage.InterfaceC6440e
    public InterfaceC6440e startapp(boolean z) {
        return this;
    }

    @Override // defpackage.InterfaceC6440e
    public InterfaceC6440e vip(int i) {
        return this;
    }

    @Override // defpackage.InterfaceC2516e
    public C17424e yandex(AbstractC12699e abstractC12699e) {
        switch (this.f6826e) {
            case 7:
                C12393e c12393e = (C12393e) abstractC12699e;
                C2455e m2323interface = C7818e.m2323interface();
                m2323interface.yandex("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                C6991e subs = C15699e.subs();
                C6208e subs2 = C9530e.subs();
                int i = c12393e.vip;
                subs2.appmetrica();
                C9530e.applovin((C9530e) subs2.f9709e, i);
                C9530e c9530e = (C9530e) subs2.ad();
                subs.appmetrica();
                C15699e.applovin((C15699e) subs.f9709e, c9530e);
                m2323interface.startapp(((C15699e) subs.ad()).purchase());
                m2323interface.billing(AbstractC10331e.ad(c12393e.ad));
                return C17424e.admob((C7818e) m2323interface.ad());
            default:
                C2455e m2323interface2 = C7818e.m2323interface();
                m2323interface2.yandex("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                m2323interface2.startapp(C13785e.applovin().purchase());
                m2323interface2.billing(AbstractC11085e.ad(((C0631e) abstractC12699e).ad));
                return C17424e.admob((C7818e) m2323interface2.ad());
        }
    }
}
