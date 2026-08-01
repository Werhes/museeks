package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17500e {
    public final C3924e ad;
    public final C3924e appmetrica;
    public final C3924e billing;
    public final C3924e license;
    public final C3924e metrica;
    public final C3924e purchase;
    public final C3924e vip;
    public final C3924e yandex;

    public C17500e(C3924e c3924e, int i) {
        c3924e = (i & 1) != 0 ? AbstractC16871e.ad : c3924e;
        C3924e c3924e2 = AbstractC16871e.vip;
        C3924e c3924e3 = AbstractC16871e.metrica;
        C3924e c3924e4 = AbstractC16871e.license;
        C3924e c3924e5 = AbstractC16871e.purchase;
        C3924e c3924e6 = AbstractC16871e.appmetrica;
        C3924e c3924e7 = AbstractC16871e.billing;
        C3924e c3924e8 = AbstractC16871e.yandex;
        this.ad = c3924e;
        this.vip = c3924e2;
        this.metrica = c3924e3;
        this.license = c3924e4;
        this.appmetrica = c3924e5;
        this.purchase = c3924e6;
        this.billing = c3924e7;
        this.yandex = c3924e8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17500e)) {
            return false;
        }
        C17500e c17500e = (C17500e) obj;
        return AbstractC7890e.billing(this.ad, c17500e.ad) && AbstractC7890e.billing(this.vip, c17500e.vip) && AbstractC7890e.billing(this.metrica, c17500e.metrica) && AbstractC7890e.billing(this.license, c17500e.license) && AbstractC7890e.billing(this.appmetrica, c17500e.appmetrica) && AbstractC7890e.billing(this.purchase, c17500e.purchase) && AbstractC7890e.billing(this.billing, c17500e.billing) && AbstractC7890e.billing(this.yandex, c17500e.yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() + ((this.billing.hashCode() + ((this.purchase.hashCode() + ((this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.ad + ", small=" + this.vip + ", medium=" + this.metrica + ", large=" + this.license + ", largeIncreased=" + this.purchase + ", extraLarge=" + this.appmetrica + ", extralargeIncreased=" + this.billing + ", extraExtraLarge=" + this.yandex + ')';
    }
}
