package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15576e implements InterfaceC1848e {
    public static final C15576e ad = new Object();
    public static final C7369e vip = C7369e.metrica("processName");
    public static final C7369e metrica = C7369e.metrica("pid");
    public static final C7369e license = C7369e.metrica("importance");
    public static final C7369e appmetrica = C7369e.metrica("defaultProcess");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C3116e c3116e = (C3116e) ((AbstractC0235e) obj);
        interfaceC14209e.ad(vip, c3116e.ad);
        interfaceC14209e.appmetrica(metrica, c3116e.vip);
        interfaceC14209e.appmetrica(license, c3116e.metrica);
        interfaceC14209e.license(appmetrica, c3116e.license);
    }
}
