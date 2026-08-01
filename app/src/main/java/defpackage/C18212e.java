package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٛٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18212e implements InterfaceC8079e {
    public final float ad;

    public C18212e(float f) {
        this.ad = f;
    }

    @Override // defpackage.InterfaceC8079e
    public final long ad(long j, long j2, EnumC7792e enumC7792e) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        float f = 1;
        float f2 = (this.ad + f) * (((int) (j3 >> 32)) / 2.0f);
        float f3 = (f - 1.0f) * (((int) (j3 & 4294967295L)) / 2.0f);
        return (Math.round(f3) & 4294967295L) | (Math.round(f2) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18212e) && Float.compare(this.ad, ((C18212e) obj).ad) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(this.ad) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.ad + ", verticalBias=-1.0)";
    }
}
