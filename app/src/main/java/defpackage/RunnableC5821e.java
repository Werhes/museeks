package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5821e extends AbstractC11696e implements Runnable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final WeakReference f12267e;

    public RunnableC5821e(EditText editText) {
        this.f12267e = new WeakReference(editText);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1604e.ad((EditText) this.f12267e.get(), 1);
    }

    @Override // defpackage.AbstractC11696e
    public final void vip() {
        Handler handler;
        EditText editText = (EditText) this.f12267e.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }
}
