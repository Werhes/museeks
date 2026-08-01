package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7129e implements InterfaceC12067e {
    public static final C7129e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚْٓ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.base.BaseLinkButtonActionDto", obj, 3);
        c4707e.advert("type", false);
        c4707e.advert("target", true);
        c4707e.advert("url", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C3010e c3010e = (C3010e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C3010e.license;
        InterfaceC5372e interfaceC5372e = (InterfaceC5372e) interfaceC3477eArr[0].getValue();
        EnumC8621e enumC8621e = c3010e.ad;
        String str = c3010e.metrica;
        EnumC8450e enumC8450e = c3010e.vip;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(interfaceC9998e, 0, interfaceC5372e, enumC8621e);
        if (abstractC15920e.subscription() || enumC8450e != null) {
            abstractC15920e.Signature(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), enumC8450e);
        }
        if (abstractC15920e.subscription() || str != null) {
            abstractC15920e.Signature(interfaceC9998e, 2, C9582e.ad, str);
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
        InterfaceC3477e[] interfaceC3477eArr = C3010e.license;
        return new InterfaceC5372e[]{interfaceC3477eArr[0].getValue(), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[1].getValue()), AbstractC6069e.purchase(C9582e.ad)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C3010e.license;
        EnumC8621e enumC8621e = null;
        boolean z = true;
        int i = 0;
        EnumC8450e enumC8450e = null;
        String str = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                enumC8621e = (EnumC8621e) metrica.subscription(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), enumC8621e);
                i |= 1;
            } else if (yandex == 1) {
                enumC8450e = (EnumC8450e) metrica.inmobi(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), enumC8450e);
                i |= 2;
            } else {
                if (yandex != 2) {
                    throw new C0413e(yandex);
                }
                str = (String) metrica.inmobi(interfaceC9998e, 2, C9582e.ad, str);
                i |= 4;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C3010e(i, enumC8621e, enumC8450e, str);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
