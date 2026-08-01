package defpackage;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15268e {
    public static final C2892e ad = new C2892e(-210317182, false, new C10417e(5));
    public static final C2892e vip = new C2892e(1597193263, false, new C10417e(6));

    public static boolean ad(Object obj, Object obj2) {
        if (obj != obj2) {
            return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void appmetrica(defpackage.C12747e r13, defpackage.C11388e r14, defpackage.C7102e r15, defpackage.C16174e r16, defpackage.C11053e r17, defpackage.C10593e r18, defpackage.InterfaceC3542e r19, defpackage.InterfaceC11678e r20, defpackage.C13031e r21, defpackage.AbstractC10731e r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof defpackage.C1532e
            if (r1 == 0) goto L16
            r1 = r0
            eؓؒؒ r1 = (defpackage.C1532e) r1
            int r2 = r1.f4401e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f4401e = r2
        L14:
            r12 = r1
            goto L1c
        L16:
            eؓؒؒ r1 = new eؓؒؒ
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r12.f4402e
            int r1 = r12.f4401e
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 == r2) goto L2d
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2d:
            defpackage.AbstractC2003e.purchase(r0)
            eٔٚؖ r13 = new eٔٚؖ
            r14 = 9
            r13.<init>(r14)
            throw r13
        L38:
            defpackage.AbstractC2003e.purchase(r0)
            android.view.View r0 = r13.f25504e
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r1 < r3) goto L4a
            eٗؕۛ r1 = new eٗؕۛ
            r1.<init>(r0)
        L48:
            r8 = r1
            goto L5a
        L4a:
            r3 = 24
            if (r1 < r3) goto L54
            eؚْۤ r1 = new eؚْۤ
            r1.<init>(r0)
            goto L48
        L54:
            eٍؚؒ r1 = new eٍؚؒ
            r1.<init>(r0)
            goto L48
        L5a:
            r12.f4401e = r2
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            purchase(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15268e.appmetrica(eّۛۖ, eُۦؑ, eؚؚّ, eْٖٟ, eُ٘ؑ, eَۡٝ, eٟؕٝ, eُِۢ, eؘْؕ, eُؑ۠):void");
    }

    public static byte[] billing(AbstractC12699e abstractC12699e) {
        return abstractC12699e instanceof C4062e ? ((C7818e) ((C4062e) abstractC12699e).ad.f34141e).appmetrica() : ((C7818e) ((C17424e) C15619e.vip.yandex(abstractC12699e)).f34141e).appmetrica();
    }

    public static AbstractC12699e license(byte[] bArr) {
        try {
            C7818e m2324this = C7818e.m2324this(bArr, C5712e.ad());
            C15619e c15619e = C15619e.vip;
            C15768e ad2 = AbstractC6336e.ad(m2324this.firebase());
            C17424e c17424e = new C17424e(m2324this, ad2, 0);
            C6150e c6150e = (C6150e) c15619e.ad.get();
            c6150e.getClass();
            return !c6150e.license.containsKey(new C10567e(C17424e.class, ad2)) ? new C4062e(c17424e) : c15619e.vip(c17424e);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static IOException metrica(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.exists()) {
            return parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? vip(file, iOException) : vip(file, iOException) : parentFile.canWrite() ? vip(file, iOException) : vip(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? vip(file, iOException) : vip(file, iOException) : parentFile.canWrite() ? vip(file, iOException) : vip(file, iOException);
        }
        return vip(file, iOException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void purchase(defpackage.C12747e r16, defpackage.C11388e r17, defpackage.C7102e r18, defpackage.C16174e r19, kotlin.jvm.functions.Function1 r20, kotlin.jvm.functions.Function0 r21, defpackage.C0909e r22, defpackage.InterfaceC3542e r23, defpackage.InterfaceC11678e r24, kotlin.jvm.functions.Function1 r25, defpackage.AbstractC10731e r26) {
        /*
            r0 = r26
            boolean r1 = r0 instanceof defpackage.C6643e
            if (r1 == 0) goto L15
            r1 = r0
            eؙۛؒ r1 = (defpackage.C6643e) r1
            int r2 = r1.f13705e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f13705e = r2
            goto L1a
        L15:
            eؙۛؒ r1 = new eؙۛؒ
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f13706e
            int r2 = r1.f13705e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2b:
            defpackage.AbstractC2003e.purchase(r0)
            goto L57
        L2f:
            defpackage.AbstractC2003e.purchase(r0)
            eَۛۛ r4 = new eَۛۛ
            r15 = 0
            r9 = r16
            r6 = r17
            r7 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r8 = r22
            r5 = r23
            r13 = r24
            r14 = r25
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.f13705e = r3
            java.lang.Object r0 = defpackage.AbstractC9743e.appmetrica(r4, r1)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L57
            return
        L57:
            eٔٚؖ r0 = new eٔٚؖ
            r1 = 9
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15268e.purchase(eّۛۖ, eُۦؑ, eؚؚّ, eْٖٟ, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, eٍؚؒ, eٟؕٝ, eُِۢ, kotlin.jvm.functions.Function1, eُؑ۠):void");
    }

    public static IOException vip(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }
}
