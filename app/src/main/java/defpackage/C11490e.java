package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11490e {
    public final long ad;

    public /* synthetic */ C11490e(long j) {
        this.ad = j;
    }

    public static long ad(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (j & 4294967295L);
        }
        return (i2 & 4294967295L) | (i << 32);
    }

    public static String appmetrica(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return AbstractC1786e.pro(sb, (int) (j & 4294967295L), ')');
    }

    public static final long license(long j, long j2) {
        return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final long metrica(long j, long j2) {
        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final boolean vip(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11490e) {
            return this.ad == ((C11490e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return appmetrica(this.ad);
    }
}
