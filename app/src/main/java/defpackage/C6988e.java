package defpackage;

import java.math.BigInteger;

/* renamed from: eؚؚؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6988e extends AbstractC3903e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final BigInteger f14315e;

    public C6988e(BigInteger bigInteger, C16833e c16833e) {
        super(true, c16833e);
        if (bigInteger == null) {
            throw new NullPointerException("Scalar cannot be null");
        }
        if (bigInteger.compareTo(InterfaceC4563e.Signature) < 0 || bigInteger.compareTo(c16833e.f32974e) >= 0) {
            throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
        this.f14315e = bigInteger;
    }
}
