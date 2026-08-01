package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۚۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC16491e implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ CoordinatorLayout f32317e;

    public ViewGroupOnHierarchyChangeListenerC16491e(CoordinatorLayout coordinatorLayout) {
        this.f32317e = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f32317e.f377e;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.f32317e;
        coordinatorLayout.Signature(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f377e;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
