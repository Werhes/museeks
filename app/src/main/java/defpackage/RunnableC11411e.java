package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۣۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11411e extends AbstractC11696e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final WeakReference f22955e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final WeakReference f22956e;

    public RunnableC11411e(TextView textView, C15859e c15859e) {
        this.f22956e = new WeakReference(textView);
        this.f22955e = new WeakReference(c15859e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f22956e.get();
        InputFilter inputFilter = (InputFilter) this.f22955e.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C5188e ad = C5188e.ad();
                    if (text == null) {
                        length = 0;
                    } else {
                        ad.getClass();
                        length = text.length();
                    }
                    CharSequence billing = ad.billing(0, length, 0, text);
                    if (text == billing) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(billing);
                    int selectionEnd = Selection.getSelectionEnd(billing);
                    textView.setText(billing);
                    if (billing instanceof Spannable) {
                        Spannable spannable = (Spannable) billing;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.AbstractC11696e
    public final void vip() {
        Handler handler;
        TextView textView = (TextView) this.f22956e.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }
}
