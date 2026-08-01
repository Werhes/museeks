package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؑ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0174e implements InterfaceC1848e {
    public static final C0174e ad = new Object();
    public static final C7369e vip = C7369e.metrica("threads");
    public static final C7369e metrica = C7369e.metrica("exception");
    public static final C7369e license = C7369e.metrica("appExitInfo");
    public static final C7369e appmetrica = C7369e.metrica("signal");
    public static final C7369e purchase = C7369e.metrica("binaries");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C15644e c15644e = (C15644e) ((AbstractC8657e) obj);
        interfaceC14209e.ad(vip, c15644e.ad);
        interfaceC14209e.ad(metrica, c15644e.vip);
        interfaceC14209e.ad(license, c15644e.metrica);
        interfaceC14209e.ad(appmetrica, c15644e.license);
        interfaceC14209e.ad(purchase, c15644e.appmetrica);
    }
}
