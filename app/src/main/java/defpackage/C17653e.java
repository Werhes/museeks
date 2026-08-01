package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٜ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17653e {
    public static final C17653e metrica = new C17653e(0, null);
    public final int ad;
    public final C0632e vip;

    public C17653e(int i, C0632e c0632e) {
        this.ad = i;
        this.vip = c0632e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17653e)) {
            return false;
        }
        C17653e c17653e = (C17653e) obj;
        return this.ad == c17653e.ad && AbstractC7890e.billing(this.vip, c17653e.vip);
    }

    public final int hashCode() {
        int i = this.ad;
        int m2467class = (i == 0 ? 0 : AbstractC8703e.m2467class(i)) * 31;
        C0632e c0632e = this.vip;
        return m2467class + (c0632e != null ? c0632e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmTypeProjection(variance=");
        int i = this.ad;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "OUT" : "IN" : "INVARIANT");
        sb.append(", type=");
        sb.append(this.vip);
        sb.append(')');
        return sb.toString();
    }
}
