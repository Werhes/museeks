package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٝۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10408e extends Thread {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20569e = AtomicIntegerFieldUpdater.newUpdater(C10408e.class, "workerCtl$volatile");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f20570e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f20571e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C4246e f20572e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ ExecutorC8080e f20573e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f20574e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6531e f20575e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f20576e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f20577e;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v5, types: [eّؖٝ, java.lang.Object] */
    public C10408e(ExecutorC8080e executorC8080e, int i) {
        this.f20573e = executorC8080e;
        setDaemon(true);
        setContextClassLoader(ExecutorC8080e.class.getClassLoader());
        this.f20575e = new C6531e();
        this.f20572e = new Object();
        this.f20571e = 4;
        this.nextParkedWorker = ExecutorC8080e.f16386e;
        int nanoTime = (int) System.nanoTime();
        this.f20577e = nanoTime == 0 ? 42 : nanoTime;
        purchase(i);
    }

    public final AbstractRunnableC6316e ad(boolean z) {
        AbstractRunnableC6316e appmetrica;
        AbstractRunnableC6316e appmetrica2;
        long j;
        int i = this.f20571e;
        ExecutorC8080e executorC8080e = this.f20573e;
        AbstractRunnableC6316e abstractRunnableC6316e = null;
        C6531e c6531e = this.f20575e;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC8080e.f16387e;
            do {
                j = atomicLongFieldUpdater.get(executorC8080e);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    c6531e.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C6531e.vip;
                        AbstractRunnableC6316e abstractRunnableC6316e2 = (AbstractRunnableC6316e) atomicReferenceFieldUpdater.get(c6531e);
                        if (abstractRunnableC6316e2 == null || !abstractRunnableC6316e2.f13145e) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(c6531e, abstractRunnableC6316e2, null)) {
                            if (atomicReferenceFieldUpdater.get(c6531e) != abstractRunnableC6316e2) {
                                break;
                            }
                        }
                        abstractRunnableC6316e = abstractRunnableC6316e2;
                    }
                    int i2 = C6531e.license.get(c6531e);
                    int i3 = C6531e.metrica.get(c6531e);
                    while (true) {
                        if (i2 == i3 || C6531e.appmetrica.get(c6531e) == 0) {
                            break;
                        }
                        i3--;
                        AbstractRunnableC6316e metrica = c6531e.metrica(i3, true);
                        if (metrica != null) {
                            abstractRunnableC6316e = metrica;
                            break;
                        }
                    }
                    if (abstractRunnableC6316e != null) {
                        return abstractRunnableC6316e;
                    }
                    AbstractRunnableC6316e abstractRunnableC6316e3 = (AbstractRunnableC6316e) executorC8080e.f16394e.license();
                    return abstractRunnableC6316e3 == null ? startapp(1) : abstractRunnableC6316e3;
                }
            } while (!ExecutorC8080e.f16387e.compareAndSet(executorC8080e, j, j - 4398046511104L));
            this.f20571e = 1;
        }
        if (z) {
            boolean z2 = license(executorC8080e.f16392e * 2) == 0;
            if (z2 && (appmetrica2 = appmetrica()) != null) {
                return appmetrica2;
            }
            c6531e.getClass();
            AbstractRunnableC6316e abstractRunnableC6316e4 = (AbstractRunnableC6316e) C6531e.vip.getAndSet(c6531e, null);
            if (abstractRunnableC6316e4 == null) {
                abstractRunnableC6316e4 = c6531e.vip();
            }
            if (abstractRunnableC6316e4 != null) {
                return abstractRunnableC6316e4;
            }
            if (!z2 && (appmetrica = appmetrica()) != null) {
                return appmetrica;
            }
        } else {
            AbstractRunnableC6316e appmetrica3 = appmetrica();
            if (appmetrica3 != null) {
                return appmetrica3;
            }
        }
        return startapp(3);
    }

    public final AbstractRunnableC6316e appmetrica() {
        int license = license(2);
        ExecutorC8080e executorC8080e = this.f20573e;
        if (license == 0) {
            AbstractRunnableC6316e abstractRunnableC6316e = (AbstractRunnableC6316e) executorC8080e.f16388e.license();
            return abstractRunnableC6316e != null ? abstractRunnableC6316e : (AbstractRunnableC6316e) executorC8080e.f16394e.license();
        }
        AbstractRunnableC6316e abstractRunnableC6316e2 = (AbstractRunnableC6316e) executorC8080e.f16394e.license();
        return abstractRunnableC6316e2 != null ? abstractRunnableC6316e2 : (AbstractRunnableC6316e) executorC8080e.f16388e.license();
    }

    public final void billing(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final int license(int i) {
        int i2 = this.f20577e;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f20577e = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Alert.DURATION_SHOW_INDEFINITELY) % i;
    }

    public final Object metrica() {
        return this.nextParkedWorker;
    }

    public final void purchase(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20573e.f16391e);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10408e.run():void");
    }

    public final AbstractRunnableC6316e startapp(int i) {
        long j;
        AbstractRunnableC6316e abstractRunnableC6316e;
        long j2;
        long j3;
        AbstractRunnableC6316e abstractRunnableC6316e2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC8080e.f16387e;
        ExecutorC8080e executorC8080e = this.f20573e;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC8080e) & 2097151);
        AbstractRunnableC6316e abstractRunnableC6316e3 = null;
        if (i2 < 2) {
            return null;
        }
        int license = license(i2);
        int i3 = 0;
        long j4 = Long.MAX_VALUE;
        while (i3 < i2) {
            license++;
            if (license > i2) {
                license = 1;
            }
            C10408e c10408e = (C10408e) executorC8080e.f16393e.vip(license);
            if (c10408e != null && c10408e != this) {
                C6531e c6531e = c10408e.f20575e;
                if (i == 3) {
                    abstractRunnableC6316e = c6531e.vip();
                    j = 0;
                } else {
                    c6531e.getClass();
                    int i4 = C6531e.license.get(c6531e);
                    int i5 = C6531e.metrica.get(c6531e);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z || C6531e.appmetrica.get(c6531e) != 0) {
                            int i6 = i4 + 1;
                            abstractRunnableC6316e = c6531e.metrica(i4, z);
                            if (abstractRunnableC6316e != null) {
                                break;
                            }
                            i4 = i6;
                        } else {
                            break;
                        }
                    }
                    abstractRunnableC6316e = abstractRunnableC6316e3;
                }
                C4246e c4246e = this.f20572e;
                if (abstractRunnableC6316e != null) {
                    c4246e.f9318e = abstractRunnableC6316e;
                    abstractRunnableC6316e2 = abstractRunnableC6316e3;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C6531e.vip;
                        AbstractRunnableC6316e abstractRunnableC6316e4 = (AbstractRunnableC6316e) atomicReferenceFieldUpdater.get(c6531e);
                        if (abstractRunnableC6316e4 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((abstractRunnableC6316e4.f13145e ? 1 : 2) & i) == 0) {
                            break;
                        }
                        AbstractC10617e.purchase.getClass();
                        C6531e c6531e2 = c6531e;
                        long nanoTime = System.nanoTime() - abstractRunnableC6316e4.f13146e;
                        long j5 = AbstractC10617e.vip;
                        if (nanoTime < j5) {
                            j3 = j5 - nanoTime;
                            abstractRunnableC6316e2 = null;
                            break;
                        }
                        do {
                            abstractRunnableC6316e2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(c6531e2, abstractRunnableC6316e4, null)) {
                                c4246e.f9318e = abstractRunnableC6316e4;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(c6531e2) == abstractRunnableC6316e4);
                        c6531e = c6531e2;
                        abstractRunnableC6316e3 = null;
                    }
                    j3 = -2;
                    abstractRunnableC6316e2 = abstractRunnableC6316e3;
                }
                if (j3 == j2) {
                    AbstractRunnableC6316e abstractRunnableC6316e5 = (AbstractRunnableC6316e) c4246e.f9318e;
                    c4246e.f9318e = abstractRunnableC6316e2;
                    return abstractRunnableC6316e5;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i3++;
            abstractRunnableC6316e3 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.f20570e = j4;
        return null;
    }

    public final int vip() {
        return this.indexInArray;
    }

    public final boolean yandex(int i) {
        int i2 = this.f20571e;
        boolean z = i2 == 1;
        if (z) {
            ExecutorC8080e.f16387e.addAndGet(this.f20573e, 4398046511104L);
        }
        if (i2 != i) {
            this.f20571e = i;
        }
        return z;
    }
}
