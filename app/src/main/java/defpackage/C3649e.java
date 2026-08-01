package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۜۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3649e implements InterfaceC12067e {
    public static final C3649e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eؕۜۚ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioSearchMainResponseDto", obj, 7);
        c4707e.advert("albums", true);
        c4707e.advert("audios", true);
        c4707e.advert("artists", true);
        c4707e.advert("playlists", true);
        c4707e.advert("own_audios", true);
        c4707e.advert("own_playlists", true);
        c4707e.advert("own_albums", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C6207e c6207e = (C6207e) obj;
        C8641e c8641e = c6207e.billing;
        C8641e c8641e2 = c6207e.purchase;
        C8641e c8641e3 = c6207e.appmetrica;
        C8641e c8641e4 = c6207e.license;
        C8641e c8641e5 = c6207e.metrica;
        C8641e c8641e6 = c6207e.vip;
        C8641e c8641e7 = c6207e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C6207e.yandex;
        if (metrica.subscription() || !AbstractC7890e.billing(c8641e7, new C8641e())) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), c8641e7);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(c8641e6, new C8641e())) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), c8641e6);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(c8641e5, new C8641e())) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), c8641e5);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(c8641e4, new C8641e())) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), c8641e4);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(c8641e3, new C8641e())) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), c8641e3);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(c8641e2, new C8641e())) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 5, (InterfaceC5372e) interfaceC3477eArr[5].getValue(), c8641e2);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(c8641e, new C8641e())) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 6, (InterfaceC5372e) interfaceC3477eArr[6].getValue(), c8641e);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C6207e.yandex;
        return new InterfaceC5372e[]{interfaceC3477eArr[0].getValue(), interfaceC3477eArr[1].getValue(), interfaceC3477eArr[2].getValue(), interfaceC3477eArr[3].getValue(), interfaceC3477eArr[4].getValue(), interfaceC3477eArr[5].getValue(), interfaceC3477eArr[6].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C6207e.yandex;
        int i = 0;
        C8641e c8641e = null;
        C8641e c8641e2 = null;
        C8641e c8641e3 = null;
        C8641e c8641e4 = null;
        C8641e c8641e5 = null;
        C8641e c8641e6 = null;
        C8641e c8641e7 = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    c8641e = (C8641e) metrica.subscription(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), c8641e);
                    i |= 1;
                    break;
                case 1:
                    c8641e2 = (C8641e) metrica.subscription(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), c8641e2);
                    i |= 2;
                    break;
                case 2:
                    c8641e3 = (C8641e) metrica.subscription(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), c8641e3);
                    i |= 4;
                    break;
                case 3:
                    c8641e4 = (C8641e) metrica.subscription(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), c8641e4);
                    i |= 8;
                    break;
                case 4:
                    c8641e5 = (C8641e) metrica.subscription(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), c8641e5);
                    i |= 16;
                    break;
                case 5:
                    c8641e6 = (C8641e) metrica.subscription(interfaceC9998e, 5, (InterfaceC5372e) interfaceC3477eArr[5].getValue(), c8641e6);
                    i |= 32;
                    break;
                case 6:
                    c8641e7 = (C8641e) metrica.subscription(interfaceC9998e, 6, (InterfaceC5372e) interfaceC3477eArr[6].getValue(), c8641e7);
                    i |= 64;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C6207e(i, c8641e, c8641e2, c8641e3, c8641e4, c8641e5, c8641e6, c8641e7);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
