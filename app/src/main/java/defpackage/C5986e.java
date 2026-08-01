package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5986e {
    public final boolean ad;
    public final boolean vip;

    public C5986e(boolean z, boolean z2) {
        this.ad = z;
        this.vip = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5986e)) {
            return false;
        }
        C5986e c5986e = (C5986e) obj;
        return this.ad == c5986e.ad && this.vip == c5986e.vip;
    }

    public final int hashCode() {
        return ((this.ad ? 1231 : 1237) * 31) + (this.vip ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidationCriteria(checkBack=");
        sb.append(this.ad);
        sb.append(", checkFront=");
        return AbstractC1786e.isVip(sb, this.vip, ')');
    }
}
