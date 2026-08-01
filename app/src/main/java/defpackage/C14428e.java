package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؐٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14428e extends RippleDrawable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f28528e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C3618e f28529e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f28530e;

    public C14428e(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.f28530e = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f28530e) {
            this.f28528e = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f28528e = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f28528e;
    }
}
