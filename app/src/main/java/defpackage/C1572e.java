package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1572e implements InterfaceC1848e {
    public static final C1572e ad = new Object();
    public static final C7369e vip = C7369e.metrica("batteryLevel");
    public static final C7369e metrica = C7369e.metrica("batteryVelocity");
    public static final C7369e license = C7369e.metrica("proximityOn");
    public static final C7369e appmetrica = C7369e.metrica("orientation");
    public static final C7369e purchase = C7369e.metrica("ramUsed");
    public static final C7369e billing = C7369e.metrica("diskUsed");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C3876e c3876e = (C3876e) ((AbstractC1644e) obj);
        interfaceC14209e.ad(vip, c3876e.ad);
        interfaceC14209e.appmetrica(metrica, c3876e.vip);
        interfaceC14209e.license(license, c3876e.metrica);
        interfaceC14209e.appmetrica(appmetrica, c3876e.license);
        interfaceC14209e.billing(purchase, c3876e.appmetrica);
        interfaceC14209e.billing(billing, c3876e.purchase);
    }
}
