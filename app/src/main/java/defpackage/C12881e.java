package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۥۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12881e implements InterfaceC12067e {
    public static final C12881e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eّۥۦ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.auth.AuthUserExchangeTokenDto", obj, 4);
        c4707e.advert("user_id", false);
        c4707e.advert("profile_type", true);
        c4707e.advert("common_token", true);
        c4707e.advert("tier_tokens", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C16319e c16319e = (C16319e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C16319e.appmetrica;
        C13980e c13980e = C13980e.ad;
        long j = c16319e.ad;
        List list = c16319e.license;
        String str = c16319e.metrica;
        EnumC7830e enumC7830e = c16319e.vip;
        C5655e c5655e = new C5655e(j);
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(interfaceC9998e, 0, c13980e, c5655e);
        if (abstractC15920e.subscription() || enumC7830e != null) {
            abstractC15920e.Signature(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), enumC7830e);
        }
        if (abstractC15920e.subscription() || str != null) {
            abstractC15920e.Signature(interfaceC9998e, 2, C9582e.ad, str);
        }
        if (abstractC15920e.subscription() || list != null) {
            abstractC15920e.Signature(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), list);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C16319e.appmetrica;
        return new InterfaceC5372e[]{C13980e.ad, AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[1].getValue()), AbstractC6069e.purchase(C9582e.ad), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[3].getValue())};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C16319e.appmetrica;
        int i = 0;
        C5655e c5655e = null;
        EnumC7830e enumC7830e = null;
        String str = null;
        List list = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                c5655e = (C5655e) metrica.subscription(interfaceC9998e, 0, C13980e.ad, c5655e);
                i |= 1;
            } else if (yandex == 1) {
                enumC7830e = (EnumC7830e) metrica.inmobi(interfaceC9998e, 1, (InterfaceC5372e) interfaceC3477eArr[1].getValue(), enumC7830e);
                i |= 2;
            } else if (yandex == 2) {
                str = (String) metrica.inmobi(interfaceC9998e, 2, C9582e.ad, str);
                i |= 4;
            } else {
                if (yandex != 3) {
                    throw new C0413e(yandex);
                }
                list = (List) metrica.inmobi(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), list);
                i |= 8;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C16319e(i, c5655e, enumC7830e, str, list);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
