package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5440e implements InterfaceC9329e {
    public final Throwable vip;

    public C5440e(Throwable th) {
        this.vip = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5440e) && AbstractC7890e.billing(this.vip, ((C5440e) obj).vip);
    }

    public final int hashCode() {
        Throwable th = this.vip;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Closed(cause=" + this.vip + ')';
    }
}
