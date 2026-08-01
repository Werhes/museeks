package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: this, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cthis extends Cdefault {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final inmobi f36479e = new inmobi(9, Cthis.class);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f36480e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f36481e;

    public Cthis(long j) {
        this.f36481e = BigInteger.valueOf(j).toByteArray();
        this.f36480e = 0;
    }

    public Cthis(BigInteger bigInteger) {
        this.f36481e = bigInteger.toByteArray();
        this.f36480e = 0;
    }

    public Cthis(byte[] bArr) {
        if (m4661extends(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f36481e = bArr;
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            } else {
                i = i2;
            }
        }
        this.f36480e = i;
    }

    /* renamed from: extends, reason: not valid java name */
    public static boolean m4661extends(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || AbstractC0361e.metrica("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    public static Cthis subs(Object obj) {
        if (obj == null || (obj instanceof Cthis)) {
            return (Cthis) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(obj.getClass().getName()));
        }
        try {
            return (Cthis) f36479e.m4631e((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException(AbstractC8703e.subscription(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    /* renamed from: this, reason: not valid java name */
    public static int m4662this(int i, int i2, byte[] bArr) {
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        int i3 = i2 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return i3;
            }
            i3 = (i3 << 8) | (bArr[max] & 255);
        }
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(2, z, this.f36481e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    /* renamed from: class, reason: not valid java name */
    public final boolean m4663class(int i) {
        byte[] bArr = this.f36481e;
        int length = bArr.length;
        int i2 = this.f36480e;
        return length - i2 <= 4 && m4662this(i2, -1, bArr) == i;
    }

    public final BigInteger crashlytics() {
        return new BigInteger(1, this.f36481e);
    }

    public final BigInteger firebase() {
        return new BigInteger(this.f36481e);
    }

    /* renamed from: goto, reason: not valid java name */
    public final int m4664goto() {
        byte[] bArr = this.f36481e;
        int length = bArr.length;
        int i = this.f36480e;
        int i2 = length - i;
        if (i2 > 4 || (i2 == 4 && (bArr[i] & 128) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return m4662this(i, 255, bArr);
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f36481e);
    }

    /* renamed from: interface, reason: not valid java name */
    public final boolean m4665interface(BigInteger bigInteger) {
        return bigInteger != null && m4662this(this.f36480e, -1, this.f36481e) == bigInteger.intValue() && firebase().equals(bigInteger);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof Cthis) {
            return Arrays.equals(this.f36481e, ((Cthis) cdefault).f36481e);
        }
        return false;
    }

    /* renamed from: native, reason: not valid java name */
    public final int m4666native() {
        byte[] bArr = this.f36481e;
        int length = bArr.length;
        int i = this.f36480e;
        if (length - i <= 4) {
            return m4662this(i, -1, bArr);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f36481e.length, z);
    }

    /* renamed from: throw, reason: not valid java name */
    public final long m4667throw() {
        byte[] bArr = this.f36481e;
        int length = bArr.length;
        int i = this.f36480e;
        if (length - i > 8) {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
        int length2 = bArr.length;
        int max = Math.max(i, length2 - 8);
        long j = bArr[max];
        while (true) {
            max++;
            if (max >= length2) {
                return j;
            }
            j = (j << 8) | (bArr[max] & 255);
        }
    }

    public final String toString() {
        return firebase().toString();
    }
}
