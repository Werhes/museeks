package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0032e {
    public final float ad;
    public final float license;
    public final float metrica;
    public final float vip;

    public /* synthetic */ C0032e() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public C0032e(float f, float f2, float f3, float f4) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0032e)) {
            return false;
        }
        C0032e c0032e = (C0032e) obj;
        return Float.compare(this.ad, c0032e.ad) == 0 && Float.compare(this.vip, c0032e.vip) == 0 && Float.compare(this.metrica, c0032e.metrica) == 0 && Float.compare(this.license, c0032e.license) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31);
    }

    public final String toString() {
        return "BalloonOverlayPadding(left=" + this.ad + ", top=" + this.vip + ", right=" + this.metrica + ", bottom=" + this.license + ")";
    }
}
