package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11250e implements InterfaceC12067e {
    public static final C11250e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, eُٟۚ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("ua.itaysonlab.vkxtv.components.playlist.TvPlaylistComponent.PlaylistScreenArgs", obj, 6);
        c4707e.advert("id", false);
        c4707e.advert("ownerId", false);
        c4707e.advert("accessKey", true);
        c4707e.advert("artworkUrl", true);
        c4707e.advert("title", true);
        c4707e.advert("colorInt", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C5869e c5869e = (C5869e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        int i = c5869e.ad;
        int i2 = c5869e.purchase;
        String str = c5869e.appmetrica;
        String str2 = c5869e.license;
        String str3 = c5869e.metrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.inmobi(0, i, interfaceC9998e);
        abstractC15920e.isPro(interfaceC9998e, 1, c5869e.vip);
        if (abstractC15920e.subscription() || str3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 2, C9582e.ad, str3);
        }
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            abstractC15920e.ads(interfaceC9998e, 3, str2);
        }
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            abstractC15920e.ads(interfaceC9998e, 4, str);
        }
        if (abstractC15920e.subscription() || i2 != 0) {
            abstractC15920e.inmobi(5, i2, interfaceC9998e);
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
        InterfaceC5372e purchase = AbstractC6069e.purchase(c9582e);
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{c13257e, C13058e.ad, purchase, c9582e, c9582e, c13257e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = metrica.remoteconfig(interfaceC9998e, 0);
                    i |= 1;
                    break;
                case 1:
                    j = metrica.firebase(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) metrica.inmobi(interfaceC9998e, 2, C9582e.ad, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = metrica.smaato(interfaceC9998e, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = metrica.smaato(interfaceC9998e, 4);
                    i |= 16;
                    break;
                case 5:
                    i3 = metrica.remoteconfig(interfaceC9998e, 5);
                    i |= 32;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C5869e(i, i2, j, str, str2, str3, i3);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
