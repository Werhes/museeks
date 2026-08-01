package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113e implements InterfaceC10819e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16320e f1261e;

    public C0113e(C16320e c16320e) {
        this.f1261e = c16320e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0113e) && AbstractC7890e.billing(this.f1261e, ((C0113e) obj).f1261e);
    }

    public final int hashCode() {
        return this.f1261e.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.f1261e + ")";
    }

    @Override // defpackage.InterfaceC10819e
    public final Object vip(AbstractC10731e abstractC10731e) {
        return this.f1261e;
    }
}
