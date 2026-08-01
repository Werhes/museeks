package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۙٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16466e {
    public final int ad;
    public final int license;
    public final int metrica;
    public final int vip;

    static {
        new C16466e(0, 0, 0, 0);
    }

    public C16466e(int i, int i2, int i3, int i4) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = i4;
        if (i > i3) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i, i3, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i2 > i4) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public C16466e(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C16466e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C16466e c16466e = (C16466e) obj;
        return this.ad == c16466e.ad && this.vip == c16466e.vip && this.metrica == c16466e.metrica && this.license == c16466e.license;
    }

    public final int hashCode() {
        return (((((this.ad * 31) + this.vip) * 31) + this.metrica) * 31) + this.license;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C16466e.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.ad);
        sb.append(',');
        sb.append(this.vip);
        sb.append(',');
        sb.append(this.metrica);
        sb.append(',');
        return AbstractC17861e.smaato(this.license, "] }", sb);
    }
}
