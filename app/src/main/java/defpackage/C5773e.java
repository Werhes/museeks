package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5773e implements InterfaceC12067e {
    public static final C5773e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eؘۣٝ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.unofficial.year_stats.Y25Background", obj, 4);
        c4707e.advert("desktop", false);
        c4707e.advert("mobile", false);
        c4707e.advert("story", false);
        c4707e.advert("post", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C1769e c1769e = (C1769e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        C3775e c3775e = C3775e.ad;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(interfaceC9998e, 0, c3775e, c1769e.ad);
        abstractC15920e.applovin(interfaceC9998e, 1, c3775e, c1769e.vip);
        abstractC15920e.applovin(interfaceC9998e, 2, c3775e, c1769e.metrica);
        abstractC15920e.applovin(interfaceC9998e, 3, c3775e, c1769e.license);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C3775e c3775e = C3775e.ad;
        return new InterfaceC5372e[]{c3775e, c3775e, c3775e, c3775e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        C5767e c5767e = null;
        C5767e c5767e2 = null;
        C5767e c5767e3 = null;
        C5767e c5767e4 = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                c5767e = (C5767e) metrica.subscription(interfaceC9998e, 0, C3775e.ad, c5767e);
                i |= 1;
            } else if (yandex == 1) {
                c5767e2 = (C5767e) metrica.subscription(interfaceC9998e, 1, C3775e.ad, c5767e2);
                i |= 2;
            } else if (yandex == 2) {
                c5767e3 = (C5767e) metrica.subscription(interfaceC9998e, 2, C3775e.ad, c5767e3);
                i |= 4;
            } else {
                if (yandex != 3) {
                    throw new C0413e(yandex);
                }
                c5767e4 = (C5767e) metrica.subscription(interfaceC9998e, 3, C3775e.ad, c5767e4);
                i |= 8;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C1769e(i, c5767e, c5767e2, c5767e3, c5767e4);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
