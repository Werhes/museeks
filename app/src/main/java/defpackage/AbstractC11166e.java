package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؙٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11166e extends C11252e {

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public static final /* synthetic */ int f22424e = 0;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public C15035e f22425e;

    @Override // defpackage.C11252e, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f22425e = new C15035e(this.f22425e);
        return this;
    }

    public final void subscription(float f, float f2, float f3, float f4) {
        RectF rectF = this.f22425e.admob;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
