package defpackage;

import android.app.Application;
import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5749e {
    public static final /* synthetic */ InterfaceC8614e[] ad = {AbstractC3820e.ad.startapp(new C11779e(C5749e.class, "appManagerDataStore", "getAppManagerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};

    public static final String ad(C5749e c5749e) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
        declaredMethod.setAccessible(true);
        return (String) declaredMethod.invoke(null, null);
    }

    public static final C11951e vip(C5749e c5749e, String str) {
        c5749e.getClass();
        return new C11951e("provider:" + str);
    }
}
