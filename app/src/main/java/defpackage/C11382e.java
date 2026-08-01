package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۥۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11382e implements InterfaceC12067e {
    public static final C11382e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eُۥۖ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetPlaylistsResponseDto", obj, 5);
        c4707e.advert("count", true);
        c4707e.advert("items", true);
        c4707e.advert("groups", true);
        c4707e.advert("profiles", true);
        c4707e.advert("next_from", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C7555e c7555e = (C7555e) obj;
        String str = c7555e.appmetrica;
        List list = c7555e.license;
        List list2 = c7555e.metrica;
        List list3 = c7555e.vip;
        int i = c7555e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C7555e.purchase;
        if (metrica.subscription() || i != 0) {
            ((AbstractC15920e) metrica).inmobi(0, i, interfaceC9998e);
        }
        boolean subscription = metrica.subscription();
        C13664e c13664e = C13664e.f27089e;
        if (subscription || !AbstractC7890e.billing(list3, c13664e)) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), list3);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(list2, c13664e)) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), list2);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(list, c13664e)) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), list);
        }
        if (metrica.subscription() || str != null) {
            metrica.Signature(interfaceC9998e, 4, C9582e.ad, str);
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
        InterfaceC3477e[] interfaceC3477eArr = C7555e.purchase;
        return new InterfaceC5372e[]{C13257e.ad, interfaceC3477eArr[1].getValue(), interfaceC3477eArr[2].getValue(), interfaceC3477eArr[3].getValue(), AbstractC6069e.purchase(C9582e.ad)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C7555e.purchase;
        int i = 0;
        int i2 = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        String str = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                i2 = metrica.remoteconfig(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                list = (List) metrica.subscription(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), list);
                i |= 2;
            } else if (yandex == 2) {
                list2 = (List) metrica.subscription(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), list2);
                i |= 4;
            } else if (yandex == 3) {
                list3 = (List) metrica.subscription(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), list3);
                i |= 8;
            } else {
                if (yandex != 4) {
                    throw new C0413e(yandex);
                }
                str = (String) metrica.inmobi(interfaceC9998e, 4, C9582e.ad, str);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C7555e(i, i2, list, list2, list3, str);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
