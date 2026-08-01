package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10219e {
    public final C9630e ad;
    public final C9630e adcel;
    public final C9630e appmetrica;
    public final C9630e billing;
    public final C9630e license;
    public final C9630e metrica;
    public final C9630e purchase;
    public final C9630e startapp;
    public final C9630e vip;
    public final C9630e yandex;

    public C10219e(C9630e c9630e, C9630e c9630e2, C9630e c9630e3, C9630e c9630e4, C9630e c9630e5, C9630e c9630e6, C9630e c9630e7, C9630e c9630e8, C9630e c9630e9, C9630e c9630e10) {
        this.ad = c9630e;
        this.vip = c9630e2;
        this.metrica = c9630e3;
        this.license = c9630e4;
        this.appmetrica = c9630e5;
        this.purchase = c9630e6;
        this.billing = c9630e7;
        this.yandex = c9630e8;
        this.startapp = c9630e9;
        this.adcel = c9630e10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10219e.class != obj.getClass()) {
            return false;
        }
        C10219e c10219e = (C10219e) obj;
        return AbstractC7890e.billing(this.ad, c10219e.ad) && AbstractC7890e.billing(this.vip, c10219e.vip) && AbstractC7890e.billing(this.metrica, c10219e.metrica) && AbstractC7890e.billing(this.license, c10219e.license) && AbstractC7890e.billing(this.appmetrica, c10219e.appmetrica) && AbstractC7890e.billing(this.purchase, c10219e.purchase) && AbstractC7890e.billing(this.billing, c10219e.billing) && AbstractC7890e.billing(this.yandex, c10219e.yandex) && AbstractC7890e.billing(this.startapp, c10219e.startapp) && AbstractC7890e.billing(this.adcel, c10219e.adcel);
    }

    public final int hashCode() {
        return this.adcel.hashCode() + AbstractC10257e.purchase(this.startapp, AbstractC10257e.purchase(this.yandex, AbstractC10257e.purchase(this.billing, AbstractC10257e.purchase(this.purchase, AbstractC10257e.purchase(this.appmetrica, AbstractC10257e.purchase(this.license, AbstractC10257e.purchase(this.metrica, AbstractC10257e.purchase(this.vip, this.ad.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "SelectableSurfaceBorder(border=" + this.ad + ", focusedBorder=" + this.vip + ",pressedBorder=" + this.metrica + ", selectedBorder=" + this.license + ",disabledBorder=" + this.appmetrica + ", focusedSelectedBorder=" + this.purchase + ", focusedDisabledBorder=" + this.billing + ",pressedSelectedBorder=" + this.yandex + ", selectedDisabledBorder=" + this.startapp + ", focusedSelectedDisabledBorder=" + this.adcel + ')';
    }
}
