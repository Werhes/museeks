package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16861e {
    public final Object ad;
    public final Object vip;

    public C16861e(Object obj, Object obj2) {
        this.ad = obj;
        this.vip = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16861e)) {
            return false;
        }
        C16861e c16861e = (C16861e) obj;
        return AbstractC7890e.billing(this.ad, c16861e.ad) && AbstractC7890e.billing(this.vip, c16861e.vip);
    }

    public final int hashCode() {
        Object obj = this.ad;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.vip;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.ad + ", upper=" + this.vip + ')';
    }
}
