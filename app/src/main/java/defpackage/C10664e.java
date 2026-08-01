package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۦؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10664e implements InterfaceC5372e {
    public static final C10664e ad = new Object();
    public static final InterfaceC9998e metrica;
    public static final InterfaceC5372e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eَۦؖ] */
    static {
        InterfaceC5372e serializer = C3303e.Companion.serializer();
        vip = serializer;
        metrica = serializer.appmetrica();
    }

    public static void purchase(InterfaceC5757e interfaceC5757e, C4749e c4749e) {
        if (!(interfaceC5757e instanceof C6929e)) {
            throw new IllegalArgumentException(AbstractC10257e.startapp("Unknown encoder type: ", interfaceC5757e));
        }
        vip.ad(interfaceC5757e, new C3303e(c4749e));
    }

    @Override // defpackage.InterfaceC5372e
    public final /* bridge */ /* synthetic */ void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        purchase(interfaceC5757e, (C4749e) obj);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return metrica;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        if (!(interfaceC11754e instanceof InterfaceC1527e)) {
            throw new IllegalArgumentException(AbstractC10257e.yandex("Unknown decoder type: ", interfaceC11754e));
        }
        C5548e c5548e = ((C3303e) vip.metrica(interfaceC11754e)).ad;
        return new C4749e(c5548e.ad, c5548e.vip);
    }
}
