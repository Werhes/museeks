package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2356e {
    public static final C13023e ad = new C13023e(8);

    public static C9689e ad(C8763e c8763e) {
        return AbstractC5750e.purchase(new C0211e(17, c8763e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r15 < 0.5f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x005a, code lost:
    
        if (r15 < 0.5f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0081, code lost:
    
        r7 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C4383e metrica(defpackage.C4383e r13, defpackage.C4383e r14, float r15) {
        /*
            eؖۛ۟ r0 = new eؖۛ۟
            float r1 = r13.ad
            float r2 = r14.ad
            float r1 = defpackage.AbstractC15842e.startapp(r1, r2, r15)
            float r2 = r13.vip
            float r3 = r14.vip
            float r2 = defpackage.AbstractC15842e.startapp(r2, r3, r15)
            long r3 = r13.metrica
            long r5 = r14.metrica
            float r7 = defpackage.C8163e.ad(r3)
            float r8 = defpackage.C8163e.ad(r5)
            float r7 = defpackage.AbstractC15842e.startapp(r7, r8, r15)
            float r3 = defpackage.C8163e.vip(r3)
            float r4 = defpackage.C8163e.vip(r5)
            float r3 = defpackage.AbstractC15842e.startapp(r3, r4, r15)
            int r4 = java.lang.Float.floatToRawIntBits(r7)
            long r4 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r3
            r3 = 32
            long r3 = r4 << r3
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            long r3 = r3 | r6
            long r5 = r13.appmetrica
            long r7 = r14.appmetrica
            long r5 = defpackage.AbstractC6532e.isVip(r5, r7, r15)
            eۣؖؒ r7 = r13.purchase
            eۣؖؒ r8 = r14.purchase
            boolean r9 = defpackage.AbstractC7890e.billing(r7, r8)
            r10 = 0
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r9 == 0) goto L5d
            int r9 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r9 >= 0) goto L81
            goto L84
        L5d:
            boolean r9 = r7 instanceof defpackage.InterfaceC5606e
            if (r9 == 0) goto L69
            r9 = r7
            eؘّۦ r9 = (defpackage.InterfaceC5606e) r9
            java.lang.Object r9 = r9.vip(r8, r15)
            goto L6a
        L69:
            r9 = r10
        L6a:
            if (r9 != 0) goto L7a
            boolean r12 = r8 instanceof defpackage.InterfaceC5606e
            if (r12 == 0) goto L7a
            r9 = r8
            eؘّۦ r9 = (defpackage.InterfaceC5606e) r9
            r12 = 1
            float r12 = (float) r12
            float r12 = r12 - r15
            java.lang.Object r9 = r9.vip(r7, r12)
        L7a:
            if (r9 != 0) goto L83
            int r9 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r9 >= 0) goto L81
            goto L84
        L81:
            r7 = r8
            goto L84
        L83:
            r7 = r9
        L84:
            boolean r8 = r7 instanceof defpackage.AbstractC4457e
            if (r8 == 0) goto L8b
            r10 = r7
            eۣؖؒ r10 = (defpackage.AbstractC4457e) r10
        L8b:
            r7 = r10
            float r8 = r13.billing
            float r9 = r14.billing
            float r8 = defpackage.AbstractC15842e.startapp(r8, r9, r15)
            int r15 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r15 >= 0) goto L9c
            int r13 = r13.license
        L9a:
            r9 = r13
            goto L9f
        L9c:
            int r13 = r14.license
            goto L9a
        L9f:
            r0.<init>(r1, r2, r3, r5, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2356e.metrica(eؖۛ۟, eؖۛ۟, float):eؖۛ۟");
    }

    public static final void vip(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "Expected positive parallelism level, but got ").toString());
        }
    }
}
