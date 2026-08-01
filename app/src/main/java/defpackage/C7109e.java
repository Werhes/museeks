package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7109e {
    public final double ad;
    public final double license;
    public final double metrica;
    public final double vip;

    public C7109e(double d, double d2, double d3, double d4) {
        this.ad = d;
        this.vip = d2;
        this.metrica = d3;
        this.license = d4;
    }

    public final double ad(double d) {
        double d2;
        double d3;
        double d4;
        double d5 = this.ad;
        if (d <= -1.0d) {
            return d5;
        }
        double d6 = this.vip;
        if (d < 0.0d) {
            d2 = (d - (-1)) / 1;
            d3 = (1.0d - d2) * d5;
        } else {
            double d7 = this.metrica;
            if (d < 0.5d) {
                double d8 = (d - 0) / 0.5d;
                d3 = (1.0d - d8) * d6;
                d4 = d8 * d7;
                return d4 + d3;
            }
            d6 = this.license;
            if (d >= 1.0d) {
                return d6;
            }
            d2 = (d - 0.5d) / 0.5d;
            d3 = (1.0d - d2) * d7;
        }
        d4 = d2 * d6;
        return d4 + d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7109e)) {
            return false;
        }
        C7109e c7109e = (C7109e) obj;
        return Double.compare(this.ad, c7109e.ad) == 0 && Double.compare(this.vip, c7109e.vip) == 0 && Double.compare(this.metrica, c7109e.metrica) == 0 && Double.compare(this.license, c7109e.license) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.ad);
        long doubleToLongBits2 = Double.doubleToLongBits(this.vip);
        int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        long doubleToLongBits3 = Double.doubleToLongBits(this.metrica);
        int i2 = (i + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31;
        long doubleToLongBits4 = Double.doubleToLongBits(this.license);
        return i2 + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }

    public final String toString() {
        return "ContrastCurve(low=" + this.ad + ", normal=" + this.vip + ", medium=" + this.metrica + ", high=" + this.license + ")";
    }
}
