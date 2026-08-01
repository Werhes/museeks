package defpackage;

import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؒۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1250e implements InterfaceC12067e {
    public static final C1250e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِؒۗ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.internal.account.LegacyVkAccount", obj, 9);
        c4707e.advert("id", true);
        c4707e.advert("accessToken", true);
        c4707e.advert("accessTokenExpiresAt", true);
        c4707e.advert("trustedHash", true);
        c4707e.advert("exchangeToken", true);
        c4707e.advert("metadataExpiresAt", true);
        c4707e.advert("username", true);
        c4707e.advert("avatar", true);
        c4707e.advert("canUseModernVkApi", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        long j;
        C18471e c18471e = (C18471e) obj;
        boolean z = c18471e.startapp;
        String str = c18471e.yandex;
        String str2 = c18471e.billing;
        long j2 = c18471e.purchase;
        String str3 = c18471e.appmetrica;
        String str4 = c18471e.license;
        long j3 = c18471e.metrica;
        String str5 = c18471e.vip;
        long j4 = c18471e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        if (!metrica.subscription() && j4 == 0) {
            j = 0;
        } else {
            j = 0;
            ((AbstractC15920e) metrica).isPro(interfaceC9998e, 0, j4);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str5, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 1, str5);
        }
        if (metrica.subscription() || j3 != j) {
            ((AbstractC15920e) metrica).isPro(interfaceC9998e, 2, j3);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str4, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 3, str4);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 4, str3);
        }
        if (metrica.subscription() || j2 != j) {
            ((AbstractC15920e) metrica).isPro(interfaceC9998e, 5, j2);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 6, str2);
        }
        if (metrica.subscription() || !AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            ((AbstractC15920e) metrica).ads(interfaceC9998e, 7, str);
        }
        if (metrica.subscription() || z) {
            ((AbstractC15920e) metrica).signatures(interfaceC9998e, 8, z);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C13058e c13058e = C13058e.ad;
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{c13058e, c9582e, c13058e, c9582e, c9582e, c13058e, c9582e, c9582e, C6266e.ad};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        boolean z = false;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
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
                    j2 = metrica.firebase(interfaceC9998e, 2);
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
                    j3 = metrica.firebase(interfaceC9998e, 5);
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
                    z = metrica.applovin(interfaceC9998e, 8);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C18471e(i, j, str, j2, str2, str3, j3, str4, str5, z);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
