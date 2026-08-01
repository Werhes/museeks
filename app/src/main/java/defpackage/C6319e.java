package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6319e implements InterfaceC3582e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Matrix f13149e = new Matrix();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int[] f13148e = new int[2];

    @Override // defpackage.InterfaceC3582e
    public void vip(View view, float[] fArr) {
        Matrix matrix = this.f13149e;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f13148e;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        C14155e.license(matrix, fArr);
    }
}
