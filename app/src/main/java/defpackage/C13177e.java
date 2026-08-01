package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13177e {
    public final int ad;
    public final boolean appmetrica;
    public final float license;
    public final float metrica;
    public final int vip;

    public /* synthetic */ C13177e(float f, int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0.0f : f, 0.0f, (i3 & 16) == 0);
    }

    public C13177e(int i, int i2, float f, float f2, boolean z) {
        this.ad = i;
        this.vip = i2;
        this.metrica = f;
        this.license = f2;
        this.appmetrica = z;
    }

    public static C13177e ad(C13177e c13177e, int i, float f) {
        int i2 = c13177e.vip;
        float f2 = c13177e.license;
        c13177e.getClass();
        return new C13177e(i, i2, f, f2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13177e)) {
            return false;
        }
        C13177e c13177e = (C13177e) obj;
        return this.ad == c13177e.ad && this.vip == c13177e.vip && Float.compare(this.metrica, c13177e.metrica) == 0 && Float.compare(this.license, c13177e.license) == 0 && this.appmetrica == c13177e.appmetrica;
    }

    public final int hashCode() {
        return AbstractC1414e.license(AbstractC1414e.license(((this.ad * 31) + this.vip) * 31, this.metrica, 31), this.license, 31) + (this.appmetrica ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Progress(positionSeconds=");
        sb.append(this.ad);
        sb.append(", durationSeconds=");
        sb.append(this.vip);
        sb.append(", playbackProgress=");
        sb.append(this.metrica);
        sb.append(", bufferedProgress=");
        sb.append(this.license);
        sb.append(", manualChange=");
        return AbstractC1786e.isVip(sb, this.appmetrica, ')');
    }
}
