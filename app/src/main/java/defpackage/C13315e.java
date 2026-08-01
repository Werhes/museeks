package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13315e implements InterfaceC12067e {
    public static final C13315e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eْ٘ٙ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthValidateAccountNextStepDto", obj, 4);
        c4707e.advert("verification_method", true);
        c4707e.advert("has_another_verification_methods", true);
        c4707e.advert("external_id", true);
        c4707e.advert("service_code", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C0942e c0942e = (C0942e) obj;
        EnumC6059e enumC6059e = c0942e.license;
        String str = c0942e.metrica;
        Boolean bool = c0942e.vip;
        EnumC10783e enumC10783e = c0942e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C0942e.appmetrica;
        if (metrica.subscription() || enumC10783e != null) {
            metrica.Signature(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), enumC10783e);
        }
        if (metrica.subscription() || bool != null) {
            metrica.Signature(interfaceC9998e, 1, C6266e.ad, bool);
        }
        if (metrica.subscription() || str != null) {
            metrica.Signature(interfaceC9998e, 2, C9582e.ad, str);
        }
        if (metrica.subscription() || enumC6059e != null) {
            metrica.Signature(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), enumC6059e);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C0942e.appmetrica;
        return new InterfaceC5372e[]{AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[0].getValue()), AbstractC6069e.purchase(C6266e.ad), AbstractC6069e.purchase(C9582e.ad), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[3].getValue())};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C0942e.appmetrica;
        int i = 0;
        EnumC10783e enumC10783e = null;
        Boolean bool = null;
        String str = null;
        EnumC6059e enumC6059e = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                enumC10783e = (EnumC10783e) metrica.inmobi(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), enumC10783e);
                i |= 1;
            } else if (yandex == 1) {
                bool = (Boolean) metrica.inmobi(interfaceC9998e, 1, C6266e.ad, bool);
                i |= 2;
            } else if (yandex == 2) {
                str = (String) metrica.inmobi(interfaceC9998e, 2, C9582e.ad, str);
                i |= 4;
            } else {
                if (yandex != 3) {
                    throw new C0413e(yandex);
                }
                enumC6059e = (EnumC6059e) metrica.inmobi(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), enumC6059e);
                i |= 8;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C0942e(i, enumC10783e, bool, str, enumC6059e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
