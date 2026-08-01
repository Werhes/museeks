package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC12660e implements Executor {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final Logger f25379e = Logger.getLogger(ExecutorC12660e.class.getName());

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Executor f25384e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayDeque f25382e = new ArrayDeque();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f25381e = 1;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f25383e = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final RunnableC17144e f25380e = new RunnableC17144e(19, this);

    public ExecutorC12660e(Executor executor) {
        AbstractC9528e.startapp(executor);
        this.f25384e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC9528e.startapp(runnable);
        synchronized (this.f25382e) {
            int i = this.f25381e;
            if (i != 4 && i != 3) {
                long j = this.f25383e;
                RunnableC4703e runnableC4703e = new RunnableC4703e(2, runnable);
                this.f25382e.add(runnableC4703e);
                this.f25381e = 2;
                try {
                    this.f25384e.execute(this.f25380e);
                    if (this.f25381e != 2) {
                        return;
                    }
                    synchronized (this.f25382e) {
                        try {
                            if (this.f25383e == j && this.f25381e == 2) {
                                this.f25381e = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f25382e) {
                        try {
                            int i2 = this.f25381e;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f25382e.removeLastOccurrence(runnableC4703e)) {
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
            this.f25382e.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f25384e + "}";
    }
}
