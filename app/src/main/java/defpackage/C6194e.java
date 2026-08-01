package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6194e {
    public final Runnable ad;
    public final C5363e vip = new C5363e(new C13465e(9, this));

    public C6194e(Runnable runnable) {
        this.ad = runnable;
    }

    public final void ad(C11109e c11109e, InterfaceC16400e interfaceC16400e) {
        final AbstractC0003e vip = interfaceC16400e.vip();
        if (((C4891e) vip).license == EnumC7785e.f15780e) {
            return;
        }
        C8198e c8198e = new C8198e(c11109e, new C8595e(c11109e, interfaceC16400e));
        c11109e.ad.add(c8198e);
        c8198e.billing(false);
        C11106e.adcel(vip().metrica, c8198e);
        final C5462e c5462e = new C5462e(c8198e, this, vip);
        vip.ad(c5462e);
        c11109e.metrica.add(new AutoCloseable() { // from class: eۣٗۢ
            @Override // java.lang.AutoCloseable
            public final void close() {
                AbstractC0003e.this.vip(c5462e);
            }
        });
    }

    public final void metrica(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        vip().metrica.Signature(new AbstractC15931e(onBackInvokedDispatcher, 0), 1);
        vip().metrica.Signature(new AbstractC15931e(onBackInvokedDispatcher, 1000000), 0);
    }

    public final C4640e vip() {
        return (C4640e) this.vip.getValue();
    }
}
