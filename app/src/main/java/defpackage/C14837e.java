package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14837e extends AbstractC15107e {
    public final float appmetrica;
    public final float license;
    public final C4692e metrica;

    public C14837e(C4692e c4692e, float f, float f2) {
        this.metrica = c4692e;
        this.license = f;
        this.appmetrica = f2;
    }

    @Override // defpackage.AbstractC15107e
    public final void ad(Matrix matrix, C11224e c11224e, int i, Canvas canvas) {
        C4692e c4692e = this.metrica;
        float f = c4692e.metrica;
        float f2 = this.appmetrica;
        float f3 = c4692e.vip;
        float f4 = this.license;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.ad;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(vip());
        c11224e.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = c11224e.metrica;
        int[] iArr = C11224e.startapp;
        iArr[0] = i2;
        iArr[1] = c11224e.vip;
        iArr[2] = c11224e.ad;
        Paint paint = (Paint) c11224e.purchase;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C11224e.adcel, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float vip() {
        C4692e c4692e = this.metrica;
        return (float) Math.toDegrees(Math.atan((c4692e.metrica - this.appmetrica) / (c4692e.vip - this.license)));
    }
}
