package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1103e {
    public final long ad;

    public static String ad(long j) {
        return "TimestampNs(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1103e) {
            return this.ad == ((C1103e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return ad(this.ad);
    }
}
