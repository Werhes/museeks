package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15537e implements InterfaceC12067e {
    public static final C15537e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, eٕ٘ۗ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("com.arkivanov.decompose.router.children.SavedState", obj, 2);
        c4707e.advert("navState", false);
        c4707e.advert("childState", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C15476e c15476e = (C15476e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC5372e[] interfaceC5372eArr = C15476e.metrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(interfaceC9998e, 0, C14777e.ad, c15476e.ad);
        abstractC15920e.applovin(interfaceC9998e, 1, interfaceC5372eArr[1], c15476e.vip);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        return new InterfaceC5372e[]{C14777e.ad, C15476e.metrica[1]};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC5372e[] interfaceC5372eArr = C15476e.metrica;
        C8633e c8633e = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                c8633e = (C8633e) metrica.subscription(interfaceC9998e, 0, C14777e.ad, c8633e);
                i |= 1;
            } else {
                if (yandex != 1) {
                    throw new C0413e(yandex);
                }
                list = (List) metrica.subscription(interfaceC9998e, 1, interfaceC5372eArr[1], list);
                i |= 2;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C15476e(i, c8633e, list);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
