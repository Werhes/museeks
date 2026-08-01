package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8909e implements InterfaceC8152e {
    public static final C8909e ad = new Object();
    public static final C11817e metrica;
    public static final long vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌُۗ, java.lang.Object] */
    static {
        C17647e c17647e = C14157e.f27993e;
        vip = AbstractC0326e.Signature(7, EnumC15934e.DAYS);
        metrica = AbstractC7763e.ad(new C3685e(17));
    }

    public static long vip(C4030e c4030e) {
        float f;
        Float f2;
        C4030e license = AbstractC18127e.license(c4030e, "time");
        if (license != null) {
            AbstractC16920e appmetrica = AbstractC18127e.appmetrica(license, "total");
            if (appmetrica != null) {
                C5404e c5404e = AbstractC12517e.ad;
                f2 = AbstractC17414e.yandex(appmetrica.appmetrica());
            } else {
                f2 = null;
            }
            if (f2 != null) {
                f = f2.floatValue();
                return f * 1000.0f;
            }
        }
        f = 0.0f;
        return f * 1000.0f;
    }

    @Override // defpackage.InterfaceC8152e
    public final Object ad(C9398e c9398e, AbstractC16049e abstractC16049e, InterfaceC5083e interfaceC5083e) {
        return license(c9398e, abstractC16049e, (AbstractC10731e) interfaceC5083e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r9 != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r9 == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(defpackage.C9398e r8, defpackage.AbstractC10731e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C10351e
            if (r0 == 0) goto L13
            r0 = r9
            eَٙۧ r0 = (defpackage.C10351e) r0
            int r1 = r0.f20430e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20430e = r1
            goto L18
        L13:
            eَٙۧ r0 = new eَٙۧ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f20429e
            int r1 = r0.f20430e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r9)
            goto L7a
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.AbstractC2003e.purchase(r9)
            goto L6d
        L36:
            defpackage.AbstractC2003e.purchase(r9)
            eَٔٔ r9 = new eَٔٔ
            r9.<init>()
            java.lang.String r1 = "https://apic-desktop.musixmatch.com/ws/1.1/token.get"
            defpackage.AbstractC4882e.ad(r9, r1)
            eِٜٗ r1 = r9.ad
            eٗؒۤ r1 = r1.adcel
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "web-desktop-app-v1.0"
            r1.mo859e(r5, r6)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.String r1 = "User-Agent"
            java.lang.String r5 = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/70.0.3538.77 Chrome/70.0.3538.77 Safari/537.36"
            eَؘۘ r6 = r9.metrica
            r6.mo859e(r1, r5)
            eؕ٘٘ r1 = defpackage.C3434e.vip
            r9.vip = r1
            eْٝۜ r1 = new eْٝۜ
            r5 = 26
            r1.<init>(r9, r8, r5)
            r0.f20430e = r3
            java.lang.Object r9 = r1.loadAd(r0)
            if (r9 != r4) goto L6d
            goto L79
        L6d:
            eؘٗٙ r9 = (defpackage.AbstractC16824e) r9
            r0.f20430e = r2
            java.nio.charset.Charset r8 = defpackage.AbstractC5508e.ad
            java.lang.Object r9 = defpackage.AbstractC11263e.license(r9, r8, r0)
            if (r9 != r4) goto L7a
        L79:
            return r4
        L7a:
            java.lang.String r9 = (java.lang.String) r9
            eِٙٙ r8 = defpackage.C8909e.metrica
            r8.getClass()
            eٍۗٓ r0 = defpackage.C4030e.Companion
            eؘؒٙ r0 = r0.serializer()
            eؘؒٙ r0 = (defpackage.InterfaceC5372e) r0
            java.lang.Object r8 = r8.appmetrica(r0, r9)
            eُؖؔ r8 = (defpackage.C4030e) r8
            java.lang.String r9 = "message"
            eُؖؔ r8 = defpackage.AbstractC18127e.license(r8, r9)
            if (r8 == 0) goto La8
            java.lang.String r9 = "body"
            eُؖؔ r8 = defpackage.AbstractC18127e.license(r8, r9)
            if (r8 == 0) goto La8
            java.lang.String r9 = "user_token"
            java.lang.String r8 = defpackage.AbstractC18127e.billing(r8, r9)
            if (r8 == 0) goto La8
            return r8
        La8:
            java.lang.String r8 = "220215b052d6aeaa3e9a410986f6c3ae7ea9f5238731cb918d05ea"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8909e.appmetrica(eٍُۘ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00b2, code lost:
    
        if (r2 != r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0063, code lost:
    
        if (r4 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016c, code lost:
    
        if (r2.length() > 0) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r21v0, types: [eٌُۗ] */
    /* JADX WARN: Type inference failed for: r7v9, types: [eْٛؗ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(defpackage.C9398e r22, defpackage.AbstractC16049e r23, defpackage.AbstractC10731e r24) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8909e.license(eٍُۘ, eؙٖۛ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        if (r13 != r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (r13 == r6) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.C9398e r12, defpackage.AbstractC10731e r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.C2918e
            if (r0 == 0) goto L13
            r0 = r13
            eِؔۡ r0 = (defpackage.C2918e) r0
            int r1 = r0.f6899e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6899e = r1
            goto L18
        L13:
            eِؔۡ r0 = new eِؔۡ
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f6902e
            int r1 = r0.f6899e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r12 = r0.f6898e
            defpackage.AbstractC2003e.purchase(r13)
            goto Lab
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            defpackage.AbstractC2003e.purchase(r13)
            goto L88
        L3d:
            eٍُۘ r12 = r0.f6900e
            defpackage.AbstractC2003e.purchase(r13)
            goto L61
        L43:
            defpackage.AbstractC2003e.purchase(r13)
            eُۡٔ r13 = defpackage.AbstractC1831e.metrica()
            java.lang.Object r13 = r13.f22774e
            eًَٛ r13 = (defpackage.C7850e) r13
            java.lang.Object r13 = r13.f15896e
            eًٙۡ r13 = (defpackage.InterfaceC8018e) r13
            eؒٗۡ r13 = r13.ad()
            r0.f6900e = r12
            r0.f6899e = r4
            java.lang.Object r13 = defpackage.AbstractC7535e.startapp(r13, r0)
            if (r13 != r6) goto L61
            goto La9
        L61:
            eؕؖۗ r13 = (defpackage.C3147e) r13
            java.lang.String r1 = r13.f7230e
            int r1 = r1.length()
            if (r1 != 0) goto L6c
            goto L7d
        L6c:
            long r7 = r13.f7232e
            long r9 = defpackage.C8909e.vip
            long r9 = defpackage.C14157e.license(r9)
            long r9 = r9 + r7
            long r7 = java.lang.System.currentTimeMillis()
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 > 0) goto Lae
        L7d:
            r0.f6900e = r5
            r0.f6899e = r3
            java.lang.Object r13 = r11.appmetrica(r12, r0)
            if (r13 != r6) goto L88
            goto La9
        L88:
            r12 = r13
            java.lang.String r12 = (java.lang.String) r12
            eُۡٔ r1 = defpackage.AbstractC1831e.metrica()
            java.lang.Object r1 = r1.f22774e
            eًَٛ r1 = (defpackage.C7850e) r1
            r0.f6900e = r5
            r0.f6898e = r13
            r0.f6899e = r2
            java.lang.Object r1 = r1.f15896e
            eًٙۡ r1 = (defpackage.InterfaceC8018e) r1
            eًؒۛ r2 = new eًؒۛ
            r3 = 0
            r2.<init>(r12, r5, r3)
            java.lang.Object r12 = r1.vip(r2, r0)
            if (r12 != r6) goto Laa
        La9:
            return r6
        Laa:
            r12 = r13
        Lab:
            java.lang.String r12 = (java.lang.String) r12
            return r12
        Lae:
            java.lang.String r12 = r13.f7230e
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8909e.metrica(eٍُۘ, eُؑ۠):java.lang.Object");
    }
}
