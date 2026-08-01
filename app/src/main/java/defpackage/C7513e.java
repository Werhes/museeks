package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۡؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7513e {
    public final Function1 ad;
    public C5609e metrica;
    public int purchase;
    public final C12894e vip = new C12894e(28);
    public int license = -1;
    public int appmetrica = -1;

    public C7513e(Function1 function1) {
        this.ad = function1;
    }

    public final InterfaceC5066e ad(int i, long j, boolean z, Function1 function1) {
        C5609e c5609e = this.metrica;
        if (c5609e == null) {
            return C12109e.ad;
        }
        InterfaceC6357e interfaceC6357e = (InterfaceC6357e) c5609e.f11961e;
        boolean z2 = interfaceC6357e instanceof ViewOnAttachStateChangeListenerC0476e;
        C5492e c5492e = new C5492e(c5609e, i, this.vip, function1);
        c5492e.license = new C5602e(j);
        if (!z2) {
            interfaceC6357e.ad(c5492e);
        } else if (z) {
            ViewOnAttachStateChangeListenerC0476e viewOnAttachStateChangeListenerC0476e = (ViewOnAttachStateChangeListenerC0476e) interfaceC6357e;
            viewOnAttachStateChangeListenerC0476e.f2548e.add(new C5388e(1, c5492e));
            if (!viewOnAttachStateChangeListenerC0476e.f2547e) {
                viewOnAttachStateChangeListenerC0476e.f2547e = true;
                viewOnAttachStateChangeListenerC0476e.f2550e.post(viewOnAttachStateChangeListenerC0476e);
            }
        } else {
            ViewOnAttachStateChangeListenerC0476e viewOnAttachStateChangeListenerC0476e2 = (ViewOnAttachStateChangeListenerC0476e) interfaceC6357e;
            viewOnAttachStateChangeListenerC0476e2.f2548e.add(new C5388e(0, c5492e));
            if (!viewOnAttachStateChangeListenerC0476e2.f2547e) {
                viewOnAttachStateChangeListenerC0476e2.f2547e = true;
                viewOnAttachStateChangeListenerC0476e2.f2550e.post(viewOnAttachStateChangeListenerC0476e2);
            }
        }
        AbstractC14204e.m3773final(i, "compose:lazy:schedule_prefetch:index");
        return c5492e;
    }
}
