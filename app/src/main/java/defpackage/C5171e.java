package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۜٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5171e {
    public final long ad;
    public final C16611e metrica;
    public final C7869e vip;

    public C5171e(long j, C7869e c7869e, C16611e c16611e) {
        this.ad = j;
        this.vip = c7869e;
        this.metrica = c16611e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5171e) {
            C5171e c5171e = (C5171e) obj;
            if (this.ad == c5171e.ad && this.vip.equals(c5171e.vip) && this.metrica.equals(c5171e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.ad + ", transportContext=" + this.vip + ", event=" + this.metrica + "}";
    }
}
