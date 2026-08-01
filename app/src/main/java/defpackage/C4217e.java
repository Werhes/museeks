package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4217e {
    public final int ad;
    public final int vip;

    public C4217e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4217e)) {
            return false;
        }
        C4217e c4217e = (C4217e) obj;
        return this.ad == c4217e.ad && this.vip == c4217e.vip;
    }

    public final int hashCode() {
        return AbstractC8703e.m2467class(this.vip) + (AbstractC8703e.m2467class(this.ad) * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + AbstractC1414e.signatures(this.ad) + ", endAffinity=" + AbstractC1414e.signatures(this.vip) + ')';
    }
}
