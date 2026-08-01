package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC17731e implements Executor {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f34767e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Executor f34768e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34769e;

    public /* synthetic */ ExecutorC17731e(Executor executor, Object obj, int i) {
        this.f34769e = i;
        this.f34768e = executor;
        this.f34767e = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f34769e) {
            case 0:
                try {
                    this.f34768e.execute(runnable);
                    return;
                } catch (RejectedExecutionException e) {
                    ((AbstractC16326e) this.f34767e).amazon(e);
                    return;
                }
            default:
                this.f34768e.execute(runnable);
                return;
        }
    }
}
