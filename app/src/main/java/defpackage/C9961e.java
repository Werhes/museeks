package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9961e {
    public final C4753e ad;
    public final ArrayList metrica;
    public final C4753e vip;

    public C9961e(C4753e c4753e, C4753e c4753e2, ArrayList arrayList) {
        if (c4753e == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.ad = c4753e;
        if (c4753e2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.vip = c4753e2;
        this.metrica = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9961e)) {
            return false;
        }
        C9961e c9961e = (C9961e) obj;
        return this.ad.equals(c9961e.ad) && this.vip.equals(c9961e.vip) && this.metrica.equals(c9961e.metrica);
    }

    public final int hashCode() {
        return ((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.ad + ", secondarySurfaceEdge=" + this.vip + ", outConfigs=" + this.metrica + "}";
    }
}
