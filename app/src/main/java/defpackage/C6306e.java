package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6306e implements InterfaceC5372e {
    public static final C6306e ad = new Object();
    public static final InterfaceC9998e metrica;
    public static final InterfaceC5372e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eَؙٔ] */
    static {
        InterfaceC5372e serializer = C7638e.Companion.serializer();
        vip = serializer;
        metrica = serializer.appmetrica();
    }

    public static void purchase(InterfaceC5757e interfaceC5757e, C17629e c17629e) {
        if (!(interfaceC5757e instanceof C6929e)) {
            throw new IllegalArgumentException(AbstractC10257e.startapp("Unknown encoder type: ", interfaceC5757e));
        }
        vip.ad(interfaceC5757e, new C7638e(c17629e));
    }

    @Override // defpackage.InterfaceC5372e
    public final /* bridge */ /* synthetic */ void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        purchase(interfaceC5757e, (C17629e) obj);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return metrica;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        if (interfaceC11754e instanceof InterfaceC1527e) {
            return new C17629e(Long.parseLong(((C7638e) vip.metrica(interfaceC11754e)).ad));
        }
        throw new IllegalArgumentException(AbstractC10257e.yandex("Unknown decoder type: ", interfaceC11754e));
    }
}
