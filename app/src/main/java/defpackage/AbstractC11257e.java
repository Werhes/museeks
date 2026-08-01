package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۛؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11257e {
    public static final float ad = 4;

    public static final void ad(final C12380e c12380e, final InterfaceC12864e interfaceC12864e, boolean z, C1839e c1839e, C8651e c8651e, final Function2 function2, Function2 function22, boolean z2, InterfaceC12006e interfaceC12006e, final C4988e c4988e, final InterfaceC13435e interfaceC13435e, InterfaceC15917e interfaceC15917e, C9137e c9137e, InterfaceC16154e interfaceC16154e, C17085e c17085e, InterfaceC12123e interfaceC12123e, C13770e c13770e, int i, int i2, int i3) {
        boolean z3;
        int i4;
        Function2 function23;
        int i5;
        boolean z4;
        int i6;
        InterfaceC12006e interfaceC12006e2;
        int i7;
        C1839e c1839e2;
        C8651e c8651e2;
        C9137e c9137e2;
        C17085e c17085e2;
        InterfaceC12123e interfaceC12123e2;
        InterfaceC12006e interfaceC12006e3;
        boolean z5;
        Function2 function24;
        boolean z6;
        InterfaceC15917e interfaceC15917e2;
        InterfaceC16154e interfaceC16154e2;
        C1839e c1839e3;
        InterfaceC15917e interfaceC15917e3;
        final InterfaceC12006e interfaceC12006e4;
        final C9137e c9137e3;
        final InterfaceC12123e appmetrica;
        final InterfaceC16154e interfaceC16154e3;
        final C17085e c17085e3;
        final boolean z7;
        final InterfaceC15917e interfaceC15917e4;
        final C8651e c8651e3;
        c13770e.m3671package(-2007078942);
        int i8 = i | (c13770e.purchase(c12380e) ? 4 : 2) | (c13770e.purchase(interfaceC12864e) ? 32 : 16);
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 = i8 | 384;
            z3 = z;
        } else {
            z3 = z;
            i4 = i8 | (c13770e.billing(z3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i10 = i4 | 907619328;
        int i11 = i2 | 54;
        int i12 = i3 & 4096;
        if (i12 != 0) {
            i5 = i2 | 438;
            function23 = function22;
        } else {
            function23 = function22;
            i5 = i11 | (c13770e.yandex(function23) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i13 = i3 & 8192;
        if (i13 != 0) {
            i6 = i5 | 3072;
            z4 = z2;
        } else {
            z4 = z2;
            i6 = i5 | (c13770e.billing(z4) ? 2048 : 1024);
        }
        int i14 = i3 & 16384;
        if (i14 != 0) {
            i7 = i6 | 24576;
            interfaceC12006e2 = interfaceC12006e;
        } else {
            interfaceC12006e2 = interfaceC12006e;
            i7 = i6 | (c13770e.purchase(interfaceC12006e2) ? 16384 : 8192);
        }
        int i15 = i7 | 196608;
        if ((i2 & 1572864) == 0) {
            i15 |= c13770e.purchase(c4988e) ? 1048576 : 524288;
        }
        int i16 = i15 | (c13770e.purchase(interfaceC13435e) ? 8388608 : 4194304);
        if ((i2 & 100663296) == 0) {
            i16 |= ((i3 & 262144) == 0 && c13770e.purchase(interfaceC15917e)) ? 67108864 : 33554432;
        }
        if (c13770e.m3673protected(i10 & 1, ((i10 & 306783379) == 306783378 && ((i16 | 805306368) & 306783379) == 306783378 && (((((i3 & 4194304) != 0 || !c13770e.purchase(c17085e)) ? (char) 128 : (char) 256) | 25618) & 9363) == 9362) ? false : true)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                boolean z8 = i9 == 0 ? z3 : true;
                c1839e3 = (C1839e) c13770e.adcel(AbstractC14489e.ad);
                C8651e c8651e4 = new C8651e();
                if (i12 != 0) {
                    function23 = null;
                }
                if (i13 != 0) {
                    z4 = false;
                }
                InterfaceC12006e interfaceC12006e5 = i14 == 0 ? interfaceC12006e2 : null;
                if ((i3 & 262144) != 0) {
                    InterfaceC15917e.f31363e.getClass();
                    interfaceC15917e3 = C10990e.f21752e;
                } else {
                    interfaceC15917e3 = interfaceC15917e;
                }
                C9137e appmetrica2 = AbstractC5967e.appmetrica(c13770e);
                C18121e c18121e = C18121e.ad;
                InterfaceC16154e ad2 = AbstractC8949e.ad(c13770e, 5);
                C17085e metrica = (i3 & 4194304) != 0 ? C18121e.metrica(c13770e, 6) : c17085e;
                interfaceC12006e4 = interfaceC12006e5;
                c9137e3 = appmetrica2;
                appmetrica = C18121e.appmetrica(c18121e);
                interfaceC16154e3 = ad2;
                c17085e3 = metrica;
                z7 = z8;
                interfaceC15917e4 = interfaceC15917e3;
                c8651e3 = c8651e4;
            } else {
                c13770e.m3659default();
                c1839e3 = c1839e;
                interfaceC15917e4 = interfaceC15917e;
                c9137e3 = c9137e;
                interfaceC16154e3 = interfaceC16154e;
                appmetrica = interfaceC12123e;
                interfaceC12006e4 = interfaceC12006e2;
                z7 = z3;
                c8651e3 = c8651e;
                c17085e3 = c17085e;
            }
            final boolean z9 = z4;
            final Function2 function25 = function23;
            c13770e.admob();
            c13770e.m3676strictfp(1647363481);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = AbstractC17861e.adcel(c13770e);
            }
            final C15274e c15274e = (C15274e) m3681throw;
            c13770e.Signature(false);
            c13770e.m3676strictfp(-362495780);
            long metrica2 = c1839e3.metrica();
            if (metrica2 == 16) {
                metrica2 = c17085e3.appmetrica(z7, z9, ((Boolean) AbstractC13281e.metrica(c15274e, c13770e, 0).getValue()).booleanValue());
            }
            long j = metrica2;
            c13770e.Signature(false);
            final C1839e appmetrica3 = c1839e3.appmetrica(new C1839e(j, 0L, null, null, 0L, 0L, 0, 0, 0L, 16777214));
            AbstractC1101e.ad(AbstractC8389e.ad.ad(c17085e3.mopub), AbstractC16653e.license(-416142558, new Function2() { // from class: eّٚۚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C13770e c13770e2 = (C13770e) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                        c13770e2.m3676strictfp(-2026714080);
                        c13770e2.Signature(false);
                        InterfaceC12864e premium = InterfaceC12864e.this.premium(C0115e.f1276e);
                        String vip = AbstractC9408e.vip(c13770e2, R.string.default_error_message);
                        boolean z10 = z9;
                        InterfaceC12864e appmetrica4 = AbstractC2754e.appmetrica(premium, z10, vip);
                        C18121e c18121e2 = C18121e.ad;
                        InterfaceC12864e ad3 = AbstractC18007e.ad(appmetrica4, C18121e.metrica, C18121e.vip);
                        C17085e c17085e4 = c17085e3;
                        C18466e c18466e = new C18466e(z10 ? c17085e4.adcel : c17085e4.startapp);
                        boolean z11 = z7;
                        C15274e c15274e2 = c15274e;
                        C2892e license = AbstractC16653e.license(-98391231, new C8965e(z11, z10, c15274e2, c17085e4, interfaceC16154e3, 1), c13770e2);
                        C12380e c12380e2 = c12380e;
                        InterfaceC15917e interfaceC15917e5 = interfaceC15917e4;
                        AbstractC0483e.vip(c12380e2, ad3, z11, interfaceC12006e4, appmetrica3, c4988e, interfaceC13435e, interfaceC15917e5, c15274e2, c18466e, new C11431e(c12380e2, interfaceC15917e5, c8651e3, function2, null, function25, z11, z10, c15274e2, appmetrica, c17085e4, license), c9137e3, c13770e2, 0);
                    } else {
                        c13770e2.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, 56);
            c1839e2 = c1839e3;
            c8651e2 = c8651e3;
            z5 = z7;
            interfaceC15917e2 = interfaceC15917e4;
            interfaceC12006e3 = interfaceC12006e4;
            c9137e2 = c9137e3;
            interfaceC12123e2 = appmetrica;
            c17085e2 = c17085e3;
            z6 = z9;
            function24 = function25;
            interfaceC16154e2 = interfaceC16154e3;
        } else {
            c13770e.m3659default();
            c1839e2 = c1839e;
            c8651e2 = c8651e;
            c9137e2 = c9137e;
            c17085e2 = c17085e;
            interfaceC12123e2 = interfaceC12123e;
            interfaceC12006e3 = interfaceC12006e2;
            z5 = z3;
            function24 = function23;
            z6 = z4;
            interfaceC15917e2 = interfaceC15917e;
            interfaceC16154e2 = interfaceC16154e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3388e(c12380e, interfaceC12864e, z5, c1839e2, c8651e2, function2, function24, z6, interfaceC12006e3, c4988e, interfaceC13435e, interfaceC15917e2, c9137e2, interfaceC16154e2, c17085e2, interfaceC12123e2, i, i2, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x0563, code lost:
    
        if (r3.yandex(r0) != false) goto L257;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05bc  */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void license(kotlin.jvm.functions.Function2 r40, final kotlin.jvm.functions.Function3 r41, kotlin.jvm.functions.Function2 r42, final kotlin.jvm.functions.Function2 r43, final kotlin.jvm.functions.Function2 r44, final kotlin.jvm.functions.Function2 r45, final kotlin.jvm.functions.Function2 r46, final boolean r47, final defpackage.C8651e r48, final defpackage.C17894e r49, final defpackage.C17894e r50, final defpackage.C17894e r51, final kotlin.jvm.functions.Function1 r52, final defpackage.C2892e r53, kotlin.jvm.functions.Function2 r54, defpackage.InterfaceC12123e r55, defpackage.C13770e r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11257e.license(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, eٌّۣ, e٘ٝٞ, e٘ٝٞ, e٘ٝٞ, kotlin.jvm.functions.Function1, eؔ۟ٓ, kotlin.jvm.functions.Function2, eِۦۦ, eٓؕۥ, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void metrica(final java.lang.String r38, final kotlin.jvm.functions.Function1 r39, defpackage.InterfaceC12864e r40, boolean r41, defpackage.C1839e r42, kotlin.jvm.functions.Function2 r43, kotlin.jvm.functions.Function2 r44, kotlin.jvm.functions.Function2 r45, kotlin.jvm.functions.Function2 r46, boolean r47, defpackage.C2864e r48, defpackage.C4988e r49, defpackage.C16636e r50, boolean r51, int r52, int r53, defpackage.InterfaceC16154e r54, defpackage.C17085e r55, defpackage.C13770e r56, final int r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11257e.metrica(java.lang.String, kotlin.jvm.functions.Function1, eّۤۧ, boolean, eٕؓۧ, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, eؔۛۛ, eؗٚٓ, eٖۥۤ, boolean, int, int, eّٖؖ, eٗٙٓ, eٓؕۥ, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(final defpackage.C0398e r39, final kotlin.jvm.functions.Function1 r40, final defpackage.InterfaceC12864e r41, boolean r42, defpackage.C1839e r43, kotlin.jvm.functions.Function2 r44, kotlin.jvm.functions.Function2 r45, defpackage.C2864e r46, final defpackage.C4988e r47, defpackage.C16636e r48, boolean r49, int r50, int r51, defpackage.InterfaceC16154e r52, defpackage.C17085e r53, defpackage.C13770e r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11257e.vip(eؑٚٞ, kotlin.jvm.functions.Function1, eّۤۧ, boolean, eٕؓۧ, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, eؔۛۛ, eؗٚٓ, eٖۥۤ, boolean, int, int, eّٖؖ, eٗٙٓ, eٓؕۥ, int, int, int):void");
    }
}
