package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15369e {
    public final C1631e ad;
    public final C13070e metrica;
    public final List vip;

    public C15369e(C1631e c1631e, List list) {
        this.ad = c1631e;
        this.vip = list;
        this.metrica = new C13070e(list.size() + 1, new C0609e(29, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15369e)) {
            return false;
        }
        C15369e c15369e = (C15369e) obj;
        return AbstractC7890e.billing(this.ad, c15369e.ad) && AbstractC7890e.billing(this.vip, c15369e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChildStack(active=");
        sb.append(this.ad);
        sb.append(", backStack=");
        return AbstractC1786e.tapsense(sb, this.vip, ')');
    }
}
