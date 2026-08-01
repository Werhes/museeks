package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9836e implements InterfaceC12067e {
    public static final C9836e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍَۢ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.RequestTokenResponse.ClientError", obj, 3);
        c4707e.advert("error", true);
        c4707e.advert("error_description", true);
        c4707e.advert("error_type", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C0535e c0535e = (C0535e) obj;
        String str = c0535e.metrica;
        String str2 = c0535e.vip;
        String str3 = c0535e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        if (metrica.subscription() || !AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 0, str3);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 1, str2);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 2, str);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{c9582e, c9582e, c9582e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
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
                str3 = metrica.smaato(interfaceC9998e, 2);
                i |= 4;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C0535e(i, str, str2, str3);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
