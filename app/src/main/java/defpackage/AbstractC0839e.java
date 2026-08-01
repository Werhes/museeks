package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؕۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0839e {
    public static final float license;
    public static final float purchase;
    public static final float ad = 600;
    public static final float vip = 30;
    public static final float metrica = 16;
    public static final float appmetrica = 6;

    static {
        float f = 8;
        license = f;
        purchase = f;
    }

    public static final void ad(C2892e c2892e, Function2 function2, Function2 function22, C1839e c1839e, long j, long j2, C13770e c13770e, int i) {
        Function2 function23;
        C1839e c1839e2;
        Function2 function24;
        C14865e c14865e;
        boolean z;
        int i2;
        boolean z2;
        long j3 = j;
        long j4 = j2;
        c13770e.m3671package(-321841045);
        int i3 = i | (c13770e.yandex(c2892e) ? 4 : 2) | (c13770e.yandex(function2) ? 32 : 16) | (c13770e.yandex(function22) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.purchase(c1839e) ? 2048 : 1024) | (c13770e.appmetrica(j3) ? 16384 : 8192) | (c13770e.appmetrica(j4) ? 131072 : 65536);
        if (c13770e.m3673protected(i3 & 1, (74899 & i3) != 74898)) {
            float f = function22 == null ? license : 0;
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e loadAd = AbstractC12220e.loadAd(c0115e, metrica, 0.0f, f, 0.0f, 10);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = new C3783e(9);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC2747e interfaceC2747e = (InterfaceC2747e) m3681throw;
            long j5 = c13770e.f27286case;
            int i4 = (int) (j5 ^ (j5 >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, loadAd);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e2 = C2721e.billing;
            AbstractC2270e.yandex(c13770e, interfaceC2747e, c14865e2);
            C14865e c14865e3 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e3);
            Integer valueOf = Integer.valueOf(i4);
            C14865e c14865e4 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e4);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e5 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase2, c14865e5);
            InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC11203e.startapp(c0115e, "text"), 0.0f, appmetrica, 1);
            C10156e c10156e = C5438e.f11676e;
            InterfaceC2747e license2 = AbstractC17074e.license(c10156e, false);
            long j6 = c13770e.f27286case;
            int i5 = (int) (j6 ^ (j6 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, smaato);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, c14865e2);
            AbstractC2270e.yandex(c13770e, advert2, c14865e3);
            AbstractC13501e.mopub(i5, c13770e, c14865e4, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e5);
            c2892e.invoke(c13770e, Integer.valueOf(i3 & 14));
            c13770e.Signature(true);
            if (function2 != null) {
                c13770e.m3676strictfp(989211000);
                InterfaceC12864e startapp = AbstractC11203e.startapp(c0115e, "action");
                InterfaceC2747e license3 = AbstractC17074e.license(c10156e, false);
                c14865e = c14865e5;
                long j7 = c13770e.f27286case;
                int i6 = (int) (j7 ^ (j7 >>> 32));
                InterfaceC3483e advert3 = c13770e.advert();
                InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e, startapp);
                c13770e.m3666import();
                if (c13770e.f27292implements) {
                    c13770e.mopub(c7309e);
                } else {
                    c13770e.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e, license3, c14865e2);
                AbstractC2270e.yandex(c13770e, advert3, c14865e3);
                AbstractC13501e.mopub(i6, c13770e, c14865e4, c13770e, c5430e);
                AbstractC2270e.yandex(c13770e, purchase4, c14865e);
                j3 = j;
                c1839e2 = c1839e;
                i2 = 8;
                function23 = function2;
                AbstractC1101e.vip(new C14815e[]{AbstractC8703e.loadAd(j3, AbstractC0608e.ad), AbstractC14489e.ad.ad(c1839e2)}, function23, c13770e, 8 | (i3 & 112));
                c13770e.Signature(true);
                z = false;
                c13770e.Signature(false);
            } else {
                function23 = function2;
                c1839e2 = c1839e;
                j3 = j;
                c14865e = c14865e5;
                z = false;
                i2 = 8;
                c13770e.m3676strictfp(989526208);
                c13770e.Signature(false);
            }
            if (function22 != null) {
                c13770e.m3676strictfp(989574568);
                InterfaceC12864e startapp2 = AbstractC11203e.startapp(c0115e, "dismissAction");
                InterfaceC2747e license4 = AbstractC17074e.license(c10156e, z);
                long j8 = c13770e.f27286case;
                int i7 = (int) (j8 ^ (j8 >>> 32));
                InterfaceC3483e advert4 = c13770e.advert();
                InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e, startapp2);
                c13770e.m3666import();
                if (c13770e.f27292implements) {
                    c13770e.mopub(c7309e);
                } else {
                    c13770e.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e, license4, c14865e2);
                AbstractC2270e.yandex(c13770e, advert4, c14865e3);
                AbstractC13501e.mopub(i7, c13770e, c14865e4, c13770e, c5430e);
                AbstractC2270e.yandex(c13770e, purchase5, c14865e);
                j4 = j2;
                function24 = function22;
                AbstractC1101e.ad(AbstractC8703e.loadAd(j4, AbstractC0608e.ad), function24, c13770e, i2 | ((i3 >> 3) & 112));
                z2 = true;
                c13770e.Signature(true);
                c13770e.Signature(false);
            } else {
                function24 = function22;
                j4 = j2;
                z2 = true;
                c13770e.m3676strictfp(989843648);
                c13770e.Signature(z);
            }
            c13770e.Signature(z2);
        } else {
            function23 = function2;
            c1839e2 = c1839e;
            function24 = function22;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3085e(c2892e, function23, function24, c1839e2, j3, j4, i);
        }
    }

    public static final void metrica(final C18362e c18362e, InterfaceC12864e interfaceC12864e, InterfaceC16154e interfaceC16154e, long j, long j2, long j3, long j4, long j5, C13770e c13770e, final int i, final int i2) {
        int i3;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        int i4;
        final InterfaceC12864e interfaceC12864e2;
        final InterfaceC16154e interfaceC16154e2;
        final long j10;
        int i5;
        long j11;
        int i6;
        InterfaceC12864e interfaceC12864e3;
        C18362e c18362e2;
        long j12;
        boolean z;
        C2892e c2892e;
        int i7;
        c13770e.m3671package(274621471);
        if ((i & 6) == 0) {
            i3 = (c13770e.purchase(c18362e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i3 | 432;
        if ((i & 3072) == 0) {
            i8 = i3 | 1456;
        }
        if ((i & 24576) == 0) {
            j6 = j;
            i8 |= ((i2 & 16) == 0 && c13770e.appmetrica(j6)) ? 16384 : 8192;
        } else {
            j6 = j;
        }
        if ((196608 & i) == 0) {
            j7 = j2;
            i8 |= ((i2 & 32) == 0 && c13770e.appmetrica(j7)) ? 131072 : 65536;
        } else {
            j7 = j2;
        }
        if ((1572864 & i) == 0) {
            j8 = j3;
            i8 |= ((i2 & 64) == 0 && c13770e.appmetrica(j8)) ? 1048576 : 524288;
        } else {
            j8 = j3;
        }
        if ((12582912 & i) == 0) {
            j9 = j4;
            i8 |= ((i2 & 128) == 0 && c13770e.appmetrica(j9)) ? 8388608 : 4194304;
        } else {
            j9 = j4;
        }
        if ((100663296 & i) == 0) {
            int i9 = i8;
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 && c13770e.appmetrica(j5)) {
                i7 = 67108864;
                i4 = i9 | i7;
            }
            i7 = 33554432;
            i4 = i9 | i7;
        } else {
            i4 = i8;
        }
        if (c13770e.m3673protected(i4 & 1, (38347923 & i4) != 38347922)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                InterfaceC16154e ad2 = AbstractC8949e.ad(c13770e, AbstractC13981e.vip);
                int i10 = i4 & (-7169);
                if ((i2 & 16) != 0) {
                    j6 = AbstractC7893e.appmetrica(c13770e, 6);
                    i10 = i4 & (-64513);
                }
                if ((i2 & 32) != 0) {
                    j7 = AbstractC7893e.appmetrica(c13770e, AbstractC13981e.license);
                    i10 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    j8 = AbstractC7893e.appmetrica(c13770e, 5);
                    i10 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    j9 = AbstractC7893e.appmetrica(c13770e, 5);
                    i5 = i10 & (-29360129);
                } else {
                    i5 = i10;
                }
                int i11 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                C0115e c0115e = C0115e.f1276e;
                if (i11 != 0) {
                    j11 = AbstractC7893e.appmetrica(c13770e, AbstractC13981e.metrica);
                    i5 &= -234881025;
                } else {
                    j11 = j5;
                }
                i6 = i5;
                interfaceC16154e2 = ad2;
                interfaceC12864e3 = c0115e;
            } else {
                c13770e.m3659default();
                int i12 = i4 & (-7169);
                if ((i2 & 16) != 0) {
                    i12 = i4 & (-64513);
                }
                if ((i2 & 32) != 0) {
                    i12 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i12 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    i12 &= -29360129;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i12 &= -234881025;
                }
                interfaceC16154e2 = interfaceC16154e;
                j11 = j5;
                i6 = i12;
                interfaceC12864e3 = interfaceC12864e;
            }
            c13770e.admob();
            String str = c18362e.ad.vip;
            if (str != null) {
                c13770e.m3676strictfp(-663827885);
                long j13 = j8;
                j12 = j13;
                c18362e2 = c18362e;
                c2892e = AbstractC16653e.license(-1378313599, new C11653e(3, j13, c18362e, str), c13770e);
                z = false;
                c13770e.Signature(false);
            } else {
                c18362e2 = c18362e;
                j12 = j8;
                z = false;
                c13770e.m3676strictfp(-663528921);
                c13770e.Signature(false);
                c2892e = null;
            }
            c18362e2.ad.getClass();
            c13770e.m3676strictfp(-662598425);
            c13770e.Signature(z);
            int i13 = i6 << 3;
            long j14 = j9;
            long j15 = j11;
            vip(AbstractC12220e.mopub(interfaceC12864e3, 12), c2892e, null, interfaceC16154e2, j6, j7, j14, j15, AbstractC16653e.license(-1266389126, new C3450e(8, c18362e2), c13770e), c13770e, (i13 & 7168) | 805306368 | (i13 & 458752) | (i13 & 3670016) | (29360128 & i6) | (i6 & 234881024));
            j10 = j15;
            interfaceC12864e2 = interfaceC12864e3;
            j9 = j14;
            j8 = j12;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            interfaceC16154e2 = interfaceC16154e;
            j10 = j5;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eُْۛ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(i | 1);
                    AbstractC0839e.metrica(C18362e.this, interfaceC12864e2, interfaceC16154e2, j6, j7, j8, j9, j10, (C13770e) obj, advert, i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void vip(final InterfaceC12864e interfaceC12864e, final Function2 function2, final Function2 function22, final InterfaceC16154e interfaceC16154e, final long j, final long j2, final long j3, final long j4, final C2892e c2892e, C13770e c13770e, final int i) {
        int i2;
        Function2 function23;
        Function2 function24;
        InterfaceC16154e interfaceC16154e2;
        long j5;
        c13770e.m3671package(-1218779924);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function23 = function2;
            i2 |= c13770e.yandex(function23) ? 32 : 16;
        } else {
            function23 = function2;
        }
        if ((i & 384) == 0) {
            function24 = function22;
            i2 |= c13770e.yandex(function24) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            function24 = function22;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.billing(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            interfaceC16154e2 = interfaceC16154e;
            i2 |= c13770e.purchase(interfaceC16154e2) ? 16384 : 8192;
        } else {
            interfaceC16154e2 = interfaceC16154e;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.appmetrica(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.appmetrica(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            j5 = j3;
            i2 |= c13770e.appmetrica(j5) ? 8388608 : 4194304;
        } else {
            j5 = j3;
        }
        if ((100663296 & i) == 0) {
            i2 |= c13770e.appmetrica(j4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 536870912 : 268435456;
        }
        if (c13770e.m3673protected(i2 & 1, (306783379 & i2) != 306783378)) {
            c13770e.m3655case();
            if ((i & 1) != 0 && !c13770e.isPro()) {
                c13770e.m3659default();
            }
            c13770e.admob();
            float f = AbstractC13981e.ad;
            C2892e license2 = AbstractC16653e.license(-1343524879, new C2132e(function23, c2892e, function24, j5, j4), c13770e);
            int i3 = (i2 & 14) | 12779520;
            int i4 = i2 >> 9;
            AbstractC12121e.ad(interfaceC12864e, interfaceC16154e2, j, j2, 0.0f, f, null, license2, c13770e, i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 80);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٗۛ۠
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(i | 1);
                    AbstractC0839e.vip(InterfaceC12864e.this, function2, function22, interfaceC16154e, j, j2, j3, j4, c2892e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
