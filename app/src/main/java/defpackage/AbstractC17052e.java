package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17052e {
    public static final C5015e ad = new C5015e(new C10673e(0));
    public static final C13822e metrica;
    public static final C13822e vip;

    static {
        long j = C3618e.adcel;
        vip = new C13822e(Float.NaN, j, true);
        metrica = new C13822e(Float.NaN, j, false);
    }

    public static C13822e ad(float f, int i, long j, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = C3618e.adcel;
        }
        return (C15765e.vip(f, Float.NaN) && C3618e.metrica(j, C3618e.adcel)) ? z ? vip : metrica : new C13822e(f, j, z);
    }
}
