package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ۟ۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC12022e implements Executor {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C8209e f24042e = new C8209e(ExecutorC12022e.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Executor f24047e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayDeque f24045e = new ArrayDeque();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f24044e = 1;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f24046e = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final RunnableC17144e f24043e = new RunnableC17144e(18, this);

    public ExecutorC12022e(Executor executor) {
        executor.getClass();
        this.f24047e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f24045e) {
            int i = this.f24044e;
            if (i != 4 && i != 3) {
                long j = this.f24046e;
                RunnableC4703e runnableC4703e = new RunnableC4703e(1, runnable);
                this.f24045e.add(runnableC4703e);
                this.f24044e = 2;
                try {
                    this.f24047e.execute(this.f24043e);
                    if (this.f24044e != 2) {
                        return;
                    }
                    synchronized (this.f24045e) {
                        try {
                            if (this.f24046e == j && this.f24044e == 2) {
                                this.f24044e = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (this.f24045e) {
                        try {
                            int i2 = this.f24044e;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f24045e.removeLastOccurrence(runnableC4703e)) {
                                z = false;
                            }
                            if (!(th instanceof RejectedExecutionException) || z) {
                                throw th;
                            }
                            return;
                        } finally {
                        }
                    }
                }
            }
            this.f24045e.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f24047e + "}";
    }
}
