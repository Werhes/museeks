package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;

/* renamed from: eؔ٘ۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2653e {
    public static final BigInteger startapp;
    public static final BigInteger yandex;
    public final AbstractC2040e ad;
    public SecureRandom appmetrica;
    public int billing;
    public int license;
    public int metrica;
    public boolean purchase;
    public int vip;

    static {
        BigInteger.valueOf(0L);
        yandex = BigInteger.valueOf(1L);
        startapp = BigInteger.valueOf(2L);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2653e() {
        this(new C12013e());
        int i = AbstractC9148e.ad;
    }

    public C2653e(AbstractC2040e abstractC2040e) {
        this.ad = abstractC2040e;
    }

    public static void vip(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b;
            if (b != 0) {
                return;
            }
        }
    }

    public final C6818e ad() {
        BigInteger bigInteger;
        int i;
        BigInteger subtract;
        BigInteger modPow;
        BigInteger bit;
        int i2;
        BigInteger subtract2;
        BigInteger modPow2;
        BigInteger bigInteger2;
        boolean z = this.purchase;
        BigInteger bigInteger3 = startapp;
        int i3 = 1;
        AbstractC2040e abstractC2040e = this.ad;
        int i4 = 0;
        BigInteger bigInteger4 = yandex;
        if (!z) {
            int i5 = 20;
            byte[] bArr = new byte[20];
            byte[] bArr2 = new byte[20];
            byte[] bArr3 = new byte[20];
            byte[] bArr4 = new byte[20];
            int i6 = this.vip;
            int i7 = (i6 - 1) / 160;
            int i8 = i6 / 8;
            byte[] bArr5 = new byte[i8];
            if (!(abstractC2040e instanceof C12013e)) {
                throw new IllegalStateException("can only use SHA-1 for generating FIPS 186-2 parameters");
            }
            loop5: while (true) {
                this.appmetrica.nextBytes(bArr);
                abstractC2040e.update(bArr, 0, i5);
                C12013e c12013e = (C12013e) abstractC2040e;
                c12013e.doFinal(bArr2, 0);
                System.arraycopy(bArr, 0, bArr3, 0, i5);
                vip(bArr3);
                abstractC2040e.update(bArr3, 0, i5);
                c12013e.doFinal(bArr3, 0);
                for (int i9 = 0; i9 != i5; i9++) {
                    bArr4[i9] = (byte) (bArr2[i9] ^ bArr3[i9]);
                }
                bArr4[0] = (byte) (bArr4[0] | Byte.MIN_VALUE);
                bArr4[19] = (byte) (bArr4[19] | 1);
                bigInteger = new BigInteger(1, bArr4);
                if (bigInteger.isProbablePrime(this.license)) {
                    byte[] license = AbstractC12442e.license(bArr);
                    vip(license);
                    i = 0;
                    while (i < 4096) {
                        int i10 = 1;
                        while (i10 <= i7) {
                            vip(license);
                            abstractC2040e.update(license, 0, license.length);
                            c12013e.doFinal(bArr5, i8 - (i10 * 20));
                            i10++;
                            bArr3 = bArr3;
                            bArr4 = bArr4;
                        }
                        byte[] bArr6 = bArr3;
                        byte[] bArr7 = bArr4;
                        int i11 = i8 - (i7 * 20);
                        vip(license);
                        abstractC2040e.update(license, 0, license.length);
                        c12013e.doFinal(bArr2, 0);
                        System.arraycopy(bArr2, 20 - i11, bArr5, 0, i11);
                        bArr5[0] = (byte) (bArr5[0] | Byte.MIN_VALUE);
                        BigInteger bigInteger5 = new BigInteger(1, bArr5);
                        subtract = bigInteger5.subtract(bigInteger5.mod(bigInteger.shiftLeft(1)).subtract(bigInteger4));
                        if (subtract.bitLength() == this.vip && subtract.isProbablePrime(this.license)) {
                            break loop5;
                        }
                        i++;
                        bArr3 = bArr6;
                        bArr4 = bArr7;
                    }
                    i5 = 20;
                }
            }
            SecureRandom secureRandom = this.appmetrica;
            BigInteger divide = subtract.subtract(bigInteger4).divide(bigInteger);
            BigInteger subtract3 = subtract.subtract(bigInteger3);
            do {
                modPow = AbstractC5907e.license(bigInteger3, subtract3, secureRandom).modPow(divide, subtract);
            } while (modPow.bitLength() <= 1);
            return new C6818e(subtract, bigInteger, modPow, new C4678e(bArr, i, 0));
        }
        int digestSize = abstractC2040e.getDigestSize() * 8;
        int i12 = this.metrica / 8;
        byte[] bArr8 = new byte[i12];
        int i13 = this.vip;
        int i14 = i13 - 1;
        int i15 = i14 / digestSize;
        int i16 = i14 % digestSize;
        int i17 = i13 / 8;
        byte[] bArr9 = new byte[i17];
        int digestSize2 = abstractC2040e.getDigestSize();
        byte[] bArr10 = new byte[digestSize2];
        loop0: while (true) {
            this.appmetrica.nextBytes(bArr8);
            abstractC2040e.update(bArr8, i4, i12);
            abstractC2040e.doFinal(bArr10, i4);
            bit = new BigInteger(i3, bArr10).mod(bigInteger4.shiftLeft(this.metrica - i3)).setBit(i4).setBit(this.metrica - i3);
            if (bit.isProbablePrime(this.license)) {
                byte[] license2 = AbstractC12442e.license(bArr8);
                int i18 = this.vip * 4;
                i2 = i4;
                while (i2 < i18) {
                    int i19 = 1;
                    while (i19 <= i15) {
                        vip(license2);
                        abstractC2040e.update(license2, 0, license2.length);
                        abstractC2040e.doFinal(bArr9, i17 - (i19 * digestSize2));
                        i19++;
                        i17 = i17;
                        digestSize2 = digestSize2;
                    }
                    int i20 = i17;
                    int i21 = digestSize2;
                    int i22 = i20 - (i15 * i21);
                    vip(license2);
                    abstractC2040e.update(license2, 0, license2.length);
                    abstractC2040e.doFinal(bArr10, 0);
                    System.arraycopy(bArr10, i21 - i22, bArr9, 0, i22);
                    bArr9[0] = (byte) (bArr9[0] | Byte.MIN_VALUE);
                    BigInteger bigInteger6 = new BigInteger(1, bArr9);
                    subtract2 = bigInteger6.subtract(bigInteger6.mod(bit.shiftLeft(1)).subtract(bigInteger4));
                    if (subtract2.bitLength() == this.vip && subtract2.isProbablePrime(this.license)) {
                        break loop0;
                    }
                    i2++;
                    i17 = i20;
                    digestSize2 = i21;
                    i4 = 0;
                }
                i3 = 1;
            }
        }
        int i23 = this.billing;
        if (i23 >= 0) {
            BigInteger divide2 = subtract2.subtract(bigInteger4).divide(bit);
            byte[] metrica = AbstractC7240e.metrica("6767656E");
            int length = metrica.length + i12;
            int i24 = length + 3;
            byte[] bArr11 = new byte[i24];
            int i25 = 0;
            System.arraycopy(bArr8, 0, bArr11, 0, i12);
            System.arraycopy(metrica, 0, bArr11, i12, metrica.length);
            bArr11[length] = (byte) i23;
            byte[] bArr12 = new byte[abstractC2040e.getDigestSize()];
            int i26 = 1;
            while (true) {
                if (i26 >= 65536) {
                    bigInteger2 = null;
                    break;
                }
                vip(bArr11);
                abstractC2040e.update(bArr11, i25, i24);
                abstractC2040e.doFinal(bArr12, i25);
                bigInteger2 = new BigInteger(1, bArr12).modPow(divide2, subtract2);
                if (bigInteger2.compareTo(bigInteger3) >= 0) {
                    break;
                }
                i26++;
                i25 = 0;
            }
            if (bigInteger2 != null) {
                return new C6818e(subtract2, bit, bigInteger2, new C4678e(bArr8, i2, 0));
            }
        }
        SecureRandom secureRandom2 = this.appmetrica;
        BigInteger divide3 = subtract2.subtract(bigInteger4).divide(bit);
        BigInteger subtract4 = subtract2.subtract(bigInteger3);
        do {
            modPow2 = AbstractC5907e.license(bigInteger3, subtract4, secureRandom2).modPow(divide3, subtract2);
        } while (modPow2.bitLength() <= 1);
        return new C6818e(subtract2, bit, modPow2, new C4678e(bArr8, i2, 0));
    }

    public final void license(C18283e c18283e) {
        int i = c18283e.ad;
        int i2 = c18283e.vip;
        if (i < 1024 || i > 3072 || i % 1024 != 0) {
            throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
        }
        if (i == 1024 && i2 != 160) {
            throw new IllegalArgumentException("N must be 160 for L = 1024");
        }
        if (i == 2048 && i2 != 224 && i2 != 256) {
            throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
        }
        if (i == 3072 && i2 != 256) {
            throw new IllegalArgumentException("N must be 256 for L = 3072");
        }
        if (this.ad.getDigestSize() * 8 < i2) {
            throw new IllegalStateException("Digest output size too small for value of N");
        }
        this.vip = i;
        this.metrica = i2;
        int i3 = c18283e.metrica;
        this.license = i3;
        Math.max(i <= 1024 ? 40 : (((i - 1) / 1024) * 8) + 48, (i3 + 1) / 2);
        this.appmetrica = c18283e.license;
        this.purchase = true;
        this.billing = -1;
    }

    public final void metrica(int i, int i2, SecureRandom secureRandom) {
        this.vip = i;
        this.metrica = i > 1024 ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 160;
        this.license = i2;
        Math.max(i <= 1024 ? 40 : (((i - 1) / 1024) * 8) + 48, (i2 + 1) / 2);
        this.appmetrica = secureRandom;
        this.purchase = false;
        this.billing = -1;
    }
}
