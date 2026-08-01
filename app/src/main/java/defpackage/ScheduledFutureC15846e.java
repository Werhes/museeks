package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۥۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ScheduledFutureC15846e extends AbstractC16994e implements ScheduledFuture, ListenableFuture, Future {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final ScheduledFuture f31270e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AbstractC0586e f31271e;

    public ScheduledFutureC15846e(AbstractC0586e abstractC0586e, ScheduledFuture scheduledFuture) {
        super(3);
        this.f31271e = abstractC0586e;
        this.f31270e = scheduledFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void ad(Runnable runnable, Executor executor) {
        this.f31271e.ad(runnable, executor);
    }

    @Override // defpackage.AbstractC16994e
    public final Object billing() {
        return this.f31271e;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean loadAd = loadAd(z);
        if (loadAd) {
            this.f31270e.cancel(z);
        }
        return loadAd;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f31270e.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f31271e.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f31271e.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f31270e.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f31271e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f31271e.isDone();
    }

    public final boolean loadAd(boolean z) {
        return this.f31271e.cancel(z);
    }
}
