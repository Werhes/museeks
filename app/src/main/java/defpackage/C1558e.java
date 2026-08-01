package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1558e {
    public final int ad;
    public final long appmetrica;
    public final float license;
    public final float metrica;
    public final float vip;

    public C1558e(int i, float f, float f2, float f3, long j) {
        this.ad = i;
        this.vip = f;
        this.metrica = f2;
        this.license = f3;
        this.appmetrica = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1558e.class == obj.getClass()) {
            C1558e c1558e = (C1558e) obj;
            return this.metrica == c1558e.metrica && this.license == c1558e.license && this.vip == c1558e.vip && this.ad == c1558e.ad && this.appmetrica == c1558e.appmetrica;
        }
        return false;
    }

    public final int hashCode() {
        int license = (AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.metrica) * 31, this.license, 31), this.vip, 31) + this.ad) * 31;
        long j = this.appmetrica;
        return license + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEvent(touchX=");
        sb.append(this.metrica);
        sb.append(", touchY=");
        sb.append(this.license);
        sb.append(", progress=");
        sb.append(this.vip);
        sb.append(", swipeEdge=");
        sb.append(this.ad);
        sb.append(", frameTimeMillis=");
        return AbstractC10257e.mopub(sb, this.appmetrica, ')');
    }
}
