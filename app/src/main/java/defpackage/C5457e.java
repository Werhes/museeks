package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5457e implements InterfaceC1848e {
    public static final C5457e ad = new Object();
    public static final C7369e vip = C7369e.metrica("eventType");
    public static final C7369e metrica = C7369e.metrica("sessionData");
    public static final C7369e license = C7369e.metrica("applicationInfo");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        C2772e c2772e = (C2772e) obj;
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        c2772e.getClass();
        interfaceC14209e.ad(vip, EnumC5088e.SESSION_START);
        interfaceC14209e.ad(metrica, c2772e.ad);
        interfaceC14209e.ad(license, c2772e.vip);
    }
}
