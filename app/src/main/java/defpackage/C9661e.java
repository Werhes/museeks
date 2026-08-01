package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9661e extends Drawable.ConstantState {
    public final Drawable.ConstantState ad;

    public C9661e(Drawable.ConstantState constantState) {
        this.ad = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.ad.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.ad.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C2955e c2955e = new C2955e();
        c2955e.f11478e = (VectorDrawable) this.ad.newDrawable();
        return c2955e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C2955e c2955e = new C2955e();
        c2955e.f11478e = (VectorDrawable) this.ad.newDrawable(resources);
        return c2955e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C2955e c2955e = new C2955e();
        c2955e.f11478e = (VectorDrawable) this.ad.newDrawable(resources, theme);
        return c2955e;
    }
}
