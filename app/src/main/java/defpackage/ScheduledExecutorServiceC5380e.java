package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScheduledExecutorServiceC5380e extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Handler f11516e;

    static {
        new C6121e(8);
    }

    public ScheduledExecutorServiceC5380e(Handler handler) {
        this.f11516e = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5380e.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        AbstractC6418e.adcel(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.f11516e;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new CallableC8878e(1, runnable), j, timeUnit);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.concurrent.ScheduledFuture, eّؖٝ] */
    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.f11516e;
        RunnableScheduledFutureC13419e runnableScheduledFutureC13419e = new RunnableScheduledFutureC13419e(handler, convert, callable);
        if (handler.postAtTime(runnableScheduledFutureC13419e, convert)) {
            return runnableScheduledFutureC13419e;
        }
        return new C4065e(1, new RejectedExecutionException(handler + " is shutting down"));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5380e.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5380e.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5380e.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5380e.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }
}
