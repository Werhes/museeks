package defpackage;

import java.math.BigInteger;

/* renamed from: eٌْؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3236e implements InterfaceC3894e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f7365e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final BigInteger f7366e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final BigInteger f7367e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final BigInteger f7368e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final BigInteger f7369e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C10165e f7370e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f7371e;

    public C3236e(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, (i != 0 && i < 160) ? i : 160, i, null, null);
    }

    public C3236e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, C10165e c10165e) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i > bigInteger.bitLength() && !AbstractC0361e.metrica("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f7369e = bigInteger2;
        this.f7367e = bigInteger;
        this.f7366e = bigInteger3;
        this.f7365e = i;
        this.f7371e = i2;
        this.f7368e = bigInteger4;
        this.f7370e = c10165e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3236e)) {
            return false;
        }
        C3236e c3236e = (C3236e) obj;
        BigInteger bigInteger = c3236e.f7366e;
        BigInteger bigInteger2 = this.f7366e;
        if (bigInteger2 != null) {
            if (!bigInteger2.equals(bigInteger)) {
                return false;
            }
        } else if (bigInteger != null) {
            return false;
        }
        return c3236e.f7367e.equals(this.f7367e) && c3236e.f7369e.equals(this.f7369e);
    }

    public final int hashCode() {
        int hashCode = this.f7367e.hashCode() ^ this.f7369e.hashCode();
        BigInteger bigInteger = this.f7366e;
        return hashCode ^ (bigInteger != null ? bigInteger.hashCode() : 0);
    }
}
