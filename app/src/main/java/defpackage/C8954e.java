package defpackage;

/* renamed from: eٌۚؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8954e implements Cloneable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long[] f17972e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final short[] f17971e = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final byte[] f17970e = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    public C8954e(int i) {
        this.f17972e = new long[i];
    }

    public C8954e(long[] jArr) {
        this.f17972e = jArr;
    }

    public C8954e(long[] jArr, int i) {
        if (i == jArr.length) {
            this.f17972e = jArr;
            return;
        }
        long[] jArr2 = new long[i];
        this.f17972e = jArr2;
        System.arraycopy(jArr, 0, jArr2, 0, i);
    }

    public static void Signature(long j, long[] jArr, int i, long[] jArr2) {
        int i2 = i;
        long[] jArr3 = jArr2;
        if ((j & 1) != 0) {
            ad(0, 0, i2, jArr3, jArr);
        }
        long j2 = j;
        int i3 = 1;
        while (true) {
            j2 >>>= 1;
            if (j2 == 0) {
                return;
            }
            if ((j2 & 1) != 0) {
                long license = license(jArr3, 0, jArr, 0, i2, i3);
                if (license != 0) {
                    jArr2[i] = jArr2[i] ^ license;
                }
            }
            i3++;
            i2 = i;
            jArr3 = jArr2;
        }
    }

    public static void ad(int i, int i2, int i3, long[] jArr, long[] jArr2) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            jArr[i5] = jArr[i5] ^ jArr2[i2 + i4];
        }
    }

    public static void adcel(int i, long j, long[] jArr) {
        int i2 = i >>> 6;
        int i3 = i & 63;
        if (i3 == 0) {
            jArr[i2] = j ^ jArr[i2];
            return;
        }
        jArr[i2] = jArr[i2] ^ (j << i3);
        long j2 = j >>> (64 - i3);
        if (j2 != 0) {
            int i4 = i2 + 1;
            jArr[i4] = j2 ^ jArr[i4];
        }
    }

    public static int admob(long[] jArr, int i, int i2, int[] iArr) {
        int i3 = (i2 + 63) >>> 6;
        if (i < i3) {
            return i;
        }
        int i4 = i << 6;
        int min = Math.min(i4, (i2 << 1) - 1);
        int i5 = i4 - min;
        while (i5 >= 64) {
            i--;
            i5 -= 64;
        }
        int length = iArr.length;
        int i6 = iArr[length - 1];
        int i7 = length > 1 ? iArr[length - 2] : 0;
        int max = Math.max(i2, i6 + 64);
        int min2 = (Math.min(min - max, i2 - i7) + i5) >> 6;
        if (min2 > 1) {
            int i8 = i - min2;
            min = i8 << 6;
            int i9 = min - i2;
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                startapp(i8, i - i8, iArr[length2] + i9, jArr, jArr);
            }
            startapp(i8, i - i8, i9, jArr, jArr);
            while (i > i8) {
                i--;
                jArr[i] = 0;
            }
        }
        if (min > max) {
            int i10 = max >>> 6;
            while (true) {
                i--;
                if (i <= i10) {
                    break;
                }
                long j = jArr[i];
                if (j != 0) {
                    jArr[i] = 0;
                    int i11 = (i << 6) - i2;
                    int length3 = iArr.length;
                    while (true) {
                        length3--;
                        if (length3 < 0) {
                            break;
                        }
                        adcel(iArr[length3] + i11, j, jArr);
                    }
                    adcel(i11, j, jArr);
                }
            }
            int i12 = max & 63;
            long j2 = jArr[i10];
            long j3 = j2 >>> i12;
            if (j3 != 0) {
                jArr[i10] = j2 ^ (j3 << i12);
                int i13 = max - i2;
                int length4 = iArr.length;
                while (true) {
                    length4--;
                    if (length4 < 0) {
                        break;
                    }
                    adcel(iArr[length4] + i13, j3, jArr);
                }
                adcel(i13, j3, jArr);
            }
        } else {
            max = min;
        }
        if (max > i2) {
            while (true) {
                max--;
                if (max < i2) {
                    break;
                }
                if (((1 << (max & 63)) & jArr[max >>> 6]) != 0) {
                    yandex(jArr, max);
                    int i14 = max - i2;
                    int length5 = iArr.length;
                    while (true) {
                        length5--;
                        if (length5 < 0) {
                            break;
                        }
                        yandex(jArr, iArr[length5] + i14);
                    }
                    yandex(jArr, i14);
                }
            }
        }
        return i3;
    }

    public static int appmetrica(long j) {
        int i;
        int i2 = 32;
        int i3 = (int) (j >>> 32);
        if (i3 == 0) {
            i3 = (int) j;
            i2 = 0;
        }
        int i4 = i3 >>> 16;
        byte[] bArr = f17970e;
        if (i4 == 0) {
            int i5 = i3 >>> 8;
            i = i5 == 0 ? bArr[i3] : bArr[i5] + 8;
        } else {
            int i6 = i3 >>> 24;
            i = i6 == 0 ? bArr[i4] + 16 : bArr[i6] + 24;
        }
        return i2 + i;
    }

    public static long license(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr2[i2 + i6];
            int i7 = i + i6;
            jArr[i7] = (j | (j2 << i4)) ^ jArr[i7];
            j = j2 >>> i5;
        }
        return j;
    }

    public static long smaato(int i) {
        short[] sArr = f17971e;
        return ((((sArr[i >>> 24] << 16) | sArr[(i >>> 16) & 255]) & 4294967295L) << 32) | (4294967295L & (sArr[i & 255] | (sArr[(i >>> 8) & 255] << 16)));
    }

    public static void startapp(int i, int i2, int i3, long[] jArr, long[] jArr2) {
        int i4 = i3 >>> 6;
        int i5 = i3 & 63;
        int i6 = i2;
        if (i5 == 0) {
            ad(i4, i, i6, jArr, jArr2);
            return;
        }
        int i7 = i4 + 1;
        int i8 = 64 - i5;
        int i9 = 64 - i8;
        long j = 0;
        while (true) {
            i6--;
            if (i6 < 0) {
                jArr[i4] = jArr[i4] ^ j;
                return;
            }
            long j2 = jArr2[i + i6];
            int i10 = i7 + i6;
            jArr[i10] = (j | (j2 >>> i8)) ^ jArr[i10];
            j = j2 << i9;
        }
    }

    public static void subscription(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr[i + i6];
            jArr2[i2 + i6] = j | (j2 << i4);
            j = j2 >>> i5;
        }
    }

    public static void yandex(long[] jArr, int i) {
        int i2 = i >>> 6;
        jArr[i2] = (1 << (i & 63)) ^ jArr[i2];
    }

    public final boolean amazon() {
        long[] jArr = this.f17972e;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int billing(int i) {
        int i2 = (i + 62) >>> 6;
        while (i2 != 0) {
            i2--;
            long j = this.f17972e[i2];
            if (j != 0) {
                return appmetrica(j) + (i2 << 6);
            }
        }
        return 0;
    }

    public final Object clone() {
        return new C8954e(AbstractC12442e.purchase(this.f17972e));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8954e)) {
            return false;
        }
        C8954e c8954e = (C8954e) obj;
        int mopub = mopub();
        if (c8954e.mopub() != mopub) {
            return false;
        }
        for (int i = 0; i < mopub; i++) {
            if (this.f17972e[i] != c8954e.f17972e[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int mopub = mopub();
        int i = 1;
        for (int i2 = 0; i2 < mopub; i2++) {
            long j = this.f17972e[i2];
            i = (((i * 31) ^ ((int) j)) * 31) ^ ((int) (j >>> 32));
        }
        return i;
    }

    public final C8954e loadAd(C8954e c8954e) {
        int i;
        int i2;
        C8954e c8954e2;
        C8954e c8954e3;
        long[] jArr;
        int purchase = purchase();
        if (purchase == 0) {
            return this;
        }
        int purchase2 = c8954e.purchase();
        if (purchase2 == 0) {
            return c8954e;
        }
        if (purchase > purchase2) {
            i2 = purchase;
            i = purchase2;
            c8954e3 = this;
            c8954e2 = c8954e;
        } else {
            i = purchase;
            i2 = purchase2;
            c8954e2 = this;
            c8954e3 = c8954e;
        }
        int i3 = (i + 63) >>> 6;
        int i4 = (i2 + 63) >>> 6;
        int i5 = ((i + i2) + 62) >>> 6;
        if (i3 == 1) {
            long j = c8954e2.f17972e[0];
            if (j == 1) {
                return c8954e3;
            }
            long[] jArr2 = new long[i5];
            Signature(j, c8954e3.f17972e, i4, jArr2);
            return new C8954e(jArr2, i5);
        }
        int i6 = (i2 + 70) >>> 6;
        int[] iArr = new int[16];
        int i7 = i6 << 4;
        long[] jArr3 = new long[i7];
        iArr[1] = i6;
        System.arraycopy(c8954e3.f17972e, 0, jArr3, i6, i4);
        int i8 = 2;
        int i9 = i6;
        while (i8 < 16) {
            int i10 = i9 + i6;
            iArr[i8] = i10;
            if ((i8 & 1) == 0) {
                subscription(jArr3, i10 >>> 1, jArr3, i10, i6, 1);
                jArr = jArr3;
            } else {
                jArr = jArr3;
                int i11 = i10 - i6;
                for (int i12 = 0; i12 < i6; i12++) {
                    jArr[i10 + i12] = jArr[i6 + i12] ^ jArr[i11 + i12];
                }
            }
            i8++;
            i9 = i10;
            jArr3 = jArr;
        }
        long[] jArr4 = jArr3;
        long[] jArr5 = new long[i7];
        subscription(jArr4, 0, jArr5, 0, i7, 4);
        long[] jArr6 = c8954e2.f17972e;
        int i13 = i5 << 3;
        long[] jArr7 = new long[i13];
        for (int i14 = 0; i14 < i3; i14++) {
            long j2 = jArr6[i14];
            int i15 = i14;
            while (true) {
                int i16 = iArr[((int) j2) & 15];
                int i17 = iArr[((int) (j2 >>> 4)) & 15];
                for (int i18 = 0; i18 < i6; i18++) {
                    int i19 = i15 + i18;
                    jArr7[i19] = jArr7[i19] ^ (jArr4[i16 + i18] ^ jArr5[i17 + i18]);
                }
                j2 >>>= 8;
                if (j2 == 0) {
                    break;
                }
                i15 += i5;
            }
        }
        while (true) {
            int i20 = i13 - i5;
            if (i20 == 0) {
                return new C8954e(jArr7, i5);
            }
            license(jArr7, i20 - i5, jArr7, i20, i5, 8);
            i13 = i20;
        }
    }

    public final void metrica(C8954e c8954e) {
        int mopub = c8954e.mopub();
        if (mopub == 0) {
            return;
        }
        long[] jArr = this.f17972e;
        if (mopub > jArr.length) {
            long[] jArr2 = new long[mopub];
            System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, mopub));
            this.f17972e = jArr2;
        }
        ad(0, 0, mopub, this.f17972e, c8954e.f17972e);
    }

    public final int mopub() {
        long[] jArr = this.f17972e;
        int min = Math.min(jArr.length, jArr.length);
        if (min >= 1) {
            if (jArr[0] != 0) {
                while (true) {
                    int i = min - 1;
                    if (jArr[i] != 0) {
                        return min;
                    }
                    min = i;
                }
            } else {
                while (true) {
                    int i2 = min - 1;
                    if (jArr[i2] != 0) {
                        return min;
                    }
                    if (i2 <= 0) {
                        break;
                    }
                    min = i2;
                }
            }
        }
        return 0;
    }

    public final int purchase() {
        int length = this.f17972e.length;
        while (length != 0) {
            length--;
            long j = this.f17972e[length];
            if (j != 0) {
                return appmetrica(j) + (length << 6);
            }
        }
        return 0;
    }

    public final String toString() {
        int mopub = mopub();
        if (mopub == 0) {
            return "0";
        }
        int i = mopub - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.f17972e[i]));
        while (true) {
            i--;
            if (i < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.f17972e[i]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }

    public final void vip(C8954e c8954e, int i, int i2) {
        int i3 = (i + 63) >>> 6;
        int i4 = i2 >>> 6;
        int i5 = i2 & 63;
        if (i5 == 0) {
            ad(i4, 0, i3, this.f17972e, c8954e.f17972e);
            return;
        }
        long license = license(this.f17972e, i4, c8954e.f17972e, 0, i3, i5);
        if (license != 0) {
            long[] jArr = this.f17972e;
            int i6 = i3 + i4;
            jArr[i6] = license ^ jArr[i6];
        }
    }
}
