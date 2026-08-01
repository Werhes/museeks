package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۣؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4463e {
    public final EnumC2880e ad;
    public final boolean metrica;
    public final boolean vip;

    public C4463e(EnumC2880e enumC2880e, boolean z, boolean z2) {
        this.ad = enumC2880e;
        this.vip = z;
        this.metrica = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4463e)) {
            return false;
        }
        C4463e c4463e = (C4463e) obj;
        return this.ad == c4463e.ad && this.vip == c4463e.vip && this.metrica == c4463e.metrica;
    }

    public final int hashCode() {
        return (((this.ad.hashCode() * 31) + (this.vip ? 1231 : 1237)) * 31) + (this.metrica ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RowColumnChildSelector(type=");
        sb.append(this.ad);
        sb.append(", expandWidth=");
        sb.append(this.vip);
        sb.append(", expandHeight=");
        return AbstractC1786e.isVip(sb, this.metrica, ')');
    }
}
