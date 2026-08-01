package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16855e {
    public final String ad;
    public final double metrica;
    public final List vip;

    public C16855e(String str, List list) {
        Double d;
        Object obj;
        String str2;
        Double billing;
        this.ad = str;
        this.vip = list;
        Iterator it = list.iterator();
        while (true) {
            d = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (AbstractC7890e.billing(((C4839e) obj).ad, "q")) {
                    break;
                }
            }
        }
        C4839e c4839e = (C4839e) obj;
        double d2 = 1.0d;
        if (c4839e != null && (str2 = c4839e.vip) != null && (billing = AbstractC17414e.billing(str2)) != null) {
            double doubleValue = billing.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                d = billing;
            }
            if (d != null) {
                d2 = d.doubleValue();
            }
        }
        this.metrica = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16855e)) {
            return false;
        }
        C16855e c16855e = (C16855e) obj;
        return AbstractC7890e.billing(this.ad, c16855e.ad) && AbstractC7890e.billing(this.vip, c16855e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValue(value=");
        sb.append(this.ad);
        sb.append(", params=");
        return AbstractC1786e.tapsense(sb, this.vip, ')');
    }
}
