package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5573e {
    public final float ad;
    public final AbstractC8835e vip;

    public C5573e(float f, AbstractC8835e abstractC8835e) {
        this.ad = f;
        this.vip = abstractC8835e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5573e)) {
            return false;
        }
        C5573e c5573e = (C5573e) obj;
        return Float.compare(this.ad, c5573e.ad) == 0 && AbstractC7890e.billing(this.vip, c5573e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (Float.floatToIntBits(this.ad) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.ad + ", feature=" + this.vip + ')';
    }
}
