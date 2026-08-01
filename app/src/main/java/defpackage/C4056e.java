package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4056e implements InterfaceC1848e {
    public static final C4056e ad = new Object();
    public static final C7369e vip = new C7369e("maxMs", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(1))));
    public static final C7369e metrica = new C7369e("minMs", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(2))));
    public static final C7369e license = new C7369e("avgMs", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(3))));
    public static final C7369e appmetrica = new C7369e("firstQuartileMs", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(4))));
    public static final C7369e purchase = new C7369e("medianMs", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(5))));
    public static final C7369e billing = new C7369e("thirdQuartileMs", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(6))));

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        C6200e c6200e = (C6200e) obj;
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        interfaceC14209e.ad(vip, c6200e.ad);
        interfaceC14209e.ad(metrica, c6200e.vip);
        interfaceC14209e.ad(license, c6200e.metrica);
        interfaceC14209e.ad(appmetrica, c6200e.license);
        interfaceC14209e.ad(purchase, c6200e.appmetrica);
        interfaceC14209e.ad(billing, c6200e.purchase);
    }
}
