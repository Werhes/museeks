package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؒۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2326e {
    public double ad;
    public final C18211e adcel;
    public double appmetrica;
    public double billing;
    public double license;
    public boolean metrica;
    public double purchase;
    public double startapp;
    public double vip;
    public double yandex;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, eٛٔ] */
    public C2326e() {
        this.ad = Math.sqrt(1500.0d);
        this.vip = 0.5d;
        this.metrica = false;
        this.startapp = Double.MAX_VALUE;
        this.adcel = new Object();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, eٛٔ] */
    public C2326e(float f) {
        this.ad = Math.sqrt(1500.0d);
        this.vip = 0.5d;
        this.metrica = false;
        this.adcel = new Object();
        this.startapp = f;
    }

    public final void ad(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.vip = f;
        this.metrica = false;
    }

    public final C18211e metrica(double d, double d2, long j) {
        double sin;
        double cos;
        if (!this.metrica) {
            if (this.startapp == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.vip;
            if (d3 > 1.0d) {
                double d4 = this.ad;
                this.purchase = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.vip;
                double d6 = this.ad;
                this.billing = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.yandex = Math.sqrt(1.0d - (d3 * d3)) * this.ad;
            }
            this.metrica = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.startapp;
        double d9 = this.vip;
        if (d9 > 1.0d) {
            double d10 = this.billing;
            double d11 = ((d10 * d8) - d2) / (d10 - this.purchase);
            double d12 = d8 - d11;
            sin = (Math.pow(2.718281828459045d, this.purchase * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.billing;
            double pow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.purchase;
            cos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + pow;
        } else if (d9 == 1.0d) {
            double d15 = this.ad;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double pow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double pow3 = Math.pow(2.718281828459045d, (-this.ad) * d7) * d17;
            double d18 = -this.ad;
            cos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (pow3 * d18);
            sin = pow2;
        } else {
            double d19 = 1.0d / this.yandex;
            double d20 = this.ad;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            sin = ((Math.sin(this.yandex * d7) * d21) + (Math.cos(this.yandex * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.ad;
            double d23 = this.vip;
            double d24 = (-d22) * sin * d23;
            double pow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.yandex;
            double sin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.yandex;
            cos = (((Math.cos(d26 * d7) * d21 * d26) + sin2) * pow4) + d24;
        }
        float f = (float) (sin + this.startapp);
        C18211e c18211e = this.adcel;
        c18211e.f35653e = f;
        c18211e.f35652e = (float) cos;
        return c18211e;
    }

    public final void vip(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.ad = Math.sqrt(f);
        this.metrica = false;
    }
}
