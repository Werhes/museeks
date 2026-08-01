package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6915e extends AbstractC7884e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final AtomicLong f14161e = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C11448e f14162e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Object f14163e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C5528e f14164e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final Semaphore f14165e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C11448e f14166e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C5528e f14167e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final LinkedBlockingQueue f14168e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final PriorityBlockingQueue f14169e;

    public C6915e(C6936e c6936e) {
        super(c6936e);
        this.f14163e = new Object();
        this.f14165e = new Semaphore(2);
        this.f14169e = new PriorityBlockingQueue();
        this.f14168e = new LinkedBlockingQueue();
        this.f14164e = new C5528e(this, "Thread death: Uncaught exception on worker thread");
        this.f14167e = new C5528e(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final void m2246e() {
        if (Thread.currentThread() == this.f14166e) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final boolean m2247e() {
        return Thread.currentThread() == this.f14166e;
    }

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public final C17182e m2248e(Callable callable) {
        m2347e();
        C17182e c17182e = new C17182e(this, callable, true);
        if (Thread.currentThread() == this.f14166e) {
            c17182e.run();
            return c17182e;
        }
        m2251e(c17182e);
        return c17182e;
    }

    @Override // defpackage.AbstractC7884e
    /* renamed from: eؚۚۦ */
    public final boolean mo487e() {
        return false;
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final C17182e m2249e(Callable callable) {
        m2347e();
        C17182e c17182e = new C17182e(this, callable, false);
        if (Thread.currentThread() != this.f14166e) {
            m2251e(c17182e);
            return c17182e;
        }
        if (!this.f14169e.isEmpty()) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.ad("Callable skipped the worker queue.");
        }
        c17182e.run();
        return c17182e;
    }

    @Override // defpackage.Cpackage
    /* renamed from: eُِٔ, reason: contains not printable characters */
    public final void mo2250e() {
        if (Thread.currentThread() != this.f14166e) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public final void m2251e(C17182e c17182e) {
        synchronized (this.f14163e) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f14169e;
                priorityBlockingQueue.add(c17182e);
                C11448e c11448e = this.f14166e;
                if (c11448e == null) {
                    C11448e c11448e2 = new C11448e(this, "Measurement Worker", priorityBlockingQueue);
                    this.f14166e = c11448e2;
                    c11448e2.setUncaughtExceptionHandler(this.f14164e);
                    this.f14166e.start();
                } else {
                    c11448e.ad();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public final Object m2252e(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            C6915e c6915e = ((C6936e) this.f36443e).f14226e;
            C6936e.yandex(c6915e);
            c6915e.m2254e(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                C13879e c13879e = ((C6936e) this.f36443e).f14227e;
                C6936e.yandex(c13879e);
                C14937e c14937e = c13879e.f27495e;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                c14937e.ad(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            C13879e c13879e2 = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27495e.ad("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public final void m2253e(Runnable runnable) {
        m2347e();
        m2251e(new C17182e(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final void m2254e(Runnable runnable) {
        m2347e();
        AbstractC9528e.startapp(runnable);
        m2251e(new C17182e(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final void m2255e() {
        if (Thread.currentThread() != this.f14162e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public final void m2256e(Runnable runnable) {
        m2347e();
        C17182e c17182e = new C17182e(this, runnable, false, "Task exception on network thread");
        synchronized (this.f14163e) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f14168e;
                linkedBlockingQueue.add(c17182e);
                C11448e c11448e = this.f14162e;
                if (c11448e == null) {
                    C11448e c11448e2 = new C11448e(this, "Measurement Network", linkedBlockingQueue);
                    this.f14162e = c11448e2;
                    c11448e2.setUncaughtExceptionHandler(this.f14167e);
                    this.f14162e.start();
                } else {
                    c11448e.ad();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
