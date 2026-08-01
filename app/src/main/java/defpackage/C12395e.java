package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12395e {
    public final float ad;
    public final InterfaceC6512e metrica;
    public final long vip;

    public C12395e(float f, long j, InterfaceC6512e interfaceC6512e) {
        this.ad = f;
        this.vip = j;
        this.metrica = interfaceC6512e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12395e)) {
            return false;
        }
        C12395e c12395e = (C12395e) obj;
        return Float.compare(this.ad, c12395e.ad) == 0 && C13220e.ad(this.vip, c12395e.vip) && AbstractC7890e.billing(this.metrica, c12395e.metrica);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.ad) * 31;
        int i = C13220e.metrica;
        long j = this.vip;
        return this.metrica.hashCode() + ((((int) (j ^ (j >>> 32))) + floatToIntBits) * 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.ad + ", transformOrigin=" + ((Object) C13220e.license(this.vip)) + ", animationSpec=" + this.metrica + ')';
    }
}
