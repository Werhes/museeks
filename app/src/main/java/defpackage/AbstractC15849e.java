package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۦؔ */
/* loaded from: classes3.dex */
public abstract class AbstractC15849e {
    public static final C18212e ad = new C18212e(-1.0f);
    public static final C18212e vip = new C18212e(1.0f);
    public static final C4906e metrica = new C4906e(-1.0f);
    public static final C4906e license = new C4906e(1.0f);
    public static final Object appmetrica = new Object();

    public static final void ad(final boolean z, final Function0 function0, final InterfaceC12123e interfaceC12123e, final C2892e c2892e, final InterfaceC12864e interfaceC12864e, final boolean z2, final Function2 function2, final Function3 function3, final float f, final C13921e c13921e, final C5861e c5861e, final C9873e c9873e, final C4816e c4816e, final C0527e c0527e, final float f2, final C1839e c1839e, final C1839e c1839e2, C13770e c13770e, final int i, final int i2, final int i3) {
        int i4;
        Function0 function02;
        InterfaceC12123e interfaceC12123e2;
        C2892e c2892e2;
        int i5;
        int i6;
        int i7;
        int i8;
        float f3 = AbstractC8078e.ad;
        c13770e.m3671package(1047318944);
        if ((i & 6) == 0) {
            i4 = (c13770e.billing(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i4 |= c13770e.yandex(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & 384) == 0) {
            interfaceC12123e2 = interfaceC12123e;
            i4 |= c13770e.purchase(interfaceC12123e2) ? 256 : 128;
        } else {
            interfaceC12123e2 = interfaceC12123e;
        }
        if ((i & 3072) == 0) {
            c2892e2 = c2892e;
            i4 |= c13770e.yandex(c2892e2) ? 2048 : 1024;
        } else {
            c2892e2 = c2892e;
        }
        if ((i & 24576) == 0) {
            i4 |= c13770e.purchase(interfaceC12864e) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i5 = 196608;
            i4 |= c13770e.billing(z2) ? 131072 : 65536;
        } else {
            i5 = 196608;
        }
        if ((i & 1572864) == 0) {
            i4 |= c13770e.yandex(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= c13770e.yandex(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= c13770e.yandex(function2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= c13770e.yandex(function3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i6 = (c13770e.yandex(null) ? 4 : 2) | i2;
        } else {
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            i7 = i6 | (c13770e.metrica(f) ? 32 : 16);
        } else {
            i7 = i6;
        }
        if ((i2 & 384) == 0) {
            i7 |= c13770e.purchase(c13921e) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i7 |= c13770e.purchase(c5861e) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i7 |= c13770e.purchase(c9873e) ? 16384 : 8192;
        }
        if ((i2 & i5) == 0) {
            i7 |= c13770e.purchase(c4816e) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i7 |= c13770e.purchase(c0527e) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i7 |= c13770e.metrica(f2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i7 |= c13770e.metrica(f3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i7 |= c13770e.purchase(c1839e) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i8 = i3 | (c13770e.purchase(c1839e2) ? 4 : 2);
        } else {
            i8 = i3;
        }
        if ((i3 & 48) == 0) {
            i8 |= c13770e.purchase(null) ? 32 : 16;
        }
        if (c13770e.m3673protected(i4 & 1, ((i4 & 306783379) == 306783378 && (i7 & 306783379) == 306783378 && (i8 & 19) == 18) ? false : true)) {
            boolean z3 = (i4 & 14) == 4;
            Object m3681throw = c13770e.m3681throw();
            if (z3 || m3681throw == C2987e.ad) {
                m3681throw = new C7317e(z, 3);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12864e isVip = AbstractC5087e.isVip(new C18138e((Function1) m3681throw, true), interfaceC12864e);
            InterfaceC16154e interfaceC16154e = c13921e.ad;
            InterfaceC16154e interfaceC16154e2 = c13921e.vip;
            InterfaceC16154e interfaceC16154e3 = c13921e.metrica;
            InterfaceC16154e interfaceC16154e4 = c13921e.license;
            InterfaceC16154e interfaceC16154e5 = c13921e.appmetrica;
            InterfaceC16154e interfaceC16154e6 = c13921e.purchase;
            InterfaceC16154e interfaceC16154e7 = c13921e.billing;
            C4100e c4100e = new C4100e(interfaceC16154e, interfaceC16154e2, interfaceC16154e3, interfaceC16154e4, interfaceC16154e5, interfaceC16154e6, interfaceC16154e7, c13921e.yandex, interfaceC16154e5, interfaceC16154e7);
            C3027e c3027e = new C3027e(c5861e.ad, c5861e.vip, c5861e.metrica, c5861e.license, c5861e.appmetrica, c5861e.purchase, c5861e.billing, c5861e.yandex, c5861e.startapp, c5861e.adcel, c5861e.mopub, c5861e.advert, c5861e.smaato, c5861e.amazon);
            c9873e.getClass();
            C7528e c7528e = new C7528e(1.05f, 1.05f);
            C9630e c9630e = c4816e.ad;
            C9630e c9630e2 = c4816e.vip;
            C9630e c9630e3 = c4816e.metrica;
            C9630e c9630e4 = c4816e.license;
            C9630e c9630e5 = c4816e.appmetrica;
            C9630e c9630e6 = c4816e.purchase;
            C9630e c9630e7 = c4816e.billing;
            int i9 = i4 & 126;
            int i10 = i4 >> 6;
            AbstractC11160e.license(z, function02, isVip, z2, f, c4100e, c3027e, c7528e, new C10219e(c9630e, c9630e2, c9630e3, c9630e4, c9630e5, c9630e6, c9630e7, c4816e.yandex, c9630e5, c9630e7), new C8126e(c0527e.ad, c0527e.vip, c0527e.metrica, c0527e.license, c0527e.appmetrica, c0527e.purchase), AbstractC16653e.license(-284944704, new Function3(f2, interfaceC12123e2, function3, c1839e, c2892e2, function2, c1839e2) { // from class: eٍُۗ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f18695e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ Function3 f18696e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12123e f18697e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ C1839e f18698e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ float f18699e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ Function2 f18700e;

                {
                    float f4 = AbstractC8078e.ad;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r18v1 */
                /* JADX WARN: Type inference failed for: r18v2, types: [long] */
                /* JADX WARN: Type inference failed for: r18v3 */
                /* JADX WARN: Type inference failed for: r1v4, types: [eٓؕۥ] */
                /* JADX WARN: Type inference failed for: r9v15 */
                /* JADX WARN: Type inference failed for: r9v16 */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ?? r18;
                    C14865e c14865e;
                    C14865e c14865e2;
                    C5430e c5430e;
                    float f4 = AbstractC8078e.ad;
                    ?? r1 = (C13770e) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    boolean z4 = (intValue & 17) != 16;
                    AbstractC7919e abstractC7919e = r1.ad;
                    if (r1.m3673protected(intValue & 1, z4)) {
                        C0115e c0115e = C0115e.f1276e;
                        InterfaceC12864e adcel = AbstractC12220e.adcel(AbstractC18007e.vip(c0115e, 0.0f, this.f18699e, 1), this.f18697e);
                        C14544e c14544e = C5438e.f11668e;
                        C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.ad, c14544e, r1, 48);
                        long j = r1.f27286case;
                        int i11 = (int) (j ^ (j >>> 32));
                        InterfaceC3483e advert = r1.advert();
                        InterfaceC12864e purchase = AbstractC5679e.purchase(r1, adcel);
                        InterfaceC5685e.mopub.getClass();
                        C7309e c7309e = C2721e.vip;
                        r1.m3666import();
                        if (r1.f27292implements) {
                            r1.mopub(c7309e);
                        } else {
                            r1.m3684volatile();
                        }
                        C14865e c14865e3 = C2721e.billing;
                        AbstractC2270e.yandex(r1, ad2, c14865e3);
                        C14865e c14865e4 = C2721e.purchase;
                        AbstractC2270e.yandex(r1, advert, c14865e4);
                        Integer valueOf = Integer.valueOf(i11);
                        C14865e c14865e5 = C2721e.adcel;
                        AbstractC2270e.appmetrica(r1, valueOf, c14865e5);
                        C5430e c5430e2 = C2721e.mopub;
                        AbstractC2270e.purchase(r1, c5430e2);
                        C14865e c14865e6 = C2721e.license;
                        AbstractC2270e.yandex(r1, purchase, c14865e6);
                        Function3 function32 = this.f18696e;
                        if (function32 == null) {
                            r1.m3676strictfp(1909765575);
                            r1.Signature(false);
                            c5430e = c5430e2;
                            c14865e2 = c14865e6;
                            r18 = ' ';
                            c14865e = c14865e5;
                        } else {
                            r18 = ' ';
                            r1.m3676strictfp(1909765576);
                            C5015e c5015e = AbstractC15705e.ad;
                            AbstractC1101e.ad(AbstractC8703e.loadAd(C3618e.vip(0.8f, ((C3618e) r1.adcel(c5015e)).ad), c5015e), AbstractC16653e.license(-1291630325, new C2954e(function32), r1), r1, 56);
                            c14865e = c14865e5;
                            c14865e2 = c14865e6;
                            c5430e = c5430e2;
                            c0115e = c0115e;
                            AbstractC12534e.ad(r1, AbstractC12220e.loadAd(c0115e, 0.0f, 0.0f, AbstractC8078e.appmetrica, 0.0f, 11));
                            Unit unit = Unit.INSTANCE;
                            r1.Signature(false);
                        }
                        if (1.0f <= 0.0d) {
                            AbstractC9534e.ad("invalid weight; must be greater than zero");
                        }
                        InterfaceC12864e isVip2 = AbstractC5087e.isVip(new C5228e(1.0f, true), new C8388e(c14544e));
                        InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
                        long j2 = r1.f27286case;
                        int i12 = (int) (j2 ^ (j2 >>> r18));
                        InterfaceC3483e advert2 = r1.advert();
                        InterfaceC12864e purchase2 = AbstractC5679e.purchase(r1, isVip2);
                        r1.m3666import();
                        if (r1.f27292implements) {
                            r1.mopub(c7309e);
                        } else {
                            r1.m3684volatile();
                        }
                        AbstractC2270e.yandex(r1, license2, c14865e3);
                        AbstractC2270e.yandex(r1, advert2, c14865e4);
                        AbstractC2270e.appmetrica(r1, Integer.valueOf(i12), c14865e);
                        AbstractC2270e.purchase(r1, c5430e);
                        AbstractC2270e.yandex(r1, purchase2, c14865e2);
                        C4789e ad3 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, r1, 0);
                        long j3 = r1.f27286case;
                        int i13 = (int) (j3 ^ (j3 >>> r18));
                        InterfaceC3483e advert3 = r1.advert();
                        InterfaceC12864e purchase3 = AbstractC5679e.purchase(r1, c0115e);
                        r1.m3666import();
                        if (r1.f27292implements) {
                            r1.mopub(c7309e);
                        } else {
                            r1.m3684volatile();
                        }
                        AbstractC2270e.yandex(r1, ad3, c14865e3);
                        AbstractC2270e.yandex(r1, advert3, c14865e4);
                        AbstractC2270e.appmetrica(r1, Integer.valueOf(i13), c14865e);
                        AbstractC2270e.purchase(r1, c5430e);
                        AbstractC2270e.yandex(r1, purchase3, c14865e2);
                        r1.m3676strictfp(2075623850);
                        boolean z5 = false;
                        r1.Signature(false);
                        AbstractC10600e.ad(this.f18698e, this.f18695e, r1, 0);
                        Function2 function22 = this.f18700e;
                        if (function22 == null) {
                            r1.m3676strictfp(2076318281);
                            r1.Signature(false);
                        } else {
                            r1.m3676strictfp(2076318282);
                            C5015e c5015e2 = AbstractC15705e.ad;
                            z5 = false;
                            AbstractC1101e.ad(AbstractC8703e.loadAd(C3618e.vip(0.8f, ((C3618e) r1.adcel(c5015e2)).ad), c5015e2), AbstractC16653e.license(-650195203, new C2920e(function22, 6, 0 == true ? 1 : 0), r1), r1, 56);
                            Unit unit2 = Unit.INSTANCE;
                            r1.Signature(false);
                        }
                        r1.Signature(true);
                        r1.Signature(true);
                        r1.m3676strictfp(1911870692);
                        r1.Signature(z5);
                        r1.Signature(true);
                    } else {
                        r1.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, i9 | (i10 & 7168) | (i10 & 57344) | ((i7 << 12) & 458752), (i8 & 112) | 384, 0);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: e٘۟ۚ
                {
                    float f4 = AbstractC8078e.ad;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    float f4 = AbstractC8078e.ad;
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(i | 1);
                    int advert2 = AbstractC5190e.advert(i2);
                    int advert3 = AbstractC5190e.advert(i3);
                    AbstractC15849e.ad(z, function0, interfaceC12123e, c2892e, interfaceC12864e, z2, function2, function3, f, c13921e, c5861e, c9873e, c4816e, c0527e, f2, c1839e, c1839e2, (C13770e) obj, advert, advert2, advert3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void appmetrica() {
        throw new UnsupportedOperationException();
    }

    public static final void license(InterfaceC8850e interfaceC8850e, Throwable th) {
        if (th instanceof C15295e) {
            th = ((C15295e) th).f30221e;
        }
        try {
            InterfaceC12088e interfaceC12088e = (InterfaceC12088e) interfaceC8850e.mo397public(C5170e.f11077e);
            if (interfaceC12088e != null) {
                interfaceC12088e.mo2160break(interfaceC8850e, th);
            } else {
                C7582e.smaato(interfaceC8850e, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC13362e.license(runtimeException, th);
                th = runtimeException;
            }
            C7582e.smaato(interfaceC8850e, th);
        }
    }

    public static final void metrica(int i, C2892e c2892e, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        c13770e.m3671package(-1854833411);
        int i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = C3783e.startapp;
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC2747e interfaceC2747e = (InterfaceC2747e) m3681throw;
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, interfaceC2747e, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            c2892e.invoke(c13770e, 6);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6997e(interfaceC12864e, c2892e, i, 1);
        }
    }

    public static /* synthetic */ boolean purchase(int i, AbstractC3184e abstractC3184e, StringBuilder sb) {
        if (i - 1 != 0 || abstractC3184e == AbstractC3184e.ad) {
            return false;
        }
        sb.append(abstractC3184e.ad());
        sb.append('.');
        sb.append(abstractC3184e.vip());
        sb.append(':');
        sb.append(abstractC3184e.metrica());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(final boolean r48, final kotlin.jvm.functions.Function0 r49, final defpackage.C2892e r50, defpackage.InterfaceC12864e r51, boolean r52, kotlin.jvm.functions.Function2 r53, final kotlin.jvm.functions.Function3 r54, float r55, defpackage.C13921e r56, defpackage.C5861e r57, defpackage.C9873e r58, defpackage.C4816e r59, defpackage.C0527e r60, defpackage.C13770e r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15849e.vip(boolean, kotlin.jvm.functions.Function0, eؔ۟ٓ, eّۤۧ, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, eٍِٓ, eؘۘۗ, eٍِۤ, eٍِؗ, eؑۙؑ, eٓؕۥ, int, int):void");
    }
}
