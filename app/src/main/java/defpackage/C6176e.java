package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6176e {
    public final InterfaceC3832e ad;
    public final HashMap vip;

    public C6176e(InterfaceC3832e interfaceC3832e, HashMap hashMap) {
        this.ad = interfaceC3832e;
        this.vip = hashMap;
    }

    public final long ad(EnumC6651e enumC6651e, long j, int i) {
        long vip = j - this.ad.vip();
        C17600e c17600e = (C17600e) this.vip.get(enumC6651e);
        long j2 = c17600e.ad;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), vip), c17600e.vip);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6176e)) {
            return false;
        }
        C6176e c6176e = (C6176e) obj;
        return this.ad.equals(c6176e.ad) && this.vip.equals(c6176e.vip);
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.ad + ", values=" + this.vip + "}";
    }
}
