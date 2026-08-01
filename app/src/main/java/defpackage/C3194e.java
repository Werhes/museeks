package defpackage;

import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3194e implements InterfaceC12067e {
    public static final C3194e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙؕۜ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist", obj, 5);
        c4707e.advert("id", false);
        c4707e.advert("domain", true);
        c4707e.advert("name", false);
        c4707e.advert("photo", true);
        c4707e.advert("is_cached", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        MainArtist mainArtist = (MainArtist) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = MainArtist.purchase;
        C9582e c9582e = C9582e.ad;
        String str = mainArtist.ad;
        boolean z = mainArtist.appmetrica;
        List list = mainArtist.license;
        String str2 = mainArtist.vip;
        metrica.Signature(interfaceC9998e, 0, c9582e, str);
        if (metrica.subscription() || str2 != null) {
            metrica.Signature(interfaceC9998e, 1, c9582e, str2);
        }
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 2, mainArtist.metrica);
        if (metrica.subscription() || list != null) {
            metrica.Signature(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), list);
        }
        if (metrica.subscription() || z) {
            abstractC15920e.signatures(interfaceC9998e, 4, z);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = MainArtist.purchase;
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), c9582e, AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[3].getValue()), C6266e.ad};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = MainArtist.purchase;
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        boolean z2 = true;
        while (z2) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z2 = false;
            } else if (yandex == 0) {
                str = (String) metrica.inmobi(interfaceC9998e, 0, C9582e.ad, str);
                i |= 1;
            } else if (yandex == 1) {
                str2 = (String) metrica.inmobi(interfaceC9998e, 1, C9582e.ad, str2);
                i |= 2;
            } else if (yandex == 2) {
                str3 = metrica.smaato(interfaceC9998e, 2);
                i |= 4;
            } else if (yandex == 3) {
                list = (List) metrica.inmobi(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), list);
                i |= 8;
            } else {
                if (yandex != 4) {
                    throw new C0413e(yandex);
                }
                z = metrica.applovin(interfaceC9998e, 4);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new MainArtist(i, str, str2, str3, list, z);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
