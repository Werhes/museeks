package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1426e {
    public final C17651e ad;
    public C1386e vip = null;

    public C1426e(C17651e c17651e) {
        this.ad = c17651e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1426e)) {
            return false;
        }
        C1426e c1426e = (C1426e) obj;
        return this.ad.equals(c1426e.ad) && AbstractC7890e.billing(this.vip, c1426e.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        C1386e c1386e = this.vip;
        return hashCode + (c1386e == null ? 0 : c1386e.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.ad + ", subscriber=" + this.vip + ')';
    }
}
