package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۛٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11267e {
    public static final C2892e ad = new C2892e(1804580996, false, new C0972e(6));
    public static final C2892e vip = new C2892e(1656891506, false, new C0972e(7));
    public static final C2892e metrica = new C2892e(1119391541, false, new C0972e(8));
    public static final C2892e license = new C2892e(460325460, false, new C0972e(9));
    public static final C2892e appmetrica = new C2892e(-632378505, false, new C9375e(10));

    public static final void ad(final C12755e c12755e, final String str, final InterfaceC12864e interfaceC12864e, final Function1 function1, final Function1 function12, final InterfaceC8079e interfaceC8079e, final InterfaceC2872e interfaceC2872e, final C2815e c2815e, C13770e c13770e, final int i, final int i2) {
        int i3;
        Function1 function13;
        Function1 function14;
        InterfaceC8079e interfaceC8079e2;
        int i4;
        C14542e c14542e;
        c13770e.m3671package(1236588022);
        if ((i & 6) == 0) {
            i3 = (c13770e.purchase(c12755e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c13770e.purchase(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            function13 = function1;
            i3 |= c13770e.yandex(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if ((i & 24576) == 0) {
            function14 = function12;
            i3 |= c13770e.yandex(function14) ? 16384 : 8192;
        } else {
            function14 = function12;
        }
        if ((196608 & i) == 0) {
            interfaceC8079e2 = interfaceC8079e;
            i3 |= c13770e.purchase(interfaceC8079e2) ? 131072 : 65536;
        } else {
            interfaceC8079e2 = interfaceC8079e;
        }
        if ((1572864 & i) == 0) {
            i3 |= c13770e.purchase(interfaceC2872e) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= c13770e.metrica(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= c13770e.purchase(c2815e) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= c13770e.license(1) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c13770e.billing(true) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (c13770e.m3673protected(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            Object obj = c12755e.ad;
            int i5 = AbstractC14940e.vip;
            c13770e.m3676strictfp(-329318062);
            boolean z = obj instanceof C14542e;
            Object obj2 = C2987e.ad;
            if (z) {
                c13770e.m3676strictfp(-1008942344);
                c14542e = (C14542e) obj;
                if (c14542e.tapsense.yandex != null) {
                    c13770e.m3676strictfp(-1008902292);
                    c13770e.Signature(false);
                    c13770e.Signature(false);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3676strictfp(-1008854118);
                    InterfaceC10819e ad2 = AbstractC14940e.ad(interfaceC2872e, c13770e);
                    boolean purchase = c13770e.purchase(obj) | c13770e.purchase(ad2);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase || m3681throw == obj2) {
                        C5944e ad3 = C14542e.ad(c14542e);
                        ad3.admob = ad2;
                        m3681throw = ad3.ad();
                        c13770e.m3682throws(m3681throw);
                    }
                    c14542e = (C14542e) m3681throw;
                    AbstractC1786e.isPro(c13770e, false, false, false);
                }
            } else {
                c13770e.m3676strictfp(-1008595950);
                Context context = (Context) c13770e.adcel(AbstractC2676e.vip);
                InterfaceC10819e ad4 = AbstractC14940e.ad(interfaceC2872e, c13770e);
                boolean purchase2 = c13770e.purchase(context) | c13770e.purchase(obj) | c13770e.purchase(ad4);
                Object m3681throw2 = c13770e.m3681throw();
                if (purchase2 || m3681throw2 == obj2) {
                    C5944e c5944e = new C5944e(context);
                    c5944e.metrica = obj;
                    c5944e.admob = ad4;
                    m3681throw2 = c5944e.ad();
                    c13770e.m3682throws(m3681throw2);
                }
                c14542e = (C14542e) m3681throw2;
                c13770e.Signature(false);
                c13770e.Signature(false);
            }
            Object obj3 = c14542e.vip;
            if (obj3 instanceof C5944e) {
                throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            }
            C1367e c1367e = null;
            if (obj3 instanceof C1362e) {
                AbstractC14940e.metrica("ImageBitmap");
                throw null;
            }
            if (obj3 instanceof C17149e) {
                AbstractC14940e.metrica("ImageVector");
                throw null;
            }
            if (obj3 instanceof AbstractC10727e) {
                AbstractC14940e.metrica("Painter");
                throw null;
            }
            if (c14542e.metrica != null) {
                throw new IllegalArgumentException("request.target must be null.");
            }
            if (((AbstractC0003e) AbstractC8306e.metrica(c14542e, AbstractC15659e.appmetrica)) != null) {
                throw new IllegalArgumentException("request.lifecycle must be null.");
            }
            InterfaceC12732e interfaceC12732e = c12755e.metrica;
            C16401e c16401e = c12755e.vip;
            if (((Boolean) c13770e.adcel(AbstractC13276e.ad)).booleanValue()) {
                c13770e.m3676strictfp(2019030948);
                c1367e = (C1367e) c13770e.adcel(AbstractC5124e.ad);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(2019088453);
                c13770e.Signature(false);
            }
            InterfaceC12864e premium = interfaceC12864e.premium(new C8235e(c14542e, interfaceC12732e, c16401e, function13, function14, interfaceC8079e2, interfaceC2872e, c2815e, c1367e, str));
            C3783e c3783e = C3783e.mopub;
            long j = c13770e.f27286case;
            int i6 = (int) (j ^ (j >>> 32));
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, premium);
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC5685e.mopub.getClass();
            Function0 function0 = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(function0);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, c3783e, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, purchase3, C2721e.license);
            Function2 function2 = C2721e.adcel;
            if (c13770e.f27292implements || !AbstractC7890e.billing(c13770e.m3681throw(), Integer.valueOf(i6))) {
                c13770e.m3682throws(Integer.valueOf(i6));
                c13770e.vip(Integer.valueOf(i6), function2);
            }
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٜ٘ٚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    AbstractC11267e.ad(C12755e.this, str, interfaceC12864e, function1, function12, interfaceC8079e, interfaceC2872e, c2815e, (C13770e) obj4, AbstractC5190e.advert(i | 1), AbstractC5190e.advert(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0027, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C11795e appmetrica(defpackage.C11795e r9) {
        /*
            eْۤۡ r0 = r9.f27022e
            boolean r0 = r0.f27016e
            r1 = 0
            if (r0 != 0) goto L9
            goto Laf
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.AbstractC14070e.metrica(r0)
        L10:
            eّّؔ r0 = new eّّؔ
            r2 = 16
            eْۤۡ[] r3 = new defpackage.AbstractC13616e[r2]
            r4 = 0
            r0.<init>(r4, r3)
            eْۤۡ r9 = r9.f27022e
            eْۤۡ r3 = r9.f27024e
            if (r3 != 0) goto L24
            defpackage.AbstractC5851e.ad(r0, r9)
            goto L27
        L24:
            r0.license(r3)
        L27:
            int r9 = r0.f24868e
            if (r9 == 0) goto Laf
            int r9 = r9 + (-1)
            java.lang.Object r9 = r0.amazon(r9)
            eْۤۡ r9 = (defpackage.AbstractC13616e) r9
            int r3 = r9.f27020e
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3d
            defpackage.AbstractC5851e.ad(r0, r9)
            goto L27
        L3d:
            if (r9 == 0) goto L27
            int r3 = r9.f27014e
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto Lac
            r3 = r1
        L46:
            if (r9 == 0) goto L27
            boolean r5 = r9 instanceof defpackage.C11795e
            r6 = 1
            if (r5 == 0) goto L71
            eِ٘ؔ r9 = (defpackage.C11795e) r9
            eْۤۡ r5 = r9.f27022e
            boolean r5 = r5.f27016e
            if (r5 == 0) goto La7
            eٖۚۡ r5 = r9.m3239e()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L70
            if (r5 == r6) goto L70
            r6 = 2
            if (r5 == r6) goto L70
            r9 = 3
            if (r5 != r9) goto L68
            goto La7
        L68:
            eٔٚؖ r9 = new eٔٚؖ
            r0 = 10
            r9.<init>(r0)
            throw r9
        L70:
            return r9
        L71:
            int r5 = r9.f27014e
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto La7
            boolean r5 = r9 instanceof defpackage.AbstractC6126e
            if (r5 == 0) goto La7
            r5 = r9
            eؙؒؐ r5 = (defpackage.AbstractC6126e) r5
            eْۤۡ r5 = r5.f12873e
            r7 = r4
        L81:
            if (r5 == 0) goto La4
            int r8 = r5.f27014e
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto La1
            int r7 = r7 + 1
            if (r7 != r6) goto L8f
            r9 = r5
            goto La1
        L8f:
            if (r3 != 0) goto L98
            eّّؔ r3 = new eّّؔ
            eْۤۡ[] r8 = new defpackage.AbstractC13616e[r2]
            r3.<init>(r4, r8)
        L98:
            if (r9 == 0) goto L9e
            r3.license(r9)
            r9 = r1
        L9e:
            r3.license(r5)
        La1:
            eْۤۡ r5 = r5.f27024e
            goto L81
        La4:
            if (r7 != r6) goto La7
            goto L46
        La7:
            eْۤۡ r9 = defpackage.AbstractC5851e.vip(r3)
            goto L46
        Lac:
            eْۤۡ r9 = r9.f27024e
            goto L3d
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11267e.appmetrica(eِ٘ؔ):eِ٘ؔ");
    }

    public static byte[] billing(C12916e c12916e, C6831e c6831e) {
        byte[] bArr = new byte[c6831e.loadAd - 32];
        for (int i = 0; i < c6831e.purchase; i++) {
            C18478e c18478e = ((C18478e[]) c12916e.f25784e)[i];
            byte[] bArr2 = new byte[320];
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = i2 * 5;
                int[] iArr = (int[]) c18478e.f36228e;
                int i4 = i2 * 4;
                int i5 = iArr[i4];
                bArr2[i3] = (byte) i5;
                int i6 = iArr[i4 + 1];
                bArr2[i3 + 1] = (byte) ((i5 >> 8) | (i6 << 2));
                int i7 = i6 >> 6;
                int i8 = iArr[i4 + 2];
                bArr2[i3 + 2] = (byte) (i7 | (i8 << 4));
                int i9 = iArr[i4 + 3];
                bArr2[i3 + 3] = (byte) ((i9 << 6) | (i8 >> 4));
                bArr2[i3 + 4] = (byte) (i9 >> 2);
            }
            c18478e.getClass();
            System.arraycopy(bArr2, 0, bArr, i * 320, 320);
        }
        return bArr;
    }

    public static final C0763e license(C11795e c11795e) {
        AbstractC17732e abstractC17732e;
        if (c11795e.f27016e && (abstractC17732e = c11795e.f27018e) != null) {
            InterfaceC0043e metrica2 = AbstractC0890e.metrica(abstractC17732e);
            if (!metrica2.billing()) {
                metrica2 = null;
            }
            if (metrica2 != null) {
                return c11795e.m3242e(metrica2);
            }
        }
        return C0763e.appmetrica;
    }

    public static final C11795e metrica(C11795e c11795e) {
        C11795e purchase = ((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c11795e)).getFocusOwner()).purchase();
        if (purchase == null || !purchase.f27016e) {
            return null;
        }
        return purchase;
    }

    public static final boolean purchase(C11795e c11795e) {
        C13915e c13915e;
        AbstractC17732e abstractC17732e;
        C13915e c13915e2;
        AbstractC17732e abstractC17732e2 = c11795e.f27018e;
        return (abstractC17732e2 == null || (c13915e = abstractC17732e2.f34782e) == null || !c13915e.m3724throw() || (abstractC17732e = c11795e.f27018e) == null || (c13915e2 = abstractC17732e.f34782e) == null || !c13915e2.m3708extends()) ? false : true;
    }

    public static final Object vip(Object obj, boolean z) {
        EnumC8790e enumC8790e;
        if (z) {
            obj = (AbstractC17308e) obj;
            if ((obj instanceof C12250e) && (enumC8790e = ((C12250e) obj).startapp) != null) {
                C12816e c12816e = enumC8790e.f17704e;
                if (c12816e != null) {
                    return new C15381e(C1553e.vip(c12816e).license());
                }
                EnumC8790e.ad(15);
                throw null;
            }
        }
        return obj;
    }

    public static void yandex(C12916e c12916e, C9770e c9770e, C12916e c12916e2, byte[] bArr, byte[] bArr2, byte[] bArr3, C6831e c6831e) {
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = c6831e.billing;
            i = c6831e.purchase;
            i2 = c6831e.appmetrica;
            if (i3 >= i4) {
                break;
            }
            ((C18478e[]) c9770e.f19315e)[i3].m4548package(i2 * i3, bArr2);
            i3++;
        }
        for (int i5 = 0; i5 < i; i5++) {
            ((C18478e[]) c12916e2.f25784e)[i5].m4548package(i5 * i2, bArr3);
        }
        int i6 = 0;
        while (i6 < i) {
            C18478e c18478e = ((C18478e[]) c12916e.f25784e)[i6];
            int i7 = i6 * 416;
            c18478e.getClass();
            int i8 = 0;
            while (i8 < 32) {
                int i9 = (i8 * 13) + i7;
                int i10 = i8 * 8;
                int i11 = bArr[i9] & 255;
                int i12 = bArr[i9 + 1] & 255;
                int[] iArr = (int[]) c18478e.f36228e;
                iArr[i10] = (i11 | (i12 << 8)) & 8191;
                int i13 = i10 + 1;
                int i14 = (i12 >> 5) | ((bArr[i9 + 2] & 255) << 3);
                int i15 = bArr[i9 + 3] & 255;
                iArr[i13] = (i14 | (i15 << 11)) & 8191;
                int i16 = i10 + 2;
                int i17 = bArr[i9 + 4] & 255;
                iArr[i16] = ((i15 >> 2) | (i17 << 6)) & 8191;
                int i18 = i10 + 3;
                int i19 = (i17 >> 7) | ((bArr[i9 + 5] & 255) << 1);
                int i20 = bArr[i9 + 6] & 255;
                iArr[i18] = (i19 | (i20 << 9)) & 8191;
                int i21 = i10 + 4;
                int i22 = (i20 >> 4) | ((bArr[i9 + 7] & 255) << 4);
                int i23 = bArr[i9 + 8] & 255;
                iArr[i21] = (i22 | (i23 << 12)) & 8191;
                int i24 = i10 + 5;
                int i25 = bArr[i9 + 9] & 255;
                iArr[i24] = ((i23 >> 1) | (i25 << 7)) & 8191;
                int i26 = i10 + 6;
                int i27 = i6;
                int i28 = ((bArr[i9 + 10] & 255) << 2) | (i25 >> 6);
                int i29 = bArr[i9 + 11] & 255;
                iArr[i26] = (i28 | (i29 << 10)) & 8191;
                int i30 = i10 + 7;
                iArr[i30] = ((i29 >> 3) | ((bArr[i9 + 12] & 255) << 5)) & 8191;
                iArr[i10] = 4096 - iArr[i10];
                iArr[i13] = 4096 - iArr[i13];
                iArr[i16] = 4096 - iArr[i16];
                iArr[i18] = 4096 - iArr[i18];
                iArr[i21] = 4096 - iArr[i21];
                iArr[i24] = 4096 - iArr[i24];
                iArr[i26] = 4096 - iArr[i26];
                iArr[i30] = 4096 - iArr[i30];
                i8++;
                i6 = i27;
            }
            i6++;
        }
    }
}
