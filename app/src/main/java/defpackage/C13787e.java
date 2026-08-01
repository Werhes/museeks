package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13787e {
    public final String ad;
    public final Map metrica;
    public final long vip;

    public C13787e(String str, long j, Map map) {
        this.ad = str;
        this.vip = j;
        this.metrica = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13787e)) {
            return false;
        }
        C13787e c13787e = (C13787e) obj;
        return AbstractC7890e.billing(this.ad, c13787e.ad) && this.vip == c13787e.vip && AbstractC7890e.billing(this.metrica, c13787e.metrica);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        long j = this.vip;
        return this.metrica.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.ad + ", timestamp=" + this.vip + ", additionalCustomKeys=" + this.metrica + ')';
    }
}
