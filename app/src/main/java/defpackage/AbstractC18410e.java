package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۠ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18410e {
    public static final /* synthetic */ int appmetrica = 0;
    public static boolean metrica = false;
    public static boolean vip = false;
    public static final AtomicBoolean ad = new AtomicBoolean();
    public static final AtomicBoolean license = new AtomicBoolean();

    public static boolean ad(Context context) {
        try {
            if (!metrica) {
                try {
                    PackageInfo metrica2 = C5277e.ad(context).metrica(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    C6274e.ad(context);
                    if (metrica2 == null || C6274e.metrica(metrica2, false) || !C6274e.metrica(metrica2, true)) {
                        vip = false;
                    } else {
                        vip = true;
                    }
                    metrica = true;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                    metrica = true;
                }
            }
            return vip || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            metrica = true;
            throw th;
        }
    }
}
