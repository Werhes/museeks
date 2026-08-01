package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16091e {
    public static final C2892e ad = new C2892e(-1697580388, false, new C14866e(7));

    public static boolean Signature(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            int i2 = iArr[i] ^ RecyclerView.UNDEFINED_DURATION;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static int ad(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static boolean adcel(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean admob(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int ads(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int[] advert(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[6];
        for (int i = 0; i < 6; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static int amazon(int[] iArr) {
        return iArr[0] & 1;
    }

    public static void applovin(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 12;
        int i2 = 0;
        int i3 = 5;
        while (true) {
            int i4 = i3 - 1;
            long j2 = iArr[i3] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i2 << 31) & 4294967295L);
                iArr2[0] = (int) j4;
                int i5 = ((int) (j4 >>> 32)) & 1;
                long j6 = iArr[1] & 4294967295L;
                long j7 = (j6 * j) + j5;
                int i6 = (int) j7;
                iArr2[1] = i5 | (i6 << 1);
                long j8 = iArr[2] & 4294967295L;
                long j9 = (j8 * j) + (iArr2[2] & 4294967295L) + (j7 >>> 32);
                int i7 = (int) j9;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long amazon = AbstractC1786e.amazon(j8, j6, j9 >>> 32, iArr2[3] & 4294967295L);
                long j10 = (iArr2[4] & 4294967295L) + (amazon >>> 32);
                long j11 = iArr[3] & 4294967295L;
                long j12 = (iArr2[5] & 4294967295L) + (j10 >>> 32);
                long j13 = j10 & 4294967295L;
                long j14 = (iArr2[6] & 4294967295L) + (j12 >>> 32);
                long j15 = j12 & 4294967295L;
                long j16 = (j11 * j) + (amazon & 4294967295L);
                int i8 = (int) j16;
                iArr2[3] = (i7 >>> 31) | (i8 << 1);
                int i9 = i8 >>> 31;
                long amazon2 = AbstractC1786e.amazon(j11, j6, j16 >>> 32, j13);
                long amazon3 = AbstractC1786e.amazon(j11, j8, amazon2 >>> 32, j15);
                long j17 = j14 + (amazon3 >>> 32);
                long j18 = iArr[4] & 4294967295L;
                long j19 = (iArr2[7] & 4294967295L) + (j17 >>> 32);
                long j20 = j17 & 4294967295L;
                long j21 = (iArr2[8] & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (j18 * j) + (amazon2 & 4294967295L);
                int i10 = (int) j23;
                iArr2[4] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long amazon4 = AbstractC1786e.amazon(j18, j6, j23 >>> 32, amazon3 & 4294967295L);
                long amazon5 = AbstractC1786e.amazon(j18, j8, amazon4 >>> 32, j20);
                long amazon6 = AbstractC1786e.amazon(j18, j11, amazon5 >>> 32, j22);
                long j24 = j21 + (amazon6 >>> 32);
                long j25 = iArr[5] & 4294967295L;
                long j26 = (iArr2[9] & 4294967295L) + (j24 >>> 32);
                long j27 = j24 & 4294967295L;
                long j28 = (iArr2[10] & 4294967295L) + (j26 >>> 32);
                long j29 = j26 & 4294967295L;
                long j30 = (j25 * j) + (amazon4 & 4294967295L);
                int i12 = (int) j30;
                iArr2[5] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long amazon7 = AbstractC1786e.amazon(j25, j6, j30 >>> 32, amazon5 & 4294967295L);
                long amazon8 = AbstractC1786e.amazon(j25, j8, amazon7 >>> 32, amazon6 & 4294967295L);
                long amazon9 = AbstractC1786e.amazon(j25, j11, amazon8 >>> 32, j27);
                long amazon10 = AbstractC1786e.amazon(j25, j18, amazon9 >>> 32, j29);
                long j31 = j28 + (amazon10 >>> 32);
                int i14 = (int) amazon7;
                iArr2[6] = (i14 << 1) | i13;
                int i15 = (int) amazon8;
                iArr2[7] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) amazon9;
                iArr2[8] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) amazon10;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j31;
                iArr2[10] = i20 | (i21 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j31 >>> 32))) << 1) | (i21 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static byte[] appmetrica(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            if (!AbstractC2827e.purchase(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey.getW();
            AbstractC2827e.vip(w, eCPrivateKey.getParams().getCurve());
            PublicKey generatePublic = ((KeyFactory) C7174e.purchase.ad.isPro("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreement = (KeyAgreement) C7174e.license.ad.isPro("ECDH");
            keyAgreement.init(eCPrivateKey);
            try {
                keyAgreement.doPhase(generatePublic, true);
                byte[] generateSecret = keyAgreement.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, generateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(AbstractC2827e.license(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                purchase(bigInteger, true, curve);
                return generateSecret;
            } catch (IllegalStateException e) {
                throw new GeneralSecurityException(e);
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static void billing(int i, int[] iArr, int[] iArr2) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
    }

    public static BigInteger crashlytics(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                AbstractC3628e.billing(i2, (5 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger firebase(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC3628e.admob((2 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static ECPoint inmobi(EllipticCurve ellipticCurve, EnumC1901e enumC1901e, byte[] bArr) {
        int mopub = mopub(ellipticCurve);
        int ordinal = enumC1901e.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            if (bArr.length != (mopub * 2) + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i = mopub + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, bArr.length)));
            AbstractC2827e.vip(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                throw new GeneralSecurityException("invalid format:" + enumC1901e);
            }
            if (bArr.length != mopub * 2) {
                throw new GeneralSecurityException("invalid point size");
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, mopub)), new BigInteger(1, Arrays.copyOfRange(bArr, mopub, bArr.length)));
            AbstractC2827e.vip(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        BigInteger license = AbstractC2827e.license(ellipticCurve);
        if (bArr.length != mopub + 1) {
            throw new GeneralSecurityException("compressed point has wrong length");
        }
        byte b = bArr[0];
        if (b != 2) {
            if (b != 3) {
                throw new GeneralSecurityException("invalid format");
            }
            z = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
        if (bigInteger.signum() == -1 || bigInteger.compareTo(license) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        return new ECPoint(bigInteger, purchase(bigInteger, z, ellipticCurve));
    }

    public static byte[] isPro(EllipticCurve ellipticCurve, EnumC1901e enumC1901e, ECPoint eCPoint) {
        AbstractC2827e.vip(eCPoint, ellipticCurve);
        int mopub = mopub(ellipticCurve);
        int ordinal = enumC1901e.ordinal();
        if (ordinal == 0) {
            int i = (mopub * 2) + 1;
            byte[] bArr = new byte[i];
            byte[] appmetrica = AbstractC7354e.appmetrica(eCPoint.getAffineX());
            byte[] appmetrica2 = AbstractC7354e.appmetrica(eCPoint.getAffineY());
            System.arraycopy(appmetrica2, 0, bArr, i - appmetrica2.length, appmetrica2.length);
            System.arraycopy(appmetrica, 0, bArr, (mopub + 1) - appmetrica.length, appmetrica.length);
            bArr[0] = 4;
            return bArr;
        }
        if (ordinal == 1) {
            int i2 = mopub + 1;
            byte[] bArr2 = new byte[i2];
            byte[] appmetrica3 = AbstractC7354e.appmetrica(eCPoint.getAffineX());
            System.arraycopy(appmetrica3, 0, bArr2, i2 - appmetrica3.length, appmetrica3.length);
            bArr2[0] = (byte) (eCPoint.getAffineY().testBit(0) ? 3 : 2);
            return bArr2;
        }
        if (ordinal != 2) {
            throw new GeneralSecurityException("invalid format:" + enumC1901e);
        }
        int i3 = mopub * 2;
        byte[] bArr3 = new byte[i3];
        byte[] appmetrica4 = AbstractC7354e.appmetrica(eCPoint.getAffineX());
        if (appmetrica4.length > mopub) {
            appmetrica4 = Arrays.copyOfRange(appmetrica4, appmetrica4.length - mopub, appmetrica4.length);
        }
        byte[] appmetrica5 = AbstractC7354e.appmetrica(eCPoint.getAffineY());
        if (appmetrica5.length > mopub) {
            appmetrica5 = Arrays.copyOfRange(appmetrica5, appmetrica5.length - mopub, appmetrica5.length);
        }
        System.arraycopy(appmetrica5, 0, bArr3, i3 - appmetrica5.length, appmetrica5.length);
        System.arraycopy(appmetrica4, 0, bArr3, mopub - appmetrica4.length, appmetrica4.length);
        return bArr3;
    }

    public static final C8280e isVip(AbstractC12378e... abstractC12378eArr) {
        ArrayList arrayList = new ArrayList(abstractC12378eArr.length);
        if (abstractC12378eArr.length <= 0) {
            C6571e[] c6571eArr = (C6571e[]) arrayList.toArray(new C6571e[0]);
            return new C8280e(AbstractC10064e.billing((C6571e[]) Arrays.copyOf(c6571eArr, c6571eArr.length)));
        }
        AbstractC12378e abstractC12378e = abstractC12378eArr[0];
        throw null;
    }

    public static int license(int[] iArr, int[] iArr2) {
        long j = (iArr[6] & 4294967295L) + (iArr2[12] & 4294967295L);
        int i = (int) j;
        iArr[6] = i;
        iArr2[12] = i;
        long j2 = (iArr[7] & 4294967295L) + (iArr2[13] & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[7] = i2;
        iArr2[13] = i2;
        long j3 = (iArr[8] & 4294967295L) + (iArr2[14] & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[8] = i3;
        iArr2[14] = i3;
        long j4 = (iArr[9] & 4294967295L) + (iArr2[15] & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[9] = i4;
        iArr2[15] = i4;
        long j5 = (iArr[10] & 4294967295L) + (iArr2[16] & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[10] = i5;
        iArr2[16] = i5;
        long j6 = (iArr[11] & 4294967295L) + (4294967295L & iArr2[17]) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[11] = i6;
        iArr2[17] = i6;
        return (int) (j6 >>> 32);
    }

    public static ECParameterSpec loadAd(EnumC6205e enumC6205e) {
        int ordinal = enumC6205e.ordinal();
        if (ordinal == 0) {
            return AbstractC2827e.ad;
        }
        if (ordinal == 1) {
            return AbstractC2827e.vip;
        }
        if (ordinal == 2) {
            return AbstractC2827e.metrica;
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + enumC6205e);
    }

    public static int metrica(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L) + (i3 & 4294967295L);
        iArr2[i2] = (int) j;
        long j2 = (iArr[i + 1] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j >>> 32);
        iArr2[i2 + 1] = (int) j2;
        long j3 = (iArr[i + 2] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j2 >>> 32);
        iArr2[i2 + 2] = (int) j3;
        long j4 = (iArr[i + 3] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j3 >>> 32);
        iArr2[i2 + 3] = (int) j4;
        long j5 = (iArr[i + 4] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j4 >>> 32);
        iArr2[i2 + 4] = (int) j5;
        long j6 = (iArr[i + 5] & 4294967295L) + (4294967295L & iArr2[r10]) + (j5 >>> 32);
        iArr2[i2 + 5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int mopub(EllipticCurve ellipticCurve) {
        return (AbstractC2827e.license(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static void premium(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
        long j = (iArr[i] & 4294967295L) - (iArr2[i2] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[i + 1] & 4294967295L) - (iArr2[i2 + 1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[i + 2] & 4294967295L) - (iArr2[i2 + 2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[i + 3] & 4294967295L) - (iArr2[i2 + 3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[i + 4] & 4294967295L) - (iArr2[i2 + 4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        iArr3[5] = (int) (((iArr[i + 5] & 4294967295L) - (iArr2[i2 + 5] & 4294967295L)) + (j5 >> 32));
    }

    public static boolean pro(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger purchase(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) {
        BigInteger license = AbstractC2827e.license(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(license);
        if (license.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger mod2 = mod.mod(license);
        BigInteger bigInteger2 = BigInteger.ZERO;
        if (!mod2.equals(bigInteger2)) {
            if (license.testBit(0) && license.testBit(1)) {
                bigInteger2 = mod2.modPow(license.add(BigInteger.ONE).shiftRight(2), license);
            } else if (!license.testBit(0) || license.testBit(1)) {
                bigInteger2 = null;
            } else {
                bigInteger2 = BigInteger.ONE;
                BigInteger shiftRight = license.subtract(bigInteger2).shiftRight(1);
                int i = 0;
                while (true) {
                    BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(license);
                    if (mod3.equals(BigInteger.ZERO)) {
                        break;
                    }
                    BigInteger modPow = mod3.modPow(shiftRight, license);
                    BigInteger bigInteger3 = BigInteger.ONE;
                    if (modPow.add(bigInteger3).equals(license)) {
                        BigInteger shiftRight2 = license.add(bigInteger3).shiftRight(1);
                        BigInteger bigInteger4 = bigInteger2;
                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                            BigInteger multiply = bigInteger4.multiply(bigInteger3);
                            bigInteger4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(license).multiply(mod3)).mod(license);
                            BigInteger mod4 = multiply.add(multiply).mod(license);
                            if (shiftRight2.testBit(bitLength)) {
                                BigInteger mod5 = bigInteger4.multiply(bigInteger2).add(mod4.multiply(mod3)).mod(license);
                                bigInteger3 = bigInteger2.multiply(mod4).add(bigInteger4).mod(license);
                                bigInteger4 = mod5;
                            } else {
                                bigInteger3 = mod4;
                            }
                        }
                        bigInteger2 = bigInteger4;
                    } else {
                        if (!modPow.equals(bigInteger3)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                        bigInteger2 = bigInteger2.add(bigInteger3);
                        i++;
                        if (i == 128 && !license.isProbablePrime(80)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    }
                }
            }
            if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(license).compareTo(mod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
        }
        return z != bigInteger2.testBit(0) ? license.subtract(bigInteger2).mod(license) : bigInteger2;
    }

    public static boolean remoteconfig(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void signatures(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        int i = 1;
        long j7 = iArr[0] & 4294967295L;
        long j8 = j7 * j;
        iArr3[0] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[1] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[5] = (int) j13;
        int i2 = 6;
        iArr3[6] = (int) (j13 >>> 32);
        while (true) {
            int i3 = i;
            if (i3 >= i2) {
                return;
            }
            long j14 = iArr[i3] & 4294967295L;
            long j15 = (j14 * j) + (iArr3[i3] & 4294967295L);
            iArr3[i3] = (int) j15;
            i = i3 + 1;
            long j16 = j5;
            long j17 = (j14 * j2) + (iArr3[i] & 4294967295L) + (j15 >>> 32);
            iArr3[i] = (int) j17;
            long j18 = (j14 * j3) + (iArr3[r5] & 4294967295L) + (j17 >>> 32);
            iArr3[i3 + 2] = (int) j18;
            long j19 = (j14 * j4) + (iArr3[r5] & 4294967295L) + (j18 >>> 32);
            iArr3[i3 + 3] = (int) j19;
            long j20 = (j14 * j16) + (iArr3[r5] & 4294967295L) + (j19 >>> 32);
            iArr3[i3 + 4] = (int) j20;
            long j21 = (j14 * j6) + (iArr3[r5] & 4294967295L) + (j20 >>> 32);
            iArr3[i3 + 5] = (int) j21;
            iArr3[i3 + 6] = (int) (j21 >>> 32);
            j5 = j16;
            i2 = 6;
        }
    }

    public static KeyPair smaato(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) C7174e.appmetrica.ad.isPro("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static boolean startapp(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 5;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[6 + i] ^ RecyclerView.UNDEFINED_DURATION;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                z = false;
                break;
            }
            if (i2 > i3) {
                break;
            }
            i--;
        }
        if (z) {
            premium(iArr, 6, iArr2, 0, iArr3);
            return z;
        }
        premium(iArr2, 0, iArr, 6, iArr3);
        return z;
    }

    public static void subs(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        iArr2[5] = (int) (((iArr2[5] & 4294967295L) - (4294967295L & iArr[5])) + (j5 >> 32));
    }

    public static final boolean subscription(C15860e c15860e, boolean z) {
        InterfaceC0043e metrica;
        C7911e c7911e = c15860e.license;
        if (c7911e == null || (metrica = c7911e.metrica()) == null) {
            return false;
        }
        return AbstractC14520e.vip(c15860e.advert(z), AbstractC14520e.startapp(metrica));
    }

    public static int tapsense(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = 0;
        while (i < 6) {
            long j8 = j;
            int i2 = i;
            long j9 = iArr[i] & 4294967295L;
            long j10 = (iArr3[i2] & 4294967295L) + (j9 * j8);
            iArr3[i2] = (int) j10;
            int i3 = i2 + 1;
            long j11 = (j9 * j2) + (iArr3[i3] & 4294967295L) + (j10 >>> 32);
            iArr3[i3] = (int) j11;
            long j12 = (j9 * j3) + (iArr3[r15] & 4294967295L) + (j11 >>> 32);
            iArr3[i2 + 2] = (int) j12;
            long j13 = (j9 * j4) + (iArr3[r2] & 4294967295L) + (j12 >>> 32);
            iArr3[i2 + 3] = (int) j13;
            long j14 = (j9 * j5) + (iArr3[r2] & 4294967295L) + (j13 >>> 32);
            iArr3[i2 + 4] = (int) j14;
            long j15 = (j9 * j6) + (iArr3[r2] & 4294967295L) + (j14 >>> 32);
            iArr3[i2 + 5] = (int) j15;
            long j16 = (j15 >>> 32) + (iArr3[r2] & 4294967295L) + j7;
            iArr3[i2 + 6] = (int) j16;
            j7 = j16 >>> 32;
            i = i3;
            j = j8;
        }
        return (int) j7;
    }

    public static int vip(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static void yandex(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
    }
}
