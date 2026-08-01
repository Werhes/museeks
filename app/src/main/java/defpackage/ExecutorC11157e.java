package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٞ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC11157e implements Executor {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f22381e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f22382e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f22383e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f22384e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22385e;

    public ExecutorC11157e(ExecutorC8172e executorC8172e) {
        this.f22385e = 0;
        this.f22383e = new Object();
        this.f22382e = new ArrayDeque();
        this.f22384e = executorC8172e;
    }

    public /* synthetic */ ExecutorC11157e(Executor executor, C0731e c0731e, C15816e c15816e, C8988e c8988e) {
        this.f22385e = 1;
        this.f22383e = executor;
        this.f22382e = c0731e;
        this.f22384e = c15816e;
        this.f22381e = c8988e;
    }

    public void ad() {
        synchronized (this.f22383e) {
            try {
                Runnable runnable = (Runnable) ((ArrayDeque) this.f22382e).poll();
                this.f22381e = runnable;
                if (runnable != null) {
                    ((ExecutorC8172e) this.f22384e).execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f22385e) {
            case 0:
                synchronized (this.f22383e) {
                    try {
                        ((ArrayDeque) this.f22382e).add(new RunnableC16019e(this, runnable, 4));
                        if (((Runnable) this.f22381e) == null) {
                            ad();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                try {
                    ((Executor) this.f22383e).execute(runnable);
                    return;
                } catch (RuntimeException e) {
                    if (((C0560e) ((C0731e) this.f22382e).f3025e).mopub()) {
                        ((C15816e) this.f22384e).pro();
                    } else {
                        ((C8988e) this.f22381e).ad(e);
                    }
                    throw e;
                }
        }
    }
}
