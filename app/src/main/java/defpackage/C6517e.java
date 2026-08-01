package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٜ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6517e {
    public final int ad;
    public final int vip;

    public C6517e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6517e)) {
            return false;
        }
        C6517e c6517e = (C6517e) obj;
        return this.ad == c6517e.ad && this.vip == c6517e.vip;
    }

    public final int hashCode() {
        return (this.ad * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.ad);
        sb.append(", columnCount=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
