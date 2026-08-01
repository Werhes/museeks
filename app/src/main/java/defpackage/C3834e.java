package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؒۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3834e {
    public static final /* synthetic */ AtomicReferenceFieldUpdater ad = AtomicReferenceFieldUpdater.newUpdater(C3834e.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C7480e(8, false);

    public final boolean ad(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ad;
            C7480e c7480e = (C7480e) atomicReferenceFieldUpdater.get(this);
            int ad2 = c7480e.ad(runnable);
            if (ad2 == 0) {
                return true;
            }
            if (ad2 == 1) {
                C7480e metrica = c7480e.metrica();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c7480e, metrica) && atomicReferenceFieldUpdater.get(this) == c7480e) {
                }
            } else if (ad2 == 2) {
                return false;
            }
        }
    }

    public final Object license() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ad;
            C7480e c7480e = (C7480e) atomicReferenceFieldUpdater.get(this);
            Object license = c7480e.license();
            if (license != C7480e.billing) {
                return license;
            }
            C7480e metrica = c7480e.metrica();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c7480e, metrica) && atomicReferenceFieldUpdater.get(this) == c7480e) {
            }
        }
    }

    public final int metrica() {
        C7480e c7480e = (C7480e) ad.get(this);
        c7480e.getClass();
        long j = C7480e.purchase.get(c7480e);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final void vip() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ad;
            C7480e c7480e = (C7480e) atomicReferenceFieldUpdater.get(this);
            if (c7480e.vip()) {
                return;
            }
            C7480e metrica = c7480e.metrica();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c7480e, metrica) && atomicReferenceFieldUpdater.get(this) == c7480e) {
            }
        }
    }
}
