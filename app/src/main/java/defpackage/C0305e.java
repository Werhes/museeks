package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0305e implements InterfaceC12067e {
    public static final C0305e ad;
    public static final /* synthetic */ C4707e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eًؑٔ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("org.mongodb.kbson.serialization.BsonTimestampSerializer.BsonValueData", obj, 2);
        c4707e.advert("t", false);
        c4707e.advert("i", false);
        vip = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C6833e c6833e = (C6833e) obj;
        C4707e c4707e = vip;
        InterfaceC11845e metrica = interfaceC5757e.metrica(c4707e);
        C11703e c11703e = C11703e.ad;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(c4707e, 0, c11703e, new C2875e(c6833e.ad));
        abstractC15920e.applovin(c4707e, 1, c11703e, new C2875e(c6833e.vip));
        metrica.vip(c4707e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C11703e c11703e = C11703e.ad;
        return new InterfaceC5372e[]{c11703e, c11703e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        C4707e c4707e = vip;
        InterfaceC2043e metrica = interfaceC11754e.metrica(c4707e);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Object obj2 = null;
        while (z) {
            int yandex = metrica.yandex(c4707e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                obj = metrica.subscription(c4707e, 0, C11703e.ad, obj);
                i |= 1;
            } else {
                if (yandex != 1) {
                    throw new C0413e(yandex);
                }
                obj2 = metrica.subscription(c4707e, 1, C11703e.ad, obj2);
                i |= 2;
            }
        }
        metrica.vip(c4707e);
        return new C6833e(i, (C2875e) obj, (C2875e) obj2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
