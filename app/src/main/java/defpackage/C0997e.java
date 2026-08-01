package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؒۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0997e {
    public static final C0997e billing = new C0997e(new C6817e());
    public static final C0997e startapp;
    public static final C0997e yandex;
    public final int ad;
    public final boolean appmetrica;
    public final boolean license;
    public final boolean metrica;
    public final C12916e purchase;
    public final int vip;

    static {
        C6817e c6817e = new C6817e();
        c6817e.license = 0;
        c6817e.appmetrica = false;
        c6817e.metrica = 1;
        c6817e.ad = true;
        c6817e.vip = false;
        yandex = new C0997e(c6817e);
        C6817e c6817e2 = new C6817e();
        c6817e2.license = 2;
        c6817e2.appmetrica = true;
        c6817e2.metrica = 2;
        c6817e2.vip = true;
        c6817e2.ad = false;
        startapp = new C0997e(c6817e2);
        C6817e c6817e3 = new C6817e();
        c6817e3.license = 0;
        c6817e3.appmetrica = true;
        c6817e3.metrica = 2;
        c6817e3.vip = true;
        c6817e3.ad = true;
    }

    public C0997e(C6817e c6817e) {
        this.appmetrica = c6817e.ad;
        this.ad = c6817e.metrica;
        this.vip = c6817e.license;
        this.license = c6817e.vip;
        this.metrica = c6817e.appmetrica;
        this.purchase = c6817e.purchase;
    }
}
