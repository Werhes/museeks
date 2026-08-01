package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14751e {
    public final long ad;
    public final float appmetrica;
    public final float license;
    public final long metrica;
    public final long vip;

    public C14751e(long j, long j2, long j3) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = ((Number) AbstractC3062e.purchase(Float.valueOf(((float) j2) / ((float) (j < 1 ? 1L : j))), new C3721e(0.0f, 1.0f))).floatValue();
        this.appmetrica = ((Number) AbstractC3062e.purchase(Float.valueOf(((float) j3) / ((float) (j < 1 ? 1L : j))), new C3721e(0.0f, 1.0f))).floatValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14751e)) {
            return false;
        }
        C14751e c14751e = (C14751e) obj;
        return this.ad == c14751e.ad && this.vip == c14751e.vip && this.metrica == c14751e.metrica;
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.metrica;
        return i + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackProgressState(duration=");
        sb.append(this.ad);
        sb.append(", buffered=");
        sb.append(this.vip);
        sb.append(", position=");
        return AbstractC10257e.mopub(sb, this.metrica, ')');
    }
}
