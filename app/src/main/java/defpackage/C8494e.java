package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8494e {
    public final Float ad;
    public InterfaceC17838e vip;

    public C8494e(Float f, InterfaceC17838e interfaceC17838e) {
        this.ad = f;
        this.vip = interfaceC17838e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8494e)) {
            return false;
        }
        C8494e c8494e = (C8494e) obj;
        return c8494e.ad.equals(this.ad) && AbstractC7890e.billing(c8494e.vip, this.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 961);
    }
}
