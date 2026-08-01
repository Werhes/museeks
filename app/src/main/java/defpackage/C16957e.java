package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16957e {
    public final List ad;
    public final int vip;

    public C16957e() {
        this(-1, C13664e.f27089e);
    }

    public C16957e(int i, List list) {
        this.ad = list;
        this.vip = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder premium = AbstractC4653e.premium("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '");
        premium.append(AbstractC6874e.purchase(list));
        premium.append("'.");
        throw new IllegalArgumentException(premium.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16957e.class != obj.getClass()) {
            return false;
        }
        C16957e c16957e = (C16957e) obj;
        return this.vip == c16957e.vip && AbstractC7890e.billing(this.ad, c16957e.ad);
    }

    public final int hashCode() {
        return this.ad.hashCode() + (this.vip * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEventHistory(currentIndex=");
        sb.append(this.vip);
        sb.append(", mergedHistory=");
        return AbstractC1786e.tapsense(sb, this.ad, ')');
    }
}
