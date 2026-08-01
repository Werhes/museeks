package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0918e extends AbstractExecutorService implements InterfaceExecutorServiceC13317e, AutoCloseable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ExecutorService f3342e;

    public C0918e(ExecutorService executorService) {
        executorService.getClass();
        this.f3342e = executorService;
    }

    public final ListenableFuture ad(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f3342e.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        AbstractC6418e.mopub(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3342e.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f3342e.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f3342e.isTerminated();
    }

    public final ListenableFuture license(RunnableC12554e runnableC12554e) {
        return (ListenableFuture) super.submit(runnableC12554e);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC9859e(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC9859e(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f3342e.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f3342e.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return (ListenableFuture) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }

    public final String toString() {
        return super.toString() + "[" + this.f3342e + "]";
    }
}
