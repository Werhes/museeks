package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8724e implements ListenableFuture {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f17594e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0485e f17595e = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4420e f17596e;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, eؑۖؒ] */
    public C8724e(C4420e c4420e) {
        this.f17596e = c4420e;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void ad(Runnable runnable, Executor executor) {
        this.f17595e.ad(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.f17595e.cancel(z)) {
            return false;
        }
        this.f17596e.Signature(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj = this.f17595e.get();
        if (obj instanceof C16513e) {
            throw new CancellationException().initCause(((C16513e) obj).ad);
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj = this.f17595e.get(j, timeUnit);
        if (obj instanceof C16513e) {
            throw new CancellationException().initCause(((C16513e) obj).ad);
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        boolean z;
        if (this.f17595e.f2776e instanceof C8973e) {
            return true;
        }
        if (this.f17595e.isDone() && !this.f17594e) {
            try {
                z = AbstractC17976e.vip(this.f17595e) instanceof C16513e;
            } catch (CancellationException unused) {
                z = true;
            } catch (ExecutionException unused2) {
                this.f17594e = true;
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f17595e.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        C0485e c0485e = this.f17595e;
        if (c0485e.isDone()) {
            try {
                Object vip = AbstractC17976e.vip(c0485e);
                if (vip instanceof C16513e) {
                    sb.append("CANCELLED, cause=[" + ((C16513e) vip).ad + ']');
                } else {
                    sb.append("SUCCESS, result=[" + vip + ']');
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + ']');
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + c0485e + ']');
        }
        sb.append(']');
        return sb.toString();
    }
}
