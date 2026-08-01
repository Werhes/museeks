package defpackage;

/* renamed from: eٕؔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15213e extends AbstractC9027e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C3236e f30113e;

    public AbstractC15213e(boolean z, C3236e c3236e) {
        super(z);
        this.f30113e = c3236e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC15213e)) {
            return false;
        }
        C3236e c3236e = ((AbstractC15213e) obj).f30113e;
        C3236e c3236e2 = this.f30113e;
        return c3236e2 == null ? c3236e == null : c3236e2.equals(c3236e);
    }

    public int hashCode() {
        int i = !this.f18083e ? 1 : 0;
        C3236e c3236e = this.f30113e;
        return c3236e != null ? i ^ c3236e.hashCode() : i;
    }
}
