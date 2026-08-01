package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4800e implements InterfaceC5372e {
    public static final C4800e ad = new Object();
    public static final InterfaceC5372e vip = C1799e.Companion.serializer();
    public static final C3859e metrica = AbstractC10003e.ad("ZAZ");

    public static void purchase(InterfaceC5757e interfaceC5757e, C1809e c1809e) {
        if (!(interfaceC5757e instanceof C6929e)) {
            throw new IllegalArgumentException(AbstractC10257e.startapp("Unknown encoder type: ", interfaceC5757e));
        }
        vip.ad(interfaceC5757e, new C1799e(c1809e));
    }

    @Override // defpackage.InterfaceC5372e
    public final /* bridge */ /* synthetic */ void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        purchase(interfaceC5757e, (C1809e) obj);
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
        C1799e c1799e = (C1799e) vip.metrica(interfaceC11754e);
        return new C1809e(c1799e.ad, c1799e.vip);
    }
}
