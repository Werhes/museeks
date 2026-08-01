package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6934e {
    public final List ad;
    public final int vip;

    public C6934e(int i, List list) {
        this.ad = list;
        this.vip = i;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6934e)) {
            return false;
        }
        C6934e c6934e = (C6934e) obj;
        return AbstractC7890e.billing(this.ad, c6934e.ad) && this.vip == c6934e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChildPages(items=");
        sb.append(this.ad);
        sb.append(", selectedIndex=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
