package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6416e extends AnimatorListenerAdapter {
    public boolean ad = false;
    public final /* synthetic */ C7187e vip;

    public C6416e(C7187e c7187e) {
        this.vip = c7187e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.ad = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.ad) {
            this.ad = false;
            return;
        }
        C7187e c7187e = this.vip;
        if (((Float) c7187e.applovin.getAnimatedValue()).floatValue() == 0.0f) {
            c7187e.ads = 0;
            c7187e.adcel(0);
        } else {
            c7187e.ads = 2;
            c7187e.remoteconfig.invalidate();
        }
    }
}
