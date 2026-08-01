package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2577e implements InterfaceC4476e, InterfaceC6025e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f6437e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f6438e;

    public C2577e(long j, int i) {
        this.f6438e = j;
        this.f6437e = i;
    }

    public C2577e(C16758e c16758e) {
        this(c16758e.f32848e, c16758e.f32847e);
    }

    @Override // defpackage.InterfaceC4476e
    public final long ad() {
        return this.f6438e;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2577e c2577e = (C2577e) ((InterfaceC6025e) obj);
        long j = c2577e.f6438e;
        long j2 = this.f6438e;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        return AbstractC7890e.yandex(this.f6437e, c2577e.f6437e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2577e)) {
            return false;
        }
        C2577e c2577e = (C2577e) obj;
        return this.f6438e == c2577e.f6438e && this.f6437e == c2577e.f6437e;
    }

    public final int hashCode() {
        long j = this.f6438e;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f6437e;
    }

    public final String toString() {
        return "RealmInstant(epochSeconds=" + this.f6438e + ", nanosecondsOfSecond=" + this.f6437e + ")";
    }

    @Override // defpackage.InterfaceC4476e
    public final int vip() {
        return this.f6437e;
    }
}
