package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٝٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6531e {
    public final AtomicReferenceArray ad = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater vip = AtomicReferenceFieldUpdater.newUpdater(C6531e.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater metrica = AtomicIntegerFieldUpdater.newUpdater(C6531e.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater license = AtomicIntegerFieldUpdater.newUpdater(C6531e.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater appmetrica = AtomicIntegerFieldUpdater.newUpdater(C6531e.class, "blockingTasksInBuffer$volatile");

    public final AbstractRunnableC6316e ad(AbstractRunnableC6316e abstractRunnableC6316e) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = metrica;
        if (atomicIntegerFieldUpdater.get(this) - license.get(this) == 127) {
            return abstractRunnableC6316e;
        }
        if (abstractRunnableC6316e.f13145e) {
            appmetrica.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.ad;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, abstractRunnableC6316e);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r6 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        defpackage.C6531e.appmetrica.decrementAndGet(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.f13145e == r6) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.compareAndSet(r5, r1, null) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r0.get(r5) == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractRunnableC6316e metrica(int r5, boolean r6) {
        /*
            r4 = this;
            r5 = r5 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r4.ad
            java.lang.Object r1 = r0.get(r5)
            eؙُؐ r1 = (defpackage.AbstractRunnableC6316e) r1
            r2 = 0
            if (r1 == 0) goto L25
            boolean r3 = r1.f13145e
            if (r3 != r6) goto L25
        L11:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L1f
            if (r6 == 0) goto L1e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.C6531e.appmetrica
            r5.decrementAndGet(r4)
        L1e:
            return r1
        L1f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L11
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6531e.metrica(int, boolean):eؙُؐ");
    }

    public final AbstractRunnableC6316e vip() {
        AbstractRunnableC6316e abstractRunnableC6316e;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = license;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - metrica.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC6316e = (AbstractRunnableC6316e) this.ad.getAndSet(i2, null)) != null) {
                if (abstractRunnableC6316e.f13145e) {
                    appmetrica.decrementAndGet(this);
                }
                return abstractRunnableC6316e;
            }
        }
    }
}
