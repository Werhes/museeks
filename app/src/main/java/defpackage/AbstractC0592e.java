package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ۟ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0592e extends FrameLayout {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final ViewOnTouchListenerC14726e f2789e = new Object();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f2790e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final float f2791e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f2792e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public PorterDuff.Mode f2793e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final float f2794e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15339e f2795e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public ColorStateList f2796e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f2797e;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0592e(Context context, AttributeSet attributeSet) {
        super(AbstractC14436e.purchase(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC11408e.f22938interface);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            setElevation(dimensionPixelSize);
        }
        this.f2792e = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f2795e = C15339e.vip(context2, attributeSet, 0, 0).ad();
        }
        this.f2791e = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC2774e.license(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC6286e.advert(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f2794e = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f2790e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f2797e = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f2789e);
        setFocusable(true);
        if (getBackground() == null) {
            int admob = AbstractC9546e.admob(AbstractC9546e.advert(this, R.attr.colorSurface), getBackgroundOverlayColorAlpha(), AbstractC9546e.advert(this, R.attr.colorOnSurface));
            C15339e c15339e = this.f2795e;
            if (c15339e != null) {
                int i = AbstractC5650e.ad;
                C11252e c11252e = new C11252e(c15339e);
                c11252e.advert(ColorStateList.valueOf(admob));
                gradientDrawable = c11252e;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC5650e.ad;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(admob);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f2796e;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = AbstractC2016e.ad;
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(AbstractC5650e abstractC5650e) {
    }

    public float getActionTextColorAlpha() {
        return this.f2794e;
    }

    public int getAnimationMode() {
        return this.f2792e;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f2791e;
    }

    public int getMaxInlineActionWidth() {
        return this.f2797e;
    }

    public int getMaxWidth() {
        return this.f2790e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f2790e;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f2792e = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f2796e != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f2796e);
            drawable.setTintMode(this.f2793e);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f2796e = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f2793e);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f2793e = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f2789e);
        super.setOnClickListener(onClickListener);
    }
}
