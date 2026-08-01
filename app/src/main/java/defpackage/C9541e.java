package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9541e implements InterfaceC6065e {
    public final C14544e ad;
    public final int metrica;
    public final C14544e vip;

    public C9541e(C14544e c14544e, C14544e c14544e2, int i) {
        this.ad = c14544e;
        this.vip = c14544e2;
        this.metrica = i;
    }

    @Override // defpackage.InterfaceC6065e
    public final int ad(C10163e c10163e, long j, int i) {
        int ad = this.vip.ad(0, c10163e.vip());
        return c10163e.vip + ad + (-this.ad.ad(0, i)) + this.metrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9541e)) {
            return false;
        }
        C9541e c9541e = (C9541e) obj;
        return this.ad.equals(c9541e.ad) && this.vip.equals(c9541e.vip) && this.metrica == c9541e.metrica;
    }

    public final int hashCode() {
        return AbstractC1414e.license(Float.floatToIntBits(this.ad.ad) * 31, this.vip.ad, 31) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.ad);
        sb.append(", anchorAlignment=");
        sb.append(this.vip);
        sb.append(", offset=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }
}
