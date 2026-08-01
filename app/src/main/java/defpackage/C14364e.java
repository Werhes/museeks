package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۥؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14364e {
    public final C9630e ad;
    public final C9630e appmetrica;
    public final C9630e license;
    public final C9630e metrica;
    public final C9630e vip;

    public C14364e(C9630e c9630e, C9630e c9630e2, C9630e c9630e3, C9630e c9630e4, C9630e c9630e5) {
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
        if (obj == null || C14364e.class != obj.getClass()) {
            return false;
        }
        C14364e c14364e = (C14364e) obj;
        return AbstractC7890e.billing(this.ad, c14364e.ad) && AbstractC7890e.billing(this.vip, c14364e.vip) && AbstractC7890e.billing(this.metrica, c14364e.metrica) && AbstractC7890e.billing(this.license, c14364e.license) && AbstractC7890e.billing(this.appmetrica, c14364e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + AbstractC10257e.purchase(this.license, AbstractC10257e.purchase(this.metrica, AbstractC10257e.purchase(this.vip, this.ad.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ButtonBorder(border=" + this.ad + ", focusedBorder=" + this.vip + ",pressedBorder=" + this.metrica + ", disabledBorder=" + this.license + ", focusedDisabledBorder=" + this.appmetrica + ')';
    }
}
