package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12347e {
    public static final /* synthetic */ int metrica = 0;
    public static final long vip = AbstractC9262e.metrica(0, 0);
    public final long ad;

    public /* synthetic */ C12347e(long j) {
        this.ad = j;
    }

    public static final boolean ad(long j, long j2) {
        return (billing(j) <= billing(j2)) & (purchase(j2) <= purchase(j));
    }

    public static String adcel(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return AbstractC1786e.pro(sb, (int) (j & 4294967295L), ')');
    }

    public static final int appmetrica(long j) {
        return purchase(j) - billing(j);
    }

    public static final int billing(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean license(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final boolean metrica(long j, long j2) {
        return j == j2;
    }

    public static final int purchase(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static int startapp(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean vip(long j, Object obj) {
        return (obj instanceof C12347e) && j == ((C12347e) obj).ad;
    }

    public static final boolean yandex(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return vip(this.ad, obj);
    }

    public final int hashCode() {
        return startapp(this.ad);
    }

    public final String toString() {
        return adcel(this.ad);
    }
}
