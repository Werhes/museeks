package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15703e extends ListView {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f30912e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public RunnableC12991e f30913e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f30914e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f30915e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f30916e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f30917e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public ViewOnTouchListenerC8658e f30918e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f30919e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final boolean f30920e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Rect f30921e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C15885e f30922e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f30923e;

    public C15703e(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f30921e = new Rect();
        this.f30916e = 0;
        this.f30914e = 0;
        this.f30919e = 0;
        this.f30912e = 0;
        this.f30920e = z;
        setCacheColorHint(0);
    }

    public final int ad(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i3 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f30921e;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f30913e != null) {
            return;
        }
        super.drawableStateChanged();
        C15885e c15885e = this.f30922e;
        if (c15885e != null) {
            c15885e.f31320e = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f30915e && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f30920e || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f30920e || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f30920e || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f30920e && this.f30917e) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f30913e = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f30913e == null) {
            RunnableC12991e runnableC12991e = new RunnableC12991e(8, this);
            this.f30913e = runnableC12991e;
            post(runnableC12991e);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !AbstractC6598e.license) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC6598e.ad.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC6598e.vip.invoke(this, Integer.valueOf(pointToPosition));
                        AbstractC6598e.metrica.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f30915e && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f30923e = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC12991e runnableC12991e = this.f30913e;
        if (runnableC12991e != null) {
            C15703e c15703e = (C15703e) runnableC12991e.f25898e;
            c15703e.f30913e = null;
            c15703e.removeCallbacks(runnableC12991e);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f30917e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [eٕۨۛ, android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C15885e c15885e = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f31321e;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f31321e = drawable;
            drawable.setCallback(drawable2);
            drawable2.f31320e = true;
            c15885e = drawable2;
        }
        this.f30922e = c15885e;
        super.setSelector(c15885e);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f30916e = rect.left;
        this.f30914e = rect.top;
        this.f30919e = rect.right;
        this.f30912e = rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vip(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15703e.vip(android.view.MotionEvent, int):boolean");
    }
}
