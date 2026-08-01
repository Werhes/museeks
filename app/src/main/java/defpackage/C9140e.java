package defpackage;

import ua.itaysonlab.catalogkit.objects.Catalog2Response;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۧۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9140e implements InterfaceC4095e {
    public final C3675e ad = new C3675e(new Catalog2Response(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911));
    public final C5609e appmetrica;
    public final C5609e license;
    public final C5609e metrica;
    public final C5609e vip;

    public C9140e() {
        C5609e c5609e = new C5609e(EnumC7481e.f15250e);
        this.vip = c5609e;
        this.metrica = c5609e;
        C5609e c5609e2 = new C5609e(C10327e.f20377e);
        this.license = c5609e2;
        this.appmetrica = c5609e2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(2:22|(2:24|25)(4:26|27|28|(1:30)(1:31)))|12|13|(1:15)|16|17))|34|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002b, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        r6 = new defpackage.C12763e(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(kotlin.jvm.functions.Function0 r6, defpackage.AbstractC10731e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C5567e
            if (r0 == 0) goto L13
            r0 = r7
            eؘَ۠ r0 = (defpackage.C5567e) r0
            int r1 = r0.f11914e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11914e = r1
            goto L18
        L13:
            eؘَ۠ r0 = new eؘَ۠
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f11912e
            int r1 = r0.f11914e
            eؚْ۟ r2 = defpackage.EnumC7481e.f15247e
            r3 = 1
            eؘْؗ r4 = r5.vip
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            eٌۧۛ r6 = r0.f11913e
            defpackage.AbstractC2003e.purchase(r7)     // Catch: java.lang.Throwable -> L2b
            goto L5a
        L2b:
            r6 = move-exception
            goto L73
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.AbstractC2003e.purchase(r7)
            java.lang.Object r7 = r4.startapp()
            if (r7 != r2) goto L41
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L41:
            eؚْ۟ r7 = defpackage.EnumC7481e.f15250e
            r4.subscription(r7)
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L2b
            eِ۠ r6 = (defpackage.AbstractC18406e) r6     // Catch: java.lang.Throwable -> L2b
            r0.f11913e = r5     // Catch: java.lang.Throwable -> L2b
            r0.f11914e = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r6.billing(r0)     // Catch: java.lang.Throwable -> L2b
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r7 != r6) goto L59
            return r6
        L59:
            r6 = r5
        L5a:
            ua.itaysonlab.catalogkit.objects.Catalog2Response r7 = (ua.itaysonlab.catalogkit.objects.Catalog2Response) r7     // Catch: java.lang.Throwable -> L2b
            eؘْؗ r0 = r6.license     // Catch: java.lang.Throwable -> L2b
            eؕ۠ۖ r1 = r6.ad     // Catch: java.lang.Throwable -> L2b
            eؒٛؕ r7 = defpackage.AbstractC0546e.ad(r1, r7)     // Catch: java.lang.Throwable -> L2b
            eُٛۜ r7 = defpackage.AbstractC8228e.license(r7)     // Catch: java.lang.Throwable -> L2b
            r0.subscription(r7)     // Catch: java.lang.Throwable -> L2b
            eؘْؗ r6 = r6.vip     // Catch: java.lang.Throwable -> L2b
            r6.subscription(r2)     // Catch: java.lang.Throwable -> L2b
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2b
            goto L79
        L73:
            eّۜۖ r7 = new eّۜۖ
            r7.<init>(r6)
            r6 = r7
        L79:
            java.lang.Throwable r6 = defpackage.C13523e.ad(r6)
            if (r6 == 0) goto L87
            r6.printStackTrace()
            eؚْ۟ r6 = defpackage.EnumC7481e.f15248e
            r4.subscription(r6)
        L87:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9140e.ad(kotlin.jvm.functions.Function0, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC4095e
    public final void onDestroy() {
        this.vip.subscription(EnumC7481e.f15250e);
        this.license.subscription(C10327e.f20377e);
        this.ad.vip();
    }
}
