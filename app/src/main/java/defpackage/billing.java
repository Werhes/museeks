package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public final class billing implements InterfaceC17022e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Integer f631e;

    public final Integer ad(Context context) {
        if (this.f631e == null) {
            this.f631e = Integer.valueOf((int) TypedValue.applyDimension(1, 54.0f, context.getResources().getDisplayMetrics()));
        }
        return this.f631e;
    }

    @Override // defpackage.InterfaceC17022e
    public final boolean metrica() {
        return false;
    }

    @Override // defpackage.InterfaceC17022e
    public final void vip(C1059e c1059e, View view, int i, float f) {
        float f2 = 1.0f - f;
        if (view != null) {
            float intValue = ad(view.getContext()).intValue();
            if (i == 2) {
                view.setTranslationX(intValue * f2);
                view.setAlpha(1.0f - f2);
            } else {
                view.setTranslationX((1.0f - f2) * (-intValue));
                view.setAlpha(f2);
            }
        }
    }
}
