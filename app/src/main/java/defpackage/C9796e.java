package defpackage;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9796e extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public float f19346e = 1.0f;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public float f19347e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f19348e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public float f19349e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Drawable f19350e;

    public C9796e(Drawable drawable, int i) {
        this.f19350e = drawable;
        this.f19348e = i;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.translate(this.f19347e, this.f19349e);
            float f = this.f19346e;
            canvas.scale(f, f);
            this.f19350e.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f19350e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f19350e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f19350e.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f19350e.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f19350e.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f19350e;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f19350e.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19350e;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            this.f19347e = 0.0f;
            this.f19349e = 0.0f;
            this.f19346e = 1.0f;
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double vip = AbstractC2774e.vip(intrinsicWidth, intrinsicHeight, width, height, this.f19348e, C16320e.metrica);
        double d = 2;
        int license = AbstractC1561e.license((width - (intrinsicWidth * vip)) / d);
        int license2 = AbstractC1561e.license((height - (intrinsicHeight * vip)) / d);
        drawable.setBounds(license, license2, intrinsicWidth + license, intrinsicHeight + license2);
        this.f19347e = rect.left;
        this.f19349e = rect.top;
        this.f19346e = (float) vip;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f19350e.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.f19350e.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f19350e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19350e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.f19350e.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        this.f19350e.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f19350e.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f19350e.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f19350e;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f19350e;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
