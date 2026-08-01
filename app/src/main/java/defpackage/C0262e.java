package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؑؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262e {
    public final String ad;
    public final InterfaceC0284e vip;

    public C0262e(String str, InterfaceC0284e interfaceC0284e) {
        this.ad = str;
        this.vip = interfaceC0284e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0262e)) {
            return false;
        }
        C0262e c0262e = (C0262e) obj;
        return AbstractC7890e.billing(this.ad, c0262e.ad) && AbstractC7890e.billing(this.vip, c0262e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "WrappedCatalogHorizontalItem(id=" + this.ad + ", entry=" + this.vip + ')';
    }
}
