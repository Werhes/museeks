package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5013e {
    public final C4170e ad;
    public final C4170e vip;

    public C5013e(C4170e c4170e, C4170e c4170e2) {
        this.ad = c4170e;
        this.vip = c4170e2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5013e) {
            C5013e c5013e = (C5013e) obj;
            if (this.ad.equals(c5013e.ad) && this.vip.equals(c5013e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.ad + ", secondaryOutConfig=" + this.vip + "}";
    }
}
