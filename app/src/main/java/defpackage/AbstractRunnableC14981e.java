package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC14981e extends AtomicReference implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final RunnableC18182e f29694e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final RunnableC18182e f29695e;

    static {
        int i = 1;
        f29695e = new RunnableC18182e(i);
        f29694e = new RunnableC18182e(i);
    }

    public abstract void ad(Throwable th);

    public abstract Object appmetrica();

    public final void billing(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC7698e runnableC7698e = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof RunnableC7698e;
            RunnableC18182e runnableC18182e = f29694e;
            if (!z2 && runnable != runnableC18182e) {
                break;
            }
            if (z2) {
                runnableC7698e = (RunnableC7698e) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC18182e || compareAndSet(runnable, runnableC18182e)) {
                z = Thread.interrupted() || z;
                LockSupport.park(runnableC7698e);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract boolean license();

    public final void metrica() {
        RunnableC18182e runnableC18182e = f29694e;
        RunnableC18182e runnableC18182e2 = f29695e;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC7698e runnableC7698e = new RunnableC7698e(this);
            RunnableC7698e.ad(runnableC7698e, Thread.currentThread());
            if (compareAndSet(runnable, runnableC7698e)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(runnableC18182e2)) == runnableC18182e) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract String purchase();

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean license = license();
            RunnableC18182e runnableC18182e = f29695e;
            if (!license) {
                try {
                    obj = appmetrica();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, runnableC18182e)) {
                            billing(currentThread);
                        }
                        if (license) {
                            return;
                        }
                        ad(th);
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, runnableC18182e)) {
                            billing(currentThread);
                        }
                        if (!license) {
                            vip(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f29695e) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC7698e) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder isPro = AbstractC8703e.isPro(str, ", ");
        isPro.append(purchase());
        return isPro.toString();
    }

    public abstract void vip(Object obj);
}
