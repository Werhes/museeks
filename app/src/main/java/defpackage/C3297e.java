package defpackage;

import java.math.BigInteger;

/* renamed from: eِؕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3297e implements InterfaceC3894e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final BigInteger f7456e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final BigInteger f7457e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final BigInteger f7458e;

    public C3297e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f7458e = bigInteger;
        this.f7457e = bigInteger2;
        this.f7456e = bigInteger3;
    }

    public C3297e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        this.f7456e = bigInteger3;
        this.f7458e = bigInteger;
        this.f7457e = bigInteger2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3297e)) {
            return false;
        }
        C3297e c3297e = (C3297e) obj;
        return c3297e.f7458e.equals(this.f7458e) && c3297e.f7457e.equals(this.f7457e) && c3297e.f7456e.equals(this.f7456e);
    }

    public final int hashCode() {
        return (this.f7458e.hashCode() ^ this.f7457e.hashCode()) ^ this.f7456e.hashCode();
    }
}
