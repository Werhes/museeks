package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C16439e {
    public final C13797e ad;
    public final int adcel;
    public final int advert;
    public final C15073e appmetrica;
    public final C15073e billing;
    public final double license;
    public final boolean metrica;
    public final C15073e mopub;
    public final C15073e purchase;
    public final C15073e startapp;
    public final int vip;
    public final C15073e yandex;

    public C16439e(C13797e c13797e, int i, boolean z, double d, int i2, int i3, C15073e c15073e, C15073e c15073e2, C15073e c15073e3, C15073e c15073e4, C15073e c15073e5, C15073e c15073e6) {
        this(c13797e, i, z, d, c15073e, c15073e2, c15073e3, c15073e4, c15073e5, i2, i3, c15073e6 == null ? AbstractC16425e.metrica(25.0d, 84.0d) : c15073e6);
    }

    public C16439e(C13797e c13797e, int i, boolean z, double d, C15073e c15073e, C15073e c15073e2, C15073e c15073e3, C15073e c15073e4, C15073e c15073e5, int i2, int i3, C15073e c15073e6) {
        this.ad = c13797e;
        this.vip = i;
        this.metrica = z;
        this.license = d;
        this.appmetrica = c15073e;
        this.purchase = c15073e2;
        this.billing = c15073e3;
        this.yandex = c15073e4;
        this.startapp = c15073e5;
        this.adcel = i2;
        this.mopub = c15073e6;
        switch (AbstractC8703e.m2467class(i)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                i3 = 1;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            default:
                throw new C14803e(10);
        }
        this.advert = i3;
    }
}
