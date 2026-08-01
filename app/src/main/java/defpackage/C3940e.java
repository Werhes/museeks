package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3940e implements InterfaceC12067e {
    public static final C3940e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙُؖ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.internal.account.VkAccount", obj, 11);
        c4707e.advert("id", false);
        c4707e.advert("access_token", false);
        c4707e.advert("access_token_expire", false);
        c4707e.advert("trusted_hash", false);
        c4707e.advert("exchange_token", false);
        c4707e.advert("metadata_expire", false);
        c4707e.advert("username", false);
        c4707e.advert("first_name", false);
        c4707e.advert("last_name", false);
        c4707e.advert("avatar", false);
        c4707e.advert("uses_latest_api", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C18479e c18479e = (C18479e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.isPro(interfaceC9998e, 0, c18479e.ad);
        abstractC15920e.ads(interfaceC9998e, 1, c18479e.vip);
        C10168e c10168e = C10168e.ad;
        abstractC15920e.applovin(interfaceC9998e, 2, c10168e, c18479e.metrica);
        abstractC15920e.ads(interfaceC9998e, 3, c18479e.license);
        abstractC15920e.ads(interfaceC9998e, 4, c18479e.appmetrica);
        abstractC15920e.applovin(interfaceC9998e, 5, c10168e, c18479e.purchase);
        abstractC15920e.ads(interfaceC9998e, 6, c18479e.billing);
        abstractC15920e.ads(interfaceC9998e, 7, c18479e.yandex);
        abstractC15920e.ads(interfaceC9998e, 8, c18479e.startapp);
        abstractC15920e.ads(interfaceC9998e, 9, c18479e.adcel);
        abstractC15920e.signatures(interfaceC9998e, 10, c18479e.mopub);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C9582e c9582e = C9582e.ad;
        C10168e c10168e = C10168e.ad;
        return new InterfaceC5372e[]{C13058e.ad, c9582e, c10168e, c9582e, c9582e, c10168e, c9582e, c9582e, c9582e, c9582e, C6266e.ad};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        boolean z = false;
        long j = 0;
        String str = null;
        C5471e c5471e = null;
        String str2 = null;
        String str3 = null;
        C5471e c5471e2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z2 = true;
        while (z2) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    j = metrica.firebase(interfaceC9998e, 0);
                    i |= 1;
                    break;
                case 1:
                    str = metrica.smaato(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    c5471e = (C5471e) metrica.subscription(interfaceC9998e, 2, C10168e.ad, c5471e);
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
                    c5471e2 = (C5471e) metrica.subscription(interfaceC9998e, 5, C10168e.ad, c5471e2);
                    i |= 32;
                    break;
                case 6:
                    str4 = metrica.smaato(interfaceC9998e, 6);
                    i |= 64;
                    break;
                case 7:
                    str5 = metrica.smaato(interfaceC9998e, 7);
                    i |= 128;
                    break;
                case 8:
                    str6 = metrica.smaato(interfaceC9998e, 8);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 9:
                    str7 = metrica.smaato(interfaceC9998e, 9);
                    i |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    break;
                case 10:
                    z = metrica.applovin(interfaceC9998e, 10);
                    i |= 1024;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C18479e(i, j, str, c5471e, str2, str3, c5471e2, str4, str5, str6, str7, z);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
