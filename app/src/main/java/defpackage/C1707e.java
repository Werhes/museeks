package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1707e {
    public static final C1707e ad = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(2:10|11)(2:29|30))(4:31|32|33|(1:35))|12|13|(2:15|(1:20)(1:(1:19)))|21|(1:24)|25|26))|38|6|7|(0)(0)|12|13|(0)|21|(1:24)|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002b, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0059, code lost:
    
        r10 = new defpackage.C12763e(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(android.app.Activity r7, boolean r8, boolean r9, defpackage.AbstractC10731e r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.C15496e
            if (r0 == 0) goto L13
            r0 = r10
            eٕٖؗ r0 = (defpackage.C15496e) r0
            int r1 = r0.f30607e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30607e = r1
            goto L18
        L13:
            eٕٖؗ r0 = new eٕٖؗ
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f30608e
            int r1 = r0.f30607e
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            boolean r9 = r0.f30609e
            boolean r8 = r0.f30604e
            android.app.Activity r7 = r0.f30606e
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Throwable -> L2b
            goto L56
        L2b:
            r10 = move-exception
            goto L59
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.AbstractC2003e.purchase(r10)
            eّٕٓ r10 = defpackage.AbstractC6731e.ad     // Catch: java.lang.Throwable -> L2b
            eؕۙۜ r10 = defpackage.ExecutorC3603e.f8134e     // Catch: java.lang.Throwable -> L2b
            eّٖٙ r1 = new eّٖٙ     // Catch: java.lang.Throwable -> L2b
            r3 = 2
            r4 = 18
            r5 = 0
            r1.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L2b
            r0.f30606e = r7     // Catch: java.lang.Throwable -> L2b
            r0.f30604e = r8     // Catch: java.lang.Throwable -> L2b
            r0.f30609e = r9     // Catch: java.lang.Throwable -> L2b
            r0.f30607e = r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r10 = defpackage.AbstractC5336e.advert(r10, r1, r0)     // Catch: java.lang.Throwable -> L2b
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r10 != r0) goto L56
            return r0
        L56:
            eؘٞٙ r10 = (defpackage.C5789e) r10     // Catch: java.lang.Throwable -> L2b
            goto L5f
        L59:
            eّۜۖ r0 = new eّۜۖ
            r0.<init>(r10)
            r10 = r0
        L5f:
            boolean r0 = r10 instanceof defpackage.C12763e
            r1 = 0
            if (r0 != 0) goto L8d
            r0 = r10
            eؘٞٙ r0 = (defpackage.C5789e) r0
            int r2 = r0.ad
            r3 = 99167(0x1835f, float:1.38963E-40)
            if (r2 > r3) goto L85
            if (r8 == 0) goto L72
            goto L85
        L72:
            if (r9 == 0) goto L8d
            ua.itaysonlab.vkx.VKXApplication$Companion r8 = ua.itaysonlab.vkx.VKXApplication.f36531e
            r8 = 2131887542(0x7f1205b6, float:1.9409694E38)
            java.lang.String r8 = ua.itaysonlab.vkx.VKXApplication.Companion.vip(r8)
            android.widget.Toast r8 = android.widget.Toast.makeText(r7, r8, r1)
            r8.show()
            goto L8d
        L85:
            eُٗٝ r8 = new eُٗٝ
            r8.<init>(r0)
            r8.signatures(r7)
        L8d:
            java.lang.Throwable r8 = defpackage.C13523e.ad(r10)
            if (r8 == 0) goto La5
            if (r9 == 0) goto La5
            ua.itaysonlab.vkx.VKXApplication$Companion r8 = ua.itaysonlab.vkx.VKXApplication.f36531e
            r8 = 2131887539(0x7f1205b3, float:1.9409688E38)
            java.lang.String r8 = ua.itaysonlab.vkx.VKXApplication.Companion.vip(r8)
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r8, r1)
            r7.show()
        La5:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1707e.ad(android.app.Activity, boolean, boolean, eُؑ۠):java.lang.Object");
    }
}
