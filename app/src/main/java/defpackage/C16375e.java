package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٝٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16375e {
    public static final C16375e ad = new Object();
    public static final long vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖٝٚ, java.lang.Object] */
    static {
        C17647e c17647e = C14157e.f27993e;
        vip = AbstractC0326e.Signature(1, EnumC15934e.DAYS);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:10)(2:33|34))(8:35|36|(1:(2:39|(1:41)(2:53|54))(1:55))(1:56)|42|(1:(1:45)(2:50|51))(1:52)|46|47|(1:49))|11|(1:13)|14|(5:17|(1:19)(1:25)|(2:21|22)(1:24)|23|15)|26|27|(2:29|30)(1:32)))|60|6|7|(0)(0)|11|(0)|14|(1:15)|26|27|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0027, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b6, code lost:
    
        r11 = new defpackage.C12763e(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:10:0x0023, B:11:0x0076, B:14:0x007b, B:15:0x008a, B:17:0x0090, B:19:0x00a2, B:23:0x00aa, B:36:0x0036, B:42:0x0053, B:46:0x0068, B:50:0x005e, B:51:0x0065, B:53:0x0046, B:54:0x004d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable ad(defpackage.EnumC14727e r11, defpackage.EnumC2947e r12, defpackage.AbstractC10731e r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.C4428e
            if (r0 == 0) goto L13
            r0 = r13
            eؖۡؖ r0 = (defpackage.C4428e) r0
            int r1 = r0.f9597e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9597e = r1
            goto L18
        L13:
            eؖۡؖ r0 = new eؖۡؖ
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f9596e
            int r1 = r0.f9597e
            eْۨٝ r2 = defpackage.C13664e.f27089e
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            defpackage.AbstractC2003e.purchase(r13)     // Catch: java.lang.Throwable -> L27
            goto L76
        L27:
            r0 = move-exception
            r11 = r0
            goto Lb6
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            defpackage.AbstractC2003e.purchase(r13)
            eْؕؖ r13 = new eْؕؖ     // Catch: java.lang.Throwable -> L27
            int r12 = r12.ordinal()     // Catch: java.lang.Throwable -> L27
            if (r12 == 0) goto L51
            if (r12 == r3) goto L4e
            r1 = 2
            if (r12 != r1) goto L46
            java.lang.String r12 = "large"
            goto L53
        L46:
            eٔٚؖ r11 = new eٔٚؖ     // Catch: java.lang.Throwable -> L27
            r12 = 10
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L27
            throw r11     // Catch: java.lang.Throwable -> L27
        L4e:
            java.lang.String r12 = "medium"
            goto L53
        L51:
            java.lang.String r12 = "small"
        L53:
            int r11 = r11.ordinal()     // Catch: java.lang.Throwable -> L27
            if (r11 == 0) goto L66
            if (r11 != r3) goto L5e
            java.lang.String r11 = "mymusic"
            goto L68
        L5e:
            eٔٚؖ r11 = new eٔٚؖ     // Catch: java.lang.Throwable -> L27
            r12 = 10
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L27
            throw r11     // Catch: java.lang.Throwable -> L27
        L66:
            java.lang.String r11 = "recomms"
        L68:
            r13.<init>(r12, r11)     // Catch: java.lang.Throwable -> L27
            r0.f9597e = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r13 = r13.admob(r0)     // Catch: java.lang.Throwable -> L27
            eٟؔۙ r11 = defpackage.EnumC2821e.f6782e
            if (r13 != r11) goto L76
            return r11
        L76:
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L27
            if (r13 != 0) goto L7b
            r13 = r2
        L7b:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            r12 = 10
            int r12 = defpackage.AbstractC0746e.subscription(r13, r12)     // Catch: java.lang.Throwable -> L27
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r12 = r13.iterator()     // Catch: java.lang.Throwable -> L27
        L8a:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r13 == 0) goto Lbc
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> L27
            ua.itaysonlab.vkapi2.objects.music.AudioWidgetItem r13 = (ua.itaysonlab.vkapi2.objects.music.AudioWidgetItem) r13     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = r13.metrica     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r13.vip     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = r13.license     // Catch: java.lang.Throwable -> L27
            java.lang.String r8 = r13.appmetrica     // Catch: java.lang.Throwable -> L27
            ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb r13 = r13.ad     // Catch: java.lang.Throwable -> L27
            if (r13 == 0) goto La5
            java.lang.String r13 = r13.metrica     // Catch: java.lang.Throwable -> L27
            goto La6
        La5:
            r13 = 0
        La6:
            if (r13 != 0) goto Laa
            java.lang.String r13 = ""
        Laa:
            r7 = r13
            eؘّؓ r3 = new eؘّؓ     // Catch: java.lang.Throwable -> L27
            eًؑۤ r9 = defpackage.C0193e.f1409e     // Catch: java.lang.Throwable -> L27
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L27
            r11.add(r3)     // Catch: java.lang.Throwable -> L27
            goto L8a
        Lb6:
            eّۜۖ r12 = new eّۜۖ
            r12.<init>(r11)
            r11 = r12
        Lbc:
            java.lang.Throwable r12 = defpackage.C13523e.ad(r11)
            if (r12 != 0) goto Lc3
            r2 = r11
        Lc3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16375e.ad(eٔٔۤ, eؔۢۨ, eُؑ۠):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable vip(defpackage.C13355e r10, defpackage.EnumC2947e r11, defpackage.AbstractC10731e r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.C16596e
            if (r0 == 0) goto L13
            r0 = r12
            eٖۣٚ r0 = (defpackage.C16596e) r0
            int r1 = r0.f32549e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32549e = r1
            goto L18
        L13:
            eٖۣٚ r0 = new eٖۣٚ
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f32552e
            int r1 = r0.f32549e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            eْٛ r10 = r0.f32548e
            eْٛ r11 = r0.f32550e
            defpackage.AbstractC2003e.purchase(r12)
            r0 = r10
            r10 = r11
            goto L59
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            defpackage.AbstractC2003e.purchase(r12)
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r10.f26609e
            long r7 = defpackage.C16375e.vip
            long r7 = defpackage.C14157e.license(r7)
            long r7 = r7 + r5
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L72
            eٔٔۤ r12 = r10.f26610e
            r0.f32550e = r10
            r0.f32548e = r10
            r0.f32549e = r2
            java.io.Serializable r12 = r9.ad(r12, r11, r0)
            eٟؔۙ r11 = defpackage.EnumC2821e.f6782e
            if (r12 != r11) goto L58
            return r11
        L58:
            r0 = r10
        L59:
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r11 = r12.isEmpty()
            if (r11 == 0) goto L63
            java.util.List r12 = r10.f26611e
        L63:
            r2 = r12
            java.util.List r2 = (java.util.List) r2
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 9
            r1 = 0
            eْٛ r10 = defpackage.C13355e.vip(r0, r1, r2, r3, r5)
            return r10
        L72:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16375e.vip(eْٛ, eؔۢۨ, eُؑ۠):java.io.Serializable");
    }
}
