package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۤۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4480e extends AbstractC6950e {
    public static final C13391e mopub = new C13391e("ClientNotification.API", new C17150e(3), new C17647e(23));
    public static final C13391e advert = new C13391e("ClientTelemetry.API", new C17150e(4), new C17647e(23));
    public static final C13391e smaato = new C13391e("ModuleInstall.API", new C17150e(2), new C17647e(23));
    public static final C13391e amazon = new C13391e("CastApi.API", new C17150e(7), new C17647e(23));

    public C0560e billing(C11075e c11075e) {
        C9321e ad = C0381e.ad();
        ad.license = new C1032e[]{AbstractC8797e.advert};
        ad.metrica = true;
        ad.vip = false;
        ad.ad = new C13951e(c11075e);
        return appmetrica(2, ad.ad());
    }

    public C0560e purchase(InterfaceC12533e... interfaceC12533eArr) {
        AbstractC9528e.metrica(interfaceC12533eArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (InterfaceC12533e interfaceC12533e : interfaceC12533eArr) {
            AbstractC9528e.adcel(interfaceC12533e, "Requested API must not be null.");
        }
        C9705e billing = C9705e.billing(Arrays.asList(interfaceC12533eArr), false);
        if (billing.f19206e.isEmpty()) {
            return AbstractC1749e.appmetrica(new C9810e(true, 0));
        }
        C9321e ad = C0381e.ad();
        ad.license = new C1032e[]{AbstractC5032e.vip};
        ad.appmetrica = 27301;
        ad.metrica = true;
        ad.vip = false;
        ad.ad = new C7302e(this, billing, 3);
        return appmetrica(0, ad.ad());
    }

    public C0560e yandex(String[] strArr) {
        C9321e ad = C0381e.ad();
        ad.ad = new C0642e(this, strArr, 4);
        ad.license = new C1032e[]{AbstractC18209e.metrica};
        ad.metrica = true;
        ad.vip = false;
        ad.appmetrica = 8425;
        return appmetrica(0, ad.ad());
    }
}
