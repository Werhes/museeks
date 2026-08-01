package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16194e implements Comparable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f31811e;

    public /* synthetic */ C16194e(long j) {
        this.f31811e = j;
    }

    public static final long ad(long j, long j2) {
        int i = AbstractC1961e.f5150e;
        EnumC15934e enumC15934e = EnumC15934e.NANOSECONDS;
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? AbstractC10075e.yandex(j) : AbstractC10075e.adcel(j, j2, enumC15934e);
        }
        if (j != j2) {
            return C14157e.adcel(AbstractC10075e.yandex(j2));
        }
        C17647e c17647e = C14157e.f27993e;
        return 0L;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C16194e c16194e = (C16194e) obj;
        boolean z = c16194e instanceof C16194e;
        long j = this.f31811e;
        if (z) {
            return C14157e.metrica(ad(j, c16194e.f31811e), 0L);
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + c16194e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16194e) {
            return this.f31811e == ((C16194e) obj).f31811e;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f31811e;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f31811e + ')';
    }
}
