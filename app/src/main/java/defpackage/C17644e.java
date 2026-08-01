package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17644e implements InterfaceC1848e {
    public static final C17644e ad = new Object();
    public static final C7369e vip = new C7369e("inferenceCommonLogEvent", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(1))));
    public static final C7369e metrica = new C7369e("options", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(2))));
    public static final C7369e license = new C7369e("detectedBarcodeFormats", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(3))));
    public static final C7369e appmetrica = new C7369e("detectedBarcodeValueTypes", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(4))));
    public static final C7369e purchase = new C7369e("imageInfo", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(5))));

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        C5244e c5244e = (C5244e) obj;
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        interfaceC14209e.ad(vip, c5244e.ad);
        interfaceC14209e.ad(metrica, c5244e.vip);
        interfaceC14209e.ad(license, c5244e.metrica);
        interfaceC14209e.ad(appmetrica, c5244e.license);
        interfaceC14209e.ad(purchase, c5244e.appmetrica);
    }
}
