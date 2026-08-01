package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1604e implements TextWatcher {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f4523e = true;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public RunnableC5821e f4524e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final EditText f4525e;

    public C1604e(EditText editText) {
        this.f4525e = editText;
    }

    public static void ad(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C5188e ad = C5188e.ad();
            if (editableText == null) {
                length = 0;
            } else {
                ad.getClass();
                length = editableText.length();
            }
            ad.billing(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f4525e;
        if (!editText.isInEditMode() && this.f4523e && C5188e.license() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int metrica = C5188e.ad().metrica();
            if (metrica != 0) {
                if (metrica == 1) {
                    C5188e.ad().billing(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (metrica != 3) {
                    return;
                }
            }
            C5188e ad = C5188e.ad();
            if (this.f4524e == null) {
                this.f4524e = new RunnableC5821e(editText);
            }
            ad.yandex(this.f4524e);
        }
    }
}
