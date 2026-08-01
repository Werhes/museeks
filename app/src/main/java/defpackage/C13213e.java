package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13213e extends ViewGroup {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final HashMap f26239e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final HashMap f26240e;

    public C13213e(Context context) {
        super(context);
        setClipChildren(false);
        this.f26240e = new HashMap();
        this.f26239e = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC9936e, C13915e> getHolderToLayoutNode() {
        return this.f26240e;
    }

    public final HashMap<C13915e, AbstractC9936e> getLayoutNodeToHolder() {
        return this.f26239e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (AbstractC9936e abstractC9936e : this.f26240e.keySet()) {
            abstractC9936e.layout(abstractC9936e.getLeft(), abstractC9936e.getTop(), abstractC9936e.getRight(), abstractC9936e.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            AbstractC14070e.ad("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            AbstractC14070e.ad("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (AbstractC9936e abstractC9936e : this.f26240e.keySet()) {
            int i4 = abstractC9936e.f19652e;
            if (i4 != Integer.MIN_VALUE && (i3 = abstractC9936e.f19655e) != Integer.MIN_VALUE) {
                abstractC9936e.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C13915e c13915e = (C13915e) this.f26240e.get(childAt);
            if (childAt.isLayoutRequested() && c13915e != null) {
                C13915e.m3699strictfp(c13915e, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
