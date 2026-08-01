package defpackage;

import java.math.BigInteger;

/* renamed from: eؒۜۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1348e extends AbstractC14548e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final BigInteger f4144e;

    public C1348e(BigInteger bigInteger, C1559e c1559e) {
        super(false, c1559e);
        this.f4144e = bigInteger;
    }

    @Override // defpackage.AbstractC14548e
    public final boolean equals(Object obj) {
        return (obj instanceof C1348e) && ((C1348e) obj).f4144e.equals(this.f4144e) && super.equals(obj);
    }

    @Override // defpackage.AbstractC14548e
    public final int hashCode() {
        return this.f4144e.hashCode() ^ super.hashCode();
    }
}
