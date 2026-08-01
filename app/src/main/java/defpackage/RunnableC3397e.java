package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3397e extends C6815e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public InterfaceC7961e f7606e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public volatile ListenableFuture f7608e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public ListenableFuture f7609e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final LinkedBlockingQueue f7607e = new LinkedBlockingQueue(1);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final CountDownLatch f7605e = new CountDownLatch(1);

    public RunnableC3397e(InterfaceC7961e interfaceC7961e, ListenableFuture listenableFuture) {
        this.f7606e = interfaceC7961e;
        listenableFuture.getClass();
        this.f7609e = listenableFuture;
    }

    public static Object metrica(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
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
        return take;
    }

    @Override // defpackage.C6815e, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.f14034e.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.f7607e.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        ListenableFuture listenableFuture = this.f7609e;
        if (listenableFuture != null) {
            listenableFuture.cancel(z);
        }
        ListenableFuture listenableFuture2 = this.f7608e;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(z);
        }
        return true;
    }

    @Override // defpackage.C6815e, java.util.concurrent.Future
    public final Object get() {
        if (!this.f14034e.isDone()) {
            ListenableFuture listenableFuture = this.f7609e;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.f7605e.await();
            ListenableFuture listenableFuture2 = this.f7608e;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return this.f14034e.get();
    }

    @Override // defpackage.C6815e, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        if (!this.f14034e.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture listenableFuture = this.f7609e;
            if (listenableFuture != null) {
                long nanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (!this.f7605e.await(j, timeUnit)) {
                throw new TimeoutException();
            }
            j -= Math.max(0L, System.nanoTime() - nanoTime2);
            ListenableFuture listenableFuture2 = this.f7608e;
            if (listenableFuture2 != null) {
                listenableFuture2.get(j, timeUnit);
            }
        }
        return this.f14034e.get(j, timeUnit);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, eًٌٖ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, eًٌٖ] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.common.util.concurrent.ListenableFuture, eًٌٖ] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0;
        ?? r02 = 0;
        r02 = 0;
        r02 = 0;
        r02 = 0;
        r02 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            ListenableFuture apply = this.f7606e.apply(AbstractC15792e.adcel(this.f7609e));
                            this.f7608e = apply;
                            if (this.f14034e.isCancelled()) {
                                apply.cancel(((Boolean) metrica(this.f7607e)).booleanValue());
                                this.f7608e = null;
                            } else {
                                apply.ad(new RunnableC17144e(this, apply, false, 7), AbstractC3062e.billing());
                            }
                        } catch (Exception e) {
                            C7169e c7169e = this.f14033e;
                            r0 = r02;
                            if (c7169e != null) {
                                c7169e.metrica(e);
                                r0 = r02;
                            }
                        }
                    } catch (Error e2) {
                        C7169e c7169e2 = this.f14033e;
                        r0 = r02;
                        if (c7169e2 != null) {
                            c7169e2.metrica(e2);
                            r0 = r02;
                        }
                    }
                } finally {
                    this.f7606e = r02;
                    this.f7609e = r02;
                    this.f7605e.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                C7169e c7169e3 = this.f14033e;
                if (c7169e3 != null) {
                    c7169e3.metrica(cause);
                }
            }
        } catch (UndeclaredThrowableException e4) {
            Throwable cause2 = e4.getCause();
            C7169e c7169e4 = this.f14033e;
            r0 = r02;
            if (c7169e4 != null) {
                c7169e4.metrica(cause2);
                r0 = r02;
            }
        }
    }
}
