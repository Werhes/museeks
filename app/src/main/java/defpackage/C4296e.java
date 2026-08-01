package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4296e {
    public final AbstractC1186e ad;
    public final List license;
    public final ArrayList metrica;
    public final List vip;

    public C4296e(AbstractC1186e abstractC1186e, List list, ArrayList arrayList, List list2) {
        this.ad = abstractC1186e;
        this.vip = list;
        this.metrica = arrayList;
        this.license = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4296e)) {
            return false;
        }
        C4296e c4296e = (C4296e) obj;
        return AbstractC7890e.billing(this.ad, c4296e.ad) && this.vip.equals(c4296e.vip) && this.metrica.equals(c4296e.metrica) && this.license.equals(c4296e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((((this.metrica.hashCode() + AbstractC17861e.billing(this.ad.hashCode() * 961, 31, this.vip)) * 31) + 1237) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MethodSignatureData(returnType=");
        sb.append(this.ad);
        sb.append(", receiverType=null, valueParameters=");
        sb.append(this.vip);
        sb.append(", typeParameters=");
        sb.append(this.metrica);
        sb.append(", hasStableParameterNames=false, errors=");
        return AbstractC1786e.tapsense(sb, this.license, ')');
    }
}
