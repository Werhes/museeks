package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10994e implements Comparable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f21777e;

    public /* synthetic */ C10994e(long j) {
        this.f21777e = j;
    }

    public static int ad(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static String vip(long j) {
        if (j >= 0) {
            AbstractC15211e.ad(10);
            return Long.toString(j, 10);
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        AbstractC15211e.ad(10);
        String l = Long.toString(j3, 10);
        AbstractC15211e.ad(10);
        return l.concat(Long.toString(j4, 10));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC17202e.appmetrica(this.f21777e, ((C10994e) obj).f21777e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10994e) {
            return this.f21777e == ((C10994e) obj).f21777e;
        }
        return false;
    }

    public final int hashCode() {
        return ad(this.f21777e);
    }

    public final String toString() {
        return vip(this.f21777e);
    }
}
