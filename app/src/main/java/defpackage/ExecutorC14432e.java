package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؐٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC14432e implements Executor {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static volatile ExecutorC14432e f28533e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f28534e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28535e;

    public ExecutorC14432e(int i) {
        this.f28535e = i;
        switch (i) {
            case 2:
                Handler handler = new Handler(Looper.getMainLooper());
                Looper.getMainLooper();
                this.f28534e = handler;
                return;
            default:
                this.f28534e = Executors.newFixedThreadPool(2, new ThreadFactoryC8129e(2));
                return;
        }
    }

    public ExecutorC14432e(ExecutorService executorService) {
        this.f28535e = 1;
        this.f28534e = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f28535e) {
            case 0:
                ((ExecutorService) this.f28534e).execute(runnable);
                return;
            case 1:
                ((Executor) this.f28534e).execute(new RunnableC4703e(0, runnable));
                return;
            default:
                ((HandlerC9134e) this.f28534e).post(runnable);
                return;
        }
    }
}
