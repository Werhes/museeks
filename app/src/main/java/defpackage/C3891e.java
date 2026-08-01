package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3891e implements InterfaceC12067e {
    public static final C3891e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eؖؖٓ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.apps.AppsScopeDto", obj, 3);
        c4707e.advert("name", false);
        c4707e.advert("title", true);
        c4707e.advert("description", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C12648e c12648e = (C12648e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC5372e interfaceC5372e = (InterfaceC5372e) C12648e.license[0].getValue();
        EnumC14431e enumC14431e = c12648e.ad;
        String str = c12648e.metrica;
        String str2 = c12648e.vip;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(interfaceC9998e, 0, interfaceC5372e, enumC14431e);
        if (abstractC15920e.subscription() || str2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 1, C9582e.ad, str2);
        }
        if (abstractC15920e.subscription() || str != null) {
            abstractC15920e.Signature(interfaceC9998e, 2, C9582e.ad, str);
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
        return new InterfaceC5372e[]{C12648e.license[0].getValue(), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C12648e.license;
        EnumC14431e enumC14431e = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                enumC14431e = (EnumC14431e) metrica.subscription(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), enumC14431e);
                i |= 1;
            } else if (yandex == 1) {
                str = (String) metrica.inmobi(interfaceC9998e, 1, C9582e.ad, str);
                i |= 2;
            } else {
                if (yandex != 2) {
                    throw new C0413e(yandex);
                }
                str2 = (String) metrica.inmobi(interfaceC9998e, 2, C9582e.ad, str2);
                i |= 4;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C12648e(i, enumC14431e, str, str2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
