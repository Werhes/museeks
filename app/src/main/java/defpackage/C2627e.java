package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2627e implements InterfaceC12067e {
    public static final C2627e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eْؔٗ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthCodeAuthUserDto", obj, 5);
        c4707e.advert("first_name", false);
        c4707e.advert("last_name", false);
        c4707e.advert("phone", true);
        c4707e.advert("photo_200", true);
        c4707e.advert("photo_50", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C5485e c5485e = (C5485e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        String str = c5485e.ad;
        String str2 = c5485e.appmetrica;
        String str3 = c5485e.license;
        String str4 = c5485e.metrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, str);
        abstractC15920e.ads(interfaceC9998e, 1, c5485e.vip);
        if (abstractC15920e.subscription() || str4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 2, C9582e.ad, str4);
        }
        if (abstractC15920e.subscription() || str3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 3, C9582e.ad, str3);
        }
        if (abstractC15920e.subscription() || str2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 4, C9582e.ad, str2);
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
        return new InterfaceC5372e[]{c9582e, c9582e, AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e)};
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
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                str = metrica.smaato(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                str2 = metrica.smaato(interfaceC9998e, 1);
                i |= 2;
            } else if (yandex == 2) {
                str3 = (String) metrica.inmobi(interfaceC9998e, 2, C9582e.ad, str3);
                i |= 4;
            } else if (yandex == 3) {
                str4 = (String) metrica.inmobi(interfaceC9998e, 3, C9582e.ad, str4);
                i |= 8;
            } else {
                if (yandex != 4) {
                    throw new C0413e(yandex);
                }
                str5 = (String) metrica.inmobi(interfaceC9998e, 4, C9582e.ad, str5);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C5485e(i, str, str2, str3, str4, str5);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
