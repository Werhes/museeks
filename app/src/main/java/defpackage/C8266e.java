package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۡؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8266e extends Drawable implements Animatable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public float f16781e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Resources f16782e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public float f16783e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ValueAnimator f16784e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1935e f16785e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f16786e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final LinearInterpolator f16780e = new LinearInterpolator();

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C17633e f16778e = new C17633e(1);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final int[] f16779e = {-16777216};

    public C8266e(Context context) {
        context.getClass();
        this.f16782e = context.getResources();
        C1935e c1935e = new C1935e();
        this.f16785e = c1935e;
        c1935e.startapp = f16779e;
        c1935e.ad(0);
        c1935e.yandex = 2.5f;
        c1935e.vip.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C8480e(this, c1935e));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f16780e);
        ofFloat.addListener(new C0786e(this, c1935e));
        this.f16784e = ofFloat;
    }

    public static void license(float f, C1935e c1935e) {
        if (f <= 0.75f) {
            c1935e.signatures = c1935e.startapp[c1935e.adcel];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = c1935e.startapp;
        int i = c1935e.adcel;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        c1935e.signatures = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r1) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r3) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r4) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r2))));
    }

    public final void ad(float f, C1935e c1935e, boolean z) {
        float interpolation;
        float f2;
        if (this.f16786e) {
            license(f, c1935e);
            float floor = (float) (Math.floor(c1935e.smaato / 0.8f) + 1.0d);
            float f3 = c1935e.mopub;
            float f4 = c1935e.advert;
            c1935e.appmetrica = (((f4 - 0.01f) - f3) * f) + f3;
            c1935e.purchase = f4;
            float f5 = c1935e.smaato;
            c1935e.billing = AbstractC1634e.billing(floor, f5, f, f5);
            return;
        }
        if (f != 1.0f || z) {
            float f6 = c1935e.smaato;
            C17633e c17633e = f16778e;
            if (f < 0.5f) {
                interpolation = c1935e.mopub;
                f2 = (c17633e.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f7 = c1935e.mopub + 0.79f;
                interpolation = f7 - (((1.0f - c17633e.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f7;
            }
            float f8 = (0.20999998f * f) + f6;
            float f9 = (f + this.f16781e) * 216.0f;
            c1935e.appmetrica = interpolation;
            c1935e.purchase = f2;
            c1935e.billing = f8;
            this.f16783e = f9;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f16783e, bounds.exactCenterX(), bounds.exactCenterY());
        C1935e c1935e = this.f16785e;
        Paint paint = c1935e.vip;
        RectF rectF = c1935e.ad;
        float f = c1935e.admob;
        float f2 = (c1935e.yandex / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c1935e.subscription * c1935e.Signature) / 2.0f, c1935e.yandex / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = c1935e.appmetrica;
        float f4 = c1935e.billing;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((c1935e.purchase + f4) * 360.0f) - f5;
        paint.setColor(c1935e.signatures);
        paint.setAlpha(c1935e.pro);
        float f7 = c1935e.yandex / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c1935e.license);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        Paint paint2 = c1935e.metrica;
        if (c1935e.amazon) {
            Path path = c1935e.loadAd;
            if (path == null) {
                Path path2 = new Path();
                c1935e.loadAd = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (c1935e.subscription * c1935e.Signature) / 2.0f;
            c1935e.loadAd.moveTo(0.0f, 0.0f);
            c1935e.loadAd.lineTo(c1935e.subscription * c1935e.Signature, 0.0f);
            Path path3 = c1935e.loadAd;
            float f10 = c1935e.subscription;
            float f11 = c1935e.Signature;
            path3.lineTo((f10 * f11) / 2.0f, c1935e.remoteconfig * f11);
            c1935e.loadAd.offset((rectF.centerX() + min) - f9, (c1935e.yandex / 2.0f) + rectF.centerY());
            c1935e.loadAd.close();
            paint2.setColor(c1935e.signatures);
            paint2.setAlpha(c1935e.pro);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c1935e.loadAd, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16785e.pro;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f16784e.isRunning();
    }

    public final void metrica(int i) {
        if (i == 0) {
            vip(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            vip(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f16785e.pro = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f16785e.vip.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f16784e.cancel();
        C1935e c1935e = this.f16785e;
        float f = c1935e.appmetrica;
        c1935e.mopub = f;
        float f2 = c1935e.purchase;
        c1935e.advert = f2;
        c1935e.smaato = c1935e.billing;
        if (f2 != f) {
            this.f16786e = true;
            this.f16784e.setDuration(666L);
            this.f16784e.start();
            return;
        }
        c1935e.ad(0);
        c1935e.mopub = 0.0f;
        c1935e.advert = 0.0f;
        c1935e.smaato = 0.0f;
        c1935e.appmetrica = 0.0f;
        c1935e.purchase = 0.0f;
        c1935e.billing = 0.0f;
        this.f16784e.setDuration(1332L);
        this.f16784e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f16784e.cancel();
        this.f16783e = 0.0f;
        C1935e c1935e = this.f16785e;
        if (c1935e.amazon) {
            c1935e.amazon = false;
        }
        c1935e.ad(0);
        c1935e.mopub = 0.0f;
        c1935e.advert = 0.0f;
        c1935e.smaato = 0.0f;
        c1935e.appmetrica = 0.0f;
        c1935e.purchase = 0.0f;
        c1935e.billing = 0.0f;
        invalidateSelf();
    }

    public final void vip(float f, float f2, float f3, float f4) {
        float f5 = this.f16782e.getDisplayMetrics().density;
        float f6 = f2 * f5;
        C1935e c1935e = this.f16785e;
        c1935e.yandex = f6;
        c1935e.vip.setStrokeWidth(f6);
        c1935e.admob = f * f5;
        c1935e.ad(0);
        c1935e.subscription = (int) (f3 * f5);
        c1935e.remoteconfig = (int) (f4 * f5);
    }
}
