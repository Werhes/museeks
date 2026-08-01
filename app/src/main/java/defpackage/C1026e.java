package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1026e implements InterfaceC12822e {
    @Override // defpackage.InterfaceC12822e
    public final int ad() {
        return 2;
    }

    @Override // defpackage.InterfaceC12822e
    public final int vip(InterfaceC6647e interfaceC6647e, InterfaceC6647e interfaceC6647e2, InterfaceC5052e interfaceC5052e) {
        C8522e c8522e;
        C8522e c8522e2;
        if (!(interfaceC6647e2 instanceof C0782e)) {
            return 3;
        }
        C0782e c0782e = (C0782e) interfaceC6647e2;
        if (!c0782e.getTypeParameters().isEmpty()) {
            return 3;
        }
        C6700e startapp = C14514e.startapp(interfaceC6647e, interfaceC6647e2);
        if ((startapp != null ? startapp.vip() : 0) != 0) {
            return 3;
        }
        InterfaceC9093e billing = AbstractC1660e.billing(new InterfaceC9093e[]{new C2167e(new C1356e(1, c0782e.mo330e()), C7247e.f14835e), new C6209e(1, c0782e.f29665e)});
        C7983e c7983e = new C7983e(12);
        if (billing instanceof C2167e) {
            C2167e c2167e = (C2167e) billing;
            c8522e = new C8522e(c2167e.ad, c2167e.vip, c7983e);
        } else {
            c8522e = new C8522e(billing, new C3114e(27), c7983e);
        }
        C16169e c16169e = c0782e.f29656e;
        InterfaceC9093e billing2 = AbstractC1660e.billing(new InterfaceC9093e[]{c8522e, new C1356e(1, AbstractC6874e.adcel(c16169e != null ? c16169e.ad() : null))});
        C7983e c7983e2 = new C7983e(12);
        if (billing2 instanceof C2167e) {
            C2167e c2167e2 = (C2167e) billing2;
            c8522e2 = new C8522e(c2167e2.ad, c2167e2.vip, c7983e2);
        } else {
            c8522e2 = new C8522e(billing2, new C3114e(27), c7983e2);
        }
        C10649e c10649e = new C10649e(c8522e2);
        while (c10649e.hasNext()) {
            AbstractC1186e abstractC1186e = (AbstractC1186e) c10649e.next();
            if (!abstractC1186e.mopub().isEmpty() && !(abstractC1186e.subscription() instanceof C13902e)) {
                return 3;
            }
        }
        InterfaceC6647e interfaceC6647e3 = (InterfaceC6647e) interfaceC6647e.remoteconfig(new C4542e(new C13714e()));
        if (interfaceC6647e3 == null) {
            return 3;
        }
        if (interfaceC6647e3 instanceof C1117e) {
            C1117e c1117e = (C1117e) interfaceC6647e3;
            if (!c1117e.getTypeParameters().isEmpty()) {
                interfaceC6647e3 = c1117e.mo471e().subscription().build();
            }
        }
        return AbstractC6631e.ad[AbstractC8703e.m2467class(C14514e.metrica.amazon(interfaceC6647e3, interfaceC6647e2, false).vip())] == 1 ? 1 : 3;
    }
}
