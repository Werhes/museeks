package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3321e implements InterfaceC12067e {
    public static final C3321e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eّٖؕ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthValidateSignupParamsDto", obj, 2);
        c4707e.advert("password_min_length", true);
        c4707e.advert("birth_date_max", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C12735e c12735e = (C12735e) obj;
        String str = c12735e.vip;
        Integer num = c12735e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        if (metrica.subscription() || num != null) {
            metrica.Signature(interfaceC9998e, 0, C13257e.ad, num);
        }
        if (metrica.subscription() || str != null) {
            metrica.Signature(interfaceC9998e, 1, C9582e.ad, str);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        return new InterfaceC5372e[]{AbstractC6069e.purchase(C13257e.ad), AbstractC6069e.purchase(C9582e.ad)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        Integer num = null;
        boolean z = true;
        int i = 0;
        String str = null;
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
                str = (String) metrica.inmobi(interfaceC9998e, 1, C9582e.ad, str);
                i |= 2;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C12735e(i, num, str);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
