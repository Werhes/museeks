package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14695e extends Drawable.ConstantState {
    public int ad;
    public final /* synthetic */ C10512e vip;

    public C14695e(C10512e c10512e) {
        this.vip = c10512e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.ad;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C10512e c10512e = this.vip;
        C10512e c10512e2 = new C10512e(c10512e.f20751e.getColor(), c10512e.f20762e, c10512e.f20766e.getDuration(), c10512e.f20764e, c10512e.f20752e, c10512e.f20744e, c10512e.f20741e, c10512e.f20761e, c10512e.f20748e);
        int i = c10512e.f20754e;
        if (i == 0) {
            i = c10512e.f20756e;
        }
        c10512e2.appmetrica(i);
        c10512e2.f20758e = c10512e.f20758e;
        c10512e2.invalidateSelf();
        c10512e2.invalidateSelf();
        return c10512e2;
    }
}
