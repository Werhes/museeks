package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٞۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5792e implements InterfaceC12067e {
    public static final C5792e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eؘٞۙ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthValidateAccountResponseDto", obj, 10);
        c4707e.advert("is_phone", true);
        c4707e.advert("is_email", true);
        c4707e.advert("flow_name", true);
        c4707e.advert("flow_names", true);
        c4707e.advert("ads", true);
        c4707e.advert("sid", true);
        c4707e.advert("pass_sid", true);
        c4707e.advert("login", true);
        c4707e.advert("next_step", true);
        c4707e.advert("remember_hash", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C7791e c7791e = (C7791e) obj;
        String str = c7791e.adcel;
        C0942e c0942e = c7791e.startapp;
        String str2 = c7791e.yandex;
        Boolean bool = c7791e.billing;
        String str3 = c7791e.purchase;
        Boolean bool2 = c7791e.appmetrica;
        List list = c7791e.license;
        EnumC8985e enumC8985e = c7791e.metrica;
        Boolean bool3 = c7791e.vip;
        Boolean bool4 = c7791e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C7791e.mopub;
        if (metrica.subscription() || bool4 != null) {
            metrica.Signature(interfaceC9998e, 0, C6266e.ad, bool4);
        }
        if (metrica.subscription() || bool3 != null) {
            metrica.Signature(interfaceC9998e, 1, C6266e.ad, bool3);
        }
        if (metrica.subscription() || enumC8985e != null) {
            metrica.Signature(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), enumC8985e);
        }
        if (metrica.subscription() || list != null) {
            metrica.Signature(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), list);
        }
        if (metrica.subscription() || bool2 != null) {
            metrica.Signature(interfaceC9998e, 4, C6266e.ad, bool2);
        }
        if (metrica.subscription() || str3 != null) {
            metrica.Signature(interfaceC9998e, 5, C9582e.ad, str3);
        }
        if (metrica.subscription() || bool != null) {
            metrica.Signature(interfaceC9998e, 6, C6266e.ad, bool);
        }
        if (metrica.subscription() || str2 != null) {
            metrica.Signature(interfaceC9998e, 7, C9582e.ad, str2);
        }
        if (metrica.subscription() || c0942e != null) {
            metrica.Signature(interfaceC9998e, 8, C13315e.ad, c0942e);
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
        InterfaceC3477e[] interfaceC3477eArr = C7791e.mopub;
        C6266e c6266e = C6266e.ad;
        InterfaceC5372e purchase = AbstractC6069e.purchase(c6266e);
        InterfaceC5372e purchase2 = AbstractC6069e.purchase(c6266e);
        InterfaceC5372e purchase3 = AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[2].getValue());
        InterfaceC5372e purchase4 = AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[3].getValue());
        InterfaceC5372e purchase5 = AbstractC6069e.purchase(c6266e);
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{purchase, purchase2, purchase3, purchase4, purchase5, AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(C13315e.ad), AbstractC6069e.purchase(c9582e)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC3477e[] interfaceC3477eArr;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr2 = C7791e.mopub;
        C0942e c0942e = null;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        EnumC8985e enumC8985e = null;
        List list = null;
        Boolean bool3 = null;
        String str2 = null;
        Boolean bool4 = null;
        String str3 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                case 0:
                    interfaceC3477eArr = interfaceC3477eArr2;
                    bool = (Boolean) metrica.inmobi(interfaceC9998e, 0, C6266e.ad, bool);
                    i |= 1;
                    interfaceC3477eArr2 = interfaceC3477eArr;
                case 1:
                    interfaceC3477eArr = interfaceC3477eArr2;
                    bool2 = (Boolean) metrica.inmobi(interfaceC9998e, 1, C6266e.ad, bool2);
                    i |= 2;
                    interfaceC3477eArr2 = interfaceC3477eArr;
                case 2:
                    interfaceC3477eArr = interfaceC3477eArr2;
                    enumC8985e = (EnumC8985e) metrica.inmobi(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), enumC8985e);
                    i |= 4;
                    interfaceC3477eArr2 = interfaceC3477eArr;
                case 3:
                    interfaceC3477eArr = interfaceC3477eArr2;
                    list = (List) metrica.inmobi(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), list);
                    i |= 8;
                    interfaceC3477eArr2 = interfaceC3477eArr;
                case 4:
                    interfaceC3477eArr = interfaceC3477eArr2;
                    bool3 = (Boolean) metrica.inmobi(interfaceC9998e, 4, C6266e.ad, bool3);
                    i |= 16;
                    interfaceC3477eArr2 = interfaceC3477eArr;
                case 5:
                    interfaceC3477eArr = interfaceC3477eArr2;
                    str2 = (String) metrica.inmobi(interfaceC9998e, 5, C9582e.ad, str2);
                    i |= 32;
                    interfaceC3477eArr2 = interfaceC3477eArr;
                case 6:
                    interfaceC3477eArr = interfaceC3477eArr2;
                    bool4 = (Boolean) metrica.inmobi(interfaceC9998e, 6, C6266e.ad, bool4);
                    i |= 64;
                    interfaceC3477eArr2 = interfaceC3477eArr;
                case 7:
                    interfaceC3477eArr = interfaceC3477eArr2;
                    str3 = (String) metrica.inmobi(interfaceC9998e, 7, C9582e.ad, str3);
                    i |= 128;
                    interfaceC3477eArr2 = interfaceC3477eArr;
                case 8:
                    interfaceC3477eArr = interfaceC3477eArr2;
                    c0942e = (C0942e) metrica.inmobi(interfaceC9998e, 8, C13315e.ad, c0942e);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    interfaceC3477eArr2 = interfaceC3477eArr;
                case 9:
                    interfaceC3477eArr = interfaceC3477eArr2;
                    str = (String) metrica.inmobi(interfaceC9998e, 9, C9582e.ad, str);
                    i |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    interfaceC3477eArr2 = interfaceC3477eArr;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C7791e(i, bool, bool2, enumC8985e, list, bool3, str2, bool4, str3, c0942e, str);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
