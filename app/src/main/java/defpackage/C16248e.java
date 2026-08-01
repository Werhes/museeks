package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16248e implements InterfaceC12067e {
    public static final C16248e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eّٖٖ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthBirthdayDto", obj, 3);
        c4707e.advert("year", true);
        c4707e.advert("month", true);
        c4707e.advert("day", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C0212e c0212e = (C0212e) obj;
        Integer num = c0212e.metrica;
        Integer num2 = c0212e.vip;
        Integer num3 = c0212e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        if (metrica.subscription() || num3 != null) {
            metrica.Signature(interfaceC9998e, 0, C13257e.ad, num3);
        }
        if (metrica.subscription() || num2 != null) {
            metrica.Signature(interfaceC9998e, 1, C13257e.ad, num2);
        }
        if (metrica.subscription() || num != null) {
            metrica.Signature(interfaceC9998e, 2, C13257e.ad, num);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c13257e)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        Integer num = null;
        boolean z = true;
        int i = 0;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                num = (Integer) metrica.inmobi(interfaceC9998e, 0, C13257e.ad, num);
                i |= 1;
            } else if (yandex == 1) {
                num2 = (Integer) metrica.inmobi(interfaceC9998e, 1, C13257e.ad, num2);
                i |= 2;
            } else {
                if (yandex != 2) {
                    throw new C0413e(yandex);
                }
                num3 = (Integer) metrica.inmobi(interfaceC9998e, 2, C13257e.ad, num3);
                i |= 4;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C0212e(i, num, num2, num3);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
