package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؐۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10718e implements Comparable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f21119e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f21120e;

    public C10718e(long j, byte[] bArr) {
        this.f21120e = j;
        this.f21119e = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f21120e, ((C10718e) obj).f21120e);
    }
}
