package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17830e implements InterfaceC12067e {
    public static final C17830e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [e٘ٙ٘, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.ecosystem.EcosystemVerificationMethodDto", obj, 5);
        c4707e.advert("name", true);
        c4707e.advert("priority", true);
        c4707e.advert("timeout", true);
        c4707e.advert("info", true);
        c4707e.advert("can_fallback", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C6064e c6064e = (C6064e) obj;
        Boolean bool = c6064e.appmetrica;
        String str = c6064e.license;
        Integer num = c6064e.metrica;
        Integer num2 = c6064e.vip;
        EnumC10783e enumC10783e = c6064e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C6064e.purchase;
        if (metrica.subscription() || enumC10783e != null) {
            metrica.Signature(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), enumC10783e);
        }
        if (metrica.subscription() || num2 != null) {
            metrica.Signature(interfaceC9998e, 1, C13257e.ad, num2);
        }
        if (metrica.subscription() || num != null) {
            metrica.Signature(interfaceC9998e, 2, C13257e.ad, num);
        }
        if (metrica.subscription() || str != null) {
            metrica.Signature(interfaceC9998e, 3, C9582e.ad, str);
        }
        if (metrica.subscription() || bool != null) {
            metrica.Signature(interfaceC9998e, 4, C6266e.ad, bool);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC5372e purchase = AbstractC6069e.purchase((InterfaceC5372e) C6064e.purchase[0].getValue());
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{purchase, AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(C9582e.ad), AbstractC6069e.purchase(C6266e.ad)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C6064e.purchase;
        int i = 0;
        EnumC10783e enumC10783e = null;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        Boolean bool = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                enumC10783e = (EnumC10783e) metrica.inmobi(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), enumC10783e);
                i |= 1;
            } else if (yandex == 1) {
                num = (Integer) metrica.inmobi(interfaceC9998e, 1, C13257e.ad, num);
                i |= 2;
            } else if (yandex == 2) {
                num2 = (Integer) metrica.inmobi(interfaceC9998e, 2, C13257e.ad, num2);
                i |= 4;
            } else if (yandex == 3) {
                str = (String) metrica.inmobi(interfaceC9998e, 3, C9582e.ad, str);
                i |= 8;
            } else {
                if (yandex != 4) {
                    throw new C0413e(yandex);
                }
                bool = (Boolean) metrica.inmobi(interfaceC9998e, 4, C6266e.ad, bool);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C6064e(i, enumC10783e, num, num2, str, bool);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
