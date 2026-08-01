package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10043e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractViewOnTouchListenerC5850e f19838e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19839e;

    public /* synthetic */ RunnableC10043e(AbstractViewOnTouchListenerC5850e abstractViewOnTouchListenerC5850e, int i) {
        this.f19839e = i;
        this.f19838e = abstractViewOnTouchListenerC5850e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19839e) {
            case 0:
                ViewParent parent = this.f19838e.f12324e.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                AbstractViewOnTouchListenerC5850e abstractViewOnTouchListenerC5850e = this.f19838e;
                abstractViewOnTouchListenerC5850e.ad();
                View view = abstractViewOnTouchListenerC5850e.f12324e;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC5850e.metrica()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC5850e.f12327e = true;
                    return;
                }
                return;
        }
    }
}
