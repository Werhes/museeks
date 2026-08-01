package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً٘ؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17621e implements Comparable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f34534e;

    public C17621e(long j) {
        this.f34534e = j;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "'version' must both be numbers >= 0. It was: "));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f34534e;
        long j2 = ((C17621e) obj).f34534e;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17621e) && this.f34534e == ((C17621e) obj).f34534e;
    }

    public final int hashCode() {
        long j = this.f34534e;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC1634e.mopub(this.f34534e, "VersionId(version=", ")");
    }
}
