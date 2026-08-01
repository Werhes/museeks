package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ۟ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11303e {
    public final int ad;
    public final int license;
    public final int metrica;
    public final int vip;

    public C11303e(int i, int i2, int i3, int i4) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11303e)) {
            return false;
        }
        C11303e c11303e = (C11303e) obj;
        return this.ad == c11303e.ad && this.vip == c11303e.vip && this.metrica == c11303e.metrica && this.license == c11303e.license;
    }

    public final int hashCode() {
        return (((((this.ad * 31) + this.vip) * 31) + this.metrica) * 31) + this.license;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.ad);
        sb.append(", top=");
        sb.append(this.vip);
        sb.append(", right=");
        sb.append(this.metrica);
        sb.append(", bottom=");
        return AbstractC1786e.pro(sb, this.license, ')');
    }
}
