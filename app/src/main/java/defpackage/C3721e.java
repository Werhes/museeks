package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3721e {
    public final float ad;
    public final float vip;

    public C3721e(float f, float f2) {
        this.ad = f;
        this.vip = f2;
    }

    public final Comparable ad() {
        return Float.valueOf(this.vip);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3721e)) {
            return false;
        }
        if (metrica() && ((C3721e) obj).metrica()) {
            return true;
        }
        C3721e c3721e = (C3721e) obj;
        return this.ad == c3721e.ad && this.vip == c3721e.vip;
    }

    public final int hashCode() {
        if (metrica()) {
            return -1;
        }
        return Float.floatToIntBits(this.vip) + (Float.floatToIntBits(this.ad) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean license(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean metrica() {
        return this.ad > this.vip;
    }

    public final String toString() {
        return this.ad + ".." + this.vip;
    }

    public final Comparable vip() {
        return Float.valueOf(this.ad);
    }
}
