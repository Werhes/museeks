package defpackage;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2074e extends AbstractC13307e {
    public static Object Signature(AbstractC2074e abstractC2074e) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC2074e.get();
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

    public static void admob(AbstractC2074e abstractC2074e) {
        abstractC2074e.getClass();
        for (C9503e amazon = AbstractC13307e.f26536e.amazon(abstractC2074e); amazon != null; amazon = amazon.vip) {
            Thread thread = amazon.ad;
            if (thread != null) {
                amazon.ad = null;
                LockSupport.unpark(thread);
            }
        }
        abstractC2074e.amazon();
        C9563e loadAd = AbstractC13307e.f26536e.loadAd(abstractC2074e);
        C9563e c9563e = null;
        while (loadAd != null) {
            C9563e c9563e2 = loadAd.metrica;
            loadAd.metrica = c9563e;
            c9563e = loadAd;
            loadAd = c9563e2;
        }
        while (c9563e != null) {
            Runnable runnable = c9563e.ad;
            C9563e c9563e3 = c9563e.metrica;
            Objects.requireNonNull(runnable);
            Executor executor = c9563e.vip;
            Objects.requireNonNull(executor);
            remoteconfig(runnable, executor);
            c9563e = c9563e3;
        }
    }

    public static void remoteconfig(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger metrica = AbstractC13307e.f26537e.metrica();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            metrica.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", AbstractC4653e.ads(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e);
        }
    }

    public static Object smaato(Object obj) {
        if (obj instanceof C16983e) {
            Throwable th = ((C16983e) obj).vip;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C15045e) {
            throw new ExecutionException(((C15045e) obj).ad);
        }
        if (obj == AbstractC13307e.f26538e) {
            return null;
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void ad(Runnable runnable, Executor executor) {
        C9563e c9563e;
        C9563e c9563e2 = C9563e.license;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (c9563e = this.f26541e) != c9563e2) {
            C9563e c9563e3 = new C9563e(runnable, executor);
            do {
                c9563e3.metrica = c9563e;
                if (AbstractC13307e.f26536e.smaato(this, c9563e, c9563e3)) {
                    return;
                } else {
                    c9563e = this.f26541e;
                }
            } while (c9563e != c9563e2);
        }
        remoteconfig(runnable, executor);
    }

    public void amazon() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C16983e c16983e;
        Object obj = this.f26540e;
        if (obj != null) {
            return false;
        }
        if (AbstractC13307e.f26535e) {
            c16983e = new C16983e(new CancellationException("Future.cancel() was called."), z);
        } else {
            c16983e = z ? C16983e.metrica : C16983e.license;
            Objects.requireNonNull(c16983e);
        }
        if (!AbstractC13307e.f26536e.Signature(this, obj, c16983e)) {
            return false;
        }
        admob(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        C9503e c9503e = C9503e.metrica;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f26540e;
        if (obj2 != null) {
            return smaato(obj2);
        }
        C9503e c9503e2 = this.f26539e;
        if (c9503e2 != c9503e) {
            C9503e c9503e3 = new C9503e();
            do {
                AbstractC0421e abstractC0421e = AbstractC13307e.f26536e;
                abstractC0421e.mopub(c9503e3, c9503e2);
                if (abstractC0421e.advert(this, c9503e2, c9503e3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            advert(c9503e3);
                            throw new InterruptedException();
                        }
                        obj = this.f26540e;
                    } while (obj == null);
                    return smaato(obj);
                }
                c9503e2 = this.f26539e;
            } while (c9503e2 != c9503e);
        }
        Object obj3 = this.f26540e;
        Objects.requireNonNull(obj3);
        return smaato(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009e -> B:28:0x006b). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2074e.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26540e instanceof C16983e;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26540e != null;
    }

    public abstract String loadAd();

    public final void subscription(StringBuilder sb) {
        try {
            Object Signature = Signature(this);
            sb.append("SUCCESS, result=[");
            if (Signature == null) {
                sb.append("null");
            } else if (Signature == this) {
                sb.append("this future");
            } else {
                sb.append(Signature.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(Signature)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r3.isEmpty() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
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
            java.lang.Object r1 = r6.f26540e
            boolean r1 = r1 instanceof defpackage.C16983e
            java.lang.String r2 = "]"
            if (r1 == 0) goto L4f
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto La9
        L4f:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L59
            r6.subscription(r0)
            goto La9
        L59:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.String r3 = r6.loadAd()     // Catch: java.lang.Throwable -> L71
            r4 = 0
            if (r3 == 0) goto L6f
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r5 == 0) goto L8c
        L6f:
            r3 = r4
            goto L8c
        L71:
            r3 = move-exception
            boolean r4 = r3 instanceof java.lang.Error
            if (r4 == 0) goto L7e
            boolean r4 = r3 instanceof java.lang.StackOverflowError
            if (r4 == 0) goto L7b
            goto L7e
        L7b:
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        L7e:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Exception thrown from implementation: "
            java.lang.String r3 = r4.concat(r3)
        L8c:
            if (r3 == 0) goto L99
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        L99:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto La9
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.subscription(r0)
        La9:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2074e.toString():java.lang.String");
    }
}
