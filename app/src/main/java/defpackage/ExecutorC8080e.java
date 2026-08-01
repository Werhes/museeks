package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٝٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC8080e implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C1088e f16388e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f16389e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f16390e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f16391e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f16392e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C3781e f16393e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C1088e f16394e;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f16385e = AtomicLongFieldUpdater.newUpdater(ExecutorC8080e.class, "parkedWorkersStack$volatile");

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f16387e = AtomicLongFieldUpdater.newUpdater(ExecutorC8080e.class, "controlState$volatile");

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16384e = AtomicIntegerFieldUpdater.newUpdater(ExecutorC8080e.class, "_isTerminated$volatile");

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C2443e f16386e = new C2443e("NOT_IN_STACK", 2);

    /* JADX WARN: Type inference failed for: r4v8, types: [eؖؒۖ, eٖؒٝ] */
    /* JADX WARN: Type inference failed for: r4v9, types: [eؖؒۖ, eٖؒٝ] */
    public ExecutorC8080e(int i, int i2, long j, String str) {
        this.f16392e = i;
        this.f16390e = i2;
        this.f16389e = j;
        this.f16391e = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Core pool size ", i, " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(AbstractC1634e.mopub(j, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f16388e = new C3834e();
        this.f16394e = new C3834e();
        this.f16393e = new C3781e((i + 1) * 2);
        this.controlState$volatile = i << 42;
    }

    public static /* synthetic */ void purchase(ExecutorC8080e executorC8080e, Runnable runnable, int i) {
        executorC8080e.license(runnable, false, (i & 4) == 0);
    }

    public final boolean Signature() {
        C2443e c2443e;
        int i;
        while (true) {
            long j = f16385e.get(this);
            C10408e c10408e = (C10408e) this.f16393e.vip((int) (2097151 & j));
            if (c10408e == null) {
                c10408e = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object metrica = c10408e.metrica();
                while (true) {
                    c2443e = f16386e;
                    if (metrica == c2443e) {
                        i = -1;
                        break;
                    }
                    if (metrica == null) {
                        i = 0;
                        break;
                    }
                    C10408e c10408e2 = (C10408e) metrica;
                    i = c10408e2.vip();
                    if (i != 0) {
                        break;
                    }
                    metrica = c10408e2.metrica();
                }
                if (i >= 0) {
                    if (f16385e.compareAndSet(this, j, i | j2)) {
                        c10408e.billing(c2443e);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c10408e == null) {
                return false;
            }
            if (C10408e.f20569e.compareAndSet(c10408e, -1, 0)) {
                LockSupport.unpark(c10408e);
                return true;
            }
        }
    }

    public final int ad() {
        synchronized (this.f16393e) {
            try {
                if (f16384e.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f16387e;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f16392e) {
                    return 0;
                }
                if (i >= this.f16390e) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f16393e.vip(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C10408e c10408e = new C10408e(this, i3);
                this.f16393e.metrica(i3, c10408e);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c10408e.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void advert(C10408e c10408e, int i, int i2) {
        while (true) {
            long j = f16385e.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object metrica = c10408e.metrica();
                    while (true) {
                        if (metrica == f16386e) {
                            i3 = -1;
                            break;
                        }
                        if (metrica == null) {
                            i3 = 0;
                            break;
                        }
                        C10408e c10408e2 = (C10408e) metrica;
                        int vip = c10408e2.vip();
                        if (vip != 0) {
                            i3 = vip;
                            break;
                        }
                        metrica = c10408e2.metrica();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f16385e.compareAndSet(this, j, i3 | j2)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.ExecutorC8080e.f16384e
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.C10408e
            r3 = 0
            if (r1 == 0) goto L17
            eَٝۗ r0 = (defpackage.C10408e) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            eًٝٛ r1 = r0.f20573e
            boolean r1 = defpackage.AbstractC7890e.billing(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            eؕۧۦ r1 = r8.f16393e
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.ExecutorC8080e.f16387e     // Catch: java.lang.Throwable -> Lbf
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lbf
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L75
            r1 = r2
        L36:
            eؕۧۦ r5 = r8.f16393e
            java.lang.Object r5 = r5.vip(r1)
            eَٝۗ r5 = (defpackage.C10408e) r5
            if (r5 == r0) goto L70
        L40:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L51
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L40
        L51:
            eؙٝٛ r5 = r5.f20575e
            eٖؒٝ r6 = r8.f16394e
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.C6531e.vip
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            eؙُؐ r7 = (defpackage.AbstractRunnableC6316e) r7
            if (r7 == 0) goto L65
            r6.ad(r7)
        L65:
            eؙُؐ r7 = r5.vip()
            if (r7 != 0) goto L6c
            goto L70
        L6c:
            r6.ad(r7)
            goto L65
        L70:
            if (r1 == r4) goto L75
            int r1 = r1 + 1
            goto L36
        L75:
            eٖؒٝ r1 = r8.f16394e
            r1.vip()
            eٖؒٝ r1 = r8.f16388e
            r1.vip()
        L7f:
            if (r0 == 0) goto L87
            eؙُؐ r1 = r0.ad(r2)
            if (r1 != 0) goto Lae
        L87:
            eٖؒٝ r1 = r8.f16388e
            java.lang.Object r1 = r1.license()
            eؙُؐ r1 = (defpackage.AbstractRunnableC6316e) r1
            if (r1 != 0) goto Lae
            eٖؒٝ r1 = r8.f16394e
            java.lang.Object r1 = r1.license()
            eؙُؐ r1 = (defpackage.AbstractRunnableC6316e) r1
            if (r1 != 0) goto Lae
            if (r0 == 0) goto La1
            r1 = 5
            r0.yandex(r1)
        La1:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC8080e.f16385e
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC8080e.f16387e
            r0.set(r8, r1)
            return
        Lae:
            r1.run()     // Catch: java.lang.Throwable -> Lb2
            goto L7f
        Lb2:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L7f
        Lbf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ExecutorC8080e.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        purchase(this, runnable, 6);
    }

    public final void license(Runnable runnable, boolean z, boolean z2) {
        AbstractRunnableC6316e c2794e;
        int i;
        AbstractC10617e.purchase.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC6316e) {
            c2794e = (AbstractRunnableC6316e) runnable;
            c2794e.f13146e = nanoTime;
            c2794e.f13145e = z;
        } else {
            c2794e = new C2794e(runnable, nanoTime, z);
        }
        boolean z3 = c2794e.f13145e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16387e;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        C10408e c10408e = currentThread instanceof C10408e ? (C10408e) currentThread : null;
        if (c10408e == null || !AbstractC7890e.billing(c10408e.f20573e, this)) {
            c10408e = null;
        }
        if (c10408e != null && (i = c10408e.f20571e) != 5 && (c2794e.f13145e || i != 2)) {
            c10408e.f20576e = true;
            C6531e c6531e = c10408e.f20575e;
            if (z2) {
                c2794e = c6531e.ad(c2794e);
            } else {
                c6531e.getClass();
                AbstractRunnableC6316e abstractRunnableC6316e = (AbstractRunnableC6316e) C6531e.vip.getAndSet(c6531e, c2794e);
                c2794e = abstractRunnableC6316e == null ? null : c6531e.ad(abstractRunnableC6316e);
            }
        }
        if (c2794e != null) {
            if (!(c2794e.f13145e ? this.f16394e.ad(c2794e) : this.f16388e.ad(c2794e))) {
                throw new RejectedExecutionException(AbstractC1786e.signatures(new StringBuilder(), this.f16391e, " was terminated"));
            }
        }
        if (z3) {
            if (Signature() || loadAd(addAndGet)) {
                return;
            }
            Signature();
            return;
        }
        if (Signature() || loadAd(atomicLongFieldUpdater.get(this))) {
            return;
        }
        Signature();
    }

    public final boolean loadAd(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f16392e;
        if (i < i2) {
            int ad = ad();
            if (ad == 1 && i2 > 1) {
                ad();
            }
            if (ad > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C3781e c3781e = this.f16393e;
        int ad = c3781e.ad();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < ad; i6++) {
            C10408e c10408e = (C10408e) c3781e.vip(i6);
            if (c10408e != null) {
                C6531e c6531e = c10408e.f20575e;
                c6531e.getClass();
                int i7 = C6531e.vip.get(c6531e) != null ? (C6531e.metrica.get(c6531e) - C6531e.license.get(c6531e)) + 1 : C6531e.metrica.get(c6531e) - C6531e.license.get(c6531e);
                int m2467class = AbstractC8703e.m2467class(c10408e.f20571e);
                if (m2467class == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (m2467class == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (m2467class == 2) {
                    i3++;
                } else if (m2467class == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (m2467class != 4) {
                        throw new C14803e(10);
                    }
                    i5++;
                }
            }
        }
        long j = f16387e.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f16391e);
        sb4.append('@');
        sb4.append(AbstractC7111e.purchase(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f16392e;
        sb4.append(i8);
        sb4.append(", max = ");
        AbstractC10257e.signatures(sb4, this.f16390e, "}, Worker States {CPU = ", i, ", blocking = ");
        AbstractC10257e.signatures(sb4, i2, ", parked = ", i3, ", dormant = ");
        AbstractC10257e.signatures(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f16388e.metrica());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f16394e.metrica());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
