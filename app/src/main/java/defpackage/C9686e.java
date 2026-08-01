package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9686e implements InterfaceC12067e {
    public static final C9686e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍٕۗ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("vps_wall", obj, 4);
        c4707e.advert("vk_entity_id", false);
        c4707e.advert("vk_source", false);
        c4707e.advert("id", false);
        c4707e.advert("displayName", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C16999e c16999e = (C16999e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        C6780e c6780e = C16999e.Companion;
        AbstractC18159e.startapp(c16999e, metrica, interfaceC9998e);
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 2, c16999e.appmetrica);
        abstractC15920e.ads(interfaceC9998e, 3, c16999e.purchase);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C16999e.billing;
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{c9582e, interfaceC3477eArr[1].getValue(), c9582e, c9582e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C16999e.billing;
        int i = 0;
        String str = null;
        EnumC4755e enumC4755e = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                str = metrica.smaato(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                enumC4755e = (EnumC4755e) metrica.subscription(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), enumC4755e);
                i |= 2;
            } else if (yandex == 2) {
                str2 = metrica.smaato(interfaceC9998e, 2);
                i |= 4;
            } else {
                if (yandex != 3) {
                    throw new C0413e(yandex);
                }
                str3 = metrica.smaato(interfaceC9998e, 3);
                i |= 8;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C16999e(i, str, enumC4755e, str2, str3);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
