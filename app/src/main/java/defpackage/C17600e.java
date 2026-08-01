package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ٘ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17600e {
    public final long ad;
    public final Set metrica;
    public final long vip;

    public C17600e(long j, long j2, Set set) {
        this.ad = j;
        this.vip = j2;
        this.metrica = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17600e) {
            C17600e c17600e = (C17600e) obj;
            if (this.ad == c17600e.ad && this.vip == c17600e.vip && this.metrica.equals(c17600e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.vip;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.metrica.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.ad + ", maxAllowedDelay=" + this.vip + ", flags=" + this.metrica + "}";
    }
}
