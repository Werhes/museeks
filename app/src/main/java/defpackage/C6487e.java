package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6487e implements InterfaceC1848e {
    public static final C6487e ad = new Object();
    public static final C7369e vip = C7369e.metrica("identifier");
    public static final C7369e metrica = C7369e.metrica("version");
    public static final C7369e license = C7369e.metrica("displayVersion");
    public static final C7369e appmetrica = C7369e.metrica("organization");
    public static final C7369e purchase = C7369e.metrica("installationUuid");
    public static final C7369e billing = C7369e.metrica("developmentPlatform");
    public static final C7369e yandex = C7369e.metrica("developmentPlatformVersion");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C9574e c9574e = (C9574e) ((AbstractC17162e) obj);
        interfaceC14209e.ad(vip, c9574e.ad);
        interfaceC14209e.ad(metrica, c9574e.vip);
        interfaceC14209e.ad(license, c9574e.metrica);
        interfaceC14209e.ad(appmetrica, null);
        interfaceC14209e.ad(purchase, c9574e.license);
        interfaceC14209e.ad(billing, c9574e.appmetrica);
        interfaceC14209e.ad(yandex, c9574e.purchase);
    }
}
