package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۧۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18518e extends ViewOutlineProvider {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C18518e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float f;
        switch (this.ad) {
            case 0:
                AbstractC5004e abstractC5004e = (AbstractC5004e) this.vip;
                if (abstractC5004e.f10592e) {
                    f = 0.0f;
                } else {
                    f = (1.0f - abstractC5004e.f10586e) * AbstractC5004e.f10577e;
                }
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), (int) (view.getMeasuredHeight() + AbstractC5004e.f10577e), f);
                return;
            default:
                C15411e c15411e = ((Chip) this.vip).f841e;
                if (c15411e != null) {
                    c15411e.getOutline(outline);
                    return;
                } else {
                    outline.setAlpha(0.0f);
                    return;
                }
        }
    }
}
