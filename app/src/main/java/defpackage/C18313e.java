package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18313e implements InterfaceC12067e {
    public static final C18313e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eۗٓ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthCodeAuthClientInfoDto", obj, 7);
        c4707e.advert("agreements", true);
        c4707e.advert("icon_150", true);
        c4707e.advert("icon_75", true);
        c4707e.advert("id", false);
        c4707e.advert("is_official", true);
        c4707e.advert("name", false);
        c4707e.advert("scopes", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C6902e c6902e = (C6902e) obj;
        String str = c6902e.metrica;
        String str2 = c6902e.vip;
        List list = c6902e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C6902e.yandex;
        boolean subscription = metrica.subscription();
        C13664e c13664e = C13664e.f27089e;
        if (subscription || !AbstractC7890e.billing(list, c13664e)) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), list);
        }
        if (metrica.subscription() || str2 != null) {
            metrica.Signature(interfaceC9998e, 1, C9582e.ad, str2);
        }
        if (metrica.subscription() || str != null) {
            metrica.Signature(interfaceC9998e, 2, C9582e.ad, str);
        }
        int i = c6902e.license;
        List list2 = c6902e.billing;
        boolean z = c6902e.appmetrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.inmobi(3, i, interfaceC9998e);
        if (metrica.subscription() || z) {
            abstractC15920e.signatures(interfaceC9998e, 4, z);
        }
        abstractC15920e.ads(interfaceC9998e, 5, c6902e.purchase);
        if (metrica.subscription() || !AbstractC7890e.billing(list2, c13664e)) {
            abstractC15920e.applovin(interfaceC9998e, 6, (InterfaceC5372e) interfaceC3477eArr[6].getValue(), list2);
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
        InterfaceC3477e[] interfaceC3477eArr = C6902e.yandex;
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{interfaceC3477eArr[0].getValue(), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), C13257e.ad, C6266e.ad, c9582e, interfaceC3477eArr[6].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C6902e.yandex;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list2 = null;
        boolean z2 = true;
        while (z2) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    list = (List) metrica.subscription(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    str = (String) metrica.inmobi(interfaceC9998e, 1, C9582e.ad, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) metrica.inmobi(interfaceC9998e, 2, C9582e.ad, str2);
                    i |= 4;
                    break;
                case 3:
                    i2 = metrica.remoteconfig(interfaceC9998e, 3);
                    i |= 8;
                    break;
                case 4:
                    z = metrica.applovin(interfaceC9998e, 4);
                    i |= 16;
                    break;
                case 5:
                    str3 = metrica.smaato(interfaceC9998e, 5);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) metrica.subscription(interfaceC9998e, 6, (InterfaceC5372e) interfaceC3477eArr[6].getValue(), list2);
                    i |= 64;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C6902e(i, list, str, str2, i2, z, str3, list2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
