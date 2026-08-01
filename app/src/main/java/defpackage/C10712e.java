package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10712e implements InterfaceC1848e {
    public static final C10712e ad = new Object();
    public static final C7369e vip = C7369e.metrica("arch");
    public static final C7369e metrica = C7369e.metrica("model");
    public static final C7369e license = C7369e.metrica("cores");
    public static final C7369e appmetrica = C7369e.metrica("ram");
    public static final C7369e purchase = C7369e.metrica("diskSpace");
    public static final C7369e billing = C7369e.metrica("simulator");
    public static final C7369e yandex = C7369e.metrica("state");
    public static final C7369e startapp = C7369e.metrica("manufacturer");
    public static final C7369e adcel = C7369e.metrica("modelClass");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C10602e c10602e = (C10602e) ((AbstractC10782e) obj);
        interfaceC14209e.appmetrica(vip, c10602e.ad);
        interfaceC14209e.ad(metrica, c10602e.vip);
        interfaceC14209e.appmetrica(license, c10602e.metrica);
        interfaceC14209e.billing(appmetrica, c10602e.license);
        interfaceC14209e.billing(purchase, c10602e.appmetrica);
        interfaceC14209e.license(billing, c10602e.purchase);
        interfaceC14209e.appmetrica(yandex, c10602e.billing);
        interfaceC14209e.ad(startapp, c10602e.yandex);
        interfaceC14209e.ad(adcel, c10602e.startapp);
    }
}
