package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16871e {
    public static final C3924e ad = AbstractC6864e.license;
    public static final C3924e vip = AbstractC6864e.yandex;
    public static final C3924e metrica = AbstractC6864e.billing;
    public static final C3924e license = AbstractC6864e.appmetrica;
    public static final C3924e appmetrica = AbstractC6864e.purchase;
    public static final C3924e purchase = AbstractC6864e.vip;
    public static final C3924e billing = AbstractC6864e.metrica;
    public static final C3924e yandex = AbstractC6864e.ad;
    public static final C1536e startapp = AbstractC6864e.startapp;

    static {
        float f = 100;
        if (f < 0.0f || f > 100.0f) {
            AbstractC8889e.ad("The percent should be in the range of [0, 100]");
        }
    }
}
