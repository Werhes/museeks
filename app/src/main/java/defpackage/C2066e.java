package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2066e implements InterfaceC8026e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final double f5360e;

    public C2066e(double d) {
        this.f5360e = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2066e) && Double.compare(this.f5360e, ((C2066e) obj).f5360e) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f5360e);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // defpackage.InterfaceC8026e
    public final float metrica(float f) {
        return (float) AbstractC0865e.billing(f, this.f5360e);
    }

    @Override // defpackage.InterfaceC8026e
    public final float purchase(float f) {
        return (float) AbstractC0865e.billing(f, 1.0d / this.f5360e);
    }

    public final String toString() {
        return "GammaTransferFunctions(gamma=" + this.f5360e + ')';
    }
}
