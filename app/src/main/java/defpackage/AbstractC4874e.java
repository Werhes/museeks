package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4874e {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10345e = AtomicReferenceFieldUpdater.newUpdater(AbstractC4874e.class, Object.class, "_next$volatile");

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10344e = AtomicReferenceFieldUpdater.newUpdater(AbstractC4874e.class, Object.class, "_prev$volatile");

    public AbstractC4874e(AbstractC12466e abstractC12466e) {
        this._prev$volatile = abstractC12466e;
    }

    public final void appmetrica() {
        AbstractC4874e metrica;
        if (metrica() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10344e;
            AbstractC4874e abstractC4874e = (AbstractC4874e) atomicReferenceFieldUpdater.get(this);
            while (abstractC4874e != null && abstractC4874e.license()) {
                abstractC4874e = (AbstractC4874e) atomicReferenceFieldUpdater.get(abstractC4874e);
            }
            AbstractC4874e metrica2 = metrica();
            while (metrica2.license() && (metrica = metrica2.metrica()) != null) {
                metrica2 = metrica;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(metrica2);
                AbstractC4874e abstractC4874e2 = ((AbstractC4874e) obj) == null ? null : abstractC4874e;
                while (!atomicReferenceFieldUpdater.compareAndSet(metrica2, obj, abstractC4874e2)) {
                    if (atomicReferenceFieldUpdater.get(metrica2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC4874e != null) {
                f10345e.set(abstractC4874e, metrica2);
            }
            if (!metrica2.license() || metrica2.metrica() == null) {
                if (abstractC4874e == null || !abstractC4874e.license()) {
                    return;
                }
            }
        }
    }

    public abstract boolean license();

    public final AbstractC4874e metrica() {
        Object obj = f10345e.get(this);
        if (obj == AbstractC2251e.ad) {
            return null;
        }
        return (AbstractC4874e) obj;
    }

    public final void vip() {
        f10344e.set(this, null);
    }
}
