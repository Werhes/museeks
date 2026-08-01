package defpackage;

import java.math.BigInteger;

/* renamed from: eؗۦٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5287e {
    public final BigInteger ad;
    public final int vip;

    public C5287e(int i, BigInteger bigInteger) {
        if (i < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.ad = bigInteger;
        this.vip = i;
    }

    public final C5287e ad(C5287e c5287e) {
        int i = c5287e.vip;
        int i2 = this.vip;
        if (i2 == i) {
            return new C5287e(i2, this.ad.add(c5287e.ad));
        }
        throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5287e)) {
            return false;
        }
        C5287e c5287e = (C5287e) obj;
        return this.ad.equals(c5287e.ad) && this.vip == c5287e.vip;
    }

    public final int hashCode() {
        return this.ad.hashCode() ^ this.vip;
    }

    public final BigInteger metrica() {
        BigInteger bigInteger = InterfaceC4563e.Signature;
        C5287e c5287e = new C5287e(1, bigInteger);
        int i = this.vip;
        if (i < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        if (i != 1) {
            c5287e = new C5287e(i, bigInteger.shiftLeft(i - 1));
        }
        C5287e ad = ad(c5287e);
        return ad.ad.shiftRight(ad.vip);
    }

    public final String toString() {
        BigInteger bigInteger = this.ad;
        int i = this.vip;
        if (i == 0) {
            return bigInteger.toString();
        }
        BigInteger shiftRight = bigInteger.shiftRight(i);
        BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(i));
        if (bigInteger.signum() == -1) {
            subtract = InterfaceC4563e.Signature.shiftLeft(i).subtract(subtract);
        }
        if (shiftRight.signum() == -1 && !subtract.equals(InterfaceC4563e.loadAd)) {
            shiftRight = shiftRight.add(InterfaceC4563e.Signature);
        }
        String bigInteger2 = shiftRight.toString();
        char[] cArr = new char[i];
        String bigInteger3 = subtract.toString(2);
        int length = bigInteger3.length();
        int i2 = i - length;
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = '0';
        }
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i2 + i4] = bigInteger3.charAt(i4);
        }
        return AbstractC5087e.m1746extends(bigInteger2, ".", new String(cArr));
    }

    public final int vip(BigInteger bigInteger) {
        return this.ad.compareTo(bigInteger.shiftLeft(this.vip));
    }
}
