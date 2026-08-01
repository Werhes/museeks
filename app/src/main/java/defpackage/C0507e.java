package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507e implements Drawable.Callback {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f2603e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2604e;

    public /* synthetic */ C0507e(int i, Object obj) {
        this.f2604e = i;
        this.f2603e = obj;
    }

    private final void ad(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f2604e) {
            case 0:
                ((C0497e) this.f2603e).invalidateSelf();
                return;
            case 1:
                return;
            default:
                C5530e c5530e = (C5530e) this.f2603e;
                C0576e c0576e = c5530e.f11825e;
                c0576e.setValue(Integer.valueOf(((Number) c0576e.getValue()).intValue() + 1));
                Drawable drawable2 = c5530e.f11826e;
                Object obj = AbstractC6845e.ad;
                c5530e.f11823e.setValue(new C2108e((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC5092e.ad(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, eؕٛؓ] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f2604e) {
            case 0:
                ((C0497e) this.f2603e).scheduleSelf(runnable, j);
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f2603e;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
            default:
                ((Handler) AbstractC6845e.ad.getValue()).postAtTime(runnable, j);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, eؕٛؓ] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f2604e) {
            case 0:
                ((C0497e) this.f2603e).unscheduleSelf(runnable);
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f2603e;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((Handler) AbstractC6845e.ad.getValue()).removeCallbacks(runnable);
                return;
        }
    }
}
