package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٛٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17860e {
    public final C9904e ad;
    public final int metrica;
    public final int vip;

    public C17860e(C9904e c9904e, int i, int i2) {
        this.ad = c9904e;
        this.vip = i;
        this.metrica = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17860e)) {
            return false;
        }
        C17860e c17860e = (C17860e) obj;
        return this.ad.equals(c17860e.ad) && this.vip == c17860e.vip && this.metrica == c17860e.metrica;
    }

    public final int hashCode() {
        return (((this.ad.hashCode() * 31) + this.vip) * 31) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.ad);
        sb.append(", startIndex=");
        sb.append(this.vip);
        sb.append(", endIndex=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }
}
