package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَؘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9368e {
    public final Set ad;
    public final Map vip;

    public /* synthetic */ C9368e() {
        this(C3295e.f7451e, C9139e.f18290e);
    }

    public C9368e(Set set, Map map) {
        this.ad = set;
        this.vip = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9368e)) {
            return false;
        }
        C9368e c9368e = (C9368e) obj;
        return AbstractC7890e.billing(this.ad, c9368e.ad) && AbstractC7890e.billing(this.vip, c9368e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "ValidatedData(dynamicRanges=" + this.ad + ", qualityToSizeMap=" + this.vip + ')';
    }
}
