package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15054e implements InterfaceC12067e {
    public static final C15054e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eۣٖٔ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.ecosystem.EcosystemCheckOtpResponseDto", obj, 9);
        c4707e.advert("sid", false);
        c4707e.advert("profile_exist", false);
        c4707e.advert("profile", true);
        c4707e.advert("can_skip_password", true);
        c4707e.advert("next_step", true);
        c4707e.advert("signup_restriction_reason", true);
        c4707e.advert("signup_fields", true);
        c4707e.advert("signup_fields_values", true);
        c4707e.advert("signup_params", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C15175e c15175e = (C15175e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C15175e.adcel;
        String str = c15175e.ad;
        C12735e c12735e = c15175e.startapp;
        C11782e c11782e = c15175e.yandex;
        List list = c15175e.billing;
        String str2 = c15175e.purchase;
        EnumC14970e enumC14970e = c15175e.appmetrica;
        Boolean bool = c15175e.license;
        C5809e c5809e = c15175e.metrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, str);
        abstractC15920e.signatures(interfaceC9998e, 1, c15175e.vip);
        if (abstractC15920e.subscription() || c5809e != null) {
            abstractC15920e.Signature(interfaceC9998e, 2, C5798e.ad, c5809e);
        }
        if (abstractC15920e.subscription() || bool != null) {
            abstractC15920e.Signature(interfaceC9998e, 3, C6266e.ad, bool);
        }
        if (abstractC15920e.subscription() || enumC14970e != null) {
            abstractC15920e.Signature(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), enumC14970e);
        }
        if (abstractC15920e.subscription() || str2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 5, C9582e.ad, str2);
        }
        if (abstractC15920e.subscription() || list != null) {
            abstractC15920e.Signature(interfaceC9998e, 6, (InterfaceC5372e) interfaceC3477eArr[6].getValue(), list);
        }
        if (abstractC15920e.subscription() || c11782e != null) {
            abstractC15920e.Signature(interfaceC9998e, 7, C9091e.ad, c11782e);
        }
        if (abstractC15920e.subscription() || c12735e != null) {
            abstractC15920e.Signature(interfaceC9998e, 8, C3321e.ad, c12735e);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C15175e.adcel;
        C9582e c9582e = C9582e.ad;
        C6266e c6266e = C6266e.ad;
        return new InterfaceC5372e[]{c9582e, c6266e, AbstractC6069e.purchase(C5798e.ad), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[4].getValue()), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[6].getValue()), AbstractC6069e.purchase(C9091e.ad), AbstractC6069e.purchase(C3321e.ad)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C15175e.adcel;
        C12735e c12735e = null;
        String str = null;
        C5809e c5809e = null;
        Boolean bool = null;
        EnumC14970e enumC14970e = null;
        String str2 = null;
        List list = null;
        C11782e c11782e = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
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
                    z2 = metrica.applovin(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    c5809e = (C5809e) metrica.inmobi(interfaceC9998e, 2, C5798e.ad, c5809e);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) metrica.inmobi(interfaceC9998e, 3, C6266e.ad, bool);
                    i |= 8;
                    break;
                case 4:
                    enumC14970e = (EnumC14970e) metrica.inmobi(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), enumC14970e);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) metrica.inmobi(interfaceC9998e, 5, C9582e.ad, str2);
                    i |= 32;
                    break;
                case 6:
                    list = (List) metrica.inmobi(interfaceC9998e, 6, (InterfaceC5372e) interfaceC3477eArr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    c11782e = (C11782e) metrica.inmobi(interfaceC9998e, 7, C9091e.ad, c11782e);
                    i |= 128;
                    break;
                case 8:
                    c12735e = (C12735e) metrica.inmobi(interfaceC9998e, 8, C3321e.ad, c12735e);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C15175e(i, str, z2, c5809e, bool, enumC14970e, str2, list, c11782e, c12735e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
