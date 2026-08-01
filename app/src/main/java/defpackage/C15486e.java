package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15486e {
    public final int ad;
    public final int metrica;
    public final int vip;

    public C15486e(int i, int i2, int i3) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15486e)) {
            return false;
        }
        C15486e c15486e = (C15486e) obj;
        return this.ad == c15486e.ad && this.vip == c15486e.vip && this.metrica == c15486e.metrica;
    }

    public final int hashCode() {
        return (((this.ad * 31) + this.vip) * 31) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ad);
        sb.append('.');
        sb.append(this.vip);
        sb.append('.');
        sb.append(this.metrica);
        return sb.toString();
    }
}
