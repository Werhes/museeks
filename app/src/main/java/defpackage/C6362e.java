package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6362e implements InterfaceC0274e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f13209e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f13210e = 0;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0058e f13211e;

    public C6362e(C0058e c0058e) {
        this.f13211e = c0058e;
    }

    @Override // defpackage.InterfaceC0274e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0058e c0058e = this.f13211e;
        if (this.f13209e) {
            return;
        }
        this.f13209e = true;
        ReentrantLock reentrantLock = c0058e.f1196e;
        reentrantLock.lock();
        try {
            int i = c0058e.f1194e - 1;
            c0058e.f1194e = i;
            if (i == 0 && c0058e.f1195e) {
                Unit unit = Unit.INSTANCE;
                synchronized (c0058e) {
                    c0058e.f1193e.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.InterfaceC0274e, java.io.Flushable
    public final void flush() {
        if (this.f13209e) {
            throw new IllegalStateException("closed");
        }
        C0058e c0058e = this.f13211e;
        synchronized (c0058e) {
            c0058e.f1193e.getFD().sync();
        }
    }

    @Override // defpackage.InterfaceC0274e
    public final C1930e startapp() {
        return C1930e.license;
    }

    @Override // defpackage.InterfaceC0274e
    /* renamed from: transient */
    public final void mo272transient(C16151e c16151e, long j) {
        if (this.f13209e) {
            throw new IllegalStateException("closed");
        }
        C0058e c0058e = this.f13211e;
        long j2 = this.f13210e;
        c0058e.getClass();
        AbstractC7844e.startapp(c16151e.f31731e, 0L, j);
        long j3 = j2 + j;
        while (j2 < j3) {
            C16592e c16592e = c16151e.f31732e;
            int min = (int) Math.min(j3 - j2, c16592e.metrica - c16592e.vip);
            byte[] bArr = c16592e.ad;
            int i = c16592e.vip;
            synchronized (c0058e) {
                c0058e.f1193e.seek(j2);
                c0058e.f1193e.write(bArr, i, min);
            }
            int i2 = c16592e.vip + min;
            c16592e.vip = i2;
            long j4 = min;
            j2 += j4;
            c16151e.f31731e -= j4;
            if (i2 == c16592e.metrica) {
                c16151e.f31732e = c16592e.ad();
                AbstractC11279e.ad(c16592e);
            }
        }
        this.f13210e += j;
    }
}
