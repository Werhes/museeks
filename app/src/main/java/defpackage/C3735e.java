package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۥؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3735e extends Cpackage {
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, eُؖ٘] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, eُؖ٘] */
    @Override // defpackage.Cpackage
    /* renamed from: eٖؒۘ, reason: contains not printable characters */
    public final int mo1396e(String str, String str2, C12642e c12642e) {
        long round;
        String mo4378apply = c12642e.mo4378apply(str);
        String mo4378apply2 = c12642e.mo4378apply(str2);
        int length = mo4378apply.length();
        int length2 = mo4378apply2.length();
        if (length == 0 || length2 == 0) {
            return 0;
        }
        int round2 = (int) Math.round(AbstractC12900e.metrica(mo4378apply, mo4378apply2) * 100.0d);
        double max = Math.max(length, length2) / Math.min(length, length2);
        boolean z = max >= 1.5d;
        double d = max > 8.0d ? 0.6d : 0.9d;
        if (z) {
            int i = 6;
            ?? obj = new Object();
            AbstractC17953e abstractC17953e = new AbstractC17953e();
            double[] dArr = {round2, new C11993e(i).mo2359e(mo4378apply, mo4378apply2) * d, new C11993e(i).mo2359e(AbstractC14408e.m3800e(mo4378apply, obj), AbstractC14408e.m3800e(mo4378apply2, obj)) * 0.95d * d, abstractC17953e.mo3408e(mo4378apply, mo4378apply2, new C11993e(i), (C12642e) abstractC17953e.f36443e) * 0.95d * d};
            double d2 = dArr[0];
            for (int i2 = 0; i2 < 4; i2++) {
                double d3 = dArr[i2];
                if (d3 > d2) {
                    d2 = d3;
                }
            }
            round = Math.round(d2);
        } else {
            ?? obj2 = new Object();
            AbstractC17953e abstractC17953e2 = new AbstractC17953e();
            double[] dArr2 = {round2, ((int) Math.round(AbstractC12900e.metrica(AbstractC14408e.m3800e(mo4378apply, obj2), AbstractC14408e.m3800e(mo4378apply2, obj2)) * 100.0d)) * 0.95d, abstractC17953e2.mo3408e(mo4378apply, mo4378apply2, new C7936e(8), (C12642e) abstractC17953e2.f36443e) * 0.95d};
            double d4 = dArr2[0];
            for (int i3 = 0; i3 < 3; i3++) {
                double d5 = dArr2[i3];
                if (d5 > d4) {
                    d4 = d5;
                }
            }
            round = Math.round(d4);
        }
        return (int) round;
    }
}
