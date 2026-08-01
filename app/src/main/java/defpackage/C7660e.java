package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7660e {
    public final int ad;
    public final int vip;

    public C7660e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7660e)) {
            return false;
        }
        C7660e c7660e = (C7660e) obj;
        return this.ad == c7660e.ad && this.vip == c7660e.vip;
    }

    public final int hashCode() {
        return AbstractC8703e.m2467class(this.vip) + (AbstractC8703e.m2467class(this.ad) * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + AbstractC5087e.m1748implements(this.ad) + ", height=" + AbstractC5087e.m1748implements(this.vip) + ')';
    }
}
