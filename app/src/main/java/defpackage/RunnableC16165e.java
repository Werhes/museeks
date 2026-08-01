package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC16165e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ View f31762e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31763e;

    public /* synthetic */ RunnableC16165e(View view, int i) {
        this.f31763e = i;
        this.f31762e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31763e) {
            case 0:
                this.f31762e.setAlpha(1.0f);
                return;
            case 1:
                View view = this.f31762e;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                View view2 = this.f31762e;
                ((InputMethodManager) view2.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view2, 1);
                return;
        }
    }
}
