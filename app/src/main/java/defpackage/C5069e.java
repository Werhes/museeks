package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5069e {
    public final C9630e ad;
    public final C9630e metrica;
    public final C9630e vip;

    public C5069e(C9630e c9630e, C9630e c9630e2, C9630e c9630e3) {
        this.ad = c9630e;
        this.vip = c9630e2;
        this.metrica = c9630e3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5069e.class != obj.getClass()) {
            return false;
        }
        C5069e c5069e = (C5069e) obj;
        return AbstractC7890e.billing(this.ad, c5069e.ad) && AbstractC7890e.billing(this.vip, c5069e.vip) && AbstractC7890e.billing(this.metrica, c5069e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC10257e.purchase(this.vip, this.ad.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CardBorder(border=" + this.ad + ", focusedBorder=" + this.vip + ", pressedBorder=" + this.metrica + ')';
    }
}
