package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8683e extends AbstractC3424e {
    public float ad;
    public float license;
    public float metrica;
    public float vip;

    public C8683e(float f, float f2, float f3, float f4) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
    }

    @Override // defpackage.AbstractC3424e
    public final float ad(int i) {
        if (i == 0) {
            return this.ad;
        }
        if (i == 1) {
            return this.vip;
        }
        if (i == 2) {
            return this.metrica;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.license;
    }

    @Override // defpackage.AbstractC3424e
    public final void appmetrica(int i, float f) {
        if (i == 0) {
            this.ad = f;
            return;
        }
        if (i == 1) {
            this.vip = f;
        } else if (i == 2) {
            this.metrica = f;
        } else {
            if (i != 3) {
                return;
            }
            this.license = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8683e)) {
            return false;
        }
        C8683e c8683e = (C8683e) obj;
        return c8683e.ad == this.ad && c8683e.vip == this.vip && c8683e.metrica == this.metrica && c8683e.license == this.license;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31);
    }

    @Override // defpackage.AbstractC3424e
    public final void license() {
        this.ad = 0.0f;
        this.vip = 0.0f;
        this.metrica = 0.0f;
        this.license = 0.0f;
    }

    @Override // defpackage.AbstractC3424e
    public final AbstractC3424e metrica() {
        return new C8683e(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.ad + ", v2 = " + this.vip + ", v3 = " + this.metrica + ", v4 = " + this.license;
    }

    @Override // defpackage.AbstractC3424e
    public final int vip() {
        return 4;
    }
}
