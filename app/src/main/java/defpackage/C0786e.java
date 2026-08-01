package defpackage;

import android.animation.Animator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0786e implements Animator.AnimatorListener {
    public final /* synthetic */ C1935e ad;
    public final /* synthetic */ C8266e vip;

    public C0786e(C8266e c8266e, C1935e c1935e) {
        this.vip = c8266e;
        this.ad = c1935e;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C8266e c8266e = this.vip;
        C1935e c1935e = this.ad;
        c8266e.ad(1.0f, c1935e, true);
        c1935e.mopub = c1935e.appmetrica;
        c1935e.advert = c1935e.purchase;
        c1935e.smaato = c1935e.billing;
        c1935e.ad((c1935e.adcel + 1) % c1935e.startapp.length);
        if (!c8266e.f16786e) {
            c8266e.f16781e += 1.0f;
            return;
        }
        c8266e.f16786e = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (c1935e.amazon) {
            c1935e.amazon = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.vip.f16781e = 0.0f;
    }
}
