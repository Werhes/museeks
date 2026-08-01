package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13818e {
    public static final C4790e ad = AbstractC2649e.yandex(C14882e.f29476e, 0, null, 151, EnumC0337e.f2362e, Integer.class);
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
        C2009e c2009e = C2009e.f5257e;
        C4599e c4599e = C4599e.f9906e;
        C17167e c17167e = EnumC0337e.f2366e;
        vip = AbstractC2649e.billing(c2009e, c4599e, 150, c17167e, C4599e.class);
        metrica = AbstractC2649e.billing(C11505e.f23115e, c4599e, 150, c17167e, C4599e.class);
        license = AbstractC2649e.billing(C9920e.f19581e, c4599e, 150, c17167e, C4599e.class);
        C17485e c17485e = C17485e.f34250e;
        appmetrica = AbstractC2649e.billing(c17485e, c4599e, 150, c17167e, C4599e.class);
        purchase = AbstractC2649e.billing(c17485e, c4599e, 152, c17167e, C4599e.class);
        billing = AbstractC2649e.billing(c17485e, c4599e, 153, c17167e, C4599e.class);
        C3545e c3545e = C3545e.f7986e;
        yandex = AbstractC2649e.yandex(c17485e, c3545e, c3545e, 151, c17167e, C3545e.class);
        startapp = AbstractC2649e.billing(C13754e.f27244e, c4599e, 150, c17167e, C4599e.class);
        adcel = AbstractC2649e.billing(C10067e.f19878e, c4599e, 150, c17167e, C4599e.class);
        mopub = AbstractC2649e.billing(C13212e.f26218e, c4599e, 150, c17167e, C4599e.class);
        advert = AbstractC2649e.billing(C8372e.f17123e, c4599e, 150, c17167e, C4599e.class);
    }

    public static void ad(C18521e c18521e) {
        c18521e.ad(ad);
        c18521e.ad(vip);
        c18521e.ad(metrica);
        c18521e.ad(license);
        c18521e.ad(appmetrica);
        c18521e.ad(purchase);
        c18521e.ad(billing);
        c18521e.ad(yandex);
        c18521e.ad(startapp);
        c18521e.ad(adcel);
        c18521e.ad(mopub);
        c18521e.ad(advert);
    }
}
