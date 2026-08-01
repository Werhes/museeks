package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4085e {
    public int ad;
    public int license;
    public int metrica;
    public int vip;

    public C4085e(int i, int i2, int i3, int i4) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4085e)) {
            return false;
        }
        C4085e c4085e = (C4085e) obj;
        return this.ad == c4085e.ad && this.vip == c4085e.vip && this.metrica == c4085e.metrica && this.license == c4085e.license;
    }

    public final int hashCode() {
        return (((((this.ad * 31) + this.vip) * 31) + this.metrica) * 31) + this.license;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Change(preStart=");
        sb.append(this.ad);
        sb.append(", preEnd=");
        sb.append(this.vip);
        sb.append(", originalStart=");
        sb.append(this.metrica);
        sb.append(", originalEnd=");
        return AbstractC1786e.pro(sb, this.license, ')');
    }
}
