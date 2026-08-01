package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13144e implements InterfaceC12067e {
    public static final C13144e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌْٟ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPhotoDto", obj, 11);
        c4707e.advert("width", false);
        c4707e.advert("height", false);
        c4707e.advert("id", true);
        c4707e.advert("photo_34", true);
        c4707e.advert("photo_68", true);
        c4707e.advert("photo_135", true);
        c4707e.advert("photo_270", true);
        c4707e.advert("photo_300", true);
        c4707e.advert("photo_600", true);
        c4707e.advert("photo_1200", true);
        c4707e.advert("sizes", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C18236e c18236e = (C18236e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C18236e.advert;
        int i = c18236e.ad;
        List list = c18236e.mopub;
        String str = c18236e.adcel;
        String str2 = c18236e.startapp;
        String str3 = c18236e.yandex;
        String str4 = c18236e.billing;
        String str5 = c18236e.purchase;
        String str6 = c18236e.appmetrica;
        String str7 = c18236e.license;
        String str8 = c18236e.metrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.inmobi(0, i, interfaceC9998e);
        abstractC15920e.inmobi(1, c18236e.vip, interfaceC9998e);
        if (abstractC15920e.subscription() || str8 != null) {
            abstractC15920e.Signature(interfaceC9998e, 2, C9582e.ad, str8);
        }
        if (abstractC15920e.subscription() || str7 != null) {
            abstractC15920e.Signature(interfaceC9998e, 3, C9582e.ad, str7);
        }
        if (abstractC15920e.subscription() || str6 != null) {
            abstractC15920e.Signature(interfaceC9998e, 4, C9582e.ad, str6);
        }
        if (abstractC15920e.subscription() || str5 != null) {
            abstractC15920e.Signature(interfaceC9998e, 5, C9582e.ad, str5);
        }
        if (abstractC15920e.subscription() || str4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 6, C9582e.ad, str4);
        }
        if (abstractC15920e.subscription() || str3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 7, C9582e.ad, str3);
        }
        if (abstractC15920e.subscription() || str2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 8, C9582e.ad, str2);
        }
        if (abstractC15920e.subscription() || str != null) {
            abstractC15920e.Signature(interfaceC9998e, 9, C9582e.ad, str);
        }
        if (abstractC15920e.subscription() || list != null) {
            abstractC15920e.Signature(interfaceC9998e, 10, (InterfaceC5372e) interfaceC3477eArr[10].getValue(), list);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C18236e.advert;
        C9582e c9582e = C9582e.ad;
        InterfaceC5372e purchase = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase2 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase3 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase4 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase5 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase6 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase7 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase8 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase9 = AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[10].getValue());
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{c13257e, c13257e, purchase, purchase2, purchase3, purchase4, purchase5, purchase6, purchase7, purchase8, purchase9};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C18236e.advert;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
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
                    i3 = metrica.remoteconfig(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) metrica.inmobi(interfaceC9998e, 2, C9582e.ad, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) metrica.inmobi(interfaceC9998e, 3, C9582e.ad, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) metrica.inmobi(interfaceC9998e, 4, C9582e.ad, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) metrica.inmobi(interfaceC9998e, 5, C9582e.ad, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) metrica.inmobi(interfaceC9998e, 6, C9582e.ad, str7);
                    i |= 64;
                    break;
                case 7:
                    str8 = (String) metrica.inmobi(interfaceC9998e, 7, C9582e.ad, str8);
                    i |= 128;
                    break;
                case 8:
                    str = (String) metrica.inmobi(interfaceC9998e, 8, C9582e.ad, str);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 9:
                    str2 = (String) metrica.inmobi(interfaceC9998e, 9, C9582e.ad, str2);
                    i |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    break;
                case 10:
                    list = (List) metrica.inmobi(interfaceC9998e, 10, (InterfaceC5372e) interfaceC3477eArr[10].getValue(), list);
                    i |= 1024;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C18236e(i, i2, i3, str3, str4, str5, str6, str7, str8, str, str2, list);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
