package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7773e extends C1613e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15757e = AtomicIntegerFieldUpdater.newUpdater(C7773e.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.C1613e, defpackage.C6467e
    public final void remoteconfig(Object obj) {
        signatures(obj);
    }

    @Override // defpackage.C1613e, defpackage.C6467e
    public final void signatures(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f15757e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC7214e.advert(AbstractC10558e.startapp(this.f4530e), AbstractC14161e.billing(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
