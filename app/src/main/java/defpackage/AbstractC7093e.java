package defpackage;

import android.content.Context;
import android.os.Build;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚِۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7093e {
    public static final Object ad = new Object();
    public static final HashMap vip = new HashMap();

    public static Context ad(Context context) {
        Context applicationContext = context.getApplicationContext();
        int hashCode = context.getApplicationContext().hashCode();
        int i = Build.VERSION.SDK_INT;
        Context context2 = null;
        String format = String.format("%d-%d-%s", Integer.valueOf(hashCode), Integer.valueOf(i >= 34 ? AbstractC5666e.advert(context) : 0), i >= 30 ? AbstractC5096e.metrica(context) : null);
        synchronized (ad) {
            try {
                HashMap hashMap = vip;
                WeakReference weakReference = (WeakReference) hashMap.get(format);
                if (weakReference != null) {
                    Context context3 = (Context) weakReference.get();
                    if (context3 != null) {
                        context2 = context3;
                    } else {
                        hashMap.remove(format);
                    }
                }
                if (context2 != null) {
                    return context2;
                }
                if (i >= 34) {
                    applicationContext = AbstractC5666e.metrica(applicationContext, AbstractC5666e.advert(context));
                }
                if (i >= 30) {
                    String metrica = AbstractC5096e.metrica(context);
                    if (!Objects.equals(metrica, AbstractC5096e.metrica(applicationContext))) {
                        applicationContext = AbstractC5096e.ad(applicationContext, metrica);
                    }
                }
                hashMap.put(format, new WeakReference(applicationContext));
                return applicationContext;
            } finally {
            }
        }
    }
}
