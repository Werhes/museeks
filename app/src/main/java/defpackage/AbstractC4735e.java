package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4735e extends ViewGroup {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f10120e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f10121e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f10122e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f10123e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int[] f10124e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f10125e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f10126e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f10127e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f10128e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Drawable f10129e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f10130e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int[] f10131e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f10132e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public float f10133e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f10134e;

    public AbstractC4735e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f10132e = true;
        this.f10126e = -1;
        this.f10123e = 0;
        this.f10120e = 8388659;
        int[] iArr = AbstractC6062e.amazon;
        C0912e advert = C0912e.advert(context, attributeSet, iArr, 0);
        AbstractC2016e.amazon(this, context, iArr, attributeSet, (TypedArray) advert.f3331e, 0);
        TypedArray typedArray = (TypedArray) advert.f3331e;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f10133e = typedArray.getFloat(4, -1.0f);
        this.f10126e = typedArray.getInt(3, -1);
        this.f10128e = typedArray.getBoolean(7, false);
        setDividerDrawable(advert.yandex(5));
        this.f10125e = typedArray.getInt(8, 0);
        this.f10127e = typedArray.getDimensionPixelSize(6, 0);
        advert.amazon();
    }

    public final void appmetrica(Canvas canvas, int i) {
        this.f10129e.setBounds(i, getPaddingTop() + this.f10127e, this.f10122e + i, (getHeight() - getPaddingBottom()) - this.f10127e);
        this.f10129e.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٜٔ۟, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: billing, reason: merged with bridge method [inline-methods] */
    public C14840e generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C14840e;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f10126e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f10126e;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f10126e == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.f10123e;
        if (this.f10130e == 1 && (i = this.f10120e & 112) != 48) {
            if (i == 16) {
                i3 = AbstractC8703e.smaato(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f10134e, 2, i3);
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f10134e;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((C14840e) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f10126e;
    }

    public Drawable getDividerDrawable() {
        return this.f10129e;
    }

    public int getDividerPadding() {
        return this.f10127e;
    }

    public int getDividerWidth() {
        return this.f10122e;
    }

    public int getGravity() {
        return this.f10120e;
    }

    public int getOrientation() {
        return this.f10130e;
    }

    public int getShowDividers() {
        return this.f10125e;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f10133e;
    }

    public final void license(Canvas canvas, int i) {
        this.f10129e.setBounds(getPaddingLeft() + this.f10127e, i, (getWidth() - getPaddingRight()) - this.f10127e, this.f10121e + i);
        this.f10129e.draw(canvas);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f10129e == null) {
            return;
        }
        int i2 = 0;
        if (this.f10130e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && startapp(i2)) {
                    license(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C14840e) childAt.getLayoutParams())).topMargin) - this.f10121e);
                }
                i2++;
            }
            if (startapp(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                license(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f10121e : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C14840e) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = AbstractC14039e.ad;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && startapp(i2)) {
                C14840e c14840e = (C14840e) childAt3.getLayoutParams();
                appmetrica(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c14840e).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c14840e).leftMargin) - this.f10122e);
            }
            i2++;
        }
        if (startapp(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C14840e c14840e2 = (C14840e) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c14840e2).leftMargin;
                    i = this.f10122e;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c14840e2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f10122e;
                right = left - i;
            }
            appmetrica(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4735e.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4735e.onMeasure(int, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eٜٔ۟, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [eٜٔ۟, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: purchase, reason: merged with bridge method [inline-methods] */
    public C14840e generateDefaultLayoutParams() {
        int i = this.f10130e;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    public void setBaselineAligned(boolean z) {
        this.f10132e = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f10126e = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f10129e) {
            return;
        }
        this.f10129e = drawable;
        if (drawable != null) {
            this.f10122e = drawable.getIntrinsicWidth();
            this.f10121e = drawable.getIntrinsicHeight();
        } else {
            this.f10122e = 0;
            this.f10121e = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f10127e = i;
    }

    public void setGravity(int i) {
        if (this.f10120e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f10120e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f10120e;
        if ((8388615 & i3) != i2) {
            this.f10120e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f10128e = z;
    }

    public void setOrientation(int i) {
        if (this.f10130e != i) {
            this.f10130e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f10125e) {
            requestLayout();
        }
        this.f10125e = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f10120e;
        if ((i3 & 112) != i2) {
            this.f10120e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f10133e = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean startapp(int i) {
        if (i == 0) {
            return (this.f10125e & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f10125e & 4) != 0;
        }
        if ((this.f10125e & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eٜٔ۟, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [eٜٔ۟, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [eٜٔ۟, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: yandex, reason: merged with bridge method [inline-methods] */
    public C14840e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C14840e ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LinearLayout.LayoutParams(layoutParams);
    }
}
