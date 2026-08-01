package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۦۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2241e {
    public static final float ad;
    public static final C16005e appmetrica;
    public static final float license;
    public static final float purchase;
    public static final float startapp;
    public static final float vip;
    public static final float yandex;
    public static final float metrica = 40;
    public static final float billing = 28;

    static {
        float f = 4;
        ad = f;
        float f2 = 24;
        vip = f2;
        license = f;
        float f3 = 8;
        appmetrica = new C16005e(f3, f, f3, f);
        float f4 = 16;
        purchase = f4;
        yandex = f2;
        startapp = f4;
    }

    public static final void ad(final C9055e c9055e, InterfaceC12864e interfaceC12864e, float f, InterfaceC16154e interfaceC16154e, long j, long j2, float f2, float f3, final C2892e c2892e, C13770e c13770e, final int i) {
        int i2;
        InterfaceC12864e interfaceC12864e2;
        final float f4;
        final InterfaceC16154e interfaceC16154e2;
        final long j3;
        final long j4;
        final float f5;
        final float f6;
        final float f7;
        final long appmetrica2;
        int i3;
        long j5;
        float f8;
        float f9;
        InterfaceC16154e interfaceC16154e3;
        c13770e.m3671package(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c13770e.purchase(c9055e) : c13770e.yandex(c9055e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= c13770e.yandex(c2892e) ? 536870912 : 268435456;
        }
        if (c13770e.m3673protected(i5 & 1, (306783379 & i5) != 306783378)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                f7 = AbstractC10536e.ad;
                InterfaceC16154e ad2 = AbstractC8949e.ad(c13770e, 5);
                appmetrica2 = AbstractC7893e.appmetrica(c13770e, 4);
                long appmetrica3 = AbstractC7893e.appmetrica(c13770e, 6);
                i3 = i5 & (-4186113);
                interfaceC12864e2 = C0115e.f1276e;
                j5 = appmetrica3;
                f8 = 0;
                f9 = 0;
                interfaceC16154e3 = ad2;
            } else {
                c13770e.m3659default();
                i3 = i5 & (-4186113);
                interfaceC12864e2 = interfaceC12864e;
                f7 = f;
                interfaceC16154e3 = interfaceC16154e;
                appmetrica2 = j;
                j5 = j2;
                f8 = f2;
                f9 = f3;
            }
            c13770e.admob();
            c13770e.m3676strictfp(-1719869687);
            c13770e.Signature(false);
            int i6 = i3 >> 9;
            AbstractC12121e.ad(interfaceC12864e2, interfaceC16154e3, j5, 0L, f8, f9, null, AbstractC16653e.license(-1573998995, new Function2() { // from class: eْۖٓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C13770e c13770e2 = (C13770e) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                        InterfaceC12864e adcel = AbstractC12220e.adcel(AbstractC18007e.advert(C0115e.f1276e, AbstractC2241e.metrica, AbstractC2241e.vip, f7, 0.0f, 8), AbstractC2241e.appmetrica);
                        InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
                        long j6 = c13770e2.f27286case;
                        int i7 = (int) (j6 ^ (j6 >>> 32));
                        InterfaceC3483e advert = c13770e2.advert();
                        InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, adcel);
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
                        AbstractC2270e.yandex(c13770e2, Integer.valueOf(i7), C2721e.adcel);
                        AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                        AbstractC2270e.yandex(c13770e2, purchase2, C2721e.license);
                        AbstractC1101e.vip(new C14815e[]{AbstractC8703e.loadAd(appmetrica2, AbstractC0608e.ad), AbstractC14489e.ad.ad(AbstractC16475e.ad(c13770e2, 3))}, c2892e, c13770e2, 8);
                        c13770e2.Signature(true);
                    } else {
                        c13770e2.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            f4 = f7;
            j3 = appmetrica2;
            interfaceC16154e2 = interfaceC16154e3;
            j4 = j5;
            f5 = f8;
            f6 = f9;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            f4 = f;
            interfaceC16154e2 = interfaceC16154e;
            j3 = j;
            j4 = j2;
            f5 = f2;
            f6 = f3;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            final InterfaceC12864e interfaceC12864e3 = interfaceC12864e2;
            subscription.license = new Function2() { // from class: eّۜؕ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC2241e.ad(C9055e.this, interfaceC12864e3, f4, interfaceC16154e2, j3, j4, f5, f6, c2892e, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final C6540e appmetrica(C13770e c13770e) {
        C10684e c10684e = AbstractC8424e.ad;
        boolean billing2 = c13770e.billing(false) | c13770e.purchase(c10684e);
        Object m3681throw = c13770e.m3681throw();
        if (billing2 || m3681throw == C2987e.ad) {
            m3681throw = new C6540e(false, c10684e);
            c13770e.m3682throws(m3681throw);
        }
        return (C6540e) m3681throw;
    }

    public static final float license(float f, int i, C0763e c0763e) {
        float min;
        float f2 = c0763e.ad;
        float f3 = c0763e.metrica;
        float f4 = 2;
        float f5 = (f2 + f3) / f4;
        float f6 = i;
        if (f >= f6) {
            return f5;
        }
        float f7 = f / f4;
        if (f5 - f7 < 0.0f) {
            min = Math.max(f - f6, -f2);
        } else {
            if (f5 + f7 <= f6) {
                return f7;
            }
            min = Math.min(f - f3, 0.0f);
        }
        return min + f5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0227, code lost:
    
        if (r10 == r4) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void metrica(defpackage.InterfaceC16060e r25, defpackage.C2892e r26, defpackage.C6540e r27, defpackage.InterfaceC12864e r28, kotlin.jvm.functions.Function0 r29, boolean r30, kotlin.jvm.functions.Function2 r31, defpackage.C13770e r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2241e.metrica(eؚٖۘ, eؔ۟ٓ, eٌؙٞ, eّۤۧ, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function2, eٓؕۥ, int, int):void");
    }

    public static final void vip(final C9055e c9055e, InterfaceC12864e interfaceC12864e, final Function2 function2, final InterfaceC16154e interfaceC16154e, float f, InterfaceC16154e interfaceC16154e2, final C14460e c14460e, float f2, float f3, C13770e c13770e, final int i) {
        int i2;
        InterfaceC12864e interfaceC12864e2;
        float f4;
        InterfaceC16154e interfaceC16154e3;
        final float f5;
        final float f6;
        int i3;
        float f7;
        InterfaceC12864e interfaceC12864e3;
        float f8;
        InterfaceC16154e interfaceC16154e4;
        float f9;
        int i4;
        InterfaceC12864e interfaceC12864e4;
        InterfaceC16154e interfaceC16154e5;
        C2892e c2892e = AbstractC17864e.ad;
        c13770e.m3671package(236290785);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c13770e.purchase(c9055e) : c13770e.yandex(c9055e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i & 384) == 0) {
            i5 |= c13770e.yandex(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i6 = i5 | 3072;
        if ((i & 24576) == 0) {
            i6 |= c13770e.purchase(interfaceC16154e) ? 16384 : 8192;
        }
        int i7 = 196608 | i6;
        if ((1572864 & i) == 0) {
            i7 = 720896 | i6;
        }
        if ((i & 12582912) == 0) {
            i7 |= c13770e.purchase(c14460e) ? 8388608 : 4194304;
        }
        int i8 = i7 | 905969664;
        if (c13770e.m3673protected(i8 & 1, (306783379 & i8) != 306783378)) {
            c13770e.m3655case();
            int i9 = i & 1;
            C0115e c0115e = C0115e.f1276e;
            if (i9 == 0 || c13770e.isPro()) {
                float f10 = AbstractC10536e.vip;
                InterfaceC16154e ad2 = AbstractC8949e.ad(c13770e, AbstractC10717e.vip);
                i3 = i8 & (-3670017);
                f7 = f10;
                interfaceC12864e3 = c0115e;
                f8 = AbstractC18359e.ad;
                interfaceC16154e4 = ad2;
                f9 = AbstractC10717e.ad;
            } else {
                c13770e.m3659default();
                f7 = f;
                interfaceC16154e4 = interfaceC16154e2;
                f8 = f2;
                f9 = f3;
                i3 = i8 & (-3670017);
                interfaceC12864e3 = interfaceC12864e;
            }
            c13770e.admob();
            if (interfaceC16154e != null) {
                c13770e.m3676strictfp(-111989590);
                Object m3681throw = c13770e.m3681throw();
                C5170e c5170e = C2987e.ad;
                if (m3681throw == c5170e) {
                    i4 = 12582912;
                    m3681throw = AbstractC14533e.startapp(new C6739e(C6739e.ad()));
                    c13770e.m3682throws(m3681throw);
                } else {
                    i4 = 12582912;
                }
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
                InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
                long ad3 = ((C1692e) ((InterfaceC3075e) c13770e.adcel(AbstractC11473e.signatures))).ad();
                boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && c13770e.yandex(c9055e));
                Object m3681throw2 = c13770e.m3681throw();
                if (z || m3681throw2 == c5170e) {
                    m3681throw2 = new C17955e(15, c9055e);
                    c13770e.m3682throws(m3681throw2);
                }
                InterfaceC12864e premium = AbstractC18127e.purchase(c0115e, new C5474e(ad3, (Function1) m3681throw2, interfaceC14388e, c9055e.vip, interfaceC3314e)).premium(interfaceC12864e3);
                boolean purchase2 = c13770e.purchase(interfaceC16154e4) | ((i3 & 57344) == 16384);
                Object m3681throw3 = c13770e.m3681throw();
                if (purchase2 || m3681throw3 == c5170e) {
                    m3681throw3 = new C18412e(interfaceC3314e, interfaceC16154e4, interfaceC16154e);
                    c13770e.m3682throws(m3681throw3);
                }
                interfaceC16154e5 = (C18412e) m3681throw3;
                c13770e.Signature(false);
                interfaceC12864e4 = premium;
            } else {
                i4 = 12582912;
                c13770e.m3676strictfp(-111344294);
                c13770e.Signature(false);
                interfaceC12864e4 = interfaceC12864e3;
                interfaceC16154e5 = interfaceC16154e4;
            }
            f4 = f7;
            int i10 = i3 >> 12;
            float f11 = f8;
            interfaceC12864e2 = interfaceC12864e3;
            interfaceC16154e3 = interfaceC16154e4;
            float f12 = f9;
            AbstractC12121e.ad(AbstractC18007e.advert(interfaceC12864e4, metrica, vip, f7, 0.0f, 8), interfaceC16154e5, c14460e.ad, 0L, f11, f12, null, AbstractC16653e.license(-1249811482, new C2173e(function2, c14460e), c13770e), c13770e, (i10 & 57344) | i4 | (i10 & 458752), 72);
            f5 = f11;
            f6 = f12;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            f4 = f;
            interfaceC16154e3 = interfaceC16154e2;
            f5 = f2;
            f6 = f3;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            final InterfaceC12864e interfaceC12864e5 = interfaceC12864e2;
            final float f13 = f4;
            final InterfaceC16154e interfaceC16154e6 = interfaceC16154e3;
            subscription.license = new Function2() { // from class: eٍٜٙ
                {
                    C2892e c2892e2 = AbstractC17864e.ad;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C2892e c2892e2 = AbstractC17864e.ad;
                    ((Integer) obj2).getClass();
                    AbstractC2241e.vip(c9055e, interfaceC12864e5, function2, interfaceC16154e, f13, interfaceC16154e6, c14460e, f5, f6, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
