package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16058e {
    public static final int[] ad = {R.attr.state_pressed};
    public static final int[] vip = {R.attr.state_focused};
    public static final int[] metrica = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] license = {R.attr.state_selected};
    public static final int[] appmetrica = {R.attr.state_enabled, R.attr.state_pressed};
    public static final String purchase = AbstractC16058e.class.getSimpleName();

    public static ColorStateList ad(ColorStateList colorStateList) {
        int[] iArr = vip;
        return new ColorStateList(new int[][]{license, iArr, StateSet.NOTHING}, new int[]{vip(colorStateList, metrica), vip(colorStateList, iArr), vip(colorStateList, ad)});
    }

    public static boolean license(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    public static ColorStateList metrica(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(appmetrica, 0)) != 0) {
            Log.w(purchase, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static int vip(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return AbstractC3898e.startapp(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }
}
