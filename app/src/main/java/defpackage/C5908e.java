package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۛۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5908e {
    public final C3087e ad;
    public final int vip;

    public C5908e(C3087e c3087e, int i) {
        this.ad = c3087e;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5908e)) {
            return false;
        }
        C5908e c5908e = (C5908e) obj;
        return AbstractC7890e.billing(this.ad, c5908e.ad) && this.vip == c5908e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        return "DivisionResult(quotient=" + this.ad + ", remainder=" + ((Object) String.valueOf(this.vip & 4294967295L)) + ')';
    }
}
