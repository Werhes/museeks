package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11811e {
    public final long ad;

    public static final int ad(long j, long j2) {
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    public static int vip(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11811e) {
            return this.ad == ((C11811e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return vip(this.ad);
    }

    public final String toString() {
        return "DurationNs(value=" + this.ad + ')';
    }
}
