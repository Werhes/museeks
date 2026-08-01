package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۤٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17382e {
    public static final ThreadLocal ad = new ThreadLocal();
    public static final int[] vip = {-16842910};
    public static final int[] metrica = {R.attr.state_focused};
    public static final int[] license = {R.attr.state_pressed};
    public static final int[] appmetrica = {R.attr.state_checked};
    public static final int[] purchase = new int[0];
    public static final int[] billing = new int[1];

    public static void ad(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC6062e.adcel);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList license(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = billing;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC10077e.amazon(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int metrica(Context context, int i) {
        int[] iArr = billing;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int vip(Context context, int i) {
        ColorStateList license2 = license(context, i);
        if (license2 != null && license2.isStateful()) {
            return license2.getColorForState(vip, license2.getDefaultColor());
        }
        ThreadLocal threadLocal = ad;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return AbstractC3898e.startapp(metrica(context, i), Math.round(Color.alpha(r4) * f));
    }
}
