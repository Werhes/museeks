package defpackage;

import java.math.BigInteger;

/* renamed from: eؙۧۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6818e implements InterfaceC3894e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final BigInteger f14046e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final BigInteger f14047e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C4678e f14048e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final BigInteger f14049e;

    public C6818e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f14049e = bigInteger3;
        this.f14046e = bigInteger;
        this.f14047e = bigInteger2;
    }

    public C6818e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, C4678e c4678e) {
        this.f14049e = bigInteger3;
        this.f14046e = bigInteger;
        this.f14047e = bigInteger2;
        this.f14048e = c4678e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6818e)) {
            return false;
        }
        C6818e c6818e = (C6818e) obj;
        return c6818e.f14046e.equals(this.f14046e) && c6818e.f14047e.equals(this.f14047e) && c6818e.f14049e.equals(this.f14049e);
    }

    public final int hashCode() {
        return (this.f14046e.hashCode() ^ this.f14047e.hashCode()) ^ this.f14049e.hashCode();
    }
}
