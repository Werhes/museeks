package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؐۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763e {
    public static final C0763e appmetrica = new C0763e(0.0f, 0.0f, 0.0f, 0.0f);
    public final float ad;
    public final float license;
    public final float metrica;
    public final float vip;

    public C0763e(float f, float f2, float f3, float f4) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
    }

    public static C0763e vip(C0763e c0763e, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = c0763e.ad;
        }
        float f4 = (i & 2) != 0 ? c0763e.vip : Float.NEGATIVE_INFINITY;
        if ((i & 4) != 0) {
            f2 = c0763e.metrica;
        }
        if ((i & 8) != 0) {
            f3 = c0763e.license;
        }
        return new C0763e(f, f4, f2, f3);
    }

    public final boolean ad(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (intBitsToFloat >= this.ad) & (intBitsToFloat < this.metrica) & (intBitsToFloat2 >= this.vip) & (intBitsToFloat2 < this.license);
    }

    public final C0763e adcel(C0763e c0763e) {
        return new C0763e(Math.max(this.ad, c0763e.ad), Math.max(this.vip, c0763e.vip), Math.min(this.metrica, c0763e.metrica), Math.min(this.license, c0763e.license));
    }

    public final boolean advert(C0763e c0763e) {
        return (this.ad < c0763e.metrica) & (c0763e.ad < this.metrica) & (this.vip < c0763e.license) & (c0763e.vip < this.license);
    }

    public final C0763e amazon(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C0763e(Float.intBitsToFloat(i) + this.ad, Float.intBitsToFloat(i2) + this.vip, Float.intBitsToFloat(i) + this.metrica, Float.intBitsToFloat(i2) + this.license);
    }

    public final long appmetrica() {
        return (Float.floatToRawIntBits(this.metrica) << 32) | (Float.floatToRawIntBits(this.license) & 4294967295L);
    }

    public final long billing() {
        float f = this.metrica - this.ad;
        float f2 = this.license - this.vip;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0763e)) {
            return false;
        }
        C0763e c0763e = (C0763e) obj;
        return Float.compare(this.ad, c0763e.ad) == 0 && Float.compare(this.vip, c0763e.vip) == 0 && Float.compare(this.metrica, c0763e.metrica) == 0 && Float.compare(this.license, c0763e.license) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31);
    }

    public final long license() {
        return (Float.floatToRawIntBits(this.ad) << 32) | (Float.floatToRawIntBits(this.license) & 4294967295L);
    }

    public final long metrica() {
        float f = this.metrica;
        float f2 = this.ad;
        return (Float.floatToRawIntBits(((f - f2) / 2.0f) + f2) << 32) | (Float.floatToRawIntBits(this.license) & 4294967295L);
    }

    public final boolean mopub() {
        return (this.ad >= this.metrica) | (this.vip >= this.license);
    }

    public final long purchase() {
        float f = this.metrica;
        float f2 = this.ad;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.license;
        float f5 = this.vip;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final C0763e smaato(float f, float f2) {
        return new C0763e(this.ad + f, this.vip + f2, this.metrica + f, this.license + f2);
    }

    public final long startapp() {
        return (Float.floatToRawIntBits(this.metrica) << 32) | (Float.floatToRawIntBits(this.vip) & 4294967295L);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC2270e.adcel(this.ad) + ", " + AbstractC2270e.adcel(this.vip) + ", " + AbstractC2270e.adcel(this.metrica) + ", " + AbstractC2270e.adcel(this.license) + ')';
    }

    public final long yandex() {
        return (Float.floatToRawIntBits(this.ad) << 32) | (Float.floatToRawIntBits(this.vip) & 4294967295L);
    }
}
