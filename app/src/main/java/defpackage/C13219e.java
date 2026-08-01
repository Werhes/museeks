package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13219e {
    public final float ad;
    public final long metrica;
    public final float vip;

    public C13219e(float f, float f2, long j) {
        this.ad = f;
        this.vip = f2;
        this.metrica = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13219e)) {
            return false;
        }
        C13219e c13219e = (C13219e) obj;
        return Float.compare(this.ad, c13219e.ad) == 0 && Float.compare(this.vip, c13219e.vip) == 0 && this.metrica == c13219e.metrica;
    }

    public final int hashCode() {
        int license = AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31);
        long j = this.metrica;
        return license + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
        sb.append(this.ad);
        sb.append(", distance=");
        sb.append(this.vip);
        sb.append(", duration=");
        return AbstractC10257e.mopub(sb, this.metrica, ')');
    }
}
