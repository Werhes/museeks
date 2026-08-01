package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ۛ */
/* loaded from: classes.dex */
public abstract class AbstractC18007e {
    public static final C11706e appmetrica;
    public static final C11706e billing;
    public static final C11706e license;
    public static final C11706e purchase;
    public static final C7913e ad = new C7913e(2, 1.0f);
    public static final C7913e vip = new C7913e(1, 1.0f);
    public static final C7913e metrica = new C7913e(3, 1.0f);

    static {
        C14544e c14544e = C5438e.f11668e;
        license = new C11706e(1, new C10134e(0, c14544e), c14544e);
        C14544e c14544e2 = C5438e.f11685e;
        appmetrica = new C11706e(1, new C10134e(0, c14544e2), c14544e2);
        C10156e c10156e = C5438e.f11700e;
        purchase = new C11706e(3, new C10134e(1, c10156e), c10156e);
        C10156e c10156e2 = C5438e.f11676e;
        billing = new C11706e(3, new C10134e(1, c10156e2), c10156e2);
    }

    public static InterfaceC12864e Signature(InterfaceC12864e interfaceC12864e, C10156e c10156e) {
        return interfaceC12864e.premium(c10156e.equals(C5438e.f11700e) ? purchase : c10156e.equals(C5438e.f11676e) ? billing : new C11706e(3, new C10134e(1, c10156e), c10156e));
    }

    public static final InterfaceC12864e ad(InterfaceC12864e interfaceC12864e, float f, float f2) {
        return interfaceC12864e.premium(new C18023e(f, f2));
    }

    public static final InterfaceC12864e adcel(InterfaceC12864e interfaceC12864e, float f, float f2) {
        return interfaceC12864e.premium(new C10966e(f, f2, f, f2, true));
    }

    public static /* synthetic */ InterfaceC12864e advert(InterfaceC12864e interfaceC12864e, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 4) != 0) {
            f3 = Float.NaN;
        }
        if ((i & 8) != 0) {
            f4 = Float.NaN;
        }
        return mopub(interfaceC12864e, f, f2, f3, f4);
    }

    public static InterfaceC12864e amazon(InterfaceC12864e interfaceC12864e, float f, float f2, int i) {
        return interfaceC12864e.premium(new C10966e((i & 1) != 0 ? Float.NaN : f, 0.0f, (i & 2) != 0 ? Float.NaN : f2, 0.0f, true, 10));
    }

    public static final InterfaceC12864e appmetrica(InterfaceC12864e interfaceC12864e, float f, float f2) {
        return interfaceC12864e.premium(new C10966e(0.0f, f, 0.0f, f2, true, 5));
    }

    public static final InterfaceC12864e billing(InterfaceC12864e interfaceC12864e, float f) {
        return interfaceC12864e.premium(new C10966e(f, f, f, f, false));
    }

    public static final InterfaceC12864e license(InterfaceC12864e interfaceC12864e, float f) {
        return interfaceC12864e.premium(new C10966e(0.0f, f, 0.0f, f, true, 5));
    }

    public static InterfaceC12864e loadAd(InterfaceC12864e interfaceC12864e) {
        C14544e c14544e = C5438e.f11668e;
        return interfaceC12864e.premium(AbstractC7890e.billing(c14544e, c14544e) ? license : AbstractC7890e.billing(c14544e, C5438e.f11685e) ? appmetrica : new C11706e(1, new C10134e(0, c14544e), c14544e));
    }

    public static final InterfaceC12864e metrica(InterfaceC12864e interfaceC12864e, float f) {
        return interfaceC12864e.premium(f == 1.0f ? ad : new C7913e(2, f));
    }

    public static final InterfaceC12864e mopub(InterfaceC12864e interfaceC12864e, float f, float f2, float f3, float f4) {
        return interfaceC12864e.premium(new C10966e(f, f2, f3, f4, true));
    }

    public static /* synthetic */ InterfaceC12864e purchase(InterfaceC12864e interfaceC12864e, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return appmetrica(interfaceC12864e, f, f2);
    }

    public static final InterfaceC12864e smaato(InterfaceC12864e interfaceC12864e, float f) {
        return interfaceC12864e.premium(new C10966e(f, 0.0f, f, 0.0f, true, 10));
    }

    public static final InterfaceC12864e startapp(InterfaceC12864e interfaceC12864e, float f) {
        return interfaceC12864e.premium(new C10966e(f, f, f, f, true));
    }

    public static /* synthetic */ InterfaceC12864e vip(InterfaceC12864e interfaceC12864e, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return ad(interfaceC12864e, f, f2);
    }

    public static InterfaceC12864e yandex(InterfaceC12864e interfaceC12864e, float f, float f2, float f3, float f4, int i) {
        return interfaceC12864e.premium(new C10966e(f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, false));
    }
}
