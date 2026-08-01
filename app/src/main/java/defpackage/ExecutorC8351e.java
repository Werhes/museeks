package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۦً, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC8351e implements Executor {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Executor f17081e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public volatile Runnable f17082e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayDeque f17083e = new ArrayDeque();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f17080e = new Object();

    public ExecutorC8351e(Executor executor) {
        this.f17081e = executor;
    }

    public final boolean ad() {
        boolean z;
        synchronized (this.f17080e) {
            z = !this.f17083e.isEmpty();
        }
        return z;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f17080e) {
            try {
                this.f17083e.add(new RunnableC17144e(this, runnable, 20));
                if (this.f17082e == null) {
                    vip();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void vip() {
        synchronized (this.f17080e) {
            try {
                Runnable runnable = (Runnable) this.f17083e.poll();
                this.f17082e = runnable;
                if (runnable != null) {
                    this.f17081e.execute(this.f17082e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
