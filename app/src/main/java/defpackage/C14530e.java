package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14530e extends AbstractC12934e implements InterfaceC13591e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Executor f28733e;

    public C14530e(Executor executor) {
        Method method;
        this.f28733e = executor;
        Method method2 = AbstractC0704e.ad;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = AbstractC0704e.ad) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.InterfaceC13591e
    public final InterfaceC1232e ad(long j, Runnable runnable, InterfaceC8850e interfaceC8850e) {
        Executor executor = this.f28733e;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                AbstractC6629e.license(interfaceC8850e, AbstractC7070e.ad("The task was rejected", e));
            }
        }
        return scheduledFuture != null ? new C14689e(scheduledFuture) : RunnableC3938e.f8782e.ad(j, runnable, interfaceC8850e);
    }

    @Override // defpackage.AbstractC3743e
    public final void advert(InterfaceC8850e interfaceC8850e, Runnable runnable) {
        try {
            this.f28733e.execute(runnable);
        } catch (RejectedExecutionException e) {
            AbstractC6629e.license(interfaceC8850e, AbstractC7070e.ad("The task was rejected", e));
            C15420e c15420e = AbstractC6731e.ad;
            ExecutorC3603e.f8134e.advert(interfaceC8850e, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f28733e;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C14530e) && ((C14530e) obj).f28733e == this.f28733e;
    }

    @Override // defpackage.AbstractC12934e
    /* renamed from: eؚۜؑ */
    public final Executor mo1383e() {
        return this.f28733e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f28733e);
    }

    @Override // defpackage.InterfaceC13591e
    public final void license(long j, C13578e c13578e) {
        Executor executor = this.f28733e;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            RunnableC17144e runnableC17144e = new RunnableC17144e(this, c13578e, 17);
            InterfaceC8850e interfaceC8850e = c13578e.f26926e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnableC17144e, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                AbstractC6629e.license(interfaceC8850e, AbstractC7070e.ad("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            c13578e.isPro(new C7394e(0, scheduledFuture));
        } else {
            RunnableC3938e.f8782e.license(j, c13578e);
        }
    }

    @Override // defpackage.AbstractC3743e
    public final String toString() {
        return this.f28733e.toString();
    }
}
