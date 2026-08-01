package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14260e {
    public static final C14260e ad = new Object();
    public static final C1615e vip = AbstractC9180e.metrica(new C4532e(null, null, 0, 0, false));
    public static final InterfaceC0077e[] metrica = {new C9438e(0), new C13025e(), new C9438e(1), new Object()};

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (((defpackage.C4532e) r15.getValue()).appmetrica == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        r1 = r15.getValue();
        r3 = defpackage.C4532e.ad((defpackage.C4532e) r1, null, null, 0, r13 / 1000, false, 7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r15.mopub(r1, r3) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        r15 = new java.util.ArrayList();
        r1 = defpackage.C14260e.metrica;
        r4 = r1.length;
        r5 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r6 >= r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        r7 = r1[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if (r7.vip(r3) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        r15.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        r15 = r15.iterator();
        r1 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(long r13, defpackage.AbstractC10731e r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.C12084e
            if (r0 == 0) goto L13
            r0 = r15
            eِۤٚ r0 = (defpackage.C12084e) r0
            int r1 = r0.f24214e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24214e = r1
            goto L18
        L13:
            eِۤٚ r0 = new eِۤٚ
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f24215e
            int r1 = r0.f24214e
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            int r13 = r0.f24218e
            long r3 = r0.f24216e
            java.util.Iterator r14 = r0.f24219e
            eؖۧۥ r1 = r0.f24213e
            defpackage.AbstractC2003e.purchase(r15)
            r5 = r13
            r15 = r14
            r13 = r3
            goto L8a
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            defpackage.AbstractC2003e.purchase(r15)
            eِۜؓ r15 = defpackage.C11999e.ad
            boolean r15 = r15.ad()
            if (r15 == 0) goto Lac
            eؓؗ r15 = defpackage.C14260e.vip
            java.lang.Object r1 = r15.getValue()
            eؖۧۥ r1 = (defpackage.C4532e) r1
            boolean r1 = r1.appmetrica
            if (r1 != 0) goto L50
            goto Lac
        L50:
            java.lang.Object r1 = r15.getValue()
            r3 = r1
            eؖۧۥ r3 = (defpackage.C4532e) r3
            r4 = 1000(0x3e8, double:4.94E-321)
            long r8 = r13 / r4
            r10 = 0
            r11 = 7
            r4 = 0
            r5 = 0
            r6 = 0
            eؖۧۥ r3 = defpackage.C4532e.ad(r3, r4, r5, r6, r8, r10, r11)
            boolean r1 = r15.mopub(r1, r3)
            if (r1 == 0) goto L50
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            eؑؔۥ[] r1 = defpackage.C14260e.metrica
            int r4 = r1.length
            r5 = 0
            r6 = r5
        L75:
            if (r6 >= r4) goto L85
            r7 = r1[r6]
            boolean r8 = r7.vip(r3)
            if (r8 == 0) goto L82
            r15.add(r7)
        L82:
            int r6 = r6 + 1
            goto L75
        L85:
            java.util.Iterator r15 = r15.iterator()
            r1 = r3
        L8a:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto La9
            java.lang.Object r3 = r15.next()
            eؑؔۥ r3 = (defpackage.InterfaceC0077e) r3
            r0.f24213e = r1
            r0.f24219e = r15
            r0.f24216e = r13
            r0.f24218e = r5
            r0.f24214e = r2
            java.lang.Object r3 = r3.license(r1, r0)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r3 != r4) goto L8a
            return r4
        La9:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        Lac:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14260e.ad(long, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(defpackage.C14609e r18, long r19, defpackage.EnumC15342e r21, defpackage.AbstractC10731e r22) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14260e.appmetrica(eٌٔۤ, long, eٌٕٔ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(defpackage.InterfaceC1686e r14, defpackage.AbstractC10731e r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.C3077e
            if (r0 == 0) goto L13
            r0 = r15
            eؘؕؒ r0 = (defpackage.C3077e) r0
            int r1 = r0.f7148e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7148e = r1
            goto L18
        L13:
            eؘؕؒ r0 = new eؘؕؒ
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f7149e
            int r1 = r0.f7148e
            eؓؗ r2 = defpackage.C14260e.vip
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            int r14 = r0.f7150e
            java.util.Iterator r1 = r0.f7145e
            eؖۧۥ r4 = r0.f7147e
            defpackage.AbstractC2003e.purchase(r15)
            goto L89
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            defpackage.AbstractC2003e.purchase(r15)
            eِۜؓ r15 = defpackage.C11999e.ad
            boolean r15 = r15.ad()
            if (r15 != 0) goto L43
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L43:
            java.lang.Object r15 = r2.getValue()
            r4 = r15
            eؖۧۥ r4 = (defpackage.C4532e) r4
            r11 = 0
            r12 = 29
            r5 = 0
            r7 = 0
            r9 = 0
            r6 = r14
            eؖۧۥ r14 = defpackage.C4532e.ad(r4, r5, r6, r7, r9, r11, r12)
            boolean r14 = r2.mopub(r15, r14)
            if (r14 == 0) goto Laf
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            eؑؔۥ[] r15 = defpackage.C14260e.metrica
            int r1 = r15.length
            r5 = 0
            r6 = r5
        L67:
            if (r6 >= r1) goto L83
            r7 = r15[r6]
            boolean r8 = r7.vip(r4)
            if (r8 != 0) goto L7d
            java.lang.Object r8 = r2.getValue()
            eؖۧۥ r8 = (defpackage.C4532e) r8
            boolean r8 = r7.vip(r8)
            if (r8 == 0) goto L80
        L7d:
            r14.add(r7)
        L80:
            int r6 = r6 + 1
            goto L67
        L83:
            java.util.Iterator r14 = r14.iterator()
            r1 = r14
            r14 = r5
        L89:
            boolean r15 = r1.hasNext()
            if (r15 == 0) goto Lac
            java.lang.Object r15 = r1.next()
            eؑؔۥ r15 = (defpackage.InterfaceC0077e) r15
            java.lang.Object r5 = r2.getValue()
            eؖۧۥ r5 = (defpackage.C4532e) r5
            r0.f7147e = r4
            r0.f7145e = r1
            r0.f7150e = r14
            r0.f7148e = r3
            java.lang.Object r15 = r15.ad(r5, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r15 != r5) goto L89
            return r5
        Lac:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        Laf:
            r14 = r6
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14260e.license(eًؓ۠, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (((defpackage.C4532e) r15.getValue()).appmetrica != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        r1 = r15.getValue();
        r3 = defpackage.C4532e.ad((defpackage.C4532e) r1, null, null, 0, r13 / 1000, true, 7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r15.mopub(r1, r3) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        r15 = new java.util.ArrayList();
        r1 = defpackage.C14260e.metrica;
        r4 = r1.length;
        r5 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r6 >= r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        r7 = r1[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if (r7.vip(r3) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        r15.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        r15 = r15.iterator();
        r1 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(long r13, defpackage.AbstractC10731e r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.C8536e
            if (r0 == 0) goto L13
            r0 = r15
            eٌؙۣ r0 = (defpackage.C8536e) r0
            int r1 = r0.f17333e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17333e = r1
            goto L18
        L13:
            eٌؙۣ r0 = new eٌؙۣ
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f17334e
            int r1 = r0.f17333e
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            int r13 = r0.f17337e
            long r3 = r0.f17335e
            java.util.Iterator r14 = r0.f17338e
            eؖۧۥ r1 = r0.f17332e
            defpackage.AbstractC2003e.purchase(r15)
            r5 = r13
            r15 = r14
            r13 = r3
            goto L8a
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            defpackage.AbstractC2003e.purchase(r15)
            eِۜؓ r15 = defpackage.C11999e.ad
            boolean r15 = r15.ad()
            if (r15 == 0) goto Lac
            eؓؗ r15 = defpackage.C14260e.vip
            java.lang.Object r1 = r15.getValue()
            eؖۧۥ r1 = (defpackage.C4532e) r1
            boolean r1 = r1.appmetrica
            if (r1 == 0) goto L50
            goto Lac
        L50:
            java.lang.Object r1 = r15.getValue()
            r3 = r1
            eؖۧۥ r3 = (defpackage.C4532e) r3
            r4 = 1000(0x3e8, double:4.94E-321)
            long r8 = r13 / r4
            r10 = 1
            r11 = 7
            r4 = 0
            r5 = 0
            r6 = 0
            eؖۧۥ r3 = defpackage.C4532e.ad(r3, r4, r5, r6, r8, r10, r11)
            boolean r1 = r15.mopub(r1, r3)
            if (r1 == 0) goto L50
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            eؑؔۥ[] r1 = defpackage.C14260e.metrica
            int r4 = r1.length
            r5 = 0
            r6 = r5
        L75:
            if (r6 >= r4) goto L85
            r7 = r1[r6]
            boolean r8 = r7.vip(r3)
            if (r8 == 0) goto L82
            r15.add(r7)
        L82:
            int r6 = r6 + 1
            goto L75
        L85:
            java.util.Iterator r15 = r15.iterator()
            r1 = r3
        L8a:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto La9
            java.lang.Object r3 = r15.next()
            eؑؔۥ r3 = (defpackage.InterfaceC0077e) r3
            r0.f17332e = r1
            r0.f17338e = r15
            r0.f17335e = r13
            r0.f17337e = r5
            r0.f17333e = r2
            java.lang.Object r3 = r3.purchase(r1, r0)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r3 != r4) goto L8a
            return r4
        La9:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        Lac:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14260e.metrica(long, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(long r18, defpackage.EnumC4345e r20, defpackage.AbstractC10731e r21) {
        /*
            r17 = this;
            r0 = r21
            boolean r1 = r0 instanceof defpackage.C6110e
            if (r1 == 0) goto L17
            r1 = r0
            eؙؐۨ r1 = (defpackage.C6110e) r1
            int r2 = r1.f12834e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f12834e = r2
            r2 = r17
            goto L1e
        L17:
            eؙؐۨ r1 = new eؙؐۨ
            r2 = r17
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.f12836e
            int r3 = r1.f12834e
            eؓؗ r4 = defpackage.C14260e.vip
            r5 = 1
            if (r3 == 0) goto L45
            if (r3 != r5) goto L3d
            int r3 = r1.f12833e
            long r6 = r1.f12835e
            java.util.Iterator r8 = r1.f12837e
            eؖۧۥ r9 = r1.f12838e
            eٌؖۙ r10 = r1.f12831e
            defpackage.AbstractC2003e.purchase(r0)
            r15 = r6
            r6 = r1
            r0 = r15
            r7 = r8
            r8 = r3
            r3 = r10
            goto L9a
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L45:
            defpackage.AbstractC2003e.purchase(r0)
            eِۜؓ r0 = defpackage.C11999e.ad
            boolean r0 = r0.ad()
            if (r0 != 0) goto L53
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L53:
            java.lang.Object r0 = r4.getValue()
            r6 = r0
            eؖۧۥ r6 = (defpackage.C4532e) r6
            r7 = 1000(0x3e8, double:4.94E-321)
            long r11 = r18 / r7
            r13 = 0
            r14 = 23
            r7 = 0
            r8 = 0
            r9 = 0
            eؖۧۥ r3 = defpackage.C4532e.ad(r6, r7, r8, r9, r11, r13, r14)
            boolean r0 = r4.mopub(r0, r3)
            if (r0 == 0) goto L53
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            eؑؔۥ[] r3 = defpackage.C14260e.metrica
            int r7 = r3.length
            r8 = 0
            r9 = r8
        L79:
            if (r9 >= r7) goto L8f
            r10 = r3[r9]
            java.lang.Object r11 = r4.getValue()
            eؖۧۥ r11 = (defpackage.C4532e) r11
            boolean r11 = r10.vip(r11)
            if (r11 == 0) goto L8c
            r0.add(r10)
        L8c:
            int r9 = r9 + 1
            goto L79
        L8f:
            java.util.Iterator r0 = r0.iterator()
            r3 = r20
            r7 = r0
            r9 = r6
            r6 = r1
            r0 = r18
        L9a:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Lc1
            java.lang.Object r10 = r7.next()
            eؑؔۥ r10 = (defpackage.InterfaceC0077e) r10
            java.lang.Object r11 = r4.getValue()
            eؖۧۥ r11 = (defpackage.C4532e) r11
            r6.f12831e = r3
            r6.f12838e = r9
            r6.f12837e = r7
            r6.f12835e = r0
            r6.f12833e = r8
            r6.f12834e = r5
            java.lang.Object r10 = r10.appmetrica(r9, r11, r3, r6)
            eٟؔۙ r11 = defpackage.EnumC2821e.f6782e
            if (r10 != r11) goto L9a
            return r11
        Lc1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14260e.vip(long, eٌؖۙ, eُؑ۠):java.lang.Object");
    }
}
