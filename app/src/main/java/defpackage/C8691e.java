package defpackage;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;

/* renamed from: eٌّٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8691e extends DHParameterSpec {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f17532e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final BigInteger f17533e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C10165e f17534e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final BigInteger f17535e;

    public C8691e(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(bigInteger, bigInteger3, i2);
        this.f17535e = bigInteger2;
        this.f17533e = bigInteger4;
        this.f17532e = i;
    }

    public C8691e(C3236e c3236e) {
        this(c3236e.f7365e, c3236e.f7371e, c3236e.f7367e, c3236e.f7366e, c3236e.f7369e, c3236e.f7368e);
        this.f17534e = c3236e.f7370e;
    }

    public final C3236e ad() {
        return new C3236e(getP(), getG(), this.f17535e, this.f17532e, getL(), this.f17533e, this.f17534e);
    }
}
