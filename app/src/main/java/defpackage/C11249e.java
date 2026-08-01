package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۚٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11249e {
    public float ad = 0.0f;
    public boolean vip = true;
    public AbstractC11750e metrica = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11249e)) {
            return false;
        }
        C11249e c11249e = (C11249e) obj;
        return Float.compare(this.ad, c11249e.ad) == 0 && this.vip == c11249e.vip && AbstractC7890e.billing(this.metrica, c11249e.metrica);
    }

    public final int hashCode() {
        int floatToIntBits = ((Float.floatToIntBits(this.ad) * 31) + (this.vip ? 1231 : 1237)) * 31;
        AbstractC11750e abstractC11750e = this.metrica;
        return (floatToIntBits + (abstractC11750e == null ? 0 : abstractC11750e.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.ad + ", fill=" + this.vip + ", crossAxisAlignment=" + this.metrica + ", flowLayoutData=null)";
    }
}
