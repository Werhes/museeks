package defpackage;

/* renamed from: eؘٔۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14548e extends AbstractC9027e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C1559e f28756e;

    public AbstractC14548e(boolean z, C1559e c1559e) {
        super(z);
        this.f28756e = c1559e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC14548e)) {
            return false;
        }
        C1559e c1559e = ((AbstractC14548e) obj).f28756e;
        C1559e c1559e2 = this.f28756e;
        return c1559e2 == null ? c1559e == null : c1559e2.equals(c1559e);
    }

    public int hashCode() {
        C1559e c1559e = this.f28756e;
        if (c1559e != null) {
            return c1559e.hashCode();
        }
        return 0;
    }
}
