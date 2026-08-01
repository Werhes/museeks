package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۦٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12891e extends IllegalStateException implements InterfaceC13853e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f25748e;

    public C12891e(long j) {
        super(AbstractC0869e.isVip(j, "Body.size is too long. Expected "));
        this.f25748e = j;
    }

    @Override // defpackage.InterfaceC13853e
    public final Throwable ad() {
        C12891e c12891e = new C12891e(this.f25748e);
        c12891e.initCause(this);
        return c12891e;
    }
}
