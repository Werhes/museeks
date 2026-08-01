package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٛؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableFutureC3479e extends AbstractC2074e implements RunnableFuture {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public volatile RunnableC15255e f7749e;

    public RunnableFutureC3479e(Callable callable) {
        this.f7749e = new RunnableC15255e(this, callable);
    }

    @Override // defpackage.AbstractC2074e
    public final void amazon() {
        RunnableC15255e runnableC15255e;
        Object obj = this.f26540e;
        if ((obj instanceof C16983e) && ((C16983e) obj).ad && (runnableC15255e = this.f7749e) != null) {
            RunnableC18182e runnableC18182e = RunnableC15255e.f30187e;
            RunnableC18182e runnableC18182e2 = RunnableC15255e.f30186e;
            Runnable runnable = (Runnable) runnableC15255e.get();
            if (runnable instanceof Thread) {
                RunnableC14670e runnableC14670e = new RunnableC14670e(runnableC15255e);
                runnableC14670e.ad(Thread.currentThread());
                if (runnableC15255e.compareAndSet(runnable, runnableC14670e)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) runnableC15255e.getAndSet(runnableC18182e2)) == runnableC18182e) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) runnableC15255e.getAndSet(runnableC18182e2)) == runnableC18182e) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.f7749e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC2074e
    public final String loadAd() {
        RunnableC15255e runnableC15255e = this.f7749e;
        if (runnableC15255e != null) {
            String runnableC15255e2 = runnableC15255e.toString();
            return AbstractC8647e.ads(new StringBuilder(runnableC15255e2.length() + 7), "task=[", runnableC15255e2, "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        RunnableC15255e runnableC15255e = this.f7749e;
        if (runnableC15255e != null) {
            runnableC15255e.run();
        }
        this.f7749e = null;
    }
}
