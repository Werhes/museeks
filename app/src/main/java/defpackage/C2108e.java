package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2108e {
    public final long ad;

    public /* synthetic */ C2108e(long j) {
        this.ad = j;
    }

    public static long ad(float f, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final float appmetrica(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final boolean billing(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static final float license(long j) {
        return Math.max(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float metrica(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float purchase(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String startapp(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC2270e.adcel(Float.intBitsToFloat((int) (j >> 32))) + ", " + AbstractC2270e.adcel(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final boolean vip(long j, long j2) {
        return j == j2;
    }

    public static final long yandex(float f, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2108e) {
            return this.ad == ((C2108e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return startapp(this.ad);
    }
}
