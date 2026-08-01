package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10428e {
    public static final C8005e ad = new C8005e();

    static {
        int i = C3618e.mopub;
        int i2 = C3618e.mopub;
        int i3 = C3618e.mopub;
        int i4 = C13220e.metrica;
        C4616e[] c4616eArr = C12973e.vip;
        AbstractC13362e.startapp(14);
        AbstractC13362e.startapp(0);
        int i5 = C3618e.mopub;
        int i6 = C1812e.f4893e.f4894e;
        Unit unit = Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r7 < 0.5f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r7 < 0.5f) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.AbstractC4457e ad(defpackage.AbstractC4457e r1, long r2, defpackage.AbstractC4457e r4, long r5, float r7) {
        /*
            r0 = 0
            if (r1 != 0) goto L6
            if (r4 != 0) goto L6
            goto L51
        L6:
            if (r1 != 0) goto Le
            eۣۧ r1 = new eۣۧ
            r1.<init>(r2)
            goto L15
        Le:
            if (r4 != 0) goto L15
            eۣۧ r4 = new eۣۧ
            r4.<init>(r5)
        L15:
            boolean r2 = r1.equals(r4)
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r2 == 0) goto L22
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 >= 0) goto L46
            goto L49
        L22:
            boolean r2 = r1 instanceof defpackage.InterfaceC5606e
            if (r2 == 0) goto L2e
            r2 = r1
            eؘّۦ r2 = (defpackage.InterfaceC5606e) r2
            java.lang.Object r2 = r2.vip(r4, r7)
            goto L2f
        L2e:
            r2 = r0
        L2f:
            if (r2 != 0) goto L3f
            boolean r5 = r4 instanceof defpackage.InterfaceC5606e
            if (r5 == 0) goto L3f
            r2 = r4
            eؘّۦ r2 = (defpackage.InterfaceC5606e) r2
            r5 = 1
            float r5 = (float) r5
            float r5 = r5 - r7
            java.lang.Object r2 = r2.vip(r1, r5)
        L3f:
            if (r2 != 0) goto L48
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 >= 0) goto L46
            goto L49
        L46:
            r1 = r4
            goto L49
        L48:
            r1 = r2
        L49:
            boolean r2 = r1 instanceof defpackage.AbstractC4457e
            if (r2 == 0) goto L51
            eۣؖؒ r1 = (defpackage.AbstractC4457e) r1
            return r1
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10428e.ad(eۣؖؒ, long, eۣؖؒ, long, float):eۣؖؒ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object vip(float f, Object obj, Object obj2) {
        C4383e metrica;
        if (obj == null && obj2 == null) {
            return null;
        }
        boolean z = obj instanceof Object[];
        boolean z2 = obj2 instanceof Object[];
        if (!z && !z2) {
            C4383e c4383e = obj instanceof C4383e ? (C4383e) obj : null;
            C4383e c4383e2 = obj2 instanceof C4383e ? (C4383e) obj2 : null;
            if (c4383e == null && c4383e2 == null) {
                return null;
            }
            return c4383e == null ? AbstractC2356e.metrica(c4383e2.ad(), c4383e2, f) : c4383e2 == null ? AbstractC2356e.metrica(c4383e, c4383e.ad(), f) : AbstractC2356e.metrica(c4383e, c4383e2, f);
        }
        C4383e[] c4383eArr = z ? (C4383e[]) obj : new C4383e[]{obj};
        C4383e[] c4383eArr2 = z2 ? (C4383e[]) obj2 : new C4383e[]{obj2};
        int max = Math.max(c4383eArr.length, c4383eArr2.length);
        C4383e[] c4383eArr3 = new C4383e[max];
        for (int i = 0; i < max; i++) {
            c4383eArr3[i] = null;
        }
        for (int i2 = 0; i2 < max; i2++) {
            C4383e c4383e3 = (C4383e) AbstractC1660e.crashlytics(i2, c4383eArr);
            C4383e c4383e4 = (C4383e) AbstractC1660e.crashlytics(i2, c4383eArr2);
            if (c4383e3 == null && c4383e4 == null) {
                metrica = null;
            } else if (c4383e3 == null) {
                metrica = AbstractC2356e.metrica(c4383e4.ad(), c4383e4, f);
            } else {
                if (c4383e4 == null) {
                    c4383e4 = c4383e3.ad();
                }
                metrica = AbstractC2356e.metrica(c4383e3, c4383e4, f);
            }
            c4383eArr3[i2] = metrica;
        }
        return c4383eArr3;
    }
}
