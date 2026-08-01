package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۛۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4387e {
    public static void ad(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void metrica(View view, InterfaceC0569e interfaceC0569e) {
        ViewOnApplyWindowInsetsListenerC2376e viewOnApplyWindowInsetsListenerC2376e = interfaceC0569e != null ? new ViewOnApplyWindowInsetsListenerC2376e(view, interfaceC0569e) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC2376e);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC2376e != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC2376e);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static C12948e vip(View view, C12948e c12948e, Rect rect) {
        WindowInsets billing = c12948e.billing();
        if (billing != null) {
            return C12948e.yandex(view, view.computeSystemWindowInsets(billing, rect));
        }
        rect.setEmpty();
        return c12948e;
    }
}
