package defpackage;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16738e extends InputConnectionWrapper {
    public final EditText ad;
    public final C4590e vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16738e(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        C4590e c4590e = new C4590e(29);
        this.ad = editText;
        this.vip = c4590e;
        if (C5188e.license()) {
            C5188e.ad().startapp(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.ad.getEditableText();
        this.vip.getClass();
        return C4590e.m1637while(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.ad.getEditableText();
        this.vip.getClass();
        return C4590e.m1637while(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
