package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16096e {
    public static final long ad;
    public static final /* synthetic */ int appmetrica = 0;
    public static final long license;
    public static final long metrica;
    public static final long vip;

    static {
        long j = 3;
        long j2 = j << 32;
        ad = (0 & 4294967295L) | j2;
        vip = (1 & 4294967295L) | j2;
        metrica = j2 | (2 & 4294967295L);
        license = (j & 4294967295L) | (4 << 32);
    }

    public static final boolean ad(long j, long j2) {
        return j == j2;
    }

    public static String vip(long j) {
        return ad(j, ad) ? "Rgb" : ad(j, vip) ? "Xyz" : ad(j, metrica) ? "Lab" : ad(j, license) ? "Cmyk" : "Unknown";
    }
}
