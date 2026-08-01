package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6907e implements ListenableFuture {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C9689e f14155e = AbstractC5750e.purchase(new C12916e(15, this));

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f14156e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public ArrayList f14157e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AtomicInteger f14158e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public ArrayList f14159e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C7169e f14160e;

    public C6907e(ArrayList arrayList, boolean z, ExecutorC0082e executorC0082e) {
        this.f14159e = arrayList;
        this.f14157e = new ArrayList(arrayList.size());
        this.f14156e = z;
        this.f14158e = new AtomicInteger(arrayList.size());
        ad(new RunnableC12991e(16, this), AbstractC3062e.billing());
        if (this.f14159e.isEmpty()) {
            this.f14160e.ad(new ArrayList(this.f14157e));
            return;
        }
        for (int i = 0; i < this.f14159e.size(); i++) {
            this.f14157e.add(null);
        }
        ArrayList arrayList2 = this.f14159e;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ListenableFuture listenableFuture = (ListenableFuture) arrayList2.get(i2);
            listenableFuture.ad(new RunnableC10028e(this, i2, listenableFuture, 2), executorC0082e);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void ad(Runnable runnable, Executor executor) {
        this.f14155e.f19184e.ad(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.f14159e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(z);
            }
        }
        return this.f14155e.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        ArrayList arrayList = this.f14159e;
        if (arrayList != null && !isDone()) {
            Iterator it = arrayList.iterator();
            loop0: while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                while (!listenableFuture.isDone()) {
                    try {
                        listenableFuture.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.f14156e) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.f14155e.f19184e.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.f14155e.f19184e.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14155e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14155e.f19184e.isDone();
    }
}
