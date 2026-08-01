package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eًٌؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7809e {
    public int ad;
    public SecureRandom metrica;
    public int vip;
    public static final BigInteger license = BigInteger.valueOf(1);
    public static final BigInteger appmetrica = BigInteger.valueOf(2);

    public final int ad(int i, int i2, BigInteger[] bigIntegerArr, int i3) {
        int i4;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger2;
        int i5;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        int i6 = i;
        while (true) {
            if (i6 >= 0 && i6 <= 65536) {
                break;
            }
            i6 = this.metrica.nextInt() / 32768;
        }
        int i7 = i2;
        while (true) {
            i4 = 1;
            if (i7 >= 0 && i7 <= 65536 && i7 / 2 != 0) {
                break;
            }
            i7 = (this.metrica.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger5 = new BigInteger(Integer.toString(i7));
        BigInteger bigInteger6 = new BigInteger("19381");
        BigInteger bigInteger7 = new BigInteger(Integer.toString(i6));
        int i8 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger7};
        int[] iArr = {i3};
        int i9 = 0;
        int i10 = 0;
        while (iArr[i9] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i10 = i9 + 1;
            iArr[i10] = iArr[i9] / 2;
            i9 = i10;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i10 + 1];
        int i11 = 16;
        bigIntegerArr4[i10] = new BigInteger("8003", 16);
        int i12 = i10 - 1;
        int i13 = 0;
        while (true) {
            if (i13 >= i10) {
                bigInteger = bigIntegerArr3[i8];
                break;
            }
            int i14 = iArr[i12] / i11;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i8, bigIntegerArr5, i8, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i14 + 1];
                System.arraycopy(bigIntegerArr5, i8, bigIntegerArr2, i8, length2);
                int i15 = i8;
                while (true) {
                    bigInteger2 = appmetrica;
                    if (i15 >= i14) {
                        break;
                    }
                    int i16 = i15 + 1;
                    bigIntegerArr2[i16] = bigIntegerArr2[i15].multiply(bigInteger6).add(bigInteger5).mod(bigInteger2.pow(i11));
                    i15 = i16;
                }
                BigInteger bigInteger8 = new BigInteger("0");
                int i17 = i8;
                while (true) {
                    i5 = i8;
                    if (i17 >= i14) {
                        break;
                    }
                    bigInteger8 = bigInteger8.add(bigIntegerArr2[i17].multiply(bigInteger2.pow(i17 * 16)));
                    i17++;
                    i8 = i5;
                }
                bigIntegerArr2[i5] = bigIntegerArr2[i14];
                int i18 = i12 + 1;
                BigInteger add = bigInteger2.pow(iArr[i12] - i4).divide(bigIntegerArr4[i18]).add(bigInteger2.pow(iArr[i12] - i4).multiply(bigInteger8).divide(bigIntegerArr4[i18].multiply(bigInteger2.pow(i14 * 16))));
                BigInteger mod = add.mod(bigInteger2);
                BigInteger bigInteger9 = license;
                if (mod.compareTo(bigInteger9) == 0) {
                    add = add.add(bigInteger9);
                }
                int i19 = i5;
                while (true) {
                    bigInteger3 = bigInteger5;
                    bigInteger4 = bigInteger6;
                    long j = i19;
                    BigInteger add2 = bigIntegerArr4[i18].multiply(add.add(BigInteger.valueOf(j))).add(bigInteger9);
                    bigIntegerArr4[i12] = add2;
                    if (add2.compareTo(bigInteger2.pow(iArr[i12])) != 1) {
                        if (bigInteger2.modPow(bigIntegerArr4[i18].multiply(add.add(BigInteger.valueOf(j))), bigIntegerArr4[i12]).compareTo(bigInteger9) == 0 && bigInteger2.modPow(add.add(BigInteger.valueOf(j)), bigIntegerArr4[i12]).compareTo(bigInteger9) != 0) {
                            break;
                        }
                        i19 += 2;
                        bigInteger5 = bigInteger3;
                        bigInteger6 = bigInteger4;
                    } else {
                        break;
                    }
                }
                i8 = i5;
                i4 = 1;
                bigIntegerArr3 = bigIntegerArr2;
                bigInteger5 = bigInteger3;
                bigInteger6 = bigInteger4;
                i11 = 16;
            }
            i12--;
            if (i12 < 0) {
                bigIntegerArr[i5] = bigIntegerArr4[i5];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[i5];
                break;
            }
            i13++;
            i8 = i5;
            bigIntegerArr3 = bigIntegerArr2;
            bigInteger5 = bigInteger3;
            bigInteger6 = bigInteger4;
            i4 = 1;
            i11 = 16;
        }
        return bigInteger.intValue();
    }

    public final BigInteger metrica(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = license;
        BigInteger subtract = bigInteger.subtract(bigInteger3);
        BigInteger divide = subtract.divide(bigInteger2);
        int bitLength = bigInteger.bitLength();
        while (true) {
            BigInteger metrica = AbstractC5907e.metrica(bitLength, this.metrica);
            if (metrica.compareTo(bigInteger3) > 0 && metrica.compareTo(subtract) < 0) {
                BigInteger modPow = metrica.modPow(divide, bigInteger);
                if (modPow.compareTo(bigInteger3) != 0) {
                    return modPow;
                }
            }
        }
    }

    public final long vip(long j, long j2, BigInteger[] bigIntegerArr, int i) {
        int i2;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger2;
        int i3;
        int[] iArr;
        BigInteger bigInteger3;
        long j3 = j;
        while (true) {
            if (j3 >= 0 && j3 <= 4294967296L) {
                break;
            }
            j3 = this.metrica.nextInt() * 2;
        }
        long j4 = j2;
        while (true) {
            i2 = 1;
            if (j4 >= 0 && j4 <= 4294967296L && j4 / 2 != 0) {
                break;
            }
            j4 = (this.metrica.nextInt() * 2) + 1;
        }
        BigInteger bigInteger4 = new BigInteger(Long.toString(j4));
        BigInteger bigInteger5 = new BigInteger("97781173");
        BigInteger bigInteger6 = new BigInteger(Long.toString(j3));
        int i4 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger6};
        int[] iArr2 = {i};
        int i5 = 0;
        int i6 = 0;
        while (iArr2[i5] >= 33) {
            int length = iArr2.length + 1;
            int[] iArr3 = new int[length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr2 = new int[length];
            System.arraycopy(iArr3, 0, iArr2, 0, length);
            i6 = i5 + 1;
            iArr2[i6] = iArr2[i5] / 2;
            i5 = i6;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i6 + 1];
        bigIntegerArr4[i6] = new BigInteger("8000000B", 16);
        int i7 = i6 - 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i6) {
                bigInteger = bigIntegerArr3[i4];
                break;
            }
            int i9 = 32;
            int i10 = iArr2[i7] / 32;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i4, bigIntegerArr5, i4, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i10 + 1];
                System.arraycopy(bigIntegerArr5, i4, bigIntegerArr2, i4, length2);
                int i11 = i4;
                while (true) {
                    bigInteger2 = appmetrica;
                    if (i11 >= i10) {
                        break;
                    }
                    int i12 = i11 + 1;
                    bigIntegerArr2[i12] = bigIntegerArr2[i11].multiply(bigInteger5).add(bigInteger4).mod(bigInteger2.pow(i9));
                    i11 = i12;
                }
                BigInteger bigInteger7 = new BigInteger("0");
                int i13 = i4;
                while (true) {
                    i3 = i4;
                    if (i13 >= i10) {
                        break;
                    }
                    bigInteger7 = bigInteger7.add(bigIntegerArr2[i13].multiply(bigInteger2.pow(i13 * 32)));
                    i13++;
                    i4 = i3;
                }
                bigIntegerArr2[i3] = bigIntegerArr2[i10];
                int i14 = i7 + 1;
                BigInteger add = bigInteger2.pow(iArr2[i7] - i2).divide(bigIntegerArr4[i14]).add(bigInteger2.pow(iArr2[i7] - i2).multiply(bigInteger7).divide(bigIntegerArr4[i14].multiply(bigInteger2.pow(i10 * 32))));
                BigInteger mod = add.mod(bigInteger2);
                BigInteger bigInteger8 = license;
                if (mod.compareTo(bigInteger8) == 0) {
                    add = add.add(bigInteger8);
                }
                int i15 = i3;
                while (true) {
                    iArr = iArr2;
                    bigInteger3 = bigInteger4;
                    long j5 = i15;
                    BigInteger add2 = bigIntegerArr4[i14].multiply(add.add(BigInteger.valueOf(j5))).add(bigInteger8);
                    bigIntegerArr4[i7] = add2;
                    if (add2.compareTo(bigInteger2.pow(iArr[i7])) != 1) {
                        if (bigInteger2.modPow(bigIntegerArr4[i14].multiply(add.add(BigInteger.valueOf(j5))), bigIntegerArr4[i7]).compareTo(bigInteger8) == 0 && bigInteger2.modPow(add.add(BigInteger.valueOf(j5)), bigIntegerArr4[i7]).compareTo(bigInteger8) != 0) {
                            break;
                        }
                        i15 += 2;
                        bigInteger4 = bigInteger3;
                        iArr2 = iArr;
                    } else {
                        break;
                    }
                }
                i4 = i3;
                iArr2 = iArr;
                i2 = 1;
                bigIntegerArr3 = bigIntegerArr2;
                i9 = 32;
                bigInteger4 = bigInteger3;
            }
            i7--;
            if (i7 < 0) {
                bigIntegerArr[i3] = bigIntegerArr4[i3];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[i3];
                break;
            }
            i8++;
            i4 = i3;
            bigInteger4 = bigInteger3;
            iArr2 = iArr;
            bigIntegerArr3 = bigIntegerArr2;
            i2 = 1;
        }
        return bigInteger.longValue();
    }
}
