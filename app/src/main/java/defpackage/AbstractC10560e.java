package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ۟ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10560e {
    public static final float appmetrica;
    public static final float purchase;
    public static final C5015e ad = new C5015e(new C0743e(6));
    public static final C5015e vip = new C5015e(new C0743e(7));
    public static final C13789e metrica = new C13789e(0.8f, 0.0f, 0.8f, 0.15f);
    public static final float license = 28;

    static {
        float f = 4;
        appmetrica = f;
        purchase = 16 - f;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(final defpackage.C2892e r17, defpackage.InterfaceC12864e r18, final defpackage.C2892e r19, kotlin.jvm.functions.Function3 r20, float r21, defpackage.InterfaceC11968e r22, defpackage.C13793e r23, defpackage.InterfaceC12123e r24, defpackage.C13770e r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10560e.ad(eؔ۟ٓ, eّۤۧ, eؔ۟ٓ, kotlin.jvm.functions.Function3, float, eِۚ, eٓؗۘ, eِۦۦ, eٓؕۥ, int, int):void");
    }

    public static final void appmetrica(final InterfaceC12864e interfaceC12864e, final InterfaceC14468e interfaceC14468e, final long j, final long j2, final long j3, long j4, final Function2 function2, final C1839e c1839e, final Function2 function22, final C1839e c1839e2, Function0 function0, final InterfaceC6428e interfaceC6428e, final InterfaceC3886e interfaceC3886e, final int i, final boolean z, final Function2 function23, C2892e c2892e, final float f, final InterfaceC12123e interfaceC12123e, C13770e c13770e, final int i2, final int i3) {
        int i4;
        final long j5;
        C2892e c2892e2;
        Function0 function02;
        C13770e c13770e2;
        Object c17106e;
        C14865e c14865e;
        char c;
        InterfaceC12864e interfaceC12864e2;
        boolean z2;
        float f2;
        C10156e c10156e;
        C0115e c0115e;
        boolean z3;
        C5170e c5170e;
        InterfaceC12864e interfaceC12864e3;
        c13770e.m3671package(239553141);
        int i5 = i2 | (c13770e.purchase(interfaceC12864e) ? 4 : 2) | (c13770e.purchase(interfaceC14468e) ? 32 : 16) | (c13770e.appmetrica(j) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.appmetrica(j2) ? 2048 : 1024) | (c13770e.appmetrica(j3) ? 16384 : 8192) | (c13770e.appmetrica(j4) ? 131072 : 65536) | (c13770e.yandex(function2) ? 1048576 : 524288) | (c13770e.purchase(c1839e) ? 8388608 : 4194304) | (c13770e.yandex(function22) ? 67108864 : 33554432) | (c13770e.purchase(c1839e2) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | (c13770e.yandex(function0) ? 4 : 2);
        } else {
            i4 = i3;
        }
        int i6 = i4 | (c13770e.purchase(interfaceC3886e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if ((i3 & 3072) == 0) {
            i6 |= c13770e.license(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= c13770e.billing(z) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i6 |= c13770e.yandex(function23) ? 131072 : 65536;
        }
        int i7 = i6 | (c13770e.metrica(f) ? 8388608 : 4194304);
        if ((i3 & 100663296) == 0) {
            i7 |= c13770e.purchase(interfaceC12123e) ? 67108864 : 33554432;
        }
        int i8 = i7;
        if (c13770e.m3673protected(i5 & 1, ((i5 & 306783379) == 306783378 && (38347923 & i8) == 38347922) ? false : true)) {
            int i9 = i8 & 896;
            boolean z4 = ((i5 & 112) == 32) | (i9 == 256) | ((i8 & 7168) == 2048) | ((29360128 & i8) == 8388608);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e2 = C2987e.ad;
            if (z4 || m3681throw == c5170e2) {
                c17106e = new C17106e(interfaceC14468e, interfaceC6428e, interfaceC3886e, i, f, interfaceC12123e);
                c13770e.m3682throws(c17106e);
            } else {
                c17106e = m3681throw;
            }
            C17106e c17106e2 = (C17106e) c17106e;
            long j6 = c13770e.f27286case;
            int i10 = (int) (j6 ^ (j6 >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e2 = C2721e.billing;
            AbstractC2270e.yandex(c13770e, c17106e2, c14865e2);
            C14865e c14865e3 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e3);
            Integer valueOf = Integer.valueOf(i10);
            C14865e c14865e4 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e4);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e5 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase2, c14865e5);
            C0115e c0115e2 = C0115e.f1276e;
            InterfaceC12864e startapp = AbstractC11203e.startapp(c0115e2, "navigationIcon");
            float f3 = appmetrica;
            InterfaceC12864e loadAd = AbstractC12220e.loadAd(startapp, f3, 0.0f, 0.0f, 0.0f, 14);
            C10156e c10156e2 = C5438e.f11676e;
            InterfaceC2747e license2 = AbstractC17074e.license(c10156e2, false);
            long j7 = c13770e.f27286case;
            int i11 = (int) (j7 ^ (j7 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, loadAd);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, c14865e2);
            AbstractC2270e.yandex(c13770e, advert2, c14865e3);
            AbstractC13501e.mopub(i11, c13770e, c14865e4, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e5);
            C5015e c5015e = AbstractC0608e.ad;
            AbstractC1101e.ad(AbstractC8703e.loadAd(j, c5015e), function23, c13770e, ((i8 >> 12) & 112) | 8);
            c13770e.Signature(true);
            if (function22 != null) {
                c13770e.m3676strictfp(407501183);
                InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC11203e.startapp(c0115e2, "title"), f3, 0.0f, 2);
                if (z) {
                    c13770e.m3676strictfp(-402488651);
                    Object m3681throw2 = c13770e.m3681throw();
                    c5170e = c5170e2;
                    if (m3681throw2 == c5170e) {
                        m3681throw2 = new C14099e(13);
                        c13770e.m3682throws(m3681throw2);
                    }
                    AtomicInteger atomicInteger = AbstractC1147e.ad;
                    interfaceC12864e3 = new C0434e((Function1) m3681throw2);
                    c13770e.Signature(false);
                } else {
                    c5170e = c5170e2;
                    c13770e.m3676strictfp(-402486714);
                    c13770e.Signature(false);
                    interfaceC12864e3 = c0115e2;
                }
                InterfaceC12864e premium = smaato.premium(interfaceC12864e3);
                boolean z5 = (i8 & 14) == 4;
                Object m3681throw3 = c13770e.m3681throw();
                if (z5 || m3681throw3 == c5170e) {
                    function02 = function0;
                    m3681throw3 = new C17897e(1, function02);
                    c13770e.m3682throws(m3681throw3);
                } else {
                    function02 = function0;
                }
                InterfaceC12864e yandex = AbstractC12546e.yandex(premium, (Function1) m3681throw3);
                C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, interfaceC3886e, c13770e, (i9 >> 3) & 112);
                long j8 = c13770e.f27286case;
                c = ' ';
                int i12 = (int) (j8 ^ (j8 >>> 32));
                InterfaceC3483e advert3 = c13770e.advert();
                InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e, yandex);
                c13770e.m3666import();
                f2 = f3;
                if (c13770e.f27292implements) {
                    c13770e.mopub(c7309e);
                } else {
                    c13770e.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e, ad2, c14865e2);
                AbstractC2270e.yandex(c13770e, advert3, c14865e3);
                AbstractC13501e.mopub(i12, c13770e, c14865e4, c13770e, c5430e);
                AbstractC2270e.yandex(c13770e, purchase4, c14865e5);
                int i13 = i5 >> 18;
                int i14 = i5 >> 12;
                c14865e = c14865e3;
                AbstractC5750e.ad(j2, c1839e, function2, c13770e, ((i5 >> 9) & 14) | (i13 & 112) | (i14 & 896));
                c13770e2 = c13770e;
                AbstractC5750e.ad(j3, c1839e2, function22, c13770e2, (14 & i14) | ((i5 >> 24) & 112) | (i13 & 896));
                c13770e2.Signature(true);
                c13770e2.Signature(false);
                z3 = false;
                c10156e = c10156e2;
                c0115e = c0115e2;
            } else {
                function02 = function0;
                c14865e = c14865e3;
                c = ' ';
                c13770e.m3676strictfp(408520308);
                InterfaceC12864e smaato2 = AbstractC12220e.smaato(AbstractC11203e.startapp(c0115e2, "title"), f3, 0.0f, 2);
                if (z) {
                    c13770e.m3676strictfp(-402453739);
                    Object m3681throw4 = c13770e.m3681throw();
                    if (m3681throw4 == c5170e2) {
                        m3681throw4 = new C14099e(14);
                        c13770e.m3682throws(m3681throw4);
                    }
                    AtomicInteger atomicInteger2 = AbstractC1147e.ad;
                    interfaceC12864e2 = new C0434e((Function1) m3681throw4);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3676strictfp(-402451802);
                    c13770e.Signature(false);
                    interfaceC12864e2 = c0115e2;
                }
                InterfaceC12864e premium2 = smaato2.premium(interfaceC12864e2);
                boolean z6 = (i8 & 14) == 4;
                Object m3681throw5 = c13770e.m3681throw();
                if (z6 || m3681throw5 == c5170e2) {
                    z2 = false;
                    m3681throw5 = new C17897e(0, function02);
                    c13770e.m3682throws(m3681throw5);
                } else {
                    z2 = false;
                }
                InterfaceC12864e yandex2 = AbstractC12546e.yandex(premium2, (Function1) m3681throw5);
                InterfaceC2747e license3 = AbstractC17074e.license(c10156e2, z2);
                long j9 = c13770e.f27286case;
                int i15 = (int) (j9 ^ (j9 >>> 32));
                InterfaceC3483e advert4 = c13770e.advert();
                InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e, yandex2);
                c13770e.m3666import();
                if (c13770e.f27292implements) {
                    c13770e.mopub(c7309e);
                } else {
                    c13770e.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e, license3, c14865e2);
                AbstractC2270e.yandex(c13770e, advert4, c14865e);
                AbstractC13501e.mopub(i15, c13770e, c14865e4, c13770e, c5430e);
                AbstractC2270e.yandex(c13770e, purchase5, c14865e5);
                c13770e2 = c13770e;
                f2 = f3;
                c10156e = c10156e2;
                c0115e = c0115e2;
                AbstractC5750e.ad(j2, c1839e, function2, c13770e2, ((i5 >> 9) & 14) | ((i5 >> 18) & 112) | ((i5 >> 12) & 896));
                c13770e2.Signature(true);
                z3 = false;
                c13770e2.Signature(false);
            }
            InterfaceC12864e loadAd2 = AbstractC12220e.loadAd(AbstractC11203e.startapp(c0115e, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11);
            InterfaceC2747e license4 = AbstractC17074e.license(c10156e, z3);
            long j10 = c13770e2.f27286case;
            int i16 = (int) (j10 ^ (j10 >>> c));
            InterfaceC3483e advert5 = c13770e2.advert();
            InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e2, loadAd2);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, license4, c14865e2);
            AbstractC2270e.yandex(c13770e2, advert5, c14865e);
            AbstractC13501e.mopub(i16, c13770e2, c14865e4, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase6, c14865e5);
            j5 = j4;
            c2892e2 = c2892e;
            AbstractC1101e.ad(c5015e.ad(new C3618e(j5)), c2892e2, c13770e2, 56);
            c13770e2.Signature(true);
            c13770e2.Signature(true);
        } else {
            j5 = j4;
            c2892e2 = c2892e;
            function02 = function0;
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            final C2892e c2892e3 = c2892e2;
            final Function0 function03 = function02;
            subscription.license = new Function2(interfaceC14468e, j, j2, j3, j5, function2, c1839e, function22, c1839e2, function03, interfaceC6428e, interfaceC3886e, i, z, function23, c2892e3, f, interfaceC12123e, i2, i3) { // from class: eٕ۠٘

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ long f31062e;

                /* renamed from: eٕؒۙ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC3886e f31063e;

                /* renamed from: eٕؓۥ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6428e f31064e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ long f31065e;

                /* renamed from: eؙؔٞ, reason: contains not printable characters */
                public final /* synthetic */ C1839e f31066e;

                /* renamed from: eَؕ۟, reason: contains not printable characters */
                public final /* synthetic */ int f31067e;

                /* renamed from: eٍؗٚ, reason: contains not printable characters */
                public final /* synthetic */ float f31068e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC14468e f31069e;

                /* renamed from: eؙِۛ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f31070e;

                /* renamed from: eؚٕؒ, reason: contains not printable characters */
                public final /* synthetic */ boolean f31071e;

                /* renamed from: eًؕۙ, reason: contains not printable characters */
                public final /* synthetic */ Function2 f31072e;

                /* renamed from: eٌٍٚ, reason: contains not printable characters */
                public final /* synthetic */ C1839e f31073e;

                /* renamed from: eٍۗۛ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f31074e;

                /* renamed from: eٍُٝ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12123e f31075e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ long f31076e;

                /* renamed from: eّٕۜ, reason: contains not printable characters */
                public final /* synthetic */ Function2 f31077e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ Function2 f31079e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ long f31080e;

                /* renamed from: eٗۥۚ, reason: contains not printable characters */
                public final /* synthetic */ int f31081e;

                {
                    this.f31081e = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert6 = AbstractC5190e.advert(1);
                    int advert7 = AbstractC5190e.advert(this.f31081e);
                    AbstractC10560e.appmetrica(InterfaceC12864e.this, this.f31069e, this.f31065e, this.f31076e, this.f31062e, this.f31080e, this.f31079e, this.f31073e, this.f31077e, this.f31066e, this.f31074e, this.f31064e, this.f31063e, this.f31067e, this.f31071e, this.f31072e, this.f31070e, this.f31068e, this.f31075e, (C13770e) obj, advert6, advert7);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        if (defpackage.AbstractC7844e.appmetrica(r11, r12, false, r3, r6) == r9) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, eٔۦْ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object billing(defpackage.C5070e r10, float r11, defpackage.C15217e r12, defpackage.InterfaceC2869e r13, defpackage.AbstractC10731e r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10560e.billing(eَٟؗ, float, eٕؔۗ, eؔۜؐ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void license(final kotlin.jvm.functions.Function2 r18, defpackage.InterfaceC12864e r19, kotlin.jvm.functions.Function2 r20, kotlin.jvm.functions.Function3 r21, float r22, defpackage.InterfaceC11968e r23, defpackage.C13793e r24, defpackage.InterfaceC2566e r25, defpackage.InterfaceC12123e r26, defpackage.C13770e r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10560e.license(kotlin.jvm.functions.Function2, eّۤۧ, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, eِۚ, eٓؗۘ, eُؔٓ, eِۦۦ, eٓؕۥ, int, int):void");
    }

    public static final void metrica(final InterfaceC12864e interfaceC12864e, final Function2 function2, final C1839e c1839e, final C1839e c1839e2, final C9577e c9577e, final Function2 function22, final Function3 function3, final float f, final InterfaceC12123e interfaceC12123e, final InterfaceC11968e interfaceC11968e, final C13793e c13793e, final InterfaceC2566e interfaceC2566e, C13770e c13770e, final int i, final int i2) {
        int i3;
        Function2 function23;
        C1839e c1839e3;
        C1839e c1839e4;
        C9577e c9577e2;
        int i4;
        InterfaceC2566e interfaceC2566e2;
        c13770e.m3671package(703932376);
        if ((i & 6) == 0) {
            i3 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function23 = function2;
            i3 |= c13770e.yandex(function23) ? 32 : 16;
        } else {
            function23 = function2;
        }
        if ((i & 384) == 0) {
            c1839e3 = c1839e;
            i3 |= c13770e.purchase(c1839e3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            c1839e3 = c1839e;
        }
        if ((i & 3072) == 0) {
            i3 |= c13770e.yandex(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            c1839e4 = c1839e2;
            i3 |= c13770e.purchase(c1839e4) ? 16384 : 8192;
        } else {
            c1839e4 = c1839e2;
        }
        if ((196608 & i) == 0) {
            c9577e2 = c9577e;
            i3 |= c13770e.purchase(c9577e2) ? 131072 : 65536;
        } else {
            c9577e2 = c9577e;
        }
        if ((1572864 & i) == 0) {
            i3 |= c13770e.yandex(function22) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c13770e.yandex(function3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c13770e.metrica(f) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c13770e.purchase(interfaceC12123e) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c13770e.purchase(interfaceC11968e) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c13770e.purchase(c13793e) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            interfaceC2566e2 = interfaceC2566e;
            i4 |= c13770e.purchase(interfaceC2566e2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            interfaceC2566e2 = interfaceC2566e;
        }
        int i5 = i4;
        if (c13770e.m3673protected(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 147) == 146) ? false : true)) {
            ((C1819e) c13770e.adcel(ad)).ad(new C5640e(interfaceC12864e, function23, c1839e3, c1839e4, c9577e2, function22, function3, f, interfaceC12123e, interfaceC11968e, c13793e, interfaceC2566e2), c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٓۥَ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(i | 1);
                    int advert2 = AbstractC5190e.advert(i2);
                    AbstractC10560e.metrica(InterfaceC12864e.this, function2, c1839e, c1839e2, c9577e, function22, function3, f, interfaceC12123e, interfaceC11968e, c13793e, interfaceC2566e, (C13770e) obj, advert, advert2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void purchase(final InterfaceC12864e interfaceC12864e, final Function2 function2, final C1839e c1839e, final float f, final Function2 function22, final C1839e c1839e2, final Function2 function23, final C1839e c1839e3, final Function2 function24, final C1839e c1839e4, final InterfaceC3886e interfaceC3886e, final C2892e c2892e, final Function3 function3, final float f2, final float f3, final InterfaceC11968e interfaceC11968e, final C13793e c13793e, final InterfaceC2566e interfaceC2566e, C13770e c13770e, final int i, final int i2) {
        int i3;
        C1839e c1839e5;
        float f4;
        Function2 function25;
        int i4;
        c13770e.m3671package(1092180406);
        if ((i & 6) == 0) {
            i3 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c13770e.yandex(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            c1839e5 = c1839e;
            i3 |= c13770e.purchase(c1839e5) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            c1839e5 = c1839e;
        }
        if ((i & 3072) == 0) {
            f4 = f;
            i3 |= c13770e.metrica(f4) ? 2048 : 1024;
        } else {
            f4 = f;
        }
        if ((i & 24576) == 0) {
            function25 = function22;
            i3 |= c13770e.yandex(function25) ? 16384 : 8192;
        } else {
            function25 = function22;
        }
        if ((i & 196608) == 0) {
            i3 |= c13770e.purchase(c1839e2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c13770e.yandex(function23) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c13770e.purchase(c1839e3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c13770e.yandex(function24) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c13770e.purchase(c1839e4) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c13770e.purchase(interfaceC3886e) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c13770e.yandex(c2892e) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c13770e.yandex(function3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c13770e.metrica(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c13770e.metrica(f3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= c13770e.purchase(interfaceC11968e) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= c13770e.purchase(c13793e) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= c13770e.purchase(interfaceC2566e) ? 8388608 : 4194304;
        }
        if (c13770e.m3673protected(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            ((C18123e) c13770e.adcel(vip)).ad(new C2702e(interfaceC12864e, function2, c1839e5, f4, function25, c1839e2, function23, c1839e3, function24, c1839e4, interfaceC3886e, c2892e, function3, f2, f3, interfaceC11968e, c13793e, interfaceC2566e), c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eؘؚۖ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(i | 1);
                    int advert2 = AbstractC5190e.advert(i2);
                    AbstractC10560e.purchase(InterfaceC12864e.this, function2, c1839e, f, function22, c1839e2, function23, c1839e3, function24, c1839e4, interfaceC3886e, c2892e, function3, f2, f3, interfaceC11968e, c13793e, interfaceC2566e, (C13770e) obj, advert, advert2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(final kotlin.jvm.functions.Function2 r24, defpackage.InterfaceC12864e r25, kotlin.jvm.functions.Function2 r26, final defpackage.C2892e r27, kotlin.jvm.functions.Function3 r28, defpackage.InterfaceC3886e r29, float r30, float r31, defpackage.InterfaceC11968e r32, final defpackage.C13793e r33, final defpackage.InterfaceC2566e r34, defpackage.C13770e r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10560e.vip(kotlin.jvm.functions.Function2, eّۤۧ, kotlin.jvm.functions.Function2, eؔ۟ٓ, kotlin.jvm.functions.Function3, eؖؖؖ, float, float, eِۚ, eٓؗۘ, eُؔٓ, eٓؕۥ, int, int):void");
    }

    public static final C5070e yandex(C13770e c13770e) {
        Object[] objArr = new Object[0];
        C11883e c11883e = C5070e.appmetrica;
        boolean metrica2 = c13770e.metrica(-3.4028235E38f) | c13770e.metrica(0.0f) | c13770e.metrica(0.0f);
        Object m3681throw = c13770e.m3681throw();
        if (metrica2 || m3681throw == C2987e.ad) {
            m3681throw = new C0743e(8);
            c13770e.m3682throws(m3681throw);
        }
        return (C5070e) AbstractC10510e.appmetrica(objArr, c11883e, (Function0) m3681throw, c13770e, 0);
    }
}
