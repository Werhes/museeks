package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8213e implements InterfaceC17098e {
    public final float ad;
    public final C8393e appmetrica;
    public final float license;
    public final float metrica;
    public final float vip;

    static {
        C8393e c8393e = AbstractC9700e.ad;
    }

    public C8213e(float f, float f2, float f3, float f4, C8393e c8393e) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
        this.appmetrica = c8393e;
    }

    @Override // defpackage.InterfaceC17098e
    public final C8213e ad() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8213e)) {
            return false;
        }
        C8213e c8213e = (C8213e) obj;
        return Float.compare(this.ad, c8213e.ad) == 0 && Float.compare(this.vip, c8213e.vip) == 0 && Float.compare(this.metrica, c8213e.metrica) == 0 && Float.compare(this.license, c8213e.license) == 0 && this.appmetrica.equals(c8213e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.ad.hashCode() + AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31);
    }

    public final C9604e metrica(InterfaceC8707e interfaceC8707e) {
        char c;
        char c2;
        C8213e c8213e;
        char c3;
        C8393e vip = AbstractC13336e.vip(interfaceC8707e.license());
        float[] fArr = AbstractC12149e.ad;
        float[] fArr2 = AbstractC12149e.vip;
        C6674e c6674e = vip.ad;
        C6674e c6674e2 = this.appmetrica.ad;
        if (AbstractC7890e.billing(c6674e, c6674e2)) {
            c8213e = this;
            c3 = 0;
            c = '\b';
            c2 = 7;
        } else {
            C17580e c17580e = c6674e2.vip;
            C17580e c17580e2 = c6674e.vip;
            float f = c17580e.ad;
            c = '\b';
            float f2 = c17580e.metrica;
            c2 = 7;
            float[] mopub = AbstractC7518e.mopub((f * f2) / c17580e.vip, f2, c17580e.ad(), fArr);
            float f3 = c17580e2.ad;
            float f4 = c17580e2.metrica;
            float[] mopub2 = AbstractC7518e.mopub((f3 * f4) / c17580e2.vip, f4, c17580e2.ad(), fArr);
            float[] advert = AbstractC7518e.advert(mopub2[0] / mopub[0], mopub2[1] / mopub[1], mopub2[2] / mopub[2], fArr2);
            float[] fArr3 = {AbstractC7518e.smaato(0, 0, advert, fArr), AbstractC7518e.smaato(1, 0, advert, fArr), AbstractC7518e.smaato(2, 0, advert, fArr), AbstractC7518e.smaato(0, 1, advert, fArr), AbstractC7518e.smaato(1, 1, advert, fArr), AbstractC7518e.smaato(2, 1, advert, fArr), AbstractC7518e.smaato(0, 2, advert, fArr), AbstractC7518e.smaato(1, 2, advert, fArr), AbstractC7518e.smaato(2, 2, advert, fArr)};
            float f5 = fArr3[0];
            float f6 = this.ad;
            float f7 = fArr3[1];
            float f8 = this.vip;
            float f9 = (f7 * f8) + (f5 * f6);
            float f10 = fArr3[2];
            float f11 = this.metrica;
            c3 = 0;
            c8213e = new C8213e((f10 * f11) + f9, (fArr3[5] * f11) + (fArr3[4] * f8) + (fArr3[3] * f6), (fArr3[8] * f11) + (fArr3[7] * f8) + (fArr3[6] * f6), this.license, vip);
        }
        InterfaceC8026e appmetrica = interfaceC8707e.appmetrica();
        float[] vip2 = interfaceC8707e.vip();
        float f12 = vip2[c3];
        float f13 = c8213e.ad;
        float f14 = vip2[1];
        float f15 = c8213e.vip;
        float f16 = (f14 * f15) + (f12 * f13);
        float f17 = vip2[2];
        float f18 = c8213e.metrica;
        return interfaceC8707e.metrica(appmetrica.purchase((f17 * f18) + f16), appmetrica.purchase((vip2[5] * f18) + (vip2[4] * f15) + (vip2[3] * f13)), appmetrica.purchase((vip2[c] * f18) + (vip2[c2] * f15) + (vip2[6] * f13)), this.license);
    }

    public final String toString() {
        return "XYZ(x=" + this.ad + ", y=" + this.vip + ", z=" + this.metrica + ", alpha=" + this.license + ", space=" + this.appmetrica + ')';
    }

    @Override // defpackage.InterfaceC17098e
    public final C9604e vip() {
        return metrica(AbstractC0334e.ad);
    }
}
