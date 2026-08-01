package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۘٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC14931e implements Executor, ScheduledExecutorService, AutoCloseable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final ThreadFactoryC8129e f29613e = new ThreadFactoryC8129e(0);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public ScheduledThreadPoolExecutor f29614e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f29615e = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public ExecutorC14931e() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, f29613e);
        scheduledThreadPoolExecutor.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.setRejectedExecutionHandler(new Object());
        this.f29614e = scheduledThreadPoolExecutor;
    }

    public final void ad() {
        synchronized (this.f29615e) {
            try {
                if (!this.f29614e.isShutdown()) {
                    this.f29614e.shutdown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        boolean awaitTermination;
        synchronized (this.f29615e) {
            awaitTermination = this.f29614e.awaitTermination(j, timeUnit);
        }
        return awaitTermination;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        AbstractC6418e.yandex(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f29615e) {
            this.f29614e.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        List invokeAll;
        synchronized (this.f29615e) {
            invokeAll = this.f29614e.invokeAll(collection);
        }
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        List invokeAll;
        synchronized (this.f29615e) {
            invokeAll = this.f29614e.invokeAll(collection, j, timeUnit);
        }
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        Object invokeAny;
        synchronized (this.f29615e) {
            invokeAny = this.f29614e.invokeAny(collection);
        }
        return invokeAny;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        Object invokeAny;
        synchronized (this.f29615e) {
            invokeAny = this.f29614e.invokeAny(collection, j, timeUnit);
        }
        return invokeAny;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean isShutdown;
        synchronized (this.f29615e) {
            isShutdown = this.f29614e.isShutdown();
        }
        return isShutdown;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean isTerminated;
        synchronized (this.f29615e) {
            isTerminated = this.f29614e.isTerminated();
        }
        return isTerminated;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public final void license(C6797e c6797e) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        c6797e.getClass();
        synchronized (this.f29615e) {
            try {
                if (this.f29614e.isShutdown()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, f29613e);
                    scheduledThreadPoolExecutor2.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
                    scheduledThreadPoolExecutor2.setRejectedExecutionHandler(new Object());
                    this.f29614e = scheduledThreadPoolExecutor2;
                }
                scheduledThreadPoolExecutor = this.f29614e;
            } catch (Throwable th) {
                throw th;
            }
        }
        scheduledThreadPoolExecutor.setCorePoolSize(Math.max(1, c6797e.vip().size()));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledFuture<?> schedule;
        synchronized (this.f29615e) {
            schedule = this.f29614e.schedule(runnable, j, timeUnit);
        }
        return schedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        ScheduledFuture schedule;
        synchronized (this.f29615e) {
            schedule = this.f29614e.schedule(callable, j, timeUnit);
        }
        return schedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduleAtFixedRate;
        synchronized (this.f29615e) {
            scheduleAtFixedRate = this.f29614e.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }
        return scheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduleWithFixedDelay;
        synchronized (this.f29615e) {
            scheduleWithFixedDelay = this.f29614e.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }
        return scheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this.f29615e) {
            this.f29614e.shutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> shutdownNow;
        synchronized (this.f29615e) {
            shutdownNow = this.f29614e.shutdownNow();
        }
        return shutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        Future<?> submit;
        synchronized (this.f29615e) {
            submit = this.f29614e.submit(runnable);
        }
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        Future submit;
        synchronized (this.f29615e) {
            submit = this.f29614e.submit(runnable, obj);
        }
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        Future submit;
        synchronized (this.f29615e) {
            submit = this.f29614e.submit(callable);
        }
        return submit;
    }
}
