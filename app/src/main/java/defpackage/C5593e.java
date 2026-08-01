package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C5593e {
    public final Object[] ad = new Object[2];
    public static final Class[] vip = {Context.class, AttributeSet.class};
    public static final int[] metrica = {R.attr.onClick};
    public static final int[] license = {R.attr.accessibilityHeading};
    public static final int[] appmetrica = {R.attr.accessibilityPaneTitle};
    public static final int[] purchase = {R.attr.screenReaderFocusable};
    public static final String[] billing = {"android.widget.", "android.view.", "android.webkit."};
    public static final C17519e yandex = new C17519e(0);

    public C10792e ad(Context context, AttributeSet attributeSet) {
        return new C10792e(context, attributeSet);
    }

    public C13272e appmetrica(Context context, AttributeSet attributeSet) {
        return new C13272e(context, attributeSet);
    }

    public C2887e license(Context context, AttributeSet attributeSet) {
        return new C2887e(context, attributeSet);
    }

    public C4114e metrica(Context context, AttributeSet attributeSet) {
        return new C4114e(context, attributeSet, ua.itaysonlab.vkx.R.attr.checkboxStyle);
    }

    public final View purchase(Context context, String str, String str2) {
        String concat;
        C17519e c17519e = yandex;
        Constructor constructor = (Constructor) c17519e.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(vip);
            c17519e.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.ad);
    }

    public AppCompatButton vip(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }
}
