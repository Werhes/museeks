package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؓؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1575e implements InterfaceC12067e {
    public static final C1575e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eۣؓؔ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistActionDto", obj, 2);
        c4707e.advert("type", false);
        c4707e.advert("location", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C1716e c1716e = (C1716e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C1716e.metrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), c1716e.ad);
        abstractC15920e.applovin(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), c1716e.vip);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C1716e.metrica;
        return new InterfaceC5372e[]{interfaceC3477eArr[0].getValue(), interfaceC3477eArr[1].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C1716e.metrica;
        EnumC6983e enumC6983e = null;
        boolean z = true;
        int i = 0;
        EnumC0422e enumC0422e = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                enumC6983e = (EnumC6983e) metrica.subscription(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), enumC6983e);
                i |= 1;
            } else {
                if (yandex != 1) {
                    throw new C0413e(yandex);
                }
                enumC0422e = (EnumC0422e) metrica.subscription(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), enumC0422e);
                i |= 2;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C1716e(i, enumC6983e, enumC0422e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
