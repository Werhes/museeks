package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؒۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10748e implements InterfaceC12067e {
    public static final C10748e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eُؒۤ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.media.MediaPopupDto", obj, 9);
        c4707e.advert("title", false);
        c4707e.advert("id", true);
        c4707e.advert("button", true);
        c4707e.advert("buttons", true);
        c4707e.advert("icons", true);
        c4707e.advert("music_subscription_event", true);
        c4707e.advert("text", true);
        c4707e.advert("image_mode", true);
        c4707e.advert("emoji_icons", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C0448e c0448e = (C0448e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C0448e.adcel;
        String str = c0448e.ad;
        String str2 = c0448e.startapp;
        EnumC5502e enumC5502e = c0448e.yandex;
        String str3 = c0448e.billing;
        String str4 = c0448e.purchase;
        List list = c0448e.appmetrica;
        List list2 = c0448e.license;
        C11617e c11617e = c0448e.metrica;
        String str5 = c0448e.vip;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, str);
        if (abstractC15920e.subscription() || str5 != null) {
            abstractC15920e.Signature(interfaceC9998e, 1, C9582e.ad, str5);
        }
        if (abstractC15920e.subscription() || c11617e != null) {
            abstractC15920e.Signature(interfaceC9998e, 2, C0417e.ad, c11617e);
        }
        if (abstractC15920e.subscription() || list2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), list2);
        }
        if (abstractC15920e.subscription() || list != null) {
            abstractC15920e.Signature(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), list);
        }
        if (abstractC15920e.subscription() || str4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 5, C9582e.ad, str4);
        }
        if (abstractC15920e.subscription() || str3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 6, C9582e.ad, str3);
        }
        if (abstractC15920e.subscription() || enumC5502e != null) {
            abstractC15920e.Signature(interfaceC9998e, 7, (InterfaceC5372e) interfaceC3477eArr[7].getValue(), enumC5502e);
        }
        if (abstractC15920e.subscription() || str2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 8, C9582e.ad, str2);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C0448e.adcel;
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{c9582e, AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(C0417e.ad), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[3].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[4].getValue()), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[7].getValue()), AbstractC6069e.purchase(c9582e)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C0448e.adcel;
        String str = null;
        String str2 = null;
        String str3 = null;
        C11617e c11617e = null;
        List list = null;
        List list2 = null;
        String str4 = null;
        String str5 = null;
        EnumC5502e enumC5502e = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = metrica.smaato(interfaceC9998e, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) metrica.inmobi(interfaceC9998e, 1, C9582e.ad, str3);
                    i |= 2;
                    break;
                case 2:
                    c11617e = (C11617e) metrica.inmobi(interfaceC9998e, 2, C0417e.ad, c11617e);
                    i |= 4;
                    break;
                case 3:
                    list = (List) metrica.inmobi(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) metrica.inmobi(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) metrica.inmobi(interfaceC9998e, 5, C9582e.ad, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) metrica.inmobi(interfaceC9998e, 6, C9582e.ad, str5);
                    i |= 64;
                    break;
                case 7:
                    enumC5502e = (EnumC5502e) metrica.inmobi(interfaceC9998e, 7, (InterfaceC5372e) interfaceC3477eArr[7].getValue(), enumC5502e);
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
        return new C0448e(i, str2, str3, c11617e, list, list2, str4, str5, enumC5502e, str);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
