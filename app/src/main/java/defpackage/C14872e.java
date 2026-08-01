package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٔؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14872e implements InterfaceC1230e {
    public final float ad;

    public C14872e(float f) {
        this.ad = f;
        if (f < 0.0f || f > 100.0f) {
            AbstractC8889e.ad("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.InterfaceC1230e
    public final float ad(long j, InterfaceC14388e interfaceC14388e) {
        return (this.ad / 100.0f) * C2108e.appmetrica(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14872e) && Float.compare(this.ad, ((C14872e) obj).ad) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.ad);
    }

    public final String toString() {
        return "CornerSize(size = " + this.ad + "%)";
    }
}
