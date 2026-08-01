package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2447e implements InterfaceC12067e {
    public static final C2447e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eًؔٛ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthCodeAuthInfoDto", obj, 6);
        c4707e.advert("auth_id", false);
        c4707e.advert("client_info", false);
        c4707e.advert("device_info", false);
        c4707e.advert("domain", true);
        c4707e.advert("expires_in", false);
        c4707e.advert("flow_type", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C10813e c10813e = (C10813e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        String str = c10813e.ad;
        String str2 = c10813e.license;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, str);
        abstractC15920e.applovin(interfaceC9998e, 1, C18313e.ad, c10813e.vip);
        abstractC15920e.applovin(interfaceC9998e, 2, C4219e.ad, c10813e.metrica);
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            abstractC15920e.ads(interfaceC9998e, 3, str2);
        }
        abstractC15920e.inmobi(4, c10813e.appmetrica, interfaceC9998e);
        abstractC15920e.inmobi(5, c10813e.purchase, interfaceC9998e);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C9582e c9582e = C9582e.ad;
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{c9582e, C18313e.ad, C4219e.ad, c9582e, c13257e, c13257e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        C6902e c6902e = null;
        C15098e c15098e = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = metrica.smaato(interfaceC9998e, 0);
                    i |= 1;
                    break;
                case 1:
                    c6902e = (C6902e) metrica.subscription(interfaceC9998e, 1, C18313e.ad, c6902e);
                    i |= 2;
                    break;
                case 2:
                    c15098e = (C15098e) metrica.subscription(interfaceC9998e, 2, C4219e.ad, c15098e);
                    i |= 4;
                    break;
                case 3:
                    str2 = metrica.smaato(interfaceC9998e, 3);
                    i |= 8;
                    break;
                case 4:
                    i2 = metrica.remoteconfig(interfaceC9998e, 4);
                    i |= 16;
                    break;
                case 5:
                    i3 = metrica.remoteconfig(interfaceC9998e, 5);
                    i |= 32;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C10813e(i, str, c6902e, c15098e, str2, i2, i3);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
