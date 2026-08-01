package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16867e extends AbstractC0421e {
    public static final AtomicReferenceFieldUpdater vip = AtomicReferenceFieldUpdater.newUpdater(C9503e.class, Thread.class, "ad");
    public static final AtomicReferenceFieldUpdater metrica = AtomicReferenceFieldUpdater.newUpdater(C9503e.class, C9503e.class, "vip");
    public static final AtomicReferenceFieldUpdater license = AtomicReferenceFieldUpdater.newUpdater(AbstractC13307e.class, C9503e.class, "eّؑؑ");
    public static final AtomicReferenceFieldUpdater appmetrica = AtomicReferenceFieldUpdater.newUpdater(AbstractC13307e.class, C9563e.class, "eؙِٖ");
    public static final AtomicReferenceFieldUpdater purchase = AtomicReferenceFieldUpdater.newUpdater(AbstractC13307e.class, Object.class, "eًؔؐ");

    @Override // defpackage.AbstractC0421e
    public final boolean Signature(AbstractC13307e abstractC13307e, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = purchase;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC13307e, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC13307e) == obj);
        return false;
    }

    @Override // defpackage.AbstractC0421e
    public final void adcel(C9503e c9503e, Thread thread) {
        vip.lazySet(c9503e, thread);
    }

    @Override // defpackage.AbstractC0421e
    public final boolean advert(AbstractC13307e abstractC13307e, C9503e c9503e, C9503e c9503e2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = license;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC13307e, c9503e, c9503e2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC13307e) == c9503e);
        return false;
    }

    @Override // defpackage.AbstractC0421e
    public final C9503e amazon(AbstractC2074e abstractC2074e) {
        return (C9503e) license.getAndSet(abstractC2074e, C9503e.metrica);
    }

    @Override // defpackage.AbstractC0421e
    public final C9563e loadAd(AbstractC2074e abstractC2074e) {
        return (C9563e) appmetrica.getAndSet(abstractC2074e, C9563e.license);
    }

    @Override // defpackage.AbstractC0421e
    public final void mopub(C9503e c9503e, C9503e c9503e2) {
        metrica.lazySet(c9503e, c9503e2);
    }

    @Override // defpackage.AbstractC0421e
    public final boolean smaato(AbstractC13307e abstractC13307e, C9563e c9563e, C9563e c9563e2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = appmetrica;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC13307e, c9563e, c9563e2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC13307e) == c9563e);
        return false;
    }
}
