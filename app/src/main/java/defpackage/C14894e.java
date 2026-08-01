package defpackage;

import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14894e implements InterfaceC12067e {
    public static final C14894e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٔۖٝ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum", obj, 7);
        c4707e.advert("id", false);
        c4707e.advert("owner_id", false);
        c4707e.advert("access_key", false);
        c4707e.advert("title", false);
        c4707e.advert("thumb", false);
        c4707e.advert("main_color", false);
        c4707e.advert("isCached", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        AudioAlbum audioAlbum = (AudioAlbum) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        C13257e c13257e = C13257e.ad;
        Integer num = audioAlbum.ad;
        boolean z = audioAlbum.billing;
        metrica.Signature(interfaceC9998e, 0, c13257e, num);
        metrica.Signature(interfaceC9998e, 1, C13058e.ad, audioAlbum.vip);
        C9582e c9582e = C9582e.ad;
        metrica.Signature(interfaceC9998e, 2, c9582e, audioAlbum.metrica);
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 3, audioAlbum.license);
        metrica.Signature(interfaceC9998e, 4, C13568e.ad, audioAlbum.appmetrica);
        metrica.Signature(interfaceC9998e, 5, c9582e, audioAlbum.purchase);
        if (metrica.subscription() || z) {
            abstractC15920e.signatures(interfaceC9998e, 6, z);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC5372e purchase = AbstractC6069e.purchase(C13257e.ad);
        InterfaceC5372e purchase2 = AbstractC6069e.purchase(C13058e.ad);
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{purchase, purchase2, AbstractC6069e.purchase(c9582e), c9582e, AbstractC6069e.purchase(C13568e.ad), AbstractC6069e.purchase(c9582e), C6266e.ad};
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum] */
    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Integer num = null;
        Long l = null;
        String str = null;
        String str2 = null;
        AlbumThumb albumThumb = null;
        String str3 = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) metrica.inmobi(interfaceC9998e, 0, C13257e.ad, num);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) metrica.inmobi(interfaceC9998e, 1, C13058e.ad, l);
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
                    albumThumb = (AlbumThumb) metrica.inmobi(interfaceC9998e, 4, C13568e.ad, albumThumb);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) metrica.inmobi(interfaceC9998e, 5, C9582e.ad, str3);
                    i |= 32;
                    break;
                case 6:
                    z2 = metrica.applovin(interfaceC9998e, 6);
                    i |= 64;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        if (63 != (i & 63)) {
            AbstractC5756e.billing(i, 63, descriptor);
            throw null;
        }
        ?? obj = new Object();
        obj.ad = num;
        obj.vip = l;
        obj.metrica = str;
        obj.license = str2;
        obj.appmetrica = albumThumb;
        obj.purchase = str3;
        if ((i & 64) == 0) {
            obj.billing = false;
            return obj;
        }
        obj.billing = z2;
        return obj;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
