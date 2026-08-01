package defpackage;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15198e extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f30094e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f30095e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Drawable f30096e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f30097e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f30098e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final Drawable f30099e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ArrayList f30100e = new ArrayList();

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f30101e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f30102e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f30103e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f30104e;

    public C15198e(Drawable drawable, Drawable drawable2, int i, int i2, boolean z) {
        this.f30102e = i;
        this.f30097e = i2;
        this.f30095e = z;
        this.f30094e = ad(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f30104e = ad(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f30098e = 255;
        this.f30096e = drawable != null ? drawable.mutate() : null;
        Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
        this.f30099e = mutate;
        if (i2 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable3 = this.f30096e;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (mutate != null) {
            mutate.setCallback(this);
        }
    }

    public final int ad(Integer num, Integer num2) {
        if ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1)) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save;
        Drawable drawable;
        int i = this.f30101e;
        if (i == 0) {
            Drawable drawable2 = this.f30096e;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f30098e);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f30099e;
        if (i == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f30098e);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double uptimeMillis = (SystemClock.uptimeMillis() - this.f30103e) / this.f30097e;
        double ad = AbstractC3062e.ad(uptimeMillis, 0.0d, 1.0d);
        int i2 = this.f30098e;
        int i3 = (int) (ad * i2);
        if (this.f30095e) {
            i2 -= i3;
        }
        boolean z = uptimeMillis >= 1.0d;
        if (!z && (drawable = this.f30096e) != null) {
            drawable.setAlpha(i2);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i3);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z) {
            vip();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f30098e;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i = this.f30101e;
        if (i == 0) {
            Drawable drawable = this.f30096e;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f30099e;
        if (i != 1) {
            if (i == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f30096e;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f30104e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f30094e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f30096e;
        int i = this.f30101e;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f30099e;
        if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f30101e == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f30096e;
        if (drawable != null ? drawable.isStateful() : false) {
            return true;
        }
        Drawable drawable2 = this.f30099e;
        return drawable2 != null ? drawable2.isStateful() : false;
    }

    public final void metrica(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double vip = AbstractC2774e.vip(intrinsicWidth, intrinsicHeight, width, height, this.f30102e, C16320e.metrica);
        double d = 2;
        int license = AbstractC1561e.license((width - (intrinsicWidth * vip)) / d);
        int license2 = AbstractC1561e.license((height - (vip * intrinsicHeight)) / d);
        drawable.setBounds(rect.left + license, rect.top + license2, rect.right - license, rect.bottom - license2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f30096e;
        if (drawable != null) {
            metrica(drawable, rect);
        }
        Drawable drawable2 = this.f30099e;
        if (drawable2 != null) {
            metrica(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f30096e;
        boolean level = drawable != null ? drawable.setLevel(i) : false;
        Drawable drawable2 = this.f30099e;
        return level || (drawable2 != null ? drawable2.setLevel(i) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f30096e;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f30099e;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "Invalid alpha: ").toString());
        }
        this.f30098e = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f30096e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f30099e;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f30096e;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.f30099e;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f30096e;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f30099e;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f30096e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f30099e;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f30096e;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f30099e;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f30096e;
        boolean z3 = drawable != null && drawable.setVisible(z, z2);
        Drawable drawable2 = this.f30099e;
        return visible || z3 || (drawable2 != null && drawable2.setVisible(z, z2));
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f30096e;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f30099e;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f30101e != 0) {
            return;
        }
        this.f30101e = 1;
        this.f30103e = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f30100e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8715e) arrayList.get(i)).vip(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f30096e;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f30099e;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f30101e != 2) {
            vip();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void vip() {
        this.f30101e = 2;
        this.f30096e = null;
        ArrayList arrayList = this.f30100e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8715e) arrayList.get(i)).ad(this);
        }
    }
}
