package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۢۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16588e {
    public static final C17713e ad;
    public static final C17713e vip;

    static {
        byte[] appmetrica = AbstractC1266e.appmetrica("\r\n", AbstractC5508e.ad);
        ad = new C17713e(appmetrica, 0, appmetrica.length);
        vip = new C17713e(new byte[]{45, 45});
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x010e, code lost:
    
        if (r5.metrica(r6) != r11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        if (r8 == r11) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C17713e r19, defpackage.C7318e r20, defpackage.C4070e r21, defpackage.C12695e r22, long r23, defpackage.AbstractC10731e r25) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16588e.ad(eْ٘ؒ, eؚٝۚ, eّؖۢ, eّْۘ, long, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object license(defpackage.InterfaceC13033e r4, defpackage.C17713e r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C11343e
            if (r0 == 0) goto L13
            r0 = r6
            eُّۢ r0 = (defpackage.C11343e) r0
            int r1 = r0.f22813e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22813e = r1
            goto L18
        L13:
            eُّۢ r0 = new eُّۢ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f22811e
            int r1 = r0.f22813e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eْ٘ؒ r5 = r0.f22812e
            defpackage.AbstractC2003e.purchase(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f22812e = r5
            r0.f22813e = r2
            java.lang.Object r6 = defpackage.AbstractC11263e.isPro(r4, r5, r0)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r6 != r4) goto L3f
            return r4
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L4c
            byte[] r4 = r5.f34722e
            int r4 = r4.length
            long r4 = (long) r4
            goto L4e
        L4c:
            r4 = 0
        L4e:
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16588e.license(eْٕؕ, eْ٘ؒ, eُؑ۠):java.lang.Object");
    }

    public static final void metrica(C3967e c3967e, byte[] bArr, byte b) {
        int i = c3967e.f8852e;
        if (i >= bArr.length) {
            throw new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        }
        c3967e.f8852e = i + 1;
        bArr[i] = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:11:0x0023, B:12:0x0050, B:16:0x0055, B:17:0x005c), top: B:10:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.C7318e r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C14855e
            if (r0 == 0) goto L13
            r0 = r6
            eٔٝ۠ r0 = (defpackage.C14855e) r0
            int r1 = r0.f29398e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29398e = r1
            goto L18
        L13:
            eٔٝ۠ r0 = new eٔٝ۠
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29396e
            int r1 = r0.f29398e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            e٘ؐۧ r5 = r0.f29397e
            defpackage.AbstractC2003e.purchase(r6)     // Catch: java.lang.Throwable -> L27
            goto L50
        L27:
            r6 = move-exception
            goto L63
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.AbstractC2003e.purchase(r6)
            e٘ؐۧ r6 = new e٘ؐۧ
            r6.<init>()
            r0.f29397e = r6     // Catch: java.lang.Throwable -> L61
            r0.f29398e = r2     // Catch: java.lang.Throwable -> L61
            eًّّ r1 = new eًّّ     // Catch: java.lang.Throwable -> L61
            r2 = 6
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r5 = defpackage.AbstractC8916e.metrica(r5, r6, r1, r0)     // Catch: java.lang.Throwable -> L61
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L4d
            return r0
        L4d:
            r4 = r6
            r6 = r5
            r5 = r4
        L50:
            eّْۘ r6 = (defpackage.C12695e) r6     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L55
            return r6
        L55:
            java.io.EOFException r6 = new java.io.EOFException     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = "Failed to parse multipart headers: unexpected end of stream"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L27
            throw r6     // Catch: java.lang.Throwable -> L27
        L5d:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L63
        L61:
            r5 = move-exception
            goto L5d
        L63:
            r5.license()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16588e.vip(eؚٝۚ, eُؑ۠):java.lang.Object");
    }
}
