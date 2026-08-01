package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3961e implements InterfaceC12067e {
    public static final C3961e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eُؚؖ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.podcast.PodcastInfoDto", obj, 14);
        c4707e.advert("cover", true);
        c4707e.advert("description", true);
        c4707e.advert("is_favorite", true);
        c4707e.advert("plays", true);
        c4707e.advert("position", true);
        c4707e.advert("rss_guid", true);
        c4707e.advert("restriction_description", true);
        c4707e.advert("restriction_text", true);
        c4707e.advert("restriction_button", true);
        c4707e.advert("friends_liked", true);
        c4707e.advert("is_random", true);
        c4707e.advert("post", true);
        c4707e.advert("is_donut", true);
        c4707e.advert("podcast_id", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        Integer num;
        Boolean bool;
        C9432e c9432e = (C9432e) obj;
        Integer num2 = c9432e.amazon;
        Boolean bool2 = c9432e.smaato;
        String str = c9432e.advert;
        Boolean bool3 = c9432e.mopub;
        List list = c9432e.adcel;
        C11617e c11617e = c9432e.startapp;
        String str2 = c9432e.yandex;
        String str3 = c9432e.billing;
        String str4 = c9432e.purchase;
        Integer num3 = c9432e.appmetrica;
        Integer num4 = c9432e.license;
        Boolean bool4 = c9432e.metrica;
        String str5 = c9432e.vip;
        C14086e c14086e = c9432e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C9432e.loadAd;
        if (!metrica.subscription() && c14086e == null) {
            num = num2;
            bool = bool2;
        } else {
            num = num2;
            bool = bool2;
            metrica.Signature(interfaceC9998e, 0, C8655e.ad, c14086e);
        }
        if (metrica.subscription() || str5 != null) {
            metrica.Signature(interfaceC9998e, 1, C9582e.ad, str5);
        }
        if (metrica.subscription() || bool4 != null) {
            metrica.Signature(interfaceC9998e, 2, C6266e.ad, bool4);
        }
        if (metrica.subscription() || num4 != null) {
            metrica.Signature(interfaceC9998e, 3, C13257e.ad, num4);
        }
        if (metrica.subscription() || num3 != null) {
            metrica.Signature(interfaceC9998e, 4, C13257e.ad, num3);
        }
        if (metrica.subscription() || str4 != null) {
            metrica.Signature(interfaceC9998e, 5, C9582e.ad, str4);
        }
        if (metrica.subscription() || str3 != null) {
            metrica.Signature(interfaceC9998e, 6, C9582e.ad, str3);
        }
        if (metrica.subscription() || str2 != null) {
            metrica.Signature(interfaceC9998e, 7, C9582e.ad, str2);
        }
        if (metrica.subscription() || c11617e != null) {
            metrica.Signature(interfaceC9998e, 8, C0417e.ad, c11617e);
        }
        if (metrica.subscription() || list != null) {
            metrica.Signature(interfaceC9998e, 9, (InterfaceC5372e) interfaceC3477eArr[9].getValue(), list);
        }
        if (metrica.subscription() || bool3 != null) {
            metrica.Signature(interfaceC9998e, 10, C6266e.ad, bool3);
        }
        if (metrica.subscription() || str != null) {
            metrica.Signature(interfaceC9998e, 11, C9582e.ad, str);
        }
        if (metrica.subscription() || bool != null) {
            metrica.Signature(interfaceC9998e, 12, C6266e.ad, bool);
        }
        if (metrica.subscription() || num != null) {
            metrica.Signature(interfaceC9998e, 13, C13257e.ad, num);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C9432e.loadAd;
        InterfaceC5372e purchase = AbstractC6069e.purchase(C8655e.ad);
        C9582e c9582e = C9582e.ad;
        InterfaceC5372e purchase2 = AbstractC6069e.purchase(c9582e);
        C6266e c6266e = C6266e.ad;
        InterfaceC5372e purchase3 = AbstractC6069e.purchase(c6266e);
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{purchase, purchase2, purchase3, AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(C0417e.ad), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[9].getValue()), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c13257e)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0026. Please report as an issue. */
    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        Boolean bool;
        Integer num;
        Boolean bool2;
        String str;
        Boolean bool3;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C9432e.loadAd;
        C11617e c11617e = null;
        Integer num2 = null;
        Boolean bool4 = null;
        String str2 = null;
        List list = null;
        Boolean bool5 = null;
        String str3 = null;
        Boolean bool6 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        C14086e c14086e = null;
        int i = 0;
        boolean z = true;
        while (z) {
            String str7 = str3;
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    num = num2;
                    bool2 = bool6;
                    str = str7;
                    bool3 = bool4;
                    z = false;
                    str3 = str;
                    bool4 = bool3;
                    bool6 = bool2;
                    num2 = num;
                case 0:
                    num = num2;
                    bool2 = bool6;
                    str = str7;
                    bool3 = bool4;
                    c14086e = (C14086e) metrica.inmobi(interfaceC9998e, 0, C8655e.ad, c14086e);
                    i |= 1;
                    str3 = str;
                    bool4 = bool3;
                    bool6 = bool2;
                    num2 = num;
                case 1:
                    num = num2;
                    bool2 = bool6;
                    str3 = (String) metrica.inmobi(interfaceC9998e, 1, C9582e.ad, str7);
                    i |= 2;
                    bool6 = bool2;
                    num2 = num;
                case 2:
                    num = num2;
                    bool6 = (Boolean) metrica.inmobi(interfaceC9998e, 2, C6266e.ad, bool6);
                    i |= 4;
                    str3 = str7;
                    num2 = num;
                case 3:
                    bool = bool6;
                    num3 = (Integer) metrica.inmobi(interfaceC9998e, 3, C13257e.ad, num3);
                    i |= 8;
                    str3 = str7;
                    bool6 = bool;
                case 4:
                    bool = bool6;
                    num4 = (Integer) metrica.inmobi(interfaceC9998e, 4, C13257e.ad, num4);
                    i |= 16;
                    str3 = str7;
                    bool6 = bool;
                case 5:
                    bool = bool6;
                    str4 = (String) metrica.inmobi(interfaceC9998e, 5, C9582e.ad, str4);
                    i |= 32;
                    str3 = str7;
                    bool6 = bool;
                case 6:
                    bool = bool6;
                    str5 = (String) metrica.inmobi(interfaceC9998e, 6, C9582e.ad, str5);
                    i |= 64;
                    str3 = str7;
                    bool6 = bool;
                case 7:
                    bool = bool6;
                    str6 = (String) metrica.inmobi(interfaceC9998e, 7, C9582e.ad, str6);
                    i |= 128;
                    str3 = str7;
                    bool6 = bool;
                case 8:
                    bool = bool6;
                    c11617e = (C11617e) metrica.inmobi(interfaceC9998e, 8, C0417e.ad, c11617e);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    str3 = str7;
                    bool6 = bool;
                case 9:
                    bool = bool6;
                    list = (List) metrica.inmobi(interfaceC9998e, 9, (InterfaceC5372e) interfaceC3477eArr[9].getValue(), list);
                    i |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    str3 = str7;
                    bool6 = bool;
                case 10:
                    bool = bool6;
                    bool5 = (Boolean) metrica.inmobi(interfaceC9998e, 10, C6266e.ad, bool5);
                    i |= 1024;
                    str3 = str7;
                    bool6 = bool;
                case 11:
                    bool = bool6;
                    str2 = (String) metrica.inmobi(interfaceC9998e, 11, C9582e.ad, str2);
                    i |= 2048;
                    str3 = str7;
                    bool6 = bool;
                case 12:
                    bool = bool6;
                    bool4 = (Boolean) metrica.inmobi(interfaceC9998e, 12, C6266e.ad, bool4);
                    i |= 4096;
                    str3 = str7;
                    bool6 = bool;
                case 13:
                    bool = bool6;
                    num2 = (Integer) metrica.inmobi(interfaceC9998e, 13, C13257e.ad, num2);
                    i |= 8192;
                    str3 = str7;
                    bool6 = bool;
                default:
                    throw new C0413e(yandex);
            }
        }
        Integer num5 = num2;
        Boolean bool7 = bool6;
        C14086e c14086e2 = c14086e;
        metrica.vip(interfaceC9998e);
        return new C9432e(i, c14086e2, str3, bool7, num3, num4, str4, str5, str6, c11617e, list, bool5, str2, bool4, num5);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
