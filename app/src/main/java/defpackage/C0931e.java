package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0931e {
    public static final C0931e metrica = new C0931e(0, 0);
    public final long ad;
    public final long vip;

    public C0931e(long j, long j2) {
        this.ad = j;
        this.vip = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0931e) {
            C0931e c0931e = (C0931e) obj;
            return C12729e.vip(this.ad, c0931e.ad) && this.vip == c0931e.vip;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.vip;
        return ((int) ((j2 >>> 32) ^ j2)) + i;
    }
}
