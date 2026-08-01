package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ٘ؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17537e implements Comparable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f34382e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f34383e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f34384e;

    public C17537e(long j, long j2, long j3) {
        this.f34384e = j;
        this.f34383e = j2;
        this.f34382e = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f34384e, ((C17537e) obj).f34384e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17537e)) {
            return false;
        }
        C17537e c17537e = (C17537e) obj;
        return this.f34384e == c17537e.f34384e && this.f34383e == c17537e.f34383e && this.f34382e == c17537e.f34382e;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f34384e), Long.valueOf(this.f34383e), Long.valueOf(this.f34382e));
    }
}
