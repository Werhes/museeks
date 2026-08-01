package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15225e implements InterfaceC1848e {
    public static final C15225e ad = new Object();
    public static final C7369e vip = C7369e.metrica("generator");
    public static final C7369e metrica = C7369e.metrica("identifier");
    public static final C7369e license = C7369e.metrica("appQualitySessionId");
    public static final C7369e appmetrica = C7369e.metrica("startedAt");
    public static final C7369e purchase = C7369e.metrica("endedAt");
    public static final C7369e billing = C7369e.metrica("crashed");
    public static final C7369e yandex = C7369e.metrica("app");
    public static final C7369e startapp = C7369e.metrica("user");
    public static final C7369e adcel = C7369e.metrica("os");
    public static final C7369e mopub = C7369e.metrica("device");
    public static final C7369e advert = C7369e.metrica("events");
    public static final C7369e smaato = C7369e.metrica("generatorType");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C17924e c17924e = (C17924e) ((AbstractC9135e) obj);
        interfaceC14209e.ad(vip, c17924e.ad);
        interfaceC14209e.ad(metrica, c17924e.vip.getBytes(AbstractC7939e.ad));
        interfaceC14209e.ad(license, c17924e.metrica);
        interfaceC14209e.billing(appmetrica, c17924e.license);
        interfaceC14209e.ad(purchase, c17924e.appmetrica);
        interfaceC14209e.license(billing, c17924e.purchase);
        interfaceC14209e.ad(yandex, c17924e.billing);
        interfaceC14209e.ad(startapp, c17924e.yandex);
        interfaceC14209e.ad(adcel, c17924e.startapp);
        interfaceC14209e.ad(mopub, c17924e.adcel);
        interfaceC14209e.ad(advert, c17924e.mopub);
        interfaceC14209e.appmetrica(smaato, c17924e.advert);
    }
}
