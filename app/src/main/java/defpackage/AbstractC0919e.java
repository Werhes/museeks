package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0919e {
    public static final C3123e ad;
    public static final InterfaceC11214e[] vip;

    static {
        C3123e c3123e = new C3123e(8);
        InterfaceC11214e.ad.getClass();
        C3813e c3813e = C7732e.billing;
        c3123e.startapp(1, c3813e);
        C3813e c3813e2 = C7732e.purchase;
        c3123e.startapp(2, c3813e2);
        C3813e c3813e3 = C7732e.vip;
        c3123e.startapp(4, c3813e3);
        C3813e c3813e4 = C7732e.license;
        c3123e.startapp(8, c3813e4);
        C3813e c3813e5 = C7732e.yandex;
        c3123e.startapp(16, c3813e5);
        C3813e c3813e6 = C7732e.appmetrica;
        c3123e.startapp(32, c3813e6);
        C3813e c3813e7 = C7732e.startapp;
        c3123e.startapp(64, c3813e7);
        C3813e c3813e8 = C7732e.metrica;
        c3123e.startapp(128, c3813e8);
        ad = c3123e;
        vip = new InterfaceC11214e[]{c3813e, c3813e2, c3813e3, c3813e7, c3813e5, c3813e6, c3813e4, C7732e.adcel, c3813e8};
    }

    public static final void ad(C3555e c3555e, C15051e c15051e, long j, int i, int i2) {
        if (AbstractC1358e.purchase(j, -1L)) {
            return;
        }
        c3555e.metrica(c15051e.vip(), (int) ((j >>> 48) & 65535));
        c3555e.metrica(c15051e.license(), (int) ((j >>> 32) & 65535));
        c3555e.metrica(c15051e.metrica(), i - ((int) ((j >>> 16) & 65535)));
        c3555e.metrica(c15051e.ad(), i2 - ((int) (j & 65535)));
    }
}
