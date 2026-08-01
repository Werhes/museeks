package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5392e {
    public static final C0763e ad;
    public static final Object vip;

    static {
        Float valueOf = Float.valueOf(1.0f);
        ad = new C0763e(1.0f, 1.0f, 1.0f, 1.0f);
        C6571e c6571e = new C6571e(AbstractC9546e.vip, valueOf);
        C6571e c6571e2 = new C6571e(AbstractC9546e.yandex, valueOf);
        C6571e c6571e3 = new C6571e(AbstractC9546e.billing, valueOf);
        C6571e c6571e4 = new C6571e(AbstractC9546e.ad, Float.valueOf(0.01f));
        C6571e c6571e5 = new C6571e(AbstractC9546e.startapp, valueOf);
        C6571e c6571e6 = new C6571e(AbstractC9546e.appmetrica, valueOf);
        C6571e c6571e7 = new C6571e(AbstractC9546e.purchase, valueOf);
        Float valueOf2 = Float.valueOf(0.4f);
        vip = AbstractC10064e.purchase(c6571e, c6571e2, c6571e3, c6571e4, c6571e5, c6571e6, c6571e7, new C6571e(AbstractC9546e.metrica, valueOf2), new C6571e(AbstractC9546e.license, valueOf2));
    }
}
