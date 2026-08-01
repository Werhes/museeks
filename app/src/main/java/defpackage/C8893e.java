package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8893e {
    public final C12025e ad;
    public final Object vip;

    public C8893e(C12025e c12025e, Object obj) {
        this.ad = c12025e;
        this.vip = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8893e)) {
            return false;
        }
        C8893e c8893e = (C8893e) obj;
        return AbstractC7890e.billing(this.ad, c8893e.ad) && AbstractC7890e.billing(this.vip, c8893e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.ad + ", response=" + this.vip + ')';
    }
}
