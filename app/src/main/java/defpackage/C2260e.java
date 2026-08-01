package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۨؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2260e extends AnimatorListenerAdapter {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C15624e vip;

    public /* synthetic */ C2260e(C15624e c15624e, int i) {
        this.ad = i;
        this.vip = c15624e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.ad) {
            case 1:
                this.vip.vip.yandex(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.ad) {
            case 0:
                this.vip.vip.yandex(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
