package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5873e implements InterfaceC12067e {
    public static final C5873e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘٖۙ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.orbitnetworking.proxy.VkConfigNetworkProxyProduct.VkConfigNetworkProxy", obj, 3);
        c4707e.advert("ip", true);
        c4707e.advert("weight", true);
        c4707e.advert("domains", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C7887e c7887e = (C7887e) obj;
        List list = c7887e.metrica;
        List list2 = c7887e.vip;
        List list3 = c7887e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C7887e.license;
        boolean subscription = metrica.subscription();
        C13664e c13664e = C13664e.f27089e;
        if (subscription || !AbstractC7890e.billing(list3, c13664e)) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), list3);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(list2, c13664e)) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), list2);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(list, c13664e)) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), list);
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
        InterfaceC3477e[] interfaceC3477eArr = C7887e.license;
        return new InterfaceC5372e[]{interfaceC3477eArr[0].getValue(), interfaceC3477eArr[1].getValue(), interfaceC3477eArr[2].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C7887e.license;
        List list = null;
        boolean z = true;
        int i = 0;
        List list2 = null;
        List list3 = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                list = (List) metrica.subscription(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), list);
                i |= 1;
            } else if (yandex == 1) {
                list2 = (List) metrica.subscription(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), list2);
                i |= 2;
            } else {
                if (yandex != 2) {
                    throw new C0413e(yandex);
                }
                list3 = (List) metrica.subscription(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), list3);
                i |= 4;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C7887e(i, list, list2, list3);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
