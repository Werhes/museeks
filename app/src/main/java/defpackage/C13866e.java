package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13866e extends C2187e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final TextInputLayout f27476e;

    public C13866e(TextInputLayout textInputLayout) {
        this.f27476e = textInputLayout;
    }

    @Override // defpackage.C2187e
    public final void appmetrica(View view, AccessibilityEvent accessibilityEvent) {
        super.appmetrica(view, accessibilityEvent);
        this.f27476e.f963e.vip().amazon(accessibilityEvent);
    }

    @Override // defpackage.C2187e
    public final void license(View view, C8092e c8092e) {
        AccessibilityNodeInfo accessibilityNodeInfo = c8092e.ad;
        this.f5558e.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f27476e;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f1018e;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : BuildConfig.FLAVOR;
        C5733e c5733e = textInputLayout.f981e;
        C13272e c13272e = c5733e.f12137e;
        if (c13272e.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c13272e);
            accessibilityNodeInfo.setTraversalAfter(c13272e);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c5733e.f12139e);
        }
        if (!isEmpty) {
            c8092e.tapsense(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            c8092e.tapsense(charSequence);
            if (!z && placeholderText != null) {
                c8092e.tapsense(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c8092e.tapsense(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            if (Build.VERSION.SDK_INT >= 26) {
                c8092e.Signature(charSequence);
            } else {
                if (!isEmpty) {
                    charSequence = ((Object) text) + ", " + charSequence;
                }
                c8092e.tapsense(charSequence);
            }
            c8092e.signatures(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C13272e c13272e2 = textInputLayout.f964e.isPro;
        if (c13272e2 != null) {
            accessibilityNodeInfo.setLabelFor(c13272e2);
        }
        textInputLayout.f963e.vip().smaato(c8092e);
    }
}
