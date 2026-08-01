package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11181e implements InterfaceC12067e {
    public static final C11181e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eُۖؔ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.user.VkUser", obj, 5);
        c4707e.advert("id", false);
        c4707e.advert("first_name", true);
        c4707e.advert("last_name", true);
        c4707e.advert("photo_base", true);
        c4707e.advert("name", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C17561e c17561e = (C17561e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        long j = c17561e.ad;
        String str = c17561e.appmetrica;
        String str2 = c17561e.license;
        String str3 = c17561e.metrica;
        String str4 = c17561e.vip;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.isPro(interfaceC9998e, 0, j);
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(str4, BuildConfig.FLAVOR)) {
            abstractC15920e.ads(interfaceC9998e, 1, str4);
        }
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            abstractC15920e.ads(interfaceC9998e, 2, str3);
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
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{C13058e.ad, c9582e, c9582e, c9582e, c9582e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                j = metrica.firebase(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                str = metrica.smaato(interfaceC9998e, 1);
                i |= 2;
            } else if (yandex == 2) {
                str2 = metrica.smaato(interfaceC9998e, 2);
                i |= 4;
            } else if (yandex == 3) {
                str3 = metrica.smaato(interfaceC9998e, 3);
                i |= 8;
            } else {
                if (yandex != 4) {
                    throw new C0413e(yandex);
                }
                str4 = metrica.smaato(interfaceC9998e, 4);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C17561e(i, j, str, str2, str3, str4);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
