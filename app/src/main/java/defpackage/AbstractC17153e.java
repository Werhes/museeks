package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17153e {
    public static final InterfaceC4911e ad = AbstractC1213e.vip("io.ktor.server.cio.backend.ServerPipeline");
    public static final C12402e metrica;
    public static final byte[] vip;

    static {
        C12916e c12916e = new C12916e(23);
        C2394e c2394e = C2394e.f6116e;
        c12916e.m3415goto("HTTP/1.0", "Bad Request", 400);
        c12916e.applovin("Connection", "close");
        c12916e.applovin("Content-Type", "text/plain; charset=utf-8");
        vip = AbstractC12731e.license((C12402e) c12916e.f25784e, -1);
        C12916e c12916e2 = new C12916e(23);
        c12916e2.m3415goto("HTTP/1.0", "Bad Request", 400);
        c12916e2.applovin("Connection", "close");
        c12916e2.subscription();
        metrica = (C12402e) c12916e2.f25784e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eَّۙ, java.lang.Object] */
    public static final C12402e appmetrica(String str) {
        if (str == null) {
            C12402e c12402e = metrica;
            c12402e.getClass();
            return c12402e.ad();
        }
        byte[] bytes = str.getBytes(AbstractC5508e.ad);
        ?? obj = new Object();
        byte[] bArr = vip;
        obj.write(bArr, 0, bArr.length);
        String valueOf = String.valueOf(bytes.length);
        AbstractC1266e.purchase(obj, "Content-Length", 14, 8);
        AbstractC1266e.purchase(obj, ": ", 2, 8);
        AbstractC13083e.ad(obj, valueOf);
        obj.m3339goto((byte) 13);
        obj.m3339goto((byte) 10);
        obj.m3339goto((byte) 13);
        obj.m3339goto((byte) 10);
        obj.write(bytes, 0, bytes.length);
        return obj;
    }

    public static final boolean license(C4983e c4983e, C11123e c11123e) {
        if (c11123e == null && c4983e.equals(C4983e.billing)) {
            return true;
        }
        return c11123e == null ? !c4983e.equals(C4983e.purchase) : !c11123e.vip && c11123e.ad;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(defpackage.InterfaceC0888e r4, java.lang.String r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C14392e
            if (r0 == 0) goto L13
            r0 = r6
            eؚٓۧ r0 = (defpackage.C14392e) r0
            int r1 = r0.f28464e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28464e = r1
            goto L18
        L13:
            eؚٓۧ r0 = new eؚٓۧ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28465e
            int r1 = r0.f28464e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            eّؖۢ r4 = r0.f28462e
            eؙؒؑ r5 = r0.f28463e
            defpackage.AbstractC2003e.purchase(r6)
            goto L57
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.AbstractC2003e.purchase(r6)
            eّؖۢ r6 = new eّؖۢ
            r1 = 0
            r6.<init>(r1)
            java.lang.Object r1 = r4.amazon(r6)
            boolean r1 = r1 instanceof defpackage.C8870e
            if (r1 != 0) goto L5b
            eَّۙ r5 = appmetrica(r5)
            r0.f28463e = r4
            r0.f28462e = r6
            r0.f28464e = r2
            java.lang.Object r5 = defpackage.AbstractC12534e.startapp(r6, r5, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L55
            return r0
        L55:
            r5 = r4
            r4 = r6
        L57:
            r4.adcel()
            r4 = r5
        L5b:
            r5 = 0
            r4.startapp(r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17153e.metrica(eؙؒؑ, java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(1:(5:12|13|14|15|(1:31)(3:17|18|(2:20|21)(7:23|(2:25|26)|27|(1:29)|14|15|(0)(0))))(2:32|33))(7:34|35|27|(0)|14|15|(0)(0)))(3:36|18|(0)(0)))(3:37|15|(0)(0))))|45|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0037, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0038, code lost:
    
        r8 = r12;
        r10 = r9;
        r9 = r1;
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        if ((r11 instanceof defpackage.InterfaceC1618e) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
    
        ((defpackage.InterfaceC1618e) r11).ad(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
    
        r12 = r8;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0064, code lost:
    
        r12 = r8;
        r0 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0031, B:23:0x008b, B:27:0x00a0, B:35:0x0051), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [eَؘٜ] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [eَؘٜ, eُؑ۠] */
    /* JADX WARN: Type inference failed for: r0v9, types: [eَؘٜ, eُؑ۠] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [eَۖؐ] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [eٖٓٞ] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [long] */
    /* JADX WARN: Type inference failed for: r9v5, types: [eَۖؐ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b2 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.C14137e r9, long r10, defpackage.C11467e r12, defpackage.AbstractC10731e r13) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17153e.vip(eٖٓٞ, long, eِؒۜ, eُؑ۠):java.lang.Object");
    }
}
