package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّّٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15418e implements InterfaceC5372e {
    public static final C15418e ad = new Object();
    public static final InterfaceC9998e metrica;
    public static final C17327e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eّّٕ, java.lang.Object] */
    static {
        C17327e c17327e = new C17327e(C15559e.ad, C18218e.ad, 1);
        vip = c17327e;
        metrica = c17327e.license;
    }

    public static void purchase(InterfaceC5757e interfaceC5757e, C4767e c4767e) {
        if (!(interfaceC5757e instanceof C6929e)) {
            throw new IllegalArgumentException(AbstractC10257e.startapp("Unknown encoder type: ", interfaceC5757e));
        }
        vip.ad(interfaceC5757e, c4767e);
    }

    @Override // defpackage.InterfaceC5372e
    public final /* bridge */ /* synthetic */ void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        purchase(interfaceC5757e, (C4767e) obj);
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
        C18218e c18218e = C18218e.ad;
        AbstractC4879e purchase = C18218e.purchase(interfaceC11754e);
        purchase.billing(4);
        return (C4767e) purchase;
    }
}
