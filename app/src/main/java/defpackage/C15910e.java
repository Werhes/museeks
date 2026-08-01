package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15910e extends BufferedOutputStream {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f31356e;

    public final void ad(OutputStream outputStream) {
        AbstractC2301e.subscription(this.f31356e);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f31356e = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f31356e = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        String str = AbstractC9413e.ad;
        throw th;
    }
}
