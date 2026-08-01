package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4833e {
    public static final C4662e ad = new C4662e(16);
    public static final C17519e license;
    public static final Object metrica;
    public static final ThreadPoolExecutor vip;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, ModuleDescriptor.MODULE_VERSION, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC4501e(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        vip = threadPoolExecutor;
        metrica = new Object();
        license = new C17519e(0);
    }

    public static String ad(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C10359e) list.get(i2)).billing);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #1 {all -> 0x00b5, all -> 0x0074, all -> 0x00a6, NameNotFoundException -> 0x00ab, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:23:0x0063, B:26:0x0070, B:28:0x0091, B:31:0x009d, B:36:0x0075, B:37:0x0078, B:38:0x0079, B:41:0x008c, B:44:0x00a7, B:45:0x00aa, B:47:0x002b, B:49:0x0033, B:52:0x0037, B:54:0x003b, B:56:0x0046, B:65:0x00ab, B:25:0x006a, B:40:0x0086), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #1 {all -> 0x00b5, all -> 0x0074, all -> 0x00a6, NameNotFoundException -> 0x00ab, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:23:0x0063, B:26:0x0070, B:28:0x0091, B:31:0x009d, B:36:0x0075, B:37:0x0078, B:38:0x0079, B:41:0x008c, B:44:0x00a7, B:45:0x00aa, B:47:0x002b, B:49:0x0033, B:52:0x0037, B:54:0x003b, B:56:0x0046, B:65:0x00ab, B:25:0x006a, B:40:0x0086), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #1 {all -> 0x00b5, all -> 0x0074, all -> 0x00a6, NameNotFoundException -> 0x00ab, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:23:0x0063, B:26:0x0070, B:28:0x0091, B:31:0x009d, B:36:0x0075, B:37:0x0078, B:38:0x0079, B:41:0x008c, B:44:0x00a7, B:45:0x00aa, B:47:0x002b, B:49:0x0033, B:52:0x0037, B:54:0x003b, B:56:0x0046, B:65:0x00ab, B:25:0x006a, B:40:0x0086), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[Catch: all -> 0x00b5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b5, all -> 0x0074, all -> 0x00a6, NameNotFoundException -> 0x00ab, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:23:0x0063, B:26:0x0070, B:28:0x0091, B:31:0x009d, B:36:0x0075, B:37:0x0078, B:38:0x0079, B:41:0x008c, B:44:0x00a7, B:45:0x00aa, B:47:0x002b, B:49:0x0033, B:52:0x0037, B:54:0x003b, B:56:0x0046, B:65:0x00ab, B:25:0x006a, B:40:0x0086), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C14836e vip(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            eؗؖ۟ r0 = defpackage.AbstractC4833e.ad
            java.lang.String r1 = "getFontSync"
            android.os.Trace.beginSection(r1)
            java.lang.Object r1 = r0.vip(r8)     // Catch: java.lang.Throwable -> Lb5
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> Lb5
            if (r1 == 0) goto L18
            eٜٔٞ r8 = new eٜٔٞ     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        L18:
            eؘؙۛ r10 = defpackage.AbstractC0050e.ad(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab java.lang.Throwable -> Lb5
            java.util.List r1 = r10.vip     // Catch: java.lang.Throwable -> Lb5
            int r10 = r10.ad     // Catch: java.lang.Throwable -> Lb5
            r2 = 1
            r3 = -3
            r4 = 0
            if (r10 == 0) goto L2b
            if (r10 == r2) goto L29
        L27:
            r10 = r3
            goto L4c
        L29:
            r10 = -2
            goto L4c
        L2b:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb5
            eِٔۛ[] r10 = (defpackage.C14959e[]) r10     // Catch: java.lang.Throwable -> Lb5
            if (r10 == 0) goto L4b
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lb5
            if (r5 != 0) goto L37
            goto L4b
        L37:
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lb5
            r6 = r4
        L39:
            if (r6 >= r5) goto L49
            r7 = r10[r6]     // Catch: java.lang.Throwable -> Lb5
            int r7 = r7.purchase     // Catch: java.lang.Throwable -> Lb5
            if (r7 == 0) goto L46
            if (r7 >= 0) goto L44
            goto L27
        L44:
            r10 = r7
            goto L4c
        L46:
            int r6 = r6 + 1
            goto L39
        L49:
            r10 = r4
            goto L4c
        L4b:
            r10 = r2
        L4c:
            if (r10 == 0) goto L57
            eٜٔٞ r8 = new eٜٔٞ     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        L57:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> Lb5
            if (r10 <= r2) goto L79
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb5
            r2 = 29
            if (r10 < r2) goto L79
            eؙٕؔ r10 = defpackage.AbstractC17174e.ad     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            android.os.Trace.beginSection(r10)     // Catch: java.lang.Throwable -> Lb5
            eؙٕؔ r10 = defpackage.AbstractC17174e.ad     // Catch: java.lang.Throwable -> L74
            android.graphics.Typeface r9 = r10.appmetrica(r9, r1, r11)     // Catch: java.lang.Throwable -> L74
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb5
            goto L8f
        L74:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb5
            throw r8     // Catch: java.lang.Throwable -> Lb5
        L79:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb5
            eِٔۛ[] r10 = (defpackage.C14959e[]) r10     // Catch: java.lang.Throwable -> Lb5
            eؙٕؔ r1 = defpackage.AbstractC17174e.ad     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "TypefaceCompat.createFromFontInfo"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> Lb5
            eؙٕؔ r1 = defpackage.AbstractC17174e.ad     // Catch: java.lang.Throwable -> La6
            android.graphics.Typeface r9 = r1.license(r9, r10, r11)     // Catch: java.lang.Throwable -> La6
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb5
        L8f:
            if (r9 == 0) goto L9d
            r0.metrica(r8, r9)     // Catch: java.lang.Throwable -> Lb5
            eٜٔٞ r8 = new eٜٔٞ     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        L9d:
            eٜٔٞ r8 = new eٜٔٞ     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        La6:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb5
            throw r8     // Catch: java.lang.Throwable -> Lb5
        Lab:
            eٜٔٞ r8 = new eٜٔٞ     // Catch: java.lang.Throwable -> Lb5
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        Lb5:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4833e.vip(java.lang.String, android.content.Context, java.util.List, int):eٜٔٞ");
    }
}
