package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15011e extends AbstractC7255e {
    public final AtomicReferenceFieldUpdater Signature;
    public final AtomicIntegerFieldUpdater admob;

    public C15011e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.Signature = atomicReferenceFieldUpdater;
        this.admob = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.AbstractC7255e
    public final int metrica(C12136e c12136e) {
        return this.admob.decrementAndGet(c12136e);
    }

    @Override // defpackage.AbstractC7255e
    public final void vip(C12136e c12136e, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.Signature;
            if (atomicReferenceFieldUpdater.compareAndSet(c12136e, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(c12136e) == null);
    }
}
