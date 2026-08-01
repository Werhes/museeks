package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٚۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8791e implements InterfaceC5673e {
    public final String ad;
    public AbstractC13438e appmetrica;
    public final C0576e license = AbstractC14533e.startapp(ad());
    public final Activity metrica;
    public final Context vip;

    public C8791e(String str, Context context, Activity activity) {
        this.ad = str;
        this.vip = context;
        this.metrica = activity;
    }

    public final InterfaceC8645e ad() {
        boolean shouldShowRequestPermissionRationale;
        Context context = this.vip;
        String str = this.ad;
        if (AbstractC10077e.appmetrica(context, str) == 0) {
            return C3214e.ad;
        }
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            Activity activity = this.metrica;
            if (i >= 32) {
                z = activity.shouldShowRequestPermissionRationale(str);
            } else if (i == 31) {
                try {
                    shouldShowRequestPermissionRationale = ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
                }
                z = shouldShowRequestPermissionRationale;
            } else {
                z = activity.shouldShowRequestPermissionRationale(str);
            }
        }
        return new C17587e(z);
    }

    @Override // defpackage.InterfaceC5673e
    public final InterfaceC8645e appmetrica() {
        return (InterfaceC8645e) this.license.getValue();
    }

    @Override // defpackage.InterfaceC5673e
    public final void purchase() {
        AbstractC13438e abstractC13438e = this.appmetrica;
        if (abstractC13438e == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
        abstractC13438e.metrica(this.ad);
    }
}
