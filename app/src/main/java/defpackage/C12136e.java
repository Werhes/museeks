package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٟۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12136e extends AbstractC7601e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C8209e f24299e = new C8209e(C12136e.class);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final boolean f24300e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public AbstractC0281e f24301e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public C7219e f24302e;

    public C12136e(AbstractC0281e abstractC0281e, boolean z) {
        int size = abstractC0281e.size();
        this.f15447e = null;
        this.f15448e = size;
        this.f24301e = abstractC0281e;
        this.f24300e = z;
    }

    @Override // defpackage.AbstractC0586e
    public final void adcel() {
        C7219e c7219e = this.f24302e;
        if (c7219e != null) {
            c7219e.metrica();
        }
    }

    public final void admob(AbstractC0281e abstractC0281e) {
        int metrica = AbstractC7601e.f15445e.metrica(this);
        AbstractC2301e.admob("Less than 0 remaining futures", metrica >= 0);
        if (metrica == 0) {
            if (abstractC0281e != null) {
                AbstractC7014e it = abstractC0281e.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            AbstractC17976e.vip(future);
                        } catch (ExecutionException e) {
                            subscription(e.getCause());
                        } catch (Throwable th) {
                            subscription(th);
                        }
                    }
                }
            }
            this.f15447e = null;
            C7219e c7219e = this.f24302e;
            if (c7219e != null) {
                try {
                    c7219e.f14741e.execute(c7219e);
                } catch (RejectedExecutionException e2) {
                    c7219e.f14742e.amazon(e2);
                }
            }
            this.f24301e = null;
        }
    }

    @Override // defpackage.AbstractC0586e
    public final void license() {
        AbstractC0281e abstractC0281e = this.f24301e;
        this.f24301e = null;
        this.f24302e = null;
        if ((this.f2776e instanceof C8973e) && (abstractC0281e != null)) {
            boolean Signature = Signature();
            AbstractC7014e it = abstractC0281e.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(Signature);
            }
        }
    }

    @Override // defpackage.AbstractC0586e
    public final String mopub() {
        AbstractC0281e abstractC0281e = this.f24301e;
        if (abstractC0281e == null) {
            return super.mopub();
        }
        return "futures=" + abstractC0281e;
    }

    public final void pro(ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.f24301e = null;
                cancel(false);
            } else {
                try {
                    AbstractC17976e.vip(listenableFuture);
                } catch (ExecutionException e) {
                    subscription(e.getCause());
                } catch (Throwable th) {
                    subscription(th);
                }
            }
        } finally {
            admob(null);
        }
    }

    public final void remoteconfig() {
        Objects.requireNonNull(this.f24301e);
        if (this.f24301e.isEmpty()) {
            C7219e c7219e = this.f24302e;
            if (c7219e != null) {
                try {
                    c7219e.f14741e.execute(c7219e);
                    return;
                } catch (RejectedExecutionException e) {
                    c7219e.f14742e.amazon(e);
                    return;
                }
            }
            return;
        }
        boolean z = this.f24300e;
        EnumC3320e enumC3320e = EnumC3320e.f7489e;
        if (!z) {
            RunnableC16019e runnableC16019e = new RunnableC16019e(this, (Object) null, 1);
            AbstractC7014e it = this.f24301e.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    admob(null);
                } else {
                    listenableFuture.ad(runnableC16019e, enumC3320e);
                }
            }
            return;
        }
        AbstractC7014e it2 = this.f24301e.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i2 = i + 1;
            if (listenableFuture2.isDone()) {
                pro(listenableFuture2);
            } else {
                listenableFuture2.ad(new RunnableC16019e(this, i, listenableFuture2), enumC3320e);
            }
            i = i2;
        }
    }

    public final void subscription(Throwable th) {
        th.getClass();
        if (this.f24300e && !amazon(th)) {
            Set set = this.f15447e;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.f2776e instanceof C8973e)) {
                    Throwable vip = vip();
                    Objects.requireNonNull(vip);
                    while (vip != null && newSetFromMap.add(vip)) {
                        vip = vip.getCause();
                    }
                }
                AbstractC7601e.f15445e.vip(this, newSetFromMap);
                Set set2 = this.f15447e;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (set.add(th2)) {
                }
            }
            f24299e.vip().log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
            return;
        }
        boolean z = th instanceof Error;
        if (z) {
            f24299e.vip().log(Level.SEVERE, z ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
        }
    }
}
