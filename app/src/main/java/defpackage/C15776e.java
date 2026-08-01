package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ۠ٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15776e implements InterfaceC1848e {
    public static final C15776e ad = new Object();
    public static final C7369e vip = new C7369e("durationMs", AbstractC10257e.Signature(AbstractC1414e.startapp(InterfaceC17050e.class, new C11173e(1))));
    public static final C7369e metrica = new C7369e("imageSource", AbstractC10257e.Signature(AbstractC1414e.startapp(InterfaceC17050e.class, new C11173e(2))));
    public static final C7369e license = new C7369e("imageFormat", AbstractC10257e.Signature(AbstractC1414e.startapp(InterfaceC17050e.class, new C11173e(3))));
    public static final C7369e appmetrica = new C7369e("imageByteSize", AbstractC10257e.Signature(AbstractC1414e.startapp(InterfaceC17050e.class, new C11173e(4))));
    public static final C7369e purchase = new C7369e("imageWidth", AbstractC10257e.Signature(AbstractC1414e.startapp(InterfaceC17050e.class, new C11173e(5))));
    public static final C7369e billing = new C7369e("imageHeight", AbstractC10257e.Signature(AbstractC1414e.startapp(InterfaceC17050e.class, new C11173e(6))));
    public static final C7369e yandex = new C7369e("rotationDegrees", AbstractC10257e.Signature(AbstractC1414e.startapp(InterfaceC17050e.class, new C11173e(7))));

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        C10440e c10440e = (C10440e) obj;
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        interfaceC14209e.ad(vip, c10440e.ad);
        interfaceC14209e.ad(metrica, c10440e.vip);
        interfaceC14209e.ad(license, c10440e.metrica);
        interfaceC14209e.ad(appmetrica, c10440e.license);
        interfaceC14209e.ad(purchase, c10440e.appmetrica);
        interfaceC14209e.ad(billing, c10440e.purchase);
        interfaceC14209e.ad(yandex, c10440e.billing);
    }
}
