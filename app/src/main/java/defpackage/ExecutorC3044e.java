package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؐؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC3044e implements Executor {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static volatile ExecutorC3044e f7106e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f7107e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7108e;

    public ExecutorC3044e() {
        this.f7108e = 0;
        this.f7107e = Executors.newSingleThreadExecutor(new ThreadFactoryC4501e(0));
    }

    public /* synthetic */ ExecutorC3044e(int i, Object obj) {
        this.f7108e = i;
        this.f7107e = obj;
    }

    public ExecutorC3044e(Looper looper) {
        this.f7108e = 1;
        this.f7107e = new HandlerC9134e(looper, 7);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7108e) {
            case 0:
                ((ExecutorService) this.f7107e).execute(runnable);
                return;
            case 1:
                ((HandlerC9134e) this.f7107e).post(runnable);
                return;
            case 2:
                ((Handler) ((C0912e) this.f7107e).f3331e).post(runnable);
                return;
            default:
                C6915e c6915e = ((C6936e) ((C8320e) this.f7107e).f36443e).f14226e;
                C6936e.yandex(c6915e);
                c6915e.m2254e(runnable);
                return;
        }
    }
}
