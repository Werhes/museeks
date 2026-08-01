package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7636e implements InterfaceC1848e {
    public static final C7636e ad = new Object();
    public static final C7369e vip = new C7369e("window", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(1))));
    public static final C7369e metrica = new C7369e("logSourceMetrics", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(2))));
    public static final C7369e license = new C7369e("globalMetrics", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(3))));
    public static final C7369e appmetrica = new C7369e("appNamespace", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(4))));

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        C7866e c7866e = (C7866e) obj;
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        interfaceC14209e.ad(vip, c7866e.ad);
        interfaceC14209e.ad(metrica, c7866e.vip);
        interfaceC14209e.ad(license, c7866e.metrica);
        interfaceC14209e.ad(appmetrica, c7866e.license);
    }
}
