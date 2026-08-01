package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۤ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4482e implements InterfaceC2537e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f9694e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f9695e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0058e f9696e;

    public C4482e(C0058e c0058e, long j) {
        this.f9696e = c0058e;
        this.f9695e = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0058e c0058e = this.f9696e;
        if (this.f9694e) {
            return;
        }
        this.f9694e = true;
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

    @Override // defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        long j2;
        long j3;
        int i;
        if (this.f9694e) {
            throw new IllegalStateException("closed");
        }
        C0058e c0058e = this.f9696e;
        long j4 = this.f9695e;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount < 0: ").toString());
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                j2 = -1;
                break;
            }
            C16592e m4130implements = c16151e.m4130implements(1);
            byte[] bArr = m4130implements.ad;
            int i2 = m4130implements.metrica;
            j2 = -1;
            int min = (int) Math.min(j5 - j6, 8192 - i2);
            synchronized (c0058e) {
                c0058e.f1193e.seek(j6);
                i = 0;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int read = c0058e.f1193e.read(bArr, i2, min - i);
                    if (read != -1) {
                        i += read;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (m4130implements.vip == m4130implements.metrica) {
                    c16151e.f31732e = m4130implements.ad();
                    AbstractC11279e.ad(m4130implements);
                }
                if (j4 == j6) {
                    j3 = -1;
                }
            } else {
                m4130implements.metrica += i;
                long j7 = i;
                j6 += j7;
                c16151e.f31731e += j7;
            }
        }
        j3 = j6 - j4;
        if (j3 != j2) {
            this.f9695e += j3;
        }
        return j3;
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return C1930e.license;
    }
}
