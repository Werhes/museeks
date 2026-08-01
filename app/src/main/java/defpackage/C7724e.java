package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؕۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7724e implements InterfaceC1848e {
    public static final C7724e ad = new Object();
    public static final C7369e vip = C7369e.metrica("rolloutId");
    public static final C7369e metrica = C7369e.metrica("parameterKey");
    public static final C7369e license = C7369e.metrica("parameterValue");
    public static final C7369e appmetrica = C7369e.metrica("variantId");
    public static final C7369e purchase = C7369e.metrica("templateVersion");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C12258e c12258e = (C12258e) ((AbstractC15737e) obj);
        interfaceC14209e.ad(vip, c12258e.vip);
        interfaceC14209e.ad(metrica, c12258e.metrica);
        interfaceC14209e.ad(license, c12258e.license);
        interfaceC14209e.ad(appmetrica, c12258e.appmetrica);
        interfaceC14209e.billing(purchase, c12258e.purchase);
    }
}
