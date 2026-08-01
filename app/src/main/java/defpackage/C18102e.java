package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣۣ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18102e implements InterfaceC12067e {
    public static final C18102e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eۣۣ٘, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioStreamMixSettingsDto", obj, 3);
        c4707e.advert("title", false);
        c4707e.advert("subtitle", false);
        c4707e.advert("mix_categories", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C9950e c9950e = (C9950e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C9950e.license;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, c9950e.ad);
        abstractC15920e.ads(interfaceC9998e, 1, c9950e.vip);
        abstractC15920e.applovin(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), c9950e.metrica);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C9950e.license;
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{c9582e, c9582e, interfaceC3477eArr[2].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C9950e.license;
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        List list = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                str = metrica.smaato(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                str2 = metrica.smaato(interfaceC9998e, 1);
                i |= 2;
            } else {
                if (yandex != 2) {
                    throw new C0413e(yandex);
                }
                list = (List) metrica.subscription(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), list);
                i |= 4;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C9950e(i, str, str2, list);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
