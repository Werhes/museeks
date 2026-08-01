package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10979e implements InterfaceC1848e {
    public static final C10979e ad = new Object();
    public static final C7369e vip = C7369e.metrica("sessionId");
    public static final C7369e metrica = C7369e.metrica("firstSessionId");
    public static final C7369e license = C7369e.metrica("sessionIndex");
    public static final C7369e appmetrica = C7369e.metrica("eventTimestampUs");
    public static final C7369e purchase = C7369e.metrica("dataCollectionStatus");
    public static final C7369e billing = C7369e.metrica("firebaseInstallationId");
    public static final C7369e yandex = C7369e.metrica("firebaseAuthenticationToken");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        C9716e c9716e = (C9716e) obj;
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        interfaceC14209e.ad(vip, c9716e.ad);
        interfaceC14209e.ad(metrica, c9716e.vip);
        interfaceC14209e.appmetrica(license, c9716e.metrica);
        interfaceC14209e.billing(appmetrica, c9716e.license);
        interfaceC14209e.ad(purchase, c9716e.appmetrica);
        interfaceC14209e.ad(billing, c9716e.purchase);
        interfaceC14209e.ad(yandex, c9716e.billing);
    }
}
