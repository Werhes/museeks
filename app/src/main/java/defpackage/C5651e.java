package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5651e extends AbstractC13367e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f12037e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f26622e) {
            return;
        }
        if (!this.f12037e) {
            ad(C14005e.purchase);
        }
        this.f26622e = true;
    }

    @Override // defpackage.AbstractC13367e, defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount < 0: ").toString());
        }
        if (this.f26622e) {
            throw new IllegalStateException("closed");
        }
        if (this.f12037e) {
            return -1L;
        }
        long signatures = super.signatures(c16151e, j);
        if (signatures != -1) {
            return signatures;
        }
        this.f12037e = true;
        ad(C15793e.f31108e);
        return -1L;
    }
}
