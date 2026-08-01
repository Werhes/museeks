package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4819e {
    public final C14878e ad;
    public final C14878e metrica;
    public final C14878e vip;

    public C4819e(C14878e c14878e, C14878e c14878e2, C14878e c14878e3) {
        this.ad = c14878e;
        this.vip = c14878e2;
        this.metrica = c14878e3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4819e.class != obj.getClass()) {
            return false;
        }
        C4819e c4819e = (C4819e) obj;
        return AbstractC7890e.billing(this.ad, c4819e.ad) && AbstractC7890e.billing(this.vip, c4819e.vip) && AbstractC7890e.billing(this.metrica, c4819e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CardGlow(glow=" + this.ad + ", focusedGlow=" + this.vip + ", pressedGlow=" + this.metrica + ')';
    }
}
