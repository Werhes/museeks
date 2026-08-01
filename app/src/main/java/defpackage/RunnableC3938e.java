package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC3938e extends AbstractC0541e implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final RunnableC3938e f8782e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final long f8783e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؕۥٙ, eؘؙؖ, eُٚٝ] */
    static {
        Long l;
        ?? abstractC3743e = new AbstractC3743e();
        f8782e = abstractC3743e;
        abstractC3743e.m2986e(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f8783e = timeUnit.toNanos(l.longValue());
    }

    @Override // defpackage.AbstractC0541e, defpackage.InterfaceC13591e
    public final InterfaceC1232e ad(long j, Runnable runnable, InterfaceC8850e interfaceC8850e) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return C14251e.f28173e;
        }
        long nanoTime = System.nanoTime();
        C2889e c2889e = new C2889e(runnable, j2 + nanoTime);
        m367e(nanoTime, c2889e);
        return c2889e;
    }

    @Override // defpackage.AbstractC11092e
    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public final Thread mo1408e() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(RunnableC3938e.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.AbstractC0541e
    /* renamed from: eُۘٙ */
    public final void mo368e(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo368e(runnable);
    }

    /* renamed from: eٍٓۢ, reason: contains not printable characters */
    public final synchronized void m1409e() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC0541e.f2710e.set(this, null);
            AbstractC0541e.f2708e.set(this, null);
            notifyAll();
        }
    }

    @Override // defpackage.AbstractC11092e
    /* renamed from: e٘ٔ٘, reason: contains not printable characters */
    public final void mo1410e(long j, AbstractRunnableC9465e abstractRunnableC9465e) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m366e;
        AbstractC3858e.ad.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (m366e) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long mo370e = mo370e();
                    if (mo370e == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f8783e + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m1409e();
                            if (m366e()) {
                                return;
                            }
                            mo1408e();
                            return;
                        }
                        if (mo370e > j2) {
                            mo370e = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (mo370e > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m1409e();
                            if (m366e()) {
                                return;
                            }
                            mo1408e();
                            return;
                        }
                        LockSupport.parkNanos(this, mo370e);
                    }
                }
            }
        } finally {
            _thread = null;
            m1409e();
            if (!m366e()) {
                mo1408e();
            }
        }
    }

    @Override // defpackage.AbstractC0541e, defpackage.AbstractC11092e
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.AbstractC3743e
    public final String toString() {
        return "DefaultExecutor";
    }
}
