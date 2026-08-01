package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16498e {
    public final double ad;
    public final double appmetrica;
    public final double billing;
    public final double license;
    public final double metrica;
    public final double purchase;
    public final double vip;

    public /* synthetic */ C16498e(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }

    public C16498e(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.ad = d;
        this.vip = d2;
        this.metrica = d3;
        this.license = d4;
        this.appmetrica = d5;
        this.purchase = d6;
        this.billing = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16498e)) {
            return false;
        }
        C16498e c16498e = (C16498e) obj;
        return Double.compare(this.ad, c16498e.ad) == 0 && Double.compare(this.vip, c16498e.vip) == 0 && Double.compare(this.metrica, c16498e.metrica) == 0 && Double.compare(this.license, c16498e.license) == 0 && Double.compare(this.appmetrica, c16498e.appmetrica) == 0 && Double.compare(this.purchase, c16498e.purchase) == 0 && Double.compare(this.billing, c16498e.billing) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.ad);
        long doubleToLongBits2 = Double.doubleToLongBits(this.vip);
        int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        long doubleToLongBits3 = Double.doubleToLongBits(this.metrica);
        int i2 = (i + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31;
        long doubleToLongBits4 = Double.doubleToLongBits(this.license);
        int i3 = (i2 + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31;
        long doubleToLongBits5 = Double.doubleToLongBits(this.appmetrica);
        int i4 = (i3 + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31;
        long doubleToLongBits6 = Double.doubleToLongBits(this.purchase);
        int i5 = (i4 + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31;
        long doubleToLongBits7 = Double.doubleToLongBits(this.billing);
        return i5 + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.ad + ", a=" + this.vip + ", b=" + this.metrica + ", c=" + this.license + ", d=" + this.appmetrica + ", e=" + this.purchase + ", f=" + this.billing + ')';
    }
}
