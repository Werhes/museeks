package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2617e implements TextWatcher {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f6478e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ EditText f6479e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f6480e;

    public C2617e(TextInputLayout textInputLayout, EditText editText) {
        this.f6478e = textInputLayout;
        this.f6479e = editText;
        this.f6480e = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f6478e;
        textInputLayout.signatures(!textInputLayout.f1030e, false);
        if (textInputLayout.f997e) {
            textInputLayout.amazon(editable);
        }
        if (textInputLayout.f1003e) {
            textInputLayout.tapsense(editable);
        }
        EditText editText = this.f6479e;
        int lineCount = editText.getLineCount();
        int i = this.f6480e;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f972e;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f6480e = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
