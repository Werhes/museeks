package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٟٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableScheduledFutureC13419e implements RunnableScheduledFuture {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Callable f26678e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f26679e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C9689e f26680e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AtomicReference f26681e = new AtomicReference(null);

    public RunnableScheduledFutureC13419e(Handler handler, long j, Callable callable) {
        this.f26679e = j;
        this.f26678e = callable;
        this.f26680e = AbstractC5750e.purchase(new C18478e(this, handler, callable, false, 19));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f26680e.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f26680e.f19184e.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f26680e.f19184e.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f26679e - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26680e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26680e.f19184e.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        C7169e c7169e = (C7169e) this.f26681e.getAndSet(null);
        if (c7169e != null) {
            try {
                c7169e.ad(this.f26678e.call());
            } catch (Exception e) {
                c7169e.metrica(e);
            }
        }
    }
}
