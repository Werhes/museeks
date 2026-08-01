package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eؙٜٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14103e {
    public static final BigInteger ad = BigInteger.valueOf(1);
    public static final BigInteger vip = BigInteger.valueOf(2);

    public static BigInteger[] ad(int i, int i2, SecureRandom secureRandom) {
        int i3 = i - 1;
        int i4 = i >>> 2;
        while (true) {
            BigInteger appmetrica = AbstractC5907e.appmetrica(i3, 2, secureRandom);
            BigInteger add = appmetrica.shiftLeft(1).add(ad);
            if (add.isProbablePrime(i2) && (i2 <= 2 || appmetrica.isProbablePrime(i2 - 2))) {
                if (AbstractC0903e.appmetrica(add) >= i4) {
                    return new BigInteger[]{add, appmetrica};
                }
            }
        }
    }

    public static BigInteger vip(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger modPow;
        BigInteger bigInteger2 = vip;
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        do {
            modPow = AbstractC5907e.license(bigInteger2, subtract, secureRandom).modPow(bigInteger2, bigInteger);
        } while (modPow.equals(ad));
        return modPow;
    }
}
