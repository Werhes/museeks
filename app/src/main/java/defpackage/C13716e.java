package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13716e extends AbstractC13722e {
    public final float appmetrica;
    public final boolean billing;
    public final float license;
    public final float metrica;
    public final boolean purchase;
    public final float startapp;
    public final float yandex;

    public C13716e(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.metrica = f;
        this.license = f2;
        this.appmetrica = f3;
        this.purchase = z;
        this.billing = z2;
        this.yandex = f4;
        this.startapp = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13716e)) {
            return false;
        }
        C13716e c13716e = (C13716e) obj;
        return Float.compare(this.metrica, c13716e.metrica) == 0 && Float.compare(this.license, c13716e.license) == 0 && Float.compare(this.appmetrica, c13716e.appmetrica) == 0 && this.purchase == c13716e.purchase && this.billing == c13716e.billing && Float.compare(this.yandex, c13716e.yandex) == 0 && Float.compare(this.startapp, c13716e.startapp) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.startapp) + AbstractC1414e.license((((AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.metrica) * 31, this.license, 31), this.appmetrica, 31) + (this.purchase ? 1231 : 1237)) * 31) + (this.billing ? 1231 : 1237)) * 31, this.yandex, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.metrica);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.license);
        sb.append(", theta=");
        sb.append(this.appmetrica);
        sb.append(", isMoreThanHalf=");
        sb.append(this.purchase);
        sb.append(", isPositiveArc=");
        sb.append(this.billing);
        sb.append(", arcStartDx=");
        sb.append(this.yandex);
        sb.append(", arcStartDy=");
        return AbstractC17861e.remoteconfig(sb, this.startapp, ')');
    }
}
