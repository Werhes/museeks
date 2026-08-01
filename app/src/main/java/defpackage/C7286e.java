package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٛۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7286e implements InterfaceC1848e {
    public static final C7286e ad = new Object();
    public static final C7369e vip = C7369e.metrica("performance");
    public static final C7369e metrica = C7369e.metrica("crashlytics");
    public static final C7369e license = C7369e.metrica("sessionSamplingRate");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        C12796e c12796e = (C12796e) obj;
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        interfaceC14209e.ad(vip, c12796e.ad);
        interfaceC14209e.ad(metrica, c12796e.vip);
        interfaceC14209e.purchase(license, c12796e.metrica);
    }
}
