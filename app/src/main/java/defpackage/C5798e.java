package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5798e implements InterfaceC12067e {
    public static final C5798e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eؘٟؔ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthUserDto", obj, 8);
        c4707e.advert("first_name", false);
        c4707e.advert("has_2fa", false);
        c4707e.advert("last_name", false);
        c4707e.advert("photo_200", false);
        c4707e.advert("deactivated", true);
        c4707e.advert("phone", true);
        c4707e.advert("has_password", true);
        c4707e.advert("can_unbind_phone", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C5809e c5809e = (C5809e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        String str = c5809e.ad;
        Boolean bool = c5809e.yandex;
        Boolean bool2 = c5809e.billing;
        String str2 = c5809e.purchase;
        String str3 = c5809e.appmetrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, str);
        abstractC15920e.signatures(interfaceC9998e, 1, c5809e.vip);
        abstractC15920e.ads(interfaceC9998e, 2, c5809e.metrica);
        abstractC15920e.ads(interfaceC9998e, 3, c5809e.license);
        if (abstractC15920e.subscription() || str3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 4, C9582e.ad, str3);
        }
        if (abstractC15920e.subscription() || str2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 5, C9582e.ad, str2);
        }
        if (abstractC15920e.subscription() || bool2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 6, C6266e.ad, bool2);
        }
        if (abstractC15920e.subscription() || bool != null) {
            abstractC15920e.Signature(interfaceC9998e, 7, C6266e.ad, bool);
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
        C6266e c6266e = C6266e.ad;
        return new InterfaceC5372e[]{c9582e, c6266e, c9582e, c9582e, AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        boolean z2 = true;
        while (z2) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    str = metrica.smaato(interfaceC9998e, 0);
                    i |= 1;
                    break;
                case 1:
                    z = metrica.applovin(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = metrica.smaato(interfaceC9998e, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = metrica.smaato(interfaceC9998e, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) metrica.inmobi(interfaceC9998e, 4, C9582e.ad, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) metrica.inmobi(interfaceC9998e, 5, C9582e.ad, str5);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) metrica.inmobi(interfaceC9998e, 6, C6266e.ad, bool);
                    i |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) metrica.inmobi(interfaceC9998e, 7, C6266e.ad, bool2);
                    i |= 128;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C5809e(i, str, z, str2, str3, str4, str5, bool, bool2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
