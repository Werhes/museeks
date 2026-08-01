package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6761e {
    public final float ad;
    public boolean appmetrica = false;
    public float license;
    public float metrica;
    public final float vip;

    public C6761e(float f, float f2, float f3, float f4) {
        this.metrica = 0.0f;
        this.license = 0.0f;
        this.ad = f;
        this.vip = f2;
        double sqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (sqrt != 0.0d) {
            this.metrica = (float) (f3 / sqrt);
            this.license = (float) (f4 / sqrt);
        }
    }

    public final void ad(float f, float f2) {
        float f3 = f - this.ad;
        float f4 = f2 - this.vip;
        double sqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (sqrt != 0.0d) {
            f3 = (float) (f3 / sqrt);
            f4 = (float) (f4 / sqrt);
        }
        float f5 = this.metrica;
        if (f3 != (-f5) || f4 != (-this.license)) {
            this.metrica = f5 + f3;
            this.license += f4;
        } else {
            this.appmetrica = true;
            this.metrica = -f4;
            this.license = f3;
        }
    }

    public final String toString() {
        return "(" + this.ad + "," + this.vip + " " + this.metrica + "," + this.license + ")";
    }

    public final void vip(C6761e c6761e) {
        float f = c6761e.metrica;
        float f2 = this.metrica;
        if (f == (-f2)) {
            float f3 = c6761e.license;
            if (f3 == (-this.license)) {
                this.appmetrica = true;
                this.metrica = -f3;
                this.license = c6761e.metrica;
                return;
            }
        }
        this.metrica = f2 + f;
        this.license += c6761e.license;
    }
}
