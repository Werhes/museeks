package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2543e extends AbstractC13722e {
    public final float appmetrica;
    public final float billing;
    public final float license;
    public final float metrica;
    public final float purchase;
    public final float yandex;

    public C2543e(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.metrica = f;
        this.license = f2;
        this.appmetrica = f3;
        this.purchase = f4;
        this.billing = f5;
        this.yandex = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2543e)) {
            return false;
        }
        C2543e c2543e = (C2543e) obj;
        return Float.compare(this.metrica, c2543e.metrica) == 0 && Float.compare(this.license, c2543e.license) == 0 && Float.compare(this.appmetrica, c2543e.appmetrica) == 0 && Float.compare(this.purchase, c2543e.purchase) == 0 && Float.compare(this.billing, c2543e.billing) == 0 && Float.compare(this.yandex, c2543e.yandex) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.yandex) + AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.metrica) * 31, this.license, 31), this.appmetrica, 31), this.purchase, 31), this.billing, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.metrica);
        sb.append(", y1=");
        sb.append(this.license);
        sb.append(", x2=");
        sb.append(this.appmetrica);
        sb.append(", y2=");
        sb.append(this.purchase);
        sb.append(", x3=");
        sb.append(this.billing);
        sb.append(", y3=");
        return AbstractC17861e.remoteconfig(sb, this.yandex, ')');
    }
}
