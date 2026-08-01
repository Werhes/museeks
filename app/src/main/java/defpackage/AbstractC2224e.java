package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۥۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2224e {
    public static final Field ad;
    public static float appmetrica;
    public static int license;
    public static Boolean metrica;
    public static final Method vip;

    static {
        try {
            vip = AbstractC12501e.metrica(Class.forName("android.os.SystemProperties"), String.class);
            Field field = null;
            NoSuchFieldException e = null;
            for (Class<Build.VERSION> cls = Build.VERSION.class; cls != null; cls = cls.getSuperclass()) {
                try {
                    field = cls.getDeclaredField("SEM_PLATFORM_INT");
                    break;
                } catch (NoSuchFieldException e2) {
                    e = e2;
                }
            }
            if (field == null) {
                throw e;
            }
            field.setAccessible(true);
            ad = field;
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
        }
    }

    public static String ad(String str) {
        try {
            return (String) vip.invoke(null, str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static boolean metrica() {
        int i;
        if (metrica != null) {
            return !TextUtils.isEmpty(ad("ro.config.knox")) && metrica.booleanValue();
        }
        try {
            i = ad.getInt(null);
        } catch (Throwable unused) {
            metrica = Boolean.FALSE;
        }
        if (i < 100000) {
            metrica = Boolean.FALSE;
            return false;
        }
        license = (i - 90000) / ModuleDescriptor.MODULE_VERSION;
        appmetrica = (r0 % ModuleDescriptor.MODULE_VERSION) / 100;
        metrica = Boolean.TRUE;
        return metrica.booleanValue();
    }

    public static boolean vip(Context context, Intent intent) {
        return (intent == null || context.getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }
}
