package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10443e implements InterfaceC12067e {
    public static final C10443e ad;
    public static final /* synthetic */ C4707e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eَؙۖ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("org.mongodb.kbson.serialization.BsonJavaScriptWithScopeSerializer.BsonValueJson", obj, 2);
        c4707e.advert("$code", false);
        c4707e.advert("$scope", false);
        vip = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C1799e c1799e = (C1799e) obj;
        C4707e c4707e = vip;
        InterfaceC11845e metrica = interfaceC5757e.metrica(c4707e);
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(c4707e, 0, c1799e.ad);
        abstractC15920e.applovin(c4707e, 1, C15418e.ad, c1799e.vip);
        metrica.vip(c4707e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        return new InterfaceC5372e[]{C9582e.ad, C15418e.ad};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        C4707e c4707e = vip;
        InterfaceC2043e metrica = interfaceC11754e.metrica(c4707e);
        String str = null;
        boolean z = true;
        int i = 0;
        Object obj = null;
        while (z) {
            int yandex = metrica.yandex(c4707e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                str = metrica.smaato(c4707e, 0);
                i |= 1;
            } else {
                if (yandex != 1) {
                    throw new C0413e(yandex);
                }
                obj = metrica.subscription(c4707e, 1, C15418e.ad, obj);
                i |= 2;
            }
        }
        metrica.vip(c4707e);
        return new C1799e(i, str, (C4767e) obj);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
