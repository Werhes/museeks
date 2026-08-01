package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13789e implements InterfaceC17838e {
    public final float ad;
    public final float appmetrica;
    public final float license;
    public final float metrica;
    public final float purchase;
    public final float vip;

    public C13789e(float f, float f2, float f3, float f4) {
        int purchase;
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            AbstractC2878e.ad("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.');
        }
        float[] fArr = new float[5];
        float f5 = (f2 - 0.0f) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            purchase = d2 == d3 ? 0 : AbstractC13350e.purchase((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int purchase2 = AbstractC13350e.purchase((float) ((-(d6 + d7)) / d5), fArr, 0);
            purchase = AbstractC13350e.purchase((float) ((d6 - d7) / d5), fArr, purchase2) + purchase2;
            if (purchase > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    purchase--;
                }
            }
        }
        float f10 = (f6 - f5) * 2.0f;
        int purchase3 = AbstractC13350e.purchase((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, purchase) + purchase;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i = 0; i < purchase3; i++) {
            float f11 = fArr[i];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - 0.0f) * f11) + (((f4 - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f11) + f5) * f11) + 0.0f;
            min = Math.min(min, f12);
            max = Math.max(max, f12);
        }
        long ad = C9268e.ad(min, max);
        this.appmetrica = Float.intBitsToFloat((int) (ad >> 32));
        this.purchase = Float.intBitsToFloat((int) (ad & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0206, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0236, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0261  */
    @Override // defpackage.InterfaceC17838e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float ad(float r27) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13789e.ad(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13789e)) {
            return false;
        }
        C13789e c13789e = (C13789e) obj;
        return this.ad == c13789e.ad && this.vip == c13789e.vip && this.metrica == c13789e.metrica && this.license == c13789e.license;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.ad);
        sb.append(", b=");
        sb.append(this.vip);
        sb.append(", c=");
        sb.append(this.metrica);
        sb.append(", d=");
        return AbstractC17861e.remoteconfig(sb, this.license, ')');
    }
}
