package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؑؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0417e implements InterfaceC12067e {
    public static final C0417e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٜؑؔ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.base.BaseLinkButtonDto", obj, 12);
        c4707e.advert("action", true);
        c4707e.advert("title", true);
        c4707e.advert("block_id", true);
        c4707e.advert("section_id", true);
        c4707e.advert("artist_id", true);
        c4707e.advert("curator_id", true);
        c4707e.advert("album_id", true);
        c4707e.advert("owner_id", true);
        c4707e.advert("icon", true);
        c4707e.advert("style", true);
        c4707e.advert("audio_id", true);
        c4707e.advert("hashtag", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        InterfaceC3477e[] interfaceC3477eArr;
        C11617e c11617e = (C11617e) obj;
        String str = c11617e.advert;
        Integer num = c11617e.mopub;
        EnumC11398e enumC11398e = c11617e.adcel;
        String str2 = c11617e.startapp;
        C5655e c5655e = c11617e.yandex;
        Integer num2 = c11617e.billing;
        Integer num3 = c11617e.purchase;
        String str3 = c11617e.appmetrica;
        String str4 = c11617e.license;
        String str5 = c11617e.metrica;
        String str6 = c11617e.vip;
        C3010e c3010e = c11617e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr2 = C11617e.smaato;
        if (!metrica.subscription() && c3010e == null) {
            interfaceC3477eArr = interfaceC3477eArr2;
        } else {
            interfaceC3477eArr = interfaceC3477eArr2;
            metrica.Signature(interfaceC9998e, 0, C7129e.ad, c3010e);
        }
        if (metrica.subscription() || str6 != null) {
            metrica.Signature(interfaceC9998e, 1, C9582e.ad, str6);
        }
        if (metrica.subscription() || str5 != null) {
            metrica.Signature(interfaceC9998e, 2, C9582e.ad, str5);
        }
        if (metrica.subscription() || str4 != null) {
            metrica.Signature(interfaceC9998e, 3, C9582e.ad, str4);
        }
        if (metrica.subscription() || str3 != null) {
            metrica.Signature(interfaceC9998e, 4, C9582e.ad, str3);
        }
        if (metrica.subscription() || num3 != null) {
            metrica.Signature(interfaceC9998e, 5, C13257e.ad, num3);
        }
        if (metrica.subscription() || num2 != null) {
            metrica.Signature(interfaceC9998e, 6, C13257e.ad, num2);
        }
        if (metrica.subscription() || c5655e != null) {
            metrica.Signature(interfaceC9998e, 7, C13980e.ad, c5655e);
        }
        if (metrica.subscription() || str2 != null) {
            metrica.Signature(interfaceC9998e, 8, C9582e.ad, str2);
        }
        if (metrica.subscription() || enumC11398e != null) {
            metrica.Signature(interfaceC9998e, 9, (InterfaceC5372e) interfaceC3477eArr[9].getValue(), enumC11398e);
        }
        if (metrica.subscription() || num != null) {
            metrica.Signature(interfaceC9998e, 10, C13257e.ad, num);
        }
        if (metrica.subscription() || str != null) {
            metrica.Signature(interfaceC9998e, 11, C9582e.ad, str);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C11617e.smaato;
        InterfaceC5372e purchase = AbstractC6069e.purchase(C7129e.ad);
        C9582e c9582e = C9582e.ad;
        InterfaceC5372e purchase2 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase3 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase4 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase5 = AbstractC6069e.purchase(c9582e);
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{purchase, purchase2, purchase3, purchase4, purchase5, AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(C13980e.ad), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[9].getValue()), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c9582e)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0021. Please report as an issue. */
    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        C3010e c3010e;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C11617e.smaato;
        String str = null;
        String str2 = null;
        EnumC11398e enumC11398e = null;
        Integer num = null;
        C3010e c3010e2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num2 = null;
        Integer num3 = null;
        C5655e c5655e = null;
        int i = 0;
        boolean z = true;
        while (z) {
            InterfaceC3477e[] interfaceC3477eArr2 = interfaceC3477eArr;
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    interfaceC3477eArr = interfaceC3477eArr2;
                    i = i;
                case 0:
                    c3010e2 = (C3010e) metrica.inmobi(interfaceC9998e, 0, C7129e.ad, c3010e2);
                    i |= 1;
                    interfaceC3477eArr = interfaceC3477eArr2;
                case 1:
                    c3010e = c3010e2;
                    str3 = (String) metrica.inmobi(interfaceC9998e, 1, C9582e.ad, str3);
                    i |= 2;
                    interfaceC3477eArr = interfaceC3477eArr2;
                    c3010e2 = c3010e;
                case 2:
                    c3010e = c3010e2;
                    str4 = (String) metrica.inmobi(interfaceC9998e, 2, C9582e.ad, str4);
                    i |= 4;
                    interfaceC3477eArr = interfaceC3477eArr2;
                    c3010e2 = c3010e;
                case 3:
                    c3010e = c3010e2;
                    str5 = (String) metrica.inmobi(interfaceC9998e, 3, C9582e.ad, str5);
                    i |= 8;
                    interfaceC3477eArr = interfaceC3477eArr2;
                    c3010e2 = c3010e;
                case 4:
                    c3010e = c3010e2;
                    str6 = (String) metrica.inmobi(interfaceC9998e, 4, C9582e.ad, str6);
                    i |= 16;
                    interfaceC3477eArr = interfaceC3477eArr2;
                    c3010e2 = c3010e;
                case 5:
                    c3010e = c3010e2;
                    num2 = (Integer) metrica.inmobi(interfaceC9998e, 5, C13257e.ad, num2);
                    i |= 32;
                    interfaceC3477eArr = interfaceC3477eArr2;
                    c3010e2 = c3010e;
                case 6:
                    c3010e = c3010e2;
                    num3 = (Integer) metrica.inmobi(interfaceC9998e, 6, C13257e.ad, num3);
                    i |= 64;
                    interfaceC3477eArr = interfaceC3477eArr2;
                    c3010e2 = c3010e;
                case 7:
                    c3010e = c3010e2;
                    c5655e = (C5655e) metrica.inmobi(interfaceC9998e, 7, C13980e.ad, c5655e);
                    i |= 128;
                    interfaceC3477eArr = interfaceC3477eArr2;
                    c3010e2 = c3010e;
                case 8:
                    c3010e = c3010e2;
                    str = (String) metrica.inmobi(interfaceC9998e, 8, C9582e.ad, str);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    interfaceC3477eArr = interfaceC3477eArr2;
                    c3010e2 = c3010e;
                case 9:
                    c3010e = c3010e2;
                    enumC11398e = (EnumC11398e) metrica.inmobi(interfaceC9998e, 9, (InterfaceC5372e) interfaceC3477eArr2[9].getValue(), enumC11398e);
                    i |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    interfaceC3477eArr = interfaceC3477eArr2;
                    c3010e2 = c3010e;
                case 10:
                    c3010e = c3010e2;
                    num = (Integer) metrica.inmobi(interfaceC9998e, 10, C13257e.ad, num);
                    i |= 1024;
                    interfaceC3477eArr = interfaceC3477eArr2;
                    c3010e2 = c3010e;
                case 11:
                    c3010e = c3010e2;
                    str2 = (String) metrica.inmobi(interfaceC9998e, 11, C9582e.ad, str2);
                    i |= 2048;
                    interfaceC3477eArr = interfaceC3477eArr2;
                    c3010e2 = c3010e;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C11617e(i, c3010e2, str3, str4, str5, str6, num2, num3, c5655e, str, enumC11398e, num, str2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
