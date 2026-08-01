package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7817e implements InterfaceC12067e {
    public static final C7817e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eًٌٙ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("finished", obj, 1);
        c4707e.advert("result", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        ((AbstractC15920e) metrica).applovin(interfaceC9998e, 0, (InterfaceC5372e) C3106e.vip[0].getValue(), ((C3106e) obj).ad);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        return new InterfaceC5372e[]{C3106e.vip[0].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C3106e.vip;
        EnumC11407e enumC11407e = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else {
                if (yandex != 0) {
                    throw new C0413e(yandex);
                }
                enumC11407e = (EnumC11407e) metrica.subscription(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), enumC11407e);
                i = 1;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C3106e(i, enumC11407e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
