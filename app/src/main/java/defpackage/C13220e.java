package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13220e {
    public static final /* synthetic */ int metrica = 0;
    public static final long vip = AbstractC9931e.ad(0.5f, 0.5f);
    public final long ad;

    public static final boolean ad(long j, long j2) {
        return j == j2;
    }

    public static String license(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public static final float metrica(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float vip(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13220e) {
            return this.ad == ((C13220e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return license(this.ad);
    }
}
