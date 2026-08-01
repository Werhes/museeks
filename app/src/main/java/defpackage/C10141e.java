package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10141e extends AnimatorListenerAdapter {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C14913e vip;

    public /* synthetic */ C10141e(C14913e c14913e, int i) {
        this.ad = i;
        this.vip = c14913e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.ad) {
            case 1:
                super.onAnimationEnd(animator);
                C14913e c14913e = this.vip;
                ObjectAnimator objectAnimator = c14913e.f29562e;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                C1681e c1681e = c14913e.f29561e;
                if (c1681e != null) {
                    c1681e.ad((C14160e) c14913e.f22047e);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.ad) {
            case 0:
                super.onAnimationRepeat(animator);
                C14913e c14913e = this.vip;
                c14913e.f29560e = (c14913e.f29560e + 4) % c14913e.f29564e.metrica.length;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
