package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8060e {
    public final float ad;
    public final C5573e metrica;
    public final C5573e vip;

    public C8060e(float f, C5573e c5573e, C5573e c5573e2) {
        this.ad = f;
        this.vip = c5573e;
        this.metrica = c5573e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8060e)) {
            return false;
        }
        C8060e c8060e = (C8060e) obj;
        return Float.compare(this.ad, c8060e.ad) == 0 && AbstractC7890e.billing(this.vip, c8060e.vip) && AbstractC7890e.billing(this.metrica, c8060e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((this.vip.hashCode() + (Float.floatToIntBits(this.ad) * 31)) * 31);
    }

    public final String toString() {
        return "DistanceVertex(distance=" + this.ad + ", f1=" + this.vip + ", f2=" + this.metrica + ')';
    }
}
