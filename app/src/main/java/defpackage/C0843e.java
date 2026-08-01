package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843e implements InterfaceC17372e {
    public static final C0843e ad = new Object();
    public static final C13540e vip = AbstractC12696e.purchase(0.9f, 700.0f, null, 4);
    public static final C13540e metrica = AbstractC12696e.purchase(0.9f, 1400.0f, null, 4);
    public static final C13540e license = AbstractC12696e.purchase(0.9f, 300.0f, null, 4);
    public static final C13540e appmetrica = AbstractC12696e.purchase(1.0f, 1600.0f, null, 4);
    public static final C13540e purchase = AbstractC12696e.purchase(1.0f, 3800.0f, null, 4);
    public static final C13540e billing = AbstractC12696e.purchase(1.0f, 800.0f, null, 4);

    @Override // defpackage.InterfaceC17372e
    public final C13540e ad() {
        return billing;
    }

    @Override // defpackage.InterfaceC17372e
    public final C13540e appmetrica() {
        return license;
    }

    @Override // defpackage.InterfaceC17372e
    public final C13540e license() {
        return appmetrica;
    }

    @Override // defpackage.InterfaceC17372e
    public final C13540e metrica() {
        return metrica;
    }

    @Override // defpackage.InterfaceC17372e
    public final C13540e purchase() {
        return vip;
    }

    @Override // defpackage.InterfaceC17372e
    public final C13540e vip() {
        return purchase;
    }
}
