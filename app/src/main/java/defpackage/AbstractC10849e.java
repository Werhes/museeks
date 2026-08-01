package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10849e {
    public static final C13391e ad = new C13391e("CommonUtils", BuildConfig.FLAVOR);

    public static String ad(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            C13391e c13391e = ad;
            if (!Log.isLoggable((String) c13391e.f26645e, 6)) {
                return BuildConfig.FLAVOR;
            }
            Log.e("CommonUtils", c13391e.inmobi(concat));
            return BuildConfig.FLAVOR;
        }
    }
}
