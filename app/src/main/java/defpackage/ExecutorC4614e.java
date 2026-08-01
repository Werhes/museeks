package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC4614e implements Executor {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ExecutorService f9946e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f9945e = new Object();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C0560e f9944e = AbstractC1749e.appmetrica(null);

    public ExecutorC4614e(ExecutorService executorService) {
        this.f9946e = executorService;
    }

    public final C0560e ad(Runnable runnable) {
        C0560e yandex;
        synchronized (this.f9945e) {
            yandex = this.f9944e.yandex(this.f9946e, new C0211e(22, runnable));
            this.f9944e = yandex;
        }
        return yandex;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9946e.execute(runnable);
    }

    public final C0560e vip(CallableC9235e callableC9235e) {
        C0560e yandex;
        synchronized (this.f9945e) {
            yandex = this.f9944e.yandex(this.f9946e, new C0211e(21, callableC9235e));
            this.f9944e = yandex;
        }
        return yandex;
    }
}
