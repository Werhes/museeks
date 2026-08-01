package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؐٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6104e {
    public C0632e ad;
    public String vip;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6104e)) {
            return false;
        }
        C6104e c6104e = (C6104e) obj;
        return AbstractC7890e.billing(this.ad, c6104e.ad) && AbstractC7890e.billing(this.vip, c6104e.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.ad);
        sb.append(", typeFlexibilityId=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
