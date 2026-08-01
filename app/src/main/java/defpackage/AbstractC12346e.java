package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12346e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final ExecutorC11157e f24760e = new ExecutorC11157e(new ExecutorC8172e(2));

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final int f24756e = -100;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static C6473e f24755e = null;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static C6473e f24758e = null;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static Boolean f24754e = null;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static boolean f24762e = false;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C17548e f24761e = new C17548e(0);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final Object f24757e = new Object();

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final Object f24759e = new Object();

    public static boolean appmetrica(Context context) {
        if (f24754e == null) {
            try {
                int i = AppLocalesMetadataHolderService.f60e;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), Build.VERSION.SDK_INT >= 24 ? AbstractC7593e.ad() | 128 : 640).metaData;
                if (bundle != null) {
                    f24754e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f24754e = Boolean.FALSE;
            }
        }
        return f24754e.booleanValue();
    }

    public static void loadAd(Context context) {
        if (appmetrica(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f24762e) {
                    return;
                }
                f24760e.execute(new RunnableC14993e(context, 0));
                return;
            }
            synchronized (f24759e) {
                try {
                    C6473e c6473e = f24755e;
                    if (c6473e == null) {
                        if (f24758e == null) {
                            f24758e = C6473e.vip(AbstractC11912e.appmetrica(context));
                        }
                        if (f24758e.ad.isEmpty()) {
                        } else {
                            f24755e = f24758e;
                        }
                    } else if (!c6473e.equals(f24758e)) {
                        C6473e c6473e2 = f24755e;
                        f24758e = c6473e2;
                        AbstractC11912e.license(context, c6473e2.ad.ad());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Object metrica() {
        Context context;
        C17548e c17548e = f24761e;
        c17548e.getClass();
        C6748e c6748e = new C6748e(c17548e);
        while (c6748e.hasNext()) {
            AbstractC12346e abstractC12346e = (AbstractC12346e) ((WeakReference) c6748e.next()).get();
            if (abstractC12346e != null && (context = ((LayoutInflaterFactory2C8158e) abstractC12346e).f16587e) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static void vip() {
        C6473e c6473e;
        C17548e c17548e = f24761e;
        c17548e.getClass();
        C6748e c6748e = new C6748e(c17548e);
        while (c6748e.hasNext()) {
            AbstractC12346e abstractC12346e = (AbstractC12346e) ((WeakReference) c6748e.next()).get();
            if (abstractC12346e != null) {
                LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) abstractC12346e;
                Context context = layoutInflaterFactory2C8158e.f16587e;
                if (appmetrica(context) && (c6473e = f24755e) != null && !c6473e.equals(f24758e)) {
                    f24760e.execute(new RunnableC14993e(context, 1));
                }
                layoutInflaterFactory2C8158e.Signature(true, true);
            }
        }
    }

    public static void yandex(LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e) {
        synchronized (f24757e) {
            try {
                C17548e c17548e = f24761e;
                c17548e.getClass();
                C6748e c6748e = new C6748e(c17548e);
                while (c6748e.hasNext()) {
                    AbstractC12346e abstractC12346e = (AbstractC12346e) ((WeakReference) c6748e.next()).get();
                    if (abstractC12346e == layoutInflaterFactory2C8158e || abstractC12346e == null) {
                        c6748e.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void adcel(int i);

    public abstract void amazon(CharSequence charSequence);

    public abstract void billing();

    public abstract void license();

    public abstract void mopub(View view);

    public abstract void purchase();

    public abstract void smaato(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean startapp(int i);
}
