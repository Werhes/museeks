package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؑ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2315e {
    public final float ad;

    public C2315e(float f) {
        this.ad = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2315e.class == obj.getClass() && this.ad == ((C2315e) obj).ad;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + AbstractC1414e.license(Float.floatToIntBits(1.0f) * 31, this.ad, 31);
    }

    public final String toString() {
        return "CardScale(scale=1.0, focusedScale=" + this.ad + ", pressedScale=1.0)";
    }
}
