package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0334e {
    public static final C12783e ad;
    public static final C12783e vip;

    static {
        Double valueOf = Double.valueOf(0.69d);
        Double valueOf2 = Double.valueOf(0.265d);
        Double valueOf3 = Double.valueOf(0.32d);
        Double valueOf4 = Double.valueOf(0.68d);
        Double valueOf5 = Double.valueOf(1.0d);
        C6674e c6674e = AbstractC9896e.vip;
        C9616e c9616e = C9616e.f19079e;
        C17580e c17580e = AbstractC0695e.ad;
        C17580e c17580e2 = AbstractC0695e.vip;
        C17580e c17580e3 = AbstractC0695e.metrica;
        ad = new C12783e("sRGB", c6674e, c9616e, c17580e, c17580e2, c17580e3, new C17706e(12));
        C14914e c14914e = C14914e.f29568e;
        vip = AbstractC0695e.ad("Linear sRGB", c6674e, c14914e, c17580e, c17580e2, c17580e3);
        C6674e c6674e2 = AbstractC0695e.license;
        AbstractC0695e.ad("ACES2065-1", c6674e2, c14914e, AbstractC0695e.appmetrica, AbstractC0695e.purchase, AbstractC0695e.billing);
        yandex yandexVar = yandex.f36768e;
        C17580e c17580e4 = AbstractC0695e.yandex;
        C17580e c17580e5 = AbstractC0695e.startapp;
        C17580e c17580e6 = AbstractC0695e.adcel;
        AbstractC0695e.ad("ACEScc", c6674e2, yandexVar, c17580e4, c17580e5, c17580e6);
        AbstractC0695e.ad("ACEScct", c6674e2, startapp.f36460e, c17580e4, c17580e5, c17580e6);
        AbstractC0695e.ad("ACEScg", c6674e2, c14914e, c17580e4, c17580e5, c17580e6);
        C2066e c2066e = new C2066e(2.19921875d);
        Double valueOf6 = Double.valueOf(0.64d);
        Double valueOf7 = Double.valueOf(0.33d);
        C17580e c17580e7 = new C17580e(valueOf6, valueOf7);
        C17580e c17580e8 = new C17580e(Double.valueOf(0.21d), Double.valueOf(0.71d));
        Double valueOf8 = Double.valueOf(0.15d);
        Double valueOf9 = Double.valueOf(0.06d);
        AbstractC0695e.ad("Adobe RGB", c6674e, c2066e, c17580e7, c17580e8, new C17580e(valueOf8, valueOf9));
        int i = AbstractC16261e.f31940e;
        Double valueOf10 = Double.valueOf(0.708d);
        Double valueOf11 = Double.valueOf(0.292d);
        float floatValue = valueOf10.floatValue();
        float floatValue2 = valueOf11.floatValue();
        valueOf5.floatValue();
        Double valueOf12 = Double.valueOf(0.17d);
        Double valueOf13 = Double.valueOf(0.797d);
        float floatValue3 = valueOf12.floatValue();
        float floatValue4 = valueOf13.floatValue();
        valueOf5.floatValue();
        Double valueOf14 = Double.valueOf(0.131d);
        Double valueOf15 = Double.valueOf(0.046d);
        float floatValue5 = valueOf14.floatValue();
        float floatValue6 = valueOf15.floatValue();
        valueOf5.floatValue();
        AbstractC12029e.ad("RGB");
        float f = 1;
        float[] fArr = {floatValue, floatValue3, floatValue5, floatValue2, floatValue4, floatValue6, (f - floatValue) - floatValue2, (f - floatValue3) - floatValue4, (f - floatValue5) - floatValue6};
        C17580e c17580e9 = c6674e.vip;
        float[] amazon = AbstractC7518e.amazon(fArr);
        float f2 = c17580e9.ad;
        float f3 = c17580e9.metrica;
        float f4 = (f2 * f3) / c17580e9.vip;
        float ad2 = c17580e9.ad();
        AbstractC7518e.amazon(AbstractC7518e.advert((amazon[2] * ad2) + (amazon[1] * f3) + (amazon[0] * f4), (amazon[5] * ad2) + (amazon[4] * f3) + (amazon[3] * f4), (amazon[8] * ad2) + (amazon[7] * f3) + (amazon[6] * f4), fArr));
        AbstractC0695e.ad("BT.709", c6674e, C18434e.f36137e, new C17580e(valueOf6, valueOf7), new C17580e(Double.valueOf(0.3d), Double.valueOf(0.6d)), new C17580e(valueOf8, valueOf9));
        AbstractC0695e.ad("DCI P3", new C6674e("DCI P3", new C17580e(Double.valueOf(0.314d), Double.valueOf(0.351d))), new C2066e(2.6d), new C17580e(valueOf4, valueOf3), new C17580e(valueOf2, valueOf), new C17580e(valueOf8, valueOf9));
        AbstractC0695e.ad("Display P3", c6674e, c9616e, new C17580e(valueOf4, valueOf3), new C17580e(valueOf2, valueOf), new C17580e(valueOf8, valueOf9));
        AbstractC0695e.ad("ROMM RGB", AbstractC9896e.ad, C15802e.f31124e, new C17580e(Double.valueOf(0.7347d), Double.valueOf(0.2653d)), new C17580e(Double.valueOf(0.1596d), Double.valueOf(0.8404d)), new C17580e(Double.valueOf(0.0366d), Double.valueOf(1.0E-4d)));
    }
}
