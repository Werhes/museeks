package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18062e extends AbstractC3424e {
    public float ad;
    public float metrica;
    public float vip;

    public C18062e(float f, float f2, float f3) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
    }

    @Override // defpackage.AbstractC3424e
    public final float ad(int i) {
        if (i == 0) {
            return this.ad;
        }
        if (i == 1) {
            return this.vip;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.metrica;
    }

    @Override // defpackage.AbstractC3424e
    public final void appmetrica(int i, float f) {
        if (i == 0) {
            this.ad = f;
        } else if (i == 1) {
            this.vip = f;
        } else {
            if (i != 2) {
                return;
            }
            this.metrica = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18062e)) {
            return false;
        }
        C18062e c18062e = (C18062e) obj;
        return c18062e.ad == this.ad && c18062e.vip == this.vip && c18062e.metrica == this.metrica;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.metrica) + AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31);
    }

    @Override // defpackage.AbstractC3424e
    public final void license() {
        this.ad = 0.0f;
        this.vip = 0.0f;
        this.metrica = 0.0f;
    }

    @Override // defpackage.AbstractC3424e
    public final AbstractC3424e metrica() {
        return new C18062e(0.0f, 0.0f, 0.0f);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.ad + ", v2 = " + this.vip + ", v3 = " + this.metrica;
    }

    @Override // defpackage.AbstractC3424e
    public final int vip() {
        return 3;
    }
}
