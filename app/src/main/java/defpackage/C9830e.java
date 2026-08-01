package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۢؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9830e {
    public final boolean ad;
    public final InterfaceC8346e metrica;
    public final boolean vip;

    public /* synthetic */ C9830e() {
        this(true, true, C10327e.f20377e);
    }

    public C9830e(boolean z, boolean z2, InterfaceC8346e interfaceC8346e) {
        this.ad = z;
        this.vip = z2;
        this.metrica = interfaceC8346e;
    }

    public static C9830e ad(C9830e c9830e, InterfaceC8346e interfaceC8346e) {
        boolean z = c9830e.ad;
        boolean z2 = c9830e.vip;
        c9830e.getClass();
        return new C9830e(z, z2, interfaceC8346e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9830e)) {
            return false;
        }
        C9830e c9830e = (C9830e) obj;
        return this.ad == c9830e.ad && this.vip == c9830e.vip && AbstractC7890e.billing(this.metrica, c9830e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((((this.ad ? 1231 : 1237) * 31) + (this.vip ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "OrionResponse(isLoading=" + this.ad + ", isEmpty=" + this.vip + ", data=" + this.metrica + ')';
    }
}
