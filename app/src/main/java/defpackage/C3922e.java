package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3922e {
    public final float ad;
    public final float license;
    public final float metrica;
    public final float vip;

    public C3922e(float f, float f2, float f3, float f4) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3922e)) {
            return false;
        }
        C3922e c3922e = (C3922e) obj;
        return Float.compare(this.ad, c3922e.ad) == 0 && Float.compare(this.vip, c3922e.vip) == 0 && Float.compare(this.metrica, c3922e.metrica) == 0 && Float.compare(this.license, c3922e.license) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbsolutePixelPadding(start=");
        sb.append(this.ad);
        sb.append(", end=");
        sb.append(this.vip);
        sb.append(", top=");
        sb.append(this.metrica);
        sb.append(", bottom=");
        return AbstractC17861e.remoteconfig(sb, this.license, ')');
    }
}
