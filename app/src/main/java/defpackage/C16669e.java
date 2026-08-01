package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۧۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16669e implements InterfaceC1811e {
    public static final C16669e ad = new Object();
    public static final C17651e vip = AbstractC12751e.ad();
    public static final LinkedHashMap metrica = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(android.content.Context r5, defpackage.InterfaceC8418e r6, java.lang.String r7, defpackage.AbstractC10731e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.C0977e
            if (r0 == 0) goto L13
            r0 = r8
            eَٖؒ r0 = (defpackage.C0977e) r0
            int r1 = r0.f3412e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3412e = r1
            goto L18
        L13:
            eَٖؒ r0 = new eَٖؒ
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f3413e
            int r1 = r0.f3412e
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            eٍٖ٘ r5 = r0.f3416e
            java.lang.String r7 = r0.f3417e
            eٌَؑ r6 = r0.f3411e
            android.content.Context r0 = r0.f3414e
            defpackage.AbstractC2003e.purchase(r8)
            r8 = r5
            r5 = r0
            goto L4f
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.AbstractC2003e.purchase(r8)
            r0.f3414e = r5
            r0.f3411e = r6
            r0.f3417e = r7
            eٍٖ٘ r8 = defpackage.C16669e.vip
            r0.f3416e = r8
            r0.f3412e = r2
            java.lang.Object r0 = r8.appmetrica(r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r0 = 0
            java.util.LinkedHashMap r1 = defpackage.C16669e.metrica     // Catch: java.lang.Throwable -> L62
            r1.remove(r7)     // Catch: java.lang.Throwable -> L62
            java.io.File r5 = r6.ad(r5, r7)     // Catch: java.lang.Throwable -> L62
            r5.delete()     // Catch: java.lang.Throwable -> L62
            r8.billing(r0)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L62:
            r5 = move-exception
            r8.billing(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16669e.ad(android.content.Context, eٌَؑ, java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r10 == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(android.content.Context r6, defpackage.InterfaceC8418e r7, java.lang.String r8, kotlin.jvm.functions.Function2 r9, defpackage.AbstractC10731e r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof defpackage.C11818e
            if (r0 == 0) goto L13
            r0 = r10
            eِٙٚ r0 = (defpackage.C11818e) r0
            int r1 = r0.f23696e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23696e = r1
            goto L18
        L13:
            eِٙٚ r0 = new eِٙٚ
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f23694e
            int r1 = r0.f23696e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f23695e
            r9 = r6
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            defpackage.AbstractC2003e.purchase(r10)
            goto L49
        L3b:
            defpackage.AbstractC2003e.purchase(r10)
            r0.f23695e = r9
            r0.f23696e = r3
            java.lang.Object r10 = r5.vip(r6, r7, r8, r0)
            if (r10 != r4) goto L49
            goto L56
        L49:
            eًٙۡ r10 = (defpackage.InterfaceC8018e) r10
            r6 = 0
            r0.f23695e = r6
            r0.f23696e = r2
            java.lang.Object r6 = r10.vip(r9, r0)
            if (r6 != r4) goto L57
        L56:
            return r4
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16669e.license(android.content.Context, eٌَؑ, java.lang.String, kotlin.jvm.functions.Function2, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r9 == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(android.content.Context r6, defpackage.InterfaceC8418e r7, java.lang.String r8, defpackage.AbstractC10731e r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.C11083e
            if (r0 == 0) goto L13
            r0 = r9
            eُٙۘ r0 = (defpackage.C11083e) r0
            int r1 = r0.f21980e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21980e = r1
            goto L18
        L13:
            eُٙۘ r0 = new eُٙۘ
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f21979e
            int r1 = r0.f21980e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.AbstractC2003e.purchase(r9)
            goto L42
        L36:
            defpackage.AbstractC2003e.purchase(r9)
            r0.f21980e = r3
            java.lang.Object r9 = r5.vip(r6, r7, r8, r0)
            if (r9 != r4) goto L42
            goto L50
        L42:
            eًٙۡ r9 = (defpackage.InterfaceC8018e) r9
            eؒٗۡ r6 = r9.ad()
            r0.f21980e = r2
            java.lang.Object r6 = defpackage.AbstractC7535e.startapp(r6, r0)
            if (r6 != r4) goto L51
        L50:
            return r4
        L51:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16669e.metrica(android.content.Context, eٌَؑ, java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if (r10.appmetrica(r0) == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #1 {all -> 0x008d, blocks: (B:26:0x0068, B:28:0x0070), top: B:25:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(android.content.Context r7, defpackage.InterfaceC8418e r8, java.lang.String r9, defpackage.AbstractC10731e r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.C6944e
            if (r0 == 0) goto L13
            r0 = r10
            eُؚؗ r0 = (defpackage.C6944e) r0
            int r1 = r0.f14233e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14233e = r1
            goto L18
        L13:
            eُؚؗ r0 = new eُؚؗ
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f14234e
            int r1 = r0.f14233e
            r2 = 2
            r3 = 1
            r4 = 0
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L52
            if (r1 == r3) goto L40
            if (r1 != r2) goto L38
            java.lang.String r7 = r0.f14238e
            java.lang.Object r8 = r0.f14232e
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r9 = r0.f14235e
            eؚؗؔ r9 = (defpackage.InterfaceC4619e) r9
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Throwable -> L35
            goto L86
        L35:
            r7 = move-exception
            goto L99
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            eٍٖ٘ r7 = r0.f14237e
            java.lang.String r9 = r0.f14238e
            java.lang.Object r8 = r0.f14232e
            eٌَؑ r8 = (defpackage.InterfaceC8418e) r8
            java.lang.Object r1 = r0.f14235e
            android.content.Context r1 = (android.content.Context) r1
            defpackage.AbstractC2003e.purchase(r10)
            r10 = r7
            r7 = r1
            goto L68
        L52:
            defpackage.AbstractC2003e.purchase(r10)
            r0.f14235e = r7
            r0.f14232e = r8
            r0.f14238e = r9
            eٍٖ٘ r10 = defpackage.C16669e.vip
            r0.f14237e = r10
            r0.f14233e = r3
            java.lang.Object r1 = r10.appmetrica(r0)
            if (r1 != r5) goto L68
            goto L80
        L68:
            java.util.LinkedHashMap r1 = defpackage.C16669e.metrica     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r3 = r1.get(r9)     // Catch: java.lang.Throwable -> L8d
            if (r3 != 0) goto L90
            r0.f14235e = r10     // Catch: java.lang.Throwable -> L8d
            r0.f14232e = r1     // Catch: java.lang.Throwable -> L8d
            r0.f14238e = r9     // Catch: java.lang.Throwable -> L8d
            r0.f14237e = r4     // Catch: java.lang.Throwable -> L8d
            r0.f14233e = r2     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r7 = r8.vip(r7, r9)     // Catch: java.lang.Throwable -> L8d
            if (r7 != r5) goto L81
        L80:
            return r5
        L81:
            r8 = r10
            r10 = r7
            r7 = r9
            r9 = r8
            r8 = r1
        L86:
            r3 = r10
            eًٙۡ r3 = (defpackage.InterfaceC8018e) r3     // Catch: java.lang.Throwable -> L35
            r8.put(r7, r3)     // Catch: java.lang.Throwable -> L35
            goto L91
        L8d:
            r7 = move-exception
            r9 = r10
            goto L99
        L90:
            r9 = r10
        L91:
            eًٙۡ r3 = (defpackage.InterfaceC8018e) r3     // Catch: java.lang.Throwable -> L35
            eٍٖ٘ r9 = (defpackage.C17651e) r9
            r9.billing(r4)
            return r3
        L99:
            eٍٖ٘ r9 = (defpackage.C17651e) r9
            r9.billing(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16669e.vip(android.content.Context, eٌَؑ, java.lang.String, eُؑ۠):java.lang.Object");
    }
}
