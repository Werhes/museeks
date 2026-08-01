package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11263e {
    public static final C2892e ad = new C2892e(-321446351, false, new C9868e(7));

    public static C2335e Signature() {
        byte[] bArr = new byte[16];
        AbstractC2022e.ad.nextBytes(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long appmetrica = AbstractC8294e.appmetrica(0, bArr);
        long appmetrica2 = AbstractC8294e.appmetrica(8, bArr);
        return (appmetrica == 0 && appmetrica2 == 0) ? C2335e.f5851e : new C2335e(appmetrica, appmetrica2);
    }

    public static final void ad(C12452e c12452e, int i) {
        if (c12452e.vip == 0 || !(c12452e.metrica(0) == i || c12452e.metrica(c12452e.vip - 1) == i)) {
            int i2 = c12452e.vip;
            c12452e.ad(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int metrica = c12452e.metrica(i3);
                if (i <= metrica) {
                    break;
                }
                c12452e.purchase(i2, metrica);
                i2 = i3;
            }
            c12452e.purchase(i2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object adcel(defpackage.InterfaceC13033e r4, defpackage.AbstractC10731e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C12749e
            if (r0 == 0) goto L13
            r0 = r5
            eّۛۛ r0 = (defpackage.C12749e) r0
            int r1 = r0.f25507e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25507e = r1
            goto L18
        L13:
            eّۛۛ r0 = new eّۛۛ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f25505e
            int r1 = r0.f25507e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eْٕؕ r4 = r0.f25506e
            defpackage.AbstractC2003e.purchase(r5)
            goto L4b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r5)
            eَّۙ r5 = r4.billing()
            boolean r5 = r5.yandex()
            if (r5 == 0) goto L4b
            r0.f25506e = r4
            r0.f25507e = r2
            int r5 = defpackage.AbstractC4912e.ad
            java.lang.Object r5 = r4.license(r2, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L4b
            return r0
        L4b:
            eَّۙ r4 = r4.billing()
            boolean r4 = r4.yandex()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.adcel(eْٕؕ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object admob(defpackage.InterfaceC13033e r4, defpackage.AbstractC10731e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C0531e
            if (r0 == 0) goto L13
            r0 = r5
            eؑۙٗ r0 = (defpackage.C0531e) r0
            int r1 = r0.f2683e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2683e = r1
            goto L18
        L13:
            eؑۙٗ r0 = new eؑۙٗ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f2684e
            int r1 = r0.f2683e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            eَّۙ r4 = r0.f2681e
            eْٕؕ r1 = r0.f2682e
            defpackage.AbstractC2003e.purchase(r5)
            r5 = r4
            r4 = r1
            goto L3b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.AbstractC2003e.purchase(r5)
            eَّۙ r5 = new eَّۙ
            r5.<init>()
        L3b:
            boolean r1 = r4.yandex()
            if (r1 != 0) goto L59
            eَّۙ r1 = r4.billing()
            r5.inmobi(r1)
            r0.f2682e = r4
            r0.f2681e = r5
            r0.f2683e = r2
            int r1 = defpackage.AbstractC4912e.ad
            java.lang.Object r1 = r4.license(r2, r0)
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            if (r1 != r3) goto L3b
            return r3
        L59:
            java.lang.Throwable r4 = r4.vip()
            if (r4 != 0) goto L60
            return r5
        L60:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.admob(eْٕؕ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable ads(defpackage.InterfaceC13033e r4, defpackage.AbstractC10731e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C8036e
            if (r0 == 0) goto L13
            r0 = r5
            eًٚۙ r0 = (defpackage.C8036e) r0
            int r1 = r0.f16326e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16326e = r1
            goto L18
        L13:
            eًٚۙ r0 = new eًٚۙ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f16327e
            int r1 = r0.f16326e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L3b
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            r0.f16326e = r2
            java.lang.Object r5 = admob(r4, r0)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r5 != r4) goto L3b
            return r4
        L3b:
            eَّۙ r5 = (defpackage.C12402e) r5
            long r0 = r5.f24832e
            int r4 = (int) r0
            byte[] r4 = defpackage.AbstractC12731e.metrica(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.ads(eْٕؕ, eُؑ۠):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x02b1, code lost:
    
        r12 = r24;
        r6 = r7;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x010a, code lost:
    
        if (r32.license(1, r2) == r12) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0296 -> B:41:0x029f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object advert(defpackage.InterfaceC13033e r32, defpackage.C17466e r33, long r34, boolean r36, boolean r37, defpackage.AbstractC10731e r38) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.advert(eْٕؕ, e٘ؐۧ, long, boolean, boolean, eُؑ۠):java.lang.Object");
    }

    public static final void amazon(InterfaceC17430e interfaceC17430e, Appendable appendable, C7142e c7142e, long j) {
        if (j > 0) {
            interfaceC17430e.admob(j);
            appendable.append(AbstractC5756e.ad(interfaceC17430e.metrica(), j));
            c7142e.f14622e += r2.length();
        }
    }

    public static final int applovin(C12452e c12452e) {
        int metrica;
        int i = c12452e.vip;
        int metrica2 = c12452e.metrica(0);
        while (c12452e.vip != 0 && c12452e.metrica(0) == metrica2) {
            c12452e.purchase(0, c12452e.license());
            c12452e.appmetrica(c12452e.vip - 1);
            int i2 = c12452e.vip;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int metrica3 = c12452e.metrica(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int metrica4 = c12452e.metrica(i6);
                if (i5 >= i2 || (metrica = c12452e.metrica(i5)) <= metrica4) {
                    if (metrica4 > metrica3) {
                        c12452e.purchase(i4, metrica4);
                        c12452e.purchase(i6, metrica3);
                        i4 = i6;
                    }
                } else if (metrica > metrica3) {
                    c12452e.purchase(i4, metrica);
                    c12452e.purchase(i5, metrica3);
                    i4 = i5;
                }
            }
        }
        return metrica2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        if (r0 != r8) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #2 {all -> 0x009e, blocks: (B:25:0x0067, B:27:0x006d, B:34:0x00a4, B:39:0x00c0), top: B:24:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4 A[Catch: all -> 0x009e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x009e, blocks: (B:25:0x0067, B:27:0x006d, B:34:0x00a4, B:39:0x00c0), top: B:24:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r14v0, types: [eْٕؕ] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [eًؓؗ] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v5, types: [eًؓؗ] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [eٍٖۘ] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [eًؗۖ, eٍٖۘ] */
    /* JADX WARN: Type inference failed for: r1v6, types: [eٍٖۘ, eُؑ۠] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [eْٕؕ] */
    /* JADX WARN: Type inference failed for: r2v4, types: [eْٕؕ] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009b -> B:23:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object appmetrica(defpackage.InterfaceC13033e r14, defpackage.C4070e r15, defpackage.AbstractC10731e r16) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.appmetrica(eْٕؕ, eّؖۢ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (r0 != r8) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #0 {all -> 0x00a2, blocks: (B:25:0x006b, B:27:0x0071), top: B:24:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r11v1, types: [eْٕؕ] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [eْٕؕ] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [eٍؑٛ] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [eٍؑٛ, eُؑ۠] */
    /* JADX WARN: Type inference failed for: r1v8, types: [eٍؑٛ, eُؑ۠] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [eًؓؗ] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [eًؓؗ] */
    /* JADX WARN: Type inference failed for: r2v5, types: [eًؓؗ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009f -> B:23:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object billing(defpackage.InterfaceC13033e r16, defpackage.InterfaceC1618e r17, defpackage.AbstractC10731e r18) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.billing(eْٕؕ, eًؓؗ, eُؑ۠):java.lang.Object");
    }

    public static final C11614e inmobi(InterfaceC18435e interfaceC18435e, InterfaceC8850e interfaceC8850e, C4070e c4070e, Function2 function2) {
        C8419e purchase = AbstractC5336e.purchase(interfaceC18435e, interfaceC8850e, 0, new C9409e(function2, c4070e, null, 0), 2);
        purchase.mo692else(new C9693e(c4070e, 1));
        return new C11614e(new C0673e(c4070e, new C0593e(purchase, null, 0)), purchase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (yandex(r5, r6, r0) == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r7 == r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object isPro(defpackage.InterfaceC13033e r5, defpackage.C17713e r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C11777e
            if (r0 == 0) goto L13
            r0 = r7
            eِٖۨ r0 = (defpackage.C11777e) r0
            int r1 = r0.f23652e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23652e = r1
            goto L18
        L13:
            eِٖۨ r0 = new eِٖۨ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23653e
            int r1 = r0.f23652e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            eْ٘ؒ r6 = r0.f23650e
            eْٕؕ r5 = r0.f23651e
            defpackage.AbstractC2003e.purchase(r7)
            goto L4d
        L3a:
            defpackage.AbstractC2003e.purchase(r7)
            byte[] r7 = r6.f34722e
            int r7 = r7.length
            r0.f23651e = r5
            r0.f23650e = r6
            r0.f23652e = r3
            java.lang.Comparable r7 = loadAd(r5, r7, r0)
            if (r7 != r4) goto L4d
            goto L64
        L4d:
            boolean r7 = defpackage.AbstractC7890e.billing(r7, r6)
            if (r7 == 0) goto L68
            byte[] r6 = r6.f34722e
            int r6 = r6.length
            long r6 = (long) r6
            r1 = 0
            r0.f23651e = r1
            r0.f23650e = r1
            r0.f23652e = r2
            java.lang.Object r5 = yandex(r5, r6, r0)
            if (r5 != r4) goto L65
        L64:
            return r4
        L65:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L68:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.isPro(eْٕؕ, eْ٘ؒ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object isVip(defpackage.InterfaceC13033e r4, defpackage.AbstractC10731e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C6661e
            if (r0 == 0) goto L13
            r0 = r5
            eؙۛۨ r0 = (defpackage.C6661e) r0
            int r1 = r0.f13752e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13752e = r1
            goto L18
        L13:
            eؙۛۨ r0 = new eؙۛۨ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13750e
            int r1 = r0.f13752e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eْٕؕ r4 = r0.f13751e
            defpackage.AbstractC2003e.purchase(r5)
            goto L40
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r5)
            r0.f13751e = r4
            r0.f13752e = r2
            r5 = 2
            java.lang.Object r5 = vip(r4, r5, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L40
            return r0
        L40:
            eَّۙ r4 = r4.billing()
            short r4 = r4.readShort()
            java.lang.Short r5 = new java.lang.Short
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.isVip(eْٕؕ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object license(defpackage.AbstractC16824e r4, java.nio.charset.Charset r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C6551e
            if (r0 == 0) goto L13
            r0 = r6
            eؙٞۨ r0 = (defpackage.C6551e) r0
            int r1 = r0.f13481e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13481e = r1
            goto L18
        L13:
            eؙٞۨ r0 = new eؙٞۨ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13479e
            int r1 = r0.f13481e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.nio.charset.CharsetDecoder r4 = r0.f13480e
            defpackage.AbstractC2003e.purchase(r6)
            goto L7a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            eً٘ۤ r6 = r4.ad()
            java.lang.String r1 = "Content-Type"
            java.lang.String r6 = r6.mo459e(r1)
            r1 = 0
            if (r6 == 0) goto L46
            eٜؓؗ r3 = defpackage.C1622e.f4539e
            eٜؓؗ r6 = defpackage.AbstractC6227e.metrica(r6)
            goto L47
        L46:
            r6 = r1
        L47:
            if (r6 == 0) goto L4e
            java.nio.charset.Charset r6 = defpackage.AbstractC9757e.ad(r6)
            goto L4f
        L4e:
            r6 = r1
        L4f:
            if (r6 != 0) goto L52
            goto L53
        L52:
            r5 = r6
        L53:
            java.nio.charset.CharsetDecoder r5 = r5.newDecoder()
            eؗٝٝ r4 = r4.vip()
            eؙّؔ r6 = defpackage.AbstractC3820e.ad
            java.lang.Class<eٜٗۧ> r3 = defpackage.InterfaceC17430e.class
            eؚ٘ٚ r6 = r6.vip(r3)
            eٓٔۖ r1 = defpackage.AbstractC3820e.ad(r3)     // Catch: java.lang.Throwable -> L67
        L67:
            eِ۟ۥ r3 = new eِ۟ۥ
            r3.<init>(r6, r1)
            r0.f13480e = r5
            r0.f13481e = r2
            java.lang.Object r6 = r4.ad(r3, r0)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r6 != r4) goto L79
            return r4
        L79:
            r4 = r5
        L7a:
            if (r6 == 0) goto L83
            eٜٗۧ r6 = (defpackage.InterfaceC17430e) r6
            java.lang.String r4 = defpackage.AbstractC16540e.vip(r4, r6)
            return r4
        L83:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.io.Source"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.license(eؘٗٙ, java.nio.charset.Charset, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable loadAd(defpackage.InterfaceC13033e r4, int r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C14819e
            if (r0 == 0) goto L13
            r0 = r6
            eؚٔٛ r0 = (defpackage.C14819e) r0
            int r1 = r0.f29348e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29348e = r1
            goto L18
        L13:
            eؚٔٛ r0 = new eؚٔٛ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29349e
            int r1 = r0.f29348e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            int r5 = r0.f29346e
            eْٕؕ r4 = r0.f29347e
            defpackage.AbstractC2003e.purchase(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.AbstractC2003e.purchase(r6)
            boolean r6 = r4.yandex()
            if (r6 == 0) goto L3b
            goto L52
        L3b:
            r0.f29347e = r4
            r0.f29346e = r5
            r0.f29348e = r2
            java.lang.Object r6 = r4.license(r5, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L4a
            return r0
        L4a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L54
        L52:
            r4 = 0
            return r4
        L54:
            eَّۙ r4 = r4.billing()
            r4.getClass()
            eٍؘ٘ r6 = new eٍؘ٘
            r6.<init>(r4)
            eؕؑۗ r4 = new eؕؑۗ
            r4.<init>(r6)
            byte[] r4 = defpackage.AbstractC12731e.metrica(r4, r5)
            eْ٘ؒ r5 = new eْ٘ؒ
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.loadAd(eْٕؕ, int, eُؑ۠):java.lang.Comparable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(defpackage.AbstractC16824e r4, defpackage.AbstractC10731e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C13209e
            if (r0 == 0) goto L13
            r0 = r5
            eِْٛ r0 = (defpackage.C13209e) r0
            int r1 = r0.f26213e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26213e = r1
            goto L18
        L13:
            eِْٛ r0 = new eِْٛ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f26214e
            int r1 = r0.f26213e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L52
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            eؗٝٝ r4 = r4.vip()
            eؙّؔ r5 = defpackage.AbstractC3820e.ad
            java.lang.Class<eْٕؕ> r1 = defpackage.InterfaceC13033e.class
            eؚ٘ٚ r5 = r5.vip(r1)
            eٓٔۖ r1 = defpackage.AbstractC3820e.ad(r1)     // Catch: java.lang.Throwable -> L41
            goto L42
        L41:
            r1 = 0
        L42:
            eِ۟ۥ r3 = new eِ۟ۥ
            r3.<init>(r5, r1)
            r0.f26213e = r2
            java.lang.Object r5 = r4.ad(r3, r0)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r5 != r4) goto L52
            return r4
        L52:
            if (r5 == 0) goto L57
            eْٕؕ r5 = (defpackage.InterfaceC13033e) r5
            return r5
        L57:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.metrica(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    public static final InterfaceC4393e mopub(AbstractC16824e abstractC16824e) {
        InterfaceC4393e interfaceC4393e = abstractC16824e.vip().f10751e;
        if (interfaceC4393e != null) {
            return interfaceC4393e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:11:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0062 -> B:10:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object pro(defpackage.InterfaceC13033e r10, int r11, defpackage.AbstractC10731e r12) {
        /*
            boolean r0 = r12 instanceof defpackage.C1278e
            if (r0 == 0) goto L13
            r0 = r12
            eؒۘ۠ r0 = (defpackage.C1278e) r0
            int r1 = r0.f3985e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3985e = r1
            goto L18
        L13:
            eؒۘ۠ r0 = new eؒۘ۠
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f3987e
            int r1 = r0.f3985e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            int r10 = r0.f3988e
            eَّۙ r11 = r0.f3984e
            eْٕؕ r1 = r0.f3986e
            defpackage.AbstractC2003e.purchase(r12)
            goto L64
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            defpackage.AbstractC2003e.purchase(r12)
            eَّۙ r12 = new eَّۙ
            r12.<init>()
            r9 = r12
            r12 = r11
            r11 = r9
        L3e:
            long r3 = r11.f24832e
            long r5 = (long) r12
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L95
            eَّۙ r1 = r10.billing()
            boolean r1 = r1.yandex()
            if (r1 == 0) goto L66
            r0.f3986e = r10
            r0.f3984e = r11
            r0.f3988e = r12
            r0.f3985e = r2
            int r1 = defpackage.AbstractC4912e.ad
            java.lang.Object r1 = r10.license(r2, r0)
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            if (r1 != r3) goto L62
            return r3
        L62:
            r1 = r10
            r10 = r12
        L64:
            r12 = r10
            r10 = r1
        L66:
            boolean r1 = r10.yandex()
            if (r1 != 0) goto L95
            eَّۙ r1 = r10.billing()
            r1.getClass()
            long r3 = r1.f24832e
            long r5 = (long) r12
            long r7 = r11.f24832e
            long r7 = r5 - r7
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L89
            eَّۙ r1 = r10.billing()
            long r3 = r11.f24832e
            long r5 = r5 - r3
            r1.advert(r11, r5)
            goto L3e
        L89:
            eَّۙ r1 = r10.billing()
            long r3 = r1.ads(r11)
            defpackage.AbstractC3192e.vip(r3)
            goto L3e
        L95:
            long r0 = r11.f24832e
            long r2 = (long) r12
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 < 0) goto L9d
            return r11
        L9d:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r12 = defpackage.AbstractC4653e.premium(r0, r12, r1)
            long r0 = r11.f24832e
            java.lang.String r11 = " available"
            java.lang.String r11 = defpackage.AbstractC5087e.m1750native(r0, r11, r12)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.pro(eْٕؕ, int, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r1.license(r6, r13) == r8) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r0 != r8) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [eٖٕۧ] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [eٖٕۧ, eُؑ۠] */
    /* JADX WARN: Type inference failed for: r1v8, types: [eٖٕۧ, eُؑ۠] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [eًؓؗ] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [eًؓؗ] */
    /* JADX WARN: Type inference failed for: r2v5, types: [eًؓؗ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d1 -> B:23:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object purchase(defpackage.InterfaceC13033e r17, defpackage.InterfaceC1618e r18, long r19, defpackage.AbstractC10731e r21) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.purchase(eْٕؕ, eًؓؗ, long, eُؑ۠):java.lang.Object");
    }

    public static Object remoteconfig(InterfaceC13033e interfaceC13033e, C17466e c17466e, AbstractC10731e abstractC10731e) {
        return advert(interfaceC13033e, c17466e, 8192L, false, true, abstractC10731e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object signatures(defpackage.InterfaceC13033e r10, long r11, defpackage.AbstractC10731e r13) {
        /*
            boolean r0 = r13 instanceof defpackage.C3969e
            if (r0 == 0) goto L13
            r0 = r13
            eؚؖۘ r0 = (defpackage.C3969e) r0
            int r1 = r0.f8857e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8857e = r1
            goto L18
        L13:
            eؚؖۘ r0 = new eؚؖۘ
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f8855e
            int r1 = r0.f8857e
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            long r10 = r0.f8858e
            long r3 = r0.f8859e
            eَّۙ r12 = r0.f8854e
            eْٕؕ r1 = r0.f8856e
            defpackage.AbstractC2003e.purchase(r13)
            r13 = r12
            r11 = r10
            r10 = r1
            r8 = r3
            r3 = r0
            r0 = r8
            goto L45
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            defpackage.AbstractC2003e.purchase(r13)
            eَّۙ r13 = new eَّۙ
            r13.<init>()
            r3 = r0
            r0 = r11
        L45:
            boolean r4 = r10.yandex()
            if (r4 != 0) goto L93
            r4 = 0
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L93
            eَّۙ r6 = r10.billing()
            r6.getClass()
            long r6 = r6.f24832e
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 < 0) goto L75
            eَّۙ r4 = r10.billing()
            r4.getClass()
            long r4 = r4.f24832e
            long r4 = r11 - r4
            eَّۙ r11 = r10.billing()
            long r11 = r11.ads(r13)
            defpackage.AbstractC3192e.vip(r11)
            goto L7c
        L75:
            eَّۙ r6 = r10.billing()
            r6.advert(r13, r11)
        L7c:
            r3.f8856e = r10
            r3.f8854e = r13
            r3.f8859e = r0
            r3.f8858e = r4
            r3.f8857e = r2
            int r11 = defpackage.AbstractC4912e.ad
            java.lang.Object r11 = r10.license(r2, r3)
            eٟؔۙ r12 = defpackage.EnumC2821e.f6782e
            if (r11 != r12) goto L91
            return r12
        L91:
            r11 = r4
            goto L45
        L93:
            r13.metrica()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.signatures(eْٕؕ, long, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (((java.lang.Boolean) r12).booleanValue() == false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object smaato(defpackage.InterfaceC17430e r9, defpackage.InterfaceC13033e r10, boolean r11, defpackage.AbstractC10731e r12) {
        /*
            boolean r0 = r12 instanceof defpackage.C4054e
            if (r0 == 0) goto L13
            r0 = r12
            eِؖۛ r0 = (defpackage.C4054e) r0
            int r1 = r0.f9008e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9008e = r1
            goto L18
        L13:
            eِؖۛ r0 = new eِؖۛ
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f9009e
            int r1 = r0.f9008e
            r2 = 1
            r4 = 2
            r6 = 1
            if (r1 == 0) goto L35
            if (r1 != r6) goto L2d
            boolean r11 = r0.f9006e
            eٜٗۧ r9 = r0.f9007e
            defpackage.AbstractC2003e.purchase(r12)
            goto L52
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.AbstractC2003e.purchase(r12)
            eَّۙ r12 = r9.metrica()
            long r7 = r12.f24832e
            int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r12 >= 0) goto L5a
            r0.f9007e = r9
            r0.f9006e = r11
            r0.f9008e = r6
            r12 = 2
            java.lang.Object r12 = r10.license(r12, r0)
            eٟؔۙ r10 = defpackage.EnumC2821e.f6782e
            if (r12 != r10) goto L52
            return r10
        L52:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
            if (r10 == 0) goto L6c
        L5a:
            eَّۙ r10 = r9.metrica()
            byte r10 = r10.license(r2)
            r12 = 10
            if (r10 != r12) goto L6c
            defpackage.AbstractC1358e.appmetrica(r9, r4)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L6c:
            if (r11 == 0) goto L74
            defpackage.AbstractC1358e.appmetrica(r9, r2)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L74:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.smaato(eٜٗۧ, eْٕؕ, boolean, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object startapp(defpackage.InterfaceC13033e r4, long r5, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C7451e
            if (r0 == 0) goto L13
            r0 = r7
            eٌؚۛ r0 = (defpackage.C7451e) r0
            int r1 = r0.f15229e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15229e = r1
            goto L18
        L13:
            eٌؚۛ r0 = new eٌؚۛ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15227e
            int r1 = r0.f15229e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            long r5 = r0.f15228e
            defpackage.AbstractC2003e.purchase(r7)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r7)
            r0.f15228e = r5
            r0.f15229e = r2
            java.lang.Object r7 = yandex(r4, r5, r0)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r7 != r4) goto L3f
            return r4
        L3f:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 < 0) goto L4c
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L4c:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r7 = "Unable to discard "
            java.lang.String r0 = " bytes"
            java.lang.String r5 = defpackage.AbstractC1634e.mopub(r5, r7, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.startapp(eْٕؕ, long, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r0v2, types: [eًٍ۟, eُؑ۠] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [eْٕؕ] */
    /* JADX WARN: Type inference failed for: r5v8, types: [eٜٗۧ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object subscription(defpackage.InterfaceC13033e r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C8241e
            if (r0 == 0) goto L13
            r0 = r6
            eًٍ۟ r0 = (defpackage.C8241e) r0
            int r1 = r0.f16742e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16742e = r1
            goto L18
        L13:
            eًٍ۟ r0 = new eًٍ۟
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16740e
            int r1 = r0.f16742e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eٜٗۧ r5 = r0.f16741e
            defpackage.AbstractC2003e.purchase(r6)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            eَّۙ r6 = r5.billing()
            boolean r1 = r6.yandex()
            if (r1 == 0) goto L60
            r0.f16741e = r6
            r0.f16742e = r2
            int r1 = defpackage.AbstractC4912e.ad
            java.lang.Object r5 = r5.license(r2, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L4b
            return r0
        L4b:
            r4 = r6
            r6 = r5
            r5 = r4
        L4e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L58
            r6 = r5
            goto L60
        L58:
            java.io.EOFException r5 = new java.io.EOFException
            java.lang.String r6 = "Not enough data available"
            r5.<init>(r6)
            throw r5
        L60:
            byte r5 = r6.readByte()
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.subscription(eْٕؕ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object tapsense(defpackage.InterfaceC13033e r4, defpackage.AbstractC10731e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C8285e
            if (r0 == 0) goto L13
            r0 = r5
            eًْۢ r0 = (defpackage.C8285e) r0
            int r1 = r0.f16955e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16955e = r1
            goto L18
        L13:
            eًْۢ r0 = new eًْۢ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f16956e
            int r1 = r0.f16955e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            eَّۙ r4 = r0.f16953e
            eْٕؕ r1 = r0.f16954e
            defpackage.AbstractC2003e.purchase(r5)
            r5 = r4
            r4 = r1
            goto L3b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.AbstractC2003e.purchase(r5)
            eَّۙ r5 = new eَّۙ
            r5.<init>()
        L3b:
            boolean r1 = r4.yandex()
            if (r1 != 0) goto L59
            eَّۙ r1 = r4.billing()
            r5.inmobi(r1)
            r0.f16954e = r4
            r0.f16953e = r5
            r0.f16955e = r2
            int r1 = defpackage.AbstractC4912e.ad
            java.lang.Object r1 = r4.license(r2, r0)
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            if (r1 != r3) goto L3b
            return r3
        L59:
            java.lang.Throwable r4 = r4.vip()
            if (r4 != 0) goto L63
            r5.metrica()
            return r5
        L63:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.tapsense(eْٕؕ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.InterfaceC13033e r4, int r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C6634e
            if (r0 == 0) goto L13
            r0 = r6
            eؙۚٗ r0 = (defpackage.C6634e) r0
            int r1 = r0.f13698e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13698e = r1
            goto L18
        L13:
            eؙۚٗ r0 = new eؙۚٗ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13699e
            int r1 = r0.f13698e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)
            goto L3b
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f13698e = r2
            java.lang.Object r6 = r4.license(r5, r0)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r6 != r4) goto L3b
            return r4
        L3b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L46
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L46:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r5 = "Not enough data available"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.vip(eْٕؕ, int, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:11:0x006d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:10:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object yandex(defpackage.InterfaceC13033e r8, long r9, defpackage.AbstractC10731e r11) {
        /*
            boolean r0 = r11 instanceof defpackage.C0165e
            if (r0 == 0) goto L13
            r0 = r11
            eؚؑٔ r0 = (defpackage.C0165e) r0
            int r1 = r0.f1397e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1397e = r1
            goto L18
        L13:
            eؚؑٔ r0 = new eؚؑٔ
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f1399e
            int r1 = r0.f1397e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            long r8 = r0.f1400e
            long r3 = r0.f1396e
            eْٕؕ r10 = r0.f1398e
            defpackage.AbstractC2003e.purchase(r11)
            goto L68
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.AbstractC2003e.purchase(r11)
            r11 = r0
            r0 = r9
        L38:
            r3 = 0
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 <= 0) goto L83
            boolean r3 = r8.yandex()
            if (r3 != 0) goto L83
            eَّۙ r3 = r8.billing()
            r3.getClass()
            long r3 = r3.f24832e
            int r3 = (int) r3
            if (r3 != 0) goto L6d
            r11.f1398e = r8
            r11.f1396e = r0
            r11.f1400e = r9
            r11.f1397e = r2
            int r3 = defpackage.AbstractC4912e.ad
            java.lang.Object r3 = r8.license(r2, r11)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r3 != r4) goto L63
            return r4
        L63:
            r3 = r9
            r10 = r8
            r8 = r3
            r3 = r0
            r0 = r11
        L68:
            r6 = r8
            r8 = r10
            r9 = r6
            r11 = r0
            r0 = r3
        L6d:
            eَّۙ r3 = r8.billing()
            r3.getClass()
            long r3 = r3.f24832e
            long r3 = java.lang.Math.min(r9, r3)
            eَّۙ r5 = r8.billing()
            defpackage.AbstractC1358e.appmetrica(r5, r3)
            long r9 = r9 - r3
            goto L38
        L83:
            long r0 = r0 - r9
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11263e.yandex(eْٕؕ, long, eُؑ۠):java.lang.Object");
    }
}
