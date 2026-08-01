package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12525e extends AbstractC17066e {
    public static boolean adcel = false;
    public static Field billing = null;
    public static Constructor startapp = null;
    public static boolean yandex = false;
    public WindowInsets appmetrica;
    public C7088e purchase;

    public C12525e() {
        this.appmetrica = adcel();
    }

    public C12525e(C12948e c12948e) {
        super(c12948e);
        this.appmetrica = c12948e.billing();
    }

    private static WindowInsets adcel() {
        if (!yandex) {
            try {
                billing = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            yandex = true;
        }
        Field field = billing;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!adcel) {
            try {
                startapp = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            adcel = true;
        }
        Constructor constructor = startapp;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC17066e
    public void purchase(C7088e c7088e) {
        this.purchase = c7088e;
    }

    @Override // defpackage.AbstractC17066e
    public C12948e vip() {
        ad();
        C12948e yandex2 = C12948e.yandex(null, this.appmetrica);
        C7088e[] c7088eArr = this.vip;
        C2893e c2893e = yandex2.ad;
        c2893e.isVip(c7088eArr);
        c2893e.applovin(this.purchase);
        c2893e.tapsense(null);
        c2893e.premium(this.metrica);
        c2893e.subs(this.license);
        return yandex2;
    }

    @Override // defpackage.AbstractC17066e
    public void yandex(C7088e c7088e) {
        WindowInsets windowInsets = this.appmetrica;
        if (windowInsets != null) {
            this.appmetrica = windowInsets.replaceSystemWindowInsets(c7088e.ad, c7088e.vip, c7088e.metrica, c7088e.license);
        }
    }
}
