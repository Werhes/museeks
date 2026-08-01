package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؐۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9969e implements InterfaceC0274e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11980e f19698e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12345e f19699e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final OutputStream f19700e;

    public C9969e(C11980e c11980e) {
        this.f19698e = c11980e;
        Socket socket = (Socket) c11980e.f23950e;
        this.f19700e = socket.getOutputStream();
        this.f19699e = new C12345e(socket);
    }

    @Override // defpackage.InterfaceC0274e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        OutputStream outputStream = this.f19700e;
        C11980e c11980e = this.f19698e;
        C12345e c12345e = this.f19699e;
        c12345e.yandex();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) c11980e.f23949e;
            Socket socket = (Socket) c11980e.f23950e;
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                Unit unit = Unit.INSTANCE;
                if (c12345e.startapp()) {
                    throw c12345e.adcel(null);
                }
            }
        } catch (IOException e) {
            if (!c12345e.startapp()) {
                throw e;
            }
            throw c12345e.adcel(e);
        } finally {
            c12345e.startapp();
        }
    }

    @Override // defpackage.InterfaceC0274e, java.io.Flushable
    public final void flush() {
        C12345e c12345e = this.f19699e;
        c12345e.yandex();
        try {
            this.f19700e.flush();
            Unit unit = Unit.INSTANCE;
            if (c12345e.startapp()) {
                throw c12345e.adcel(null);
            }
        } catch (IOException e) {
            if (!c12345e.startapp()) {
                throw e;
            }
            throw c12345e.adcel(e);
        } finally {
            c12345e.startapp();
        }
    }

    @Override // defpackage.InterfaceC0274e
    public final C1930e startapp() {
        return this.f19699e;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f19698e.f23950e) + ')';
    }

    @Override // defpackage.InterfaceC0274e
    /* renamed from: transient */
    public final void mo272transient(C16151e c16151e, long j) {
        AbstractC7844e.startapp(c16151e.f31731e, 0L, j);
        while (j > 0) {
            C12345e c12345e = this.f19699e;
            c12345e.purchase();
            C16592e c16592e = c16151e.f31732e;
            int min = (int) Math.min(j, c16592e.metrica - c16592e.vip);
            c12345e.yandex();
            try {
                try {
                    this.f19700e.write(c16592e.ad, c16592e.vip, min);
                    Unit unit = Unit.INSTANCE;
                    if (c12345e.startapp()) {
                        throw c12345e.adcel(null);
                    }
                    int i = c16592e.vip + min;
                    c16592e.vip = i;
                    long j2 = min;
                    j -= j2;
                    c16151e.f31731e -= j2;
                    if (i == c16592e.metrica) {
                        c16151e.f31732e = c16592e.ad();
                        AbstractC11279e.ad(c16592e);
                    }
                } catch (IOException e) {
                    if (!c12345e.startapp()) {
                        throw e;
                    }
                    throw c12345e.adcel(e);
                }
            } catch (Throwable th) {
                c12345e.startapp();
                throw th;
            }
        }
    }
}
