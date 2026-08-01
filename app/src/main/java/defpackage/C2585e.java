package defpackage;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2585e implements TransformationMethod {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final TransformationMethod f6442e;

    public C2585e(TransformationMethod transformationMethod) {
        this.f6442e = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f6442e;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C5188e.ad().metrica() != 1) {
            return charSequence;
        }
        C5188e ad = C5188e.ad();
        ad.getClass();
        return ad.billing(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f6442e;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
