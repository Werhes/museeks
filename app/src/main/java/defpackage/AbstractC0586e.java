package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
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
/* renamed from: eؚؑ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0586e extends AbstractC16520e implements ListenableFuture {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C8209e f2770e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final boolean f2771e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Object f2772e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final AbstractC0326e f2773e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public volatile C2694e f2774e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile C17100e f2775e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public volatile Object f2776e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [eٕؑۛ] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    static {
        boolean z;
        Throwable th;
        ?? c11251e;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f2771e = z;
        f2770e = new C8209e(AbstractC0586e.class);
        Throwable th2 = null;
        try {
            th = null;
            c11251e = new Object();
        } catch (Error | Exception e) {
            th = e;
            try {
                c11251e = new C11251e(AtomicReferenceFieldUpdater.newUpdater(C2694e.class, Thread.class, "ad"), AtomicReferenceFieldUpdater.newUpdater(C2694e.class, C2694e.class, "vip"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0586e.class, C2694e.class, "eًؔؐ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0586e.class, C17100e.class, "eؘٙؓ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0586e.class, Object.class, "eّٖۦ"));
            } catch (Error | Exception e2) {
                th2 = e2;
                c11251e = new Object();
            }
        }
        f2773e = c11251e;
        if (th2 != null) {
            C8209e c8209e = f2770e;
            Logger vip = c8209e.vip();
            Level level = Level.SEVERE;
            vip.log(level, "UnsafeAtomicHelper is broken!", th);
            c8209e.vip().log(level, "SafeAtomicHelper is broken!", th2);
        }
        f2772e = new Object();
    }

    public static void billing(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f2770e.vip().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static void purchase(AbstractC0586e abstractC0586e, boolean z) {
        C17100e c17100e = null;
        while (true) {
            for (C2694e mopub = f2773e.mopub(abstractC0586e); mopub != null; mopub = mopub.vip) {
                Thread thread = mopub.ad;
                if (thread != null) {
                    mopub.ad = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                abstractC0586e.adcel();
                z = false;
            }
            abstractC0586e.license();
            C17100e c17100e2 = c17100e;
            C17100e adcel = f2773e.adcel(abstractC0586e);
            C17100e c17100e3 = c17100e2;
            while (adcel != null) {
                C17100e c17100e4 = adcel.metrica;
                adcel.metrica = c17100e3;
                c17100e3 = adcel;
                adcel = c17100e4;
            }
            while (c17100e3 != null) {
                c17100e = c17100e3.metrica;
                Runnable runnable = c17100e3.ad;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC4797e) {
                    RunnableC4797e runnableC4797e = (RunnableC4797e) runnable;
                    abstractC0586e = runnableC4797e.f10226e;
                    if (abstractC0586e.f2776e == runnableC4797e) {
                        if (f2773e.license(abstractC0586e, runnableC4797e, startapp(runnableC4797e.f10225e))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c17100e3.vip;
                    Objects.requireNonNull(executor);
                    billing(runnable, executor);
                }
                c17100e3 = c17100e;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object startapp(ListenableFuture listenableFuture) {
        Object obj;
        Throwable vip;
        if (listenableFuture instanceof InterfaceC15851e) {
            Object obj2 = ((AbstractC0586e) listenableFuture).f2776e;
            if (obj2 instanceof C8973e) {
                C8973e c8973e = (C8973e) obj2;
                if (c8973e.ad) {
                    obj2 = c8973e.vip != null ? new C8973e(c8973e.vip, false) : C8973e.license;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((listenableFuture instanceof AbstractC16520e) && (vip = ((AbstractC16520e) listenableFuture).vip()) != null) {
            return new C15059e(vip);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!f2771e) && isCancelled) {
            C8973e c8973e2 = C8973e.license;
            Objects.requireNonNull(c8973e2);
            return c8973e2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new C15059e(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new C15059e(e);
            } catch (CancellationException e3) {
                if (isCancelled) {
                    return new C8973e(e3, false);
                }
                return new C15059e(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e3));
            } catch (ExecutionException e4) {
                if (!isCancelled) {
                    return new C15059e(e4.getCause());
                }
                return new C8973e(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e4), false);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? f2772e : obj;
        }
        return new C8973e(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture), false);
    }

    public static Object yandex(Object obj) {
        if (obj instanceof C8973e) {
            Throwable th = ((C8973e) obj).vip;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C15059e) {
            throw new ExecutionException(((C15059e) obj).ad);
        }
        if (obj == f2772e) {
            return null;
        }
        return obj;
    }

    public final boolean Signature() {
        Object obj = this.f2776e;
        return (obj instanceof C8973e) && ((C8973e) obj).ad;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void ad(Runnable runnable, Executor executor) {
        C17100e c17100e;
        C17100e c17100e2 = C17100e.license;
        AbstractC2301e.amazon(executor, "Executor was null.");
        if (!isDone() && (c17100e = this.f2775e) != c17100e2) {
            C17100e c17100e3 = new C17100e(runnable, executor);
            do {
                c17100e3.metrica = c17100e;
                if (f2773e.metrica(this, c17100e, c17100e3)) {
                    return;
                } else {
                    c17100e = this.f2775e;
                }
            } while (c17100e != c17100e2);
        }
        billing(runnable, executor);
    }

    public void adcel() {
    }

    public final void advert(C2694e c2694e) {
        c2694e.ad = null;
        while (true) {
            C2694e c2694e2 = this.f2774e;
            if (c2694e2 == C2694e.metrica) {
                return;
            }
            C2694e c2694e3 = null;
            while (c2694e2 != null) {
                C2694e c2694e4 = c2694e2.vip;
                if (c2694e2.ad != null) {
                    c2694e3 = c2694e2;
                } else if (c2694e3 != null) {
                    c2694e3.vip = c2694e4;
                    if (c2694e3.ad == null) {
                        break;
                    }
                } else if (!f2773e.appmetrica(this, c2694e2, c2694e4)) {
                    break;
                }
                c2694e2 = c2694e4;
            }
            return;
        }
    }

    public boolean amazon(Throwable th) {
        th.getClass();
        if (!f2773e.license(this, null, new C15059e(th))) {
            return false;
        }
        purchase(this, false);
        return true;
    }

    public final void appmetrica(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f2776e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof defpackage.RunnableC4797e
            r3 = r3 | r4
            if (r3 == 0) goto L5e
            boolean r3 = defpackage.AbstractC0586e.f2771e
            if (r3 == 0) goto L1f
            eٌؚۛ r3 = new eٌؚۛ
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r4, r8)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            eٌؚۛ r3 = defpackage.C8973e.metrica
            goto L26
        L24:
            eٌؚۛ r3 = defpackage.C8973e.license
        L26:
            j$.util.Objects.requireNonNull(r3)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            eٕؑۛ r6 = defpackage.AbstractC0586e.f2773e
            boolean r6 = r6.license(r4, r0, r3)
            if (r6 == 0) goto L57
            purchase(r4, r8)
            boolean r4 = r0 instanceof defpackage.RunnableC4797e
            if (r4 == 0) goto L56
            eَُؗ r0 = (defpackage.RunnableC4797e) r0
            com.google.common.util.concurrent.ListenableFuture r0 = r0.f10225e
            boolean r4 = r0 instanceof defpackage.InterfaceC15851e
            if (r4 == 0) goto L53
            r4 = r0
            eؚؑ۟ r4 = (defpackage.AbstractC0586e) r4
            java.lang.Object r0 = r4.f2776e
            if (r0 != 0) goto L4b
            r5 = r1
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof defpackage.RunnableC4797e
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = r1
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            return r1
        L57:
            java.lang.Object r0 = r4.f2776e
            boolean r6 = r0 instanceof defpackage.RunnableC4797e
            if (r6 != 0) goto L2b
            return r5
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0586e.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        C2694e c2694e = C2694e.metrica;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f2776e;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC4797e))) {
            return yandex(obj2);
        }
        C2694e c2694e2 = this.f2774e;
        if (c2694e2 != c2694e) {
            C2694e c2694e3 = new C2694e();
            do {
                AbstractC0326e abstractC0326e = f2773e;
                abstractC0326e.amazon(c2694e3, c2694e2);
                if (abstractC0326e.appmetrica(this, c2694e2, c2694e3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            advert(c2694e3);
                            throw new InterruptedException();
                        }
                        obj = this.f2776e;
                    } while (!((obj != null) & (!(obj instanceof RunnableC4797e))));
                    return yandex(obj);
                }
                c2694e2 = this.f2774e;
            } while (c2694e2 != c2694e);
        }
        Object obj3 = this.f2776e;
        Objects.requireNonNull(obj3);
        return yandex(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c6 -> B:34:0x0083). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(long r21, java.util.concurrent.TimeUnit r23) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0586e.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f2776e instanceof C8973e;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof RunnableC4797e)) & (this.f2776e != null);
    }

    public void license() {
    }

    public boolean loadAd(ListenableFuture listenableFuture) {
        C15059e c15059e;
        listenableFuture.getClass();
        Object obj = this.f2776e;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (f2773e.license(this, null, startapp(listenableFuture))) {
                    purchase(this, false);
                    return true;
                }
                return false;
            }
            RunnableC4797e runnableC4797e = new RunnableC4797e(this, listenableFuture);
            if (f2773e.license(this, null, runnableC4797e)) {
                try {
                    listenableFuture.ad(runnableC4797e, EnumC3320e.f7489e);
                    return true;
                } catch (Throwable th) {
                    try {
                        c15059e = new C15059e(th);
                    } catch (Error | Exception unused) {
                        c15059e = C15059e.vip;
                    }
                    f2773e.license(this, runnableC4797e, c15059e);
                    return true;
                }
            }
            obj = this.f2776e;
        }
        if (obj instanceof C8973e) {
            listenableFuture.cancel(((C8973e) obj).ad);
        }
        return false;
    }

    public final void metrica(StringBuilder sb) {
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
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        appmetrica(sb, obj);
        sb.append("]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String mopub() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean smaato(Object obj) {
        if (obj == null) {
            obj = f2772e;
        }
        if (!f2773e.license(this, null, obj)) {
            return false;
        }
        purchase(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Lcf
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.metrica(r0)
            goto Lcf
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.f2776e
            boolean r4 = r3 instanceof defpackage.RunnableC4797e
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L93
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            eَُؗ r3 = (defpackage.RunnableC4797e) r3
            com.google.common.util.concurrent.ListenableFuture r3 = r3.f10225e
            if (r3 != r6) goto L81
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L7d:
            r3 = move-exception
            goto L85
        L7f:
            r3 = move-exception
            goto L85
        L81:
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L85:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8f:
            r0.append(r2)
            goto Lbf
        L93:
            java.lang.String r3 = r6.mopub()     // Catch: java.lang.StackOverflowError -> L9f java.lang.Exception -> La1
            boolean r4 = defpackage.AbstractC8433e.license(r3)     // Catch: java.lang.StackOverflowError -> L9f java.lang.Exception -> La1
            if (r4 == 0) goto Lb2
            r3 = 0
            goto Lb2
        L9f:
            r3 = move-exception
            goto La2
        La1:
            r3 = move-exception
        La2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        Lb2:
            if (r3 == 0) goto Lbf
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lbf:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Lcf
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.metrica(r0)
        Lcf:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0586e.toString():java.lang.String");
    }

    @Override // defpackage.AbstractC16520e
    public final Throwable vip() {
        if (!(this instanceof InterfaceC15851e)) {
            return null;
        }
        Object obj = this.f2776e;
        if (obj instanceof C15059e) {
            return ((C15059e) obj).ad;
        }
        return null;
    }
}
