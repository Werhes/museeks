package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؒٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16715e implements InterfaceC12067e {
    public static final C16715e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٗؒٞ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.unofficial.year_stats.Y25Title", obj, 5);
        c4707e.advert("title", true);
        c4707e.advert("value", true);
        c4707e.advert("caption", true);
        c4707e.advert("resource", true);
        c4707e.advert("content", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C2277e c2277e = (C2277e) obj;
        C5767e c5767e = c2277e.appmetrica;
        String str = c2277e.license;
        String str2 = c2277e.metrica;
        String str3 = c2277e.vip;
        String str4 = c2277e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        if (metrica.subscription() || !AbstractC7890e.billing(str4, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 0, str4);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 1, str3);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 2, str2);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 3, str);
        }
        if (metrica.subscription() || c5767e != null) {
            metrica.Signature(interfaceC9998e, 4, C3775e.ad, c5767e);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC5372e purchase = AbstractC6069e.purchase(C3775e.ad);
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{c9582e, c9582e, c9582e, c9582e, purchase};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        C5767e c5767e = null;
        boolean z = true;
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
            } else if (yandex == 2) {
                str3 = metrica.smaato(interfaceC9998e, 2);
                i |= 4;
            } else if (yandex == 3) {
                str4 = metrica.smaato(interfaceC9998e, 3);
                i |= 8;
            } else {
                if (yandex != 4) {
                    throw new C0413e(yandex);
                }
                c5767e = (C5767e) metrica.inmobi(interfaceC9998e, 4, C3775e.ad, c5767e);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C2277e(i, str, str2, str3, str4, c5767e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
