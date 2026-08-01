package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۣٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11098e extends AbstractC13722e {
    public final float license;
    public final float metrica;

    public C11098e(float f, float f2) {
        super(3);
        this.metrica = f;
        this.license = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11098e)) {
            return false;
        }
        C11098e c11098e = (C11098e) obj;
        return Float.compare(this.metrica, c11098e.metrica) == 0 && Float.compare(this.license, c11098e.license) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + (Float.floatToIntBits(this.metrica) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.metrica);
        sb.append(", dy=");
        return AbstractC17861e.remoteconfig(sb, this.license, ')');
    }
}
