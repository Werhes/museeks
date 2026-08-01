package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Random;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2513e extends Drawable {
    public final int Signature;
    public final AccelerateInterpolator ad;
    public final Random adcel;
    public boolean admob;
    public final int advert;
    public final Canvas amazon;
    public final int appmetrica;
    public final float[] billing;
    public final int license;
    public final Paint loadAd;
    public final DecelerateInterpolator metrica;
    public final RectF mopub;
    public final TimeInterpolator[] purchase;
    public final int smaato;
    public final float[] startapp;
    public long subscription = 0;
    public final int vip;
    public final Paint yandex;

    public C2513e(C2756e c2756e) {
        int i = c2756e.ad;
        this.vip = i;
        int i2 = c2756e.purchase;
        this.smaato = i2;
        int i3 = c2756e.license;
        this.advert = i3;
        int i4 = c2756e.appmetrica;
        if (i4 > i3) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i4, i3, "rectMinHeight = ", " must not be greater than rectHeight = "));
        }
        int i5 = c2756e.vip;
        this.license = i5;
        int i6 = ((i2 + i5) * i) - i5;
        this.Signature = i6;
        this.appmetrica = i3;
        Bitmap createBitmap = Bitmap.createBitmap(i6, i3, Bitmap.Config.ARGB_8888);
        this.amazon = new Canvas(createBitmap);
        this.mopub = new RectF();
        this.adcel = new Random();
        Paint paint = new Paint(1);
        this.loadAd = paint;
        paint.setColor(c2756e.metrica);
        Paint paint2 = new Paint(1);
        this.yandex = paint2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        this.startapp = new float[i];
        this.billing = new float[i];
        this.purchase = new TimeInterpolator[i];
        this.metrica = new DecelerateInterpolator();
        this.ad = new AccelerateInterpolator();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF;
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        Rect bounds = getBounds();
        int width = bounds.width();
        int i = this.Signature;
        int height = bounds.height();
        int i2 = this.appmetrica;
        canvas.translate((width - i) / 2, (height - i2) / 2);
        long j = currentTimeMillis - this.subscription;
        TimeInterpolator[] timeInterpolatorArr = this.purchase;
        int i3 = this.vip;
        float[] fArr = this.billing;
        float[] fArr2 = this.startapp;
        if (j > 150) {
            this.subscription = currentTimeMillis;
            for (int i4 = 0; i4 < i3; i4++) {
                fArr2[i4] = fArr[i4];
                if (this.admob) {
                    fArr[i4] = (float) (Math.cbrt(this.adcel.nextInt(1000000)) / 100.0d);
                } else {
                    fArr[i4] = 0.0f;
                }
                timeInterpolatorArr[i4] = fArr[i4] > fArr2[i4] ? this.ad : this.metrica;
            }
        }
        float f = ((float) (currentTimeMillis - this.subscription)) / 150.0f;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        Canvas canvas2 = this.amazon;
        canvas2.drawColor(0, mode);
        int i5 = 0;
        float f2 = 0.0f;
        while (true) {
            rectF = this.mopub;
            if (i5 >= i3) {
                break;
            }
            float f3 = fArr2[i5];
            f2 += f3;
            int i6 = this.license;
            int i7 = this.smaato;
            float f4 = (i6 + i7) * i5;
            int i8 = i5;
            float interpolation = (timeInterpolatorArr[i8].getInterpolation(f) * (fArr[i5] - f3)) + f3;
            float f5 = f;
            rectF.set(f4, r15 - Math.max(Math.round(interpolation * r2), i7), i7 + f4, this.advert);
            float f6 = 0;
            canvas2.drawRoundRect(rectF, f6, f6, this.loadAd);
            i5 = i8 + 1;
            f = f5;
        }
        rectF.set(0.0f, 0.0f, i, i2);
        canvas.drawRect(rectF, this.yandex);
        canvas.restore();
        if (f2 != 0.0f || this.admob) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z = this.admob;
        this.admob = false;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (iArr[i] == 16843518) {
                this.admob = true;
                break;
            }
            i++;
        }
        return z == this.admob;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.yandex.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.yandex.setColorFilter(colorFilter);
    }
}
