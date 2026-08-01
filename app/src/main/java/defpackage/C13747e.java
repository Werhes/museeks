package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13747e implements ListenableFuture {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f27232e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C13747e f27231e = new C13747e(null);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C8209e f27230e = new C8209e(C13747e.class);

    public C13747e(Object obj) {
        this.f27232e = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void ad(Runnable runnable, Executor executor) {
        AbstractC2301e.amazon(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f27230e.vip().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f27232e;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f27232e;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f27232e + "]]";
    }
}
