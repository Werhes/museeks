package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۥؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11376e {
    public final Map ad;
    public final int vip;

    public C11376e(int i, Map map) {
        this.ad = map;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11376e)) {
            return false;
        }
        C11376e c11376e = (C11376e) obj;
        return AbstractC7890e.billing(this.ad, c11376e.ad) && this.vip == c11376e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb.append(this.ad);
        sb.append(", maxSupportedFrameRate=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
