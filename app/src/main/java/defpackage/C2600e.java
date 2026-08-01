package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2600e implements InterfaceC12067e {
    public static final C2600e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٕؔٝ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.RequestTokenResponse.TwoFactorRequired", obj, 6);
        c4707e.advert("validation_type", false);
        c4707e.advert("phone_mask", true);
        c4707e.advert("masked_email", true);
        c4707e.advert("code_length", true);
        c4707e.advert("device_name", true);
        c4707e.advert("validation_sid", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C11209e c11209e = (C11209e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC5372e interfaceC5372e = (InterfaceC5372e) C11209e.billing[0].getValue();
        EnumC16168e enumC16168e = c11209e.ad;
        String str = c11209e.purchase;
        String str2 = c11209e.appmetrica;
        int i = c11209e.license;
        String str3 = c11209e.metrica;
        String str4 = c11209e.vip;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(interfaceC9998e, 0, interfaceC5372e, enumC16168e);
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(str4, BuildConfig.FLAVOR)) {
            abstractC15920e.ads(interfaceC9998e, 1, str4);
        }
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            abstractC15920e.ads(interfaceC9998e, 2, str3);
        }
        if (abstractC15920e.subscription() || i != 4) {
            abstractC15920e.inmobi(3, i, interfaceC9998e);
        }
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            abstractC15920e.ads(interfaceC9998e, 4, str2);
        }
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            abstractC15920e.ads(interfaceC9998e, 5, str);
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
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{C11209e.billing[0].getValue(), c9582e, c9582e, C13257e.ad, c9582e, c9582e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C11209e.billing;
        int i = 0;
        int i2 = 0;
        EnumC16168e enumC16168e = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    enumC16168e = (EnumC16168e) metrica.subscription(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), enumC16168e);
                    i |= 1;
                    break;
                case 1:
                    str = metrica.smaato(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = metrica.smaato(interfaceC9998e, 2);
                    i |= 4;
                    break;
                case 3:
                    i2 = metrica.remoteconfig(interfaceC9998e, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = metrica.smaato(interfaceC9998e, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = metrica.smaato(interfaceC9998e, 5);
                    i |= 32;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C11209e(i, enumC16168e, str, str2, i2, str3, str4);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
