package defpackage;

import java.math.BigInteger;

/* renamed from: eؚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1661e {
    public static final BigInteger ad;
    public static final C5891e[] appmetrica;
    public static final byte[][] license;
    public static final C5891e[] metrica;
    public static final byte[][] purchase;
    public static final BigInteger vip;

    static {
        BigInteger bigInteger = InterfaceC4563e.Signature;
        BigInteger negate = bigInteger.negate();
        ad = negate;
        vip = InterfaceC4563e.admob.negate();
        BigInteger bigInteger2 = InterfaceC4563e.subscription;
        BigInteger negate2 = bigInteger2.negate();
        BigInteger bigInteger3 = InterfaceC4563e.loadAd;
        int i = 28;
        metrica = new C5891e[]{null, new C5891e(bigInteger, bigInteger3, i), null, new C5891e(negate2, negate, i), null, new C5891e(negate, negate, i), null, new C5891e(bigInteger, negate, i), null, new C5891e(negate, bigInteger, i), null, new C5891e(bigInteger, bigInteger, i), null, new C5891e(bigInteger2, bigInteger, i), null, new C5891e(negate, bigInteger3, i)};
        license = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        appmetrica = new C5891e[]{null, new C5891e(bigInteger, bigInteger3, i), null, new C5891e(negate2, bigInteger, i), null, new C5891e(negate, bigInteger, i), null, new C5891e(bigInteger, bigInteger, i), null, new C5891e(negate, negate, i), null, new C5891e(bigInteger, negate, i), null, new C5891e(bigInteger2, negate, i), null, new C5891e(negate, bigInteger3, i)};
        purchase = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static C5287e ad(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i) {
        int i2 = (i + 5) / 2;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i - (i2 + 10)) - 2) + b));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i)));
        BigInteger shiftRight = add.shiftRight(i2);
        if (add.testBit(i2 - 1)) {
            shiftRight = shiftRight.add(InterfaceC4563e.Signature);
        }
        return new C5287e(10, shiftRight);
    }

    public static BigInteger[] metrica(AbstractC5490e abstractC5490e) {
        int i;
        if (!abstractC5490e.signatures()) {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int advert = abstractC5490e.advert();
        int intValue = abstractC5490e.vip.firebase().intValue();
        BigInteger bigInteger = abstractC5490e.appmetrica;
        byte b = (byte) (intValue == 0 ? -1 : 1);
        if (bigInteger != null) {
            if (bigInteger.equals(InterfaceC4563e.admob)) {
                i = 1;
            } else if (bigInteger.equals(InterfaceC4563e.remoteconfig)) {
                i = 2;
            }
            BigInteger[] vip2 = vip(b, (advert + 3) - intValue, false);
            if (b == 1) {
                vip2[0] = vip2[0].negate();
                vip2[1] = vip2[1].negate();
            }
            BigInteger bigInteger2 = InterfaceC4563e.Signature;
            return new BigInteger[]{bigInteger2.add(vip2[1]).shiftRight(i), bigInteger2.add(vip2[0]).shiftRight(i).negate()};
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] vip(byte b, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b != 1 && b != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z) {
            bigInteger = InterfaceC4563e.admob;
            bigInteger2 = BigInteger.valueOf(b);
        } else {
            bigInteger = InterfaceC4563e.loadAd;
            bigInteger2 = InterfaceC4563e.Signature;
        }
        int i2 = 1;
        while (i2 < i) {
            i2++;
            BigInteger bigInteger3 = bigInteger2;
            bigInteger2 = (b < 0 ? bigInteger2.negate() : bigInteger2).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger3;
        }
        return new BigInteger[]{bigInteger, bigInteger2};
    }
}
