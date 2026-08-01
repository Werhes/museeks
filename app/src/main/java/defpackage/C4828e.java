package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4828e {
    public final float ad;
    public final float appmetrica;
    public final float license;
    public final float metrica;
    public final float vip;

    public C4828e(float f, float f2, float f3, float f4, float f5) {
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
        if (obj == null || !(obj instanceof C4828e)) {
            return false;
        }
        C4828e c4828e = (C4828e) obj;
        return C15765e.vip(this.ad, c4828e.ad) && C15765e.vip(this.vip, c4828e.vip) && C15765e.vip(this.metrica, c4828e.metrica) && C15765e.vip(this.license, c4828e.license) && C15765e.vip(this.appmetrica, c4828e.appmetrica);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.appmetrica) + AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31);
    }
}
