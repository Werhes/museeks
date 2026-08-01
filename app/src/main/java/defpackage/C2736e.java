package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2736e {
    public final /* synthetic */ C9730e ad;

    public C2736e(C9730e c9730e) {
        this.ad = c9730e;
    }

    public final void ad(TextInputLayout textInputLayout) {
        C9730e c9730e = this.ad;
        C0932e c0932e = c9730e.f19240e;
        if (c9730e.f19241e == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c9730e.f19241e;
        if (editText != null) {
            editText.removeTextChangedListener(c0932e);
            if (c9730e.f19241e.getOnFocusChangeListener() == c9730e.vip().appmetrica()) {
                c9730e.f19241e.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c9730e.f19241e = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0932e);
        }
        c9730e.vip().advert(c9730e.f19241e);
        c9730e.adcel(c9730e.vip());
    }
}
