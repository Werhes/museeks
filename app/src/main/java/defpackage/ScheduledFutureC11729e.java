package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؚٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ScheduledFutureC11729e extends AbstractC5967e implements ScheduledFuture, ListenableFuture, Future {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ScheduledFuture f23569e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC2074e f23570e;

    public ScheduledFutureC11729e(AbstractC2074e abstractC2074e, ScheduledFuture scheduledFuture) {
        this.f23570e = abstractC2074e;
        this.f23569e = scheduledFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void ad(Runnable runnable, Executor executor) {
        this.f23570e.ad(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = this.f23570e.cancel(z);
        if (cancel) {
            this.f23569e.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f23569e.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f23570e.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f23570e.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f23569e.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f23570e.f26540e instanceof C16983e;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f23570e.isDone();
    }
}
