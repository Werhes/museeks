package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۥٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC13626e implements Executor {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Handler f27028e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27029e;

    public /* synthetic */ ExecutorC13626e(Handler handler, int i) {
        this.f27029e = i;
        this.f27028e = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f27029e) {
            case 0:
                runnable.getClass();
                Handler handler = this.f27028e;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                Handler handler2 = this.f27028e;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
            default:
                this.f27028e.post(runnable);
                return;
        }
    }
}
