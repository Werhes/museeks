package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٌ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8558e implements InterfaceC12067e {
    public static final C8558e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eًٌٌ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("com.google.firebase.sessions.SessionData", obj, 3);
        c4707e.advert("sessionDetails", false);
        c4707e.advert("backgroundTime", true);
        c4707e.advert("processDataMap", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C12893e c12893e = (C12893e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC5372e[] interfaceC5372eArr = C12893e.license;
        C15848e c15848e = C15848e.ad;
        C5707e c5707e = c12893e.ad;
        Map map = c12893e.metrica;
        C16971e c16971e = c12893e.vip;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(interfaceC9998e, 0, c15848e, c5707e);
        if (abstractC15920e.subscription() || c16971e != null) {
            abstractC15920e.Signature(interfaceC9998e, 1, C2990e.ad, c16971e);
        }
        if (abstractC15920e.subscription() || map != null) {
            abstractC15920e.Signature(interfaceC9998e, 2, interfaceC5372eArr[2], map);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        return new InterfaceC5372e[]{C15848e.ad, AbstractC6069e.purchase(C2990e.ad), AbstractC6069e.purchase(C12893e.license[2])};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC5372e[] interfaceC5372eArr = C12893e.license;
        C5707e c5707e = null;
        boolean z = true;
        int i = 0;
        C16971e c16971e = null;
        Map map = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                c5707e = (C5707e) metrica.subscription(interfaceC9998e, 0, C15848e.ad, c5707e);
                i |= 1;
            } else if (yandex == 1) {
                c16971e = (C16971e) metrica.inmobi(interfaceC9998e, 1, C2990e.ad, c16971e);
                i |= 2;
            } else {
                if (yandex != 2) {
                    throw new C0413e(yandex);
                }
                map = (Map) metrica.inmobi(interfaceC9998e, 2, interfaceC5372eArr[2], map);
                i |= 4;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C12893e(i, c5707e, c16971e, map);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
