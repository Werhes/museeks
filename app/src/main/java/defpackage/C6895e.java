package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6895e implements InterfaceC12067e {
    public static final C6895e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚؔٔ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthSetAuthCodeStatusResponseDto", obj, 5);
        c4707e.advert("status", false);
        c4707e.advert("expires_in", true);
        c4707e.advert("polling_delay", true);
        c4707e.advert("faq_url", true);
        c4707e.advert("domain", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C10878e c10878e = (C10878e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        int i = c10878e.ad;
        String str = c10878e.appmetrica;
        String str2 = c10878e.license;
        int i2 = c10878e.metrica;
        int i3 = c10878e.vip;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.inmobi(0, i, interfaceC9998e);
        if (abstractC15920e.subscription() || i3 != 0) {
            abstractC15920e.inmobi(1, i3, interfaceC9998e);
        }
        if (abstractC15920e.subscription() || i2 != 0) {
            abstractC15920e.inmobi(2, i2, interfaceC9998e);
        }
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            abstractC15920e.ads(interfaceC9998e, 3, str2);
        }
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            abstractC15920e.ads(interfaceC9998e, 4, str);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C13257e c13257e = C13257e.ad;
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{c13257e, c13257e, c13257e, c9582e, c9582e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                i2 = metrica.remoteconfig(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                i3 = metrica.remoteconfig(interfaceC9998e, 1);
                i |= 2;
            } else if (yandex == 2) {
                i4 = metrica.remoteconfig(interfaceC9998e, 2);
                i |= 4;
            } else if (yandex == 3) {
                str = metrica.smaato(interfaceC9998e, 3);
                i |= 8;
            } else {
                if (yandex != 4) {
                    throw new C0413e(yandex);
                }
                str2 = metrica.smaato(interfaceC9998e, 4);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C10878e(i, i2, i3, i4, str, str2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
