package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3601e implements InterfaceC16154e {
    public final float ad;
    public final float vip;

    public C3601e(float f, float f2) {
        this.ad = f;
        this.vip = f2;
    }

    @Override // defpackage.InterfaceC16154e
    public final AbstractC14073e ad(long j, EnumC7792e enumC7792e, InterfaceC14388e interfaceC14388e) {
        C17985e ad = AbstractC11972e.ad();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        ad.purchase(Float.intBitsToFloat(i) * 0.99f, Float.intBitsToFloat(i2) * 0.01f);
        float mo497instanceof = interfaceC14388e.mo497instanceof(this.vip);
        float mo497instanceof2 = interfaceC14388e.mo497instanceof(this.ad);
        float f = 2;
        float f2 = mo497instanceof2 / f;
        float intBitsToFloat = Float.intBitsToFloat(i) * 0.99f;
        float intBitsToFloat2 = (Float.intBitsToFloat(i2) * 0.01f) + mo497instanceof;
        float intBitsToFloat3 = (Float.intBitsToFloat(i) * 0.99f) - (Float.intBitsToFloat(i) * 0.01f);
        float f3 = intBitsToFloat3 / mo497instanceof2;
        float floor = (float) Math.floor(f3);
        if (f3 != floor) {
            f2 = (intBitsToFloat3 / floor) / f;
        }
        float f4 = intBitsToFloat2 - mo497instanceof;
        ad.appmetrica(intBitsToFloat - f2, f4);
        for (int i3 = 1; i3 < floor; i3++) {
            intBitsToFloat = (intBitsToFloat - f2) - f2;
            ad.appmetrica(intBitsToFloat, f4);
            ad.appmetrica(intBitsToFloat - f2, f4);
        }
        ad.appmetrica((intBitsToFloat - f2) - f2, f4);
        ad.appmetrica(Float.intBitsToFloat(i) * 0.01f, Float.intBitsToFloat(i2) * 0.99f);
        float intBitsToFloat4 = (Float.intBitsToFloat(i2) * 0.99f) - mo497instanceof;
        float intBitsToFloat5 = Float.intBitsToFloat(i) * 0.01f;
        float f5 = intBitsToFloat4 + mo497instanceof;
        ad.appmetrica(intBitsToFloat5, f5);
        float f6 = intBitsToFloat4 - mo497instanceof;
        ad.appmetrica(intBitsToFloat5 + f2, f6);
        for (int i4 = 1; i4 < floor; i4++) {
            intBitsToFloat5 = intBitsToFloat5 + f2 + f2;
            ad.appmetrica(intBitsToFloat5, f5);
            ad.appmetrica(intBitsToFloat5 + f2, f6);
        }
        ad.appmetrica(intBitsToFloat5 + f2 + f2, f5);
        ad.vip();
        return new C10435e(ad);
    }
}
