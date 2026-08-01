package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088e {
    public final int ad;
    public final C12040e vip;

    public C0088e(int i, C12040e c12040e) {
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        this.ad = i;
        this.vip = c12040e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0088e)) {
            return false;
        }
        C0088e c0088e = (C0088e) obj;
        C12040e c12040e = c0088e.vip;
        if (!AbstractC8703e.adcel(this.ad, c0088e.ad)) {
            return false;
        }
        C12040e c12040e2 = this.vip;
        return c12040e2 == null ? c12040e == null : c12040e2.equals(c12040e);
    }

    public final int hashCode() {
        int m2467class = (AbstractC8703e.m2467class(this.ad) ^ 1000003) * 1000003;
        C12040e c12040e = this.vip;
        return m2467class ^ (c12040e == null ? 0 : c12040e.hashCode());
    }

    public final String toString() {
        return "CameraState{type=" + AbstractC17861e.ads(this.ad) + ", error=" + this.vip + "}";
    }
}
