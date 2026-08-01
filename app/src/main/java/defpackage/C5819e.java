package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5819e {
    public final float ad;
    public final float license;
    public final float metrica;
    public final float vip;

    public C5819e(float f, float f2, float f3, float f4) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5819e)) {
            return false;
        }
        C5819e c5819e = (C5819e) obj;
        return C15765e.vip(this.ad, c5819e.ad) && C15765e.vip(this.vip, c5819e.vip) && C15765e.vip(this.metrica, c5819e.metrica) && C15765e.vip(this.license, c5819e.license);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DpRect(left=");
        AbstractC10257e.admob(this.ad, sb, ", top=");
        AbstractC10257e.admob(this.vip, sb, ", right=");
        AbstractC10257e.admob(this.metrica, sb, ", bottom=");
        sb.append((Object) C15765e.metrica(this.license));
        sb.append(')');
        return sb.toString();
    }
}
