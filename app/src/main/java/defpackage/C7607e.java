package defpackage;

import android.graphics.Point;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۦۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7607e {
    public final int ad;
    public final Point metrica;
    public final int vip;

    public C7607e(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.ad = i;
        this.vip = i2;
        this.metrica = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7607e) {
            C7607e c7607e = (C7607e) obj;
            if (this.ad == c7607e.ad && this.vip == c7607e.vip && this.metrica.equals(c7607e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (((this.ad * 31) + this.vip) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.ad;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.vip);
        sb.append(", center=");
        sb.append(this.metrica);
        sb.append('}');
        return sb.toString();
    }
}
