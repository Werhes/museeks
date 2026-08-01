package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؐۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9966e implements InterfaceC0274e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C14005e f19695e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f19696e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6839e f19697e;

    public C9966e(C14005e c14005e) {
        this.f19695e = c14005e;
        this.f19697e = new C6839e(((C9674e) c14005e.metrica.f25752e).f19173e.startapp());
    }

    @Override // defpackage.InterfaceC0274e, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f19696e) {
            return;
        }
        this.f19696e = true;
        ((C9674e) this.f19695e.metrica.f25752e).mo2631private("0\r\n\r\n");
        C6839e c6839e = this.f19697e;
        C1930e c1930e = c6839e.appmetrica;
        c6839e.appmetrica = C1930e.license;
        c1930e.ad();
        c1930e.vip();
        this.f19695e.license = 3;
    }

    @Override // defpackage.InterfaceC0274e, java.io.Flushable
    public final synchronized void flush() {
        if (this.f19696e) {
            return;
        }
        ((C9674e) this.f19695e.metrica.f25752e).flush();
    }

    @Override // defpackage.InterfaceC0274e
    public final C1930e startapp() {
        return this.f19697e;
    }

    @Override // defpackage.InterfaceC0274e
    /* renamed from: transient */
    public final void mo272transient(C16151e c16151e, long j) {
        if (this.f19696e) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        C9674e c9674e = (C9674e) this.f19695e.metrica.f25752e;
        if (c9674e.f19171e) {
            throw new IllegalStateException("closed");
        }
        c9674e.f19172e.m4134static(j);
        c9674e.ad();
        c9674e.mo2631private("\r\n");
        c9674e.mo272transient(c16151e, j);
        c9674e.mo2631private("\r\n");
    }
}
