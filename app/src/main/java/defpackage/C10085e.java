package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؘؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10085e {
    public static C14090e metrica;
    public final Context ad;
    public final ArrayList vip = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public C10085e(Context context) {
        this.ad = context;
    }

    public static void adcel(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        vip();
        C14090e metrica2 = metrica();
        C6541e metrica3 = metrica2.metrica();
        if (metrica2.yandex() != metrica3) {
            metrica2.mopub(metrica3, i, true);
        }
    }

    public static MediaSessionCompat$Token appmetrica() {
        C14090e c14090e = metrica;
        if (c14090e == null) {
            return null;
        }
        C0909e c0909e = c14090e.subs;
        if (c0909e != null) {
            C12894e c12894e = (C12894e) c0909e.f3323e;
            if (c12894e != null) {
                return ((C15944e) c12894e.f25751e).metrica;
            }
            return null;
        }
        C12894e c12894e2 = c14090e.crashlytics;
        if (c12894e2 != null) {
            return ((C15944e) c12894e2.f25751e).metrica;
        }
        return null;
    }

    public static boolean billing() {
        Bundle bundle;
        if (metrica == null) {
            return false;
        }
        C16936e c16936e = metrica().signatures;
        return c16936e == null || (bundle = c16936e.appmetrica) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static C10085e license(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        vip();
        if (metrica == null) {
            metrica = new C14090e(context.getApplicationContext());
        }
        ArrayList arrayList = metrica.yandex;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                C10085e c10085e = new C10085e(context);
                arrayList.add(new WeakReference(c10085e));
                return c10085e;
            }
            C10085e c10085e2 = (C10085e) ((WeakReference) arrayList.get(size)).get();
            if (c10085e2 == null) {
                arrayList.remove(size);
            } else if (c10085e2.ad == context) {
                return c10085e2;
            }
        }
    }

    public static C14090e metrica() {
        C14090e c14090e = metrica;
        if (c14090e != null) {
            return c14090e;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static C6541e purchase() {
        vip();
        return metrica().yandex();
    }

    public static void startapp(C10575e c10575e) {
        vip();
        C11631e c11631e = metrica().subscription;
        if (c11631e == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        AbstractC5666e.m1956extends(c11631e.f23345e, c10575e != null ? AbstractC5666e.m1960protected(c10575e) : null);
    }

    public static void vip() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public final void ad(C0056e c0056e, AbstractC17065e abstractC17065e, int i) {
        C1995e c1995e;
        C0056e c0056e2;
        if (c0056e == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (abstractC17065e == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        vip();
        ArrayList arrayList = this.vip;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C1995e) arrayList.get(i2)).vip == abstractC17065e) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            c1995e = new C1995e(this, abstractC17065e);
            arrayList.add(c1995e);
        } else {
            c1995e = (C1995e) arrayList.get(i2);
        }
        boolean z2 = true;
        if (i != c1995e.license) {
            c1995e.license = i;
            z = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        c1995e.appmetrica = elapsedRealtime;
        C0056e c0056e3 = c1995e.metrica;
        c0056e3.ad();
        c0056e.ad();
        if (c0056e3.vip.containsAll(c0056e.vip)) {
            z2 = z;
        } else {
            C0056e c0056e4 = c1995e.metrica;
            if (c0056e4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            c0056e4.ad();
            ArrayList<String> arrayList2 = !c0056e4.vip.isEmpty() ? new ArrayList<>(c0056e4.vip) : null;
            ArrayList metrica2 = c0056e.metrica();
            if (!metrica2.isEmpty()) {
                Iterator it = metrica2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                c0056e2 = C0056e.metrica;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                c0056e2 = new C0056e(bundle, arrayList2);
            }
            c1995e.metrica = c0056e2;
        }
        if (z2) {
            metrica().smaato();
        }
    }

    public final void yandex(AbstractC17065e abstractC17065e) {
        if (abstractC17065e == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        vip();
        ArrayList arrayList = this.vip;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((C1995e) arrayList.get(i)).vip == abstractC17065e) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            metrica().smaato();
        }
    }
}
