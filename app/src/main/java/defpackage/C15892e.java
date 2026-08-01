package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؐؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15892e extends AbstractC12564e {
    public static final PathInterpolator appmetrica = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final C17633e purchase = new C17633e(0);
    public static final DecelerateInterpolator billing = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator yandex = new AccelerateInterpolator(1.5f);

    public static WindowInsets adcel(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static void billing(View view, C12773e c12773e, C12948e c12948e, boolean z) {
        AbstractC15825e mopub = mopub(view);
        if (mopub != null) {
            mopub.f31256e = c12948e;
            if (!z) {
                mopub.smaato(c12773e);
                z = mopub.f31257e == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                billing(viewGroup.getChildAt(i), c12773e, c12948e, z);
            }
        }
    }

    public static AbstractC15825e mopub(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC5185e) {
            return ((ViewOnApplyWindowInsetsListenerC5185e) tag).ad;
        }
        return null;
    }

    public static void purchase(C12773e c12773e, View view) {
        AbstractC15825e mopub = mopub(view);
        if (mopub != null) {
            mopub.advert(c12773e);
            if (mopub.f31257e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                purchase(c12773e, viewGroup.getChildAt(i));
            }
        }
    }

    public static void startapp(View view, C12773e c12773e, C7302e c7302e) {
        AbstractC15825e mopub = mopub(view);
        if (mopub != null) {
            mopub.loadAd(c12773e, c7302e);
            if (mopub.f31257e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                startapp(viewGroup.getChildAt(i), c12773e, c7302e);
            }
        }
    }

    public static void yandex(View view, C12948e c12948e, List list) {
        AbstractC15825e mopub = mopub(view);
        if (mopub != null) {
            c12948e = mopub.amazon(c12948e, list);
            if (mopub.f31257e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                yandex(viewGroup.getChildAt(i), c12948e, list);
            }
        }
    }
}
