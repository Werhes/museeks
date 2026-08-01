package defpackage;

import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCoverSize;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6188e implements InterfaceC12067e {
    public static final C6188e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙؖؖ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("ua.itaysonlab.vkapi2.objects.podcasts.PodcastCoverSize", obj, 5);
        c4707e.advert("height", true);
        c4707e.advert("type", true);
        c4707e.advert("src", true);
        c4707e.advert("url", true);
        c4707e.advert("width", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        PodcastCoverSize podcastCoverSize = (PodcastCoverSize) obj;
        int i = podcastCoverSize.appmetrica;
        String str = podcastCoverSize.license;
        String str2 = podcastCoverSize.metrica;
        String str3 = podcastCoverSize.vip;
        int i2 = podcastCoverSize.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        if (metrica.subscription() || i2 != 0) {
            ((AbstractC15920e) metrica).inmobi(0, i2, interfaceC9998e);
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
        if (metrica.subscription() || i != 0) {
            ((AbstractC15920e) metrica).inmobi(4, i, interfaceC9998e);
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
        return new InterfaceC5372e[]{c13257e, c9582e, c9582e, c9582e, c13257e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                i2 = metrica.remoteconfig(interfaceC9998e, 0);
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
                i3 = metrica.remoteconfig(interfaceC9998e, 4);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new PodcastCoverSize(i, i2, str, str2, str3, i3);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
