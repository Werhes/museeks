package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ۟ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13527e implements InterfaceC1848e {
    public static final C13527e ad = new Object();
    public static final C7369e vip = C7369e.metrica("requestTimeMs");
    public static final C7369e metrica = C7369e.metrica("requestUptimeMs");
    public static final C7369e license = C7369e.metrica("clientInfo");
    public static final C7369e appmetrica = C7369e.metrica("logSource");
    public static final C7369e purchase = C7369e.metrica("logSourceName");
    public static final C7369e billing = C7369e.metrica("logEvent");
    public static final C7369e yandex = C7369e.metrica("qosTier");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C4827e c4827e = (C4827e) ((AbstractC11369e) obj);
        interfaceC14209e.billing(vip, c4827e.ad);
        interfaceC14209e.billing(metrica, c4827e.vip);
        interfaceC14209e.ad(license, c4827e.metrica);
        interfaceC14209e.ad(appmetrica, c4827e.license);
        interfaceC14209e.ad(purchase, c4827e.appmetrica);
        interfaceC14209e.ad(billing, c4827e.purchase);
        interfaceC14209e.ad(yandex, EnumC15543e.f30691e);
    }
}
