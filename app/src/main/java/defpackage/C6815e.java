package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۧ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C6815e implements ListenableFuture {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C7169e f14033e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ListenableFuture f14034e;

    public C6815e() {
        this.f14034e = AbstractC5750e.purchase(new C5389e(13, this));
    }

    public C6815e(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.f14034e = listenableFuture;
    }

    public static C6815e vip(ListenableFuture listenableFuture) {
        return listenableFuture instanceof C6815e ? (C6815e) listenableFuture : new C6815e(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void ad(Runnable runnable, Executor executor) {
        this.f14034e.ad(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f14034e.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f14034e.get();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.f14034e.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14034e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14034e.isDone();
    }
}
