package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4692e extends AbstractC8135e {
    public float metrica;
    public float vip;

    @Override // defpackage.AbstractC8135e
    public final void ad(Matrix matrix, Path path) {
        Matrix matrix2 = this.ad;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.vip, this.metrica);
        path.transform(matrix);
    }
}
