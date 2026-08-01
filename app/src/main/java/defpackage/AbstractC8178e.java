package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8178e {
    public static final int[] ad = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] vip = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] metrica = {67108863, 33554431};
    public static final int[] license = {26, 25};

    public static final Object ad(C8221e c8221e, String str, int i, AbstractC10731e abstractC10731e) {
        C5577e c5577e = new C5577e("audioBooks.setProgress", C11047e.f21902e);
        c5577e.ad("chapter_id", str);
        c5577e.vip(i, "time_from_start");
        return c8221e.license(c5577e, abstractC10731e);
    }

    public static void adcel(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = j * 2;
        long j3 = jArr2[1];
        long j4 = jArr2[2];
        long j5 = jArr2[3];
        long j6 = jArr2[4];
        long j7 = jArr2[5];
        long j8 = jArr2[6];
        long j9 = jArr2[7];
        long j10 = jArr2[8];
        long j11 = jArr2[9];
        long[] jArr3 = {j * j, j2 * j3, ((j * j4) + (j3 * j3)) * 2, ((j * j5) + (j3 * j4)) * 2, (j2 * j6) + (j3 * 4 * j5) + (j4 * j4), ((j * j7) + (j3 * j6) + (j4 * j5)) * 2, ((j3 * 2 * j7) + (j * j8) + (j4 * j6) + (j5 * j5)) * 2, ((j * j9) + (j3 * j8) + (j4 * j7) + (j5 * j6)) * 2, (((((j5 * j7) + (j3 * j9)) * 2) + (j * j10) + (j4 * j8)) * 2) + (j6 * j6), ((j * j11) + (j3 * j10) + (j4 * j9) + (j5 * j8) + (j6 * j7)) * 2, ((((j3 * j11) + (j5 * j9)) * 2) + (j4 * j10) + (j6 * j8) + (j7 * j7)) * 2, ((j4 * j11) + (j5 * j10) + (j6 * j9) + (j7 * j8)) * 2, (((((j5 * j11) + (j7 * j9)) * 2) + (j6 * j10)) * 2) + (j8 * j8), ((j6 * j11) + (j7 * j10) + (j8 * j9)) * 2, ((j7 * 2 * j11) + (j8 * j10) + (j9 * j9)) * 2, ((j8 * j11) + (j9 * j10)) * 2, (j9 * 4 * j11) + (j10 * j10), j10 * 2 * j11, 2 * j11 * j11};
        startapp(jArr3);
        yandex(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static void advert(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static final boolean appmetrica(InterfaceC7189e interfaceC7189e) {
        return interfaceC7189e.yandex(new C3114e(11));
    }

    public static void billing(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j2 = jArr3[1] * j;
        long j3 = jArr2[1];
        long j4 = jArr3[0];
        jArr[1] = (j3 * j4) + j2;
        long j5 = jArr2[1];
        long j6 = jArr3[1];
        jArr[2] = (jArr2[2] * j4) + (jArr3[2] * j) + (j5 * 2 * j6);
        long j7 = jArr3[2];
        long j8 = jArr2[2];
        jArr[3] = (jArr2[3] * j4) + (jArr3[3] * j) + (j8 * j6) + (j5 * j7);
        long j9 = jArr3[3];
        long j10 = jArr2[3];
        jArr[4] = (jArr2[4] * j4) + (jArr3[4] * j) + (((j10 * j6) + (j5 * j9)) * 2) + (j8 * j7);
        long j11 = jArr3[4];
        long j12 = (j5 * j11) + (j10 * j7) + (j8 * j9);
        long j13 = jArr2[4];
        jArr[5] = (jArr2[5] * j4) + (jArr3[5] * j) + (j13 * j6) + j12;
        long j14 = jArr3[5];
        long j15 = jArr2[5];
        jArr[6] = (jArr2[6] * j4) + (jArr3[6] * j) + (j13 * j7) + (j8 * j11) + (((j15 * j6) + (j5 * j14) + (j10 * j9)) * 2);
        long j16 = (j15 * j7) + (j8 * j14) + (j13 * j9) + (j10 * j11);
        long j17 = jArr3[6];
        long j18 = (j5 * j17) + j16;
        long j19 = jArr2[6];
        jArr[7] = (jArr2[7] * j4) + (jArr3[7] * j) + (j19 * j6) + j18;
        long j20 = jArr3[7];
        long j21 = (j5 * j20) + (j15 * j9) + (j10 * j14);
        long j22 = jArr2[7];
        long j23 = (((j22 * j6) + j21) * 2) + (j13 * j11);
        jArr[8] = (jArr2[8] * j4) + (jArr3[8] * j) + (j19 * j7) + (j8 * j17) + j23;
        long j24 = (j22 * j7) + (j8 * j20) + (j19 * j9) + (j10 * j17) + (j15 * j11) + (j13 * j14);
        long j25 = jArr3[8];
        long j26 = (j5 * j25) + j24;
        long j27 = jArr2[8];
        jArr[9] = (jArr2[9] * j4) + (j * jArr3[9]) + (j27 * j6) + j26;
        long j28 = (j22 * j9) + (j10 * j20) + (j15 * j14);
        long j29 = jArr3[9];
        long j30 = jArr2[9];
        long j31 = j13 * j17;
        jArr[10] = (j27 * j7) + (j8 * j25) + (j19 * j11) + j31 + (((j6 * j30) + (j5 * j29) + j28) * 2);
        long j32 = j8 * j29;
        long j33 = j7 * j30;
        jArr[11] = j33 + j32 + (j27 * j9) + (j10 * j25) + (j22 * j11) + (j13 * j20) + (j19 * j14) + (j15 * j17);
        long j34 = j10 * j29;
        long j35 = j9 * j30;
        long j36 = j27 * j11;
        jArr[12] = j36 + (j13 * j25) + ((j35 + j34 + (j22 * j14) + (j15 * j20)) * 2) + (j19 * j17);
        long j37 = j13 * j29;
        long j38 = j11 * j30;
        jArr[13] = j38 + j37 + (j27 * j14) + (j15 * j25) + (j22 * j17) + (j19 * j20);
        long j39 = j14 * j30;
        long j40 = j27 * j17;
        jArr[14] = j40 + (j19 * j25) + ((j39 + (j15 * j29) + (j22 * j20)) * 2);
        long j41 = j19 * j29;
        long j42 = j17 * j30;
        jArr[15] = j42 + j41 + (j27 * j20) + (j22 * j25);
        jArr[16] = (((j20 * j30) + (j22 * j29)) * 2) + (j27 * j25);
        jArr[17] = (j25 * j30) + (j27 * j29);
        jArr[18] = j30 * 2 * j29;
    }

    public static String license(C16417e c16417e, Integer num) {
        if (num == null) {
            return null;
        }
        try {
            if (num.intValue() == 1) {
                C5060e.ad("0");
                Integer num2 = (Integer) ((C9000e) AbstractC17861e.license(c16417e, "0")).metrica(CameraCharacteristics.LENS_FACING);
                if (num2 != null && num2.intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0) {
                C5060e.ad("1");
                Integer num3 = (Integer) ((C9000e) AbstractC17861e.license(c16417e, "1")).metrica(CameraCharacteristics.LENS_FACING);
                if (num3 != null && num3.intValue() == 0) {
                    return "0";
                }
            }
            return null;
        } catch (C15895e unused) {
            if (!AbstractC9464e.amazon()) {
                return null;
            }
            Log.e("CXCP", "Received Do Not Disturb exception while deciding camera id to skip. Please turn off Do Not Disturb mode");
            return null;
        }
    }

    public static InputConnection metrica(InputConnection inputConnection, EditorInfo editorInfo, InterfaceC4583e interfaceC4583e) {
        AbstractC12110e.metrica(editorInfo, "editorInfo must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new C11189e(inputConnection, interfaceC4583e) : AbstractC9468e.metrica(editorInfo).length == 0 ? inputConnection : new C7098e(inputConnection, interfaceC4583e);
    }

    public static void mopub(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void purchase(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        billing(jArr4, jArr2, jArr3);
        startapp(jArr4);
        yandex(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static void startapp(long[] jArr) {
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j3 + (j2 << 1);
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[0] = j36;
        jArr[0] = j36 + j34;
    }

    public static byte[] vip(long[] jArr) {
        long j;
        int[] iArr;
        int i;
        int[] iArr2;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = 19;
            iArr = license;
            if (i3 >= 2) {
                break;
            }
            int i4 = 0;
            while (i4 < 9) {
                long j2 = copyOf[i4];
                int i5 = -((int) (((j2 >> 31) & j2) >> iArr[i4 & 1]));
                copyOf[i4] = j2 + (i5 << r15);
                i4++;
                copyOf[i4] = copyOf[i4] - i5;
            }
            long j3 = copyOf[9];
            copyOf[9] = j3 + (r6 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j3 >> 31) & j3) >> 25))) * 19);
            i3++;
        }
        long j4 = copyOf[0];
        copyOf[0] = j4 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j4 >> 31) & j4) >> 26)));
        int i6 = 0;
        while (true) {
            iArr2 = metrica;
            if (i6 >= 2) {
                break;
            }
            int i7 = i2;
            while (i7 < 9) {
                long j5 = copyOf[i7];
                int i8 = i7 & 1;
                int i9 = i2;
                int i10 = i6;
                int i11 = (int) (j5 >> iArr[i8]);
                copyOf[i7] = iArr2[i8] & j5;
                i7++;
                copyOf[i7] = copyOf[i7] + i11;
                i2 = i9;
                j = j;
                i6 = i10;
            }
            i6++;
        }
        int i12 = i2;
        copyOf[9] = copyOf[9] & 33554431;
        long j6 = (((int) (r2 >> 25)) * j) + copyOf[i12];
        copyOf[i12] = j6;
        int i13 = ~((((int) j6) - 67108845) >> 31);
        for (int i14 = 1; i14 < 10; i14++) {
            int i15 = ~(((int) copyOf[i14]) ^ iArr2[i14 & 1]);
            int i16 = i15 & (i15 << 16);
            int i17 = i16 & (i16 << 8);
            int i18 = i17 & (i17 << 4);
            int i19 = i18 & (i18 << 2);
            i13 &= (i19 & (i19 << 1)) >> 31;
        }
        copyOf[i12] = copyOf[i12] - (67108845 & i13);
        long j7 = 33554431 & i13;
        copyOf[1] = copyOf[1] - j7;
        for (i = 2; i < 10; i += 2) {
            copyOf[i] = copyOf[i] - (67108863 & i13);
            int i20 = i + 1;
            copyOf[i20] = copyOf[i20] - j7;
        }
        for (int i21 = i12; i21 < 10; i21++) {
            copyOf[i21] = copyOf[i21] << vip[i21];
        }
        byte[] bArr = new byte[32];
        for (int i22 = i12; i22 < 10; i22++) {
            int i23 = ad[i22];
            long j8 = bArr[i23];
            long j9 = copyOf[i22];
            bArr[i23] = (byte) (j8 | (j9 & 255));
            bArr[i23 + 1] = (byte) (bArr[r5] | ((j9 >> 8) & 255));
            bArr[i23 + 2] = (byte) (bArr[r5] | ((j9 >> 16) & 255));
            bArr[i23 + 3] = (byte) (bArr[r4] | ((j9 >> 24) & 255));
        }
        return bArr;
    }

    public static void yandex(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }
}
