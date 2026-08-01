package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۛؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5151e implements InterfaceC11571e {
    public static final C3443e adcel;
    public static final C14101e advert;
    public static final C3443e amazon;
    public static final C3443e billing;
    public static final C3443e mopub;
    public static final C14101e smaato;
    public static final C3443e startapp;
    public static final C3443e yandex;
    public final InterfaceC13403e ad;
    public final C14022e vip;
    public static final C3443e metrica = new C3443e(2);
    public static final C3443e license = new C3443e(3);
    public static final C3443e appmetrica = new C3443e(4);
    public static final C3443e purchase = new C3443e(5);

    static {
        new C14101e(2);
        billing = new C3443e(6);
        yandex = new C3443e(7);
        startapp = new C3443e(8);
        adcel = new C3443e(9);
        mopub = new C3443e(0);
        advert = new C14101e(0);
        smaato = new C14101e(1);
        amazon = new C3443e(1);
    }

    public C5151e(InterfaceC13403e interfaceC13403e) {
        C14022e c14022e = new C14022e(interfaceC13403e);
        this.ad = interfaceC13403e;
        this.vip = c14022e;
    }

    @Override // defpackage.InterfaceC11571e
    public final void ad(String str, C4052e c4052e) {
        if (((C14341e) c4052e.f8999e) != null) {
            throw C15608e.ad(this.ad.amazon(), 22, null);
        }
        if (((C14518e) c4052e.f9005e) == null) {
            c4052e.f9005e = new C14518e();
        }
        this.vip.ad(str, c4052e);
    }
}
