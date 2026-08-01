package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12400e extends AbstractC14545e {
    public boolean appmetrica;
    public float license;
    public float metrica;
    public float purchase;
    public float vip;

    public final int license() {
        C12780e c12780e = this.ad;
        return (c12780e.startapp * 2) + c12780e.yandex;
    }

    public final void metrica(Canvas canvas, Paint paint, float f, float f2, float f3, float f4) {
        float min = (int) Math.min(f3, this.vip);
        float f5 = f2 / 2.0f;
        float min2 = Math.min(f5, (this.metrica * min) / this.vip);
        RectF rectF = new RectF((-min) / 2.0f, (-f2) / 2.0f, min / 2.0f, f5);
        canvas.save();
        double d = f;
        canvas.translate((float) (Math.cos(Math.toRadians(d)) * this.license), (float) (Math.sin(Math.toRadians(d)) * this.license));
        canvas.rotate(f);
        canvas.scale(f4, f4);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final void vip(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        float f3 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f4 = f % 1.0f;
        if (this.purchase < 1.0f) {
            float f5 = f4 + f3;
            if (f5 > 1.0f) {
                vip(canvas, paint, f4, 1.0f, i, i2, 0);
                vip(canvas, paint, 1.0f, f5, i, 0, i3);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.metrica / this.license);
        if (f4 == 0.0f && f3 >= 0.99f) {
            f3 += (((degrees * 2.0f) / 360.0f) * (f3 - 0.99f)) / 0.01f;
        }
        float appmetrica = AbstractC16481e.appmetrica(1.0f - this.purchase, 1.0f, f4);
        float appmetrica2 = AbstractC16481e.appmetrica(0.0f, this.purchase, f3);
        float degrees2 = (float) Math.toDegrees(i2 / this.license);
        float degrees3 = ((appmetrica2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.license));
        float f6 = (appmetrica * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.vip);
        float f7 = degrees * 2.0f;
        if (degrees3 < f7) {
            float f8 = degrees3 / f7;
            paint.setStyle(Paint.Style.FILL);
            metrica(canvas, paint, (degrees * f8) + f6, this.metrica * 2.0f, this.vip, f8);
            return;
        }
        float f9 = this.license;
        float f10 = -f9;
        RectF rectF = new RectF(f10, f10, f9, f9);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.appmetrica ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f11 = f6 + degrees;
        canvas.drawArc(rectF, f11, degrees3 - f7, false, paint);
        if (this.appmetrica || this.metrica <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        metrica(canvas, paint, f11, this.metrica * 2.0f, this.vip, 1.0f);
        metrica(canvas, paint, (f6 + degrees3) - degrees, this.metrica * 2.0f, this.vip, 1.0f);
    }
}
