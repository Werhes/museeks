package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3277e implements KeyListener {
    public final KeyListener ad;
    public final C11047e vip;

    public C3277e(KeyListener keyListener) {
        C11047e c11047e = new C11047e(29);
        this.ad = keyListener;
        this.vip = c11047e;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.ad.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.ad.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        this.vip.getClass();
        if (i != 67 ? i != 112 ? false : C18478e.subs(editable, keyEvent, true) : C18478e.subs(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.ad.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.ad.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.ad.onKeyUp(view, editable, i, keyEvent);
    }
}
