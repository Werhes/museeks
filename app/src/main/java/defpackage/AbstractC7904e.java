package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7904e implements ListenableFuture {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Object f15978e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final AbstractC7861e f15979e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public volatile C5109e f15980e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile C16267e f15981e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public volatile Object f15982e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final boolean f15977e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final Logger f15976e = Logger.getLogger(AbstractC7904e.class.getName());

    static {
        AbstractC7861e abstractC7861e;
        try {
            abstractC7861e = new C16231e(AtomicReferenceFieldUpdater.newUpdater(C5109e.class, Thread.class, "ad"), AtomicReferenceFieldUpdater.newUpdater(C5109e.class, C5109e.class, "vip"), AtomicReferenceFieldUpdater.newUpdater(AbstractC7904e.class, C5109e.class, "eًؔؐ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC7904e.class, C16267e.class, "eؘٙؓ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC7904e.class, Object.class, "eّٖۦ"));
            th = null;
        } catch (Throwable th) {
            th = th;
            abstractC7861e = new AbstractC7861e(2);
        }
        f15979e = abstractC7861e;
        if (th != null) {
            f15976e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15978e = new Object();
    }

    public static void appmetrica(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f15976e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object billing(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void license(AbstractC7904e abstractC7904e) {
        C5109e c5109e;
        C16267e c16267e;
        C16267e c16267e2;
        C16267e c16267e3;
        do {
            c5109e = abstractC7904e.f15980e;
        } while (!f15979e.purchase(abstractC7904e, c5109e, C5109e.metrica));
        while (true) {
            c16267e = null;
            if (c5109e == null) {
                break;
            }
            Thread thread = c5109e.ad;
            if (thread != null) {
                c5109e.ad = null;
                LockSupport.unpark(thread);
            }
            c5109e = c5109e.vip;
        }
        abstractC7904e.metrica();
        do {
            c16267e2 = abstractC7904e.f15981e;
        } while (!f15979e.license(abstractC7904e, c16267e2, C16267e.license));
        while (true) {
            c16267e3 = c16267e;
            c16267e = c16267e2;
            if (c16267e == null) {
                break;
            }
            c16267e2 = c16267e.metrica;
            c16267e.metrica = c16267e3;
        }
        while (c16267e3 != null) {
            C16267e c16267e4 = c16267e3.metrica;
            appmetrica(c16267e3.ad, c16267e3.vip);
            c16267e3 = c16267e4;
        }
    }

    public static Object purchase(Object obj) {
        if (obj instanceof C7442e) {
            Throwable th = ((C7442e) obj).vip;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C14640e) {
            throw new ExecutionException(((C14640e) obj).ad);
        }
        if (obj == f15978e) {
            return null;
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void ad(Runnable runnable, Executor executor) {
        executor.getClass();
        C16267e c16267e = this.f15981e;
        C16267e c16267e2 = C16267e.license;
        if (c16267e != c16267e2) {
            C16267e c16267e3 = new C16267e(runnable, executor);
            do {
                c16267e3.metrica = c16267e;
                if (f15979e.license(this, c16267e, c16267e3)) {
                    return;
                } else {
                    c16267e = this.f15981e;
                }
            } while (c16267e != c16267e2);
        }
        appmetrica(runnable, executor);
    }

    public boolean adcel(Object obj) {
        if (obj == null) {
            obj = f15978e;
        }
        if (!f15979e.appmetrica(this, null, obj)) {
            return false;
        }
        license(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f15982e;
        if (obj == null) {
            if (f15979e.appmetrica(this, obj, f15977e ? new C7442e(new CancellationException("Future.cancel() was called."), z) : z ? C7442e.metrica : C7442e.license)) {
                license(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        C5109e c5109e = C5109e.metrica;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f15982e;
        if (obj2 != null) {
            return purchase(obj2);
        }
        C5109e c5109e2 = this.f15980e;
        if (c5109e2 != c5109e) {
            C5109e c5109e3 = new C5109e();
            do {
                AbstractC7861e abstractC7861e = f15979e;
                abstractC7861e.isVip(c5109e3, c5109e2);
                if (abstractC7861e.purchase(this, c5109e2, c5109e3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            startapp(c5109e3);
                            throw new InterruptedException();
                        }
                        obj = this.f15982e;
                    } while (obj == null);
                    return purchase(obj);
                }
                c5109e2 = this.f15980e;
            } while (c5109e2 != c5109e);
        }
        return purchase(this.f15982e);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        C5109e c5109e = C5109e.metrica;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f15982e;
        if (obj != null) {
            return purchase(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C5109e c5109e2 = this.f15980e;
            if (c5109e2 != c5109e) {
                C5109e c5109e3 = new C5109e();
                do {
                    AbstractC7861e abstractC7861e = f15979e;
                    abstractC7861e.isVip(c5109e3, c5109e2);
                    if (abstractC7861e.purchase(this, c5109e2, c5109e3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                startapp(c5109e3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f15982e;
                            if (obj2 != null) {
                                return purchase(obj2);
                            }
                            long nanoTime2 = nanoTime - System.nanoTime();
                            if (nanoTime2 < 1000) {
                                startapp(c5109e3);
                                nanos = nanoTime2;
                                break;
                            }
                            nanos = nanoTime2;
                        }
                    } else {
                        c5109e2 = this.f15980e;
                    }
                } while (c5109e2 != c5109e);
            }
            return purchase(this.f15982e);
        }
        while (nanos > 0) {
            Object obj3 = this.f15982e;
            if (obj3 != null) {
                return purchase(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC7904e = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        StringBuilder inmobi = AbstractC1786e.inmobi(j, "Waited ", " ");
        inmobi.append(timeUnit.toString().toLowerCase(locale));
        String sb = inmobi.toString();
        if (nanos + 1000 < 0) {
            String adcel = AbstractC10257e.adcel(sb, " (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str = adcel + convert + " " + lowerCase;
                if (z) {
                    str = AbstractC10257e.adcel(str, ",");
                }
                adcel = AbstractC10257e.adcel(str, " ");
            }
            if (z) {
                adcel = adcel + nanos2 + " nanoseconds ";
            }
            sb = AbstractC10257e.adcel(adcel, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC10257e.adcel(sb, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC4653e.isPro(sb, " for ", abstractC7904e));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15982e instanceof C7442e;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15982e != null;
    }

    public void metrica() {
    }

    public boolean mopub(Throwable th) {
        th.getClass();
        if (!f15979e.appmetrica(this, null, new C14640e(th))) {
            return false;
        }
        license(this);
        return true;
    }

    public final void startapp(C5109e c5109e) {
        c5109e.ad = null;
        while (true) {
            C5109e c5109e2 = this.f15980e;
            if (c5109e2 == C5109e.metrica) {
                return;
            }
            C5109e c5109e3 = null;
            while (c5109e2 != null) {
                C5109e c5109e4 = c5109e2.vip;
                if (c5109e2.ad != null) {
                    c5109e3 = c5109e2;
                } else if (c5109e3 != null) {
                    c5109e3.vip = c5109e4;
                    if (c5109e3.ad == null) {
                        break;
                    }
                } else if (!f15979e.purchase(this, c5109e2, c5109e4)) {
                    break;
                }
                c5109e2 = c5109e4;
            }
            return;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f15982e instanceof C7442e) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            vip(sb);
        } else {
            try {
                str = yandex();
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
        try {
            Object billing = billing(this);
            sb.append("SUCCESS, result=[");
            sb.append(billing == this ? "this future" : String.valueOf(billing));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String yandex() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }
}
