package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC6131e implements Executor {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Handler f12890e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12891e;

    public ExecutorC6131e() {
        this.f12891e = 0;
        this.f12890e = new Handler(Looper.getMainLooper());
    }

    public ExecutorC6131e(Handler handler) {
        this.f12891e = 1;
        this.f12890e = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f12891e) {
            case 0:
                this.f12890e.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f12890e;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }
}
