package defpackage;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2570e extends LinkMovementMethod {
    public C7863e ad;

    public static C7863e ad(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int scrollX = textView.getScrollX() + (((int) motionEvent.getX()) - textView.getTotalPaddingLeft());
        int scrollY = textView.getScrollY() + (((int) motionEvent.getY()) - textView.getTotalPaddingTop());
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        C7863e[] c7863eArr = (C7863e[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C7863e.class);
        if (c7863eArr.length <= 0) {
            return null;
        }
        C7863e c7863e = c7863eArr[0];
        if (offsetForHorizontal < spannable.getSpanStart(c7863e) || offsetForHorizontal > spannable.getSpanEnd(c7863e)) {
            return null;
        }
        return c7863eArr[0];
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C7863e ad = ad(textView, spannable, motionEvent);
            this.ad = ad;
            if (ad != null) {
                ad.f15916e = true;
                Selection.setSelection(spannable, spannable.getSpanStart(ad), spannable.getSpanEnd(this.ad));
                return true;
            }
        } else {
            if (motionEvent.getAction() != 2) {
                C7863e c7863e = this.ad;
                if (c7863e != null) {
                    c7863e.f15916e = false;
                    super.onTouchEvent(textView, spannable, motionEvent);
                }
                this.ad = null;
                Selection.removeSelection(spannable);
                return true;
            }
            C7863e ad2 = ad(textView, spannable, motionEvent);
            C7863e c7863e2 = this.ad;
            if (c7863e2 != null && ad2 != c7863e2) {
                c7863e2.f15916e = false;
                this.ad = null;
                Selection.removeSelection(spannable);
            }
        }
        return true;
    }
}
