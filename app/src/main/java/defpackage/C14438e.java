package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؑؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14438e implements InterfaceC1848e {
    public static final C14438e ad = new Object();
    public static final C7369e vip = new C7369e("currentCacheSizeBytes", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(1))));
    public static final C7369e metrica = new C7369e("maxCacheSizeBytes", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(2))));

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        C17222e c17222e = (C17222e) obj;
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        interfaceC14209e.billing(vip, c17222e.ad);
        interfaceC14209e.billing(metrica, c17222e.vip);
    }
}
