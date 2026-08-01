package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12195e {
    public final C4753e ad;
    public final List vip;

    public C12195e(C4753e c4753e, List list) {
        if (c4753e == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.ad = c4753e;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.vip = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12195e) {
            C12195e c12195e = (C12195e) obj;
            if (this.ad.equals(c12195e.ad) && this.vip.equals(c12195e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode();
    }

    public final String toString() {
        return "In{surfaceEdge=" + this.ad + ", outConfigs=" + this.vip + "}";
    }
}
