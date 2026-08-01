package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11175e implements InterfaceC12067e {
    public static final C11175e ad;
    public static final /* synthetic */ C4707e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eُٟۛ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("org.mongodb.kbson.serialization.BsonObjectIdSerializer.BsonValueJson", obj, 1);
        c4707e.advert("$oid", false);
        vip = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C4707e c4707e = vip;
        InterfaceC11845e metrica = interfaceC5757e.metrica(c4707e);
        ((AbstractC15920e) metrica).ads(c4707e, 0, ((C15915e) obj).ad);
        metrica.vip(c4707e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        return new InterfaceC5372e[]{C9582e.ad};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        C4707e c4707e = vip;
        InterfaceC2043e metrica = interfaceC11754e.metrica(c4707e);
        String str = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int yandex = metrica.yandex(c4707e);
            if (yandex == -1) {
                z = false;
            } else {
                if (yandex != 0) {
                    throw new C0413e(yandex);
                }
                str = metrica.smaato(c4707e, 0);
                i = 1;
            }
        }
        metrica.vip(c4707e);
        return new C15915e(i, str);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
