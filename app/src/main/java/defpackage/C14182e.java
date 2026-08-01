package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14182e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C0998e vip;

    public /* synthetic */ C14182e(C0998e c0998e, int i) {
        this.ad = i;
        this.vip = c0998e;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.ad) {
            case 0:
                ((AppCompatImageView) this.vip.vip.f23951e).setImageTintList(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                return;
            case 1:
                ((FrameLayout) this.vip.vip.f23948e).setBackgroundTintList(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                return;
            default:
                ((FrameLayout) this.vip.vip.f23948e).setBackgroundTintList(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                return;
        }
    }
}
