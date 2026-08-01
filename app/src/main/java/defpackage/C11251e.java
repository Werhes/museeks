package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۚۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11251e extends AbstractC0326e {
    public final AtomicReferenceFieldUpdater appmetrica;
    public final AtomicReferenceFieldUpdater license;
    public final AtomicReferenceFieldUpdater metrica;
    public final AtomicReferenceFieldUpdater purchase;
    public final AtomicReferenceFieldUpdater vip;

    public C11251e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.vip = atomicReferenceFieldUpdater;
        this.metrica = atomicReferenceFieldUpdater2;
        this.license = atomicReferenceFieldUpdater3;
        this.appmetrica = atomicReferenceFieldUpdater4;
        this.purchase = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.AbstractC0326e
    public final C17100e adcel(AbstractC0586e abstractC0586e) {
        return (C17100e) this.appmetrica.getAndSet(abstractC0586e, C17100e.license);
    }

    @Override // defpackage.AbstractC0326e
    public final void amazon(C2694e c2694e, C2694e c2694e2) {
        this.metrica.lazySet(c2694e, c2694e2);
    }

    @Override // defpackage.AbstractC0326e
    public final boolean appmetrica(AbstractC0586e abstractC0586e, C2694e c2694e, C2694e c2694e2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.license;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0586e, c2694e, c2694e2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0586e) == c2694e);
        return false;
    }

    @Override // defpackage.AbstractC0326e
    public final boolean license(AbstractC0586e abstractC0586e, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.purchase;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0586e, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0586e) == obj);
        return false;
    }

    @Override // defpackage.AbstractC0326e
    public final void loadAd(C2694e c2694e, Thread thread) {
        this.vip.lazySet(c2694e, thread);
    }

    @Override // defpackage.AbstractC0326e
    public final boolean metrica(AbstractC0586e abstractC0586e, C17100e c17100e, C17100e c17100e2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.appmetrica;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0586e, c17100e, c17100e2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0586e) == c17100e);
        return false;
    }

    @Override // defpackage.AbstractC0326e
    public final C2694e mopub(AbstractC0586e abstractC0586e) {
        return (C2694e) this.license.getAndSet(abstractC0586e, C2694e.metrica);
    }
}
