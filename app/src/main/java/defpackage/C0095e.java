package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095e {
    public final float ad;
    public final float appmetrica;
    public final float license;
    public final float metrica;
    public final float vip;

    public C0095e(float f, float f2, float f3, float f4, float f5) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
        this.appmetrica = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0095e.class == obj.getClass()) {
            C0095e c0095e = (C0095e) obj;
            if (this.ad == c0095e.ad && this.vip == c0095e.vip && this.metrica == c0095e.metrica && this.license == c0095e.license && this.appmetrica == c0095e.appmetrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.appmetrica) + AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickableSurfaceScale(scale=");
        sb.append(this.ad);
        sb.append(", focusedScale=");
        sb.append(this.vip);
        sb.append(",pressedScale=");
        sb.append(this.metrica);
        sb.append(", disabledScale=");
        sb.append(this.license);
        sb.append(", focusedDisabledScale=");
        return AbstractC17861e.remoteconfig(sb, this.appmetrica, ')');
    }
}
