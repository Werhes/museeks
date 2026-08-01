package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17580e {
    public final float ad;
    public final float metrica;
    public final float vip;

    public C17580e(Double d, Double d2) {
        Double valueOf = Double.valueOf(1.0d);
        float floatValue = d.floatValue();
        float floatValue2 = d2.floatValue();
        float floatValue3 = valueOf.floatValue();
        this.ad = floatValue;
        this.vip = floatValue2;
        this.metrica = floatValue3;
    }

    public final float ad() {
        float f = 1 - this.ad;
        float f2 = this.vip;
        return ((f - f2) * this.metrica) / f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17580e)) {
            return false;
        }
        C17580e c17580e = (C17580e) obj;
        return Float.compare(this.ad, c17580e.ad) == 0 && Float.compare(this.vip, c17580e.vip) == 0 && Float.compare(this.metrica, c17580e.metrica) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.metrica) + AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("xyY(x=");
        sb.append(this.ad);
        sb.append(", y=");
        sb.append(this.vip);
        sb.append(", Y=");
        return AbstractC17861e.remoteconfig(sb, this.metrica, ')');
    }
}
