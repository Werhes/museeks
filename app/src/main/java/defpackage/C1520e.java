package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؑٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1520e {
    public final InterfaceC0396e ad;
    public final Looper appmetrica;
    public Object license;
    public int metrica;
    public boolean purchase;
    public final InterfaceC14503e vip;

    public C1520e(InterfaceC14503e interfaceC14503e, InterfaceC0396e interfaceC0396e, AbstractC6690e abstractC6690e, int i, Looper looper) {
        this.vip = interfaceC14503e;
        this.ad = interfaceC0396e;
        this.appmetrica = looper;
    }

    public final synchronized void ad(boolean z) {
        notifyAll();
    }

    public final void vip() {
        AbstractC2301e.subscription(!this.purchase);
        this.purchase = true;
        C11246e c11246e = (C11246e) this.vip;
        if (!c11246e.f22584e && c11246e.f22542e.getThread().isAlive()) {
            c11246e.f22562e.vip(14, this).vip();
        } else {
            AbstractC2803e.smaato("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            ad(false);
        }
    }
}
