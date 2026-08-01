package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؒۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2325e {
    public static final float ad;
    public static final float appmetrica;
    public static final C17371e billing;
    public static final float license;
    public static final float metrica;
    public static final float purchase;
    public static final float vip;

    static {
        AbstractC12696e.yandex(500, 2, AbstractC0750e.metrica);
        ad = AbstractC17599e.vip;
        vip = AbstractC17599e.license;
        metrica = AbstractC17599e.yandex;
        license = 240;
        appmetrica = AbstractC17599e.appmetrica;
        float f = AbstractC3836e.ad;
        purchase = AbstractC17599e.purchase;
        billing = new C17371e(5);
    }

    public static C13121e ad(C13770e c13770e) {
        return new C13121e(((InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex)).mo497instanceof(AbstractC17599e.ad), 0.0f, 1, 0, null, 26);
    }

    public static C13121e vip(C13770e c13770e) {
        return new C13121e(((InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex)).mo497instanceof(AbstractC17599e.billing), 0.0f, 1, 0, null, 26);
    }
}
