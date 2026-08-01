package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15035e extends C3774e {
    public final RectF admob;

    public C15035e(C15035e c15035e) {
        super(c15035e);
        this.admob = c15035e.admob;
    }

    public C15035e(C15339e c15339e, RectF rectF) {
        super(c15339e);
        this.admob = rectF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eُؙٟ, eُۚۜ, android.graphics.drawable.Drawable] */
    @Override // defpackage.C3774e, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? c11252e = new C11252e(this);
        c11252e.f22425e = this;
        c11252e.invalidateSelf();
        return c11252e;
    }
}
