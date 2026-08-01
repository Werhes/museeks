package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٛٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4219e implements InterfaceC12067e {
    public static final C4219e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؖٛٛ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthCodeAuthDeviceInfoDto", obj, 8);
        c4707e.advert("browser_name", true);
        c4707e.advert("browser_package", true);
        c4707e.advert("browser_page_link", true);
        c4707e.advert("browser_url_scheme", true);
        c4707e.advert("ip", true);
        c4707e.advert("location", true);
        c4707e.advert("location_map", true);
        c4707e.advert("name", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C15098e c15098e = (C15098e) obj;
        String str = c15098e.yandex;
        String str2 = c15098e.billing;
        String str3 = c15098e.purchase;
        String str4 = c15098e.appmetrica;
        String str5 = c15098e.license;
        String str6 = c15098e.metrica;
        String str7 = c15098e.vip;
        String str8 = c15098e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        if (metrica.subscription() || str8 != null) {
            metrica.Signature(interfaceC9998e, 0, C9582e.ad, str8);
        }
        if (metrica.subscription() || str7 != null) {
            metrica.Signature(interfaceC9998e, 1, C9582e.ad, str7);
        }
        if (metrica.subscription() || str6 != null) {
            metrica.Signature(interfaceC9998e, 2, C9582e.ad, str6);
        }
        if (metrica.subscription() || str5 != null) {
            metrica.Signature(interfaceC9998e, 3, C9582e.ad, str5);
        }
        if (metrica.subscription() || str4 != null) {
            metrica.Signature(interfaceC9998e, 4, C9582e.ad, str4);
        }
        if (metrica.subscription() || str3 != null) {
            metrica.Signature(interfaceC9998e, 5, C9582e.ad, str3);
        }
        if (metrica.subscription() || str2 != null) {
            metrica.Signature(interfaceC9998e, 6, C9582e.ad, str2);
        }
        if (metrica.subscription() || str != null) {
            metrica.Signature(interfaceC9998e, 7, C9582e.ad, str);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) metrica.inmobi(interfaceC9998e, 0, C9582e.ad, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) metrica.inmobi(interfaceC9998e, 1, C9582e.ad, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) metrica.inmobi(interfaceC9998e, 2, C9582e.ad, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) metrica.inmobi(interfaceC9998e, 3, C9582e.ad, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) metrica.inmobi(interfaceC9998e, 4, C9582e.ad, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) metrica.inmobi(interfaceC9998e, 5, C9582e.ad, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) metrica.inmobi(interfaceC9998e, 6, C9582e.ad, str7);
                    i |= 64;
                    break;
                case 7:
                    str8 = (String) metrica.inmobi(interfaceC9998e, 7, C9582e.ad, str8);
                    i |= 128;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C15098e(i, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
