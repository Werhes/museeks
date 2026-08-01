package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0058e implements Closeable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final RandomAccessFile f1193e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f1194e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f1195e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ReentrantLock f1196e = new ReentrantLock();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f1197e;

    public C0058e(boolean z, RandomAccessFile randomAccessFile) {
        this.f1197e = z;
        this.f1193e = randomAccessFile;
    }

    public static C6362e ad(C0058e c0058e) {
        if (!c0058e.f1197e) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = c0058e.f1196e;
        reentrantLock.lock();
        try {
            if (c0058e.f1195e) {
                throw new IllegalStateException("closed");
            }
            c0058e.f1194e++;
            reentrantLock.unlock();
            return new C6362e(c0058e);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f1196e;
        reentrantLock.lock();
        try {
            if (this.f1195e) {
                return;
            }
            this.f1195e = true;
            if (this.f1194e != 0) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            synchronized (this) {
                this.f1193e.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (!this.f1197e) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f1196e;
        reentrantLock.lock();
        try {
            if (this.f1195e) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.INSTANCE;
            synchronized (this) {
                this.f1193e.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final C4482e license(long j) {
        ReentrantLock reentrantLock = this.f1196e;
        reentrantLock.lock();
        try {
            if (this.f1195e) {
                throw new IllegalStateException("closed");
            }
            this.f1194e++;
            reentrantLock.unlock();
            return new C4482e(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f1196e;
        reentrantLock.lock();
        try {
            if (this.f1195e) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.INSTANCE;
            synchronized (this) {
                length = this.f1193e.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
