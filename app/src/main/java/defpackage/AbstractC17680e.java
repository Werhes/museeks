package defpackage;

import android.animation.ValueAnimator;
import android.hardware.camera2.CameraAccessException;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17680e {
    public static final C2647e ad = new Object();

    public static final void ad(Object obj, Object obj2, Function1 function1, C13770e c13770e) {
        boolean purchase = c13770e.purchase(obj) | c13770e.purchase(obj2);
        Object m3681throw = c13770e.m3681throw();
        if (purchase || m3681throw == C2987e.ad) {
            m3681throw = new C7447e(function1);
            c13770e.m3682throws(m3681throw);
        }
    }

    public static int adcel(Exception exc) {
        boolean billing;
        boolean z = false;
        if (exc instanceof CameraAccessException) {
            CameraAccessException cameraAccessException = (CameraAccessException) exc;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                return 3;
            }
            if (reason == 2) {
                return 6;
            }
            if (reason == 3) {
                return 0;
            }
            if (reason == 4) {
                return 1;
            }
            if (reason == 5) {
                return 2;
            }
            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
            return 11;
        }
        if (exc instanceof IllegalArgumentException) {
            return 7;
        }
        if (exc instanceof SecurityException) {
            return 8;
        }
        if (Build.VERSION.SDK_INT == 28) {
            if (exc instanceof RuntimeException) {
                StackTraceElement[] stackTrace = ((RuntimeException) exc).getStackTrace();
                billing = AbstractC7890e.billing(stackTrace.length == 0 ? null : stackTrace[0].getMethodName(), "_enableShutterSound");
            } else {
                billing = false;
            }
            if (billing) {
                z = true;
            }
        }
        if (z) {
            return 10;
        }
        Log.w("CXCP", "Unexpected throwable: " + exc);
        return 11;
    }

    public static final C7695e advert(C7417e c7417e, int i, int i2) {
        int i3 = i - 1;
        int i4 = i2 - 1;
        int i5 = i + 1;
        int i6 = i2 + 1;
        return new C7695e(smaato(c7417e, i, i2, i3, i4), smaato(c7417e, i, i2, i5, i4), smaato(c7417e, i, i2, i3, i2), smaato(c7417e, i, i2, i, i4), smaato(c7417e, i, i2, i5, i2), smaato(c7417e, i, i2, i3, i6), smaato(c7417e, i, i2, i, i6), smaato(c7417e, i, i2, i5, i6));
    }

    public static final void amazon(View view) {
        try {
            view.setVisibility(0);
        } catch (NullPointerException unused) {
        }
    }

    public static final void appmetrica(Object obj, Object obj2, Function2 function2, C13770e c13770e) {
        InterfaceC8850e interfaceC8850e = c13770e.f27289default;
        boolean purchase = c13770e.purchase(obj) | c13770e.purchase(obj2);
        Object m3681throw = c13770e.m3681throw();
        if (purchase || m3681throw == C2987e.ad) {
            m3681throw = new C6481e(interfaceC8850e, function2);
            c13770e.m3682throws(m3681throw);
        }
    }

    public static final void billing(View view) {
        if (view.getVisibility() == 8) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(Float.valueOf(1.0f).floatValue(), Float.valueOf(0.0f).floatValue());
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new C13353e(view, 0));
        ofFloat.start();
    }

    public static final void license(C13770e c13770e, Object obj, Function2 function2) {
        InterfaceC8850e interfaceC8850e = c13770e.f27289default;
        boolean purchase = c13770e.purchase(obj);
        Object m3681throw = c13770e.m3681throw();
        if (purchase || m3681throw == C2987e.ad) {
            m3681throw = new C6481e(interfaceC8850e, function2);
            c13770e.m3682throws(m3681throw);
        }
    }

    public static final void metrica(Object[] objArr, Function1 function1, C13770e c13770e) {
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= c13770e.purchase(obj);
        }
        Object m3681throw = c13770e.m3681throw();
        if (z || m3681throw == C2987e.ad) {
            c13770e.m3682throws(new C7447e(function1));
        }
    }

    public static final void mopub(View view) {
        try {
            view.setVisibility(8);
        } catch (NullPointerException unused) {
        }
    }

    public static final void purchase(Function0 function0, C13770e c13770e) {
        C12021e c12021e = c13770e.f27299while.vip.metrica;
        c12021e.adcel(C13247e.license);
        AbstractC0207e.adcel(c12021e, 0, function0);
    }

    public static final boolean smaato(C7417e c7417e, int i, int i2, int i3, int i4) {
        Object c12763e;
        try {
            c12763e = Boolean.valueOf(c7417e.vip(i3, i4) == c7417e.vip(i, i2));
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        Object obj = Boolean.FALSE;
        if (c12763e instanceof C12763e) {
            c12763e = obj;
        }
        return ((Boolean) c12763e).booleanValue();
    }

    public static final InterfaceC18435e startapp(C13770e c13770e) {
        return new C4652e(c13770e.f27289default);
    }

    public static final void vip(Object obj, Function1 function1, C13770e c13770e) {
        boolean purchase = c13770e.purchase(obj);
        Object m3681throw = c13770e.m3681throw();
        if (purchase || m3681throw == C2987e.ad) {
            m3681throw = new C7447e(function1);
            c13770e.m3682throws(m3681throw);
        }
    }

    public static final void yandex(View view) {
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(Float.valueOf(0.0f).floatValue(), Float.valueOf(1.0f).floatValue());
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new C13353e(view, 1));
        ofFloat.start();
    }
}
