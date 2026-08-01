package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9291e extends Drawable {
    public final /* synthetic */ int ad;
    public final Object vip;

    public /* synthetic */ C9291e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    private final void ad(int i) {
    }

    private final void license(ColorFilter colorFilter) {
    }

    private final void metrica(ColorFilter colorFilter) {
    }

    private final void vip(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.ad) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.vip;
                if (actionBarContainer.f98e) {
                    Drawable drawable = actionBarContainer.f99e;
                    if (drawable != null) {
                        drawable.draw(canvas);
                        return;
                    }
                    return;
                }
                Drawable drawable2 = actionBarContainer.f95e;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
                Drawable drawable3 = actionBarContainer.f91e;
                if (drawable3 == null || !actionBarContainer.f94e) {
                    return;
                }
                drawable3.draw(canvas);
                return;
            default:
                ((InterfaceC4082e) this.vip).billing(canvas);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.ad) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.ad) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.vip;
                if (actionBarContainer.f98e) {
                    if (actionBarContainer.f99e != null) {
                        actionBarContainer.f95e.getOutline(outline);
                        return;
                    }
                    return;
                } else {
                    Drawable drawable = actionBarContainer.f95e;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                        return;
                    }
                    return;
                }
            default:
                super.getOutline(outline);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        int i2 = this.ad;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i = this.ad;
    }
}
