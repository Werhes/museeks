package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٓؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13751e {
    public int ad;
    public Object appmetrica;
    public float license;
    public int metrica;
    public boolean vip;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    public static int ad(C17908e c17908e, boolean z) {
        return z ? ((C6564e) AbstractC13480e.m3570break(c17908e.smaato)).ad + 1 : ((C6564e) AbstractC13480e.m3591interface(c17908e.smaato)).ad - 1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, java.lang.Object] */
    public static int metrica(C17908e c17908e, boolean z) {
        EnumC17426e enumC17426e = EnumC17426e.f34146e;
        if (z) {
            C6564e c6564e = (C6564e) AbstractC13480e.m3570break(c17908e.smaato);
            return (c17908e.admob == enumC17426e ? c6564e.tapsense : c6564e.isVip) + 1;
        }
        C6564e c6564e2 = (C6564e) AbstractC13480e.m3591interface(c17908e.smaato);
        return (c17908e.admob == enumC17426e ? c6564e2.tapsense : c6564e2.isVip) - 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    public static int vip(C13648e c13648e, boolean z) {
        return z ? ((C3225e) AbstractC13480e.m3570break(c13648e.mopub)).ad + 1 : ((C3225e) AbstractC13480e.m3591interface(c13648e.mopub)).ad - 1;
    }
}
