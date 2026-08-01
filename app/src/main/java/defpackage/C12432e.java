package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّّؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12432e {
    public final Object ad;
    public final EnumC10854e vip;

    public C12432e(Object obj, EnumC10854e enumC10854e) {
        this.ad = obj;
        this.vip = enumC10854e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12432e)) {
            return false;
        }
        C12432e c12432e = (C12432e) obj;
        return AbstractC7890e.billing(this.ad, c12432e.ad) && this.vip == c12432e.vip;
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleChildNavState(configuration=" + this.ad + ", status=" + this.vip + ')';
    }
}
