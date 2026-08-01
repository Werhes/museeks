package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.math.BigInteger;

/* renamed from: eٟٜؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2001e {
    public static final BigInteger ad = BigInteger.valueOf(1);
    public static final BigInteger vip = BigInteger.valueOf(2);

    static {
        BigInteger.valueOf(3L);
    }

    public static void ad(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 1 || bigInteger.bitLength() < 2) {
            throw new IllegalArgumentException("'candidate' must be non-null and >= 2");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean metrica(java.math.BigInteger r12, java.security.SecureRandom r13, int r14) {
        /*
            ad(r12)
            if (r13 == 0) goto L69
            r0 = 1
            if (r14 < r0) goto L61
            int r1 = r12.bitLength()
            r2 = 2
            if (r1 != r2) goto L10
            goto L60
        L10:
            r1 = 0
            boolean r2 = r12.testBit(r1)
            if (r2 != 0) goto L18
            goto L5c
        L18:
            java.math.BigInteger r2 = defpackage.AbstractC2001e.ad
            java.math.BigInteger r3 = r12.subtract(r2)
            java.math.BigInteger r4 = defpackage.AbstractC2001e.vip
            java.math.BigInteger r5 = r12.subtract(r4)
            int r6 = r3.getLowestSetBit()
            java.math.BigInteger r7 = r3.shiftRight(r6)
            r8 = r1
        L2d:
            if (r8 >= r14) goto L60
            java.math.BigInteger r9 = defpackage.AbstractC5907e.license(r4, r5, r13)
            java.math.BigInteger r9 = r9.modPow(r7, r12)
            boolean r10 = r9.equals(r2)
            if (r10 != 0) goto L5d
            boolean r10 = r9.equals(r3)
            if (r10 == 0) goto L44
            goto L5d
        L44:
            r10 = r0
        L45:
            if (r10 >= r6) goto L5c
            java.math.BigInteger r9 = r9.modPow(r4, r12)
            boolean r11 = r9.equals(r3)
            if (r11 == 0) goto L52
            goto L5d
        L52:
            boolean r11 = r9.equals(r2)
            if (r11 == 0) goto L59
            goto L5c
        L59:
            int r10 = r10 + 1
            goto L45
        L5c:
            return r1
        L5d:
            int r8 = r8 + 1
            goto L2d
        L60:
            return r0
        L61:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "'iterations' must be > 0"
            r12.<init>(r13)
            throw r12
        L69:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "'random' cannot be null"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2001e.metrica(java.math.BigInteger, java.security.SecureRandom, int):boolean");
    }

    public static boolean vip(BigInteger bigInteger) {
        ad(bigInteger);
        int intValue = bigInteger.mod(BigInteger.valueOf(223092870)).intValue();
        if (intValue % 2 == 0 || intValue % 3 == 0 || intValue % 5 == 0 || intValue % 7 == 0 || intValue % 11 == 0 || intValue % 13 == 0 || intValue % 17 == 0 || intValue % 19 == 0 || intValue % 23 == 0) {
            return true;
        }
        int intValue2 = bigInteger.mod(BigInteger.valueOf(58642669)).intValue();
        if (intValue2 % 29 == 0 || intValue2 % 31 == 0 || intValue2 % 37 == 0 || intValue2 % 41 == 0 || intValue2 % 43 == 0) {
            return true;
        }
        int intValue3 = bigInteger.mod(BigInteger.valueOf(600662303)).intValue();
        if (intValue3 % 47 == 0 || intValue3 % 53 == 0 || intValue3 % 59 == 0 || intValue3 % 61 == 0 || intValue3 % 67 == 0) {
            return true;
        }
        int intValue4 = bigInteger.mod(BigInteger.valueOf(33984931)).intValue();
        if (intValue4 % 71 == 0 || intValue4 % 73 == 0 || intValue4 % 79 == 0 || intValue4 % 83 == 0) {
            return true;
        }
        int intValue5 = bigInteger.mod(BigInteger.valueOf(89809099)).intValue();
        if (intValue5 % 89 == 0 || intValue5 % 97 == 0 || intValue5 % EnergyProfile.EVCONNECTOR_TYPE_OTHER == 0 || intValue5 % 103 == 0) {
            return true;
        }
        int intValue6 = bigInteger.mod(BigInteger.valueOf(167375713)).intValue();
        if (intValue6 % 107 == 0 || intValue6 % 109 == 0 || intValue6 % 113 == 0 || intValue6 % 127 == 0) {
            return true;
        }
        int intValue7 = bigInteger.mod(BigInteger.valueOf(371700317)).intValue();
        if (intValue7 % 131 == 0 || intValue7 % 137 == 0 || intValue7 % 139 == 0 || intValue7 % 149 == 0) {
            return true;
        }
        int intValue8 = bigInteger.mod(BigInteger.valueOf(645328247)).intValue();
        if (intValue8 % 151 == 0 || intValue8 % 157 == 0 || intValue8 % 163 == 0 || intValue8 % 167 == 0) {
            return true;
        }
        int intValue9 = bigInteger.mod(BigInteger.valueOf(1070560157)).intValue();
        if (intValue9 % 173 == 0 || intValue9 % 179 == 0 || intValue9 % 181 == 0 || intValue9 % 191 == 0) {
            return true;
        }
        int intValue10 = bigInteger.mod(BigInteger.valueOf(1596463769)).intValue();
        return intValue10 % 193 == 0 || intValue10 % 197 == 0 || intValue10 % 199 == 0 || intValue10 % 211 == 0;
    }
}
