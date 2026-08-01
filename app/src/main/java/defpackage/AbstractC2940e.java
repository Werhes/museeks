package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۢٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2940e {
    public static C15531e metrica;
    public static final long ad = TimeUnit.MINUTES.toMillis(1);
    public static final Object vip = new Object();

    public static void ad(Context context) {
        if (metrica == null) {
            C15531e c15531e = new C15531e(context);
            metrica = c15531e;
            synchronized (c15531e.ad) {
                c15531e.billing = true;
            }
        }
    }

    public static ComponentName license(Context context, Intent intent) {
        synchronized (vip) {
            try {
                ad(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    metrica.ad(ad);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void metrica(Context context, ServiceConnectionC18505e serviceConnectionC18505e, Intent intent) {
        synchronized (vip) {
            try {
                ad(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    metrica.ad(ad);
                }
                serviceConnectionC18505e.vip(intent).ad(new C2007e(27, intent));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void vip(Intent intent) {
        synchronized (vip) {
            try {
                if (metrica != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    metrica.metrica();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
