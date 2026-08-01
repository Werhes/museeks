package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16370e implements InterfaceC12067e {
    public static final C16370e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eّٖٝ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.unofficial.year_stats.Y25CBlock", obj, 13);
        c4707e.advert("type", false);
        c4707e.advert("name", false);
        c4707e.advert("titles", true);
        c4707e.advert("subtitles", true);
        c4707e.advert("photo_urls", true);
        c4707e.advert("background", true);
        c4707e.advert("is_visible", false);
        c4707e.advert("order", false);
        c4707e.advert("is_sharing_enabled", true);
        c4707e.advert("audio_preview_url", true);
        c4707e.advert("metrics", true);
        c4707e.advert("color_type", true);
        c4707e.advert("playlist", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C2314e c2314e = (C2314e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C2314e.amazon;
        InterfaceC5372e interfaceC5372e = (InterfaceC5372e) interfaceC3477eArr[0].getValue();
        EnumC14399e enumC14399e = c2314e.ad;
        C16321e c16321e = c2314e.smaato;
        EnumC0767e enumC0767e = c2314e.advert;
        List list = c2314e.mopub;
        String str = c2314e.adcel;
        boolean z = c2314e.startapp;
        C1769e c1769e = c2314e.purchase;
        List list2 = c2314e.appmetrica;
        List list3 = c2314e.license;
        List list4 = c2314e.metrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(interfaceC9998e, 0, interfaceC5372e, enumC14399e);
        abstractC15920e.ads(interfaceC9998e, 1, c2314e.vip);
        boolean subscription = abstractC15920e.subscription();
        C13664e c13664e = C13664e.f27089e;
        if (subscription || !AbstractC7890e.billing(list4, c13664e)) {
            abstractC15920e.applovin(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), list4);
        }
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(list3, c13664e)) {
            abstractC15920e.applovin(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), list3);
        }
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(list2, c13664e)) {
            abstractC15920e.applovin(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), list2);
        }
        if (abstractC15920e.subscription() || c1769e != null) {
            abstractC15920e.Signature(interfaceC9998e, 5, C5773e.ad, c1769e);
        }
        abstractC15920e.signatures(interfaceC9998e, 6, c2314e.billing);
        abstractC15920e.inmobi(7, c2314e.yandex, interfaceC9998e);
        if (abstractC15920e.subscription() || z) {
            abstractC15920e.signatures(interfaceC9998e, 8, z);
        }
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            abstractC15920e.ads(interfaceC9998e, 9, str);
        }
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(list, c13664e)) {
            abstractC15920e.applovin(interfaceC9998e, 10, (InterfaceC5372e) interfaceC3477eArr[10].getValue(), list);
        }
        if (abstractC15920e.subscription() || enumC0767e != EnumC0767e.f3121e) {
            abstractC15920e.applovin(interfaceC9998e, 11, (InterfaceC5372e) interfaceC3477eArr[11].getValue(), enumC0767e);
        }
        if (abstractC15920e.subscription() || c16321e != null) {
            abstractC15920e.Signature(interfaceC9998e, 12, C8858e.ad, c16321e);
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
        InterfaceC3477e[] interfaceC3477eArr = C2314e.amazon;
        C9582e c9582e = C9582e.ad;
        C6266e c6266e = C6266e.ad;
        return new InterfaceC5372e[]{interfaceC3477eArr[0].getValue(), c9582e, interfaceC3477eArr[2].getValue(), interfaceC3477eArr[3].getValue(), interfaceC3477eArr[4].getValue(), AbstractC6069e.purchase(C5773e.ad), c6266e, C13257e.ad, c6266e, c9582e, interfaceC3477eArr[10].getValue(), interfaceC3477eArr[11].getValue(), AbstractC6069e.purchase(C8858e.ad)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C2314e.amazon;
        List list = null;
        EnumC0767e enumC0767e = null;
        C16321e c16321e = null;
        EnumC14399e enumC14399e = null;
        String str = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        C1769e c1769e = null;
        String str2 = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    enumC14399e = (EnumC14399e) metrica.subscription(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), enumC14399e);
                    i |= 1;
                    break;
                case 1:
                    str = metrica.smaato(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) metrica.subscription(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    list3 = (List) metrica.subscription(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), list3);
                    i |= 8;
                    break;
                case 4:
                    list4 = (List) metrica.subscription(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), list4);
                    i |= 16;
                    break;
                case 5:
                    c1769e = (C1769e) metrica.inmobi(interfaceC9998e, 5, C5773e.ad, c1769e);
                    i |= 32;
                    break;
                case 6:
                    z2 = metrica.applovin(interfaceC9998e, 6);
                    i |= 64;
                    break;
                case 7:
                    i2 = metrica.remoteconfig(interfaceC9998e, 7);
                    i |= 128;
                    break;
                case 8:
                    z3 = metrica.applovin(interfaceC9998e, 8);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 9:
                    str2 = metrica.smaato(interfaceC9998e, 9);
                    i |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    break;
                case 10:
                    list = (List) metrica.subscription(interfaceC9998e, 10, (InterfaceC5372e) interfaceC3477eArr[10].getValue(), list);
                    i |= 1024;
                    break;
                case 11:
                    enumC0767e = (EnumC0767e) metrica.subscription(interfaceC9998e, 11, (InterfaceC5372e) interfaceC3477eArr[11].getValue(), enumC0767e);
                    i |= 2048;
                    break;
                case 12:
                    c16321e = (C16321e) metrica.inmobi(interfaceC9998e, 12, C8858e.ad, c16321e);
                    i |= 4096;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C2314e(i, enumC14399e, str, list2, list3, list4, c1769e, z2, i2, z3, str2, list, enumC0767e, c16321e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
