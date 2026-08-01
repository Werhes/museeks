package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6582e implements InterfaceC7046e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C8208e f13569e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f13570e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C12916e f13571e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C8419e f13572e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f13573e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C10095e f13574e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C2394e f13575e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final InterfaceC6334e f13576e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C0673e f13577e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f13578e = AbstractC18039e.appmetrica(3, new C14582e(8));

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C2394e f13579e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C8014e f13580e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final InterfaceC1618e f13581e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C13886e f13582e;

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip = AbstractC3820e.ad.vip(C6582e.class);
        try {
            interfaceC13984e = AbstractC3820e.ad(C6582e.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        f13569e = new C8208e("EngineResponse", new C12025e(vip, interfaceC13984e));
    }

    public C6582e(C8014e c8014e, InterfaceC1618e interfaceC1618e, InterfaceC13033e interfaceC13033e, InterfaceC8850e interfaceC8850e, InterfaceC8850e interfaceC8850e2, InterfaceC6334e interfaceC6334e) {
        this.f13580e = c8014e;
        C5033e c5033e = c8014e.f16270e;
        C13886e c13886e = new C13886e(c5033e.f25998e, 1);
        C13886e c13886e2 = c5033e.f25996e;
        c13886e.f9083e.clear();
        if (c13886e.f9082e != 0) {
            throw new IllegalStateException("Check failed.");
        }
        c13886e.metrica(c13886e2);
        this.f13582e = c13886e;
        this.f13581e = interfaceC1618e;
        this.f13576e = interfaceC6334e;
        this.f13579e = C2394e.f6116e;
        this.f13574e = new C10095e(0);
        this.f13571e = new C12916e(6, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r4.purchase(r6, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (loadAd(r4, (defpackage.C14339e) r5, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
    
        if (r4.startapp(r0) == r1) goto L45;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object advert(defpackage.C6582e r4, defpackage.AbstractC14601e r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C8471e
            if (r0 == 0) goto L13
            r0 = r6
            eٌؔٞ r0 = (defpackage.C8471e) r0
            int r1 = r0.f17250e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17250e = r1
            goto L18
        L13:
            eٌؔٞ r0 = new eٌؔٞ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f17253e
            int r1 = r0.f17250e
            switch(r1) {
                case 0: goto L3d;
                case 1: goto L27;
                case 2: goto L38;
                case 3: goto L27;
                case 4: goto L2e;
                case 5: goto L27;
                case 6: goto L27;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L27:
            eؙۣۖ r4 = r0.f17251e
            defpackage.AbstractC2003e.purchase(r6)
            goto Lb0
        L2e:
            eْٕؕ r4 = r0.f17249e
            eؙۣۖ r5 = r0.f17251e
            defpackage.AbstractC2003e.purchase(r6)     // Catch: java.lang.Throwable -> L36
            goto L92
        L36:
            r5 = move-exception
            goto L99
        L38:
            eْٕؕ r4 = r0.f17249e
            byte[] r4 = (byte[]) r4
            goto L27
        L3d:
            defpackage.AbstractC2003e.purchase(r6)
            boolean r6 = r5 instanceof defpackage.AbstractC10298e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r6 == 0) goto L5f
            r6 = r5
            eَٖٝ r6 = (defpackage.AbstractC10298e) r6
            byte[] r6 = r6.appmetrica()
            r4.license(r5)
            r0.f17251e = r4
            r5 = 0
            r0.f17249e = r5
            r5 = 2
            r0.f17250e = r5
            java.lang.Object r5 = r4.purchase(r6, r0)
            if (r5 != r1) goto Lb0
            goto Laf
        L5f:
            boolean r6 = r5 instanceof defpackage.C14339e
            if (r6 == 0) goto L74
            r4.license(r5)
            eۣٕٓ r5 = (defpackage.C14339e) r5
            r0.f17251e = r4
            r6 = 3
            r0.f17250e = r6
            java.lang.Object r5 = loadAd(r4, r5, r0)
            if (r5 != r1) goto Lb0
            goto Laf
        L74:
            boolean r6 = r5 instanceof defpackage.AbstractC15468e
            if (r6 == 0) goto L9d
            r6 = r5
            eٕٔٞ r6 = (defpackage.AbstractC15468e) r6
            eْٕؕ r6 = r6.appmetrica()
            r4.license(r5)     // Catch: java.lang.Throwable -> L97
            r0.f17251e = r4     // Catch: java.lang.Throwable -> L97
            r0.f17249e = r6     // Catch: java.lang.Throwable -> L97
            r5 = 4
            r0.f17250e = r5     // Catch: java.lang.Throwable -> L97
            java.lang.Object r5 = yandex(r4, r6, r0)     // Catch: java.lang.Throwable -> L97
            if (r5 != r1) goto L90
            goto Laf
        L90:
            r5 = r4
            r4 = r6
        L92:
            defpackage.AbstractC2223e.ad(r4)
            r4 = r5
            goto Lb0
        L97:
            r5 = move-exception
            r4 = r6
        L99:
            defpackage.AbstractC2223e.ad(r4)
            throw r5
        L9d:
            boolean r6 = r5 instanceof defpackage.AbstractC6341e
            if (r6 == 0) goto Lb6
            r4.license(r5)
            r0.f17251e = r4
            r5 = 5
            r0.f17250e = r5
            java.lang.Object r5 = r4.startapp(r0)
            if (r5 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            r5 = 1
            r4.f13573e = r5
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        Lb6:
            eٔٚؖ r4 = new eٔٚؖ
            r5 = 10
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6582e.advert(eؙۣۖ, eٌٔؖ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (defpackage.AbstractC5336e.advert(r8, r1, r0) != r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r8 == r4) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v0, types: [eؙۣۖ] */
    /* JADX WARN: Type inference failed for: r6v1, types: [eًؓؗ] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.Unit, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object loadAd(defpackage.C6582e r6, defpackage.C14339e r7, defpackage.AbstractC10731e r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C6413e
            if (r0 == 0) goto L13
            r0 = r8
            eؙٕٛ r0 = (defpackage.C6413e) r0
            int r1 = r0.f13292e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13292e = r1
            goto L18
        L13:
            eؙٕٛ r0 = new eؙٕٛ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f13295e
            int r1 = r0.f13292e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            eًؓؗ r6 = r0.f13291e
            defpackage.AbstractC2003e.purchase(r8)     // Catch: java.lang.Throwable -> L2c defpackage.C17893e -> L2e
            goto L67
        L2c:
            r7 = move-exception
            goto L75
        L2e:
            r7 = move-exception
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            eۣٕٓ r7 = r0.f13293e
            defpackage.AbstractC2003e.purchase(r8)
            goto L4c
        L3e:
            defpackage.AbstractC2003e.purchase(r8)
            r0.f13293e = r7
            r0.f13292e = r3
            java.lang.Object r8 = r6.Signature(r0)
            if (r8 != r4) goto L4c
            goto L66
        L4c:
            r6 = r8
            eًؓؗ r6 = (defpackage.InterfaceC1618e) r6
            eّٕٓ r8 = defpackage.AbstractC6731e.ad     // Catch: java.lang.Throwable -> L2c defpackage.C17893e -> L2e
            eؕۙۜ r8 = defpackage.ExecutorC3603e.f8134e     // Catch: java.lang.Throwable -> L2c defpackage.C17893e -> L2e
            eٖؓۢ r1 = new eٖؓۢ     // Catch: java.lang.Throwable -> L2c defpackage.C17893e -> L2e
            r3 = 3
            r5 = 0
            r1.<init>(r7, r6, r5, r3)     // Catch: java.lang.Throwable -> L2c defpackage.C17893e -> L2e
            r0.f13293e = r5     // Catch: java.lang.Throwable -> L2c defpackage.C17893e -> L2e
            r0.f13291e = r6     // Catch: java.lang.Throwable -> L2c defpackage.C17893e -> L2e
            r0.f13292e = r2     // Catch: java.lang.Throwable -> L2c defpackage.C17893e -> L2e
            java.lang.Object r7 = defpackage.AbstractC5336e.advert(r8, r1, r0)     // Catch: java.lang.Throwable -> L2c defpackage.C17893e -> L2e
            if (r7 != r4) goto L67
        L66:
            return r4
        L67:
            defpackage.AbstractC15710e.appmetrica(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L6d:
            eؙؑۤ r8 = new eؙؑۤ     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "Cannot write to channel"
            r8.<init>(r0, r7)     // Catch: java.lang.Throwable -> L2c
            throw r8     // Catch: java.lang.Throwable -> L2c
        L75:
            r6.ad(r7)     // Catch: java.lang.Throwable -> L79
            throw r7     // Catch: java.lang.Throwable -> L79
        L79:
            r7 = move-exception
            defpackage.AbstractC15710e.appmetrica(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6582e.loadAd(eؙۣۖ, eۣٕٓ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x006f, code lost:
    
        if (r14 == r11) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0032, B:14:0x00dc, B:21:0x00f2, B:22:0x00f7, B:23:0x00f8, B:24:0x00fd), top: B:12:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:38:0x004f, B:39:0x00b8, B:41:0x00c0), top: B:37:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0080 A[Catch: all -> 0x008e, TryCatch #3 {all -> 0x008e, blocks: (B:52:0x0076, B:54:0x0080, B:55:0x0092), top: B:51:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object yandex(defpackage.C6582e r12, defpackage.InterfaceC13033e r13, defpackage.AbstractC10731e r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6582e.yandex(eؙۣۖ, eْٕؕ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Signature(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C2312e
            if (r0 == 0) goto L13
            r0 = r5
            eؔؑۚ r0 = (defpackage.C2312e) r0
            int r1 = r0.f5831e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5831e = r1
            goto L18
        L13:
            eؔؑۚ r0 = new eؔؑۚ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f5830e
            int r1 = r0.f5831e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L3c
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            r0.f5831e = r2
            r5 = 0
            java.lang.Object r5 = r4.subscription(r5, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L3c
            return r0
        L3c:
            eًؓؗ r5 = r4.appmetrica()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6582e.Signature(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8559e
    public final C12916e ad() {
        return this.f13571e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r7.mo696protected(r0) == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r7.purchase(r0) == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        if (advert(r6, r7, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object adcel(defpackage.AbstractC14601e r7, defpackage.AbstractC10731e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C7641e
            if (r0 == 0) goto L13
            r0 = r8
            eًؐۚ r0 = (defpackage.C7641e) r0
            int r1 = r0.f15520e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15520e = r1
            goto L18
        L13:
            eًؐۚ r0 = new eًؐۚ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f15519e
            int r1 = r0.f15520e
            r2 = 3
            r3 = 2
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            defpackage.AbstractC2003e.purchase(r8)
            goto L6e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.AbstractC2003e.purchase(r8)
            goto L61
        L39:
            defpackage.AbstractC2003e.purchase(r8)
            goto L54
        L3d:
            defpackage.AbstractC2003e.purchase(r8)
            eؙُۤ r8 = r6.f13576e
            if (r8 == 0) goto L4b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            eٌٝؐ r8 = (defpackage.C8823e) r8
            r8.m2175import(r1)
        L4b:
            r0.f15520e = r4
            java.lang.Object r7 = advert(r6, r7, r0)
            if (r7 != r5) goto L54
            goto L6d
        L54:
            eؑۤۖ r7 = r6.f13577e
            if (r7 == 0) goto L61
            r0.f15520e = r3
            java.lang.Object r7 = r7.purchase(r0)
            if (r7 != r5) goto L61
            goto L6d
        L61:
            eٌُؑ r7 = r6.f13572e
            if (r7 == 0) goto L71
            r0.f15520e = r2
            java.lang.Object r7 = r7.mo696protected(r0)
            if (r7 != r5) goto L6e
        L6d:
            return r5
        L6e:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L71:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6582e.adcel(eٌٔؖ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8559e
    public final boolean admob() {
        return this.f13570e;
    }

    @Override // defpackage.InterfaceC7046e
    public final C13886e amazon() {
        return this.f13582e;
    }

    public final InterfaceC1618e appmetrica() {
        boolean billing = AbstractC7890e.billing(this.f13571e.inmobi("Transfer-Encoding"), "chunked");
        InterfaceC1618e interfaceC1618e = this.f13581e;
        if (!billing) {
            return interfaceC1618e;
        }
        C1730e c1730e = AbstractC6731e.vip;
        byte[] bArr = AbstractC18341e.ad;
        C1853e c1853e = new C1853e(interfaceC1618e, (InterfaceC5083e) null, 23);
        C11614e inmobi = AbstractC11263e.inmobi(C5162e.f11047e, c1730e, new C4070e(false), c1853e);
        C0673e c0673e = inmobi.ad;
        this.f13577e = c0673e;
        this.f13572e = inmobi.vip;
        return c0673e;
    }

    @Override // defpackage.InterfaceC8559e
    public final void billing(C2394e c2394e) {
        this.f13575e = c2394e;
        this.f13579e = c2394e;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Type inference failed for: r1v0, types: [eٍؚؔ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void license(defpackage.AbstractC14601e r8) {
        /*
            r7 = this;
            boolean r0 = r7.f13570e
            if (r0 != 0) goto Lba
            r0 = 1
            r7.f13570e = r0
            eٍؚؔ r1 = new eٍؚؔ
            r1.<init>()
            eۣؔؗ r2 = r8.license()
            if (r2 == 0) goto L18
        L12:
            r7.billing(r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L1f
        L18:
            eۣؔؗ r2 = r7.f13575e
            if (r2 != 0) goto L1f
            eۣؔؗ r2 = defpackage.C2394e.f6116e
            goto L12
        L1f:
            eً٘ۤ r2 = r8.metrica()
            eؚٟؗ r3 = new eؚٟؗ
            r3.<init>(r1, r8, r7)
            r2.mo460e(r3)
            java.lang.Long r2 = r8.ad()
            java.lang.String r3 = "Content-Length"
            r4 = 0
            if (r2 == 0) goto L56
            long r1 = r2.longValue()
            java.lang.String[] r5 = defpackage.AbstractC18251e.ad
            r5 = 0
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 > 0) goto L4c
            r5 = 1024(0x400, double:5.06E-321)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4c
            java.lang.String[] r5 = defpackage.AbstractC18251e.ad
            int r1 = (int) r1
            r1 = r5[r1]
            goto L50
        L4c:
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L50:
            eّۨؒ r2 = r7.f13571e
            r2.advert(r3, r1, r4)
            goto L6f
        L56:
            boolean r1 = r1.f18534e
            if (r1 != 0) goto L6f
            boolean r1 = r8 instanceof defpackage.AbstractC6341e
            if (r1 == 0) goto L66
            eّۨؒ r1 = r7.f13571e
            java.lang.String r2 = "0"
            r1.advert(r3, r2, r4)
            goto L6f
        L66:
            java.lang.String r1 = "Transfer-Encoding"
            java.lang.String r2 = "chunked"
            eّۨؒ r3 = r7.f13571e
            r3.advert(r1, r2, r4)
        L6f:
            eّۨؒ r1 = r7.f13571e
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = r1.inmobi(r2)
            if (r3 == 0) goto L7a
            goto L87
        L7a:
            eٜؓؗ r8 = r8.vip()
            if (r8 == 0) goto L87
            java.lang.String r8 = r8.toString()
            r1.advert(r2, r8, r4)
        L87:
            eًٙۘ r8 = r7.f13580e
            eْٓۚ r2 = r8.f16269e
            eً٘ۤ r2 = r2.ad()
            java.lang.String r3 = "Connection"
            java.lang.String r2 = r2.mo459e(r3)
            if (r2 == 0) goto Lb9
            eؙۣۖ r8 = r8.f16266e
            eّۨؒ r8 = r8.f13571e
            java.lang.String r8 = r8.inmobi(r3)
            if (r8 == 0) goto La2
            return
        La2:
            java.lang.String r8 = "close"
            boolean r4 = r2.equalsIgnoreCase(r8)
            if (r4 == 0) goto Lae
            r1.advert(r3, r8, r0)
            return
        Lae:
            java.lang.String r8 = "keep-alive"
            boolean r2 = r2.equalsIgnoreCase(r8)
            if (r2 == 0) goto Lb9
            r1.advert(r3, r8, r0)
        Lb9:
            return
        Lba:
            eٍۨۗ r8 = new eٍۨۗ
            java.lang.String r0 = "Response has already been sent"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6582e.license(eٌٔؖ):void");
    }

    @Override // defpackage.InterfaceC8559e
    public final /* bridge */ /* synthetic */ InterfaceC6141e metrica() {
        return this.f13580e;
    }

    @Override // defpackage.InterfaceC8559e
    public final boolean mopub() {
        return this.f13573e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (defpackage.AbstractC5336e.advert(r1, r3, r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (subscription(true, r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object purchase(byte[] r8, defpackage.AbstractC10731e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C15414e
            if (r0 == 0) goto L13
            r0 = r9
            eّٕؗ r0 = (defpackage.C15414e) r0
            int r1 = r0.f30466e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30466e = r1
            goto L18
        L13:
            eّٕؗ r0 = new eّٕؗ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f30464e
            int r1 = r0.f30466e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r9)
            goto L5f
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            byte[] r8 = r0.f30465e
            defpackage.AbstractC2003e.purchase(r9)
            goto L46
        L38:
            defpackage.AbstractC2003e.purchase(r9)
            r0.f30465e = r8
            r0.f30466e = r3
            java.lang.Object r9 = r7.subscription(r3, r0)
            if (r9 != r4) goto L46
            goto L5e
        L46:
            eًؓؗ r9 = r7.appmetrica()
            eَؓۦ r1 = defpackage.AbstractC6731e.vip
            eٖؓۢ r3 = new eٖؓۢ
            r5 = 11
            r6 = 0
            r3.<init>(r9, r8, r6, r5)
            r0.f30465e = r6
            r0.f30466e = r2
            java.lang.Object r8 = defpackage.AbstractC5336e.advert(r1, r3, r0)
            if (r8 != r4) goto L5f
        L5e:
            return r4
        L5f:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6582e.purchase(byte[], eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8559e
    public final C2394e smaato() {
        return this.f13575e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r5.f13581e.purchase(r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (subscription(true, r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startapp(defpackage.AbstractC10731e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C6791e
            if (r0 == 0) goto L13
            r0 = r6
            eؙۦّ r0 = (defpackage.C6791e) r0
            int r1 = r0.f13997e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13997e = r1
            goto L18
        L13:
            eؙۦّ r0 = new eؙۦّ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13996e
            int r1 = r0.f13997e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r6)
            goto L4d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.AbstractC2003e.purchase(r6)
            goto L42
        L36:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f13997e = r3
            java.lang.Object r6 = r5.subscription(r3, r0)
            if (r6 != r4) goto L42
            goto L4c
        L42:
            r0.f13997e = r2
            eًؓؗ r6 = r5.f13581e
            java.lang.Object r6 = r6.purchase(r0)
            if (r6 != r4) goto L4d
        L4c:
            return r4
        L4d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6582e.startapp(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #2 {all -> 0x008e, blocks: (B:28:0x00a9, B:40:0x0053, B:41:0x006a, B:43:0x0070, B:44:0x007e, B:46:0x0084, B:49:0x0093), top: B:39:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object subscription(boolean r12, defpackage.AbstractC10731e r13) {
        /*
            r11 = this;
            eَؘۘ r0 = r11.f13574e
            boolean r1 = r13 instanceof defpackage.C9229e
            if (r1 == 0) goto L15
            r1 = r13
            eٍؔۨ r1 = (defpackage.C9229e) r1
            int r2 = r1.f18427e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f18427e = r2
            goto L1a
        L15:
            eٍؔۨ r1 = new eٍؔۨ
            r1.<init>(r11, r13)
        L1a:
            java.lang.Object r13 = r1.f18430e
            int r2 = r1.f18427e
            eًؓؗ r3 = r11.f13581e
            r4 = 2
            r5 = 1
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            eّۨؒ r12 = r1.f18426e
            defpackage.AbstractC2003e.purchase(r13)     // Catch: java.lang.Throwable -> L31
            goto Lb7
        L31:
            r13 = move-exception
            goto Lbe
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3c:
            boolean r12 = r1.f18428e
            eّۨؒ r0 = r1.f18426e
            defpackage.AbstractC2003e.purchase(r13)     // Catch: java.lang.Throwable -> L45
            r13 = r0
            goto La7
        L45:
            r13 = move-exception
            r12 = r0
            goto Lbe
        L49:
            defpackage.AbstractC2003e.purchase(r13)
            eّۨؒ r13 = new eّۨؒ
            r2 = 23
            r13.<init>(r2)
            java.lang.String r2 = "HTTP/1.1"
            eۣؔؗ r7 = r11.f13579e     // Catch: java.lang.Throwable -> L8e
            int r8 = r7.f6126e     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = r7.f6125e     // Catch: java.lang.Throwable -> L8e
            r13.m3415goto(r2, r7, r8)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r2 = r0.f36443e     // Catch: java.lang.Throwable -> L8e
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L8e
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8e
        L6a:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r7 == 0) goto L93
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L8e
            java.util.List r8 = r0.mo856e(r7)     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L8e
        L7e:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r9 == 0) goto L6a
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L8e
            r13.applovin(r7, r9)     // Catch: java.lang.Throwable -> L8e
            goto L7e
        L8e:
            r12 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
            goto Lbe
        L93:
            r13.subscription()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r13.f25784e     // Catch: java.lang.Throwable -> L8e
            eَّۙ r0 = (defpackage.C12402e) r0     // Catch: java.lang.Throwable -> L8e
            r1.f18426e = r13     // Catch: java.lang.Throwable -> L8e
            r1.f18428e = r12     // Catch: java.lang.Throwable -> L8e
            r1.f18427e = r5     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = defpackage.AbstractC12534e.startapp(r3, r0, r1)     // Catch: java.lang.Throwable -> L8e
            if (r0 != r6) goto La7
            goto Lb5
        La7:
            if (r12 != 0) goto Lb8
            r1.f18426e = r13     // Catch: java.lang.Throwable -> L8e
            r1.f18428e = r12     // Catch: java.lang.Throwable -> L8e
            r1.f18427e = r4     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r12 = r3.metrica(r1)     // Catch: java.lang.Throwable -> L8e
            if (r12 != r6) goto Lb6
        Lb5:
            return r6
        Lb6:
            r12 = r13
        Lb7:
            r13 = r12
        Lb8:
            r13.getClass()
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        Lbe:
            r12.getClass()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6582e.subscription(boolean, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC8559e
    public final C9348e vip() {
        return (C9348e) this.f13578e.getValue();
    }
}
