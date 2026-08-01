package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4574e {
    public final float ad;
    public final float vip;

    public C4574e(float f, float f2) {
        this.ad = f;
        this.vip = f2;
    }

    public final float[] ad() {
        float f = this.ad;
        float f2 = this.vip;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4574e)) {
            return false;
        }
        C4574e c4574e = (C4574e) obj;
        return Float.compare(this.ad, c4574e.ad) == 0 && Float.compare(this.vip, c4574e.vip) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.vip) + (Float.floatToIntBits(this.ad) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.ad);
        sb.append(", y=");
        return AbstractC17861e.remoteconfig(sb, this.vip, ')');
    }
}
