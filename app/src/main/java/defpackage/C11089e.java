package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11089e implements InterfaceC1848e {
    public static final C11089e ad = new Object();
    public static final C7369e vip = C7369e.metrica("eventTimeMs");
    public static final C7369e metrica = C7369e.metrica("eventCode");
    public static final C7369e license = C7369e.metrica("complianceData");
    public static final C7369e appmetrica = C7369e.metrica("eventUptimeMs");
    public static final C7369e purchase = C7369e.metrica("sourceExtension");
    public static final C7369e billing = C7369e.metrica("sourceExtensionJsonProto3");
    public static final C7369e yandex = C7369e.metrica("timezoneOffsetSeconds");
    public static final C7369e startapp = C7369e.metrica("networkConnectionInfo");
    public static final C7369e adcel = C7369e.metrica("experimentIds");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C8925e c8925e = (C8925e) ((AbstractC6285e) obj);
        interfaceC14209e.billing(vip, c8925e.ad);
        interfaceC14209e.ad(metrica, c8925e.vip);
        interfaceC14209e.ad(license, c8925e.metrica);
        interfaceC14209e.billing(appmetrica, c8925e.license);
        interfaceC14209e.ad(purchase, c8925e.appmetrica);
        interfaceC14209e.ad(billing, c8925e.purchase);
        interfaceC14209e.billing(yandex, c8925e.billing);
        interfaceC14209e.ad(startapp, c8925e.yandex);
        interfaceC14209e.ad(adcel, c8925e.startapp);
    }
}
