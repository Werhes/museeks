package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؒٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0787e {
    public final C4211e ad;
    public final /* synthetic */ C3847e appmetrica;
    public float license;
    public float metrica;
    public final float vip;

    public C0787e(C3847e c3847e, C4211e c4211e, float f, float f2) {
        this.appmetrica = c3847e;
        this.ad = c4211e;
        if (f2 < f) {
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        c3847e.f8507e.getClass();
        this.vip = Float.intBitsToFloat((int) (C10068e.appmetrica(c4211e, Float.POSITIVE_INFINITY) & 4294967295L));
        this.metrica = f;
        this.license = f2;
    }

    public final C6571e ad(float f) {
        float vip = AbstractC3062e.vip(f, this.metrica, this.license);
        float f2 = this.license;
        float f3 = this.metrica;
        float f4 = (vip - f3) / (f2 - f3);
        C3847e c3847e = this.appmetrica;
        C10068e c10068e = c3847e.f8507e;
        float f5 = f4 * this.vip;
        c10068e.getClass();
        C4211e c4211e = this.ad;
        float intBitsToFloat = Float.intBitsToFloat((int) (C10068e.appmetrica(c4211e, f5) >> 32));
        if (0.0f > intBitsToFloat || intBitsToFloat > 1.0f) {
            throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1");
        }
        C6571e license = c4211e.license(intBitsToFloat);
        return new C6571e(new C0787e(c3847e, (C4211e) license.f13544e, this.metrica, vip), new C0787e(c3847e, (C4211e) license.f13543e, vip, this.license));
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.metrica + " .. " + this.license + "], size=" + this.vip + ", cubic=" + this.ad + ')';
    }
}
