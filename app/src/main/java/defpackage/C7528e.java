package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۡۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7528e {
    public static final C7528e metrica = new C7528e(1.0f, 1.0f);
    public final float ad;
    public final float vip;

    public C7528e(float f, float f2) {
        this.ad = f;
        this.vip = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7528e.class != obj.getClass()) {
            return false;
        }
        C7528e c7528e = (C7528e) obj;
        return this.ad == c7528e.ad && this.vip == c7528e.vip;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(1.0f) * 31, this.ad, 31), 1.0f, 31), 1.0f, 31), 1.0f, 31), this.vip, 31), 1.0f, 31), 1.0f, 31), 1.0f, 31);
    }

    public final String toString() {
        return "SelectableSurfaceScale(scale=1.0, focusedScale=" + this.ad + ",pressedScale=1.0, selectedScale=1.0,disabledScale=1.0, focusedSelectedScale=" + this.vip + ", focusedDisabledScale=1.0,pressedSelectedScale=1.0, selectedDisabledScale=1.0, focusedSelectedDisabledScale=1.0)";
    }
}
