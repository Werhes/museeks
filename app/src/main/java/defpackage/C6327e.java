package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6327e {
    public final int ad;
    public final int vip;

    public C6327e(int i, int i2) {
        AbstractC2301e.billing(i <= i2);
        this.ad = i;
        this.vip = i2;
    }

    public final boolean ad(int i) {
        return this.ad <= i && i <= this.vip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6327e.class != obj.getClass()) {
            return false;
        }
        C6327e c6327e = (C6327e) obj;
        return this.ad == c6327e.ad && this.vip == c6327e.vip;
    }

    public final int hashCode() {
        return ((527 + this.ad) * 31) + this.vip;
    }

    public final String toString() {
        C12894e billing = AbstractC1749e.billing(this);
        billing.ad(this.ad, "lowerBounds");
        billing.ad(this.vip, "upperBounds");
        return billing.toString();
    }
}
