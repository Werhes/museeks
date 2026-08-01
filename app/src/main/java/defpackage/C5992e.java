package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۢۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5992e implements InterfaceC12067e {
    public static final C5992e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘۢۥ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioArtistDto", obj, 15);
        c4707e.advert("name", false);
        c4707e.advert("domain", true);
        c4707e.advert("id", true);
        c4707e.advert("is_album_cover", true);
        c4707e.advert("photo", true);
        c4707e.advert("photos", true);
        c4707e.advert("is_followed", true);
        c4707e.advert("can_follow", true);
        c4707e.advert("can_play", true);
        c4707e.advert("genres", true);
        c4707e.advert("bio", true);
        c4707e.advert("pages", true);
        c4707e.advert("profiles", true);
        c4707e.advert("groups", true);
        c4707e.advert("track_code", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C0004e c0004e = (C0004e) obj;
        String str = c0004e.loadAd;
        List list = c0004e.amazon;
        List list2 = c0004e.smaato;
        List list3 = c0004e.advert;
        String str2 = c0004e.mopub;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C0004e.Signature;
        String str3 = c0004e.ad;
        List list4 = c0004e.adcel;
        Boolean bool = c0004e.startapp;
        Boolean bool2 = c0004e.yandex;
        Boolean bool3 = c0004e.billing;
        List list5 = c0004e.purchase;
        List list6 = c0004e.appmetrica;
        Boolean bool4 = c0004e.license;
        String str4 = c0004e.metrica;
        String str5 = c0004e.vip;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, str3);
        if (abstractC15920e.subscription() || str5 != null) {
            abstractC15920e.Signature(interfaceC9998e, 1, C9582e.ad, str5);
        }
        if (abstractC15920e.subscription() || str4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 2, C9582e.ad, str4);
        }
        if (abstractC15920e.subscription() || bool4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 3, C6266e.ad, bool4);
        }
        if (abstractC15920e.subscription() || list6 != null) {
            abstractC15920e.Signature(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), list6);
        }
        if (abstractC15920e.subscription() || list5 != null) {
            abstractC15920e.Signature(interfaceC9998e, 5, (InterfaceC5372e) interfaceC3477eArr[5].getValue(), list5);
        }
        if (abstractC15920e.subscription() || bool3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 6, C6266e.ad, bool3);
        }
        if (abstractC15920e.subscription() || bool2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 7, C6266e.ad, bool2);
        }
        if (abstractC15920e.subscription() || bool != null) {
            abstractC15920e.Signature(interfaceC9998e, 8, C6266e.ad, bool);
        }
        if (abstractC15920e.subscription() || list4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 9, (InterfaceC5372e) interfaceC3477eArr[9].getValue(), list4);
        }
        if (abstractC15920e.subscription() || str2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 10, C9582e.ad, str2);
        }
        if (abstractC15920e.subscription() || list3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 11, (InterfaceC5372e) interfaceC3477eArr[11].getValue(), list3);
        }
        if (abstractC15920e.subscription() || list2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 12, (InterfaceC5372e) interfaceC3477eArr[12].getValue(), list2);
        }
        if (abstractC15920e.subscription() || list != null) {
            abstractC15920e.Signature(interfaceC9998e, 13, (InterfaceC5372e) interfaceC3477eArr[13].getValue(), list);
        }
        if (abstractC15920e.subscription() || str != null) {
            abstractC15920e.Signature(interfaceC9998e, 14, C9582e.ad, str);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C0004e.Signature;
        C9582e c9582e = C9582e.ad;
        InterfaceC5372e purchase = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase2 = AbstractC6069e.purchase(c9582e);
        C6266e c6266e = C6266e.ad;
        return new InterfaceC5372e[]{c9582e, purchase, purchase2, AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[4].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[5].getValue()), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[9].getValue()), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[11].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[12].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[13].getValue()), AbstractC6069e.purchase(c9582e)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0028. Please report as an issue. */
    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        Boolean bool;
        List list;
        Boolean bool2;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C0004e.Signature;
        Boolean bool3 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool4 = null;
        List list6 = null;
        List list7 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            String str6 = str3;
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    bool = bool4;
                    z = false;
                    str3 = str6;
                    bool4 = bool;
                case 0:
                    list = list2;
                    bool2 = bool4;
                    str4 = metrica.smaato(interfaceC9998e, 0);
                    i |= 1;
                    str3 = str6;
                    bool4 = bool2;
                    list2 = list;
                case 1:
                    list = list2;
                    bool2 = bool4;
                    str5 = (String) metrica.inmobi(interfaceC9998e, 1, C9582e.ad, str5);
                    i |= 2;
                    str3 = str6;
                    bool4 = bool2;
                    list2 = list;
                case 2:
                    list = list2;
                    bool2 = bool4;
                    str3 = (String) metrica.inmobi(interfaceC9998e, 2, C9582e.ad, str6);
                    i |= 4;
                    bool4 = bool2;
                    list2 = list;
                case 3:
                    list = list2;
                    bool4 = (Boolean) metrica.inmobi(interfaceC9998e, 3, C6266e.ad, bool4);
                    i |= 8;
                    str3 = str6;
                    list2 = list;
                case 4:
                    bool = bool4;
                    list6 = (List) metrica.inmobi(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), list6);
                    i |= 16;
                    str3 = str6;
                    bool4 = bool;
                case 5:
                    bool = bool4;
                    list7 = (List) metrica.inmobi(interfaceC9998e, 5, (InterfaceC5372e) interfaceC3477eArr[5].getValue(), list7);
                    i |= 32;
                    str3 = str6;
                    bool4 = bool;
                case 6:
                    bool = bool4;
                    bool5 = (Boolean) metrica.inmobi(interfaceC9998e, 6, C6266e.ad, bool5);
                    i |= 64;
                    str3 = str6;
                    bool4 = bool;
                case 7:
                    bool = bool4;
                    bool6 = (Boolean) metrica.inmobi(interfaceC9998e, 7, C6266e.ad, bool6);
                    i |= 128;
                    str3 = str6;
                    bool4 = bool;
                case 8:
                    bool = bool4;
                    bool3 = (Boolean) metrica.inmobi(interfaceC9998e, 8, C6266e.ad, bool3);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    str3 = str6;
                    bool4 = bool;
                case 9:
                    bool = bool4;
                    list5 = (List) metrica.inmobi(interfaceC9998e, 9, (InterfaceC5372e) interfaceC3477eArr[9].getValue(), list5);
                    i |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    str3 = str6;
                    bool4 = bool;
                case 10:
                    bool = bool4;
                    str = (String) metrica.inmobi(interfaceC9998e, 10, C9582e.ad, str);
                    i |= 1024;
                    str3 = str6;
                    bool4 = bool;
                case 11:
                    bool = bool4;
                    list4 = (List) metrica.inmobi(interfaceC9998e, 11, (InterfaceC5372e) interfaceC3477eArr[11].getValue(), list4);
                    i |= 2048;
                    str3 = str6;
                    bool4 = bool;
                case 12:
                    bool = bool4;
                    list3 = (List) metrica.inmobi(interfaceC9998e, 12, (InterfaceC5372e) interfaceC3477eArr[12].getValue(), list3);
                    i |= 4096;
                    str3 = str6;
                    bool4 = bool;
                case 13:
                    bool = bool4;
                    list2 = (List) metrica.inmobi(interfaceC9998e, 13, (InterfaceC5372e) interfaceC3477eArr[13].getValue(), list2);
                    i |= 8192;
                    str3 = str6;
                    bool4 = bool;
                case 14:
                    bool = bool4;
                    str2 = (String) metrica.inmobi(interfaceC9998e, 14, C9582e.ad, str2);
                    i |= 16384;
                    str3 = str6;
                    bool4 = bool;
                default:
                    throw new C0413e(yandex);
            }
        }
        String str7 = str3;
        Boolean bool7 = bool4;
        String str8 = str5;
        metrica.vip(interfaceC9998e);
        return new C0004e(i, str4, str8, str7, bool7, list6, list7, bool5, bool6, bool3, list5, str, list4, list3, list2, str2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
