package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8428e extends AbstractC13722e {
    public final float appmetrica;
    public final float license;
    public final float metrica;
    public final float purchase;

    public C8428e(float f, float f2, float f3, float f4) {
        super(2);
        this.metrica = f;
        this.license = f2;
        this.appmetrica = f3;
        this.purchase = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8428e)) {
            return false;
        }
        C8428e c8428e = (C8428e) obj;
        return Float.compare(this.metrica, c8428e.metrica) == 0 && Float.compare(this.license, c8428e.license) == 0 && Float.compare(this.appmetrica, c8428e.appmetrica) == 0 && Float.compare(this.purchase, c8428e.purchase) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.purchase) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.metrica) * 31, this.license, 31), this.appmetrica, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.metrica);
        sb.append(", y1=");
        sb.append(this.license);
        sb.append(", x2=");
        sb.append(this.appmetrica);
        sb.append(", y2=");
        return AbstractC17861e.remoteconfig(sb, this.purchase, ')');
    }
}
