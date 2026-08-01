package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۦۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12121e {
    public static final C5015e ad = new C5015e(new C10673e(25));

    public static final void ad(InterfaceC12864e interfaceC12864e, InterfaceC16154e interfaceC16154e, long j, long j2, float f, float f2, C7433e c7433e, final C2892e c2892e, C13770e c13770e, int i, int i2) {
        if ((i2 & 1) != 0) {
            interfaceC12864e = C0115e.f1276e;
        }
        if ((i2 & 2) != 0) {
            interfaceC16154e = AbstractC10432e.ad;
        }
        if ((i2 & 4) != 0) {
            j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.Signature;
        }
        if ((i2 & 8) != 0) {
            j2 = AbstractC7893e.vip(j, c13770e);
        }
        if ((i2 & 16) != 0) {
            f = 0;
        }
        if ((i2 & 32) != 0) {
            f2 = 0;
        }
        if ((i2 & 64) != 0) {
            c7433e = null;
        }
        C5015e c5015e = ad;
        final float f3 = f + ((C15765e) c13770e.adcel(c5015e)).f31051e;
        C14815e[] c14815eArr = {AbstractC8703e.loadAd(j2, AbstractC0608e.ad), c5015e.ad(new C15765e(f3))};
        final long j3 = j;
        final InterfaceC16154e interfaceC16154e2 = interfaceC16154e;
        final C7433e c7433e2 = c7433e;
        final float f4 = f2;
        final InterfaceC12864e interfaceC12864e2 = interfaceC12864e;
        AbstractC1101e.vip(c14815eArr, AbstractC16653e.license(421772006, new Function2() { // from class: eؓۡؔ
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C13770e c13770e2 = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    InterfaceC12864e license = AbstractC12121e.license(InterfaceC12864e.this, interfaceC16154e2, AbstractC12121e.appmetrica(j3, f3, c13770e2), c7433e2, ((InterfaceC14388e) c13770e2.adcel(AbstractC11473e.yandex)).mo497instanceof(f4));
                    Object m3681throw = c13770e2.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (m3681throw == c5170e) {
                        m3681throw = new C4671e(4);
                        c13770e2.m3682throws(m3681throw);
                    }
                    InterfaceC12864e ad2 = AbstractC1147e.ad(license, false, (Function1) m3681throw);
                    Unit unit = Unit.INSTANCE;
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (m3681throw2 == c5170e) {
                        m3681throw2 = C15801e.f31116e;
                        c13770e2.m3682throws(m3681throw2);
                    }
                    InterfaceC12864e ad3 = AbstractC0845e.ad(ad2, unit, (PointerInputEventHandler) m3681throw2);
                    InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, true);
                    long j4 = c13770e2.f27286case;
                    int i3 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, ad3);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, license2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    c2892e.invoke(c13770e2, 0);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            }
        }, c13770e), c13770e, 56);
    }

    public static final long appmetrica(long j, float f, C13770e c13770e) {
        C9553e c9553e = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad;
        return (C3618e.metrica(j, c9553e.Signature) && ((Boolean) c13770e.adcel(AbstractC7893e.ad)).booleanValue()) ? AbstractC7893e.billing(c9553e, f) : j;
    }

    public static final InterfaceC12864e license(InterfaceC12864e interfaceC12864e, InterfaceC16154e interfaceC16154e, long j, C7433e c7433e, float f) {
        InterfaceC16154e interfaceC16154e2;
        InterfaceC12864e interfaceC12864e2;
        InterfaceC12864e interfaceC12864e3 = C0115e.f1276e;
        if (f > 0.0f) {
            interfaceC16154e2 = interfaceC16154e;
            interfaceC12864e2 = AbstractC12546e.startapp(interfaceC12864e3, 0.0f, 0.0f, 0.0f, f, interfaceC16154e2, false, 518111);
        } else {
            interfaceC16154e2 = interfaceC16154e;
            interfaceC12864e2 = interfaceC12864e3;
        }
        InterfaceC12864e premium = interfaceC12864e.premium(interfaceC12864e2);
        if (c7433e != null) {
            interfaceC12864e3 = new C16436e(c7433e.ad, c7433e.vip, interfaceC16154e2);
        }
        return AbstractC12447e.vip(AbstractC16136e.metrica(premium.premium(interfaceC12864e3), j, interfaceC16154e2), interfaceC16154e2);
    }

    public static final void metrica(final Function0 function0, final InterfaceC12864e interfaceC12864e, boolean z, InterfaceC16154e interfaceC16154e, final long j, long j2, float f, float f2, C7433e c7433e, C15274e c15274e, final C2892e c2892e, C13770e c13770e, int i, int i2) {
        final boolean z2 = (i2 & 4) != 0 ? true : z;
        final InterfaceC16154e interfaceC16154e2 = (i2 & 8) != 0 ? AbstractC10432e.ad : interfaceC16154e;
        long vip = (i2 & 32) != 0 ? AbstractC7893e.vip(j, c13770e) : j2;
        float f3 = (i2 & 64) != 0 ? 0 : f;
        final float f4 = (i2 & 128) != 0 ? 0 : f2;
        final C7433e c7433e2 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : c7433e;
        final C15274e c15274e2 = (i2 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c15274e : null;
        if (c15274e2 == null) {
            c13770e.m3676strictfp(-1701074900);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = AbstractC17861e.adcel(c13770e);
            }
            c15274e2 = (C15274e) m3681throw;
        } else {
            c13770e.m3676strictfp(2023335947);
        }
        c13770e.Signature(false);
        C5015e c5015e = ad;
        final float f5 = ((C15765e) c13770e.adcel(c5015e)).f31051e + f3;
        AbstractC1101e.vip(new C14815e[]{AbstractC8703e.loadAd(vip, AbstractC0608e.ad), c5015e.ad(new C15765e(f5))}, AbstractC16653e.license(849208527, new Function2() { // from class: eۣؓۜ
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C13770e c13770e2 = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C4782e c4782e = AbstractC7562e.ad;
                    InterfaceC12864e ad2 = AbstractC6261e.ad(AbstractC9546e.metrica(AbstractC12121e.license(InterfaceC12864e.this.premium(C10623e.f20937e), interfaceC16154e2, AbstractC12121e.appmetrica(j, f5, c13770e2), c7433e2, ((InterfaceC14388e) c13770e2.adcel(AbstractC11473e.yandex)).mo497instanceof(f4)), c15274e2, AbstractC17052e.ad(0.0f, 7, 0L, false), z2, null, function0, 24));
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, true);
                    long j3 = c13770e2.f27286case;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, ad2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, license, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    c2892e.invoke(c13770e2, 0);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            }
        }, c13770e), c13770e, 56);
    }

    public static final void vip(final boolean z, final Function0 function0, final InterfaceC12864e interfaceC12864e, final boolean z2, final InterfaceC16154e interfaceC16154e, final long j, long j2, float f, final C7433e c7433e, C15274e c15274e, final C2892e c2892e, C13770e c13770e, int i, int i2) {
        final C15274e c15274e2;
        long vip = (i2 & 64) != 0 ? AbstractC7893e.vip(j, c13770e) : j2;
        float f2 = 0;
        final float f3 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0 : f;
        if (c15274e == null) {
            c13770e.m3676strictfp(1528105640);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = AbstractC17861e.adcel(c13770e);
            }
            c13770e.Signature(false);
            c15274e2 = (C15274e) m3681throw;
        } else {
            c13770e.m3676strictfp(-227801585);
            c13770e.Signature(false);
            c15274e2 = c15274e;
        }
        C5015e c5015e = ad;
        final float f4 = ((C15765e) c13770e.adcel(c5015e)).f31051e + f2;
        AbstractC1101e.vip(new C14815e[]{AbstractC8703e.loadAd(vip, AbstractC0608e.ad), c5015e.ad(new C15765e(f4))}, AbstractC16653e.license(1508735219, new Function2() { // from class: eًٖ۟
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C13770e c13770e2 = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C4782e c4782e = AbstractC7562e.ad;
                    InterfaceC12864e ad2 = AbstractC6261e.ad(AbstractC17947e.adcel(AbstractC12121e.license(InterfaceC12864e.this.premium(C10623e.f20937e), interfaceC16154e, AbstractC12121e.appmetrica(j, f4, c13770e2), c7433e, ((InterfaceC14388e) c13770e2.adcel(AbstractC11473e.yandex)).mo497instanceof(f3)), z, c15274e2, AbstractC17052e.ad(0.0f, 7, 0L, false), z2, null, function0));
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, true);
                    long j3 = c13770e2.f27286case;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, ad2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, license, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    c2892e.invoke(c13770e2, 0);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            }
        }, c13770e), c13770e, 56);
    }
}
