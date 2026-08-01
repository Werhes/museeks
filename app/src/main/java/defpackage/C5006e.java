package defpackage;

import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5006e implements InterfaceC12067e {
    public static final C5006e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌؗٛ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("io.ktor.http.Cookie", obj, 10);
        c4707e.advert("name", false);
        c4707e.advert("value", false);
        c4707e.advert("encoding", true);
        c4707e.advert("maxAge", true);
        c4707e.advert("expires", true);
        c4707e.advert("domain", true);
        c4707e.advert("path", true);
        c4707e.advert("secure", true);
        c4707e.advert("httpOnly", true);
        c4707e.advert("extensions", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C15566e c15566e = (C15566e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C15566e.f30726e;
        String str = c15566e.f30734e;
        Map map = c15566e.f30729e;
        boolean z = c15566e.f30733e;
        boolean z2 = c15566e.f30731e;
        String str2 = c15566e.f30735e;
        String str3 = c15566e.f30736e;
        C17476e c17476e = c15566e.f30727e;
        Integer num = c15566e.f30732e;
        EnumC6792e enumC6792e = c15566e.f30728e;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, str);
        abstractC15920e.ads(interfaceC9998e, 1, c15566e.f30730e);
        if (abstractC15920e.subscription() || enumC6792e != EnumC6792e.f13999e) {
            abstractC15920e.applovin(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), enumC6792e);
        }
        if (abstractC15920e.subscription() || num != null) {
            abstractC15920e.Signature(interfaceC9998e, 3, C13257e.ad, num);
        }
        if (abstractC15920e.subscription() || c17476e != null) {
            abstractC15920e.Signature(interfaceC9998e, 4, C0795e.ad, c17476e);
        }
        if (abstractC15920e.subscription() || str3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 5, C9582e.ad, str3);
        }
        if (abstractC15920e.subscription() || str2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 6, C9582e.ad, str2);
        }
        if (abstractC15920e.subscription() || z2) {
            abstractC15920e.signatures(interfaceC9998e, 7, z2);
        }
        if (abstractC15920e.subscription() || z) {
            abstractC15920e.signatures(interfaceC9998e, 8, z);
        }
        if (abstractC15920e.subscription() || !AbstractC7890e.billing(map, C9139e.f18290e)) {
            abstractC15920e.applovin(interfaceC9998e, 9, (InterfaceC5372e) interfaceC3477eArr[9].getValue(), map);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C15566e.f30726e;
        C9582e c9582e = C9582e.ad;
        C6266e c6266e = C6266e.ad;
        return new InterfaceC5372e[]{c9582e, c9582e, interfaceC3477eArr[2].getValue(), AbstractC6069e.purchase(C13257e.ad), AbstractC6069e.purchase(C0795e.ad), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), c6266e, c6266e, interfaceC3477eArr[9].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C15566e.f30726e;
        Map map = null;
        String str = null;
        String str2 = null;
        EnumC6792e enumC6792e = null;
        Integer num = null;
        C17476e c17476e = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = metrica.smaato(interfaceC9998e, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = metrica.smaato(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    enumC6792e = (EnumC6792e) metrica.subscription(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), enumC6792e);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) metrica.inmobi(interfaceC9998e, 3, C13257e.ad, num);
                    i |= 8;
                    break;
                case 4:
                    c17476e = (C17476e) metrica.inmobi(interfaceC9998e, 4, C0795e.ad, c17476e);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) metrica.inmobi(interfaceC9998e, 5, C9582e.ad, str3);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) metrica.inmobi(interfaceC9998e, 6, C9582e.ad, str4);
                    i |= 64;
                    break;
                case 7:
                    z2 = metrica.applovin(interfaceC9998e, 7);
                    i |= 128;
                    break;
                case 8:
                    z3 = metrica.applovin(interfaceC9998e, 8);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 9:
                    map = (Map) metrica.subscription(interfaceC9998e, 9, (InterfaceC5372e) interfaceC3477eArr[9].getValue(), map);
                    i |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C15566e(i, str, str2, enumC6792e, num, c17476e, str3, str4, z2, z3, map);
    }

    @Override // defpackage.InterfaceC12067e
    public final /* bridge */ InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
