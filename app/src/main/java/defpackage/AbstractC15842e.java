package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۥّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15842e {
    public static final C2892e ad = new C2892e(-951928243, false, new C8171e(19));
    public static final C2892e vip = new C2892e(-1183435828, false, new C8171e(20));
    public static final C12244e metrica = new Object();

    public static final void ad(Function0 function0, C2357e c2357e, int i, C13770e c13770e, int i2) {
        int i3;
        c13770e.m3671package(-1449283305);
        if ((i2 & 6) == 0) {
            i3 = (c13770e.yandex(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= c13770e.license(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 131) != 130)) {
            float f = 8;
            InterfaceC12864e vip2 = AbstractC12447e.vip(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), AbstractC6549e.ad(f));
            C16005e c16005e = AbstractC10244e.ad;
            C15492e c15492e = AbstractC11785e.ad;
            float f2 = 16;
            AbstractC1513e.ad(function0, vip2, false, AbstractC6549e.ad(f), AbstractC10244e.ad(((C7019e) c13770e.adcel(c15492e)).ad.admob, ((C7019e) c13770e.adcel(c15492e)).ad.tapsense, C3618e.vip(0.12f, ((C7019e) c13770e.adcel(c15492e)).ad.admob), C3618e.vip(0.38f, ((C7019e) c13770e.adcel(c15492e)).ad.admob), c13770e, 0), null, null, new C16005e(f2, f2, f2, f2), AbstractC16653e.license(-1152862425, new C14362e(i, 6), c13770e), c13770e, (i3 & 14) | 817889280, 356);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2640e(function0, c2357e, i, i2, 2);
        }
    }

    public static final int adcel(int i, float f, int i2) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static final void appmetrica(int i, long j, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        InterfaceC12864e interfaceC12864e2;
        InterfaceC12864e interfaceC12864e3;
        c13770e.m3671package(-316992180);
        int i2 = (c13770e.license(R.drawable.ic_add_square_outline_28) ? 4 : 2) | i | 48 | (c13770e.appmetrica(j) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            c13770e.m3655case();
            int i3 = i & 1;
            C0115e c0115e = C0115e.f1276e;
            if (i3 == 0 || c13770e.isPro()) {
                interfaceC12864e3 = c0115e;
            } else {
                c13770e.m3659default();
                interfaceC12864e3 = interfaceC12864e;
            }
            c13770e.admob();
            InterfaceC12864e metrica2 = AbstractC16136e.metrica(AbstractC12447e.vip(interfaceC12864e3, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica.metrica), C3618e.vip(0.25f, j), AbstractC10432e.ad);
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j2 = c13770e.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, metrica2);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_add_square_outline_28, i2 & 14, c13770e), null, AbstractC18007e.startapp(AbstractC12220e.mopub(c0115e, 8), 24), j, c13770e, 440, 0);
            c13770e.Signature(true);
            interfaceC12864e2 = interfaceC12864e3;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9560e(interfaceC12864e2, j, i, 1);
        }
    }

    public static C13364e billing(float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        float f4 = 0;
        if ((i & 8) != 0) {
            f3 = 0;
        }
        return new C13364e(f, f2, f4, f3);
    }

    public static final void license(Function0 function0, final C17561e c17561e, C13770e c13770e, int i) {
        c13770e.m3671package(380679085);
        int i2 = 2;
        int i3 = (c13770e.yandex(function0) ? 4 : 2) | i | (c13770e.yandex(c17561e) ? 32 : 16);
        final int i4 = 0;
        int i5 = 18;
        final int i6 = 1;
        if (c13770e.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            C2892e license = AbstractC16653e.license(1450949262, new Function2() { // from class: eًؙۚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                                AbstractC14489e.vip(c17561e.ad(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e3 = (C13770e) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                AbstractC8461e.ad(c17561e.license, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 42), AbstractC6549e.ad), null, null, c13770e3, 48, 2040);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e);
            C2892e license2 = AbstractC16653e.license(-1895528305, new Function2() { // from class: eًؙۚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i6) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                                AbstractC14489e.vip(c17561e.ad(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e3 = (C13770e) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                AbstractC8461e.ad(c17561e.license, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 42), AbstractC6549e.ad), null, null, c13770e3, 48, 2040);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e);
            C2892e license3 = AbstractC16653e.license(-947038576, new C14903e(i5, function0), c13770e);
            float f = AbstractC11992e.ad;
            AbstractC16429e.ad(AbstractC0718e.purchase, null, null, license, license2, license3, AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e, 510), 0.0f, 0.0f, c13770e, 224262, 390);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2173e(function0, c17561e, i, i2);
        }
    }

    public static final void metrica(String str, C13770e c13770e, int i) {
        c13770e.m3671package(-1675032180);
        int i2 = (c13770e.purchase(str) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C2892e license = AbstractC16653e.license(-754711123, new C11449e(str, 20), c13770e);
            float f = AbstractC11992e.ad;
            AbstractC16429e.ad(AbstractC0718e.license, null, null, license, AbstractC0718e.appmetrica, null, AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e, 510), 0.0f, 0.0f, c13770e, 27654, 422);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11449e(str, i, 21);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0024, code lost:
    
        if (r2 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.AbstractC14601e mopub(defpackage.InterfaceC6141e r2, java.lang.Object r3) {
        /*
            boolean r0 = r3 instanceof defpackage.AbstractC14601e
            if (r0 == 0) goto L7
            eٌٔؖ r3 = (defpackage.AbstractC14601e) r3
            return r3
        L7:
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L48
            eًٌٍ r2 = r2.loadAd()
            eّۨؒ r2 = r2.ad()
            java.lang.String r0 = "Content-Type"
            java.lang.String r2 = r2.inmobi(r0)
            if (r2 == 0) goto L26
            eٜؓؗ r0 = defpackage.C1622e.f4539e     // Catch: defpackage.C18445e -> L23
            eٜؓؗ r2 = defpackage.AbstractC6227e.metrica(r2)     // Catch: defpackage.C18445e -> L23
            goto L24
        L23:
            r2 = r1
        L24:
            if (r2 != 0) goto L28
        L26:
            eٜؓؗ r2 = defpackage.AbstractC17135e.vip
        L28:
            java.nio.charset.Charset r0 = defpackage.AbstractC9757e.ad(r2)
            if (r0 != 0) goto L40
            eٜؓؗ r0 = defpackage.AbstractC17135e.ad
            boolean r0 = r2.m658e(r0)
            if (r0 == 0) goto L40
            java.nio.charset.Charset r0 = defpackage.AbstractC5508e.ad
            java.lang.String r0 = r0.name()
            eٜؓؗ r2 = r2.m657e(r0)
        L40:
            eّؑؖ r0 = new eّؑؖ
            java.lang.String r3 = (java.lang.String) r3
            r0.<init>(r3, r2, r1)
            return r0
        L48:
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L55
            eٖؕ۟ r2 = new eٖؕ۟
            byte[] r3 = (byte[]) r3
            r0 = 6
            r2.<init>(r3, r1, r0)
            return r2
        L55:
            boolean r2 = r3 instanceof defpackage.C2394e
            if (r2 == 0) goto L61
            eْؐؕ r2 = new eْؐؕ
            eۣؔؗ r3 = (defpackage.C2394e) r3
            r2.<init>(r3)
            return r2
        L61:
            boolean r2 = r3 instanceof defpackage.InterfaceC13033e
            if (r2 == 0) goto L6c
            eٖۚٙ r2 = new eٖۚٙ
            r0 = 1
            r2.<init>(r0, r3)
            return r2
        L6c:
            boolean r2 = r3 instanceof java.io.InputStream
            if (r2 == 0) goto L77
            eٖۚٙ r2 = new eٖۚٙ
            r0 = 0
            r2.<init>(r0, r3)
            return r2
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15842e.mopub(eؙؓؓ, java.lang.Object):eٌٔؖ");
    }

    public static final void purchase(C17561e c17561e, Function0 function0, Function0 function02, Function0 function03, C2357e c2357e, String str, int i, boolean z, C13770e c13770e, int i2) {
        int i3;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(103876077);
        int i4 = i2 | (c13770e2.yandex(c17561e) ? 4 : 2) | (c13770e2.yandex(function0) ? 32 : 16) | (c13770e2.yandex(function02) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e2.yandex(function03) ? 2048 : 1024) | (c13770e2.yandex(c2357e) ? 16384 : 8192) | (c13770e2.purchase(str) ? 131072 : 65536) | (c13770e2.license(i) ? 1048576 : 524288) | (c13770e2.billing(z) ? 8388608 : 4194304);
        if (c13770e2.m3673protected(i4 & 1, (4793491 & i4) != 4793490)) {
            C13964e billing = AbstractC16497e.billing(16);
            InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            C4789e ad2 = AbstractC14801e.ad(billing, C5438e.f11672e, c13770e2, 6);
            long j = c13770e2.f27286case;
            int i5 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, metrica2);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i5), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            AbstractC0865e.ad(null, null, null, null, null, AbstractC16653e.license(921127173, new C6710e(2, str, function02, c17561e), c13770e2), c13770e2, 196608, 31);
            if (z) {
                c13770e2.m3676strictfp(1926547495);
                i3 = 1924121931;
                AbstractC0865e.ad(null, null, null, null, null, AbstractC0718e.metrica, c13770e2, 196608, 31);
            } else {
                i3 = 1924121931;
                c13770e2.m3676strictfp(1924121931);
            }
            c13770e2.Signature(false);
            int i6 = i4 >> 9;
            vip(function0, c2357e, c13770e2, ((i4 >> 3) & 14) | (i6 & 112));
            ad(function03, c2357e, i, c13770e2, (i6 & 126) | ((i4 >> 12) & 896));
            if (c2357e.f5899e) {
                c13770e2.m3676strictfp(1927228596);
                AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, R.string.spark_payment_window_action_commission), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).vip.amazon, c13770e, 0, 0, 131070);
                c13770e2 = c13770e;
            } else {
                c13770e2.m3676strictfp(i3);
            }
            c13770e2.Signature(false);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C2959e(c17561e, function0, function02, function03, c2357e, str, i, z, i2);
        }
    }

    public static final float startapp(float f, float f2, float f3) {
        return (f3 * f2) + ((1 - f3) * f);
    }

    public static final void vip(Function0 function0, C2357e c2357e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-796618109);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(c2357e) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            AbstractC0865e.license(function0, null, false, null, null, null, null, AbstractC16653e.license(-256123348, new C17871e(20, c2357e), c13770e), c13770e, (i2 & 14) | 100663296, 254);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(function0, c2357e, i, 20);
        }
    }

    public static final float yandex(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }
}
