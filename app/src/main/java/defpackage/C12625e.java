package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12625e implements InterfaceC1848e {
    public static final C12625e ad = new Object();
    public static final C7369e vip = C7369e.metrica("pc");
    public static final C7369e metrica = C7369e.metrica("symbol");
    public static final C7369e license = C7369e.metrica("file");
    public static final C7369e appmetrica = C7369e.metrica("offset");
    public static final C7369e purchase = C7369e.metrica("importance");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C9254e c9254e = (C9254e) ((AbstractC15883e) obj);
        interfaceC14209e.billing(vip, c9254e.ad);
        interfaceC14209e.ad(metrica, c9254e.vip);
        interfaceC14209e.ad(license, c9254e.metrica);
        interfaceC14209e.billing(appmetrica, c9254e.license);
        interfaceC14209e.appmetrica(purchase, c9254e.appmetrica);
    }
}
