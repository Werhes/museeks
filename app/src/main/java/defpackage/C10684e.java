package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10684e {
    public final AtomicReference ad = new AtomicReference(null);
    public final C17651e vip = AbstractC12751e.ad();

    public static final void ad(C10684e c10684e, C4967e c4967e) {
        AtomicReference atomicReference = c10684e.ad;
        while (true) {
            C4967e c4967e2 = (C4967e) atomicReference.get();
            if (c4967e2 != null && c4967e.ad.compareTo(c4967e2.ad) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(c4967e2, c4967e)) {
                if (atomicReference.get() != c4967e2) {
                    break;
                }
            }
            if (c4967e2 != null) {
                c4967e2.vip.Signature(new AbstractC4233e("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }
}
