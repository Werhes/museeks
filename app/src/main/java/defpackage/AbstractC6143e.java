package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6143e {
    public static final C2892e ad = new C2892e(850733946, false, new C14123e(8));
    public static final C2892e vip = new C2892e(914678188, false, new C13060e(6));
    public static final C2892e metrica = new C2892e(40516442, false, new C13060e(7));
    public static final C2892e license = new C2892e(-1591578018, false, new C13060e(8));
    public static final C2892e appmetrica = new C2892e(-665249087, false, new C14123e(9));
    public static final C2892e purchase = new C2892e(403009902, false, new C14123e(10));

    public static int Signature(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        int i3 = iArr[i2];
        int i4 = iArr2[i2];
        int i5 = i - 2;
        if (((i5 >> 31) | ((i3 >> 31) ^ i3) | ((i4 >> 31) ^ i4)) != 0) {
            return i;
        }
        iArr[i5] = (i3 << 30) | iArr[i5];
        iArr2[i5] = iArr2[i5] | (i4 << 30);
        return i - 1;
    }

    public static final void ad(C15122e c15122e, boolean z, Function0 function0, InterfaceC12864e interfaceC12864e, Function0 function02, boolean z2, C13055e c13055e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        Function0 function03;
        boolean z3;
        C13055e c13055e2;
        int i3;
        Function0 function04;
        int i4;
        C13055e c13055e3;
        boolean z4;
        long j;
        long j2;
        long j3;
        long j4;
        c13770e.m3671package(-540314461);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c13770e.purchase(c15122e) : c13770e.yandex(c15122e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.billing(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 2048 : 1024;
        }
        int i5 = 221184 | i2;
        if ((1572864 & i) == 0) {
            i5 = 745472 | i2;
        }
        int i6 = 12582912 | i5;
        if ((i & 100663296) == 0) {
            i6 |= c13770e.yandex(c2892e) ? 67108864 : 33554432;
        }
        if (c13770e.m3673protected(i6 & 1, (38347923 & i6) != 38347922)) {
            c13770e.m3655case();
            int i7 = i & 1;
            C5170e c5170e = C2987e.ad;
            if (i7 == 0 || c13770e.isPro()) {
                Object m3681throw = c13770e.m3681throw();
                if (m3681throw == c5170e) {
                    i3 = 100663296;
                    m3681throw = new C13117e(0);
                    c13770e.m3682throws(m3681throw);
                } else {
                    i3 = 100663296;
                }
                function04 = (Function0) m3681throw;
                long j5 = ((C3618e) c13770e.adcel(AbstractC15705e.ad)).ad;
                long vip2 = C3618e.vip(0.4f, j5);
                C15492e c15492e = AbstractC12491e.ad;
                long j6 = ((C3618e) ((C6032e) c13770e.adcel(c15492e)).license.getValue()).ad;
                long adcel = ((C6032e) c13770e.adcel(c15492e)).adcel();
                i4 = i6 & (-3670017);
                c13055e3 = new C13055e(j5, vip2, j6, adcel, adcel, j5, C3618e.vip(0.4f, j5), j6);
                z4 = true;
            } else {
                c13770e.m3659default();
                z4 = z2;
                i4 = i6 & (-3670017);
                i3 = 100663296;
                function04 = function02;
                c13055e3 = c13055e;
            }
            c13770e.admob();
            boolean z5 = (i4 & 896) == 256;
            Object m3681throw2 = c13770e.m3681throw();
            if (z5 || m3681throw2 == c5170e) {
                m3681throw2 = new C17897e(13, function0);
                c13770e.m3682throws(m3681throw2);
            }
            InterfaceC12864e license2 = AbstractC17324e.license(interfaceC12864e, (Function1) m3681throw2);
            boolean z6 = (i4 & 112) == 32;
            Object m3681throw3 = c13770e.m3681throw();
            if (z6 || m3681throw3 == c5170e) {
                m3681throw3 = new C7317e(z, 5);
                c13770e.m3682throws(m3681throw3);
            }
            InterfaceC12864e ad2 = AbstractC1147e.ad(license2, false, (Function1) m3681throw3);
            boolean z7 = c15122e.ad;
            int i8 = i4 >> 18;
            int i9 = i4 >> 9;
            long j7 = z7 ? c13055e3.ad : c13055e3.vip;
            long j8 = z4 ? c13055e3.metrica : c13055e3.yandex;
            long j9 = c13055e3.license;
            long j10 = c13055e3.appmetrica;
            if (z7) {
                j = j10;
                j2 = c13055e3.purchase;
            } else {
                j = j10;
                j2 = c13055e3.billing;
            }
            long j11 = C3618e.startapp;
            if ((8224 & 1) != 0) {
                j3 = j2;
                j4 = ((C6032e) c13770e.adcel(AbstractC12491e.ad)).startapp();
            } else {
                j3 = j2;
                j4 = j11;
            }
            if ((8224 & 2) != 0) {
                j7 = AbstractC12491e.ad(j4, c13770e);
            }
            long j12 = j7;
            long license3 = (8224 & 4) != 0 ? ((C6032e) c13770e.adcel(AbstractC12491e.ad)).license() : j11;
            if ((8224 & 8) != 0) {
                j9 = AbstractC12491e.ad(license3, c13770e);
            }
            long j13 = j9;
            long j14 = j4;
            long j15 = (8224 & 16) != 0 ? license3 : j11;
            long ad3 = AbstractC12491e.ad(j15, c13770e);
            long j16 = j15;
            long vip3 = (8224 & 64) != 0 ? C3618e.vip(0.5f, ((C6032e) c13770e.adcel(AbstractC12491e.ad)).license()) : j11;
            long metrica2 = (8224 & 128) != 0 ? ((C6032e) c13770e.adcel(AbstractC12491e.ad)).metrica() : j8;
            long vip4 = (8224 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? C3618e.vip(0.4f, ((C6032e) c13770e.adcel(AbstractC12491e.ad)).adcel()) : j11;
            long appmetrica2 = (8224 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? ((C6032e) c13770e.adcel(AbstractC12491e.ad)).appmetrica() : j3;
            long vip5 = (8224 & 1024) != 0 ? C3618e.vip(0.5f, ((C6032e) c13770e.adcel(AbstractC12491e.ad)).license()) : j11;
            long metrica3 = (8224 & 2048) != 0 ? ((C6032e) c13770e.adcel(AbstractC12491e.ad)).metrica() : j;
            C3027e c3027e = new C3027e(j14, j12, license3, j13, j16, ad3, vip3, metrica2, vip4, appmetrica2, vip5, metrica3, (8224 & 4096) != 0 ? vip5 : j11, metrica3);
            InterfaceC16154e interfaceC16154e = (1022 & 1) != 0 ? ((C16305e) c13770e.adcel(AbstractC10984e.ad)).metrica : AbstractC10432e.ad;
            C13055e c13055e4 = c13055e3;
            Function0 function05 = function04;
            AbstractC11160e.license(z, function05, ad2, z4, 0.0f, new C4100e(interfaceC16154e, interfaceC16154e, interfaceC16154e, interfaceC16154e, interfaceC16154e, interfaceC16154e, interfaceC16154e, interfaceC16154e, interfaceC16154e, interfaceC16154e), c3027e, C7528e.metrica, null, null, AbstractC16653e.license(-3317309, new C10047e(c2892e, 1), c13770e), c13770e, ((i4 >> 3) & 14) | i3 | (i9 & 112) | ((i4 >> 6) & 7168), (i8 & 112) | 384, 1584);
            z3 = z4;
            c13055e2 = c13055e4;
            function03 = function05;
        } else {
            c13770e.m3659default();
            function03 = function02;
            z3 = z2;
            c13055e2 = c13055e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1004e(c15122e, z, function0, interfaceC12864e, function03, z3, c13055e2, c2892e, i);
        }
    }

    public static void admob(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int i4 = iArr3[0];
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        int i8 = i3 - 1;
        int i9 = iArr[i8] >> 31;
        int i10 = iArr2[i8] >> 31;
        int i11 = (i4 & i9) + (i5 & i10);
        int i12 = (i9 & i6) + (i10 & i7);
        int i13 = iArr4[0];
        long j = i4;
        long j2 = iArr[0];
        long j3 = i5;
        long j4 = iArr2[0];
        long j5 = (j3 * j4) + (j * j2);
        long j6 = i6;
        long j7 = i7;
        long j8 = (j7 * j4) + (j2 * j6);
        int i14 = i11 - (((((int) j5) * i2) + i11) & 1073741823);
        long j9 = i13;
        long j10 = i14;
        long j11 = (j9 * j10) + j5;
        long j12 = i12 - (((((int) j8) * i2) + i12) & 1073741823);
        char c = 30;
        long j13 = j11 >> 30;
        long j14 = ((j9 * j12) + j8) >> 30;
        int i15 = 1;
        while (i15 < i3) {
            int i16 = iArr4[i15];
            char c2 = c;
            long j15 = j12;
            long j16 = iArr[i15];
            long j17 = j * j16;
            long j18 = iArr2[i15];
            long j19 = i16;
            long j20 = j10;
            long amazon = AbstractC1786e.amazon(j19, j20, (j3 * j18) + j17, j13);
            long amazon2 = AbstractC1786e.amazon(j19, j15, (j18 * j7) + (j6 * j16), j14);
            int i17 = i15 - 1;
            iArr[i17] = ((int) amazon) & 1073741823;
            j13 = amazon >> c2;
            iArr2[i17] = ((int) amazon2) & 1073741823;
            j14 = amazon2 >> c2;
            i15++;
            i3 = i;
            c = c2;
            j10 = j20;
            j12 = j15;
        }
        iArr[i8] = (int) j13;
        iArr2[i8] = (int) j14;
    }

    public static int advert(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int i = 1;
        int numberOfLeadingZeros = (length << 5) - Integer.numberOfLeadingZeros(iArr[length - 1]);
        int i2 = 30;
        int i3 = (numberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[i3];
        int[] iArr7 = new int[i3];
        int[] iArr8 = new int[i3];
        int i4 = 0;
        iArr5[0] = 1;
        purchase(numberOfLeadingZeros, iArr2, iArr7);
        purchase(numberOfLeadingZeros, iArr, iArr8);
        System.arraycopy(iArr8, 0, iArr6, 0, i3);
        int mopub = mopub(iArr8[0]);
        int i5 = (int) (((numberOfLeadingZeros * 150964) + 99243) >>> 16);
        int i6 = 0;
        int i7 = 0;
        while (i7 < i5) {
            int i8 = iArr6[i4];
            int i9 = iArr7[i4];
            int i10 = i6;
            int i11 = i8;
            int i12 = i5;
            int i13 = i;
            int i14 = i3;
            int i15 = mopub;
            int i16 = i4;
            int i17 = i16;
            int i18 = i17;
            int i19 = 1073741824;
            int i20 = 1073741824;
            while (i16 < i2) {
                int i21 = i2;
                int i22 = i10 >> 31;
                int i23 = i16;
                int i24 = -(i9 & 1);
                int i25 = i9 - ((i11 ^ i22) & i24);
                int i26 = i18 - ((i20 ^ i22) & i24);
                int i27 = i19 - ((i17 ^ i22) & i24);
                int i28 = i24 & (~i22);
                i10 = (i10 ^ i28) + 1;
                i11 += i25 & i28;
                i20 += i26 & i28;
                i17 += i28 & i27;
                i9 = i25 >> 1;
                i18 = i26 >> 1;
                i19 = i27 >> 1;
                i16 = i23 + 1;
                i2 = i21;
            }
            int[] iArr9 = {i20, i17, i18, i19};
            mopub = i15;
            i3 = i14;
            admob(i3, mopub, iArr4, iArr5, iArr9, iArr8);
            subscription(i3, iArr6, iArr7, iArr9);
            i7 += 30;
            i5 = i12;
            i6 = i10;
            i = i13;
            i4 = 0;
        }
        int i29 = i;
        int i30 = i3 - 1;
        int i31 = iArr6[i30] >> 31;
        int i32 = 0;
        for (int i33 = 0; i33 < i30; i33++) {
            int i34 = ((iArr6[i33] ^ i31) - i31) + i32;
            iArr6[i33] = i34 & 1073741823;
            i32 = i34 >> 30;
        }
        iArr6[i30] = ((iArr6[i30] ^ i31) - i31) + i32;
        int i35 = iArr4[i30] >> 31;
        int i36 = 0;
        for (int i37 = 0; i37 < i30; i37++) {
            int i38 = (((iArr4[i37] + (iArr8[i37] & i35)) ^ i31) - i31) + i36;
            iArr4[i37] = i38 & 1073741823;
            i36 = i38 >> 30;
        }
        int i39 = (((iArr4[i30] + (i35 & iArr8[i30])) ^ i31) - i31) + i36;
        iArr4[i30] = i39;
        int i40 = i39 >> 31;
        int i41 = 0;
        for (int i42 = 0; i42 < i30; i42++) {
            int i43 = iArr4[i42] + (iArr8[i42] & i40) + i41;
            iArr4[i42] = i43 & 1073741823;
            i41 = i43 >> 30;
        }
        iArr4[i30] = iArr4[i30] + (i40 & iArr8[i30]) + i41;
        license(numberOfLeadingZeros, iArr4, iArr3);
        return billing(i3, i29, iArr6) & billing(i3, 0, iArr7);
    }

    public static int amazon(int[] iArr, int i) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 - iArr[i4];
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = i3 - iArr[i2];
        iArr[i2] = i6;
        return i6 >> 30;
    }

    public static int appmetrica(int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5 = 30;
        int i6 = 1;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(((-1) << i5) | i3);
            int i10 = i3 >> numberOfTrailingZeros;
            i6 <<= numberOfTrailingZeros;
            i8 <<= numberOfTrailingZeros;
            i -= numberOfTrailingZeros;
            i5 -= numberOfTrailingZeros;
            if (i5 <= 0) {
                iArr[0] = i6;
                iArr[1] = i8;
                iArr[2] = i9;
                iArr[3] = i7;
                return i;
            }
            if (i <= 0) {
                i = 2 - i;
                int i11 = -i2;
                int i12 = -i6;
                int i13 = -i8;
                i4 = ((-1) >>> (32 - (i > i5 ? i5 : i))) & 63 & (((i10 * i10) - 2) * i10 * i11);
                i10 = i11;
                i2 = i10;
                int i14 = i9;
                i9 = i12;
                i6 = i14;
                int i15 = i7;
                i7 = i13;
                i8 = i15;
            } else {
                i4 = ((-1) >>> (32 - (i > i5 ? i5 : i))) & 15 & (((((i2 + 1) & 4) << 1) + i2) * (-i10));
            }
            i3 = i10 + (i2 * i4);
            i9 += i6 * i4;
            i7 += i4 * i8;
        }
    }

    public static int billing(int i, int i2, int[] iArr) {
        int i3 = i2 ^ iArr[0];
        for (int i4 = 1; i4 < i; i4++) {
            i3 |= iArr[i4];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static void license(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            while (i2 < Math.min(32, i)) {
                j |= iArr[i3] << i2;
                i2 += 30;
                i3++;
            }
            iArr2[i4] = (int) j;
            j >>>= 32;
            i2 -= 32;
            i -= 32;
            i4++;
        }
    }

    public static final /* synthetic */ Drawable loadAd(Drawable drawable, Context context, Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return drawable;
        }
        Bitmap createBitmap = Bitmap.createBitmap(num.intValue(), num2.intValue(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, num.intValue(), num2.intValue());
        drawable.draw(canvas);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }

    public static void metrica(int[] iArr, int[] iArr2, int[] iArr3) {
        if (advert(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    public static int mopub(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = (2 - (i * i2)) * i2;
        int i4 = (2 - (i * i3)) * i3;
        return (2 - (i * i4)) * i4;
    }

    public static void purchase(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            if (i2 < Math.min(30, i)) {
                j |= (iArr[i3] & 4294967295L) << i2;
                i2 += 32;
                i3++;
            }
            iArr2[i4] = ((int) j) & 1073741823;
            j >>>= 30;
            i2 -= 30;
            i -= 30;
            i4++;
        }
    }

    public static boolean smaato(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int length = iArr.length;
        int i2 = length << 5;
        int i3 = length - 1;
        int numberOfLeadingZeros = i2 - Integer.numberOfLeadingZeros(iArr[i3]);
        int i4 = (numberOfLeadingZeros + 29) / 30;
        while (true) {
            if (i3 < 0) {
                i = 0;
                break;
            }
            int i5 = iArr2[i3];
            if (i5 != 0) {
                i = ((i3 * 32) + 32) - Integer.numberOfLeadingZeros(i5);
                break;
            }
            i3--;
        }
        int i6 = numberOfLeadingZeros - i;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i4];
        int[] iArr6 = new int[i4];
        int[] iArr7 = new int[i4];
        int[] iArr8 = new int[i4];
        int[] iArr9 = new int[i4];
        iArr6[0] = 1;
        purchase(numberOfLeadingZeros, iArr2, iArr8);
        purchase(numberOfLeadingZeros, iArr, iArr9);
        System.arraycopy(iArr9, 0, iArr7, 0, i4);
        int i7 = -i6;
        int mopub = mopub(iArr9[0]);
        int i8 = (int) (((numberOfLeadingZeros * 188898) + (numberOfLeadingZeros < 46 ? 308405 : 181188)) >>> 16);
        int i9 = i4;
        while (!yandex(i9, 0, iArr8)) {
            if (i6 >= i8) {
                return false;
            }
            i6 += 30;
            i7 = appmetrica(i7, iArr7[0], iArr8[0], iArr4);
            admob(i4, mopub, iArr5, iArr6, iArr4, iArr9);
            subscription(i9, iArr7, iArr8, iArr4);
            i9 = Signature(i9, iArr7, iArr8);
        }
        int i10 = iArr7[i9 - 1] >> 31;
        int i11 = iArr5[i4 - 1] >> 31;
        if (i11 < 0) {
            i11 = vip(i4, iArr5, iArr9);
        }
        if (i10 < 0) {
            i11 = amazon(iArr5, i4);
            amazon(iArr7, i9);
        }
        if (!yandex(i9, 1, iArr7)) {
            return false;
        }
        if (i11 < 0) {
            vip(i4, iArr5, iArr9);
        }
        license(numberOfLeadingZeros, iArr5, iArr3);
        return true;
    }

    public static final C17613e startapp(C17485e c17485e, InterfaceC11824e interfaceC11824e, C17221e c17221e, boolean z, boolean z2, boolean z3) {
        C4442e c4442e = (C4442e) AbstractC0863e.appmetrica(c17485e, AbstractC5745e.license);
        if (c4442e != null) {
            if (z) {
                C18521e c18521e = C13814e.ad;
                C13769e vip2 = C13814e.vip(c17485e, interfaceC11824e, c17221e, z3);
                if (vip2 != null) {
                    return AbstractC9408e.ad(vip2);
                }
            } else if (z2 && (c4442e.f9640e & 2) == 2) {
                C17758e c17758e = c4442e.f9642e;
                return new C17613e(interfaceC11824e.getString(c17758e.f34833e).concat(interfaceC11824e.getString(c17758e.f34835e)));
            }
        }
        return null;
    }

    public static void subscription(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = iArr3[0];
        int i3 = 1;
        int i4 = iArr3[1];
        int i5 = iArr3[2];
        int i6 = iArr3[3];
        long j = i2;
        long j2 = iArr[0];
        long j3 = i4;
        long j4 = iArr2[0];
        long j5 = (j3 * j4) + (j * j2);
        long j6 = i5;
        long j7 = i6;
        long j8 = ((j4 * j7) + (j2 * j6)) >> 30;
        int i7 = 1;
        long j9 = j5 >> 30;
        while (i7 < i) {
            long j10 = iArr[i7];
            int i8 = i3;
            long j11 = j6;
            long j12 = iArr2[i7];
            long amazon = AbstractC1786e.amazon(j3, j12, j * j10, j9);
            long j13 = j7;
            long amazon2 = AbstractC1786e.amazon(j13, j12, j11 * j10, j8);
            int i9 = i7 - 1;
            iArr[i9] = ((int) amazon) & 1073741823;
            j9 = amazon >> 30;
            iArr2[i9] = ((int) amazon2) & 1073741823;
            j8 = amazon2 >> 30;
            i7++;
            i3 = i8;
            j7 = j13;
            j6 = j11;
        }
        int i10 = i - i3;
        iArr[i10] = (int) j9;
        iArr2[i10] = (int) j8;
    }

    public static int vip(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = iArr[i4] + iArr2[i4] + i3;
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = iArr[i2] + iArr2[i2] + i3;
        iArr[i2] = i6;
        return i6 >> 30;
    }

    public static boolean yandex(int i, int i2, int[] iArr) {
        int i3 = i2 ^ iArr[0];
        if (i3 == 0) {
            for (int i4 = 1; i4 < i; i4++) {
                i3 |= iArr[i4];
            }
            if (i3 == 0) {
                return true;
            }
        }
        return false;
    }
}
