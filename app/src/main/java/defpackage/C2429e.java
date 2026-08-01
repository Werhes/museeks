package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2429e {
    public final int ad;
    public final boolean metrica;
    public final int vip;

    public C2429e(int i, int i2, boolean z) {
        this.ad = i;
        this.vip = i2;
        this.metrica = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2429e)) {
            return false;
        }
        C2429e c2429e = (C2429e) obj;
        return this.ad == c2429e.ad && this.vip == c2429e.vip && this.metrica == c2429e.metrica;
    }

    public final int hashCode() {
        return (((this.ad * 31) + this.vip) * 31) + (this.metrica ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.ad);
        sb.append(", end=");
        sb.append(this.vip);
        sb.append(", isRtl=");
        return AbstractC1786e.isVip(sb, this.metrica, ')');
    }
}
