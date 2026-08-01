package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eؚؕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3211e {
    public static final BigInteger ad = BigInteger.valueOf(1);
    public static final BigInteger vip = BigInteger.valueOf(2);

    public static BigInteger ad(C3236e c3236e, SecureRandom secureRandom) {
        BigInteger license;
        BigInteger bit;
        int i = c3236e.f7371e;
        if (i != 0) {
            int i2 = i >>> 2;
            do {
                bit = AbstractC5907e.metrica(i, secureRandom).setBit(i - 1);
            } while (AbstractC0903e.appmetrica(bit) < i2);
            return bit;
        }
        int i3 = c3236e.f7365e;
        BigInteger bigInteger = vip;
        BigInteger shiftLeft = i3 != 0 ? ad.shiftLeft(i3 - 1) : bigInteger;
        BigInteger bigInteger2 = c3236e.f7366e;
        if (bigInteger2 == null) {
            bigInteger2 = c3236e.f7367e;
        }
        BigInteger subtract = bigInteger2.subtract(bigInteger);
        int bitLength = subtract.bitLength() >>> 2;
        do {
            license = AbstractC5907e.license(shiftLeft, subtract, secureRandom);
        } while (AbstractC0903e.appmetrica(license) < bitLength);
        return license;
    }
}
