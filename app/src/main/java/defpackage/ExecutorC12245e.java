package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC12245e implements Executor {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Executor f24576e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayDeque f24578e = new ArrayDeque();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final RunnableC12991e f24575e = new RunnableC12991e(26, this);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f24577e = 1;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f24574e = 0;

    public ExecutorC12245e(Executor executor) {
        executor.getClass();
        this.f24576e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f24578e) {
            int i = this.f24577e;
            if (i != 4 && i != 3) {
                long j = this.f24574e;
                RunnableC4703e runnableC4703e = new RunnableC4703e(3, runnable);
                this.f24578e.add(runnableC4703e);
                this.f24577e = 2;
                try {
                    this.f24576e.execute(this.f24575e);
                    if (this.f24577e != 2) {
                        return;
                    }
                    synchronized (this.f24578e) {
                        try {
                            if (this.f24574e == j && this.f24577e == 2) {
                                this.f24577e = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f24578e) {
                        try {
                            int i2 = this.f24577e;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f24578e.removeLastOccurrence(runnableC4703e)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f24578e.add(runnable);
        }
    }
}
