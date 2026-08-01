package defpackage;

import java.math.BigInteger;

/* renamed from: eَؖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4025e extends AbstractC15213e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final BigInteger f8950e;

    public C4025e(BigInteger bigInteger, C3236e c3236e) {
        super(true, c3236e);
        this.f8950e = bigInteger;
    }

    @Override // defpackage.AbstractC15213e
    public final boolean equals(Object obj) {
        return (obj instanceof C4025e) && ((C4025e) obj).f8950e.equals(this.f8950e) && super.equals(obj);
    }

    @Override // defpackage.AbstractC15213e
    public final int hashCode() {
        return this.f8950e.hashCode() ^ super.hashCode();
    }
}
