package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7946e implements InterfaceC12067e {
    public static final C7946e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eًٕؓ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthRefreshTokenDto", obj, 7);
        c4707e.advert("index", false);
        c4707e.advert("user_id", false);
        c4707e.advert("banned", false);
        c4707e.advert("access_token", true);
        c4707e.advert("webview_access_token", true);
        c4707e.advert("webview_refresh_token", true);
        c4707e.advert("silent_token", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C13306e c13306e = (C13306e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        int i = c13306e.ad;
        C7496e c7496e = c13306e.billing;
        C3503e c3503e = c13306e.purchase;
        C16495e c16495e = c13306e.appmetrica;
        C3984e c3984e = c13306e.license;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.inmobi(0, i, interfaceC9998e);
        abstractC15920e.applovin(interfaceC9998e, 1, C13980e.ad, new C5655e(c13306e.vip));
        abstractC15920e.signatures(interfaceC9998e, 2, c13306e.metrica);
        if (abstractC15920e.subscription() || c3984e != null) {
            abstractC15920e.Signature(interfaceC9998e, 3, C8860e.ad, c3984e);
        }
        if (abstractC15920e.subscription() || c16495e != null) {
            abstractC15920e.Signature(interfaceC9998e, 4, C13900e.ad, c16495e);
        }
        if (abstractC15920e.subscription() || c3503e != null) {
            abstractC15920e.Signature(interfaceC9998e, 5, C15882e.ad, c3503e);
        }
        if (abstractC15920e.subscription() || c7496e != null) {
            abstractC15920e.Signature(interfaceC9998e, 6, C13667e.ad, c7496e);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        return new InterfaceC5372e[]{C13257e.ad, C13980e.ad, C6266e.ad, AbstractC6069e.purchase(C8860e.ad), AbstractC6069e.purchase(C13900e.ad), AbstractC6069e.purchase(C15882e.ad), AbstractC6069e.purchase(C13667e.ad)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        C5655e c5655e = null;
        C3984e c3984e = null;
        C16495e c16495e = null;
        C3503e c3503e = null;
        C7496e c7496e = null;
        boolean z2 = true;
        while (z2) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    i2 = metrica.remoteconfig(interfaceC9998e, 0);
                    i |= 1;
                    break;
                case 1:
                    c5655e = (C5655e) metrica.subscription(interfaceC9998e, 1, C13980e.ad, c5655e);
                    i |= 2;
                    break;
                case 2:
                    z = metrica.applovin(interfaceC9998e, 2);
                    i |= 4;
                    break;
                case 3:
                    c3984e = (C3984e) metrica.inmobi(interfaceC9998e, 3, C8860e.ad, c3984e);
                    i |= 8;
                    break;
                case 4:
                    c16495e = (C16495e) metrica.inmobi(interfaceC9998e, 4, C13900e.ad, c16495e);
                    i |= 16;
                    break;
                case 5:
                    c3503e = (C3503e) metrica.inmobi(interfaceC9998e, 5, C15882e.ad, c3503e);
                    i |= 32;
                    break;
                case 6:
                    c7496e = (C7496e) metrica.inmobi(interfaceC9998e, 6, C13667e.ad, c7496e);
                    i |= 64;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C13306e(i, i2, c5655e, z, c3984e, c16495e, c3503e, c7496e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
