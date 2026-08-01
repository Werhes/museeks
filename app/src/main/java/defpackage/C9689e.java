package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9689e implements ListenableFuture {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C10314e f19184e = new C10314e(this);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final WeakReference f19185e;

    public C9689e(C7169e c7169e) {
        this.f19185e = new WeakReference(c7169e);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void ad(Runnable runnable, Executor executor) {
        this.f19184e.ad(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C7169e c7169e = (C7169e) this.f19185e.get();
        boolean cancel = this.f19184e.cancel(z);
        if (cancel && c7169e != null) {
            c7169e.ad = null;
            c7169e.vip = null;
            c7169e.metrica.adcel(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f19184e.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f19184e.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19184e.f15982e instanceof C7442e;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19184e.isDone();
    }

    public final String toString() {
        return this.f19184e.toString();
    }
}
