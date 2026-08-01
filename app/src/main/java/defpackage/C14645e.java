package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14645e implements InterfaceC1848e {
    public static final C14645e ad = new Object();
    public static final C7369e vip = C7369e.metrica("execution");
    public static final C7369e metrica = C7369e.metrica("customAttributes");
    public static final C7369e license = C7369e.metrica("internalKeys");
    public static final C7369e appmetrica = C7369e.metrica("background");
    public static final C7369e purchase = C7369e.metrica("currentProcessDetails");
    public static final C7369e billing = C7369e.metrica("appProcessDetails");
    public static final C7369e yandex = C7369e.metrica("uiOrientation");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C13690e c13690e = (C13690e) ((AbstractC0013e) obj);
        interfaceC14209e.ad(vip, c13690e.ad);
        interfaceC14209e.ad(metrica, c13690e.vip);
        interfaceC14209e.ad(license, c13690e.metrica);
        interfaceC14209e.ad(appmetrica, c13690e.license);
        interfaceC14209e.ad(purchase, c13690e.appmetrica);
        interfaceC14209e.ad(billing, c13690e.purchase);
        interfaceC14209e.appmetrica(yandex, c13690e.billing);
    }
}
