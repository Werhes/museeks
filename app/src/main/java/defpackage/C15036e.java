package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15036e {
    public static final C11883e appmetrica = AbstractC9743e.startapp(C8082e.f16415e, C14865e.f29433e);
    public final float ad;
    public final float license;
    public final float metrica;
    public final float vip;

    public C15036e(float f, float f2, float f3, float f4) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
    }

    public static C15036e ad(C15036e c15036e, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = c15036e.ad;
        }
        if ((i & 2) != 0) {
            f2 = c15036e.vip;
        }
        if ((i & 4) != 0) {
            f3 = c15036e.metrica;
        }
        if ((i & 8) != 0) {
            f4 = c15036e.license;
        }
        c15036e.getClass();
        return new C15036e(f, f2, f3, f4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15036e)) {
            return false;
        }
        C15036e c15036e = (C15036e) obj;
        return Float.compare(this.ad, c15036e.ad) == 0 && Float.compare(this.vip, c15036e.vip) == 0 && Float.compare(this.metrica, c15036e.metrica) == 0 && Float.compare(this.license, c15036e.license) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31);
    }

    public final String toString() {
        return "HsvColor(hue=" + this.ad + ", saturation=" + this.vip + ", value=" + this.metrica + ", alpha=" + this.license + ")";
    }

    public final long vip() {
        C9604e vip = new C11236e(this.ad, this.vip, this.metrica, this.license).vip();
        float f = 255;
        int appmetrica2 = AbstractC1561e.appmetrica(vip.ad * f);
        int appmetrica3 = AbstractC1561e.appmetrica(vip.vip * f);
        int appmetrica4 = AbstractC1561e.appmetrica(vip.metrica * f);
        float f2 = vip.license;
        if (Float.isNaN(f2)) {
            f2 = 1.0f;
        }
        return AbstractC6532e.metrica(appmetrica2, appmetrica3, appmetrica4, AbstractC1561e.appmetrica(f2 * f));
    }
}
