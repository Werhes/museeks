package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؑؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1513e {
    public static final C2892e ad = new C2892e(-1817223554, false, new C11789e(27));
    public static final C2892e vip = new C2892e(-497599082, false, new C8580e(7));
    public static final C2892e metrica = new C2892e(-201574897, false, new C11789e(28));
    public static final C2892e license = new C2892e(-1147660974, false, new C11789e(29));
    public static final C2892e appmetrica = new C2892e(1789517518, false, new C8580e(8));

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v27, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(kotlin.jvm.functions.Function0 r26, defpackage.InterfaceC12864e r27, boolean r28, defpackage.InterfaceC16154e r29, defpackage.C3134e r30, defpackage.C4828e r31, defpackage.C7433e r32, defpackage.InterfaceC12123e r33, kotlin.jvm.functions.Function3 r34, defpackage.C13770e r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1513e.ad(kotlin.jvm.functions.Function0, eّۤۧ, boolean, eّٖؖ, eؕؕۧ, eِؗ۟, eًؚۚ, eِۦۦ, kotlin.jvm.functions.Function3, eٓؕۥ, int, int):void");
    }

    public static void appmetrica(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v3, types: [eِٖۢ, eّؑۥ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object billing(defpackage.C14720e r4, defpackage.AbstractC10731e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C7643e
            if (r0 == 0) goto L13
            r0 = r5
            eًؐ۟ r0 = (defpackage.C7643e) r0
            int r1 = r0.f15523e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15523e = r1
            goto L18
        L13:
            eًؐ۟ r0 = new eًؐ۟
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f15524e
            int r1 = r0.f15523e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            eِٖۢ r4 = r0.f15521e
            eٔٔٓ r0 = r0.f15522e
            defpackage.AbstractC2003e.purchase(r5)     // Catch: java.lang.Throwable -> L29
            goto L4f
        L29:
            r4 = move-exception
            goto L59
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.AbstractC2003e.purchase(r5)
            eِٖۢ r5 = new eِٖۢ     // Catch: java.lang.Throwable -> L57
            r5.<init>()     // Catch: java.lang.Throwable -> L57
            r0.f15522e = r4     // Catch: java.lang.Throwable -> L57
            r0.f15521e = r5     // Catch: java.lang.Throwable -> L57
            r0.f15523e = r2     // Catch: java.lang.Throwable -> L57
            eؗٔۙ r0 = r4.f29131e     // Catch: java.lang.Throwable -> L57
            r0.mo1689throw(r5)     // Catch: java.lang.Throwable -> L57
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L57
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
            r4 = r5
        L4f:
            r5 = 0
            defpackage.AbstractC18453e.ad(r0, r5)
            return r4
        L54:
            r0 = r4
            r4 = r5
            goto L59
        L57:
            r5 = move-exception
            goto L54
        L59:
            throw r4     // Catch: java.lang.Throwable -> L5a
        L5a:
            r5 = move-exception
            defpackage.AbstractC18453e.ad(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1513e.billing(eٔٔٓ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void license(kotlin.jvm.functions.Function0 r17, defpackage.InterfaceC12864e r18, boolean r19, defpackage.InterfaceC16154e r20, defpackage.C3134e r21, defpackage.InterfaceC12123e r22, kotlin.jvm.functions.Function3 r23, defpackage.C13770e r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1513e.license(kotlin.jvm.functions.Function0, eّۤۧ, boolean, eّٖؖ, eؕؕۧ, eِۦۦ, kotlin.jvm.functions.Function3, eٓؕۥ, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void metrica(kotlin.jvm.functions.Function0 r16, defpackage.InterfaceC12864e r17, boolean r18, defpackage.InterfaceC16154e r19, defpackage.C3134e r20, defpackage.C7433e r21, defpackage.InterfaceC12123e r22, defpackage.C2892e r23, defpackage.C13770e r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1513e.metrica(kotlin.jvm.functions.Function0, eّۤۧ, boolean, eّٖؖ, eؕؕۧ, eًؚۚ, eِۦۦ, eؔ۟ٓ, eٓؕۥ, int, int):void");
    }

    public static C15036e purchase(long j) {
        C9604e metrica2 = C9604e.purchase.metrica(C3618e.yandex(j), C3618e.billing(j), C3618e.appmetrica(j), C3618e.license(j));
        C9604e metrica3 = metrica2.metrica(C7519e.vip);
        double d = metrica3.ad;
        double d2 = metrica3.vip;
        double d3 = metrica3.metrica;
        double min = Math.min(d, Math.min(d2, d3));
        double max = Math.max(d, Math.max(d2, d3));
        double d4 = max - min;
        float f = (float) (((((d4 < 1.0E-7d ? Double.NaN : d == max ? (d2 - d3) / d4 : d2 == max ? ((d3 - d) / d4) + 2 : d3 == max ? ((d - d2) / d4) + 4 : 0.0d) * 60) % 360.0d) + 360.0d) % 360.0d);
        float f2 = (float) (max != 0.0d ? d4 / max : 0.0d);
        float f3 = (float) max;
        float f4 = metrica2.license;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        return new C15036e(f, f2, f3, f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(kotlin.jvm.functions.Function0 r26, defpackage.InterfaceC12864e r27, boolean r28, defpackage.InterfaceC16154e r29, defpackage.C3134e r30, defpackage.C4828e r31, defpackage.InterfaceC12123e r32, defpackage.C2892e r33, defpackage.C13770e r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1513e.vip(kotlin.jvm.functions.Function0, eّۤۧ, boolean, eّٖؖ, eؕؕۧ, eِؗ۟, eِۦۦ, eؔ۟ٓ, eٓؕۥ, int, int):void");
    }
}
