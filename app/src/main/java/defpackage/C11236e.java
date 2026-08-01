package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۙۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11236e implements InterfaceC17098e {
    public final float ad;
    public final float license;
    public final float metrica;
    public final float vip;

    static {
        C14914e c14914e = AbstractC12029e.ad;
        C1169e license = AbstractC6874e.license();
        for (int i = 0; i < 3; i++) {
            char charAt = "HSV".charAt(i);
            String.valueOf(charAt);
            license.add(new C14914e(charAt == 'H' ? 360.0f : 1.0f));
        }
        license.add(AbstractC12029e.ad);
        AbstractC6874e.metrica(license);
    }

    public C11236e(float f, float f2, float f3, float f4) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
    }

    public static final float metrica(double d, double d2, double d3, int i) {
        double d4 = (i + d) % 6;
        double d5 = d3 * d2;
        double min = Math.min(d4, Math.min(4 - d4, 1.0d));
        if (min < 0.0d) {
            min = 0.0d;
        }
        return (float) (d2 - (d5 * min));
    }

    @Override // defpackage.InterfaceC17098e
    public final C8213e ad() {
        return vip().ad();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11236e)) {
            return false;
        }
        C11236e c11236e = (C11236e) obj;
        return Float.compare(this.ad, c11236e.ad) == 0 && Float.compare(this.vip, c11236e.vip) == 0 && Float.compare(this.metrica, c11236e.metrica) == 0 && Float.compare(this.license, c11236e.license) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HSV(h=");
        sb.append(this.ad);
        sb.append(", s=");
        sb.append(this.vip);
        sb.append(", v=");
        sb.append(this.metrica);
        sb.append(", alpha=");
        return AbstractC17861e.remoteconfig(sb, this.license, ')');
    }

    @Override // defpackage.InterfaceC17098e
    public final C9604e vip() {
        boolean isNaN = Float.isNaN(this.ad);
        float f = this.license;
        float f2 = this.metrica;
        if (!isNaN) {
            float f3 = this.vip;
            if (!Float.isNaN(f3)) {
                double d = f3;
                if (d >= 1.0E-7d) {
                    double d2 = f2;
                    double d3 = (((r0 % 360.0f) + 360.0f) % 360.0f) / 60.0d;
                    return C7519e.vip.metrica(metrica(d3, d2, d, 5), metrica(d3, d2, d, 3), metrica(d3, d2, d, 1), f);
                }
            }
        }
        return C9604e.purchase.metrica(f2, f2, f2, f);
    }
}
