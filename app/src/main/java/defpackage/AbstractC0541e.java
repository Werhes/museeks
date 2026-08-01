package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0541e extends AbstractC11092e implements InterfaceC13591e {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2710e = AtomicReferenceFieldUpdater.newUpdater(AbstractC0541e.class, Object.class, "_queue$volatile");

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2708e = AtomicReferenceFieldUpdater.newUpdater(AbstractC0541e.class, Object.class, "_delayed$volatile");

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2709e = AtomicIntegerFieldUpdater.newUpdater(AbstractC0541e.class, "_isCompleted$volatile");

    @Override // defpackage.InterfaceC13591e
    public InterfaceC1232e ad(long j, Runnable runnable, InterfaceC8850e interfaceC8850e) {
        return AbstractC12387e.ad.ad(j, runnable, interfaceC8850e);
    }

    @Override // defpackage.AbstractC3743e
    public final void advert(InterfaceC8850e interfaceC8850e, Runnable runnable) {
        mo368e(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((defpackage.C4894e.vip.get(r0) == 0) == false) goto L29;
     */
    /* renamed from: eَؑۨ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m366e() {
        /*
            r7 = this;
            eّۙٗ r0 = r7.f21990e
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.AbstractC0541e.f2708e
            java.lang.Object r0 = r0.get(r7)
            eؘٖٝ r0 = (defpackage.C16037e) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.C4894e.vip
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.AbstractC0541e.f2710e
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof defpackage.C7480e
            if (r3 == 0) goto L4f
            eٌؚ۟ r0 = (defpackage.C7480e) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.C7480e.purchase
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            eًؚؔ r3 = defpackage.AbstractC7205e.vip
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0541e.m366e():boolean");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [eؘٖٝ, java.lang.Object] */
    /* renamed from: eٍۢؒ, reason: contains not printable characters */
    public final void m367e(long j, AbstractRunnableC9465e abstractRunnableC9465e) {
        int metrica;
        Thread mo1408e;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2708e;
        if (f2709e.get(this) == 1) {
            metrica = 1;
        } else {
            C16037e c16037e = (C16037e) atomicReferenceFieldUpdater.get(this);
            if (c16037e == null) {
                ?? obj = new Object();
                obj.metrica = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                c16037e = (C16037e) atomicReferenceFieldUpdater.get(this);
            }
            metrica = abstractRunnableC9465e.metrica(j, c16037e, this);
        }
        if (metrica != 0) {
            if (metrica == 1) {
                mo1410e(j, abstractRunnableC9465e);
                return;
            } else {
                if (metrica != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C16037e c16037e2 = (C16037e) atomicReferenceFieldUpdater.get(this);
        if (c16037e2 != null) {
            synchronized (c16037e2) {
                AbstractRunnableC9465e[] abstractRunnableC9465eArr = c16037e2.ad;
                r2 = abstractRunnableC9465eArr != null ? abstractRunnableC9465eArr[0] : null;
            }
        }
        if (r2 != abstractRunnableC9465e || Thread.currentThread() == (mo1408e = mo1408e())) {
            return;
        }
        LockSupport.unpark(mo1408e);
    }

    /* renamed from: eُۘٙ, reason: contains not printable characters */
    public void mo368e(Runnable runnable) {
        m369e();
        if (!m371e(runnable)) {
            RunnableC3938e.f8782e.mo368e(runnable);
            return;
        }
        Thread mo1408e = mo1408e();
        if (Thread.currentThread() != mo1408e) {
            LockSupport.unpark(mo1408e);
        }
    }

    /* renamed from: eّْٝ, reason: contains not printable characters */
    public final void m369e() {
        AbstractRunnableC9465e abstractRunnableC9465e;
        C16037e c16037e = (C16037e) f2708e.get(this);
        if (c16037e == null || C4894e.vip.get(c16037e) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (c16037e) {
                try {
                    AbstractRunnableC9465e[] abstractRunnableC9465eArr = c16037e.ad;
                    AbstractRunnableC9465e abstractRunnableC9465e2 = abstractRunnableC9465eArr != null ? abstractRunnableC9465eArr[0] : null;
                    if (abstractRunnableC9465e2 != null) {
                        abstractRunnableC9465e = ((nanoTime - abstractRunnableC9465e2.f18807e) > 0L ? 1 : ((nanoTime - abstractRunnableC9465e2.f18807e) == 0L ? 0 : -1)) >= 0 ? m371e(abstractRunnableC9465e2) : false ? c16037e.metrica(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC9465e != null);
    }

    @Override // defpackage.AbstractC11092e
    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    public final long mo370e() {
        Runnable runnable;
        AbstractRunnableC9465e abstractRunnableC9465e;
        C2443e c2443e = AbstractC7205e.vip;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2710e;
        if (!m2985e()) {
            m369e();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof C7480e)) {
                    if (obj == c2443e) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
                C7480e c7480e = (C7480e) obj;
                Object license = c7480e.license();
                if (license != C7480e.billing) {
                    runnable = (Runnable) license;
                    break;
                }
                C7480e metrica = c7480e.metrica();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, metrica) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C12718e c12718e = this.f21990e;
            if (((c12718e == null || c12718e.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C7480e) {
                        long j = C7480e.purchase.get((C7480e) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c2443e) {
                        return Long.MAX_VALUE;
                    }
                }
                C16037e c16037e = (C16037e) f2708e.get(this);
                if (c16037e != null) {
                    synchronized (c16037e) {
                        AbstractRunnableC9465e[] abstractRunnableC9465eArr = c16037e.ad;
                        abstractRunnableC9465e = abstractRunnableC9465eArr != null ? abstractRunnableC9465eArr[0] : null;
                    }
                    if (abstractRunnableC9465e != null) {
                        long nanoTime = abstractRunnableC9465e.f18807e - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return true;
     */
    /* renamed from: eؘٖؗ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m371e(java.lang.Runnable r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.AbstractC0541e.f2710e
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.AbstractC0541e.f2709e
            int r2 = r2.get(r5)
            r3 = 1
            if (r2 != r3) goto L10
            goto L4a
        L10:
            if (r1 != 0) goto L21
        L12:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L1a
            goto L62
        L1a:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L12
            goto L0
        L21:
            boolean r2 = r1 instanceof defpackage.C7480e
            if (r2 == 0) goto L46
            r2 = r1
            eٌؚ۟ r2 = (defpackage.C7480e) r2
            int r4 = r2.ad(r6)
            if (r4 == 0) goto L62
            if (r4 == r3) goto L34
            r0 = 2
            if (r4 == r0) goto L4a
            goto L0
        L34:
            eٌؚ۟ r2 = r2.metrica()
        L38:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L3f
            goto L0
        L3f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L38
            goto L0
        L46:
            eًؚؔ r2 = defpackage.AbstractC7205e.vip
            if (r1 != r2) goto L4c
        L4a:
            r6 = 0
            return r6
        L4c:
            eٌؚ۟ r2 = new eٌؚ۟
            r4 = 8
            r2.<init>(r4, r3)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r2.ad(r4)
            r2.ad(r6)
        L5c:
            boolean r4 = r0.compareAndSet(r5, r1, r2)
            if (r4 == 0) goto L63
        L62:
            return r3
        L63:
            java.lang.Object r4 = r0.get(r5)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0541e.m371e(java.lang.Runnable):boolean");
    }

    @Override // defpackage.InterfaceC13591e
    public final void license(long j, C13578e c13578e) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            C8539e c8539e = new C8539e(this, j2 + nanoTime, c13578e);
            m367e(nanoTime, c8539e);
            c13578e.isPro(new C7394e(2, c8539e));
        }
    }

    @Override // defpackage.AbstractC11092e
    public void shutdown() {
        AbstractRunnableC9465e metrica;
        AbstractC3858e.ad.set(null);
        f2709e.set(this, 1);
        C2443e c2443e = AbstractC7205e.vip;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2710e;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof C7480e)) {
                    if (obj != c2443e) {
                        C7480e c7480e = new C7480e(8, true);
                        c7480e.ad((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c7480e)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C7480e) obj).vip();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c2443e)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        do {
        } while (mo370e() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C16037e c16037e = (C16037e) f2708e.get(this);
            if (c16037e == null) {
                return;
            }
            synchronized (c16037e) {
                metrica = C4894e.vip.get(c16037e) > 0 ? c16037e.metrica(0) : null;
            }
            if (metrica == null) {
                return;
            } else {
                mo1410e(nanoTime, metrica);
            }
        }
    }
}
