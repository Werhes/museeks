package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11780e implements InterfaceC12067e {
    public static final C11780e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eؘِٗ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("ua.itaysonlab.vkx.theming.catalog.model.EngineTheme", obj, 6);
        c4707e.advert("id", false);
        c4707e.advert("name", false);
        c4707e.advert("author", true);
        c4707e.advert("light", true);
        c4707e.advert("assoc_accent", true);
        c4707e.advert("theme_attrs", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C12560e c12560e = (C12560e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C12560e.billing;
        int i = c12560e.ad;
        int i2 = c12560e.appmetrica;
        boolean z = c12560e.license;
        String str = c12560e.metrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.inmobi(0, i, interfaceC9998e);
        abstractC15920e.ads(interfaceC9998e, 1, c12560e.vip);
        if (abstractC15920e.subscription() || str != null) {
            abstractC15920e.Signature(interfaceC9998e, 2, C9582e.ad, str);
        }
        if (abstractC15920e.subscription() || z) {
            abstractC15920e.signatures(interfaceC9998e, 3, z);
        }
        if (abstractC15920e.subscription() || i2 != 0) {
            abstractC15920e.inmobi(4, i2, interfaceC9998e);
        }
        abstractC15920e.applovin(interfaceC9998e, 5, (InterfaceC5372e) interfaceC3477eArr[5].getValue(), c12560e.purchase);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C12560e.billing;
        C13257e c13257e = C13257e.ad;
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{c13257e, c9582e, AbstractC6069e.purchase(c9582e), C6266e.ad, c13257e, interfaceC3477eArr[5].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C12560e.billing;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        String str = null;
        String str2 = null;
        Map map = null;
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
                    str = metrica.smaato(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) metrica.inmobi(interfaceC9998e, 2, C9582e.ad, str2);
                    i |= 4;
                    break;
                case 3:
                    z = metrica.applovin(interfaceC9998e, 3);
                    i |= 8;
                    break;
                case 4:
                    i3 = metrica.remoteconfig(interfaceC9998e, 4);
                    i |= 16;
                    break;
                case 5:
                    map = (Map) metrica.subscription(interfaceC9998e, 5, (InterfaceC5372e) interfaceC3477eArr[5].getValue(), map);
                    i |= 32;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C12560e(i, i2, str, str2, z, i3, map);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
