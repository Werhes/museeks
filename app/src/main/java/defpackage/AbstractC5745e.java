package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٛۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5745e {
    public static final C4790e ad;
    public static final C4790e adcel;
    public static final C4790e advert;
    public static final C4790e appmetrica;
    public static final C4790e billing;
    public static final C4790e license;
    public static final C4790e metrica;
    public static final C4790e mopub;
    public static final C4790e purchase;
    public static final C4790e startapp;
    public static final C4790e vip;
    public static final C4790e yandex;

    static {
        C11505e c11505e = C11505e.f23115e;
        C17758e c17758e = C17758e.f34831e;
        C17167e c17167e = EnumC0337e.f2366e;
        ad = AbstractC2649e.yandex(c11505e, c17758e, c17758e, 100, c17167e, C17758e.class);
        C9920e c9920e = C9920e.f19581e;
        vip = AbstractC2649e.yandex(c9920e, c17758e, c17758e, 100, c17167e, C17758e.class);
        EnumC0337e enumC0337e = EnumC0337e.f2362e;
        metrica = AbstractC2649e.yandex(c9920e, 0, null, EnergyProfile.EVCONNECTOR_TYPE_OTHER, enumC0337e, Integer.class);
        C17485e c17485e = C17485e.f34250e;
        C4442e c4442e = C4442e.f9636e;
        license = AbstractC2649e.yandex(c17485e, c4442e, c4442e, 100, c17167e, C4442e.class);
        appmetrica = AbstractC2649e.yandex(c17485e, 0, null, EnergyProfile.EVCONNECTOR_TYPE_OTHER, enumC0337e, Integer.class);
        purchase = AbstractC2649e.yandex(C13212e.f26218e, Boolean.FALSE, null, EnergyProfile.EVCONNECTOR_TYPE_OTHER, EnumC0337e.f2364e, Boolean.class);
        C2009e c2009e = C2009e.f5257e;
        billing = AbstractC2649e.yandex(c2009e, 0, null, EnergyProfile.EVCONNECTOR_TYPE_OTHER, enumC0337e, Integer.class);
        yandex = AbstractC2649e.billing(c2009e, c17485e, 102, c17167e, C17485e.class);
        startapp = AbstractC2649e.yandex(c2009e, 0, null, 103, enumC0337e, Integer.class);
        adcel = AbstractC2649e.yandex(c2009e, 0, null, 104, enumC0337e, Integer.class);
        C14882e c14882e = C14882e.f29476e;
        mopub = AbstractC2649e.yandex(c14882e, 0, null, EnergyProfile.EVCONNECTOR_TYPE_OTHER, enumC0337e, Integer.class);
        advert = AbstractC2649e.billing(c14882e, c17485e, 102, c17167e, C17485e.class);
    }
}
