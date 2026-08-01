package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13913e implements InterfaceC12067e {
    public static final C13913e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eُٓۢ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audiobook.AudioBooksItemPersonDto", obj, 6);
        c4707e.advert("description", true);
        c4707e.advert("id", true);
        c4707e.advert("legal_notice", true);
        c4707e.advert("name", true);
        c4707e.advert("photo", true);
        c4707e.advert("roles", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C2662e c2662e = (C2662e) obj;
        List list = c2662e.purchase;
        List list2 = c2662e.appmetrica;
        String str = c2662e.license;
        C18243e c18243e = c2662e.metrica;
        Integer num = c2662e.vip;
        String str2 = c2662e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C2662e.billing;
        if (metrica.subscription() || str2 != null) {
            metrica.Signature(interfaceC9998e, 0, C9582e.ad, str2);
        }
        if (metrica.subscription() || num != null) {
            metrica.Signature(interfaceC9998e, 1, C13257e.ad, num);
        }
        if (metrica.subscription() || c18243e != null) {
            metrica.Signature(interfaceC9998e, 2, C14288e.ad, c18243e);
        }
        if (metrica.subscription() || str != null) {
            metrica.Signature(interfaceC9998e, 3, C9582e.ad, str);
        }
        boolean subscription = metrica.subscription();
        C13664e c13664e = C13664e.f27089e;
        if (subscription || !AbstractC7890e.billing(list2, c13664e)) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), list2);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(list, c13664e)) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 5, (InterfaceC5372e) interfaceC3477eArr[5].getValue(), list);
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
        InterfaceC3477e[] interfaceC3477eArr = C2662e.billing;
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(C13257e.ad), AbstractC6069e.purchase(C14288e.ad), AbstractC6069e.purchase(c9582e), interfaceC3477eArr[4].getValue(), interfaceC3477eArr[5].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C2662e.billing;
        int i = 0;
        String str = null;
        Integer num = null;
        C18243e c18243e = null;
        String str2 = null;
        List list = null;
        List list2 = null;
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
                    num = (Integer) metrica.inmobi(interfaceC9998e, 1, C13257e.ad, num);
                    i |= 2;
                    break;
                case 2:
                    c18243e = (C18243e) metrica.inmobi(interfaceC9998e, 2, C14288e.ad, c18243e);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) metrica.inmobi(interfaceC9998e, 3, C9582e.ad, str2);
                    i |= 8;
                    break;
                case 4:
                    list = (List) metrica.subscription(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) metrica.subscription(interfaceC9998e, 5, (InterfaceC5372e) interfaceC3477eArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C2662e(i, str, num, c18243e, str2, list, list2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
