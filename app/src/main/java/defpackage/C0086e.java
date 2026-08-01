package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086e {
    public static final C0086e billing = new C0086e(null, 0, null, false, false, false, 127);
    public final InterfaceC14517e ad;
    public final boolean appmetrica;
    public final boolean license;
    public final List metrica;
    public final boolean purchase;
    public final long vip;

    public C0086e(InterfaceC14517e interfaceC14517e, long j, List list, boolean z, boolean z2, boolean z3, int i) {
        interfaceC14517e = (i & 1) != 0 ? C2406e.ad : interfaceC14517e;
        j = (i & 2) != 0 ? 0L : j;
        list = (i & 4) != 0 ? C13664e.f27089e : list;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        z3 = (i & 32) != 0 ? false : z3;
        this.ad = interfaceC14517e;
        this.vip = j;
        this.metrica = list;
        this.license = z;
        this.appmetrica = z2;
        this.purchase = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0086e)) {
            return false;
        }
        C0086e c0086e = (C0086e) obj;
        return AbstractC7890e.billing(this.ad, c0086e.ad) && this.vip == c0086e.vip && AbstractC7890e.billing(this.metrica, c0086e.metrica) && this.license == c0086e.license && this.appmetrica == c0086e.appmetrica && this.purchase == c0086e.purchase;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        long j = this.vip;
        return ((((((AbstractC17861e.billing((hashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.metrica) + (this.license ? 1231 : 1237)) * 31) + (this.appmetrica ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237)) * 31) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchParameters(startingEntrypoint=");
        sb.append(this.ad);
        sb.append(", startingPosition=");
        sb.append(this.vip);
        sb.append(", tracks=");
        sb.append(this.metrica);
        sb.append(", cancelOnSourceEquality=");
        sb.append(this.license);
        sb.append(", ignoreSourceReloadOptimizations=");
        sb.append(this.appmetrica);
        sb.append(", shuffle=");
        return AbstractC8703e.signatures(sb, this.purchase, ", loadEverything=false)");
    }
}
