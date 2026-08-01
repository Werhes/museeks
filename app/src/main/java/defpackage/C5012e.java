package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5012e implements InterfaceC12067e {
    public static final C5012e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٜؗؐ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioAudioAlbumDto", obj, 5);
        c4707e.advert("id", false);
        c4707e.advert("title", false);
        c4707e.advert("owner_id", false);
        c4707e.advert("access_key", false);
        c4707e.advert("thumb", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C5442e c5442e = (C5442e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        int i = c5442e.ad;
        C18236e c18236e = c5442e.appmetrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.inmobi(0, i, interfaceC9998e);
        abstractC15920e.ads(interfaceC9998e, 1, c5442e.vip);
        abstractC15920e.applovin(interfaceC9998e, 2, C13980e.ad, new C5655e(c5442e.metrica));
        abstractC15920e.ads(interfaceC9998e, 3, c5442e.license);
        if (abstractC15920e.subscription() || c18236e != null) {
            abstractC15920e.Signature(interfaceC9998e, 4, C13144e.ad, c18236e);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC5372e purchase = AbstractC6069e.purchase(C13144e.ad);
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{C13257e.ad, c9582e, C13980e.ad, c9582e, purchase};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        int i2 = 0;
        String str = null;
        C5655e c5655e = null;
        String str2 = null;
        C18236e c18236e = null;
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
                c5655e = (C5655e) metrica.subscription(interfaceC9998e, 2, C13980e.ad, c5655e);
                i |= 4;
            } else if (yandex == 3) {
                str2 = metrica.smaato(interfaceC9998e, 3);
                i |= 8;
            } else {
                if (yandex != 4) {
                    throw new C0413e(yandex);
                }
                c18236e = (C18236e) metrica.inmobi(interfaceC9998e, 4, C13144e.ad, c18236e);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C5442e(i, i2, str, c5655e, str2, c18236e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
