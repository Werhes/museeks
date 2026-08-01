package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5406e implements InterfaceC1848e {
    public static final C5406e ad = new Object();
    public static final C7369e vip = C7369e.metrica("timestamp");
    public static final C7369e metrica = C7369e.metrica("type");
    public static final C7369e license = C7369e.metrica("app");
    public static final C7369e appmetrica = C7369e.metrica("device");
    public static final C7369e purchase = C7369e.metrica("log");
    public static final C7369e billing = C7369e.metrica("rollouts");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C3023e c3023e = (C3023e) ((AbstractC7796e) obj);
        interfaceC14209e.billing(vip, c3023e.ad);
        interfaceC14209e.ad(metrica, c3023e.vip);
        interfaceC14209e.ad(license, c3023e.metrica);
        interfaceC14209e.ad(appmetrica, c3023e.license);
        interfaceC14209e.ad(purchase, c3023e.appmetrica);
        interfaceC14209e.ad(billing, c3023e.purchase);
    }
}
