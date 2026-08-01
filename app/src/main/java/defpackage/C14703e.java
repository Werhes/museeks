package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14703e extends Drawable {
    public final Bitmap ad;
    public final Rect appmetrica;
    public final Rect license;
    public int metrica = 255;
    public final Paint vip;

    static {
        C12232e c12232e = AbstractC3820e.ad;
        c12232e.yandex(new C12156e(c12232e.vip(C14703e.class), "centerPaint", "getCenterPaint()Landroid/graphics/Paint;"));
        c12232e.yandex(new C12156e(c12232e.vip(C14703e.class), "debugPaint", "getDebugPaint()Landroid/graphics/Paint;"));
        c12232e.yandex(new C12156e(c12232e.vip(C14703e.class), "bitmapPaint", "getBitmapPaint()Landroid/graphics/Paint;"));
        c12232e.yandex(new C12156e(c12232e.vip(C14703e.class), "targetPaint", "getTargetPaint()Landroid/graphics/Paint;"));
    }

    public C14703e(Activity activity) {
        Rect rect = new Rect();
        this.license = rect;
        this.appmetrica = new Rect();
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.vip = paint;
        if (AbstractC10888e.ad == null) {
            synchronized (C11047e.f21904e) {
                if (AbstractC10888e.ad == null) {
                    AbstractC10888e.ad = AbstractC10888e.metrica(activity);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        Bitmap bitmap = AbstractC10888e.ad;
        this.ad = bitmap;
        rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.drawBitmap(this.ad, this.license, this.appmetrica, this.vip);
            canvas.restore();
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.metrica;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.appmetrica.set(0, 0, rect.width(), rect.height());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.metrica = i;
        this.vip.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.vip.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        super.setTint(i);
        this.vip.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }
}
