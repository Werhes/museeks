package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC15255e extends AtomicReference implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final RunnableC18182e f30186e = new RunnableC18182e(7);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final RunnableC18182e f30187e = new RunnableC18182e(7);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ RunnableFutureC3479e f30188e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Callable f30189e;

    public RunnableC15255e(RunnableFutureC3479e runnableFutureC3479e, Callable callable) {
        this.f30188e = runnableFutureC3479e;
        callable.getClass();
        this.f30189e = callable;
    }

    public final void ad(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC14670e runnableC14670e = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof RunnableC14670e;
            RunnableC18182e runnableC18182e = f30187e;
            if (!z2) {
                if (runnable != runnableC18182e) {
                    break;
                }
            } else {
                runnableC14670e = (RunnableC14670e) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC18182e || compareAndSet(runnable, runnableC18182e)) {
                z = Thread.interrupted() || z;
                LockSupport.park(runnableC14670e);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            RunnableFutureC3479e runnableFutureC3479e = this.f30188e;
            boolean isDone = runnableFutureC3479e.isDone();
            RunnableC18182e runnableC18182e = f30186e;
            if (isDone) {
                call = null;
            } else {
                try {
                    call = this.f30189e.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, runnableC18182e)) {
                            ad(currentThread);
                        }
                        if (AbstractC13307e.f26536e.Signature(runnableFutureC3479e, null, new C15045e(th))) {
                            AbstractC2074e.admob(runnableFutureC3479e);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, runnableC18182e)) {
                            ad(currentThread);
                        }
                        runnableFutureC3479e.getClass();
                        if (AbstractC13307e.f26536e.Signature(runnableFutureC3479e, null, AbstractC13307e.f26538e)) {
                            AbstractC2074e.admob(runnableFutureC3479e);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, runnableC18182e)) {
                ad(currentThread);
            }
            if (isDone) {
                return;
            }
            runnableFutureC3479e.getClass();
            if (call == null) {
                call = AbstractC13307e.f26538e;
            }
            if (AbstractC13307e.f26536e.Signature(runnableFutureC3479e, null, call)) {
                AbstractC2074e.admob(runnableFutureC3479e);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f30186e) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC14670e) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = AbstractC8647e.ads(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String obj = this.f30189e.toString();
        return AbstractC8647e.ads(new StringBuilder(str.length() + 2 + String.valueOf(obj).length()), str, ", ", obj);
    }
}
