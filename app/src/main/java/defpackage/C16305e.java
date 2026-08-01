package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16305e {
    public final C3924e ad;
    public final C3924e appmetrica;
    public final C3924e license;
    public final C3924e metrica;
    public final C3924e vip;

    public C16305e() {
        C3924e c3924e = AbstractC6923e.ad;
        C3924e c3924e2 = AbstractC6923e.vip;
        C3924e c3924e3 = AbstractC6923e.metrica;
        C3924e c3924e4 = AbstractC6923e.license;
        C3924e c3924e5 = AbstractC6923e.appmetrica;
        this.ad = c3924e;
        this.vip = c3924e2;
        this.metrica = c3924e3;
        this.license = c3924e4;
        this.appmetrica = c3924e5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16305e)) {
            return false;
        }
        C16305e c16305e = (C16305e) obj;
        return AbstractC7890e.billing(this.ad, c16305e.ad) && AbstractC7890e.billing(this.vip, c16305e.vip) && AbstractC7890e.billing(this.metrica, c16305e.metrica) && AbstractC7890e.billing(this.license, c16305e.license) && AbstractC7890e.billing(this.appmetrica, c16305e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.ad + ", small=" + this.vip + ", medium=" + this.metrica + ", large=" + this.license + ", extraLarge=" + this.appmetrica + ')';
    }
}
