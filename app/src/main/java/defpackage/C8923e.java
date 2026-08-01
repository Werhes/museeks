package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۘؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8923e implements InterfaceC5372e {
    public static final C8923e ad = new Object();
    public static final C3859e vip = C6266e.vip;

    public static void purchase(InterfaceC5757e interfaceC5757e, C8162e c8162e) {
        if (!(interfaceC5757e instanceof C6929e)) {
            throw new IllegalArgumentException(AbstractC10257e.startapp("Unknown encoder type: ", interfaceC5757e));
        }
        ((C6929e) interfaceC5757e).startapp(c8162e.f16611e);
    }

    @Override // defpackage.InterfaceC5372e
    public final /* bridge */ /* synthetic */ void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        purchase(interfaceC5757e, (C8162e) obj);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        if (interfaceC11754e instanceof InterfaceC1527e) {
            return new C8162e(interfaceC11754e.appmetrica());
        }
        throw new IllegalArgumentException(AbstractC10257e.yandex("Unknown decoder type: ", interfaceC11754e));
    }
}
