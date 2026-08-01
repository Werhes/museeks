package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٙؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8773e implements InterfaceC1848e {
    public static final C8773e ad = new Object();
    public static final C7369e vip = C7369e.metrica("name");
    public static final C7369e metrica = C7369e.metrica("code");
    public static final C7369e license = C7369e.metrica("address");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        C10330e c10330e = (C10330e) ((AbstractC5863e) obj);
        interfaceC14209e.ad(vip, c10330e.ad);
        interfaceC14209e.ad(metrica, c10330e.vip);
        interfaceC14209e.billing(license, c10330e.metrica);
    }
}
