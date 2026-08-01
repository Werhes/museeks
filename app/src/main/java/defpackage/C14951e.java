package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14951e implements InterfaceC1848e {
    public static final C14951e ad = new Object();
    public static final C7369e vip = C7369e.metrica("sdkVersion");
    public static final C7369e metrica = C7369e.metrica("gmpAppId");
    public static final C7369e license = C7369e.metrica("platform");
    public static final C7369e appmetrica = C7369e.metrica("installationUuid");
    public static final C7369e purchase = C7369e.metrica("firebaseInstallationId");
    public static final C7369e billing = C7369e.metrica("firebaseAuthenticationToken");
    public static final C7369e yandex = C7369e.metrica("appQualitySessionId");
    public static final C7369e startapp = C7369e.metrica("buildVersion");
    public static final C7369e adcel = C7369e.metrica("displayVersion");
    public static final C7369e mopub = C7369e.metrica("session");
    public static final C7369e advert = C7369e.metrica("ndkPayload");
    public static final C7369e smaato = C7369e.metrica("appExitInfo");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C0823e c0823e = (C0823e) ((AbstractC7939e) obj);
        interfaceC14209e.ad(vip, c0823e.vip);
        interfaceC14209e.ad(metrica, c0823e.metrica);
        interfaceC14209e.appmetrica(license, c0823e.license);
        interfaceC14209e.ad(appmetrica, c0823e.appmetrica);
        interfaceC14209e.ad(purchase, c0823e.purchase);
        interfaceC14209e.ad(billing, c0823e.billing);
        interfaceC14209e.ad(yandex, c0823e.yandex);
        interfaceC14209e.ad(startapp, c0823e.startapp);
        interfaceC14209e.ad(adcel, c0823e.adcel);
        interfaceC14209e.ad(mopub, c0823e.mopub);
        interfaceC14209e.ad(advert, c0823e.advert);
        interfaceC14209e.ad(smaato, c0823e.smaato);
    }
}
