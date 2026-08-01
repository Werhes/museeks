package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؒٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15933e {
    public static C17094e appmetrica;
    public static SharedPreferences billing;
    public static final List purchase;
    public static final ArrayList yandex;
    public static final Handler ad = new Handler(Looper.getMainLooper());
    public static InterfaceC3337e vip = InterfaceC3337e.f7535e;
    public static final ArrayList metrica = new ArrayList();
    public static final ArrayList license = new ArrayList();

    static {
        new ArrayList();
        appmetrica = C17094e.appmetrica;
        purchase = Collections.EMPTY_LIST;
        yandex = new ArrayList();
    }

    public static int ad(int i) {
        if (appmetrica == null) {
            appmetrica = C17094e.appmetrica;
        }
        int i2 = appmetrica.ad.get(i, -2);
        if (i2 != -2) {
            return i2;
        }
        TypedArray obtainStyledAttributes = AbstractC10532e.ad.obtainStyledAttributes(new TypedValue().data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static void vip(C17094e c17094e, float[] fArr, boolean z) {
        appmetrica = c17094e;
        if (c17094e.metrica != AbstractC6959e.startapp()) {
            AbstractC6959e.f14257e.edit().putBoolean("enabled", false).apply();
        } else {
            AbstractC6959e.f14257e.edit().putString(c17094e.metrica ? "dark_theme" : "light_theme", c17094e.vip).apply();
        }
        Iterator it = metrica.iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            View decorView = activity.getWindow().getDecorView();
            if (z) {
                Window window = activity.getWindow();
                final C15173e c15173e = new C15173e(1, activity, decorView, fArr);
                try {
                    final Bitmap createBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
                    if (Build.VERSION.SDK_INT < 26 || !window.getDecorView().isHardwareAccelerated()) {
                        Canvas canvas = new Canvas(createBitmap);
                        decorView.draw(canvas);
                        canvas.setBitmap(null);
                        c15173e.accept(createBitmap);
                    } else {
                        int[] iArr = new int[2];
                        decorView.getLocationInWindow(iArr);
                        int i = iArr[0];
                        PixelCopy.request(window, new Rect(i, iArr[1], decorView.getWidth() + i, iArr[1] + decorView.getHeight()), createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: eٕۡؗ
                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                            public final void onPixelCopyFinished(int i2) {
                                C15173e c15173e2 = C15173e.this;
                                Bitmap bitmap = createBitmap;
                                if (i2 == 0) {
                                    c15173e2.accept(bitmap);
                                } else {
                                    c15173e2.accept(null);
                                }
                            }
                        }, new Handler(Looper.getMainLooper()));
                    }
                } catch (Exception unused) {
                    c15173e.accept(null);
                }
            } else {
                AbstractC10532e.vip(decorView);
            }
            if (activity instanceof AbstractActivityC17704e) {
                AppActivity appActivity = (AppActivity) ((AbstractActivityC17704e) activity);
                if (appmetrica.license) {
                    C1731e m4677class = appActivity.m4677class();
                    m4677class.vip(true);
                    m4677class.ad(true);
                } else {
                    C1731e m4677class2 = appActivity.m4677class();
                    m4677class2.vip(false);
                    m4677class2.ad(false);
                }
                AbstractC9468e.license(appActivity);
                if (appActivity.f36547e != null) {
                    appActivity.f36546e.metrica.vip.metrica.setValue(AbstractC17202e.license(appmetrica.metrica));
                    C10279e c10279e = appActivity.f36542e;
                    FrameLayout[] frameLayoutArr = c10279e.appmetrica;
                    int length = frameLayoutArr.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        FrameLayout frameLayout = frameLayoutArr[i2];
                        int i4 = i3 + 1;
                        if (frameLayout != null && i3 != c10279e.startapp) {
                            AbstractC10532e.vip(frameLayout);
                        }
                        i2++;
                        i3 = i4;
                    }
                    C4956e c4956e = c10279e.ad.f36547e;
                    if (c4956e != null) {
                        ((LinearLayout) c4956e.f10511e).setBackgroundColor(ad(R.attr.nextdock_background));
                    }
                }
            }
        }
        billing.edit().putString("selected_theme", c17094e.vip).apply();
    }
}
