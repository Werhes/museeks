package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9220e {
    public final float ad;
    public final float appmetrica;
    public final float license;
    public final float metrica;
    public final float purchase;
    public final float vip;

    public C9220e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
        this.appmetrica = f5;
        this.purchase = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C9220e)) {
            return false;
        }
        C9220e c9220e = (C9220e) obj;
        return C15765e.vip(this.ad, c9220e.ad) && C15765e.vip(this.vip, c9220e.vip) && C15765e.vip(this.metrica, c9220e.metrica) && C15765e.vip(this.license, c9220e.license) && C15765e.vip(this.purchase, c9220e.purchase);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.purchase) + AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31);
    }
}
