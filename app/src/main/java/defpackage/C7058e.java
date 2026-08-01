package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7058e implements InterfaceC12067e {
    public static final C7058e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؚٝ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.base.BaseImageDto", obj, 5);
        c4707e.advert("url", false);
        c4707e.advert("width", false);
        c4707e.advert("height", false);
        c4707e.advert("id", true);
        c4707e.advert("theme", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C14762e c14762e = (C14762e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C14762e.purchase;
        String str = c14762e.ad;
        EnumC11077e enumC11077e = c14762e.appmetrica;
        String str2 = c14762e.license;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, str);
        abstractC15920e.inmobi(1, c14762e.vip, interfaceC9998e);
        abstractC15920e.inmobi(2, c14762e.metrica, interfaceC9998e);
        if (abstractC15920e.subscription() || str2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 3, C9582e.ad, str2);
        }
        if (abstractC15920e.subscription() || enumC11077e != null) {
            abstractC15920e.Signature(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), enumC11077e);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C14762e.purchase;
        C9582e c9582e = C9582e.ad;
        InterfaceC5372e purchase = AbstractC6069e.purchase(c9582e);
        InterfaceC5372e purchase2 = AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[4].getValue());
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{c9582e, c13257e, c13257e, purchase, purchase2};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C14762e.purchase;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        EnumC11077e enumC11077e = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                str = metrica.smaato(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                i2 = metrica.remoteconfig(interfaceC9998e, 1);
                i |= 2;
            } else if (yandex == 2) {
                i3 = metrica.remoteconfig(interfaceC9998e, 2);
                i |= 4;
            } else if (yandex == 3) {
                str2 = (String) metrica.inmobi(interfaceC9998e, 3, C9582e.ad, str2);
                i |= 8;
            } else {
                if (yandex != 4) {
                    throw new C0413e(yandex);
                }
                enumC11077e = (EnumC11077e) metrica.inmobi(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), enumC11077e);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C14762e(i, str, i2, i3, str2, enumC11077e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
