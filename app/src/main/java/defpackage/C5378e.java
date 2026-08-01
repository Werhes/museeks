package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5378e implements InterfaceC2425e {
    public final /* synthetic */ View ad;
    public final /* synthetic */ C1059e metrica;
    public final /* synthetic */ AbstractC13859e vip;

    public C5378e(C1059e c1059e, View view, View view2, View view3, AbstractC13859e abstractC13859e) {
        this.metrica = c1059e;
        this.ad = view;
        this.vip = abstractC13859e;
    }

    @Override // defpackage.InterfaceC2425e
    public final void ad(C9142e c9142e) {
        c9142e.vip();
        C1059e c1059e = this.metrica;
        ((InterfaceC17022e) c1059e.f3582e.f29787e).getClass();
        c1059e.f3582e = null;
        this.vip.getClass();
        if (c1059e.f3585e.size() > 1) {
            C1059e c1059e2 = ((AbstractC13859e) c1059e.f3585e.get(r1.size() - 2)).f27447e;
            InterfaceC10817e instanceDefaultTouchTransformer = c1059e2 != null ? c1059e2.getInstanceDefaultTouchTransformer() : null;
            if (instanceDefaultTouchTransformer == null) {
                instanceDefaultTouchTransformer = C1059e.getDefaultTouchTransformer();
            }
            c1059e.f3564e = instanceDefaultTouchTransformer;
            ((C14595e) instanceDefaultTouchTransformer).getClass();
            c1059e.f3587e = new EnumC9210e[]{EnumC9210e.f18400e};
        }
        c1059e.vip();
        c1059e.yandex();
        if (c1059e.getBackView() != null) {
            c1059e.getBackView().setVisibility(8);
        }
        InterfaceC10956e interfaceC10956e = c1059e.f3562e;
        if (interfaceC10956e != null) {
            ((AbstractActivityC17704e) interfaceC10956e).tapsense();
        }
    }

    @Override // defpackage.InterfaceC2425e
    public final void vip() {
        this.ad.setVisibility(0);
    }
}
