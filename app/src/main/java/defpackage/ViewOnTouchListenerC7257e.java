package defpackage;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٚؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC7257e implements View.OnTouchListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f14857e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f14858e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f14859e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Dialog f14860e;

    public ViewOnTouchListenerC7257e(Dialog dialog, Rect rect) {
        this.f14860e = dialog;
        this.f14858e = rect.left;
        this.f14857e = rect.top;
        this.f14859e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f14858e;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f14857e, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f14859e;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f14860e.onTouchEvent(obtain);
    }
}
