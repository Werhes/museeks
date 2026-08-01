package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3099e extends AbstractC3697e {
    public final AtomicReferenceFieldUpdater appmetrica;
    public final AtomicReferenceFieldUpdater license;
    public final AtomicReferenceFieldUpdater metrica;
    public final AtomicReferenceFieldUpdater purchase;
    public final AtomicReferenceFieldUpdater vip;

    public C3099e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.vip = atomicReferenceFieldUpdater;
        this.metrica = atomicReferenceFieldUpdater2;
        this.license = atomicReferenceFieldUpdater3;
        this.appmetrica = atomicReferenceFieldUpdater4;
        this.purchase = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.AbstractC3697e
    public final boolean ad(AbstractC18423e abstractC18423e, C9934e c9934e, C9934e c9934e2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.appmetrica;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC18423e, c9934e, c9934e2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC18423e) == c9934e);
        return false;
    }

    @Override // defpackage.AbstractC3697e
    public final void appmetrica(C16839e c16839e, C16839e c16839e2) {
        this.metrica.lazySet(c16839e, c16839e2);
    }

    @Override // defpackage.AbstractC3697e
    public final boolean metrica(AbstractC18423e abstractC18423e, C16839e c16839e, C16839e c16839e2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.license;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC18423e, c16839e, c16839e2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC18423e) == c16839e);
        return false;
    }

    @Override // defpackage.AbstractC3697e
    public final void purchase(C16839e c16839e, Thread thread) {
        this.vip.lazySet(c16839e, thread);
    }

    @Override // defpackage.AbstractC3697e
    public final boolean vip(AbstractC18423e abstractC18423e, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.purchase;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC18423e, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC18423e) == obj);
        return false;
    }
}
