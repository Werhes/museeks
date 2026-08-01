package defpackage;

import ua.itaysonlab.vkxnative.BundleNativeClass;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353e extends BundleNativeClass {
    public static final C5363e startapp = new C5363e(new C8462e(25));
    public final C13572e appmetrica;
    public final C13572e billing;
    public final C13572e license;
    public final C13572e metrica;
    public final C2362e purchase;
    public final C17974e vip;
    public final C13572e yandex;

    public C0353e() {
        super(12);
        this.vip = new C17974e(5, this);
        int i = 2;
        this.metrica = new C13572e(this, 4, i);
        this.license = new C13572e(this, 5, i);
        this.appmetrica = new C13572e(this, 6, i);
        this.purchase = new C2362e(6, this);
        int i2 = 2;
        this.billing = new C13572e(this, 8, i2);
        this.yandex = new C13572e(this, 10, i2);
    }
}
