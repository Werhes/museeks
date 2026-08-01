package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12729e {
    public final long ad;

    public static boolean ad(long j, Object obj) {
        return (obj instanceof C12729e) && j == ((C12729e) obj).ad;
    }

    public static String metrica(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public static final boolean vip(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return ad(this.ad, obj);
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return metrica(this.ad);
    }
}
