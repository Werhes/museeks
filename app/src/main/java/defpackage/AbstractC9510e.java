package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9510e {
    public static final C2545e appmetrica;
    public static final C2545e billing;
    public static final C2545e license;
    public static final C2545e metrica;
    public static final C2545e purchase;
    public static final C17843e ad = new C17843e(0.0d, C2394e.f6123e);
    public static final C17843e vip = new C17843e(0.02d, C2394e.f6119e);

    static {
        int i = 0;
        int i2 = 6;
        metrica = new C2545e(0.2d, i, i2);
        double d = 1.0d;
        license = new C2545e(d, i, i2);
        appmetrica = new C2545e(-1.0d, i, i2);
        int i3 = 1;
        int i4 = 2;
        purchase = new C2545e(d, i3, i4);
        billing = new C2545e(0.5d, i3, i4);
    }
}
