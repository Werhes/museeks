package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۨؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18165e implements InterfaceC12067e {
    public static final C18165e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [e٘ۨؓ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.ValidatePhoneResponse", obj, 10);
        c4707e.advert("next_sid", true);
        c4707e.advert("validation_type", true);
        c4707e.advert("validation_resend", true);
        c4707e.advert("delay", true);
        c4707e.advert("external_id", true);
        c4707e.advert("phone", true);
        c4707e.advert("phone_mask", true);
        c4707e.advert("masked_email", true);
        c4707e.advert("code_length", true);
        c4707e.advert("device_name", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C14007e c14007e = (C14007e) obj;
        String str = c14007e.adcel;
        int i = c14007e.startapp;
        String str2 = c14007e.yandex;
        String str3 = c14007e.billing;
        String str4 = c14007e.purchase;
        String str5 = c14007e.appmetrica;
        int i2 = c14007e.license;
        EnumC8519e enumC8519e = c14007e.metrica;
        EnumC8519e enumC8519e2 = c14007e.vip;
        String str6 = c14007e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C14007e.mopub;
        if (metrica.subscription() || str6 != null) {
            metrica.Signature(interfaceC9998e, 0, C9582e.ad, str6);
        }
        if (metrica.subscription() || enumC8519e2 != null) {
            metrica.Signature(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), enumC8519e2);
        }
        if (metrica.subscription() || enumC8519e != null) {
            metrica.Signature(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), enumC8519e);
        }
        if (metrica.subscription() || i2 != 120) {
            ((AbstractC15920e) metrica).inmobi(3, i2, interfaceC9998e);
        }
        if (metrica.subscription() || str5 != null) {
            metrica.Signature(interfaceC9998e, 4, C9582e.ad, str5);
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
        if (metrica.subscription() || i != 0) {
            ((AbstractC15920e) metrica).inmobi(8, i, interfaceC9998e);
        }
        if (metrica.subscription() || str != null) {
            metrica.Signature(interfaceC9998e, 9, C9582e.ad, str);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C14007e.mopub;
        C9582e c9582e = C9582e.ad;
        InterfaceC5372e purchase = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase2 = AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[1].getValue());
        InterfaceC5372e purchase3 = AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[2].getValue());
        InterfaceC5372e purchase4 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase5 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase6 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase7 = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase8 = AbstractC6069e.purchase(c9582e);
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{purchase, purchase2, purchase3, c13257e, purchase4, purchase5, purchase6, purchase7, c13257e, purchase8};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C14007e.mopub;
        String str = null;
        String str2 = null;
        EnumC8519e enumC8519e = null;
        EnumC8519e enumC8519e2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    str2 = (String) metrica.inmobi(interfaceC9998e, 0, C9582e.ad, str2);
                    i |= 1;
                    break;
                case 1:
                    enumC8519e = (EnumC8519e) metrica.inmobi(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), enumC8519e);
                    i |= 2;
                    break;
                case 2:
                    enumC8519e2 = (EnumC8519e) metrica.inmobi(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), enumC8519e2);
                    i |= 4;
                    break;
                case 3:
                    i2 = metrica.remoteconfig(interfaceC9998e, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) metrica.inmobi(interfaceC9998e, 4, C9582e.ad, str3);
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
                    str6 = (String) metrica.inmobi(interfaceC9998e, 7, C9582e.ad, str6);
                    i |= 128;
                    break;
                case 8:
                    i3 = metrica.remoteconfig(interfaceC9998e, 8);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 9:
                    str = (String) metrica.inmobi(interfaceC9998e, 9, C9582e.ad, str);
                    i |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C14007e(i, str2, enumC8519e, enumC8519e2, i2, str3, str4, str5, str6, i3, str);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
