package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٚ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13353e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ View vip;

    public /* synthetic */ C13353e(View view, int i) {
        this.ad = i;
        this.vip = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.ad) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.vip;
                view.setAlpha(floatValue);
                if (floatValue == 0.0f) {
                    view.setVisibility(8);
                    return;
                }
                return;
            default:
                this.vip.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
