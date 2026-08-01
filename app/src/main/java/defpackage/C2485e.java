package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2485e extends Drawable {
    public float ad;
    public ColorStateList adcel;
    public float appmetrica;
    public final Rect license;
    public final RectF metrica;
    public PorterDuffColorFilter startapp;
    public final Paint vip;
    public ColorStateList yandex;
    public boolean purchase = false;
    public boolean billing = true;
    public PorterDuff.Mode mopub = PorterDuff.Mode.SRC_IN;

    public C2485e(ColorStateList colorStateList, float f) {
        this.ad = f;
        Paint paint = new Paint(5);
        this.vip = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.yandex = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.yandex.getDefaultColor()));
        this.metrica = new RectF();
        this.license = new Rect();
    }

    public final PorterDuffColorFilter ad(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.startapp;
        Paint paint = this.vip;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.startapp);
            z = true;
        }
        RectF rectF = this.metrica;
        float f = this.ad;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.license, this.ad);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.adcel;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.yandex;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        vip(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.yandex;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.vip;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.adcel;
        if (colorStateList2 == null || (mode = this.mopub) == null) {
            return z;
        }
        this.startapp = ad(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.vip.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.vip.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.adcel = colorStateList;
        this.startapp = ad(colorStateList, this.mopub);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.mopub = mode;
        this.startapp = ad(this.adcel, mode);
        invalidateSelf();
    }

    public final void vip(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        RectF rectF = this.metrica;
        rectF.set(f, f2, f3, f4);
        Rect rect2 = this.license;
        rect2.set(rect);
        if (this.purchase) {
            rect2.inset((int) Math.ceil(AbstractC3178e.ad(this.appmetrica, this.ad, this.billing)), (int) Math.ceil(AbstractC3178e.vip(this.appmetrica, this.ad, this.billing)));
            rectF.set(rect2);
        }
    }
}
