package defpackage;

import android.text.TextPaint;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5729e {
    public static final C2892e ad = new C2892e(1121833241, false, new C7156e(21));
    public static final C2892e vip = new C2892e(-248099526, false, new C7156e(22));
    public static final C2892e metrica = new C2892e(-1787666943, false, new C10417e(7));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(java.io.File r4, kotlin.jvm.functions.Function1 r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C13999e
            if (r0 == 0) goto L13
            r0 = r6
            eٕٓ٘ r0 = (defpackage.C13999e) r0
            int r1 = r0.f27726e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27726e = r1
            goto L18
        L13:
            eٕٓ٘ r0 = new eٕٓ٘
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27724e
            int r1 = r0.f27726e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.io.File r4 = r0.f27725e
            defpackage.AbstractC2003e.purchase(r6)     // Catch: java.io.IOException -> L27
            return r6
        L27:
            r5 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f27725e = r4     // Catch: java.io.IOException -> L27
            r0.f27726e = r2     // Catch: java.io.IOException -> L27
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.io.IOException -> L27
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r4 != r5) goto L41
            return r5
        L41:
            return r4
        L42:
            boolean r6 = r5 instanceof defpackage.C11506e
            if (r6 != 0) goto La3
            boolean r6 = r4.exists()
            if (r6 == 0) goto L9e
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L78
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L68
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L63
            java.io.IOException r4 = defpackage.AbstractC15268e.metrica(r4, r5)
            goto La2
        L63:
            java.io.IOException r4 = defpackage.AbstractC15268e.metrica(r4, r5)
            goto La2
        L68:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L73
            java.io.IOException r4 = defpackage.AbstractC15268e.metrica(r4, r5)
            goto La2
        L73:
            java.io.IOException r4 = defpackage.AbstractC15268e.metrica(r4, r5)
            goto La2
        L78:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L8e
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L89
            java.io.IOException r4 = defpackage.AbstractC15268e.metrica(r4, r5)
            goto La2
        L89:
            java.io.IOException r4 = defpackage.AbstractC15268e.metrica(r4, r5)
            goto La2
        L8e:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L99
            java.io.IOException r4 = defpackage.AbstractC15268e.metrica(r4, r5)
            goto La2
        L99:
            java.io.IOException r4 = defpackage.AbstractC15268e.metrica(r4, r5)
            goto La2
        L9e:
            java.io.IOException r4 = defpackage.AbstractC15268e.metrica(r4, r5)
        La2:
            throw r4
        La3:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5729e.ad(java.io.File, kotlin.jvm.functions.Function1, eُؑ۠):java.lang.Object");
    }

    public static final void license(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255));
    }

    public static EnumC17692e metrica(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return EnumC17692e.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return EnumC17692e.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return EnumC17692e.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return EnumC17692e.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return EnumC17692e.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static boolean vip(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
