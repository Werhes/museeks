package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13946e {
    public final float ad;
    public final float license;
    public final float metrica;
    public final float vip;

    public C13946e(float f, float f2, float f3, float f4) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13946e)) {
            return false;
        }
        C13946e c13946e = (C13946e) obj;
        return this.ad == c13946e.ad && this.vip == c13946e.vip && this.metrica == c13946e.metrica && this.license == c13946e.license;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.ad);
        sb.append(", focusedAlpha=");
        sb.append(this.vip);
        sb.append(", hoveredAlpha=");
        sb.append(this.metrica);
        sb.append(", pressedAlpha=");
        return AbstractC17861e.remoteconfig(sb, this.license, ')');
    }
}
