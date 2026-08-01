package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12410e {
    public static final int[] ad = new int[2];
    public static final Rect vip = new Rect();

    public static final C0763e ad(View view, View view2) {
        int[] iArr = ad;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(vip);
        float f2 = (i - i3) + r1.left;
        return new C0763e(f2, r1.top + f, r1.width() + f2, f + r1.top + r1.height());
    }

    public static final C10202e license(int i) {
        if (i == 1) {
            return new C10202e(2);
        }
        if (i == 2) {
            return new C10202e(1);
        }
        if (i == 17) {
            return new C10202e(3);
        }
        if (i == 33) {
            return new C10202e(5);
        }
        if (i == 66) {
            return new C10202e(4);
        }
        if (i != 130) {
            return null;
        }
        return new C10202e(6);
    }

    public static final Integer metrica(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final boolean vip(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof ViewTreeObserverOnGlobalLayoutListenerC5014e) {
            return ((ViewTreeObserverOnGlobalLayoutListenerC5014e) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }
}
