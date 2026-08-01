package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9762e extends Drawable.ConstantState {
    public final Drawable.ConstantState ad;

    public C9762e(Drawable.ConstantState constantState) {
        this.ad = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.ad.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.ad.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0497e c0497e = new C0497e(null, 0);
        Drawable newDrawable = this.ad.newDrawable();
        c0497e.f11478e = newDrawable;
        newDrawable.setCallback(c0497e.f2574e);
        return c0497e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0497e c0497e = new C0497e(null, 0);
        Drawable newDrawable = this.ad.newDrawable(resources);
        c0497e.f11478e = newDrawable;
        newDrawable.setCallback(c0497e.f2574e);
        return c0497e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0497e c0497e = new C0497e(null, 0);
        Drawable newDrawable = this.ad.newDrawable(resources, theme);
        c0497e.f11478e = newDrawable;
        newDrawable.setCallback(c0497e.f2574e);
        return c0497e;
    }
}
