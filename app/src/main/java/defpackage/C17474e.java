package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17474e implements InterfaceC1848e {
    public static final C17474e ad = new Object();
    public static final C7369e vip = C7369e.metrica("pid");
    public static final C7369e metrica = C7369e.metrica("processName");
    public static final C7369e license = C7369e.metrica("reasonCode");
    public static final C7369e appmetrica = C7369e.metrica("importance");
    public static final C7369e purchase = C7369e.metrica("pss");
    public static final C7369e billing = C7369e.metrica("rss");
    public static final C7369e yandex = C7369e.metrica("timestamp");
    public static final C7369e startapp = C7369e.metrica("traceFile");
    public static final C7369e adcel = C7369e.metrica("buildIdMappingForArch");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C6074e c6074e = (C6074e) ((AbstractC13920e) obj);
        interfaceC14209e.appmetrica(vip, c6074e.ad);
        interfaceC14209e.ad(metrica, c6074e.vip);
        interfaceC14209e.appmetrica(license, c6074e.metrica);
        interfaceC14209e.appmetrica(appmetrica, c6074e.license);
        interfaceC14209e.billing(purchase, c6074e.appmetrica);
        interfaceC14209e.billing(billing, c6074e.purchase);
        interfaceC14209e.billing(yandex, c6074e.billing);
        interfaceC14209e.ad(startapp, c6074e.yandex);
        interfaceC14209e.ad(adcel, c6074e.startapp);
    }
}
