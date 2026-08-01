package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1252e {
    public final String ad;
    public final int vip;

    public C1252e(String str, int i) {
        this.ad = str;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1252e)) {
            return false;
        }
        C1252e c1252e = (C1252e) obj;
        return AbstractC7890e.billing(this.ad, c1252e.ad) && this.vip == c1252e.vip;
    }

    public final int hashCode() {
        return AbstractC8703e.m2467class(this.vip) + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoutingPathSegment(value=");
        sb.append(this.ad);
        sb.append(", kind=");
        int i = this.vip;
        sb.append(i != 1 ? i != 2 ? "null" : "Parameter" : "Constant");
        sb.append(')');
        return sb.toString();
    }
}
