package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9217e extends AbstractC12834e implements InterfaceC2537e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f18407e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C14133e f18408e;

    public C9217e(C14133e c14133e, long j) {
        this.f18408e = c14133e;
        this.f18407e = j;
    }

    @Override // defpackage.AbstractC12834e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.AbstractC12834e
    /* renamed from: eؘؕۥ */
    public final InterfaceC4895e mo1012e() {
        return new C13197e(this);
    }

    @Override // defpackage.AbstractC12834e
    public final long license() {
        return this.f18407e;
    }

    @Override // defpackage.AbstractC12834e
    public final C14133e purchase() {
        return this.f18408e;
    }

    @Override // defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return C1930e.license;
    }
}
