package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؔۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15972e implements ListenableFuture {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6566e f31490e = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙٟۢ, java.lang.Object] */
    public C15972e(C6799e c6799e) {
        c6799e.mo692else(new C17097e(23, this));
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void ad(Runnable runnable, Executor executor) {
        this.f31490e.ad(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f31490e.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f31490e.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f31490e.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f31490e.f36122e instanceof C12216e;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f31490e.isDone();
    }
}
