package defpackage;

import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10248e implements InterfaceC12067e {
    public static final C10248e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eَِٓ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo", obj, 6);
        c4707e.advert("cover", false);
        c4707e.advert("plays", false);
        c4707e.advert("is_favorite", false);
        c4707e.advert("description", false);
        c4707e.advert("position", false);
        c4707e.advert("thumb", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        PodcastInfo podcastInfo = (PodcastInfo) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        C1765e c1765e = C1765e.ad;
        PodcastCover podcastCover = podcastInfo.ad;
        AlbumThumb albumThumb = podcastInfo.purchase;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(interfaceC9998e, 0, c1765e, podcastCover);
        abstractC15920e.inmobi(1, podcastInfo.vip, interfaceC9998e);
        abstractC15920e.Signature(interfaceC9998e, 2, C6266e.ad, podcastInfo.metrica);
        abstractC15920e.Signature(interfaceC9998e, 3, C9582e.ad, podcastInfo.license);
        abstractC15920e.Signature(interfaceC9998e, 4, C13257e.ad, podcastInfo.appmetrica);
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(albumThumb, new AlbumThumb((String) null, (String) null, podcastInfo.ad.ad("c"), podcastInfo.ad(), podcastInfo.vip(), 3))) {
            abstractC15920e.applovin(interfaceC9998e, 5, C13568e.ad, albumThumb);
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
        return new InterfaceC5372e[]{C1765e.ad, c13257e, AbstractC6069e.purchase(C6266e.ad), AbstractC6069e.purchase(C9582e.ad), AbstractC6069e.purchase(c13257e), C13568e.ad};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        int i2 = 0;
        PodcastCover podcastCover = null;
        Boolean bool = null;
        String str = null;
        Integer num = null;
        AlbumThumb albumThumb = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    podcastCover = (PodcastCover) metrica.subscription(interfaceC9998e, 0, C1765e.ad, podcastCover);
                    i |= 1;
                    break;
                case 1:
                    i2 = metrica.remoteconfig(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) metrica.inmobi(interfaceC9998e, 2, C6266e.ad, bool);
                    i |= 4;
                    break;
                case 3:
                    str = (String) metrica.inmobi(interfaceC9998e, 3, C9582e.ad, str);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) metrica.inmobi(interfaceC9998e, 4, C13257e.ad, num);
                    i |= 16;
                    break;
                case 5:
                    albumThumb = (AlbumThumb) metrica.subscription(interfaceC9998e, 5, C13568e.ad, albumThumb);
                    i |= 32;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new PodcastInfo(i, podcastCover, i2, bool, str, num, albumThumb);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
