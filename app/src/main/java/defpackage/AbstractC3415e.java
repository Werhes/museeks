package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3415e implements InterfaceC4629e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C16366e f7639e = new C16366e(2);

    public static void ad(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void adcel(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        AbstractC15792e.license(4, jArr, jArr3);
        while (true) {
            billing(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC15792e.license(4, jArr2, jArr3);
            }
        }
    }

    public static int advert(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
            default:
                return 0;
            case 16:
                return 17;
        }
    }

    public static void appmetrica(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        int i2 = (int) j;
        long j7 = (jArr[(i2 >>> 3) & 7] << 3) ^ jArr[i2 & 7];
        long j8 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (1152921504606846975L & j7);
        int i5 = i + 1;
        jArr2[i5] = ((((((j & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5) ^ j8) << 4) ^ (j7 >>> 60)) ^ jArr2[i5];
    }

    public static void billing(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = ((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47);
        long j15 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j16 = j15 >>> 47;
        jArr2[0] = j12 ^ j16;
        jArr2[1] = j13;
        jArr2[2] = (j16 << 30) ^ j14;
        jArr2[3] = 140737488355327L & j15;
    }

    public static void license(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        metrica(jArr, jArr4);
        metrica(jArr2, jArr5);
        long[] jArr6 = new long[8];
        appmetrica(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        appmetrica(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        appmetrica(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        appmetrica(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        appmetrica(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        appmetrica(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        appmetrica(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        appmetrica(jArr6, j, j3, jArr7, 0);
        appmetrica(jArr6, j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = jArr3[3] ^ (j5 ^ j6);
        jArr3[3] = j9;
        long j10 = jArr3[4] ^ (j6 ^ j7);
        jArr3[4] = j10;
        long j11 = jArr3[5] ^ j7;
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 60);
        jArr3[1] = (j13 >>> 4) ^ (j8 << 56);
        jArr3[2] = (j8 >>> 8) ^ (j9 << 52);
        jArr3[3] = (j9 >>> 12) ^ (j10 << 48);
        jArr3[4] = (j10 >>> 16) ^ (j11 << 44);
        jArr3[5] = (j11 >>> 20) ^ (j14 << 40);
        jArr3[6] = (j14 >>> 24) ^ (j15 << 36);
        jArr3[7] = j15 >>> 28;
    }

    public static void metrica(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 1152921504606846975L;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r0.isEmpty() == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean mopub(java.lang.Throwable r6, kotlin.jvm.functions.Function0 r7) {
        /*
            java.lang.Integer r0 = defpackage.AbstractC16647e.ad
            r1 = 0
            if (r0 == 0) goto L22
            int r0 = r0.intValue()
            r2 = 19
            if (r0 < r2) goto Le
            goto L22
        Le:
            java.lang.reflect.Method r0 = defpackage.AbstractC16224e.vip
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r0.invoke(r6, r1)
            if (r0 == 0) goto L1f
            java.lang.Throwable[] r0 = (java.lang.Throwable[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            goto L2a
        L1f:
            eْۨٝ r0 = defpackage.C13664e.f27089e
            goto L2a
        L22:
            java.lang.Throwable[] r0 = r6.getSuppressed()
            java.util.List r0 = java.util.Arrays.asList(r0)
        L2a:
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L30:
            if (r4 >= r2) goto L40
            java.lang.Object r5 = r0.get(r4)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r5 = r5 instanceof defpackage.C7853e
            if (r5 == 0) goto L3d
            return r3
        L3d:
            int r4 = r4 + 1
            goto L30
        L40:
            java.lang.Object r7 = r7.invoke()     // Catch: java.lang.Throwable -> L63
            eًٌؚ r7 = (defpackage.C7812e) r7     // Catch: java.lang.Throwable -> L63
            if (r7 == 0) goto L6c
            java.util.List r0 = r7.ad     // Catch: java.lang.Throwable -> L63
            boolean r2 = r7.vip     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L65
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L63
            r4 = r3
        L53:
            if (r4 >= r2) goto L6c
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L63
            eٍٍؓ r5 = (defpackage.C9350e) r5     // Catch: java.lang.Throwable -> L63
            eًّؗ r5 = r5.vip     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L60
            goto L6b
        L60:
            int r4 = r4 + 1
            goto L53
        L63:
            r7 = move-exception
            goto L74
        L65:
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L6c
        L6b:
            r3 = 1
        L6c:
            if (r3 == 0) goto L75
            eًَۛ r1 = new eًَۛ     // Catch: java.lang.Throwable -> L63
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L63
            goto L75
        L74:
            r1 = r7
        L75:
            if (r1 == 0) goto L7a
            defpackage.AbstractC13362e.license(r6, r1)
        L7a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3415e.mopub(java.lang.Throwable, kotlin.jvm.functions.Function0):boolean");
    }

    public static void purchase(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        license(jArr, jArr2, jArr4);
        billing(jArr4, jArr3);
    }

    public static final long vip(float f, int i, long j, boolean z) {
        int yandex = ((z || i == 2 || i == 4 || i == 5) && C5602e.license(j)) ? C5602e.yandex(j) : Alert.DURATION_SHOW_INDEFINITELY;
        if (C5602e.adcel(j) != yandex) {
            yandex = AbstractC3062e.metrica(AbstractC7861e.billing(f), C5602e.adcel(j), yandex);
        }
        return AbstractC15118e.license(0, yandex, 0, C5602e.billing(j));
    }

    public static void yandex(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        AbstractC15792e.license(4, jArr, jArr3);
        billing(jArr3, jArr2);
    }
}
