package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3546e {
    public final C1622e ad;
    public final double vip;

    public C3546e(C1622e c1622e, double d) {
        this.ad = c1622e;
        this.vip = d;
        if (0.0d > d || d > 1.0d) {
            throw new IllegalArgumentException(("Quality should be in range [0, 1]: " + d).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3546e)) {
            return false;
        }
        C3546e c3546e = (C3546e) obj;
        return AbstractC7890e.billing(this.ad, c3546e.ad) && Double.compare(this.vip, c3546e.vip) == 0;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.vip);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "ContentTypeWithQuality(contentType=" + this.ad + ", quality=" + this.vip + ')';
    }
}
