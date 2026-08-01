package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10761e {
    public final int ad;
    public final C7282e metrica;
    public final C1812e vip;

    public C10761e(int i, C1812e c1812e, C7282e c7282e) {
        this.ad = i;
        this.vip = c1812e;
        this.metrica = c7282e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10761e)) {
            return false;
        }
        C10761e c10761e = (C10761e) obj;
        return this.ad == c10761e.ad && AbstractC7890e.billing(this.vip, c10761e.vip) && this.metrica.equals(c10761e.metrica);
    }

    public final int hashCode() {
        return this.metrica.ad.hashCode() + (((this.ad * 31) + this.vip.f4894e) * 29791);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.ad + ", weight=" + this.vip + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
