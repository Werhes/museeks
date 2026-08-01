package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eؘۛٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5907e {
    public static final BigInteger ad = BigInteger.valueOf(0);
    public static final BigInteger vip = BigInteger.valueOf(1);
    public static final BigInteger metrica = BigInteger.valueOf(2);
    public static final BigInteger license = BigInteger.valueOf(3);
    public static final BigInteger appmetrica = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
    public static final int purchase = BigInteger.valueOf(743).bitLength();

    public static byte[] ad(int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = 0;
        if (byteArray[0] == 0 && byteArray.length != 1) {
            i2 = 1;
        }
        int length = byteArray.length - i2;
        if (length > i) {
            throw new IllegalArgumentException("standard length exceeded for value");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, i2, bArr, i - length, length);
        return bArr;
    }

    public static BigInteger adcel(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("'M' must be odd");
        }
        if (bigInteger.signum() != 1) {
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        BigInteger bigInteger3 = vip;
        if (bigInteger.equals(bigInteger3)) {
            return ad;
        }
        if (bigInteger2.signum() < 0 || bigInteger2.bitLength() > bigInteger.bitLength()) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        if (bigInteger2.equals(bigInteger3)) {
            return bigInteger3;
        }
        int bitLength = bigInteger.bitLength();
        int[] adcel = AbstractC12797e.adcel(bitLength, bigInteger);
        int[] adcel2 = AbstractC12797e.adcel(bitLength, bigInteger2);
        int length = adcel.length;
        int[] iArr = new int[length];
        if (AbstractC6143e.smaato(adcel, adcel2, iArr)) {
            return AbstractC12797e.m3401native(iArr, length);
        }
        throw new ArithmeticException("BigInteger not invertible.");
    }

    public static BigInteger appmetrica(int i, int i2, SecureRandom secureRandom) {
        BigInteger bigInteger;
        if (i < 2) {
            throw new IllegalArgumentException("bitLength < 2");
        }
        BigInteger bigInteger2 = metrica;
        if (i == 2) {
            return secureRandom.nextInt() < 0 ? bigInteger2 : license;
        }
        do {
            byte[] vip2 = vip(i, secureRandom);
            vip2[0] = (byte) (((byte) (1 << (7 - ((vip2.length * 8) - i)))) | vip2[0]);
            int length = vip2.length - 1;
            vip2[length] = (byte) (vip2[length] | 1);
            bigInteger = new BigInteger(1, vip2);
            if (i > purchase) {
                while (!bigInteger.gcd(appmetrica).equals(vip)) {
                    bigInteger = bigInteger.add(bigInteger2);
                }
            }
        } while (!bigInteger.isProbablePrime(i2));
        return bigInteger;
    }

    public static int billing(BigInteger bigInteger) {
        if (bigInteger.equals(ad)) {
            return 1;
        }
        return (bigInteger.bitLength() + 7) / 8;
    }

    public static BigInteger license(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger metrica2;
        int compareTo = bigInteger.compareTo(bigInteger2);
        if (compareTo >= 0) {
            if (compareTo <= 0) {
                return bigInteger;
            }
            throw new IllegalArgumentException("'min' may not be greater than 'max'");
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            metrica2 = license(ad, bigInteger2.subtract(bigInteger), secureRandom);
        } else {
            for (int i = 0; i < 1000; i++) {
                BigInteger metrica3 = metrica(bigInteger2.bitLength(), secureRandom);
                if (metrica3.compareTo(bigInteger) >= 0 && metrica3.compareTo(bigInteger2) <= 0) {
                    return metrica3;
                }
            }
            metrica2 = metrica(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom);
        }
        return metrica2.add(bigInteger);
    }

    public static BigInteger metrica(int i, SecureRandom secureRandom) {
        return new BigInteger(1, vip(i, secureRandom));
    }

    public static BigInteger purchase(int i, int i2, byte[] bArr) {
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger startapp(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("'M' must be odd");
        }
        if (bigInteger.signum() != 1) {
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        if (bigInteger2.signum() < 0 || bigInteger2.bitLength() > bigInteger.bitLength()) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        int bitLength = bigInteger.bitLength();
        int[] adcel = AbstractC12797e.adcel(bitLength, bigInteger);
        int[] adcel2 = AbstractC12797e.adcel(bitLength, bigInteger2);
        int length = adcel.length;
        int[] iArr = new int[length];
        if (AbstractC6143e.advert(adcel, adcel2, iArr) != 0) {
            return AbstractC12797e.m3401native(iArr, length);
        }
        throw new ArithmeticException("BigInteger not invertible.");
    }

    public static byte[] vip(int i, SecureRandom secureRandom) {
        if (i < 1) {
            throw new IllegalArgumentException("bitLength must be at least 1");
        }
        int i2 = (i + 7) / 8;
        byte[] bArr = new byte[i2];
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & ((byte) (255 >>> ((i2 * 8) - i))));
        return bArr;
    }

    public static int yandex(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 31) {
            return bigInteger.intValue();
        }
        throw new ArithmeticException("BigInteger out of int range");
    }
}
