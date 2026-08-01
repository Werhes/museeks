package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۚۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0544e implements View.OnAttachStateChangeListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f2713e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2714e;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0544e(int i, Object obj) {
        this.f2714e = i;
        this.f2713e = obj;
    }

    private final void ad(View view) {
    }

    private final void license(View view) {
    }

    private final void metrica(View view) {
    }

    private final void vip(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f2714e;
        Object obj = this.f2713e;
        switch (i) {
            case 0:
                C4446e c4446e = (C4446e) obj;
                Context context = view.getContext();
                if (c4446e.license) {
                    return;
                }
                context.getApplicationContext().registerComponentCallbacks(c4446e.purchase);
                c4446e.license = true;
                return;
            case 1:
                return;
            case 2:
                C9730e c9730e = (C9730e) obj;
                AccessibilityManager accessibilityManager = c9730e.f19247e;
                if (c9730e.f19231e == null || accessibilityManager == null) {
                    return;
                }
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                if (c9730e.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC17512e(c9730e.f19231e));
                    return;
                }
                return;
            case 3:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = AbstractC2016e.ad;
                view2.requestApplyInsets();
                return;
            case 4:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f2714e) {
            case 0:
                C4446e c4446e = (C4446e) this.f2713e;
                Context context = view.getContext();
                if (c4446e.license) {
                    context.getApplicationContext().unregisterComponentCallbacks(c4446e.purchase);
                    c4446e.license = false;
                }
                C4446e.license(c4446e);
                return;
            case 1:
                ViewOnKeyListenerC8330e viewOnKeyListenerC8330e = (ViewOnKeyListenerC8330e) this.f2713e;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC8330e.f17049e;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC8330e.f17049e = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC8330e.f17049e.removeGlobalOnLayoutListener(viewOnKeyListenerC8330e.f17048e);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                C9730e c9730e = (C9730e) this.f2713e;
                C0211e c0211e = c9730e.f19231e;
                if (c0211e == null || (accessibilityManager = c9730e.f19247e) == null) {
                    return;
                }
                accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC17512e(c0211e));
                return;
            case 3:
                return;
            case 4:
                ViewOnKeyListenerC14494e viewOnKeyListenerC14494e = (ViewOnKeyListenerC14494e) this.f2713e;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC14494e.f28667e;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC14494e.f28667e = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC14494e.f28667e.removeGlobalOnLayoutListener(viewOnKeyListenerC14494e.f28673e);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((C8419e) this.f2713e).Signature(null);
                return;
        }
    }
}
