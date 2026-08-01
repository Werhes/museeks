package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12774e {
    public final String ad;
    public final int metrica;
    public final int vip;

    public C12774e(String str, int i, int i2) {
        this.ad = str;
        this.vip = i;
        this.metrica = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12774e)) {
            return false;
        }
        C12774e c12774e = (C12774e) obj;
        return Objects.equals(this.ad, c12774e.ad) && this.vip == c12774e.vip && this.metrica == c12774e.metrica;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.vip);
        Integer valueOf2 = Integer.valueOf(this.metrica);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.ad, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.ad;
        sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
        sb.append(" displayWidth=");
        sb.append(this.vip);
        sb.append(" displayHeight=");
        return AbstractC17861e.smaato(this.metrica, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", sb);
    }
}
