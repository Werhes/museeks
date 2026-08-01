package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۘؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8163e {
    public final long ad;

    public static final float ad(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String metrica(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C15765e.metrica(ad(j))) + ", " + ((Object) C15765e.metrica(vip(j))) + ')';
    }

    public static final float vip(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8163e) {
            return this.ad == ((C8163e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return metrica(this.ad);
    }
}
