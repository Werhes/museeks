package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٞۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10425e implements InterfaceC12067e {
    public static final C10425e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eَٞۨ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthProcessAuthCodeResponseDto", obj, 4);
        c4707e.advert("status", true);
        c4707e.advert("auth_info", true);
        c4707e.advert("errors", true);
        c4707e.advert("profile", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C8125e c8125e = (C8125e) obj;
        C5485e c5485e = c8125e.license;
        List list = c8125e.metrica;
        C10813e c10813e = c8125e.vip;
        int i = c8125e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C8125e.appmetrica;
        if (metrica.subscription() || i != 0) {
            ((AbstractC15920e) metrica).inmobi(0, i, interfaceC9998e);
        }
        if (metrica.subscription() || c10813e != null) {
            metrica.Signature(interfaceC9998e, 1, C2447e.ad, c10813e);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(list, C13664e.f27089e)) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), list);
        }
        if (metrica.subscription() || c5485e != null) {
            metrica.Signature(interfaceC9998e, 3, C2627e.ad, c5485e);
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
        return new InterfaceC5372e[]{C13257e.ad, AbstractC6069e.purchase(C2447e.ad), C8125e.appmetrica[2].getValue(), AbstractC6069e.purchase(C2627e.ad)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C8125e.appmetrica;
        int i = 0;
        int i2 = 0;
        C10813e c10813e = null;
        List list = null;
        C5485e c5485e = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                i2 = metrica.remoteconfig(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                c10813e = (C10813e) metrica.inmobi(interfaceC9998e, 1, C2447e.ad, c10813e);
                i |= 2;
            } else if (yandex == 2) {
                list = (List) metrica.subscription(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), list);
                i |= 4;
            } else {
                if (yandex != 3) {
                    throw new C0413e(yandex);
                }
                c5485e = (C5485e) metrica.inmobi(interfaceC9998e, 3, C2627e.ad, c5485e);
                i |= 8;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C8125e(i, i2, c10813e, list, c5485e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
