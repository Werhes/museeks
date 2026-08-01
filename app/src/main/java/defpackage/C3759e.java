package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۦُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3759e {
    public static final C3759e metrica = new C3759e(1.0f, 0.0f);
    public final float ad;
    public final float vip;

    public C3759e(float f, float f2) {
        this.ad = f;
        this.vip = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3759e)) {
            return false;
        }
        C3759e c3759e = (C3759e) obj;
        return this.ad == c3759e.ad && this.vip == c3759e.vip;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.vip) + (Float.floatToIntBits(this.ad) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.ad);
        sb.append(", skewX=");
        return AbstractC17861e.remoteconfig(sb, this.vip, ')');
    }
}
