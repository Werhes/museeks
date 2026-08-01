package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18423e implements ListenableFuture {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Object f36118e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final AbstractC3697e f36119e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public volatile C16839e f36120e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile C9934e f36121e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public volatile Object f36122e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final boolean f36117e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final Logger f36116e = Logger.getLogger(AbstractC18423e.class.getName());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [eَؕۢ] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        ?? r3;
        try {
            th = null;
            r3 = new C3099e(AtomicReferenceFieldUpdater.newUpdater(C16839e.class, Thread.class, "ad"), AtomicReferenceFieldUpdater.newUpdater(C16839e.class, C16839e.class, "vip"), AtomicReferenceFieldUpdater.newUpdater(AbstractC18423e.class, C16839e.class, "eًؔؐ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC18423e.class, C9934e.class, "eؘٙؓ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC18423e.class, Object.class, "eّٖۦ"));
        } catch (Throwable th) {
            th = th;
            r3 = new Object();
        }
        f36119e = r3;
        if (th != null) {
            f36116e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f36118e = new Object();
    }

    public static Object appmetrica(Object obj) {
        if (obj instanceof C12216e) {
            Throwable th = ((C12216e) obj).vip;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C3148e) {
            throw new ExecutionException(((C3148e) obj).ad);
        }
        if (obj == f36118e) {
            return null;
        }
        return obj;
    }

    public static void license(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f36116e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static void metrica(AbstractC18423e abstractC18423e) {
        C9934e c9934e;
        C9934e c9934e2;
        C9934e c9934e3 = null;
        while (true) {
            C16839e c16839e = abstractC18423e.f36120e;
            if (f36119e.metrica(abstractC18423e, c16839e, C16839e.metrica)) {
                while (c16839e != null) {
                    Thread thread = c16839e.ad;
                    if (thread != null) {
                        c16839e.ad = null;
                        LockSupport.unpark(thread);
                    }
                    c16839e = c16839e.vip;
                }
                do {
                    c9934e = abstractC18423e.f36121e;
                } while (!f36119e.ad(abstractC18423e, c9934e, C9934e.license));
                while (true) {
                    c9934e2 = c9934e3;
                    c9934e3 = c9934e;
                    if (c9934e3 == null) {
                        break;
                    }
                    c9934e = c9934e3.metrica;
                    c9934e3.metrica = c9934e2;
                }
                while (c9934e2 != null) {
                    c9934e3 = c9934e2.metrica;
                    Runnable runnable = c9934e2.ad;
                    if (runnable instanceof RunnableC7789e) {
                        RunnableC7789e runnableC7789e = (RunnableC7789e) runnable;
                        abstractC18423e = runnableC7789e.f15790e;
                        if (abstractC18423e.f36122e == runnableC7789e) {
                            if (f36119e.vip(abstractC18423e, runnableC7789e, purchase(runnableC7789e.f15789e))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        license(runnable, c9934e2.vip);
                    }
                    c9934e2 = c9934e3;
                }
                return;
            }
        }
    }

    public static Object purchase(ListenableFuture listenableFuture) {
        Object obj;
        if (listenableFuture instanceof AbstractC18423e) {
            Object obj2 = ((AbstractC18423e) listenableFuture).f36122e;
            if (!(obj2 instanceof C12216e)) {
                return obj2;
            }
            C12216e c12216e = (C12216e) obj2;
            return c12216e.ad ? c12216e.vip != null ? new C12216e(c12216e.vip, false) : C12216e.license : obj2;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!f36117e) && isCancelled) {
            return C12216e.license;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e) {
                if (isCancelled) {
                    return new C12216e(e, false);
                }
                return new C3148e(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
            } catch (ExecutionException e2) {
                return new C3148e(e2.getCause());
            } catch (Throwable th2) {
                return new C3148e(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f36118e : obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void ad(Runnable runnable, Executor executor) {
        executor.getClass();
        C9934e c9934e = this.f36121e;
        C9934e c9934e2 = C9934e.license;
        if (c9934e != c9934e2) {
            C9934e c9934e3 = new C9934e(runnable, executor);
            do {
                c9934e3.metrica = c9934e;
                if (f36119e.ad(this, c9934e, c9934e3)) {
                    return;
                } else {
                    c9934e = this.f36121e;
                }
            } while (c9934e != c9934e2);
        }
        license(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String billing() {
        Object obj = this.f36122e;
        if (obj instanceof RunnableC7789e) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ListenableFuture listenableFuture = ((RunnableC7789e) obj).f15789e;
            return AbstractC1786e.signatures(sb, listenableFuture == this ? "this future" : String.valueOf(listenableFuture), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f36122e;
        if (!(obj == null) && !(obj instanceof RunnableC7789e)) {
            return false;
        }
        C12216e c12216e = f36117e ? new C12216e(new CancellationException("Future.cancel() was called."), z) : z ? C12216e.metrica : C12216e.license;
        AbstractC18423e abstractC18423e = this;
        boolean z2 = false;
        while (true) {
            if (f36119e.vip(abstractC18423e, obj, c12216e)) {
                metrica(abstractC18423e);
                if (!(obj instanceof RunnableC7789e)) {
                    break;
                }
                ListenableFuture listenableFuture = ((RunnableC7789e) obj).f15789e;
                if (!(listenableFuture instanceof AbstractC18423e)) {
                    listenableFuture.cancel(z);
                    break;
                }
                abstractC18423e = (AbstractC18423e) listenableFuture;
                obj = abstractC18423e.f36122e;
                if (!(obj == null) && !(obj instanceof RunnableC7789e)) {
                    break;
                }
                z2 = true;
            } else {
                obj = abstractC18423e.f36122e;
                if (!(obj instanceof RunnableC7789e)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        C16839e c16839e = C16839e.metrica;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f36122e;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC7789e))) {
            return appmetrica(obj2);
        }
        C16839e c16839e2 = this.f36120e;
        if (c16839e2 != c16839e) {
            C16839e c16839e3 = new C16839e();
            do {
                AbstractC3697e abstractC3697e = f36119e;
                abstractC3697e.appmetrica(c16839e3, c16839e2);
                if (abstractC3697e.metrica(this, c16839e2, c16839e3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            yandex(c16839e3);
                            throw new InterruptedException();
                        }
                        obj = this.f36122e;
                    } while (!((obj != null) & (!(obj instanceof RunnableC7789e))));
                    return appmetrica(obj);
                }
                c16839e2 = this.f36120e;
            } while (c16839e2 != c16839e);
        }
        return appmetrica(this.f36122e);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b0 -> B:33:0x0078). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC18423e.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f36122e instanceof C12216e;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof RunnableC7789e)) & (this.f36122e != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f36122e instanceof C12216e) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            vip(sb);
        } else {
            try {
                str = billing();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                vip(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void vip(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void yandex(C16839e c16839e) {
        c16839e.ad = null;
        while (true) {
            C16839e c16839e2 = this.f36120e;
            if (c16839e2 == C16839e.metrica) {
                return;
            }
            C16839e c16839e3 = null;
            while (c16839e2 != null) {
                C16839e c16839e4 = c16839e2.vip;
                if (c16839e2.ad != null) {
                    c16839e3 = c16839e2;
                } else if (c16839e3 != null) {
                    c16839e3.vip = c16839e4;
                    if (c16839e3.ad == null) {
                        break;
                    }
                } else if (!f36119e.metrica(this, c16839e2, c16839e4)) {
                    break;
                }
                c16839e2 = c16839e4;
            }
            return;
        }
    }
}
