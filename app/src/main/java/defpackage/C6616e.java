package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۘۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6616e implements InterfaceC11882e {
    public static final /* synthetic */ int billing = 0;
    public static final double purchase = Math.random();
    public final C14679e ad;
    public final InterfaceC8850e appmetrica;
    public final C15176e license;
    public final C1253e metrica;
    public final InterfaceC4648e vip;

    public C6616e(C14679e c14679e, InterfaceC4648e interfaceC4648e, C1253e c1253e, C15176e c15176e, InterfaceC8850e interfaceC8850e) {
        this.ad = c14679e;
        this.vip = interfaceC4648e;
        this.metrica = c1253e;
        this.license = c15176e;
        this.appmetrica = interfaceC8850e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        if (r7.vip(r0) == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0049, code lost:
    
        if (r7 == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C6616e r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C3623e
            if (r0 == 0) goto L13
            r0 = r7
            eؕۛؒ r0 = (defpackage.C3623e) r0
            int r1 = r0.f8164e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8164e = r1
            goto L18
        L13:
            eؕۛؒ r0 = new eؕۛؒ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f8162e
            int r1 = r0.f8164e
            r2 = 2
            r3 = 1
            java.lang.String r4 = "FirebaseSessions"
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            eؙۘۨ r6 = r0.f8163e
            defpackage.AbstractC2003e.purchase(r7)
            goto L87
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            eؙۘۨ r6 = r0.f8163e
            defpackage.AbstractC2003e.purchase(r7)
            goto L4c
        L3c:
            defpackage.AbstractC2003e.purchase(r7)
            eِٖؑ r7 = defpackage.C11440e.ad
            r0.f8163e = r6
            r0.f8164e = r3
            java.lang.Object r7 = r7.vip(r0)
            if (r7 != r5) goto L4c
            goto L86
        L4c:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r1 = r7 instanceof java.util.Collection
            if (r1 == 0) goto L62
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L62
            goto Lc3
        L62:
            java.util.Iterator r7 = r7.iterator()
        L66:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lc3
            java.lang.Object r1 = r7.next()
            eٕؒۡ r1 = (defpackage.C1386e) r1
            eًۥؐ r1 = r1.ad
            boolean r1 = r1.ad()
            if (r1 == 0) goto L66
            eؒۗٚ r7 = r6.metrica
            r0.f8163e = r6
            r0.f8164e = r2
            java.lang.Object r7 = r7.vip(r0)
            if (r7 != r5) goto L87
        L86:
            return r5
        L87:
            eؒۗٚ r7 = r6.metrica
            eٔؕٛ r0 = r7.ad
            java.lang.Boolean r0 = r0.ad()
            if (r0 == 0) goto L96
            boolean r3 = r0.booleanValue()
            goto La2
        L96:
            eٔؕٛ r7 = r7.vip
            java.lang.Boolean r7 = r7.ad()
            if (r7 == 0) goto La2
            boolean r3 = r7.booleanValue()
        La2:
            if (r3 != 0) goto Lac
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lac:
            eؒۗٚ r6 = r6.metrica
            double r6 = r6.ad()
            double r0 = defpackage.C6616e.purchase
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto Lbb
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        Lbb:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lc3:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6616e.ad(eؙۘۨ, eُؑ۠):java.lang.Object");
    }
}
