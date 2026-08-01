package defpackage;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.View;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۢۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15807e extends ProgressBar {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f31166e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C1681e f31167e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f31168e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final RunnableC3105e f31169e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f31170e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f31171e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C1681e f31172e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f31173e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final RunnableC3105e f31174e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C12780e f31175e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f31176e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C14085e f31177e;

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, eّ۟ٛ] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, eٓٚۥ] */
    public AbstractC15807e(Context context) {
        super(AbstractC14436e.purchase(context, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_ProgressIndicator), null, R.attr.circularProgressIndicatorStyle);
        this.f31176e = false;
        this.f31171e = 4;
        this.f31174e = new RunnableC3105e(this, 0);
        this.f31169e = new RunnableC3105e(this, 1);
        this.f31172e = new C1681e(this, 0);
        this.f31167e = new C1681e(this, 1);
        Context context2 = getContext();
        ?? obj = new Object();
        obj.metrica = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        AbstractC15787e.ad(context2, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = AbstractC11408e.license;
        AbstractC15787e.vip(context2, null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        obj.ad = AbstractC2774e.appmetrica(context2, obtainStyledAttributes, 9, dimensionPixelSize);
        obj.vip = Math.min(AbstractC2774e.appmetrica(context2, obtainStyledAttributes, 8, 0), obj.ad / 2);
        obj.appmetrica = obtainStyledAttributes.getInt(5, 0);
        obj.purchase = obtainStyledAttributes.getInt(1, 0);
        obj.billing = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            obj.metrica = new int[]{AbstractC9546e.mopub(context2, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(2).type != 1) {
            obj.metrica = new int[]{obtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(obtainStyledAttributes.getResourceId(2, -1));
            obj.metrica = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(7)) {
            obj.license = obtainStyledAttributes.getColor(7, -1);
        } else {
            obj.license = obj.metrica[0];
            TypedArray obtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            obj.license = AbstractC9546e.billing(obj.license, (int) (f * 255.0f));
        }
        obtainStyledAttributes.recycle();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        AbstractC15787e.ad(context2, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr2 = AbstractC11408e.startapp;
        AbstractC15787e.vip(context2, null, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(null, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        obj.yandex = Math.max(AbstractC2774e.appmetrica(context2, obtainStyledAttributes3, 2, dimensionPixelSize2), obj.ad * 2);
        obj.startapp = AbstractC2774e.appmetrica(context2, obtainStyledAttributes3, 1, dimensionPixelSize3);
        obj.adcel = obtainStyledAttributes3.getInt(0, 0);
        obtainStyledAttributes3.recycle();
        obj.ad();
        this.f31175e = obj;
        AbstractC15787e.ad(context2, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        AbstractC15787e.vip(context2, null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes4 = context2.obtainStyledAttributes(null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        obtainStyledAttributes4.getInt(6, -1);
        this.f31166e = Math.min(obtainStyledAttributes4.getInt(4, -1), 1000);
        obtainStyledAttributes4.recycle();
        this.f31177e = new Object();
        this.f31173e = true;
    }

    private AbstractC14545e getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f28004e;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f36063e;
    }

    public final void ad(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f31170e = i;
            this.f31168e = z;
            this.f31176e = true;
            if (getIndeterminateDrawable().isVisible()) {
                C14085e c14085e = this.f31177e;
                ContentResolver contentResolver = getContext().getContentResolver();
                c14085e.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    C14913e c14913e = getIndeterminateDrawable().f28003e;
                    ObjectAnimator objectAnimator = c14913e.f29558e;
                    if (objectAnimator == null || objectAnimator.isRunning()) {
                        return;
                    }
                    if (((C14160e) c14913e.f22047e).isVisible()) {
                        c14913e.f29558e.start();
                        return;
                    }
                    ObjectAnimator objectAnimator2 = c14913e.f29562e;
                    if (objectAnimator2 != null) {
                        objectAnimator2.cancel();
                        return;
                    }
                    return;
                }
            }
            this.f31172e.ad(getIndeterminateDrawable());
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f31175e.purchase;
    }

    @Override // android.widget.ProgressBar
    public C14160e getIndeterminateDrawable() {
        return (C14160e) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.f31175e.metrica;
    }

    public int getIndicatorTrackGapSize() {
        return this.f31175e.billing;
    }

    @Override // android.widget.ProgressBar
    public C18397e getProgressDrawable() {
        return (C18397e) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f31175e.appmetrica;
    }

    public int getTrackColor() {
        return this.f31175e.license;
    }

    public int getTrackCornerRadius() {
        return this.f31175e.vip;
    }

    public int getTrackThickness() {
        return this.f31175e.ad;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f28003e.f29561e = this.f31172e;
        }
        C18397e progressDrawable = getProgressDrawable();
        C1681e c1681e = this.f31167e;
        if (progressDrawable != null) {
            C18397e progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f12070e == null) {
                progressDrawable2.f12070e = new ArrayList();
            }
            if (!progressDrawable2.f12070e.contains(c1681e)) {
                progressDrawable2.f12070e.add(c1681e);
            }
        }
        if (getIndeterminateDrawable() != null) {
            C14160e indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f12070e == null) {
                indeterminateDrawable.f12070e = new ArrayList();
            }
            if (!indeterminateDrawable.f12070e.contains(c1681e)) {
                indeterminateDrawable.f12070e.add(c1681e);
            }
        }
        if (vip()) {
            if (this.f31166e > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f31169e);
        removeCallbacks(this.f31174e);
        ((AbstractC5682e) getCurrentDrawable()).metrica(false, false, false);
        C14160e indeterminateDrawable = getIndeterminateDrawable();
        C1681e c1681e = this.f31167e;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().appmetrica(c1681e);
            getIndeterminateDrawable().f28003e.f29561e = null;
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().appmetrica(c1681e);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            AbstractC14545e currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(((C12400e) currentDrawingDelegate).license() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : ((C12400e) currentDrawingDelegate).license() + getPaddingLeft() + getPaddingRight(), ((C12400e) currentDrawingDelegate).license() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : ((C12400e) currentDrawingDelegate).license() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.f31173e) {
            ((AbstractC5682e) getCurrentDrawable()).metrica(vip(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f31173e) {
            ((AbstractC5682e) getCurrentDrawable()).metrica(vip(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(C14085e c14085e) {
        this.f31177e = c14085e;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f12062e = c14085e;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f12062e = c14085e;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f31175e.purchase = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            AbstractC5682e abstractC5682e = (AbstractC5682e) getCurrentDrawable();
            if (abstractC5682e != null) {
                abstractC5682e.metrica(false, false, false);
            }
            super.setIndeterminate(z);
            AbstractC5682e abstractC5682e2 = (AbstractC5682e) getCurrentDrawable();
            if (abstractC5682e2 != null) {
                abstractC5682e2.metrica(vip(), false, false);
            }
            if ((abstractC5682e2 instanceof C14160e) && vip()) {
                ((C14160e) abstractC5682e2).f28003e.m3888e();
            }
            this.f31176e = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof C14160e)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((AbstractC5682e) drawable).metrica(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{AbstractC9546e.mopub(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f31175e.metrica = iArr;
        C14913e c14913e = getIndeterminateDrawable().f28003e;
        c14913e.f29560e = 0;
        ((C11638e) ((ArrayList) c14913e.f22046e).get(0)).metrica = c14913e.f29564e.metrica[0];
        c14913e.f29559e = 0.0f;
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        C12780e c12780e = this.f31175e;
        if (c12780e.billing != i) {
            c12780e.billing = i;
            c12780e.ad();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        ad(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof C18397e)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            C18397e c18397e = (C18397e) drawable;
            c18397e.metrica(false, false, false);
            super.setProgressDrawable(c18397e);
            c18397e.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f31175e.appmetrica = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        C12780e c12780e = this.f31175e;
        if (c12780e.license != i) {
            c12780e.license = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        C12780e c12780e = this.f31175e;
        if (c12780e.vip != i) {
            c12780e.vip = Math.min(i, c12780e.ad / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        C12780e c12780e = this.f31175e;
        if (c12780e.ad != i) {
            c12780e.ad = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f31171e = i;
    }

    public final boolean vip() {
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }
}
