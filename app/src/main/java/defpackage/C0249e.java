package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0249e extends AbstractC8135e {
    public static final RectF yandex = new RectF();
    public final float appmetrica;
    public float billing;
    public final float license;
    public final float metrica;
    public float purchase;
    public final float vip;

    public C0249e(float f, float f2, float f3, float f4) {
        this.vip = f;
        this.metrica = f2;
        this.license = f3;
        this.appmetrica = f4;
    }

    @Override // defpackage.AbstractC8135e
    public final void ad(Matrix matrix, Path path) {
        Matrix matrix2 = this.ad;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.license;
        float f2 = this.appmetrica;
        RectF rectF = yandex;
        rectF.set(this.vip, this.metrica, f, f2);
        path.arcTo(rectF, this.purchase, this.billing, false);
        path.transform(matrix);
    }
}
