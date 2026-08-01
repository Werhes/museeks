package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8126e {
    public final C14878e ad;
    public final C14878e appmetrica;
    public final C14878e license;
    public final C14878e metrica;
    public final C14878e purchase;
    public final C14878e vip;

    public C8126e(C14878e c14878e, C14878e c14878e2, C14878e c14878e3, C14878e c14878e4, C14878e c14878e5, C14878e c14878e6) {
        this.ad = c14878e;
        this.vip = c14878e2;
        this.metrica = c14878e3;
        this.license = c14878e4;
        this.appmetrica = c14878e5;
        this.purchase = c14878e6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8126e.class != obj.getClass()) {
            return false;
        }
        C8126e c8126e = (C8126e) obj;
        return AbstractC7890e.billing(this.ad, c8126e.ad) && AbstractC7890e.billing(this.vip, c8126e.vip) && AbstractC7890e.billing(this.metrica, c8126e.metrica) && AbstractC7890e.billing(this.license, c8126e.license) && AbstractC7890e.billing(this.appmetrica, c8126e.appmetrica) && AbstractC7890e.billing(this.purchase, c8126e.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + ((this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SelectableSurfaceGlow(glow=" + this.ad + ", focusedGlow=" + this.vip + ",pressedGlow=" + this.metrica + ", selectedGlow=" + this.license + ",focusedSelectedGlow=" + this.appmetrica + ", pressedSelectedGlow=" + this.purchase + ')';
    }
}
