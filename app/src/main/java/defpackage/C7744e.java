package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7744e {
    public static final AtomicReferenceFieldUpdater vip = AtomicReferenceFieldUpdater.newUpdater(C7744e.class, Object.class, "ad");
    public volatile Object ad;

    public final boolean ad(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = vip;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(this) == obj);
        return false;
    }

    public final String toString() {
        return String.valueOf(this.ad);
    }
}
