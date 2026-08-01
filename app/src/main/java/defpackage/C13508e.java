package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۛۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13508e extends AbstractC15107e {
    public final C0249e metrica;

    public C13508e(C0249e c0249e) {
        this.metrica = c0249e;
    }

    @Override // defpackage.AbstractC15107e
    public final void ad(Matrix matrix, C11224e c11224e, int i, Canvas canvas) {
        float f;
        C0249e c0249e = this.metrica;
        float f2 = c0249e.purchase;
        float f3 = c0249e.billing;
        RectF rectF = new RectF(c0249e.vip, c0249e.metrica, c0249e.license, c0249e.appmetrica);
        Paint paint = (Paint) c11224e.appmetrica;
        boolean z = f3 < 0.0f;
        Path path = (Path) c11224e.yandex;
        int[] iArr = C11224e.mopub;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c11224e.metrica;
            iArr[2] = c11224e.vip;
            iArr[3] = c11224e.ad;
            f = 0.0f;
        } else {
            path.rewind();
            f = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = c11224e.ad;
            iArr[2] = c11224e.vip;
            iArr[3] = c11224e.metrica;
        }
        float width = rectF.width() / 2.0f;
        if (width <= f) {
            return;
        }
        float f5 = 1.0f - (i / width);
        float[] fArr = C11224e.advert;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, (Paint) c11224e.billing);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
