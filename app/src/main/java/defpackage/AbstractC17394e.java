package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۥٌ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17394e {
    public static final C5015e ad = new C5015e(new C10673e(1));
    public static final C13946e appmetrica;
    public static final C13946e license;
    public static final C6144e metrica;
    public static final C13946e purchase;
    public static final C6144e vip;

    static {
        long j = C3618e.adcel;
        vip = new C6144e(Float.NaN, j, true);
        metrica = new C6144e(Float.NaN, j, false);
        license = new C13946e(0.16f, 0.24f, 0.08f, 0.24f);
        appmetrica = new C13946e(0.08f, 0.12f, 0.04f, 0.12f);
        purchase = new C13946e(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static C6144e ad(int i, float f) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = C3618e.adcel;
        return (C15765e.vip(f, Float.NaN) && C3618e.metrica(j, j)) ? z ? vip : metrica : new C6144e(f, j, z);
    }
}
