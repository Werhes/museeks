package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8226e {
    public final float ad;
    public final float license;
    public final float metrica;
    public final int vip;

    public C8226e(float f, float f2, float f3, int i) {
        this.ad = f;
        this.vip = i;
        this.metrica = f2;
        this.license = f3;
        if (0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException("The 'progress' argument must be between 0 and 1 (both inclusive)");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8226e)) {
            return false;
        }
        C8226e c8226e = (C8226e) obj;
        return Float.compare(this.ad, c8226e.ad) == 0 && this.vip == c8226e.vip && Float.compare(this.metrica, c8226e.metrica) == 0 && Float.compare(this.license, c8226e.license) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1786e.mopub(this.vip, Float.floatToIntBits(this.ad) * 31, 31), this.metrica, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEvent(progress=");
        sb.append(this.ad);
        sb.append(", swipeEdge=");
        int i = this.vip;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "RIGHT" : "LEFT" : "UNKNOWN");
        sb.append(", touchX=");
        sb.append(this.metrica);
        sb.append(", touchY=");
        return AbstractC17861e.remoteconfig(sb, this.license, ')');
    }
}
