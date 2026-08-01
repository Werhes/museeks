package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4816e {
    public final C9630e ad;
    public final C9630e appmetrica;
    public final C9630e billing;
    public final C9630e license;
    public final C9630e metrica;
    public final C9630e purchase;
    public final C9630e vip;
    public final C9630e yandex;

    public C4816e(C9630e c9630e, C9630e c9630e2, C9630e c9630e3, C9630e c9630e4, C9630e c9630e5, C9630e c9630e6, C9630e c9630e7, C9630e c9630e8) {
        this.ad = c9630e;
        this.vip = c9630e2;
        this.metrica = c9630e3;
        this.license = c9630e4;
        this.appmetrica = c9630e5;
        this.purchase = c9630e6;
        this.billing = c9630e7;
        this.yandex = c9630e8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4816e.class != obj.getClass()) {
            return false;
        }
        C4816e c4816e = (C4816e) obj;
        return AbstractC7890e.billing(this.ad, c4816e.ad) && AbstractC7890e.billing(this.vip, c4816e.vip) && AbstractC7890e.billing(this.metrica, c4816e.metrica) && AbstractC7890e.billing(this.license, c4816e.license) && AbstractC7890e.billing(this.appmetrica, c4816e.appmetrica) && AbstractC7890e.billing(this.purchase, c4816e.purchase) && AbstractC7890e.billing(this.billing, c4816e.billing) && AbstractC7890e.billing(this.yandex, c4816e.yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() + AbstractC10257e.purchase(this.billing, AbstractC10257e.purchase(this.purchase, AbstractC10257e.purchase(this.appmetrica, AbstractC10257e.purchase(this.license, AbstractC10257e.purchase(this.metrica, AbstractC10257e.purchase(this.vip, this.ad.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ListItemBorder(border=" + this.ad + ", focusedBorder=" + this.vip + ", pressedBorder=" + this.metrica + ", selectedBorder=" + this.license + ", disabledBorder=" + this.appmetrica + ", focusedSelectedBorder=" + this.purchase + ", focusedDisabledBorder=" + this.billing + ", pressedSelectedBorder=" + this.yandex + ')';
    }
}
