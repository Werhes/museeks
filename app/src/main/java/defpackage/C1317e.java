package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1317e implements InterfaceC12067e {
    public static final C1317e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؒۚۤ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audiobook.AudioBooksChapterDto", obj, 7);
        c4707e.advert("audio_file", false);
        c4707e.advert("id", false);
        c4707e.advert("progress_status", false);
        c4707e.advert("progress_time", true);
        c4707e.advert("special_project_id", true);
        c4707e.advert("title", false);
        c4707e.advert("track_code", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C2567e c2567e = (C2567e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C2567e.yandex;
        C3879e c3879e = C3879e.ad;
        C15669e c15669e = c2567e.ad;
        Integer num = c2567e.appmetrica;
        int i = c2567e.license;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(interfaceC9998e, 0, c3879e, c15669e);
        abstractC15920e.ads(interfaceC9998e, 1, c2567e.vip);
        abstractC15920e.applovin(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), c2567e.metrica);
        if (abstractC15920e.subscription() || i != 0) {
            abstractC15920e.inmobi(3, i, interfaceC9998e);
        }
        if (abstractC15920e.subscription() || num != null) {
            abstractC15920e.Signature(interfaceC9998e, 4, C13257e.ad, num);
        }
        abstractC15920e.ads(interfaceC9998e, 5, c2567e.purchase);
        abstractC15920e.ads(interfaceC9998e, 6, c2567e.billing);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C2567e.yandex;
        C9582e c9582e = C9582e.ad;
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{C3879e.ad, c9582e, interfaceC3477eArr[2].getValue(), c13257e, AbstractC6069e.purchase(c13257e), c9582e, c9582e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C2567e.yandex;
        int i = 0;
        int i2 = 0;
        C15669e c15669e = null;
        String str = null;
        EnumC8272e enumC8272e = null;
        Integer num = null;
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
                    c15669e = (C15669e) metrica.subscription(interfaceC9998e, 0, C3879e.ad, c15669e);
                    i |= 1;
                    break;
                case 1:
                    str = metrica.smaato(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    enumC8272e = (EnumC8272e) metrica.subscription(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), enumC8272e);
                    i |= 4;
                    break;
                case 3:
                    i2 = metrica.remoteconfig(interfaceC9998e, 3);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) metrica.inmobi(interfaceC9998e, 4, C13257e.ad, num);
                    i |= 16;
                    break;
                case 5:
                    str2 = metrica.smaato(interfaceC9998e, 5);
                    i |= 32;
                    break;
                case 6:
                    str3 = metrica.smaato(interfaceC9998e, 6);
                    i |= 64;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C2567e(i, c15669e, str, enumC8272e, i2, num, str2, str3);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
