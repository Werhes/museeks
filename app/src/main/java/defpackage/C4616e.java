package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4616e {
    public final long ad;

    public static final boolean ad(long j, long j2) {
        return j == j2;
    }

    public static String vip(long j) {
        return ad(j, 0L) ? "Unspecified" : ad(j, 4294967296L) ? "Sp" : ad(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4616e) {
            return this.ad == ((C4616e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return vip(this.ad);
    }
}
