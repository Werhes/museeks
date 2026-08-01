package defpackage;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: eٍۧؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9918e implements AlgorithmParameterSpec {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final BigInteger f19575e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC9932e f19576e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f19577e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final BigInteger f19578e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC0362e f19579e;

    public C9918e(AbstractC0362e abstractC0362e, AbstractC9932e abstractC9932e, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f19579e = abstractC0362e;
        this.f19576e = abstractC9932e.Signature();
        this.f19578e = bigInteger;
        this.f19575e = bigInteger2;
        this.f19577e = bArr;
    }

    public C9918e(C13022e c13022e, AbstractC9932e abstractC9932e, BigInteger bigInteger) {
        this.f19579e = c13022e;
        this.f19576e = abstractC9932e.Signature();
        this.f19578e = bigInteger;
        this.f19575e = BigInteger.valueOf(1L);
        this.f19577e = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9918e)) {
            return false;
        }
        C9918e c9918e = (C9918e) obj;
        return this.f19579e.startapp(c9918e.f19579e) && this.f19576e.license(c9918e.f19576e);
    }

    public final int hashCode() {
        return this.f19579e.hashCode() ^ this.f19576e.hashCode();
    }
}
