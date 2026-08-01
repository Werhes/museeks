package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17989e extends AbstractC4857e {
    public final C1244e metrica;
    public final Matrix vip;

    public C17989e(Matrix matrix, C1244e c1244e) {
        this.vip = matrix;
        this.metrica = c1244e;
    }

    @Override // defpackage.AbstractC4857e
    public final void ad(Paint paint) {
        if (this.ad) {
            this.ad = false;
            C1244e c1244e = this.metrica;
            float floatValue = ((Float) c1244e.billing.ad).floatValue();
            float floatValue2 = ((Float) c1244e.yandex.ad).floatValue();
            Matrix matrix = this.vip;
            matrix.setTranslate(floatValue, floatValue2);
            matrix.preScale(c1244e.metrica(), c1244e.metrica());
            paint.getShader().setLocalMatrix(matrix);
        }
    }
}
