package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14191e {
    public final C16466e ad;
    public final float vip;

    public C14191e(Rect rect, float f) {
        this(new C16466e(rect), f);
    }

    public C14191e(C16466e c16466e, float f) {
        this.ad = c16466e;
        this.vip = f;
    }

    public final Rect ad() {
        C16466e c16466e = this.ad;
        c16466e.getClass();
        return new Rect(c16466e.ad, c16466e.vip, c16466e.metrica, c16466e.license);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C14191e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C14191e c14191e = (C14191e) obj;
        return AbstractC7890e.billing(this.ad, c14191e.ad) && this.vip == c14191e.vip;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.vip) + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.ad);
        sb.append(", density=");
        return AbstractC17861e.remoteconfig(sb, this.vip, ')');
    }
}
