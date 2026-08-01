package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؑۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12973e {
    public final long ad;
    public static final C4616e[] vip = {new C4616e(0), new C4616e(4294967296L), new C4616e(8589934592L)};
    public static final long metrica = AbstractC13362e.mopub(Float.NaN, 0);

    public /* synthetic */ C12973e(long j) {
        this.ad = j;
    }

    public static final boolean ad(long j, long j2) {
        return j == j2;
    }

    public static String appmetrica(long j) {
        long vip2 = vip(j);
        if (C4616e.ad(vip2, 0L)) {
            return "Unspecified";
        }
        if (C4616e.ad(vip2, 4294967296L)) {
            return metrica(j) + ".sp";
        }
        if (!C4616e.ad(vip2, 8589934592L)) {
            return "Invalid";
        }
        return metrica(j) + ".em";
    }

    public static int license(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final float metrica(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long vip(long j) {
        return vip[(int) ((j & 1095216660480L) >>> 32)].ad;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12973e) {
            return this.ad == ((C12973e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return license(this.ad);
    }

    public final String toString() {
        return appmetrica(this.ad);
    }
}
