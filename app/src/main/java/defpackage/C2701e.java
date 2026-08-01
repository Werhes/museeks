package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2701e implements InterfaceC16490e {
    public final Object ad;
    public final Object vip;

    public C2701e(Object obj, Object obj2) {
        this.ad = obj;
        this.vip = obj2;
    }

    @Override // defpackage.InterfaceC16490e
    public final Object ad() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC16490e)) {
            return false;
        }
        InterfaceC16490e interfaceC16490e = (InterfaceC16490e) obj;
        return AbstractC7890e.billing(this.ad, interfaceC16490e.ad()) && AbstractC7890e.billing(this.vip, interfaceC16490e.metrica());
    }

    public final int hashCode() {
        Object obj = this.ad;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.vip;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // defpackage.InterfaceC16490e
    public final Object metrica() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC16490e
    public final boolean vip(Object obj, Object obj2) {
        return obj.equals(ad()) && obj2.equals(metrica());
    }
}
