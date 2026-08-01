package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14495e extends AbstractC4735e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public boolean f28677e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final Rect f28678e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final Rect f28679e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public Drawable f28680e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public int f28681e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final boolean f28682e;

    public AbstractC14495e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f28679e = new Rect();
        this.f28678e = new Rect();
        this.f28681e = 119;
        this.f28682e = true;
        this.f28677e = false;
        AbstractC15787e.ad(context, attributeSet, 0, 0);
        int[] iArr = AbstractC11408e.loadAd;
        AbstractC15787e.vip(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f28681e = obtainStyledAttributes.getInt(1, this.f28681e);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f28682e = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f28680e;
        if (drawable != null) {
            if (this.f28677e) {
                this.f28677e = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f28682e;
                Rect rect = this.f28679e;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f28681e;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f28678e;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f28680e;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f28680e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f28680e.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f28680e;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f28681e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f28680e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // defpackage.AbstractC4735e, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f28677e = z | this.f28677e;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f28677e = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f28680e;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f28680e);
            }
            this.f28680e = drawable;
            this.f28677e = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f28681e == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f28681e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f28681e = i;
            if (i == 119 && this.f28680e != null) {
                this.f28680e.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f28680e;
    }
}
