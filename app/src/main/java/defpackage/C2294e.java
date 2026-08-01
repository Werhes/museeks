package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؐ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2294e implements InterfaceC12067e {
    public static final C2294e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eؔؐ۠] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioPreviewUrlResponseDto", obj, 4);
        c4707e.advert("url", false);
        c4707e.advert("clip_from", true);
        c4707e.advert("clip_to", true);
        c4707e.advert("streamDuration", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C2943e c2943e = (C2943e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        String str = c2943e.ad;
        int i = c2943e.license;
        int i2 = c2943e.metrica;
        int i3 = c2943e.vip;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, str);
        if (abstractC15920e.subscription() || i3 != 0) {
            abstractC15920e.inmobi(1, i3, interfaceC9998e);
        }
        if (abstractC15920e.subscription() || i2 != 0) {
            abstractC15920e.inmobi(2, i2, interfaceC9998e);
        }
        if (abstractC15920e.subscription() || i != (i2 - i3) / 1000) {
            abstractC15920e.inmobi(3, i, interfaceC9998e);
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
        return new InterfaceC5372e[]{C9582e.ad, c13257e, c13257e, c13257e};
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
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                str = metrica.smaato(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                i2 = metrica.remoteconfig(interfaceC9998e, 1);
                i |= 2;
            } else if (yandex == 2) {
                i3 = metrica.remoteconfig(interfaceC9998e, 2);
                i |= 4;
            } else {
                if (yandex != 3) {
                    throw new C0413e(yandex);
                }
                i4 = metrica.remoteconfig(interfaceC9998e, 3);
                i |= 8;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C2943e(str, i, i2, i3, i4);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
