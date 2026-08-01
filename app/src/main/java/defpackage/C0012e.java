package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؑؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0012e implements InterfaceC12067e {
    public static final C0012e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, eؑؑؑ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.playback.dsp.DspStoredPreset", obj, 5);
        c4707e.advert("id", false);
        c4707e.advert("name", false);
        c4707e.advert("default", true);
        c4707e.advert("bands", false);
        c4707e.advert("gains", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C10620e c10620e = (C10620e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C10620e.purchase;
        String str = c10620e.ad;
        boolean z = c10620e.metrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, str);
        abstractC15920e.ads(interfaceC9998e, 1, c10620e.vip);
        if (abstractC15920e.subscription() || z) {
            abstractC15920e.signatures(interfaceC9998e, 2, z);
        }
        abstractC15920e.applovin(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), c10620e.license);
        abstractC15920e.applovin(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), c10620e.appmetrica);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C10620e.purchase;
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{c9582e, c9582e, C6266e.ad, interfaceC3477eArr[3].getValue(), interfaceC3477eArr[4].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C10620e.purchase;
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        boolean z2 = true;
        while (z2) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z2 = false;
            } else if (yandex == 0) {
                str = metrica.smaato(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                str2 = metrica.smaato(interfaceC9998e, 1);
                i |= 2;
            } else if (yandex == 2) {
                z = metrica.applovin(interfaceC9998e, 2);
                i |= 4;
            } else if (yandex == 3) {
                list = (List) metrica.subscription(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), list);
                i |= 8;
            } else {
                if (yandex != 4) {
                    throw new C0413e(yandex);
                }
                list2 = (List) metrica.subscription(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), list2);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C10620e(i, str, str2, z, list, list2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
