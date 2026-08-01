package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18293e extends AbstractC15203e {
    public static Method appmetrica = null;
    public static Method license = null;
    public static Constructor metrica = null;
    public static boolean purchase = false;
    public static Class vip;

    public static void adcel() {
        Method method;
        Class<?> cls;
        Method method2;
        if (purchase) {
            return;
        }
        purchase = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        metrica = constructor;
        vip = cls;
        license = method2;
        appmetrica = method;
    }

    public static boolean startapp(Object obj, String str, int i, boolean z) {
        adcel();
        try {
            try {
                return ((Boolean) license.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
            } catch (InvocationTargetException e) {
                e = e;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            e = e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.AbstractC15203e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface license(android.content.Context r4, defpackage.C14959e[] r5, int r6) {
        /*
            r3 = this;
            int r0 = r5.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L7
            goto La1
        L7:
            eِٔۛ r5 = defpackage.AbstractC15203e.yandex(r5, r6)
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r5 = r5.ad     // Catch: java.io.IOException -> La1
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r6.openFileDescriptor(r5, r0, r2)     // Catch: java.io.IOException -> La1
            if (r5 != 0) goto L1f
            if (r5 == 0) goto La1
            r5.close()     // Catch: java.io.IOException -> La1
            return r2
        L1f:
            java.lang.String r6 = "/proc/self/fd/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            r0.<init>(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            int r6 = r5.getFd()     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            r0.append(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            java.lang.String r6 = r0.toString()     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            android.system.StructStat r0 = android.system.Os.stat(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            int r0 = r0.st_mode     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            if (r0 == 0) goto L47
            java.io.File r0 = new java.io.File     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            r0.<init>(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            goto L48
        L47:
            r0 = r2
        L48:
            if (r0 == 0) goto L5b
            boolean r6 = r0.canRead()     // Catch: java.lang.Throwable -> L59
            if (r6 != 0) goto L51
            goto L5b
        L51:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r0)     // Catch: java.lang.Throwable -> L59
            r5.close()     // Catch: java.io.IOException -> La1
            return r4
        L59:
            r4 = move-exception
            goto L98
        L5b:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L59
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L59
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L59
            java.io.File r4 = defpackage.AbstractC16994e.adcel(r4)     // Catch: java.lang.Throwable -> L8e
            if (r4 != 0) goto L6c
        L6a:
            r0 = r2
            goto L87
        L6c:
            boolean r0 = defpackage.AbstractC16994e.appmetrica(r4, r6)     // Catch: java.lang.RuntimeException -> L72 java.lang.Throwable -> L82
            if (r0 != 0) goto L76
        L72:
            r4.delete()     // Catch: java.lang.Throwable -> L8e
            goto L6a
        L76:
            java.lang.String r0 = r4.getPath()     // Catch: java.lang.RuntimeException -> L72 java.lang.Throwable -> L82
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r0)     // Catch: java.lang.RuntimeException -> L72 java.lang.Throwable -> L82
            r4.delete()     // Catch: java.lang.Throwable -> L8e
            goto L87
        L82:
            r0 = move-exception
            r4.delete()     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L87:
            r6.close()     // Catch: java.lang.Throwable -> L59
            r5.close()     // Catch: java.io.IOException -> La1
            return r0
        L8e:
            r4 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch: java.lang.Throwable -> L59
        L97:
            throw r4     // Catch: java.lang.Throwable -> L59
        L98:
            r5.close()     // Catch: java.lang.Throwable -> L9c
            goto La0
        L9c:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> La1
        La0:
            throw r4     // Catch: java.io.IOException -> La1
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18293e.license(android.content.Context, eِٔۛ[], int):android.graphics.Typeface");
    }

    @Override // defpackage.AbstractC15203e
    public Typeface metrica(Context context, C13078e c13078e, Resources resources, int i) {
        adcel();
        try {
            Object newInstance = metrica.newInstance(null);
            for (C18523e c18523e : c13078e.ad) {
                File adcel = AbstractC16994e.adcel(context);
                if (adcel == null) {
                    return null;
                }
                try {
                    if (!AbstractC16994e.license(adcel, resources, c18523e.purchase)) {
                        return null;
                    }
                    if (!startapp(newInstance, adcel.getPath(), c18523e.vip, c18523e.metrica)) {
                        return null;
                    }
                    adcel.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    adcel.delete();
                }
            }
            adcel();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) vip, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) appmetrica.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
