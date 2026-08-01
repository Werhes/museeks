package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4330e implements InterfaceC2537e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11980e f9466e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12345e f9467e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InputStream f9468e;

    public C4330e(C11980e c11980e) {
        this.f9466e = c11980e;
        Socket socket = (Socket) c11980e.f23950e;
        this.f9468e = socket.getInputStream();
        this.f9467e = new C12345e(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        C11980e c11980e = this.f9466e;
        C12345e c12345e = this.f9467e;
        c12345e.yandex();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) c11980e.f23949e;
            Socket socket = (Socket) c11980e.f23950e;
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f9468e.close();
                    }
                }
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

    @Override // defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount < 0: ").toString());
        }
        C12345e c12345e = this.f9467e;
        c12345e.purchase();
        C16592e m4130implements = c16151e.m4130implements(1);
        int min = (int) Math.min(j, 8192 - m4130implements.metrica);
        try {
            c12345e.yandex();
            try {
                int read = this.f9468e.read(m4130implements.ad, m4130implements.metrica, min);
                if (c12345e.startapp()) {
                    throw c12345e.adcel(null);
                }
                if (read != -1) {
                    m4130implements.metrica += read;
                    long j2 = read;
                    c16151e.f31731e += j2;
                    return j2;
                }
                if (m4130implements.vip != m4130implements.metrica) {
                    return -1L;
                }
                c16151e.f31732e = m4130implements.ad();
                AbstractC11279e.ad(m4130implements);
                return -1L;
            } catch (IOException e) {
                if (c12345e.startapp()) {
                    throw c12345e.adcel(e);
                }
                throw e;
            } finally {
                c12345e.startapp();
            }
        } catch (AssertionError e2) {
            if (AbstractC17793e.ad(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return this.f9467e;
    }

    public final String toString() {
        return "source(" + ((Socket) this.f9466e.f23950e) + ')';
    }
}
