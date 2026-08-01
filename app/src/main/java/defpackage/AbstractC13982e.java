package defpackage;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13982e {
    public static final int[] ad = {R.attr.state_checked};
    public static final int[] vip = new int[0];
    public static final Rect metrica = new Rect();

    public static void ad(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(ad);
        } else {
            drawable.setState(vip);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode metrica(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static Rect vip(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets ad2 = AbstractC16645e.ad(drawable);
            return new Rect(C5275e.vip(ad2), C5275e.mopub(ad2), C5275e.advert(ad2), C5275e.amazon(ad2));
        }
        if (i >= 29) {
            boolean z = AbstractC6961e.ad;
        } else if (AbstractC6961e.ad) {
            try {
                Object invoke = AbstractC6961e.vip.invoke(drawable, null);
                if (invoke != null) {
                    return new Rect(AbstractC6961e.metrica.getInt(invoke), AbstractC6961e.license.getInt(invoke), AbstractC6961e.appmetrica.getInt(invoke), AbstractC6961e.purchase.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return metrica;
    }
}
