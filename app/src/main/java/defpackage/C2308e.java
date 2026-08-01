package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؑٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2308e {
    public final int ad;
    public final int metrica;
    public final int vip;

    public C2308e(int i, int i2, int i3) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2308e)) {
            return false;
        }
        C2308e c2308e = (C2308e) obj;
        return this.ad == c2308e.ad && this.vip == c2308e.vip && this.metrica == c2308e.metrica;
    }

    public final int hashCode() {
        return (((this.ad * 31) + this.vip) * 31) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputConfigData(width=");
        sb.append(this.ad);
        sb.append(", height=");
        sb.append(this.vip);
        sb.append(", format=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }
}
