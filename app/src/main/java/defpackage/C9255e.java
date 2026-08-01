package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۣؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9255e implements InterfaceC14230e {
    public final C11074e ad;
    public InterfaceC7865e license;
    public final C3154e metrica;
    public final C8591e vip;

    public C9255e(C11074e c11074e, C8591e c8591e, C3154e c3154e) {
        this.ad = c11074e;
        this.vip = c8591e;
        this.metrica = c3154e;
    }

    @Override // defpackage.InterfaceC14230e
    public final void reset() {
        C11074e c11074e = this.ad;
        synchronized (c11074e.f21965e) {
            try {
                C8823e c8823e = c11074e.f21966e;
                if (c8823e != null) {
                    c11074e.f21966e = null;
                    c8823e.m2503e(new Exception("The camera control has became inactive."));
                }
                C8823e c8823e2 = c11074e.f21963e;
                if (c8823e2 != null) {
                    c11074e.f21963e = null;
                    c8823e2.m2503e(new Exception("The camera control has became inactive."));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.metrica.vip(this.ad);
    }

    @Override // defpackage.InterfaceC14230e
    public final void vip(InterfaceC7865e interfaceC7865e) {
        this.license = interfaceC7865e;
        if (interfaceC7865e != null) {
            C3154e c3154e = this.metrica;
            C11074e c11074e = this.ad;
            c3154e.vip(c11074e);
            c3154e.ad(c11074e, this.vip.license);
            c11074e.ad(interfaceC7865e, false);
        }
    }
}
