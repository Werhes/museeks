package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16231e extends AbstractC7861e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f31903e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f31904e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f31905e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f31906e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f31907e;

    public C16231e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(2);
        this.f31907e = atomicReferenceFieldUpdater;
        this.f31906e = atomicReferenceFieldUpdater2;
        this.f31904e = atomicReferenceFieldUpdater3;
        this.f31905e = atomicReferenceFieldUpdater4;
        this.f31903e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.AbstractC7861e
    public final boolean appmetrica(AbstractC7904e abstractC7904e, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f31903e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC7904e, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC7904e) == obj);
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final void inmobi(C5109e c5109e, Thread thread) {
        this.f31907e.lazySet(c5109e, thread);
    }

    @Override // defpackage.AbstractC7861e
    public final void isVip(C5109e c5109e, C5109e c5109e2) {
        this.f31906e.lazySet(c5109e, c5109e2);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean license(AbstractC7904e abstractC7904e, C16267e c16267e, C16267e c16267e2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f31905e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC7904e, c16267e, c16267e2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC7904e) == c16267e);
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final boolean purchase(AbstractC7904e abstractC7904e, C5109e c5109e, C5109e c5109e2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f31904e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC7904e, c5109e, c5109e2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC7904e) == c5109e);
        return false;
    }
}
