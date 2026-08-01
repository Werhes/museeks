package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14579e {
    public static final /* synthetic */ AtomicReferenceFieldUpdater ad = AtomicReferenceFieldUpdater.newUpdater(C14579e.class, Object.class, "curRef");
    private volatile /* synthetic */ Object curRef = new C4101e(8);

    public final boolean ad(AbstractC12898e abstractC12898e) {
        while (true) {
            C4101e c4101e = (C4101e) this.curRef;
            int ad2 = c4101e.ad(abstractC12898e);
            if (ad2 == 0) {
                return true;
            }
            if (ad2 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ad;
                C4101e license = c4101e.license();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c4101e, license) && atomicReferenceFieldUpdater.get(this) == c4101e) {
                }
            } else if (ad2 == 2) {
                return false;
            }
        }
    }

    public final Object license() {
        while (true) {
            C4101e c4101e = (C4101e) this.curRef;
            Object appmetrica = c4101e.appmetrica();
            if (appmetrica != C4101e.purchase) {
                return appmetrica;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ad;
            C4101e license = c4101e.license();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c4101e, license) && atomicReferenceFieldUpdater.get(this) == c4101e) {
            }
        }
    }

    public final boolean metrica() {
        return ((C4101e) this.curRef).metrica();
    }

    public final void vip() {
        while (true) {
            C4101e c4101e = (C4101e) this.curRef;
            if (c4101e.vip()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ad;
            C4101e license = c4101e.license();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c4101e, license) && atomicReferenceFieldUpdater.get(this) == c4101e) {
            }
        }
    }
}
