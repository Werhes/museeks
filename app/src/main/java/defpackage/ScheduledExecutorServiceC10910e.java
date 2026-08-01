package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ScheduledExecutorServiceC10910e extends C8013e implements ScheduledExecutorService {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ScheduledExecutorService f21612e;

    public ScheduledExecutorServiceC10910e(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f21612e = scheduledExecutorService;
    }

    @Override // defpackage.C8013e, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        AbstractC6418e.Signature(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC3479e runnableFutureC3479e = new RunnableFutureC3479e(Executors.callable(runnable, null));
        return new ScheduledFutureC11729e(runnableFutureC3479e, this.f21612e.schedule(runnableFutureC3479e, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC3479e runnableFutureC3479e = new RunnableFutureC3479e(callable);
        return new ScheduledFutureC11729e(runnableFutureC3479e, this.f21612e.schedule(runnableFutureC3479e, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC12572e runnableC12572e = new RunnableC12572e(runnable);
        return new ScheduledFutureC11729e(runnableC12572e, this.f21612e.scheduleAtFixedRate(runnableC12572e, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC12572e runnableC12572e = new RunnableC12572e(runnable);
        return new ScheduledFutureC11729e(runnableC12572e, this.f21612e.scheduleWithFixedDelay(runnableC12572e, j, j2, timeUnit));
    }
}
