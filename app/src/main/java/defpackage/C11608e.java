package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11608e {
    public final float ad;
    public final float metrica;
    public final float vip;

    public C11608e(float f, float f2, float f3) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
    }

    public final float ad() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11608e)) {
            return false;
        }
        C11608e c11608e = (C11608e) obj;
        return Float.compare(this.ad, c11608e.ad) == 0 && Float.compare(this.vip, c11608e.vip) == 0 && Float.compare(this.metrica, c11608e.metrica) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.metrica) + AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZoomValue(zoomRatio=");
        sb.append(this.ad);
        sb.append(", minZoomRatio=");
        sb.append(this.vip);
        sb.append(", maxZoomRatio=");
        return AbstractC17861e.remoteconfig(sb, this.metrica, ')');
    }
}
