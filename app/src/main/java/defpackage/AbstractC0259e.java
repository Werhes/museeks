package defpackage;

import java.math.BigInteger;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0259e {
    public static final int[] ad = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    public static final int[] vip = {-1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, -731974758, 43769659, 0, 0, 0, 16777216};

    public static int ad(AbstractC0362e abstractC0362e) {
        int advert = (abstractC0362e.advert() + 1) / 2;
        return advert > 256 ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : advert;
    }

    public static String adcel(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC15118e.billing("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC15118e.billing("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC8647e.isPro(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
    }

    public static final Object appmetrica(C0500e c0500e, C16591e c16591e) {
        Object billing = c0500e.f2578e.billing(c16591e);
        if (billing == null) {
            return null;
        }
        return billing;
    }

    public static void billing(int i, int i2) {
        String billing;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                billing = AbstractC15118e.billing("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC8647e.isPro(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                }
                billing = AbstractC15118e.billing("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(billing);
        }
    }

    public static final int license(InterfaceC9153e interfaceC9153e, Object obj, int i) {
        int appmetrica;
        return (obj == null || interfaceC9153e.ad() == 0 || (i < interfaceC9153e.ad() && obj.equals(interfaceC9153e.vip(i))) || (appmetrica = interfaceC9153e.appmetrica(obj)) == -1) ? i : appmetrica;
    }

    public static void metrica(byte[] bArr, int[] iArr) {
        AbstractC12751e.purchase(8, bArr, iArr);
    }

    public static byte[] purchase(byte[] bArr) {
        long appmetrica = AbstractC12751e.appmetrica(49, bArr);
        long j = appmetrica & 4294967295L;
        long appmetrica2 = AbstractC12751e.appmetrica(56, bArr);
        long j2 = bArr[63] & 255;
        long license = ((AbstractC12751e.license(60, bArr) << 4) & 4294967295L) + ((appmetrica2 & 4294967295L) >> 28);
        long j3 = appmetrica2 & 268435455;
        long appmetrica3 = (AbstractC12751e.appmetrica(28, bArr) & 4294967295L) - (license * (-50998291));
        long license2 = (((AbstractC12751e.license(32, bArr) << 4) & 4294967295L) - (j2 * (-50998291))) - (license * 19280294);
        long appmetrica4 = ((AbstractC12751e.appmetrica(42, bArr) & 4294967295L) - (j2 * (-6428113))) - (license * 5343);
        long license3 = ((((AbstractC12751e.license(39, bArr) << 4) & 4294967295L) - (j2 * 127719000)) - (license * (-6428113))) - (j3 * 5343);
        long license4 = ((AbstractC12751e.license(53, bArr) << 4) & 4294967295L) + (j >> 28);
        long j4 = appmetrica & 268435455;
        long appmetrica5 = ((((AbstractC12751e.appmetrica(35, bArr) & 4294967295L) - (j2 * 19280294)) - (license * 127719000)) - (j3 * (-6428113))) - (license4 * 5343);
        long j5 = ((license2 - (j3 * 127719000)) - (license4 * (-6428113))) - (j4 * 5343);
        long license5 = (((AbstractC12751e.license(46, bArr) << 4) & 4294967295L) - (j2 * 5343)) + (appmetrica4 >> 28);
        long appmetrica6 = (AbstractC12751e.appmetrica(14, bArr) & 4294967295L) - (license5 * (-50998291));
        long license6 = (((AbstractC12751e.license(18, bArr) << 4) & 4294967295L) - (j4 * (-50998291))) - (license5 * 19280294);
        long appmetrica7 = (((AbstractC12751e.appmetrica(21, bArr) & 4294967295L) - (license4 * (-50998291))) - (j4 * 19280294)) - (license5 * 127719000);
        long license7 = (((((AbstractC12751e.license(25, bArr) << 4) & 4294967295L) - (j3 * (-50998291))) - (license4 * 19280294)) - (j4 * 127719000)) - (license5 * (-6428113));
        long j6 = (((appmetrica3 - (j3 * 19280294)) - (license4 * 127719000)) - (j4 * (-6428113))) - (license5 * 5343);
        long j7 = (appmetrica4 & 268435455) + (license3 >> 28);
        long j8 = license7 - (j7 * 5343);
        long j9 = (license3 & 268435455) + (appmetrica5 >> 28);
        long license8 = (((AbstractC12751e.license(11, bArr) << 4) & 4294967295L) - (j7 * (-50998291))) - (j9 * 19280294);
        long j10 = (appmetrica6 - (j7 * 19280294)) - (j9 * 127719000);
        long j11 = (license6 - (j7 * 127719000)) - (j9 * (-6428113));
        long j12 = (appmetrica7 - (j7 * (-6428113))) - (j9 * 5343);
        long j13 = (appmetrica5 & 268435455) + (j5 >> 28);
        long license9 = ((AbstractC12751e.license(4, bArr) << 4) & 4294967295L) - (j13 * (-50998291));
        long appmetrica8 = ((AbstractC12751e.appmetrica(7, bArr) & 4294967295L) - (j9 * (-50998291))) - (j13 * 19280294);
        long j14 = license8 - (j13 * 127719000);
        long j15 = j10 - (j13 * (-6428113));
        long j16 = j11 - (j13 * 5343);
        long j17 = j6 + (j8 >> 28);
        long j18 = (j5 & 268435455) + (j17 >> 28);
        long j19 = j17 & 268435455;
        long j20 = j19 >>> 27;
        long j21 = j18 + j20;
        long appmetrica9 = (AbstractC12751e.appmetrica(0, bArr) & 4294967295L) - (j21 * (-50998291));
        long j22 = (license9 - (j21 * 19280294)) + (appmetrica9 >> 28);
        long j23 = (appmetrica8 - (j21 * 127719000)) + (j22 >> 28);
        long j24 = (j14 - (j21 * (-6428113))) + (j23 >> 28);
        long j25 = (j15 - (j21 * 5343)) + (j24 >> 28);
        long j26 = j16 + (j25 >> 28);
        long j27 = j12 + (j26 >> 28);
        long j28 = (j8 & 268435455) + (j27 >> 28);
        long j29 = j19 + (j28 >> 28);
        long j30 = (j29 >> 28) - j20;
        long j31 = (appmetrica9 & 268435455) + (j30 & (-50998291));
        long j32 = (j22 & 268435455) + (j30 & 19280294) + (j31 >> 28);
        long j33 = (j23 & 268435455) + (j30 & 127719000) + (j32 >> 28);
        long j34 = (j24 & 268435455) + (j30 & (-6428113)) + (j33 >> 28);
        long j35 = (j25 & 268435455) + (j30 & 5343) + (j34 >> 28);
        long j36 = (j26 & 268435455) + (j35 >> 28);
        long j37 = (j27 & 268435455) + (j36 >> 28);
        long j38 = (j28 & 268435455) + (j37 >> 28);
        byte[] bArr2 = new byte[32];
        AbstractC12751e.startapp(0, (j31 & 268435455) | ((j32 & 268435455) << 28), bArr2);
        AbstractC12751e.startapp(7, (j33 & 268435455) | ((j34 & 268435455) << 28), bArr2);
        AbstractC12751e.startapp(14, (j35 & 268435455) | ((j36 & 268435455) << 28), bArr2);
        AbstractC12751e.startapp(21, (j37 & 268435455) | ((j38 & 268435455) << 28), bArr2);
        AbstractC12751e.billing((int) ((j29 & 268435455) + (j38 >> 28)), 28, bArr2);
        return bArr2;
    }

    public static void startapp(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? adcel(i, i3, "start index") : (i2 < 0 || i2 > i3) ? adcel(i2, i3, "end index") : AbstractC15118e.billing("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static int vip(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        if (bitLength < 2048) {
            return bitLength >= 1024 ? 80 : 20;
        }
        if (bitLength < 3072) {
            return 112;
        }
        if (bitLength < 7680) {
            return 128;
        }
        if (bitLength >= 15360) {
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return 192;
    }

    public static void yandex(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(adcel(i, i2, "index"));
        }
    }
}
