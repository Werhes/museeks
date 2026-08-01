package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2493e extends AbstractC3424e {
    public float ad;

    public C2493e(float f) {
        this.ad = f;
    }

    @Override // defpackage.AbstractC3424e
    public final float ad(int i) {
        if (i == 0) {
            return this.ad;
        }
        return 0.0f;
    }

    @Override // defpackage.AbstractC3424e
    public final void appmetrica(int i, float f) {
        if (i == 0) {
            this.ad = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2493e) && ((C2493e) obj).ad == this.ad;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.ad);
    }

    @Override // defpackage.AbstractC3424e
    public final void license() {
        this.ad = 0.0f;
    }

    @Override // defpackage.AbstractC3424e
    public final AbstractC3424e metrica() {
        return new C2493e(0.0f);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.ad;
    }

    @Override // defpackage.AbstractC3424e
    public final int vip() {
        return 1;
    }
}
