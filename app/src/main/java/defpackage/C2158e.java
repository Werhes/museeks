package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۡۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2158e {
    public final int ad;
    public final Map metrica;
    public final int vip;

    public C2158e(int i, int i2, Map map) {
        this.ad = i;
        this.vip = i2;
        this.metrica = map;
    }

    public /* synthetic */ C2158e(int i, int i2, Map map, int i3) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? C9139e.f18290e : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2158e)) {
            return false;
        }
        C2158e c2158e = (C2158e) obj;
        return this.ad == c2158e.ad && this.vip == c2158e.vip && AbstractC7890e.billing(this.metrica, c2158e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (((this.ad * 31) + this.vip) * 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.ad + ", complexViewId=" + this.vip + ", children=" + this.metrica + ')';
    }
}
