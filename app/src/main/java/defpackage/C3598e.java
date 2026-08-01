package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۙٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3598e extends C0918e implements InterfaceScheduledExecutorServiceC1678e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ScheduledExecutorService f8133e;

    public C3598e(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f8133e = scheduledExecutorService;
    }

    @Override // defpackage.C0918e, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        AbstractC6418e.advert(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC9859e runnableFutureC9859e = new RunnableFutureC9859e(Executors.callable(runnable, null));
        return new ScheduledFutureC15846e(runnableFutureC9859e, this.f8133e.schedule(runnableFutureC9859e, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC9859e runnableFutureC9859e = new RunnableFutureC9859e(callable);
        return new ScheduledFutureC15846e(runnableFutureC9859e, this.f8133e.schedule(runnableFutureC9859e, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC17603e runnableC17603e = new RunnableC17603e(runnable);
        return new ScheduledFutureC15846e(runnableC17603e, this.f8133e.scheduleAtFixedRate(runnableC17603e, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC17603e runnableC17603e = new RunnableC17603e(runnable);
        return new ScheduledFutureC15846e(runnableC17603e, this.f8133e.scheduleWithFixedDelay(runnableC17603e, j, j2, timeUnit));
    }
}
