package defpackage;

import java.io.OutputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4122e implements InterfaceC0274e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C1930e f9079e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final OutputStream f9080e;

    public C4122e(OutputStream outputStream, C1930e c1930e) {
        this.f9080e = outputStream;
        this.f9079e = c1930e;
    }

    @Override // defpackage.InterfaceC0274e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9080e.close();
    }

    @Override // defpackage.InterfaceC0274e, java.io.Flushable
    public final void flush() {
        this.f9080e.flush();
    }

    @Override // defpackage.InterfaceC0274e
    public final C1930e startapp() {
        return this.f9079e;
    }

    public final String toString() {
        return "sink(" + this.f9080e + ')';
    }

    @Override // defpackage.InterfaceC0274e
    /* renamed from: transient */
    public final void mo272transient(C16151e c16151e, long j) {
        AbstractC7844e.startapp(c16151e.f31731e, 0L, j);
        while (j > 0) {
            this.f9079e.purchase();
            C16592e c16592e = c16151e.f31732e;
            int min = (int) Math.min(j, c16592e.metrica - c16592e.vip);
            this.f9080e.write(c16592e.ad, c16592e.vip, min);
            int i = c16592e.vip + min;
            c16592e.vip = i;
            long j2 = min;
            j -= j2;
            c16151e.f31731e -= j2;
            if (i == c16592e.metrica) {
                c16151e.f31732e = c16592e.ad();
                AbstractC11279e.ad(c16592e);
            }
        }
    }
}
