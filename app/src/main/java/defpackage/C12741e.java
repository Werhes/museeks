package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۛؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12741e implements InterfaceC1848e {
    public static final C12741e ad = new Object();
    public static final C7369e vip = C7369e.metrica("processName");
    public static final C7369e metrica = C7369e.metrica("pid");
    public static final C7369e license = C7369e.metrica("importance");
    public static final C7369e appmetrica = C7369e.metrica("defaultProcess");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        C2039e c2039e = (C2039e) obj;
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        interfaceC14209e.ad(vip, c2039e.ad);
        interfaceC14209e.appmetrica(metrica, c2039e.vip);
        interfaceC14209e.appmetrica(license, c2039e.metrica);
        interfaceC14209e.license(appmetrica, c2039e.license);
    }
}
