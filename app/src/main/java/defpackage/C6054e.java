package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۦٌ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6054e {
    public final float ad;
    public final float license;
    public final float metrica;
    public final float vip;

    public C6054e(float f, float f2, float f3, float f4) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
        if (f < 0.0f) {
            AbstractC14070e.ad("Left must be non-negative");
        }
        if (f2 < 0.0f) {
            AbstractC14070e.ad("Top must be non-negative");
        }
        if (f3 < 0.0f) {
            AbstractC14070e.ad("Right must be non-negative");
        }
        if (f4 >= 0.0f) {
            return;
        }
        AbstractC14070e.ad("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6054e)) {
            return false;
        }
        C6054e c6054e = (C6054e) obj;
        return C15765e.vip(this.ad, c6054e.ad) && C15765e.vip(this.vip, c6054e.vip) && C15765e.vip(this.metrica, c6054e.metrica) && C15765e.vip(this.license, c6054e.license);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31)) * 31) + 1231;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DpTouchBoundsExpansion(start=");
        AbstractC10257e.admob(this.ad, sb, ", top=");
        AbstractC10257e.admob(this.vip, sb, ", end=");
        AbstractC10257e.admob(this.metrica, sb, ", bottom=");
        sb.append((Object) C15765e.metrica(this.license));
        sb.append(", isLayoutDirectionAware=true)");
        return sb.toString();
    }
}
