package defpackage;

import java.math.BigInteger;

/* renamed from: eؓؓۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1559e implements InterfaceC3894e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f4437e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final BigInteger f4438e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final BigInteger f4439e;

    public C1559e(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        this.f4439e = bigInteger2;
        this.f4438e = bigInteger;
        this.f4437e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1559e)) {
            return false;
        }
        C1559e c1559e = (C1559e) obj;
        return c1559e.f4438e.equals(this.f4438e) && c1559e.f4439e.equals(this.f4439e) && c1559e.f4437e == this.f4437e;
    }

    public final int hashCode() {
        return (this.f4438e.hashCode() ^ this.f4439e.hashCode()) + this.f4437e;
    }
}
