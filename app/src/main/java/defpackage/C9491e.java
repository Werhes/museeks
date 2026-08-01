package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9491e implements InterfaceC12067e {
    public static final C9491e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eٍٕۥ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistOriginalFollowedDto", obj, 3);
        c4707e.advert("playlist_id", false);
        c4707e.advert("owner_id", false);
        c4707e.advert("access_key", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C9656e c9656e = (C9656e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        int i = c9656e.ad;
        String str = c9656e.metrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.inmobi(0, i, interfaceC9998e);
        abstractC15920e.applovin(interfaceC9998e, 1, C13980e.ad, new C5655e(c9656e.vip));
        if (abstractC15920e.subscription() || str != null) {
            abstractC15920e.Signature(interfaceC9998e, 2, C9582e.ad, str);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        return new InterfaceC5372e[]{C13257e.ad, C13980e.ad, AbstractC6069e.purchase(C9582e.ad)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        C5655e c5655e = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                i2 = metrica.remoteconfig(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                c5655e = (C5655e) metrica.subscription(interfaceC9998e, 1, C13980e.ad, c5655e);
                i |= 2;
            } else {
                if (yandex != 2) {
                    throw new C0413e(yandex);
                }
                str = (String) metrica.inmobi(interfaceC9998e, 2, C9582e.ad, str);
                i |= 4;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C9656e(i, i2, c5655e, str);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
