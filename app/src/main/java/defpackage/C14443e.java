package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14443e extends AbstractC3424e {
    public float ad;
    public float vip;

    public C14443e(float f, float f2) {
        this.ad = f;
        this.vip = f2;
    }

    @Override // defpackage.AbstractC3424e
    public final float ad(int i) {
        if (i == 0) {
            return this.ad;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.vip;
    }

    @Override // defpackage.AbstractC3424e
    public final void appmetrica(int i, float f) {
        if (i == 0) {
            this.ad = f;
        } else {
            if (i != 1) {
                return;
            }
            this.vip = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14443e)) {
            return false;
        }
        C14443e c14443e = (C14443e) obj;
        return c14443e.ad == this.ad && c14443e.vip == this.vip;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.vip) + (Float.floatToIntBits(this.ad) * 31);
    }

    @Override // defpackage.AbstractC3424e
    public final void license() {
        this.ad = 0.0f;
        this.vip = 0.0f;
    }

    @Override // defpackage.AbstractC3424e
    public final AbstractC3424e metrica() {
        return new C14443e(0.0f, 0.0f);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.ad + ", v2 = " + this.vip;
    }

    @Override // defpackage.AbstractC3424e
    public final int vip() {
        return 2;
    }
}
