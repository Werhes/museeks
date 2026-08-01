package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9091e implements InterfaceC12067e {
    public static final C9091e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eٌؚۤ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthSignupFieldsValuesDto", obj, 6);
        c4707e.advert("first_name", true);
        c4707e.advert("last_name", true);
        c4707e.advert("middle_name", true);
        c4707e.advert("gender", true);
        c4707e.advert("birthday", true);
        c4707e.advert("avatar", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C11782e c11782e = (C11782e) obj;
        String str = c11782e.purchase;
        C0212e c0212e = c11782e.appmetrica;
        EnumC4237e enumC4237e = c11782e.license;
        String str2 = c11782e.metrica;
        String str3 = c11782e.vip;
        String str4 = c11782e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C11782e.billing;
        if (metrica.subscription() || str4 != null) {
            metrica.Signature(interfaceC9998e, 0, C9582e.ad, str4);
        }
        if (metrica.subscription() || str3 != null) {
            metrica.Signature(interfaceC9998e, 1, C9582e.ad, str3);
        }
        if (metrica.subscription() || str2 != null) {
            metrica.Signature(interfaceC9998e, 2, C9582e.ad, str2);
        }
        if (metrica.subscription() || enumC4237e != null) {
            metrica.Signature(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), enumC4237e);
        }
        if (metrica.subscription() || c0212e != null) {
            metrica.Signature(interfaceC9998e, 4, C16248e.ad, c0212e);
        }
        if (metrica.subscription() || str != null) {
            metrica.Signature(interfaceC9998e, 5, C9582e.ad, str);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C11782e.billing;
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[3].getValue()), AbstractC6069e.purchase(C16248e.ad), AbstractC6069e.purchase(c9582e)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C11782e.billing;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        EnumC4237e enumC4237e = null;
        C0212e c0212e = null;
        String str4 = null;
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
                    enumC4237e = (EnumC4237e) metrica.inmobi(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), enumC4237e);
                    i |= 8;
                    break;
                case 4:
                    c0212e = (C0212e) metrica.inmobi(interfaceC9998e, 4, C16248e.ad, c0212e);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) metrica.inmobi(interfaceC9998e, 5, C9582e.ad, str4);
                    i |= 32;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C11782e(i, str, str2, str3, enumC4237e, c0212e, str4);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
