package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10904e extends AbstractC6906e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final ListenableFuture f21601e;

    public C10904e(ListenableFuture listenableFuture) {
        this.f21601e = listenableFuture;
    }

    @Override // defpackage.AbstractC0586e, com.google.common.util.concurrent.ListenableFuture
    public final void ad(Runnable runnable, Executor executor) {
        this.f21601e.ad(runnable, executor);
    }

    @Override // defpackage.AbstractC0586e, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f21601e.cancel(z);
    }

    @Override // defpackage.AbstractC0586e, java.util.concurrent.Future
    public final Object get() {
        return this.f21601e.get();
    }

    @Override // defpackage.AbstractC0586e, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f21601e.get(j, timeUnit);
    }

    @Override // defpackage.AbstractC0586e, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f21601e.isCancelled();
    }

    @Override // defpackage.AbstractC0586e, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f21601e.isDone();
    }

    @Override // defpackage.AbstractC0586e
    public final String toString() {
        return this.f21601e.toString();
    }
}
