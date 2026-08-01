package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11752e implements InterfaceC12067e {
    public static final C11752e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِٔ۟, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioChartInfoDto", obj, 2);
        c4707e.advert("position", true);
        c4707e.advert("state", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C4742e c4742e = (C4742e) obj;
        EnumC10057e enumC10057e = c4742e.vip;
        Integer num = c4742e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C4742e.metrica;
        if (metrica.subscription() || num != null) {
            metrica.Signature(interfaceC9998e, 0, C13257e.ad, num);
        }
        if (metrica.subscription() || enumC10057e != null) {
            metrica.Signature(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), enumC10057e);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        return new InterfaceC5372e[]{AbstractC6069e.purchase(C13257e.ad), AbstractC6069e.purchase((InterfaceC5372e) C4742e.metrica[1].getValue())};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C4742e.metrica;
        Integer num = null;
        boolean z = true;
        int i = 0;
        EnumC10057e enumC10057e = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                num = (Integer) metrica.inmobi(interfaceC9998e, 0, C13257e.ad, num);
                i |= 1;
            } else {
                if (yandex != 1) {
                    throw new C0413e(yandex);
                }
                enumC10057e = (EnumC10057e) metrica.inmobi(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), enumC10057e);
                i |= 2;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C4742e(i, num, enumC10057e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
