package defpackage;

import java.util.Collection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17911e {
    public final C16192e ad;
    public final boolean appmetrica;
    public final boolean license;
    public final boolean metrica;
    public final Collection vip;

    public C17911e(C16192e c16192e, Collection collection, int i) {
        this(c16192e, collection, c16192e.ad == EnumC7701e.f15626e, (i & 8) == 0, (i & 16) == 0);
    }

    public C17911e(C16192e c16192e, Collection collection, boolean z, boolean z2, boolean z3) {
        this.ad = c16192e;
        this.vip = collection;
        this.metrica = z;
        this.license = z2;
        this.appmetrica = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17911e)) {
            return false;
        }
        C17911e c17911e = (C17911e) obj;
        return AbstractC7890e.billing(this.ad, c17911e.ad) && AbstractC7890e.billing(this.vip, c17911e.vip) && this.metrica == c17911e.metrica && this.license == c17911e.license && this.appmetrica == c17911e.appmetrica;
    }

    public final int hashCode() {
        return ((((((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31) + (this.metrica ? 1231 : 1237)) * 31) + (this.license ? 1231 : 1237)) * 31) + (this.appmetrica ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.ad);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.vip);
        sb.append(", definitelyNotNull=");
        sb.append(this.metrica);
        sb.append(", preferQualifierOverBound=");
        sb.append(this.license);
        sb.append(", preferQualifierOverSupertype=");
        return AbstractC1786e.isVip(sb, this.appmetrica, ')');
    }
}
