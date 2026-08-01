package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۢٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15799e implements InterfaceC1848e {
    public static final C15799e ad = new Object();
    public static final C7369e vip = C7369e.metrica("baseAddress");
    public static final C7369e metrica = C7369e.metrica("size");
    public static final C7369e license = C7369e.metrica("name");
    public static final C7369e appmetrica = C7369e.metrica("uuid");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C1338e c1338e = (C1338e) ((AbstractC1111e) obj);
        interfaceC14209e.billing(vip, c1338e.ad);
        interfaceC14209e.billing(metrica, c1338e.vip);
        interfaceC14209e.ad(license, c1338e.metrica);
        String str = c1338e.license;
        interfaceC14209e.ad(appmetrica, str != null ? str.getBytes(AbstractC7939e.ad) : null);
    }
}
