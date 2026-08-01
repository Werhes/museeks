package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C4065e implements ListenableFuture {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C4065e f9036e = new C4065e(0, null);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f9037e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9038e;

    public /* synthetic */ C4065e(int i, Object obj) {
        this.f9038e = i;
        this.f9037e = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void ad(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            AbstractC9464e.mopub("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        switch (this.f9038e) {
            case 0:
                return this.f9037e;
            default:
                throw new ExecutionException((Throwable) this.f9037e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
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
        switch (this.f9038e) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + this.f9037e + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.f9037e) + "]]";
        }
    }
}
