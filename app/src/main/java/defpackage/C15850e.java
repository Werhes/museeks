package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۦُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15850e {
    public final C9630e ad;
    public final C9630e appmetrica;
    public final C9630e license;
    public final C9630e metrica;
    public final C9630e vip;

    public C15850e(C9630e c9630e, C9630e c9630e2, C9630e c9630e3, C9630e c9630e4, C9630e c9630e5) {
        this.ad = c9630e;
        this.vip = c9630e2;
        this.metrica = c9630e3;
        this.license = c9630e4;
        this.appmetrica = c9630e5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15850e.class != obj.getClass()) {
            return false;
        }
        C15850e c15850e = (C15850e) obj;
        return AbstractC7890e.billing(this.ad, c15850e.ad) && AbstractC7890e.billing(this.vip, c15850e.vip) && AbstractC7890e.billing(this.metrica, c15850e.metrica) && AbstractC7890e.billing(this.license, c15850e.license) && AbstractC7890e.billing(this.appmetrica, c15850e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + AbstractC10257e.purchase(this.license, AbstractC10257e.purchase(this.metrica, AbstractC10257e.purchase(this.vip, this.ad.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ClickableSurfaceBorder(border=" + this.ad + ", focusedBorder=" + this.vip + ", pressedBorder=" + this.metrica + ", disabledBorder=" + this.license + ", focusedDisabledBorder=" + this.appmetrica + ')';
    }
}
