package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8196e implements InterfaceC12067e {
    public static final C8196e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eًٕۚ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.RequestTokenResponse.CaptchaRequired", obj, 6);
        c4707e.advert("captcha_sid", true);
        c4707e.advert("captcha_img", true);
        c4707e.advert("captcha_ts", true);
        c4707e.advert("captcha_ratio", true);
        c4707e.advert("captcha_attempt", true);
        c4707e.advert("redirect_uri", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C11002e c11002e = (C11002e) obj;
        String str = c11002e.purchase;
        int i = c11002e.appmetrica;
        double d = c11002e.license;
        double d2 = c11002e.metrica;
        String str2 = c11002e.vip;
        String str3 = c11002e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        if (metrica.subscription() || !AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 0, str3);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 1, str2);
        }
        if (metrica.subscription() || Double.compare(d2, 0.0d) != 0) {
            AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
            abstractC15920e.tapsense(interfaceC9998e, 2);
            abstractC15920e.purchase(d2);
        }
        if (metrica.subscription() || Double.compare(d, 0.0d) != 0) {
            AbstractC15920e abstractC15920e2 = (AbstractC15920e) metrica;
            abstractC15920e2.tapsense(interfaceC9998e, 3);
            abstractC15920e2.purchase(d);
        }
        if (metrica.subscription() || i != 0) {
            ((AbstractC15920e) metrica).inmobi(4, i, interfaceC9998e);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 5, str);
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
        C5719e c5719e = C5719e.ad;
        return new InterfaceC5372e[]{c9582e, c9582e, c5719e, c5719e, C13257e.ad, c9582e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = metrica.smaato(interfaceC9998e, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = metrica.smaato(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    d = metrica.premium(interfaceC9998e, 2);
                    i |= 4;
                    break;
                case 3:
                    d2 = metrica.premium(interfaceC9998e, 3);
                    i |= 8;
                    break;
                case 4:
                    i2 = metrica.remoteconfig(interfaceC9998e, 4);
                    i |= 16;
                    break;
                case 5:
                    str3 = metrica.smaato(interfaceC9998e, 5);
                    i |= 32;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C11002e(i, str, str2, d, d2, i2, str3);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
