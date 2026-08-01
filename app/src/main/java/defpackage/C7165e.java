package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7165e implements InterfaceC12067e {
    public static final C7165e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚٔۥ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.orbitnetworking.proxy.VkConfigNetworkProxyProduct", obj, 3);
        c4707e.advert("product", true);
        c4707e.advert("version", true);
        c4707e.advert("data", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C10515e c10515e = (C10515e) obj;
        C7887e c7887e = c10515e.metrica;
        int i = c10515e.vip;
        String str = c10515e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        if (metrica.subscription() || !AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 0, str);
        }
        if (metrica.subscription() || i != 1) {
            ((AbstractC15920e) metrica).inmobi(1, i, interfaceC9998e);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(c7887e, new C7887e())) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 2, C5873e.ad, c7887e);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        return new InterfaceC5372e[]{C9582e.ad, C13257e.ad, C5873e.ad};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        String str = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        C7887e c7887e = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                str = metrica.smaato(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                i2 = metrica.remoteconfig(interfaceC9998e, 1);
                i |= 2;
            } else {
                if (yandex != 2) {
                    throw new C0413e(yandex);
                }
                c7887e = (C7887e) metrica.subscription(interfaceC9998e, 2, C5873e.ad, c7887e);
                i |= 4;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C10515e(i, str, i2, c7887e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
