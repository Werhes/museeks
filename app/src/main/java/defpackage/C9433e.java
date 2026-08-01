package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9433e implements InterfaceC12067e {
    public static final C9433e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍّٜ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPhotoSizesDto", obj, 4);
        c4707e.advert("src", false);
        c4707e.advert("width", false);
        c4707e.advert("height", false);
        c4707e.advert("type", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C13376e c13376e = (C13376e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C13376e.appmetrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, c13376e.ad);
        abstractC15920e.inmobi(1, c13376e.vip, interfaceC9998e);
        abstractC15920e.inmobi(2, c13376e.metrica, interfaceC9998e);
        abstractC15920e.applovin(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), c13376e.license);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C13376e.appmetrica;
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{C9582e.ad, c13257e, c13257e, interfaceC3477eArr[3].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C13376e.appmetrica;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        EnumC2854e enumC2854e = null;
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
            } else {
                if (yandex != 3) {
                    throw new C0413e(yandex);
                }
                enumC2854e = (EnumC2854e) metrica.subscription(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), enumC2854e);
                i |= 8;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C13376e(i, str, i2, i3, enumC2854e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
