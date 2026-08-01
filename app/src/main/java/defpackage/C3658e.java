package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕ۟ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3658e {
    public final float ad;
    public final float license;
    public final float metrica;
    public final float vip;

    public C3658e(float f, float f2, float f3, float f4) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3658e)) {
            return false;
        }
        C3658e c3658e = (C3658e) obj;
        if (C15765e.vip(this.ad, c3658e.ad) && C15765e.vip(this.vip, c3658e.vip) && C15765e.vip(this.metrica, c3658e.metrica)) {
            return C15765e.vip(this.license, c3658e.license);
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31);
    }
}
