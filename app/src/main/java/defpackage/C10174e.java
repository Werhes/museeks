package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10174e implements InterfaceC12067e {
    public static final C10174e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍَۢ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("com.google.firebase.sessions.settings.SessionConfigs", obj, 5);
        c4707e.advert("sessionsEnabled", false);
        c4707e.advert("sessionSamplingRate", false);
        c4707e.advert("sessionTimeoutSeconds", false);
        c4707e.advert("cacheDurationSeconds", false);
        c4707e.advert("cacheUpdatedTimeSeconds", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C8688e c8688e = (C8688e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        metrica.Signature(interfaceC9998e, 0, C6266e.ad, c8688e.ad);
        metrica.Signature(interfaceC9998e, 1, C5719e.ad, c8688e.vip);
        C13257e c13257e = C13257e.ad;
        metrica.Signature(interfaceC9998e, 2, c13257e, c8688e.metrica);
        metrica.Signature(interfaceC9998e, 3, c13257e, c8688e.license);
        metrica.Signature(interfaceC9998e, 4, C13058e.ad, c8688e.appmetrica);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC5372e purchase = AbstractC6069e.purchase(C6266e.ad);
        InterfaceC5372e purchase2 = AbstractC6069e.purchase(C5719e.ad);
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{purchase, purchase2, AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(C13058e.ad)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                bool = (Boolean) metrica.inmobi(interfaceC9998e, 0, C6266e.ad, bool);
                i |= 1;
            } else if (yandex == 1) {
                d = (Double) metrica.inmobi(interfaceC9998e, 1, C5719e.ad, d);
                i |= 2;
            } else if (yandex == 2) {
                num = (Integer) metrica.inmobi(interfaceC9998e, 2, C13257e.ad, num);
                i |= 4;
            } else if (yandex == 3) {
                num2 = (Integer) metrica.inmobi(interfaceC9998e, 3, C13257e.ad, num2);
                i |= 8;
            } else {
                if (yandex != 4) {
                    throw new C0413e(yandex);
                }
                l = (Long) metrica.inmobi(interfaceC9998e, 4, C13058e.ad, l);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C8688e(i, bool, d, num, num2, l);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
