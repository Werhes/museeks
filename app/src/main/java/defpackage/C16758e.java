package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؕؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16758e implements InterfaceC4476e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f32847e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f32848e;

    public C16758e(long j, int i) {
        this.f32848e = j;
        this.f32847e = i;
    }

    @Override // defpackage.InterfaceC4476e
    public final long ad() {
        return this.f32848e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16758e)) {
            return false;
        }
        C16758e c16758e = (C16758e) obj;
        return this.f32848e == c16758e.f32848e && this.f32847e == c16758e.f32847e;
    }

    public final int hashCode() {
        long j = this.f32848e;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f32847e;
    }

    public final String toString() {
        return "TimestampImpl(seconds=" + this.f32848e + ", nanoSeconds=" + this.f32847e + ")";
    }

    @Override // defpackage.InterfaceC4476e
    public final int vip() {
        return this.f32847e;
    }
}
