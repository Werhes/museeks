package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2359e {
    public final /* synthetic */ int ad;
    public float appmetrica;
    public float license;
    public float metrica;
    public float vip;

    public C2359e() {
        this.ad = 0;
        this.vip = 0.0f;
        this.metrica = 0.0f;
        this.license = 0.0f;
        this.appmetrica = 0.0f;
    }

    public C2359e(float f, float f2, float f3, float f4) {
        this.ad = 1;
        this.vip = f;
        this.metrica = f2;
        this.license = f3;
        this.appmetrica = f4;
    }

    public C2359e(C2359e c2359e) {
        this.ad = 1;
        this.vip = c2359e.vip;
        this.metrica = c2359e.metrica;
        this.license = c2359e.license;
        this.appmetrica = c2359e.appmetrica;
    }

    public void ad(float f, float f2, float f3, float f4) {
        this.vip = Math.max(f, this.vip);
        this.metrica = Math.max(f2, this.metrica);
        this.license = Math.min(f3, this.license);
        this.appmetrica = Math.min(f4, this.appmetrica);
    }

    public void appmetrica(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.vip += intBitsToFloat;
        this.metrica += intBitsToFloat2;
        this.license += intBitsToFloat;
        this.appmetrica += intBitsToFloat2;
    }

    public float license() {
        return this.metrica + this.appmetrica;
    }

    public float metrica() {
        return this.vip + this.license;
    }

    public final String toString() {
        switch (this.ad) {
            case 0:
                return "MutableRect(" + AbstractC2270e.adcel(this.vip) + ", " + AbstractC2270e.adcel(this.metrica) + ", " + AbstractC2270e.adcel(this.license) + ", " + AbstractC2270e.adcel(this.appmetrica) + ')';
            default:
                return "[" + this.vip + " " + this.metrica + " " + this.license + " " + this.appmetrica + "]";
        }
    }

    public boolean vip() {
        return (this.vip >= this.license) | (this.metrica >= this.appmetrica);
    }
}
