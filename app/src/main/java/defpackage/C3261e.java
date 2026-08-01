package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3261e extends C17017e {
    @Override // defpackage.C17017e
    public final void applovin(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.AbstractC3995e
    public final float billing(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.C17017e
    public final void inmobi(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.C17017e
    public final void isPro(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.AbstractC3995e
    public final void signatures(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.C17017e, defpackage.AbstractC3995e
    public final void tapsense(View view, int i) {
        view.setTransitionVisibility(i);
    }
}
