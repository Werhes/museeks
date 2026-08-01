package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4121e implements InterfaceC12067e {
    public static final C4121e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘٕؖ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("ua.itaysonlab.vkxreborn.playback.util.QueueSaveHolder.VkxSavedState.LastTrackInformation", obj, 5);
        c4707e.advert("id", false);
        c4707e.advert("title", false);
        c4707e.advert("artist", false);
        c4707e.advert("progressCurrent", false);
        c4707e.advert("progressTotal", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C4431e c4431e = (C4431e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, c4431e.ad);
        abstractC15920e.ads(interfaceC9998e, 1, c4431e.vip);
        abstractC15920e.ads(interfaceC9998e, 2, c4431e.metrica);
        abstractC15920e.isPro(interfaceC9998e, 3, c4431e.license);
        abstractC15920e.isPro(interfaceC9998e, 4, c4431e.appmetrica);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C9582e c9582e = C9582e.ad;
        C13058e c13058e = C13058e.ad;
        return new InterfaceC5372e[]{c9582e, c9582e, c9582e, c13058e, c13058e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                str = metrica.smaato(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                str2 = metrica.smaato(interfaceC9998e, 1);
                i |= 2;
            } else if (yandex == 2) {
                str3 = metrica.smaato(interfaceC9998e, 2);
                i |= 4;
            } else if (yandex == 3) {
                j = metrica.firebase(interfaceC9998e, 3);
                i |= 8;
            } else {
                if (yandex != 4) {
                    throw new C0413e(yandex);
                }
                j2 = metrica.firebase(interfaceC9998e, 4);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C4431e(i, str, str2, str3, j, j2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
