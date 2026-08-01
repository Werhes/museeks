package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8733e implements InterfaceC12067e {
    public static final C8733e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, eٌٖٞ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.internal.VkErrorDetails", obj, 9);
        c4707e.advert("error_code", false);
        c4707e.advert("error_msg", false);
        c4707e.advert("request_params", true);
        c4707e.advert("captcha_img", true);
        c4707e.advert("captcha_sid", true);
        c4707e.advert("captcha_ratio", true);
        c4707e.advert("captcha_ts", true);
        c4707e.advert("captcha_attempt", true);
        c4707e.advert("redirect_uri", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C2813e c2813e = (C2813e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C2813e.adcel;
        int i = c2813e.ad;
        String str = c2813e.startapp;
        Integer num = c2813e.yandex;
        Double d = c2813e.billing;
        Double d2 = c2813e.purchase;
        String str2 = c2813e.appmetrica;
        String str3 = c2813e.license;
        List list = c2813e.metrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.inmobi(0, i, interfaceC9998e);
        abstractC15920e.ads(interfaceC9998e, 1, c2813e.vip);
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(list, C13664e.f27089e)) {
            abstractC15920e.applovin(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), list);
        }
        if (abstractC15920e.subscription() || str3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 3, C9582e.ad, str3);
        }
        if (abstractC15920e.subscription() || str2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 4, C9582e.ad, str2);
        }
        if (abstractC15920e.subscription() || d2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 5, C5719e.ad, d2);
        }
        if (abstractC15920e.subscription() || d != null) {
            abstractC15920e.Signature(interfaceC9998e, 6, C5719e.ad, d);
        }
        if (abstractC15920e.subscription() || num != null) {
            abstractC15920e.Signature(interfaceC9998e, 7, C13257e.ad, num);
        }
        if (abstractC15920e.subscription() || str != null) {
            abstractC15920e.Signature(interfaceC9998e, 8, C9582e.ad, str);
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
        InterfaceC3477e[] interfaceC3477eArr = C2813e.adcel;
        C13257e c13257e = C13257e.ad;
        C9582e c9582e = C9582e.ad;
        C5719e c5719e = C5719e.ad;
        return new InterfaceC5372e[]{c13257e, c9582e, interfaceC3477eArr[2].getValue(), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c5719e), AbstractC6069e.purchase(c5719e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c9582e)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C2813e.adcel;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        Double d = null;
        Double d2 = null;
        Integer num = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = metrica.remoteconfig(interfaceC9998e, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = metrica.smaato(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) metrica.subscription(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) metrica.inmobi(interfaceC9998e, 3, C9582e.ad, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) metrica.inmobi(interfaceC9998e, 4, C9582e.ad, str4);
                    i |= 16;
                    break;
                case 5:
                    d = (Double) metrica.inmobi(interfaceC9998e, 5, C5719e.ad, d);
                    i |= 32;
                    break;
                case 6:
                    d2 = (Double) metrica.inmobi(interfaceC9998e, 6, C5719e.ad, d2);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) metrica.inmobi(interfaceC9998e, 7, C13257e.ad, num);
                    i |= 128;
                    break;
                case 8:
                    str = (String) metrica.inmobi(interfaceC9998e, 8, C9582e.ad, str);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C2813e(i, i2, str2, list, str3, str4, d, d2, num, str);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
