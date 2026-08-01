package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۧٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3775e implements InterfaceC12067e {
    public static final C3775e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؕۧٚ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.unofficial.year_stats.Y25Content", obj, 2);
        c4707e.advert("cover", true);
        c4707e.advert("video", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C5767e c5767e = (C5767e) obj;
        List list = c5767e.vip;
        String str = c5767e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C5767e.metrica;
        if (metrica.subscription() || !AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 0, str);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(list, C13664e.f27089e)) {
            ((AbstractC15920e) metrica).applovin(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), list);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        return new InterfaceC5372e[]{C9582e.ad, C5767e.metrica[1].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C5767e.metrica;
        String str = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                str = metrica.smaato(interfaceC9998e, 0);
                i |= 1;
            } else {
                if (yandex != 1) {
                    throw new C0413e(yandex);
                }
                list = (List) metrica.subscription(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), list);
                i |= 2;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C5767e(i, str, list);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
