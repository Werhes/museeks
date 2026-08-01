package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3897e implements InterfaceC2135e {
    public final List ad;
    public final ArrayList license;
    public final List metrica;
    public final List vip;

    public C3897e(List list, List list2, List list3, ArrayList arrayList) {
        this.ad = list;
        this.vip = list2;
        this.metrica = list3;
        this.license = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3897e)) {
            return false;
        }
        C3897e c3897e = (C3897e) obj;
        return AbstractC7890e.billing(this.ad, c3897e.ad) && AbstractC7890e.billing(this.vip, c3897e.vip) && AbstractC7890e.billing(this.metrica, c3897e.metrica) && this.license.equals(c3897e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + AbstractC17861e.billing(AbstractC17861e.billing(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica);
    }

    public final String toString() {
        return "Available(ips=" + this.ad + ", ipWeights=" + this.vip + ", allowedDomains=" + this.metrica + ", certificates=" + this.license + ')';
    }
}
