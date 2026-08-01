package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۥٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15083e implements InterfaceC1848e {
    public static final C15083e ad = new Object();
    public static final C7369e vip = C7369e.metrica("type");
    public static final C7369e metrica = C7369e.metrica("reason");
    public static final C7369e license = C7369e.metrica("frames");
    public static final C7369e appmetrica = C7369e.metrica("causedBy");
    public static final C7369e purchase = C7369e.metrica("overflowCount");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C10216e c10216e = (C10216e) ((AbstractC8900e) obj);
        interfaceC14209e.ad(vip, c10216e.ad);
        interfaceC14209e.ad(metrica, c10216e.vip);
        interfaceC14209e.ad(license, c10216e.metrica);
        interfaceC14209e.ad(appmetrica, c10216e.license);
        interfaceC14209e.appmetrica(purchase, c10216e.appmetrica);
    }
}
