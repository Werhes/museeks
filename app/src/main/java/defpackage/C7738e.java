package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7738e {
    public final long ad;
    public final long metrica;
    public final long vip;

    public C7738e(long j, long j2, long j3) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7738e) {
            C7738e c7738e = (C7738e) obj;
            if (this.ad == c7738e.ad && this.vip == c7738e.vip && this.metrica == c7738e.metrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.metrica;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.ad);
        sb.append(", elapsedRealtime=");
        sb.append(this.vip);
        sb.append(", uptimeMillis=");
        return AbstractC5087e.m1750native(this.metrica, "}", sb);
    }
}
