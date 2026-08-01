package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3543e extends AnimatorListenerAdapter {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C10438e vip;

    public C3543e(C10438e c10438e, int i) {
        this.vip = c10438e;
        this.ad = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.ad;
        C10438e c10438e = this.vip;
        c10438e.f20609e = i;
        c10438e.f20614e = 0.0f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.vip.f20609e = this.ad;
    }
}
