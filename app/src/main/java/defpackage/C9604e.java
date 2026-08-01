package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٝؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9604e implements InterfaceC17098e {
    public static final C1538e purchase = new C1538e();
    public final float ad;
    public final InterfaceC8707e appmetrica;
    public final float license;
    public final float metrica;
    public final float vip;

    public C9604e(float f, float f2, float f3, float f4, InterfaceC8707e interfaceC8707e) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
        this.appmetrica = interfaceC8707e;
    }

    @Override // defpackage.InterfaceC17098e
    public final C8213e ad() {
        InterfaceC8707e interfaceC8707e = this.appmetrica;
        InterfaceC8026e appmetrica = interfaceC8707e.appmetrica();
        float[] ad = interfaceC8707e.ad();
        float metrica = appmetrica.metrica(this.ad);
        float metrica2 = appmetrica.metrica(this.vip);
        float metrica3 = appmetrica.metrica(this.metrica);
        float f = (ad[2] * metrica3) + (ad[1] * metrica2) + (ad[0] * metrica);
        float f2 = (ad[5] * metrica3) + (ad[4] * metrica2) + (ad[3] * metrica);
        float f3 = (ad[8] * metrica3) + (ad[7] * metrica2) + (ad[6] * metrica);
        C8393e vip = AbstractC13336e.vip(interfaceC8707e.license());
        vip.getClass();
        return new C8213e(f, f2, f3, this.license, vip);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9604e)) {
            return false;
        }
        C9604e c9604e = (C9604e) obj;
        return Float.compare(this.ad, c9604e.ad) == 0 && Float.compare(this.vip, c9604e.vip) == 0 && Float.compare(this.metrica, c9604e.metrica) == 0 && Float.compare(this.license, c9604e.license) == 0 && AbstractC7890e.billing(this.appmetrica, c9604e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31);
    }

    public final C9604e metrica(InterfaceC8707e interfaceC8707e) {
        C7519e c7519e = C7519e.vip;
        InterfaceC8026e interfaceC8026e = c7519e.ad.metrica;
        InterfaceC8707e interfaceC8707e2 = this.appmetrica;
        if (AbstractC7890e.billing(interfaceC8707e2, interfaceC8707e)) {
            return this;
        }
        boolean billing = AbstractC7890e.billing(interfaceC8707e2, c7519e);
        float f = this.license;
        float f2 = this.metrica;
        float f3 = this.vip;
        float f4 = this.ad;
        return (billing && interfaceC8707e.equals(AbstractC0334e.vip)) ? interfaceC8707e.metrica(interfaceC8026e.metrica(f4), interfaceC8026e.metrica(f3), interfaceC8026e.metrica(f2), f) : (AbstractC7890e.billing(interfaceC8707e2, AbstractC0334e.vip) && interfaceC8707e.equals(c7519e)) ? interfaceC8707e.metrica(interfaceC8026e.purchase(f4), interfaceC8026e.purchase(f3), interfaceC8026e.purchase(f2), f) : ad().metrica(interfaceC8707e);
    }

    public final String toString() {
        return "RGB(r=" + this.ad + ", g=" + this.vip + ", b=" + this.metrica + ", alpha=" + this.license + ", space=" + this.appmetrica + ')';
    }

    @Override // defpackage.InterfaceC17098e
    public final C9604e vip() {
        return metrica(AbstractC0334e.ad);
    }
}
