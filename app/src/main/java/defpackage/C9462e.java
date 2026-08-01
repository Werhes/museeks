package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9462e implements InterfaceC1848e {
    public static final C9462e ad = new Object();
    public static final C7369e vip = C7369e.metrica("platform");
    public static final C7369e metrica = C7369e.metrica("version");
    public static final C7369e license = C7369e.metrica("buildVersion");
    public static final C7369e appmetrica = C7369e.metrica("jailbroken");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C18532e c18532e = (C18532e) ((AbstractC15286e) obj);
        interfaceC14209e.appmetrica(vip, c18532e.ad);
        interfaceC14209e.ad(metrica, c18532e.vip);
        interfaceC14209e.ad(license, c18532e.metrica);
        interfaceC14209e.license(appmetrica, c18532e.license);
    }
}
