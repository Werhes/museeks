package defpackage;

import java.math.BigInteger;

/* renamed from: eؒۥۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1457e extends AbstractC14548e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final BigInteger f4295e;

    public C1457e(BigInteger bigInteger, C1559e c1559e) {
        super(true, c1559e);
        this.f4295e = bigInteger;
    }

    @Override // defpackage.AbstractC14548e
    public final boolean equals(Object obj) {
        if ((obj instanceof C1457e) && ((C1457e) obj).f4295e.equals(this.f4295e)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.AbstractC14548e
    public final int hashCode() {
        return this.f4295e.hashCode();
    }
}
