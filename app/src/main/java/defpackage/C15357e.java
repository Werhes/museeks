package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15357e {
    public final float ad;
    public final float metrica;
    public final float vip;

    public C15357e(float f, float f2, float f3) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15357e)) {
            return false;
        }
        C15357e c15357e = (C15357e) obj;
        return C15765e.vip(this.ad, c15357e.ad) && C15765e.vip(this.vip, c15357e.vip) && C15765e.vip(this.metrica, c15357e.metrica);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.metrica) + AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.ad;
        AbstractC10257e.admob(f, sb, ", right=");
        float f2 = this.vip;
        sb.append((Object) C15765e.metrica(f + f2));
        sb.append(", width=");
        sb.append((Object) C15765e.metrica(f2));
        sb.append(", contentWidth=");
        sb.append((Object) C15765e.metrica(this.metrica));
        sb.append(')');
        return sb.toString();
    }
}
