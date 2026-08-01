package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۡٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9046e implements InterfaceC12067e {
    public static final C9046e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, eٌۡٙ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAnnualResultBlockDto.Value", obj, 7);
        c4707e.advert("title", true);
        c4707e.advert("subtitle", true);
        c4707e.advert("caption", true);
        c4707e.advert("name", true);
        c4707e.advert("value", true);
        c4707e.advert("photo_url", true);
        c4707e.advert("photo_urls", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C2035e c2035e = (C2035e) obj;
        List list = c2035e.billing;
        String str = c2035e.purchase;
        String str2 = c2035e.appmetrica;
        String str3 = c2035e.license;
        String str4 = c2035e.metrica;
        String str5 = c2035e.vip;
        String str6 = c2035e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C2035e.yandex;
        if (metrica.subscription() || !AbstractC7890e.billing(str6, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 0, str6);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str5, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 1, str5);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str4, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 2, str4);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 3, str3);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 4, str2);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 5, str);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(list, C13664e.f27089e)) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 6, (InterfaceC5372e) interfaceC3477eArr[6].getValue(), list);
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
        InterfaceC3477e[] interfaceC3477eArr = C2035e.yandex;
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{c9582e, c9582e, c9582e, c9582e, c9582e, c9582e, interfaceC3477eArr[6].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C2035e.yandex;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list = null;
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
                    str2 = metrica.smaato(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = metrica.smaato(interfaceC9998e, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = metrica.smaato(interfaceC9998e, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = metrica.smaato(interfaceC9998e, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = metrica.smaato(interfaceC9998e, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) metrica.subscription(interfaceC9998e, 6, (InterfaceC5372e) interfaceC3477eArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C2035e(i, str, str2, str3, str4, str5, str6, list);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
