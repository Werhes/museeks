package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۥؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC7587e implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Runnable f15420e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public ViewTreeObserver f15421e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final View f15422e;

    public ViewTreeObserverOnPreDrawListenerC7587e(View view, Runnable runnable) {
        this.f15422e = view;
        this.f15421e = view.getViewTreeObserver();
        this.f15420e = runnable;
    }

    public static void ad(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC7587e viewTreeObserverOnPreDrawListenerC7587e = new ViewTreeObserverOnPreDrawListenerC7587e(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC7587e);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC7587e);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f15421e.isAlive();
        View view = this.f15422e;
        if (isAlive) {
            this.f15421e.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f15420e.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f15421e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f15421e.isAlive();
        View view2 = this.f15422e;
        if (isAlive) {
            this.f15421e.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
