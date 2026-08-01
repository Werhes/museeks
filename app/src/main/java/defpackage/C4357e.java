package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۙۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4357e extends ViewOutlineProvider {
    public final /* synthetic */ int ad;

    public /* synthetic */ C4357e(int i) {
        this.ad = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.ad) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 3:
                if (!(view instanceof C17267e) || (outline2 = ((C17267e) view).f33893e) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            default:
                AbstractC1786e.applovin(view);
                throw null;
        }
    }
}
